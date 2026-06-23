package com.github.catvod.spider.merge.A0;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class mp extends bp {
    public final String c;

    public mp(String str) {
        this.c = str;
    }

    @Override // com.github.catvod.spider.merge.A0.bp
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.bp
    public final boolean b(abe abeVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int i2 = 0;
        while (true) {
            String str2 = this.c;
            if (i2 >= str2.length()) {
                parsePosition.setIndex(parsePosition.getIndex() + str2.length());
                return true;
            }
            int index = parsePosition.getIndex() + i2;
            if (index == str.length()) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            if (str2.charAt(i2) != str.charAt(index)) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            i2++;
        }
    }

    public final String toString() {
        return "CopyQuotedStrategy [formatField=" + this.c + "]";
    }
}
