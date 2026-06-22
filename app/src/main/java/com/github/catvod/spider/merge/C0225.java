package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.י, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0225 extends AbstractC0108 {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final EnumSet<EnumC0226> f572;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.י$Ϳ, reason: contains not printable characters */
    public enum EnumC0226 {
        f573,
        f574,
        f575
    }

    public C0225(EnumC0226... enumC0226Arr) {
        if (enumC0226Arr.length > 0) {
            this.f572 = EnumSet.copyOf((Collection) Arrays.asList(enumC0226Arr));
        } else {
            this.f572 = EnumSet.copyOf((Collection) Collections.singletonList(EnumC0226.f573));
        }
    }

    @Override // com.github.catvod.spider.merge.AbstractC0108
    /* JADX INFO: renamed from: Ԩ */
    public int mo363(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i3 = i + 2;
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i3++;
                if (i3 == length) {
                    return 0;
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i4 = i3;
            while (i4 < length && ((charSequence.charAt(i4) >= '0' && charSequence.charAt(i4) <= '9') || ((charSequence.charAt(i4) >= 'a' && charSequence.charAt(i4) <= 'f') || (charSequence.charAt(i4) >= 'A' && charSequence.charAt(i4) <= 'F')))) {
                i4++;
            }
            int i5 = (i4 == length || charSequence.charAt(i4) != ';') ? 0 : 1;
            if (i5 == 0) {
                if (m779(EnumC0226.f573)) {
                    return 0;
                }
                if (m779(EnumC0226.f575)) {
                    throw new IllegalArgumentException(SOY.d("29373C1F5914153E3E1854051F23241F06121E723002541214367119125714273C13061E19723418001E0E2B"));
                }
            }
            try {
                int i6 = i2 != 0 ? Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 16) : Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 10);
                if (i6 > 65535) {
                    char[] chars = Character.toChars(i6);
                    writer.write(chars[0]);
                    writer.write(chars[1]);
                } else {
                    writer.write(i6);
                }
                return ((i4 + 2) - i3) + i2 + i5;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public boolean m779(EnumC0226 enumC0226) {
        EnumSet<EnumC0226> enumSet = this.f572;
        return enumSet != null && enumSet.contains(enumC0226);
    }
}
