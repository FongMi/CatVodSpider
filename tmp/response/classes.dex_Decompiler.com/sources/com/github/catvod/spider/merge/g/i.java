package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public final class i extends b {
    private final EnumSet<h> b;

    public i(h... hVarArr) {
        this.b = EnumSet.copyOf((Collection) (hVarArr.length > 0 ? Arrays.asList(hVarArr) : Collections.singletonList(h.a)));
    }

    @Override // com.github.catvod.spider.merge.G.b
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
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
                h hVar = h.a;
                EnumSet<h> enumSet = this.b;
                if (enumSet != null && enumSet.contains(hVar)) {
                    return 0;
                }
                h hVar2 = h.b;
                EnumSet<h> enumSet2 = this.b;
                if (enumSet2 != null && enumSet2.contains(hVar2)) {
                    throw new IllegalArgumentException(oZP.d("260A1A2841361A03182F4C27101E02281E30114F16354C301B0B572E0A751B1A1A241E3C164F122F183C0116"));
                }
            }
            try {
                int i6 = i2 != 0 ? Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 16) : Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 10);
                int i7 = i6;
                if (i6 > 65535) {
                    char[] chars = Character.toChars(i6);
                    writer.write(chars[0]);
                    i7 = chars[1];
                }
                writer.write(i7);
                return ((i4 + 2) - i3) + i2 + i5;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
