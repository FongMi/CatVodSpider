package com.google.protobuf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@interface InlineMe {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
