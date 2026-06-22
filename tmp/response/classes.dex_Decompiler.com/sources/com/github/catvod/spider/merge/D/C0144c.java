package com.github.catvod.spider.merge.d;

import com.github.catvod.spider.Init;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class C0144c {

    @SerializedName("user")
    private p a;

    @SerializedName("oauth")
    private C0150i b;

    @SerializedName("drive")
    private C0148g c;

    public final C0148g a() {
        C0148g c0148g = this.c;
        return c0148g == null ? new C0148g() : c0148g;
    }

    public final C0150i b() {
        C0150i c0150i = this.b;
        return c0150i == null ? new C0150i() : c0150i;
    }

    public final p c() {
        p pVar = this.a;
        return pVar == null ? new p() : pVar;
    }

    public final void d() {
        Init.execute(new RunnableC0143b(this, 0));
    }

    public final void e(C0148g c0148g) {
        this.c = c0148g;
        d();
    }

    public final void f(C0150i c0150i) {
        this.b = c0150i;
        d();
    }

    public final void g(p pVar) {
        this.a = pVar;
        d();
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
