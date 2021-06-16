package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TypeTestAnnotation {

    public enum Priority {
        HIGH, MEDIUM, LOW
    }

    Priority priority() default Priority.MEDIUM;

    String[] tags() default "";

    String createdBy() default "Rajanish";

    String lastModifiedOn() default "12-12-2020";

}
