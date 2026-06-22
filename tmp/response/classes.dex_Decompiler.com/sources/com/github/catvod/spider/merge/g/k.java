package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public final class k extends b {
    @Override // com.github.catvod.spider.merge.G.b
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        int i2;
        int i3;
        if (charSequence.charAt(i) != '\\' || (i2 = i + 1) >= charSequence.length() || charSequence.charAt(i2) != 'u') {
            return 0;
        }
        int i4 = 2;
        while (true) {
            i3 = i + i4;
            if (i3 >= charSequence.length() || charSequence.charAt(i3) != 'u') {
                break;
            }
            i4++;
        }
        if (i3 < charSequence.length() && charSequence.charAt(i3) == '+') {
            i4++;
        }
        int i5 = i + i4;
        int i6 = i5 + 4;
        if (i6 > charSequence.length()) {
            StringBuilder sbC = C0133t.c(oZP.d("390A04324C211D0E196158751D0A0F61083C120603324C3C1B4F022F05361A0B12611A34191A127B4C72"));
            sbC.append((Object) charSequence.subSequence(i, charSequence.length()));
            sbC.append(oZP.d("524F13340975010057240231550011612F3D141D24241D2010011424"));
            throw new IllegalArgumentException(sbC.toString());
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i5, i6);
        try {
            writer.write((char) Integer.parseInt(charSequenceSubSequence.toString(), 16));
            return i4 + 4;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(oZP.d("200116230030551B18611C34071C1261193B1C0C18250975030E1B34096F55") + ((Object) charSequenceSubSequence), e);
        }
    }
}
