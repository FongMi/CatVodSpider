package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0710j extends AbstractC0714n {
    private final int b;
    final Locale c;
    private final Map<String, Integer> d;

    C0710j(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = com.github.catvod.spider.merge.VE.c.a(locale);
        StringBuilder sbB = C0925t.b(ZrJ.d("516B74243D6C"));
        this.d = (HashMap) t.c(calendar, locale, i, sbB);
        sbB.setLength(sbB.length() - 1);
        sbB.append(ZrJ.d("50"));
        this.a = Pattern.compile(sbB.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // com.github.catvod.spider.merge.HN.AbstractC0714n
    final void c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.c);
        Integer num = (Integer) this.d.get(lowerCase);
        if (num == null) {
            num = (Integer) this.d.get(lowerCase + '.');
        }
        calendar.set(this.b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0714n
    public final String toString() {
        StringBuilder sbB = C0925t.b(ZrJ.d("3A223828012B0A26253E213110352E192D3D0D103F3F29311C24326D13231026272975"));
        sbB.append(this.b);
        sbB.append(ZrJ.d("556327222B24152676"));
        sbB.append(this.c);
        sbB.append(ZrJ.d("556327062D3C2F2227382D3644"));
        sbB.append(this.d);
        sbB.append(ZrJ.d("55633B2C3C311C312570"));
        sbB.append(this.a);
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
