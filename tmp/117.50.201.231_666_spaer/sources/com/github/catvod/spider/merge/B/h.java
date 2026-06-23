package com.github.catvod.spider.merge.B;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class h extends b {
    private final EnumSet<a> b;

    public enum a {
        semiColonRequired,
        /* JADX INFO: Fake field, exist only in values array */
        semiColonOptional,
        errorIfNoSemiColon
    }

    public h(a... aVarArr) {
        this.b = EnumSet.copyOf((Collection) (aVarArr.length > 0 ? Arrays.asList(aVarArr) : Collections.singletonList(a.semiColonRequired)));
    }

    @Override // com.github.catvod.spider.merge.B.b
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int length = charSequence.length();
        if (charSequence.charAt(i) == '&' && i < length - 2 && charSequence.charAt(i + 1) == '#') {
            int i3 = i + 2;
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i3++;
                if (i3 == length) {
                    return 0;
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            int i4 = i3;
            while (i4 < length && ((charSequence.charAt(i4) >= '0' && charSequence.charAt(i4) <= '9') || ((charSequence.charAt(i4) >= 'a' && charSequence.charAt(i4) <= 'f') || (charSequence.charAt(i4) >= 'A' && charSequence.charAt(i4) <= 'F')))) {
                i4++;
            }
            int i5 = (i4 == length || charSequence.charAt(i4) != ';') ? 0 : 1;
            if (i5 == 0) {
                a aVar = a.semiColonRequired;
                EnumSet<a> enumSet = this.b;
                if (enumSet != null && enumSet.contains(aVar)) {
                    return 0;
                }
                a aVar2 = a.errorIfNoSemiColon;
                EnumSet<a> enumSet2 = this.b;
                if (enumSet2 != null && enumSet2.contains(aVar2)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            try {
                int i6 = i2 != 0 ? Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 16) : Integer.parseInt(charSequence.subSequence(i3, i4).toString(), 10);
                int i7 = i6;
                if (i6 > 65535) {
                    char[] chars = Character.toChars(i6);
                    writer.write(chars[0]);
                    i7 = chars[1];
                }
                writer.write(i7);
                return ((i4 + 2) - i3) + i2 + i5;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
