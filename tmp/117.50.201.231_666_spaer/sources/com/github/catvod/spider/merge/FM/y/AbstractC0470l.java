package com.github.catvod.spider.merge.FM.y;

import com.github.catvod.spider.merge.FM.z.C0488e;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class AbstractC0470l {
    public static final C0488e c;
    public final C0459a a;
    protected final Y b;

    static {
        UUID uuid = C0469k.f;
        UUID uuid2 = C0469k.f;
        C0488e c0488e = new C0488e(new C0464f(true));
        c = c0488e;
        c0488e.a = Integer.MAX_VALUE;
    }

    public AbstractC0470l(C0459a c0459a, Y y) {
        this.a = c0459a;
        this.b = y;
    }

    public abstract void a();
}
