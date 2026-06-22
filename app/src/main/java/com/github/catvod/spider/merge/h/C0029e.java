package com.github.catvod.spider.merge.H;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0029e extends i {
    public final int b;
    public final Locale c;
    public final HashMap d;

    public C0029e(int i, Calendar calendar, Locale locale) {
        this.b = i;
        this.c = com.github.catvod.spider.merge.E.b.a(locale);
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)");
        HashMap map = new HashMap();
        Locale localeA = com.github.catvod.spider.merge.E.b.a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, localeA);
        TreeSet treeSet = new TreeSet(n.h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeA);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            n.c(sb, (String) it.next());
            sb.append('|');
        }
        this.d = map;
        sb.setLength(sb.length() - 1);
        sb.append(")");
        this.a = Pattern.compile(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.H.i
    public final void c(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.c);
        HashMap map = this.d;
        Integer num = (Integer) map.get(lowerCase);
        if (num == null) {
            num = (Integer) map.get(lowerCase + '.');
        }
        calendar.set(this.b, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.H.i
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.b + ", locale=" + this.c + ", lKeyValues=" + this.d + ", pattern=" + this.a + "]";
    }
}
