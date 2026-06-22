package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.g.C1201a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class F {
    private static final Pattern a = Pattern.compile("[&?]n=([^&]+)");
    private static final Pattern[] b = {Pattern.compile("([A-Za-z0-9_\\$]{2,})=function.*return [A-Z]\\[\\d+\\]"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\)&&\\([a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\).+\\|\\|([a-zA-Z0-9$_]+)\\(\"\"\\)"), Pattern.compile(",[a-zA-Z0-9$_]+\\([a-zA-Z0-9$_]+\\),[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+\\[[a-zA-Z0-9$_]+]\\|\\|null\\)&&\\(\\b[a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]\\([a-zA-Z0-9$_]\\),[a-zA-Z0-9$_]+\\.set\\((?:\"n+\"|[a-zA-Z0-9$_]+),[a-zA-Z0-9$_]+\\)"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.get\\([a-zA-Z0-9$_]+\\)\\).+\\|\\|([a-zA-Z0-9$_]+)\\(\"\"\\)"), Pattern.compile("[a-zA-Z0-9$_]=\"nn\"\\[\\+[a-zA-Z0-9$_]+\\.[a-zA-Z0-9$_]+],[a-zA-Z0-9$_]+=[a-zA-Z0-9$_]+\\.get\\([a-zA-Z0-9$_]+\\)\\)&&\\([a-zA-Z0-9$_]+=([a-zA-Z0-9$_]+)\\[(\\d+)]"), Pattern.compile("\\([a-zA-Z0-9$_]=String\\.fromCharCode\\(110\\),[a-zA-Z0-9$_]=[a-zA-Z0-9$_]\\.get\\([a-zA-Z0-9$_]\\)\\)&&\\([a-zA-Z0-9$_]=([a-zA-Z0-9$_]+)(?:\\[(\\d+)])?\\([a-zA-Z0-9$_]\\)"), Pattern.compile("\\.get\\(\"n\"\\)\\)&&\\([a-zA-Z0-9$_]=([a-zA-Z0-9$_]+)(?:\\[(\\d+)])?\\([a-zA-Z0-9$_]\\)")};

    static String a(String str, String str2) {
        String str3;
        try {
            String str4 = str2 + "=function";
            str3 = str4 + C1201a.e(str, str4) + ";";
        } catch (Exception unused) {
            str3 = "function " + str2 + com.github.catvod.spider.merge.L1.k.e(Pattern.compile(Pattern.quote(str2) + "=\\s*function([\\S\\s]*?\\}\\s*return [\\w$]+?\\.join\\(\"\"\\)\\s*\\};)", 32), str, 1);
            com.github.catvod.spider.merge.L1.l.b(str3);
        }
        return Pattern.compile(";\\s*if\\s*\\(\\s*typeof\\s+[a-zA-Z0-9$_]++\\s*===?\\s*([\"'])undefined\\1\\s*\\)\\s*return\\s+" + com.github.catvod.spider.merge.L1.k.d("=\\s*function\\s*\\(\\s*([^)]*)\\s*\\)", str3, 1).split(",")[0].trim() + ";", 32).matcher(str3).replaceFirst(";");
    }

    static String b(String str) throws com.github.catvod.spider.merge.p1.i {
        try {
            Matcher matcherF = com.github.catvod.spider.merge.L1.k.f(b, str);
            String strGroup = matcherF.group(1);
            if (matcherF.groupCount() == 1) {
                return strGroup;
            }
            return com.github.catvod.spider.merge.L1.k.e(Pattern.compile("var " + Pattern.quote(strGroup) + "\\s*=\\s*\\[(.+?)][;,]"), str, 1).split(",")[Integer.parseInt(matcherF.group(2))];
        } catch (com.github.catvod.spider.merge.L1.j e) {
            throw new com.github.catvod.spider.merge.p1.i("Could not find deobfuscation function with any of the known patterns in the base JavaScript player code", e);
        }
    }

    static String c(String str) {
        if (!str.contains("&n=") && !str.contains("?n=")) {
            return null;
        }
        try {
            return com.github.catvod.spider.merge.L1.k.e(a, str, 1);
        } catch (com.github.catvod.spider.merge.L1.j unused) {
            return null;
        }
    }
}
