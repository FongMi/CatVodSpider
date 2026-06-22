package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
final class C0010k extends AbstractC0014o {
    private final String a;

    C0010k(String str) {
        super(null);
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0014o
    final boolean b(t tVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        for (int i2 = 0; i2 < this.a.length(); i2++) {
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (this.a.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
        }
        parsePosition.setIndex(parsePosition.getIndex() + this.a.length());
        return true;
    }

    public final String toString() {
        return C0133t.a(C0133t.c(oZP.d("360007383D201A1B12253F21070E03240B2C5534112E1E38141B312809391152")), this.a, oZP.d("28"));
    }
}
