package com.github.catvod.spider.merge.FM.G;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.FM.G.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
abstract class AbstractC0213n extends AbstractC0214o {
    Pattern a;

    AbstractC0213n() {
        super(null);
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0214o
    final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.FM.G.AbstractC0214o
    final boolean b(t tVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.a.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        c(calendar, matcher.group(1));
        return true;
    }

    abstract void c(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.a + "]";
    }
}
