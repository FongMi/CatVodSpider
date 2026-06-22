package com.github.catvod.spider.merge.H;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public class h extends j {
    public final int a;

    public h(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.H.j
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.H.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
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
        calendar.set(this.a, c(nVar, i3));
        return true;
    }

    public final String toString() {
        return "NumberStrategy [field=" + this.a + "]";
    }

    public int c(n nVar, int i) {
        return i;
    }
}
