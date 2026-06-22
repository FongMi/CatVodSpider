package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.g.C1201a;
import com.github.catvod.spider.merge.l.C1290c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class D {
    private static final Pattern[] a = {Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\((\\d+,)decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\b(?:[a-zA-Z0-9_$]+)&&\\((?:[a-zA-Z0-9_$]+)=([a-zA-Z0-9_$]{2,})\\(decodeURIComponent\\((?:[a-zA-Z0-9_$]+)\\)\\)"), Pattern.compile("\\bm=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(h\\.s\\)\\)"), Pattern.compile("\\bc&&\\(c=([a-zA-Z0-9$]{2,})\\(decodeURIComponent\\(c\\)\\)"), Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2,})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)"), Pattern.compile("([\\w$]+)\\s*=\\s*function\\((\\w+)\\)\\{\\s*\\2=\\s*\\2\\.split\\(\"\"\\)\\s*;")};
    private static final Pattern b = Pattern.compile("(var [A-z]=['\"].*['\"].split\\(\"[;{]\"\\))");
    private static final Pattern c = Pattern.compile("[;,]([A-Za-z0-9_$]{2,})\\[..");

    private static String a(String str, String str2) {
        return C1290c.a("var ", com.github.catvod.spider.merge.L1.k.d("(" + Pattern.quote(str2) + "=function\\([a-zA-Z0-9_]+\\)\\{.+?\\})", str, 1));
    }

    static String b(String str) throws com.github.catvod.spider.merge.p1.i {
        String strA;
        try {
            try {
                Matcher matcherF = com.github.catvod.spider.merge.L1.k.f(a, str);
                com.github.catvod.spider.merge.L1.d dVar = new com.github.catvod.spider.merge.L1.d(matcherF.group(1), matcherF.groupCount() > 1 ? matcherF.group(2) : "");
                String str2 = (String) dVar.a();
                String str3 = (String) dVar.b();
                try {
                    String str4 = str2 + "=function";
                    strA = str4 + C1201a.e(str, str4);
                } catch (Exception unused) {
                    strA = a(str, str2);
                }
                com.github.catvod.spider.merge.L1.l.b(strA);
                return com.github.catvod.spider.merge.L1.k.e(b, str, 1) + ";" + com.github.catvod.spider.merge.L1.k.d("(var " + Pattern.quote(com.github.catvod.spider.merge.L1.k.e(c, strA, 1)) + "=\\{(?>.|\\n)+?\\}\\};)", str, 1).replace("\n", "") + strA + ";" + ("function deobfuscate(a){return " + str2 + "(" + str3 + "a);}");
            } catch (com.github.catvod.spider.merge.L1.j e) {
                throw new com.github.catvod.spider.merge.p1.i("Could not find deobfuscation function with any of the known patterns", e);
            }
        } catch (Exception e2) {
            throw new com.github.catvod.spider.merge.p1.i("Could not parse deobfuscation function", e2);
        }
    }
}
