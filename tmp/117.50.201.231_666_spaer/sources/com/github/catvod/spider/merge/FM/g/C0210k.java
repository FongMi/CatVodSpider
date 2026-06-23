package com.github.catvod.spider.merge.FM.G;

import java.text.ParsePosition;
import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
final class C0210k extends AbstractC0214o {
    private final String a;

    C0210k(String str) {
        super(null);
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0214o
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
        return com.github.catvod.spider.merge.FM.b.v.b(com.github.catvod.spider.merge.FM.L.P.b("CopyQuotedStrategy [formatField="), this.a, "]");
    }
}
