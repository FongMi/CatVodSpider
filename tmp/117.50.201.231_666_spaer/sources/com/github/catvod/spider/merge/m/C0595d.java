package com.github.catvod.spider.merge.m;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0595d {
    public static com.github.catvod.spider.merge.I.c a(com.github.catvod.spider.merge.G.i iVar) {
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        while (true) {
            iVar = iVar.f0();
            if (iVar == null) {
                break;
            }
            cVar.add(iVar);
        }
        if (cVar.size() > 0) {
            return cVar;
        }
        return null;
    }

    public static int b(com.github.catvod.spider.merge.G.i iVar, com.github.catvod.spider.merge.L.e eVar) {
        Iterator<com.github.catvod.spider.merge.G.i> it = iVar.j0().V().iterator();
        int i = 1;
        while (it.hasNext()) {
            com.github.catvod.spider.merge.G.i next = it.next();
            if (iVar.r0().equals(next.r0()) && eVar.a().contains(next)) {
                if (iVar == next) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    public static com.github.catvod.spider.merge.I.c c(com.github.catvod.spider.merge.G.i iVar) {
        com.github.catvod.spider.merge.I.c cVar = new com.github.catvod.spider.merge.I.c();
        while (true) {
            iVar = iVar.m0();
            if (iVar == null) {
                break;
            }
            cVar.add(iVar);
        }
        if (cVar.size() > 0) {
            return cVar;
        }
        return null;
    }

    public static void d(com.github.catvod.spider.merge.G.i iVar, int i) {
        iVar.c("EL_SAME_TAG_INDEX", String.valueOf(i));
    }

    public static void e(com.github.catvod.spider.merge.G.i iVar, int i) {
        iVar.c("EL_SAME_TAG_ALL_NUM", String.valueOf(i));
    }
}
