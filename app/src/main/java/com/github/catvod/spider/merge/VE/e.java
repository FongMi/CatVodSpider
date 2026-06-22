package com.github.catvod.spider.merge.VE;

import com.github.catvod.spider.merge.ZrJ;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class e extends com.github.catvod.spider.merge.Gr.b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = {',', '\"', '\r', '\n'};

    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        boolean z;
        if (i != 0) {
            throw new IllegalStateException(ZrJ.d("3A303D083B2618332E3F6836112C3E212C6517263D283A650B262A2E20650D2B2E6D1374246322232C2001"));
        }
        String string = charSequence.toString();
        char[] cArr = c;
        int i2 = h.a;
        if (string == null || cArr == null) {
            z = true;
        } else {
            int length = string.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i4 = length2 - 1;
            loop0: for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = string.charAt(i5);
                for (int i6 = 0; i6 < length2; i6++) {
                    if (cArr[i6] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == string.charAt(i5 + 1)))) {
                        z = false;
                        break loop0;
                    }
                }
            }
            z = true;
        }
        if (z) {
            writer.write(charSequence.toString());
        } else {
            writer.write(34);
            String string2 = charSequence.toString();
            String str = b;
            writer.write(h.h(string2, str, str + str));
            writer.write(34);
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
