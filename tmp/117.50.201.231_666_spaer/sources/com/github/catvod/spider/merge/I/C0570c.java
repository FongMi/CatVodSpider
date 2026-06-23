package com.github.catvod.spider.merge.i;

import android.text.TextUtils;
import com.github.catvod.spider.merge.a.C0529a;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.i.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0570c {

    @SerializedName("data")
    private a a;

    @SerializedName("time")
    private long b;
    private String c;
    private String d;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.i.c$a */
    public static class a {

        @SerializedName("stoken")
        private String a;

        @SerializedName("title")
        private String b;

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }
    }

    public final boolean a(String str) {
        return (TextUtils.isEmpty(this.c) ? "" : this.c).equals(str) && System.currentTimeMillis() <= this.b;
    }

    public final boolean b(String str) {
        if ((TextUtils.isEmpty(this.c) ? "" : this.c).equals(str)) {
            if (this.a != null) {
                return true;
            }
        }
        return false;
    }

    public final a c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final C0570c e(String str) {
        this.d = str;
        return this;
    }

    public final C0570c f(String str) {
        this.c = str;
        return this;
    }

    public final C0570c g() {
        this.b = System.currentTimeMillis() + 3600000;
        return this;
    }

    public final String toString() {
        StringBuilder sbA = C0529a.a("Share{data=");
        sbA.append(this.a);
        sbA.append(", time=");
        sbA.append(this.b);
        sbA.append(", shareId='");
        sbA.append(this.c);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }
}
