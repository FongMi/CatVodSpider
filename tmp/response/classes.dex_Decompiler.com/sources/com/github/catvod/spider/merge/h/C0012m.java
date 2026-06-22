package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.b.C0133t;
import com.github.catvod.spider.merge.oZP;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
class C0012m extends AbstractC0014o {
    private final int a;

    C0012m(int i) {
        super(null);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0014o
    final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0014o
    final boolean b(t tVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int index = parsePosition.getIndex();
        int length = str.length();
        if (i == 0) {
            while (index < length && Character.isWhitespace(str.charAt(index))) {
                index++;
            }
            parsePosition.setIndex(index);
        } else {
            int i2 = i + index;
            if (length > i2) {
                length = i2;
            }
        }
        while (index < length && Character.isDigit(str.charAt(index))) {
            index++;
        }
        if (parsePosition.getIndex() == index) {
            parsePosition.setErrorIndex(index);
            return false;
        }
        int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
        parsePosition.setIndex(index);
        calendar.set(this.a, c(tVar, i3));
        return true;
    }

    int c(t tVar, int i) {
        return i;
    }

    public final String toString() {
        StringBuilder sbC = C0133t.c(oZP.d("3B1A1A230927261B052018301216571A0A3C1003137C"));
        sbC.append(this.a);
        sbC.append(oZP.d("28"));
        return sbC.toString();
    }
}
