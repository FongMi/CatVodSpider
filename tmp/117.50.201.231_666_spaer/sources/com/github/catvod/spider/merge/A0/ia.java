package com.github.catvod.spider.merge.A0;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public enum ia extends fc {
    public ia() {
        super("LOWER_CASE_WITH_DASHES", 5);
    }

    @Override // com.github.catvod.spider.merge.A0.fc
    public final String a(Field field) {
        return fc.c(field.getName(), '-').toLowerCase(Locale.ENGLISH);
    }
}
