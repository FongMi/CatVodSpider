package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public final class e extends c {
    private final int b = 32;
    private final int c = 127;

    @Override // com.github.catvod.spider.merge.G.c
    public final boolean b(int i, Writer writer) throws IOException {
        if (i >= this.b && i <= this.c) {
            return false;
        }
        String strD = oZP.d("291A");
        if (i <= 65535) {
            writer.write(strD);
            char[] cArr = b.a;
            writer.write(cArr[(i >> 12) & 15]);
            writer.write(cArr[(i >> 8) & 15]);
            writer.write(cArr[(i >> 4) & 15]);
            writer.write(cArr[i & 15]);
            return true;
        }
        char[] chars = Character.toChars(i);
        StringBuilder sbC = C0133t.c(strD);
        String hexString = Integer.toHexString(chars[0]);
        Locale locale = Locale.ENGLISH;
        sbC.append(hexString.toUpperCase(locale));
        sbC.append(strD);
        sbC.append(Integer.toHexString(chars[1]).toUpperCase(locale));
        writer.write(sbC.toString());
        return true;
    }
}
