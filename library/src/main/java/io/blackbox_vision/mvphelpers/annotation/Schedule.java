package io.blackbox_vision.mvphelpers.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Schedule {

    long millis() default 0L;

    TimeUnit unit() default TimeUnit.MILLISECONDS;
}
