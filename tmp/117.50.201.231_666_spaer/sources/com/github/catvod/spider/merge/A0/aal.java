package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class aal extends st {
    public final /* synthetic */ int b;

    @Override // com.github.catvod.spider.merge.A0.st
    public final boolean a(int i, StringWriter stringWriter) throws IOException {
        switch (this.b) {
            case 0:
                if (i < 32 || i > 127) {
                    if (i <= 65535) {
                        stringWriter.write("\\u");
                        char[] cArr = sd.f;
                        stringWriter.write(cArr[(i >> 12) & 15]);
                        stringWriter.write(cArr[(i >> 8) & 15]);
                        stringWriter.write(cArr[(i >> 4) & 15]);
                        stringWriter.write(cArr[i & 15]);
                    } else {
                        char[] chars = Character.toChars(i);
                        StringBuilder sb = new StringBuilder("\\u");
                        String hexString = Integer.toHexString(chars[0]);
                        Locale locale = Locale.ENGLISH;
                        sb.append(hexString.toUpperCase(locale));
                        sb.append("\\u");
                        sb.append(Integer.toHexString(chars[1]).toUpperCase(locale));
                        stringWriter.write(sb.toString());
                    }
                }
                break;
            default:
                if (i < 55296 || i > 57343) {
                }
                break;
        }
        return false;
    }
}
