package com.github.catvod.spider.merge.y;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public enum V {
    CamelCase,
    /* JADX INFO: Fake field, exist only in values array */
    PascalCase,
    /* JADX INFO: Fake field, exist only in values array */
    SnakeCase,
    /* JADX INFO: Fake field, exist only in values array */
    KebabCase,
    /* JADX INFO: Fake field, exist only in values array */
    NoChange,
    NeverUseThisValueExceptDefaultValue;

    public final String a(String str) {
        int iOrdinal = ordinal();
        int i = 0;
        if (iOrdinal == 0) {
            char cCharAt = str.charAt(0);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        if (iOrdinal == 1) {
            char cCharAt2 = str.charAt(0);
            if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                return str;
            }
            char[] charArray2 = str.toCharArray();
            charArray2[0] = (char) (charArray2[0] - ' ');
            return new String(charArray2);
        }
        if (iOrdinal == 2) {
            StringBuilder sb = new StringBuilder();
            while (i < str.length()) {
                char cCharAt3 = str.charAt(i);
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    cCharAt3 = (char) (cCharAt3 + ' ');
                    if (i > 0) {
                        sb.append('_');
                    }
                }
                sb.append(cCharAt3);
                i++;
            }
            return sb.toString();
        }
        if (iOrdinal != 3) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i < str.length()) {
            char cCharAt4 = str.charAt(i);
            if (cCharAt4 >= 'A' && cCharAt4 <= 'Z') {
                cCharAt4 = (char) (cCharAt4 + ' ');
                if (i > 0) {
                    sb2.append('-');
                }
            }
            sb2.append(cCharAt4);
            i++;
        }
        return sb2.toString();
    }
}
