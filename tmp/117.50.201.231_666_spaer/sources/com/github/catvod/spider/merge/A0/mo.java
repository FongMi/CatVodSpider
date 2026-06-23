package com.github.catvod.spider.merge.A0;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class mo extends ms {
    public final int c;
    public final Locale d;
    public final HashMap e;

    public mo(int i, Calendar calendar, Locale locale) {
        this.c = i;
        this.d = at.a(locale);
        StringBuilder sb = new StringBuilder();
        sb.append("((?iu)");
        HashMap map = new HashMap();
        Locale localeA = at.a(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i, 0, localeA);
        TreeSet treeSet = new TreeSet(abe.b);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(localeA);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            abe.z(sb, (String) it.next());
            sb.append('|');
        }
        this.e = map;
        sb.setLength(sb.length() - 1);
        sb.append(")");
        this.g = Pattern.compile(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.A0.ms
    public final void f(Calendar calendar, String str) {
        String lowerCase = str.toLowerCase(this.d);
        HashMap map = this.e;
        Integer num = (Integer) map.get(lowerCase);
        if (num == null) {
            num = (Integer) map.get(lowerCase + '.');
        }
        calendar.set(this.c, num.intValue());
    }

    @Override // com.github.catvod.spider.merge.A0.ms
    public final String toString() {
        return "CaseInsensitiveTextStrategy [field=" + this.c + ", locale=" + this.d + ", lKeyValues=" + this.e + ", pattern=" + this.g + "]";
    }
}
