package com.github.catvod.spider.merge.H1;

import com.github.catvod.spider.merge.b.AbstractC0901a;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.p1.C1369f;
import com.github.catvod.spider.merge.p1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class c extends AbstractC0901a {
    private static final Pattern a = Pattern.compile("^([a-zA-Z0-9_-]{11})");
    private static final c b = new c();
    private static final List<String> c;

    static {
        Object[] objArr = {"embed/", "live/", "shorts/", "watch/", "v/", "w/"};
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            obj.getClass();
            arrayList.add(obj);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    private c() {
    }

    private static String o(String str) throws i {
        String strP = p(str);
        if (strP != null) {
            return strP;
        }
        throw new i("The given string is not a YouTube video ID");
    }

    private static String p(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private String q(String str) {
        for (String str2 : c) {
            if (str.startsWith(str2)) {
                return o(str.substring(str2.length()));
            }
        }
        return null;
    }

    public static c r() {
        return b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:182:0x028e  */
    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g(java.lang.String r8) throws com.github.catvod.spider.merge.p1.i {
        /*
            Method dump skipped, instruction units count: 1078
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.H1.c.g(java.lang.String):java.lang.String");
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final String i(String str) {
        return C1290c.a("https://www.youtube.com/watch?v=", str);
    }

    @Override // com.github.catvod.spider.merge.b.AbstractC0901a
    public final boolean l(String str) throws C1369f {
        try {
            g(str);
            return true;
        } catch (C1369f e) {
            throw e;
        } catch (i unused) {
            return false;
        }
    }
}
