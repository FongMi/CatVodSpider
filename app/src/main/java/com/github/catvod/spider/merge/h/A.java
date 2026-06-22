package com.github.catvod.spider.merge.H;

import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class A implements r {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ A(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final void a(StringBuilder sb, Calendar calendar) {
        switch (this.a) {
            case 0:
                b(sb, calendar.get(this.b));
                break;
            default:
                b(sb, calendar.get(this.b));
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.H.r
    public final void b(StringBuilder sb, int i) {
        switch (this.a) {
            case 0:
                if (i >= 100) {
                    B.b(sb, i, 2);
                } else {
                    B.a(sb, i);
                }
                break;
            default:
                if (i < 10) {
                    sb.append((char) (i + 48));
                } else if (i >= 100) {
                    B.b(sb, i, 1);
                } else {
                    B.a(sb, i);
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.H.t
    public final int c() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }
}
