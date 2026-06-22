package com.github.catvod.spider.merge.M;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class H extends N {
    public final StringBuilder b = new StringBuilder();
    public String c;

    public H() {
        this.a = 4;
    }

    @Override // com.github.catvod.spider.merge.M.N
    public final void f() {
        N.g(this.b);
        this.c = null;
    }

    public final void h(char c) {
        String str = this.c;
        StringBuilder sb = this.b;
        if (str != null) {
            sb.append(str);
            this.c = null;
        }
        sb.append(c);
    }

    public final void i(String str) {
        String str2 = this.c;
        StringBuilder sb = this.b;
        if (str2 != null) {
            sb.append(str2);
            this.c = null;
        }
        if (sb.length() == 0) {
            this.c = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<!--");
        String string = this.c;
        if (string == null) {
            string = this.b.toString();
        }
        return com.github.catvod.spider.merge.A.T.h(sb, string, "-->");
    }
}
