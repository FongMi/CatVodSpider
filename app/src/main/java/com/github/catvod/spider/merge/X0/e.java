package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1416e;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class e extends ArrayList<C1407d> implements InterfaceC1405b {
    public e(C1416e c1416e) {
        super(c1416e.t("cards").size());
        c1416e.u("header").u("richListHeaderRenderer").u("title").x("simpleText");
        C1413b c1413bT = c1416e.t("cards");
        for (int i = 0; i < c1413bT.size(); i++) {
            add(new C1407d(c1413bT.o(i).u("searchRefinementCardRenderer")));
        }
    }

    @Override // com.github.catvod.spider.merge.x0.InterfaceC1405b
    public final EnumC1406c type() {
        return EnumC1406c.REFINEMENT_LIST;
    }
}
