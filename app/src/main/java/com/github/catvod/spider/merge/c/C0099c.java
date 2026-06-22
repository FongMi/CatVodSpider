package com.github.catvod.spider.merge.c;

import com.github.catvod.spider.Init;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.c.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class C0099c {

    @SerializedName("user")
    private p a;

    @SerializedName("oauth")
    private C0105i b;

    @SerializedName("drive")
    private C0103g c;

    public final C0103g a() {
        C0103g c0103g = this.c;
        return c0103g == null ? new C0103g() : c0103g;
    }

    public final C0105i b() {
        C0105i c0105i = this.b;
        return c0105i == null ? new C0105i() : c0105i;
    }

    public final p c() {
        p pVar = this.a;
        return pVar == null ? new p() : pVar;
    }

    public final void d(C0103g c0103g) {
        this.c = c0103g;
        Init.execute(new RunnableC0098b(0, this));
    }

    public final void e(C0105i c0105i) {
        this.b = c0105i;
        Init.execute(new RunnableC0098b(0, this));
    }

    public final void f(p pVar) {
        this.a = pVar;
        Init.execute(new RunnableC0098b(0, this));
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
