package com.github.catvod.spider.merge.FM.G;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
class C0212m extends AbstractC0214o {
    private final int a;

    C0212m(int i) {
        super(null);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0214o
    final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0214o
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
        StringBuilder sbB = com.github.catvod.spider.merge.FM.L.P.b("NumberStrategy [field=");
        sbB.append(this.a);
        sbB.append("]");
        return sbB.toString();
    }
}
