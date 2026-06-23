package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class pn extends sd {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public pn(cd[] cdVarArr) {
        if (cdVarArr.length > 0) {
            this.b = EnumSet.copyOf((Collection) Arrays.asList(cdVarArr));
        } else {
            this.b = EnumSet.copyOf((Collection) Collections.singletonList(cd.a));
        }
    }

    public pn(sd[] sdVarArr) {
        this.b = (sd[]) ((Object[]) sdVarArr.clone());
    }

    @Override // com.github.catvod.spider.merge.A0.sd
    public final int c(String str, int i, StringWriter stringWriter) throws IOException {
        int i2;
        switch (this.a) {
            case 0:
                for (sd sdVar : (sd[]) this.b) {
                    int iC = sdVar.c(str, i, stringWriter);
                    if (iC != 0) {
                        return iC;
                    }
                }
                return 0;
            default:
                int length = str.length();
                if (str.charAt(i) != '&' || i >= length - 2 || str.charAt(i + 1) != '#') {
                    return 0;
                }
                int i3 = i + 2;
                char cCharAt = str.charAt(i3);
                if (cCharAt == 'x' || cCharAt == 'X') {
                    i3 = i + 3;
                    if (i3 == length) {
                        return 0;
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i4 = i3;
                while (i4 < length && ((str.charAt(i4) >= '0' && str.charAt(i4) <= '9') || ((str.charAt(i4) >= 'a' && str.charAt(i4) <= 'f') || (str.charAt(i4) >= 'A' && str.charAt(i4) <= 'F')))) {
                    i4++;
                }
                int i5 = (i4 == length || str.charAt(i4) != ';') ? 0 : 1;
                if (i5 == 0) {
                    cd cdVar = cd.a;
                    EnumSet enumSet = (EnumSet) this.b;
                    if (enumSet != null && enumSet.contains(cdVar)) {
                        return 0;
                    }
                    cd cdVar2 = cd.b;
                    if (enumSet != null && enumSet.contains(cdVar2)) {
                        throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                    }
                }
                try {
                    int i6 = i2 != 0 ? Integer.parseInt(str.subSequence(i3, i4).toString(), 16) : Integer.parseInt(str.subSequence(i3, i4).toString(), 10);
                    if (i6 > 65535) {
                        char[] chars = Character.toChars(i6);
                        stringWriter.write(chars[0]);
                        stringWriter.write(chars[1]);
                    } else {
                        stringWriter.write(i6);
                    }
                    return ((i4 + 2) - i3) + i2 + i5;
                } catch (NumberFormatException unused) {
                    return 0;
                }
        }
    }
}
