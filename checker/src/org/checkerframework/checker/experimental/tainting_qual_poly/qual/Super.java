package org.checkerframework.checker.experimental.tainting_qual_poly.qual;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Repeatable(MultiSuper.class)
public @interface Super {
    String target() default "Main";
}