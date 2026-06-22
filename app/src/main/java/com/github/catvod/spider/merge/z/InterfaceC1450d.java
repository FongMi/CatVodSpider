package com.github.catvod.spider.merge.z;

import com.github.catvod.spider.merge.B.n;
import com.github.catvod.spider.merge.D.f0;
import com.github.catvod.spider.merge.D.i0;
import com.github.catvod.spider.merge.y.V;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface InterfaceC1450d {
    boolean alphabetic() default true;

    boolean asm() default true;

    Class<? extends n> autoTypeCheckHandler() default n.class;

    Class<?> builder() default Void.class;

    Class<?> deserializer() default Void.class;

    String[] ignores() default {};

    String[] includes() default {};

    Class<?> mappingTo() default Void.class;

    V naming() default V.NeverUseThisValueExceptDefaultValue;

    String[] orders() default {};

    com.github.catvod.spider.merge.B.c[] parseFeatures() default {};

    Class<?>[] seeAlso() default {};

    boolean serializeEnumAsJavaBean() default false;

    Class<?> serializer() default Void.class;

    i0[] serialzeFeatures() default {};

    Class<? extends f0>[] serialzeFilters() default {};

    String typeKey() default "";

    String typeName() default "";
}
