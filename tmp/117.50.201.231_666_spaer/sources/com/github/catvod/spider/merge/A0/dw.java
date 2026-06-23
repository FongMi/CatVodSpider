package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class dw extends dr {
    public final int a;
    public final int e;
    public final /* synthetic */ int f;

    public dw(int i, int i2, int i3) {
        this.f = i3;
        this.a = i;
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        int iAb;
        ed edVar3 = (ed) edVar2.ap;
        if (edVar3 == null || (edVar3 instanceof em)) {
            return false;
        }
        switch (this.f) {
            case 0:
                iAb = edVar2.ab() + 1;
                break;
            case 1:
                ed edVar4 = (ed) edVar2.ap;
                iAb = edVar4 == null ? 0 : edVar4.z().size() - edVar2.ab();
                break;
            case 2:
                iAb = 0;
                if (((ed) edVar2.ap) != null) {
                    for (ed edVarAf = edVar2; edVarAf != null; edVarAf = edVarAf.af()) {
                        if (edVarAf.g.c.equals(edVar2.g.c)) {
                            iAb++;
                        }
                    }
                }
                break;
            default:
                ed edVar5 = (ed) edVar2.ap;
                iAb = 0;
                if (edVar5 != null) {
                    int size = edVar5.i.size();
                    int i = 0;
                    while (iAb < size) {
                        fw fwVar = (fw) edVar5.q().get(iAb);
                        if (fwVar.t().equals(edVar2.g.c)) {
                            i++;
                        }
                        if (fwVar == edVar2) {
                            iAb = i;
                        } else {
                            iAb++;
                        }
                        break;
                    }
                    iAb = i;
                }
                break;
        }
        int i2 = this.e;
        int i3 = this.a;
        if (i3 == 0) {
            return iAb == i2;
        }
        int i4 = iAb - i2;
        return i4 * i3 >= 0 && i4 % i3 == 0;
    }

    public final String g() {
        switch (this.f) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.e;
        int i2 = this.a;
        return i2 == 0 ? String.format(":%s(%d)", g(), Integer.valueOf(i)) : i == 0 ? String.format(":%s(%dn)", g(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", g(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
