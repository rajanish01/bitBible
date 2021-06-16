package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationTestRunner {

    public static void main(String[] args) {
        System.out.println("Processing...");

        int success = 0, failed = 0, total = 0, disabled = 0;

        Class<AnnotationTest> obj = AnnotationTest.class;

        if (obj.isAnnotationPresent(TypeTestAnnotation.class)) {
            Annotation annotation = obj.getAnnotation(TypeTestAnnotation.class);
            TypeTestAnnotation typeTestAnnotation = (TypeTestAnnotation) annotation;

            System.out.printf("%nPriority :%s", typeTestAnnotation.priority());
            System.out.printf("%nCreated By :%s", typeTestAnnotation.createdBy());
            System.out.printf("%nTags : ");

            for (String tag : typeTestAnnotation.tags()) {
                System.out.print(tag + ",");
            }

            System.out.printf("%nLastModified : %s%n%n", typeTestAnnotation.lastModifiedOn());
        }

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodTestAnnotation.class)) {
                Annotation annotation = method.getAnnotation(MethodTestAnnotation.class);
                MethodTestAnnotation methodTestAnnotation = (MethodTestAnnotation) annotation;

                if (methodTestAnnotation.enabled()) {
                    String result = "n/a";

                    try {
                        result = (String) method.invoke(obj.newInstance());
                        System.out.printf("%s - customMethod '%s' - processed %n - result: %n",
                                ++total, method.getName(), result);
                        success++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - customMethod '%s' - didn't process: %s %n",
                                ++total, method.getName(), ex.getCause());
                        failed++;
                    }
                } else {
                    System.out.printf("%s - customMethod '%s' - didn't process %n",
                            ++total, method.getName());
                    disabled++;
                }
            }
        }
        System.out.printf("%nResult : Total : %d, Success : %d, Failed : %d, Disabled : %d",
                total, success, failed, disabled);

    }
}
