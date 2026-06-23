package com.github.catvod.spider.merge.A;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class l {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String format(java.lang.String r12, java.lang.String r13) {
        /*
            r7 = 1
            r6 = 0
            if (r12 == 0) goto La
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto Ld
        La:
            java.lang.String r0 = ""
            return r0
        Ld:
            java.lang.String r12 = processDot(r12)
            java.lang.String r0 = "#"
            java.lang.String r1 = ""
            java.lang.String r12 = r12.replace(r0, r1)
            java.lang.String r0 = "+"
            java.lang.String r1 = ""
            java.lang.String r8 = r12.replace(r0, r1)
            java.lang.String r0 = "第\\s*(\\d+)\\s*(?:集|话)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r1 = r0.find()
            if (r1 == 0) goto L58
            java.lang.String r0 = r0.group(r7)
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[%04d]"
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            goto L97
        L58:
            java.lang.String r0 = "."
            int r9 = r8.lastIndexOf(r0)
            if (r9 <= 0) goto L96
            java.lang.String r10 = r8.substring(r6, r9)
            java.lang.String r0 = "^\\d+$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L96
            int r0 = java.lang.Integer.parseInt(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[%04d]"
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.String r0 = java.lang.String.format(r2, r3)
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            goto L97
        L96:
            r1 = r8
        L97:
            if (r13 == 0) goto L9f
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto La0
        L9f:
            return r1
        La0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r13)
            java.lang.String r1 = r0.toString()
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A.l.format(java.lang.String, java.lang.String):java.lang.String");
    }

    private static String processDot(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return str;
        }
        return str.substring(0, iLastIndexOf).replaceAll("\\.", "·") + "." + str.substring(iLastIndexOf + 1);
    }
}
