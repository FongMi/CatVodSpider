package com.github.catvod.spider.merge.N;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class h extends o {
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i, String str2, boolean z) {
        this(str, str2, false);
        this.c = i;
    }

    @Override // com.github.catvod.spider.merge.N.o
    public final boolean a(com.github.catvod.spider.merge.L.l lVar, com.github.catvod.spider.merge.L.l lVar2) {
        switch (this.c) {
            case 0:
                String str = this.a;
                if (lVar2.k(str)) {
                    if (this.b.equalsIgnoreCase(lVar2.c(str).trim())) {
                        return true;
                    }
                }
                return false;
            case 1:
                String str2 = this.a;
                return lVar2.k(str2) && com.github.catvod.spider.merge.R.f.a(lVar2.c(str2)).contains(this.b);
            case 2:
                String str3 = this.a;
                return lVar2.k(str3) && com.github.catvod.spider.merge.R.f.a(lVar2.c(str3)).endsWith(this.b);
            case 3:
                return !this.b.equalsIgnoreCase(lVar2.c(this.a));
            default:
                String str4 = this.a;
                return lVar2.k(str4) && com.github.catvod.spider.merge.R.f.a(lVar2.c(str4)).startsWith(this.b);
        }
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return "[" + this.a + "=" + this.b + "]";
            case 1:
                return "[" + this.a + "*=" + this.b + "]";
            case 2:
                return "[" + this.a + "$=" + this.b + "]";
            case 3:
                return "[" + this.a + "!=" + this.b + "]";
            default:
                return "[" + this.a + "^=" + this.b + "]";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, String str2, int i) {
        this(str, str2, true);
        this.c = i;
    }

    public h(String str, String str2, boolean z) {
        com.github.catvod.spider.merge.J.b.d(str);
        com.github.catvod.spider.merge.J.b.d(str2);
        this.a = com.github.catvod.spider.merge.R.f.b(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
        String strA = (!z && z2) ? com.github.catvod.spider.merge.R.f.a(str2) : com.github.catvod.spider.merge.R.f.b(str2);
        this.b = strA;
    }
}
