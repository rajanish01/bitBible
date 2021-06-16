package test;

@TypeTestAnnotation(
        priority = TypeTestAnnotation.Priority.HIGH,
        createdBy = "Anonymous",
        tags = {"test1", "test2"}
)
public class AnnotationTest {

    @MethodTestAnnotation
    String shouldAlwaysBeProcessed() {
        return "This should always processed";
    }

    @MethodTestAnnotation
    String willThrowException() {
        throw new RuntimeException("This will throw Exception");
    }

    @MethodTestAnnotation(enabled = false)
    void shouldNotBeProcessed() {
        throw new RuntimeException("This should never be processed");
    }

}
