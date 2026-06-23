package com.github.catvod.spider.merge.C0.P;

import com.github.catvod.spider.merge.C0.S.i;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class t extends z {
    private final int h;

    public t(s sVar, InterfaceC0122d interfaceC0122d, int i) {
        super(sVar, interfaceC0122d, null);
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.h;
        if (i < 0 || i >= ((InterfaceC0122d) b()).size()) {
            string = "";
        } else {
            InterfaceC0122d interfaceC0122d = (InterfaceC0122d) b();
            int i2 = this.h;
            String strH = interfaceC0122d.h(i.b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strH.toCharArray()) {
                if (c == '\t') {
                    str = "\\t";
                } else if (c == '\n') {
                    str = "\\n";
                } else if (c == '\r') {
                    str = "\\r";
                } else {
                    sb.append(c);
                }
                sb.append(str);
            }
            string = sb.toString();
        }
        return String.format(Locale.getDefault(), "%s('%s')", t.class.getSimpleName(), string);
    }
}
