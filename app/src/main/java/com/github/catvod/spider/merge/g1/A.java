package com.github.catvod.spider.merge.G1;

import java.util.function.Function;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class A implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return G.i0((G) this.b, (C0682a) obj);
            default:
                com.github.catvod.spider.merge.r1.j jVar = (com.github.catvod.spider.merge.r1.j) this.b;
                com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) obj;
                if (eVar.containsKey("compactVideoRenderer")) {
                    return new J(eVar.g("compactVideoRenderer"), jVar);
                }
                if (eVar.containsKey("compactRadioRenderer")) {
                    return new C0683b(eVar.g("compactRadioRenderer"));
                }
                if (eVar.containsKey("compactPlaylistRenderer")) {
                    return new C0683b(eVar.g("compactPlaylistRenderer"));
                }
                if (eVar.containsKey("lockupViewModel")) {
                    com.github.catvod.spider.merge.D0.e eVarG = eVar.g("lockupViewModel");
                    String strI = eVarG.i("contentType", null);
                    if ("LOCKUP_CONTENT_TYPE_PLAYLIST".equals(strI) || "LOCKUP_CONTENT_TYPE_PODCAST".equals(strI)) {
                        return new C0690i(eVarG);
                    }
                    if ("LOCKUP_CONTENT_TYPE_VIDEO".equals(strI)) {
                        return new S(eVarG, jVar);
                    }
                }
                return null;
        }
    }
}
