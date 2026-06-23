package com.github.catvod.spider.merge.FM.x;

import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class u extends C0423A {
    private final int f;

    public u(t tVar, InterfaceC0437d interfaceC0437d, int i) {
        super(tVar, interfaceC0437d, null);
        this.f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String str;
        int i = this.f;
        if (i < 0 || i >= ((InterfaceC0437d) b()).size()) {
            string = "";
        } else {
            InterfaceC0437d interfaceC0437d = (InterfaceC0437d) b();
            int i2 = this.f;
            String strE = interfaceC0437d.e(com.github.catvod.spider.merge.FM.A.j.b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strE.toCharArray()) {
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
        return String.format(Locale.getDefault(), "%s('%s')", u.class.getSimpleName(), string);
    }
}
