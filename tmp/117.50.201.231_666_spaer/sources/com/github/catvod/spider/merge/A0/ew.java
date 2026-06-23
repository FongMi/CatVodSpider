package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ew extends fa {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ew(int i, String str, String str2, boolean z) {
        super(str, str2, z);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final int b() {
        switch (this.a) {
            case 0:
                return 3;
            case 1:
                return 6;
            case 2:
                return 4;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    @Override // com.github.catvod.spider.merge.A0.dr
    public final boolean c(ed edVar, ed edVar2) {
        switch (this.a) {
            case 0:
                String str = (String) this.f;
                if (edVar2.av(str)) {
                    if (((String) this.g).equalsIgnoreCase(edVar2.au(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = (String) this.f;
                return edVar2.av(str2) && qf.c(edVar2.au(str2)).contains((String) this.g);
            case 2:
                String str3 = (String) this.f;
                return edVar2.av(str3) && qf.c(edVar2.au(str3)).endsWith((String) this.g);
            case 3:
                return !((String) this.g).equalsIgnoreCase(edVar2.au((String) this.f));
            default:
                String str4 = (String) this.f;
                return edVar2.av(str4) && qf.c(edVar2.au(str4)).startsWith((String) this.g);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "[" + ((String) this.f) + "=" + ((String) this.g) + "]";
            case 1:
                return "[" + ((String) this.f) + "*=" + ((String) this.g) + "]";
            case 2:
                return "[" + ((String) this.f) + "$=" + ((String) this.g) + "]";
            case 3:
                return "[" + ((String) this.f) + "!=" + ((String) this.g) + "]";
            default:
                return "[" + ((String) this.f) + "^=" + ((String) this.g) + "]";
        }
    }
}
