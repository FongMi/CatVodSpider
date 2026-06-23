package com.github.catvod.spider.merge.t;

import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class r extends w {
    private final int f;

    public r(q qVar, InterfaceC0627d interfaceC0627d, int i) {
        super(qVar, interfaceC0627d, null);
        this.f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.f;
        if (i < 0 || i >= ((InterfaceC0627d) b()).size()) {
            string = "";
        } else {
            InterfaceC0627d interfaceC0627d = (InterfaceC0627d) b();
            int i2 = this.f;
            String strD = interfaceC0627d.d(com.github.catvod.spider.merge.w.h.b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strD.toCharArray()) {
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
        return String.format(Locale.getDefault(), "%s('%s')", r.class.getSimpleName(), string);
    }
}
