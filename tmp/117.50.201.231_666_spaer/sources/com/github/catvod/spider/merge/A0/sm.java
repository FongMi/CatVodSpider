package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class sm {

    @ni("type_id")
    private String b;

    @ni("type_name")
    private String c;

    @ni("type_flag")
    private String d = "1";

    public sm(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sm) {
            return this.b.equals(((sm) obj).b);
        }
        return false;
    }
}
