package com.github.catvod.spider.merge.H;

import com.github.catvod.spider.merge.oZP;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.H.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
abstract class AbstractC0013n extends AbstractC0014o {
    Pattern a;

    AbstractC0013n() {
        super(null);
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0014o
    final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.H.AbstractC0014o
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
        return getClass().getSimpleName() + oZP.d("553407201821101D197C") + this.a + oZP.d("28");
    }
}
