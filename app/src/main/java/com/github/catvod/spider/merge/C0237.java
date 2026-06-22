package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ا, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0237 extends AbstractC0108 {
    @Override // com.github.catvod.spider.merge.AbstractC0108
    /* JADX INFO: renamed from: Ԩ */
    public int mo363(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                break;
            }
            i4++;
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 > charSequence.length()) {
            throw new IllegalArgumentException(SOY.d("36372205540312333F56405712372956101E1D3B2505541E147224181D141536345602161627344C5450") + ((Object) charSequence.subSequence(i, charSequence.length())) + SOY.d("5D72350311570E3D71131A135A3D3756371F1B20021305021F3C3213"));
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i5, i6);
        try {
            writer.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
            return i4 + 4;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(SOY.d("2F3C301418125A263E56041608213456011913313E1211570C333D03114D5A") + ((Object) charSequenceSubSequence), e);
        }
    }
}
