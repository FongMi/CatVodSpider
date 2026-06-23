package com.github.catvod.spider.merge.FM.G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0216q {
    private final Calendar a;
    private int b;
    final /* synthetic */ t c;

    C0216q(t tVar, Calendar calendar) {
        this.c = tVar;
        this.a = calendar;
    }

    final C0215p a() {
        if (this.b >= this.c.a.length()) {
            return null;
        }
        char cCharAt = this.c.a.charAt(this.b);
        if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
            int i = this.b;
            do {
                int i2 = this.b + 1;
                this.b = i2;
                if (i2 >= this.c.a.length()) {
                    break;
                }
            } while (this.c.a.charAt(this.b) == cCharAt);
            int i3 = this.b - i;
            return new C0215p(t.b(this.c, cCharAt, i3, this.a), i3);
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (this.b < this.c.a.length()) {
            char cCharAt2 = this.c.a.charAt(this.b);
            if (!z) {
                if ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z')) {
                    break;
                }
            }
            if (cCharAt2 == '\'') {
                int i4 = this.b + 1;
                this.b = i4;
                if (i4 == this.c.a.length() || this.c.a.charAt(this.b) != '\'') {
                    z = !z;
                }
            }
            this.b++;
            sb.append(cCharAt2);
        }
        if (z) {
            throw new IllegalArgumentException("Unterminated quote");
        }
        String string = sb.toString();
        return new C0215p(new C0210k(string), string.length());
    }
}
