package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class Q extends TimeZone {
    private final int a;
    private final String b;

    Q(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + ZrJ.d("592B24383A36592C3E39682A1F63392C26221C"));
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + ZrJ.d("592E22233D311C306B223D31592C2D6D3A2417242E"));
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.a = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append(ZrJ.d("3E0E1F"));
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
        StringBuilder sbB = C0925t.b(ZrJ.d("220426391C2C142611222620592A2F706A"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("5B6F242B2E361C3776"));
        sbB.append(this.a);
        sbB.append(']');
        return sbB.toString();
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return false;
    }
}
