package com.github.catvod.spider.merge.A0;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class gx extends uz {
    public final StringBuilder b;
    public String c;

    public gx() {
        super(4);
        this.b = new StringBuilder();
    }

    @Override // com.github.catvod.spider.merge.A0.uz
    public final void a() {
        uz.h(this.b);
        this.c = null;
    }

    public final void d(char c) {
        String str = this.c;
        StringBuilder sb = this.b;
        if (str != null) {
            sb.append(str);
            this.c = null;
        }
        sb.append(c);
    }

    public final void e(String str) {
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
        sb.append(string);
        sb.append("-->");
        return sb.toString();
    }
}
