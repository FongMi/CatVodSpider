package com.github.catvod.spider.merge.FM.F;

import com.github.catvod.spider.merge.FM.L.P;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class e extends c {
    private final int b = 32;
    private final int c = 127;

    @Override // com.github.catvod.spider.merge.FM.F.c
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
        StringBuilder sbB = P.b("\\u");
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        sbB.append(hexString.toUpperCase(locale));
        sbB.append("\\u");
        sbB.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        writer.write(sbB.toString());
        return true;
    }
}
