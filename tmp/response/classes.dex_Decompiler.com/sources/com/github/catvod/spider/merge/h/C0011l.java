package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.oZP;
import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0011l extends AbstractC0013n {
    private static final C0011l b = new C0011l(oZP.d("5D350B69536F2E445A1C30310E5D0A6845"));
    private static final C0011l c = new C0011l(oZP.d("5D350B69536F2E445A1C30310E5D0A1D082E47125E68"));
    private static final C0011l d = new C0011l(oZP.d("5D350B69536F2E445A1C30310E5D0A69536F4F462B25176708465E"));

    C0011l(String str) {
        this.a = Pattern.compile(str);
    }

    static AbstractC0014o e(int i) {
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        throw new IllegalArgumentException(oZP.d("1C010120003C114F19340137101D572E0A752D"));
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0013n
    final void c(Calendar calendar, String str) {
        calendar.setTimeZone(O.a(str));
    }
}
