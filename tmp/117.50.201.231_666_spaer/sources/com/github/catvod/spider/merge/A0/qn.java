package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum qn extends fc {
    public qn() {
        super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
    }

    @Override // com.github.catvod.spider.merge.A0.fc
    public final String a(Field field) {
        return fc.d(fc.c(field.getName(), ' '));
    }
}
