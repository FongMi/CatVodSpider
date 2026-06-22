package com.github.catvod.spider.merge.HN;

import com.github.catvod.spider.merge.ZrJ;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.HN.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0714n extends AbstractC0715o {
    Pattern a;

    AbstractC0714n() {
        super(null);
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0715o
    final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.HN.AbstractC0715o
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
        return getClass().getSimpleName() + ZrJ.d("59183B2C3C311C312570") + this.a + ZrJ.d("24");
    }
}
