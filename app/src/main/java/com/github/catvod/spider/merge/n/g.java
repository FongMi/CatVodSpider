package com.github.catvod.spider.merge.N;

import com.github.catvod.spider.merge.A.T;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class g extends o {
    public final /* synthetic */ int a;
    public final String b;

    public g(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = com.github.catvod.spider.merge.R.f.a(str);
                break;
            case 4:
                StringBuilder sbB = com.github.catvod.bean.b.b();
                com.github.catvod.bean.b.a(sbB, str, false);
                this.b = com.github.catvod.spider.merge.R.f.a(com.github.catvod.bean.b.g(sbB));
                break;
            case 5:
                StringBuilder sbB2 = com.github.catvod.bean.b.b();
                com.github.catvod.bean.b.a(sbB2, str, false);
                this.b = com.github.catvod.spider.merge.R.f.a(com.github.catvod.bean.b.g(sbB2));
                break;
            default:
                com.github.catvod.spider.merge.J.b.d(str);
                this.b = com.github.catvod.spider.merge.R.f.a(str);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        switch (this.a) {
            case 0:
                return lVar2.k(this.b);
            case 1:
                com.github.catvod.spider.merge.L.c cVarD = lVar2.d();
                cVarD.getClass();
                ArrayList arrayList = new ArrayList(cVarD.a);
                for (int i = 0; i < cVarD.a; i++) {
                    if (!com.github.catvod.spider.merge.L.c.i(cVarD.b[i])) {
                        arrayList.add(new com.github.catvod.spider.merge.L.a(cVarD.b[i], (String) cVarD.c[i], cVarD));
                    }
                }
                Iterator it = Collections.unmodifiableList(arrayList).iterator();
                while (it.hasNext()) {
                    if (com.github.catvod.spider.merge.R.f.a(((com.github.catvod.spider.merge.L.a) it.next()).a).startsWith(this.b)) {
                        return true;
                    }
                }
                return false;
            case 2:
                com.github.catvod.spider.merge.L.c cVar = lVar2.g;
                if (cVar == null) {
                    return false;
                }
                String strE = cVar.e("class");
                int length = strE.length();
                String str = this.b;
                int length2 = str.length();
                if (length == 0 || length < length2) {
                    return false;
                }
                if (length == length2) {
                    return str.equalsIgnoreCase(strE);
                }
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (Character.isWhitespace(strE.charAt(i3))) {
                        if (!z) {
                            continue;
                        } else {
                            if (i3 - i2 == length2 && strE.regionMatches(true, i2, str, 0, length2)) {
                                return true;
                            }
                            z = false;
                        }
                    } else if (!z) {
                        i2 = i3;
                        z = true;
                    }
                }
                if (z && length - i2 == length2) {
                    return strE.regionMatches(true, i2, str, 0, length2);
                }
                return false;
            case 3:
                return com.github.catvod.spider.merge.R.f.a(lVar2.C()).contains(this.b);
            case 4:
                return com.github.catvod.spider.merge.R.f.a(lVar2.I()).contains(this.b);
            case 5:
                return com.github.catvod.spider.merge.R.f.a(lVar2.O()).contains(this.b);
            case 6:
                return lVar2.P().contains(this.b);
            case 7:
                lVar2.getClass();
                StringBuilder sbB = com.github.catvod.bean.b.b();
                com.github.catvod.spider.merge.R.g.a(new com.github.catvod.spider.merge.L.j(sbB), lVar2);
                return com.github.catvod.bean.b.g(sbB).contains(this.b);
            case 8:
                com.github.catvod.spider.merge.L.c cVar2 = lVar2.g;
                return this.b.equals(cVar2 != null ? cVar2.e("id") : "");
            case 9:
                return lVar2.d.b.equals(this.b);
            default:
                return lVar2.d.b.endsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return T.h(new StringBuilder("["), this.b, "]");
            case 1:
                return T.h(new StringBuilder("[^"), this.b, "]");
            case 2:
                return "." + this.b;
            case 3:
                return T.h(new StringBuilder(":containsData("), this.b, ")");
            case 4:
                return T.h(new StringBuilder(":containsOwn("), this.b, ")");
            case 5:
                return T.h(new StringBuilder(":contains("), this.b, ")");
            case 6:
                return T.h(new StringBuilder(":containsWholeOwnText("), this.b, ")");
            case 7:
                return T.h(new StringBuilder(":containsWholeText("), this.b, ")");
            case 8:
                return "#" + this.b;
            case 9:
                return this.b;
            default:
                return this.b;
        }
    }

    public /* synthetic */ g(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
