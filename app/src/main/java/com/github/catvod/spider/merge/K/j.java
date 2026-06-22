package com.github.catvod.spider.merge.K;

import com.github.catvod.spider.merge.I.t0;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class JsonUtils {
    private String a;
    private HashMap<String, String> b;
    private String c;
    private String d;
    private String e;
    private String f;

    public final HashMap<String, String> a() {
        return this.b;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.c;
    }

    public final void g(HashMap<String, String> map) {
        this.b = map;
    }

    public final void h(String str) {
        this.f = str;
    }

    public final void i(String str) {
        this.e = str;
    }

    public final void j(String str) {
        this.a = str;
    }

    public final void k(String str) {
        this.d = str;
    }

    public final void l(String str) {
        this.c = str;
    }

    public final String toString() {
        StringBuilder sbB = t0.b("VodFolderParm{sharePwd='");
        sbB.append(this.a);
        sbB.append('\'');
        sbB.append(", extend=");
        sbB.append(this.b);
        sbB.append(", vodName='");
        sbB.append(this.c);
        sbB.append('\'');
        sbB.append(", url='");
        sbB.append(this.d);
        sbB.append('\'');
        sbB.append(", shareId='");
        sbB.append(this.e);
        sbB.append('\'');
        sbB.append(", fileId='");
        sbB.append(this.f);
        sbB.append('\'');
        sbB.append('}');
        return sbB.toString();
    }
}
