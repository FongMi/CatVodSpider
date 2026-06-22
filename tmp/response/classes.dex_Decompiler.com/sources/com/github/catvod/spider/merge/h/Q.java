package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class Q extends TimeZone {
    private final int a;
    private final String b;

    Q(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + oZP.d("550718341E26550002354C3A134F0520023210"));
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + oZP.d("55021E2F1921101C572E1921550011611E341B0812"));
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.a = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append(oZP.d("322223"));
        sb.append(z ? '-' : '+');
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        sb.append(':');
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
        this.b = sb.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && this.b == ((Q) obj).b;
    }

    @Override // java.util.TimeZone
    public final String getID() {
        return this.b;
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.a;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("2E281A35383C180A2D2E02305506137C4E"));
        sbC.append(this.b);
        sbC.append(oZP.d("574318270A26101B4A"));
        sbC.append(this.a);
        sbC.append(']');
        return sbC.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
