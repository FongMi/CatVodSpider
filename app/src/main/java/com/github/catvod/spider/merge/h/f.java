package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.A.T;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class f extends j {
    public final String a;

    public f(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.H.j
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.H.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int i2 = 0;
        while (true) {
            String str2 = this.a;
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
        return T.h(new StringBuilder("CopyQuotedStrategy [formatField="), this.a, "]");
    }
}
