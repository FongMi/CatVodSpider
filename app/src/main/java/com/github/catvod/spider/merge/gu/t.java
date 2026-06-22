package com.github.catvod.spider.merge.gu;

import com.github.catvod.spider.merge.Mm.i;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class t extends z {
    private final int h;

    public t(s sVar, InterfaceC1227d interfaceC1227d, int i) {
        super(sVar, interfaceC1227d, null);
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.h;
        if (i < 0 || i >= ((InterfaceC1227d) b()).size()) {
            string = "";
        } else {
            InterfaceC1227d interfaceC1227d = (InterfaceC1227d) b();
            int i2 = this.h;
            String strH = interfaceC1227d.h(i.b(i2, i2));
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
