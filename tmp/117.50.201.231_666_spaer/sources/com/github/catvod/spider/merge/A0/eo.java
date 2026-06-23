package com.github.catvod.spider.merge.A0;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class eo extends bp {
    public final int c;

    public eo(int i) {
        this.c = i;
    }

    @Override // com.github.catvod.spider.merge.A0.bp
    public final boolean a() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.A0.bp
    public final boolean b(abe abeVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
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
        calendar.set(this.c, d(abeVar, i3));
        return true;
    }

    public int d(abe abeVar, int i) {
        return i;
    }

    public final String toString() {
        return "NumberStrategy [field=" + this.c + "]";
    }
}
