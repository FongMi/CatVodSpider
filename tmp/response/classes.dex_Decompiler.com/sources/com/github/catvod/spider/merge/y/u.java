package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.oZP;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public final class u extends C0246A {
    private final int f;

    public u(t tVar, InterfaceC0260d interfaceC0260d, int i) {
        super(tVar, interfaceC0260d, null);
        this.f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String strD;
        int i = this.f;
        if (i < 0 || i >= ((InterfaceC0260d) b()).size()) {
            string = "";
        } else {
            InterfaceC0260d interfaceC0260d = (InterfaceC0260d) b();
            int i2 = this.f;
            String strH = interfaceC0260d.h(com.github.catvod.spider.merge.B.j.b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strH.toCharArray()) {
                if (c == '\t') {
                    strD = oZP.d("291B");
                } else if (c == '\n') {
                    strD = oZP.d("2901");
                } else if (c == '\r') {
                    strD = oZP.d("291D");
                } else {
                    sb.append(c);
                }
                sb.append(strD);
            }
            string = sb.toString();
        }
        return String.format(Locale.getDefault(), oZP.d("501C5F6649265246"), u.class.getSimpleName(), string);
    }
}
