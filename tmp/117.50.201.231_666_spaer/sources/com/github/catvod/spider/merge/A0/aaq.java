package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aaq extends sd {
    public final /* synthetic */ int a;

    @Override // com.github.catvod.spider.merge.A0.sd
    public final int c(String str, int i, StringWriter stringWriter) throws IOException {
        int i2;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        int i3;
        int i4;
        switch (this.a) {
            case 0:
                int length = (str.length() - i) - 1;
                StringBuilder sb = new StringBuilder();
                if (str.charAt(i) != '\\' || length <= 0 || (cCharAt = str.charAt((i2 = i + 1))) < '0' || cCharAt > '7') {
                    return 0;
                }
                int i5 = i + 2;
                int i6 = i + 3;
                sb.append(str.charAt(i2));
                if (length > 1 && (cCharAt2 = str.charAt(i5)) >= '0' && cCharAt2 <= '7') {
                    sb.append(str.charAt(i5));
                    if (length > 2 && (cCharAt3 = str.charAt(i2)) >= '0' && cCharAt3 <= '3' && (cCharAt4 = str.charAt(i6)) >= '0' && cCharAt4 <= '7') {
                        sb.append(str.charAt(i6));
                    }
                }
                stringWriter.write(Integer.parseInt(sb.toString(), 8));
                return sb.length() + 1;
            default:
                if (str.charAt(i) != '\\' || (i3 = i + 1) >= str.length() || str.charAt(i3) != 'u') {
                    return 0;
                }
                int i7 = 2;
                while (true) {
                    i4 = i + i7;
                    if (i4 < str.length() && str.charAt(i4) == 'u') {
                        i7++;
                    }
                }
                if (i4 < str.length() && str.charAt(i4) == '+') {
                    i7++;
                }
                int i8 = i + i7;
                int i9 = i8 + 4;
                if (i9 > str.length()) {
                    throw new IllegalArgumentException("Less than 4 hex digits in unicode value: '" + ((Object) str.subSequence(i, str.length())) + "' due to end of CharSequence");
                }
                CharSequence charSequenceSubSequence = str.subSequence(i8, i9);
                try {
                    stringWriter.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
                    return i7 + 4;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to parse unicode value: " + ((Object) charSequenceSubSequence), e);
                }
        }
    }
}
