package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
class C0713m extends AbstractC0715o {
    private final int a;

    C0713m(int i) {
        super(null);
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0715o
    final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0715o
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
        StringBuilder sbB = C0925t.b(ZrJ.d("3736262F2D372A37392C3C201E3A6B162E2C1C2F2F70"));
        sbB.append(this.a);
        sbB.append(ZrJ.d("24"));
        return sbB.toString();
    }
}
