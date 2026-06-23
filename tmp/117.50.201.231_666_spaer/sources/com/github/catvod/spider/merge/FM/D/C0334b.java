package com.github.catvod.spider.merge.FM.d;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.FM.b.RunnableC0307b;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0334b {

    @SerializedName("user")
    private o a;

    @SerializedName("oauth")
    private C0340h b;

    @SerializedName("drive")
    private C0338f c;

    public final C0338f a() {
        C0338f c0338f = this.c;
        return c0338f == null ? new C0338f() : c0338f;
    }

    public final C0340h b() {
        C0340h c0340h = this.b;
        return c0340h == null ? new C0340h() : c0340h;
    }

    public final o c() {
        o oVar = this.a;
        return oVar == null ? new o() : oVar;
    }

    public final void d() {
        Init.execute(new RunnableC0307b(this, 3));
    }

    public final void e(C0338f c0338f) {
        this.c = c0338f;
        d();
    }

    public final void f(C0340h c0340h) {
        this.b = c0340h;
        d();
    }

    public final void g(o oVar) {
        this.a = oVar;
        d();
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
