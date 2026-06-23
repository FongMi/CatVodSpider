package com.github.catvod.spider.merge.C0.d0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class I extends O {
    private final StringBuilder b = new StringBuilder();
    private String c;

    I() {
        this.a = 4;
    }

    @Override // com.github.catvod.spider.merge.C0.d0.O
    final O g() {
        O.h(this.b);
        this.c = null;
        return this;
    }

    final I i(char c) {
        String str = this.c;
        if (str != null) {
            this.b.append(str);
            this.c = null;
        }
        this.b.append(c);
        return this;
    }

    final I j(String str) {
        String str2 = this.c;
        if (str2 != null) {
            this.b.append(str2);
            this.c = null;
        }
        if (this.b.length() == 0) {
            this.c = str;
        } else {
            this.b.append(str);
        }
        return this;
    }

    final String k() {
        String str = this.c;
        return str != null ? str : this.b.toString();
    }

    public final String toString() {
        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("<!--");
        String string = this.c;
        if (string == null) {
            string = this.b.toString();
        }
        return com.github.catvod.spider.merge.C0.b.n.b(sbB, string, "-->");
    }
}
