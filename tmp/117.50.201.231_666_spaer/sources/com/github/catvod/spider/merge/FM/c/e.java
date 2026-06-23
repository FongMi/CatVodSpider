package com.github.catvod.spider.merge.FM.C;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class e extends com.github.catvod.spider.merge.FM.F.b {
    private static final String b = String.valueOf('\"');
    private static final char[] c = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.merge.FM.F.b
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        boolean z;
        if (i != 0) {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
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
