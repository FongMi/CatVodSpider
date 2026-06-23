package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.a.C0529a;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class e extends c {
    private final int b = 32;
    private final int c = 127;

    @Override // com.github.catvod.spider.merge.B.c
    public final boolean b(int i, Writer writer) throws IOException {
        if (i >= this.b && i <= this.c) {
            return false;
        }
        if (i <= 65535) {
            writer.write("\\u");
            char[] cArr = b.a;
            writer.write(cArr[(i >> 12) & 15]);
            writer.write(cArr[(i >> 8) & 15]);
            writer.write(cArr[(i >> 4) & 15]);
            writer.write(cArr[i & 15]);
            return true;
        }
        char[] chars = Character.toChars(i);
        StringBuilder sbA = C0529a.a("\\u");
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        sbA.append(hexString.toUpperCase(locale));
        sbA.append("\\u");
        sbA.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        writer.write(sbA.toString());
        return true;
    }
}
