package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Calendar;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0712l extends AbstractC0714n {
    private static final C0712l b = new C0712l(ZrJ.d("51193765777F2268661014210271366461"));
    private static final C0712l c = new C0712l(ZrJ.d("51193765777F226866101421027136112C3E4B3E6264"));
    private static final C0712l d = new C0712l(ZrJ.d("51193765777F22686610142102713665777F436A17293377046A62"));

    C0712l(String str) {
        this.a = Pattern.compile(str);
    }

    static AbstractC0715o e(int i) {
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        throw new IllegalArgumentException(ZrJ.d("102D3D2C242C1D63253825271C316B222E6521"));
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0714n
    final void c(Calendar calendar, String str) {
        calendar.setTimeZone(O.a(str));
    }
}
