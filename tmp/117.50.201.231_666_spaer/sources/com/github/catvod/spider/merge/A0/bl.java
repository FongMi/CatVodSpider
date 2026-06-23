package com.github.catvod.spider.merge.A0;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class bl {
    public final Pattern a = Pattern.compile("url\\((.*?)\\)", 40);
    public final Pattern b = Pattern.compile(":eq|:lt|:gt|:first|:last|:not|:even|:odd|:has|:contains|:matches|:empty|^body$|^#");
    public final Pattern c = Pattern.compile("(url|src|href|-original|-src|-play|-url|style)$|^(data-|url-|src-)", 10);
    public final Pattern d = Pattern.compile("^(ftp|magnet|thunder|ws):", 10);
    public final ry e = new ry();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.A0.rp f(com.github.catvod.spider.merge.A0.em r9, java.lang.String r10, com.github.catvod.spider.merge.A0.rp r11) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.bl.f(com.github.catvod.spider.merge.A0.em, java.lang.String, com.github.catvod.spider.merge.A0.rp):com.github.catvod.spider.merge.A0.rp");
    }

    public final String g(String str, String str2, String str3) {
        String str4;
        String strB;
        String strJoin = str2;
        ry ryVar = this.e;
        if (!str.equals(ryVar.a)) {
            ryVar.a = str;
            ryVar.c = oj.a(str);
        }
        em emVar = ryVar.c;
        if ("body&&Text".equals(strJoin) || "Text".equals(strJoin)) {
            return emVar.ak();
        }
        if ("body&&Html".equals(strJoin) || "Html".equals(strJoin)) {
            return emVar.ae();
        }
        String str5 = "";
        if (strJoin.contains("&&")) {
            String[] strArrSplit = strJoin.split("&&");
            str4 = strArrSplit[strArrSplit.length - 1];
            ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
            arrayList.remove(strArrSplit.length - 1);
            strJoin = TextUtils.join("&&", arrayList);
        } else {
            str4 = "";
        }
        String[] strArrSplit2 = h(strJoin, true).split(" ");
        rp rpVar = new rp();
        for (String str6 : strArrSplit2) {
            rpVar = f(emVar, str6, rpVar);
            if (rpVar.isEmpty()) {
                return "";
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return rpVar.d();
        }
        if ("Text".equals(str4)) {
            return rpVar.f();
        }
        if ("Html".equals(str4)) {
            return rpVar.c();
        }
        for (String str7 : str4.split("[||]")) {
            String strA = rpVar.a(str7);
            if (str7.toLowerCase().contains("style") && strA.contains("url(")) {
                Matcher matcher = this.a.matcher(strA);
                if (matcher.find()) {
                    strA = matcher.group(1);
                }
                strA = strA.replaceAll("^['|\"](.*)['|\"]$", "$1");
            }
            if (strA.isEmpty() || str3.isEmpty() || !this.c.matcher(str7).find() || this.d.matcher(strA).find()) {
                str5 = strA;
            } else {
                if (strA.contains("http")) {
                    strB = strA.substring(strA.indexOf("http"));
                } else {
                    StringBuilder sb = new StringBuilder();
                    int[] iArrA = ah.a(strA);
                    if (iArrA[0] != -1) {
                        sb.append(strA);
                        ah.b(sb, iArrA[1], iArrA[2]);
                        strB = sb.toString();
                    } else {
                        int[] iArrA2 = ah.a(str3);
                        if (iArrA[3] == 0) {
                            sb.append((CharSequence) str3, 0, iArrA2[3]);
                            sb.append(strA);
                            strB = sb.toString();
                        } else if (iArrA[2] == 0) {
                            sb.append((CharSequence) str3, 0, iArrA2[2]);
                            sb.append(strA);
                            strB = sb.toString();
                        } else {
                            int i = iArrA[1];
                            if (i != 0) {
                                int i2 = iArrA2[0] + 1;
                                sb.append((CharSequence) str3, 0, i2);
                                sb.append(strA);
                                strB = ah.b(sb, iArrA[1] + i2, i2 + iArrA[2]);
                            } else if (strA.charAt(i) == '/') {
                                sb.append((CharSequence) str3, 0, iArrA2[1]);
                                sb.append(strA);
                                int i3 = iArrA2[1];
                                strB = ah.b(sb, i3, iArrA[2] + i3);
                            } else {
                                int i4 = iArrA2[0] + 2;
                                int i5 = iArrA2[1];
                                if (i4 >= i5 || i5 != iArrA2[2]) {
                                    int iLastIndexOf = str3.lastIndexOf(47, iArrA2[2] - 1);
                                    int i6 = iLastIndexOf == -1 ? iArrA2[1] : iLastIndexOf + 1;
                                    sb.append((CharSequence) str3, 0, i6);
                                    sb.append(strA);
                                    strB = ah.b(sb, iArrA2[1], i6 + iArrA[2]);
                                } else {
                                    sb.append((CharSequence) str3, 0, i5);
                                    sb.append('/');
                                    sb.append(strA);
                                    int i7 = iArrA2[1];
                                    strB = ah.b(sb, i7, iArrA[2] + i7 + 1);
                                }
                            }
                        }
                    }
                }
                str5 = strB;
            }
            if (!str5.isEmpty()) {
                return str5;
            }
        }
        return str5;
    }

    public final String h(String str, boolean z) {
        boolean zContains = str.contains("&&");
        Pattern pattern = this.b;
        if (!zContains) {
            String[] strArrSplit = str.split(" ");
            return (pattern.matcher(strArrSplit[strArrSplit.length + (-1)]).find() || !z) ? str : str.concat(":eq(0)");
        }
        String[] strArrSplit2 = str.split("&&");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArrSplit2.length; i++) {
            if (pattern.matcher(strArrSplit2[i].split(" ")[r5.length - 1]).find()) {
                arrayList.add(strArrSplit2[i]);
            } else if (z || i < strArrSplit2.length - 1) {
                arrayList.add(strArrSplit2[i] + ":eq(0)");
            } else {
                arrayList.add(strArrSplit2[i]);
            }
        }
        return TextUtils.join(" ", arrayList);
    }
}
