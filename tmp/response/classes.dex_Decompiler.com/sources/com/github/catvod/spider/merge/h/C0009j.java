package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0009j extends AbstractC0013n {
    private final int b;
    final Locale c;
    private final Map<String, Integer> d;

    C0009j(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = com.github.catvod.spider.merge.D.c.a(locale);
        StringBuilder sbC = C0133t.c(oZP.d("5D474828197C"));
        this.d = (HashMap) t.c(calendar, locale, i, sbC);
        sbC.setLength(sbC.length() - 1);
        sbC.append(oZP.d("5C"));
        this.a = Pattern.compile(sbC.toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    @Override // com.github.catvod.spider.merge.H.AbstractC0013n
    final void c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.c);
        Integer num = (Integer) this.d.get(lowerCase);
        if (num == null) {
            num = (Integer) this.d.get(lowerCase + '.');
        }
        calendar.set(this.b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0013n
    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("360E0424253B060A193205211C191215092D013C03330D2110080E6137331C0A1B2551"));
        sbC.append(this.b);
        sbC.append(oZP.d("594F1B2E0F34190A4A"));
        sbC.append(this.c);
        sbC.append(oZP.d("594F1B0A092C230E1B34092648"));
        sbC.append(this.d);
        sbC.append(oZP.d("594F07201821101D197C"));
        sbC.append(this.a);
        sbC.append(oZP.d("28"));
        return sbC.toString();
    }
}
