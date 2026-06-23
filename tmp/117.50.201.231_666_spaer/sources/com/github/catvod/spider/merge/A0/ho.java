package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ho extends sd {
    public static final String a = String.valueOf('\"');
    public static final char[] b = {',', '\"', '\r', '\n'};

    @Override // com.github.catvod.spider.merge.A0.sd
    public final int c(String str, int i, StringWriter stringWriter) throws IOException {
        char[] cArr;
        if (i != 0) {
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
        String string = str.toString();
        int i2 = fx.a;
        if (string == null || (cArr = b) == null) {
            stringWriter.write(str.toString());
        } else {
            int length = string.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i4 = length2 - 1;
            loop0: for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = string.charAt(i5);
                for (int i6 = 0; i6 < length2; i6++) {
                    if (cArr[i6] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == string.charAt(i5 + 1)))) {
                        stringWriter.write(34);
                        String string2 = str.toString();
                        StringBuilder sb = new StringBuilder();
                        String str2 = a;
                        sb.append(str2);
                        sb.append(str2);
                        stringWriter.write(fx.g(string2, str2, sb.toString()));
                        stringWriter.write(34);
                        break loop0;
                    }
                }
            }
            stringWriter.write(str.toString());
        }
        return Character.codePointCount(str, 0, str.length());
    }
}
