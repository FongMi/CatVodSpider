package com.github.catvod.spider.merge.yZ;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Locale;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class u extends A {
    private final int f;

    public u(t tVar, InterfaceC1439d interfaceC1439d, int i) {
        super(tVar, interfaceC1439d, null);
        this.f = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String string;
        String strD;
        int i = this.f;
        if (i < 0 || i >= ((InterfaceC1439d) b()).size()) {
            string = "";
        } else {
            InterfaceC1439d interfaceC1439d = (InterfaceC1439d) b();
            int i2 = this.f;
            String strH = interfaceC1439d.h(com.github.catvod.spider.merge.Bk.j.b(i2, i2));
            StringBuilder sb = new StringBuilder();
            for (char c : strH.toCharArray()) {
                if (c == '\t') {
                    strD = ZrJ.d("2537");
                } else if (c == '\n') {
                    strD = ZrJ.d("252D");
                } else if (c == '\r') {
                    strD = ZrJ.d("2531");
                } else {
                    sb.append(c);
                }
                sb.append(strD);
            }
            string = sb.toString();
        }
        return String.format(Locale.getDefault(), ZrJ.d("5C30636A6D365E6A"), u.class.getSimpleName(), string);
    }
}
