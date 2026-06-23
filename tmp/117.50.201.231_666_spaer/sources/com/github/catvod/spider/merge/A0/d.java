package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class d {
    public static final pn a;

    static {
        ls lsVar = new ls(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        String[][] strArr = ey.i;
        sd[] sdVarArr = {new ls((String[][]) strArr.clone())};
        sd[] sdVarArr2 = new sd[2];
        sdVarArr2[0] = lsVar;
        System.arraycopy(sdVarArr, 0, sdVarArr2, 1, 1);
        pn pnVar = new pn(sdVarArr2);
        sd[] sdVarArr3 = {new aal(0)};
        sd[] sdVarArr4 = new sd[2];
        sdVarArr4[0] = pnVar;
        System.arraycopy(sdVarArr3, 0, sdVarArr4, 1, 1);
        a = new pn(new sd[]{new ls(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new ls((String[][]) strArr.clone()), new aal(0)});
        String[][] strArr2 = ey.e;
        ls lsVar2 = new ls((String[][]) strArr2.clone());
        String[][] strArr3 = ey.g;
        ls lsVar3 = new ls((String[][]) strArr2.clone());
        String[][] strArr4 = ey.a;
        new pn(new sd[]{new aaq(0), new aaq(1), new ls((String[][]) ey.j.clone()), new ls(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""})});
        String[][] strArr5 = ey.f;
        ls lsVar4 = new ls((String[][]) strArr5.clone());
        String[][] strArr6 = ey.b;
    }

    public static final String b(String str) {
        pn pnVar = a;
        pnVar.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iC = pnVar.c(str, iCharCount, stringWriter);
                if (iC == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iC; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
