package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import com.github.catvod.spider.merge.bY.C0925t;
import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0711k extends AbstractC0715o {
    private final String a;

    C0711k(String str) {
        super(null);
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0715o
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
        return com.github.catvod.spider.merge.bY.v.b(C0925t.b(ZrJ.d("3A2C3B34193016372E291B310B223F282F3C59182D223A2818370D242D291D7E")), this.a, ZrJ.d("24"));
    }
}
