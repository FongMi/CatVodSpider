package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʷ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0109 extends AbstractC0108 {
    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private boolean m389(char c) {
        return c >= '0' && c <= '7';
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private boolean m390(char c) {
        return c >= '0' && c <= '3';
    }

    @Override // com.github.catvod.spider.merge.AbstractC0108
    /* JADX INFO: renamed from: Ԩ */
    public int mo363(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0) {
            return 0;
        }
        int i2 = i + 1;
        if (!m389(charSequence.charAt(i2))) {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(charSequence.charAt(i2));
        if (length > 1 && m389(charSequence.charAt(i3))) {
            sb.append(charSequence.charAt(i3));
            if (length > 2 && m390(charSequence.charAt(i2)) && m389(charSequence.charAt(i4))) {
                sb.append(charSequence.charAt(i4));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
