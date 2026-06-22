package com.github.catvod.spider.merge;

import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.أ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0235 extends TimeZone {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private final int f607;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final String f608;

    C0235(boolean z, int i, int i2) {
        if (i >= 24) {
            throw new IllegalArgumentException(i + SOY.d("5A3A3E0306045A3D240254181C7223171A101F"));
        }
        if (i2 >= 60) {
            throw new IllegalArgumentException(i2 + SOY.d("5A3F381801031F21711901035A3D37560616143534"));
        }
        int i3 = ((i * 60) + i2) * 60000;
        this.f607 = z ? -i3 : i3;
        StringBuilder sb = new StringBuilder(9);
        sb.append(SOY.d("3D1F05"));
        sb.append(z ? '-' : '+');
        StringBuilder sbM829 = m829(sb, i);
        sbM829.append(':');
        this.f608 = m829(sbM829, i2).toString();
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static StringBuilder m829(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        return sb;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0235) && this.f608 == ((C0235) obj).f608;
    }

    @Override // java.util.TimeZone
    public String getID() {
        return this.f608;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f607;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.f607;
    }

    public int hashCode() {
        return this.f607;
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return SOY.d("21153C02201E17370B191A125A3B354B56") + this.f608 + SOY.d("587E3E1012041F266C") + this.f607 + ']';
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return false;
    }
}
