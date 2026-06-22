package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʶ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public abstract class AbstractC0108 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    static final char[] f282 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String m385(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    /* JADX INFO: renamed from: Ԩ */
    public abstract int mo363(CharSequence charSequence, int i, Writer writer);

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public final String m386(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            m387(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public final void m387(CharSequence charSequence, Writer writer) throws IOException {
        if (writer == null) {
            throw new IllegalArgumentException(SOY.d("2E3A3456230513263404541A0F2125561A180E72331354190F3E3D"));
        }
        if (charSequence == null) {
            return;
        }
        int length = charSequence.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iMo363 = mo363(charSequence, iCharCount, writer);
            if (iMo363 == 0) {
                char cCharAt = charSequence.charAt(iCharCount);
                writer.write(cCharAt);
                iCharCount++;
                if (Character.isHighSurrogate(cCharAt) && iCharCount < length) {
                    char cCharAt2 = charSequence.charAt(iCharCount);
                    if (Character.isLowSurrogate(cCharAt2)) {
                        writer.write(cCharAt2);
                        iCharCount++;
                    }
                }
            } else {
                for (int i = 0; i < iMo363; i++) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public final AbstractC0108 m388(AbstractC0108... abstractC0108Arr) {
        AbstractC0108[] abstractC0108Arr2 = new AbstractC0108[abstractC0108Arr.length + 1];
        abstractC0108Arr2[0] = this;
        System.arraycopy(abstractC0108Arr, 0, abstractC0108Arr2, 1, abstractC0108Arr.length);
        return new C0101(abstractC0108Arr2);
    }
}
