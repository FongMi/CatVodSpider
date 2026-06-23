package com.github.catvod.spider.merge.c;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0551b {

    @SerializedName("key")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("value")
    private List<a> c;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.c.b$a */
    public static class a {

        @SerializedName("n")
        private String a;

        @SerializedName("v")
        private String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public C0551b(String str, String str2, List<a> list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }
}
