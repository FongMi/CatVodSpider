package com.github.catvod.spider.merge.G;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public final class j extends b {
    private boolean b(char c) {
        return c >= '0' && c <= '7';
    }

    @Override // com.github.catvod.spider.merge.G.b
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i2 = i + 1;
            if (b(charSequence.charAt(i2))) {
                int i3 = i + 2;
                int i4 = i + 3;
                sb.append(charSequence.charAt(i2));
                if (length > 1 && b(charSequence.charAt(i3))) {
                    sb.append(charSequence.charAt(i3));
                    if (length > 2) {
                        char cCharAt = charSequence.charAt(i2);
                        if (cCharAt >= '0' && cCharAt <= '3') {
                            z = true;
                        }
                        if (z && b(charSequence.charAt(i4))) {
                            sb.append(charSequence.charAt(i4));
                        }
                    }
                }
                writer.write(Integer.parseInt(sb.toString(), 8));
                return sb.length() + 1;
            }
        }
        return 0;
    }
}
