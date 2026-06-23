package com.github.catvod.spider.merge.d;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.b.RunnableC0542f;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.d.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0558b {

    @SerializedName("user")
    private l a;

    @SerializedName("oauth")
    private h b;

    @SerializedName("drive")
    private f c;

    @SerializedName("signature")
    private String d;

    public final f a() {
        f fVar = this.c;
        return fVar == null ? new f() : fVar;
    }

    public final h b() {
        h hVar = this.b;
        return hVar == null ? new h() : hVar;
    }

    public final l c() {
        l lVar = this.a;
        return lVar == null ? new l() : lVar;
    }

    public final void d() {
        Init.run(new RunnableC0542f(this, 1));
    }

    public final void e(f fVar) {
        this.c = fVar;
        d();
    }

    public final void f(h hVar) {
        this.b = hVar;
        d();
    }

    public final void g(l lVar) {
        this.a = lVar;
        d();
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
