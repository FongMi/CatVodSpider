package com.github.catvod.spider.merge.A0;

import java.text.ParsePosition;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ms extends bp {
    public Pattern g;

    @Override // com.github.catvod.spider.merge.A0.bp
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.A0.bp
    public final boolean b(abe abeVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        Matcher matcher = this.g.matcher(str.substring(parsePosition.getIndex()));
        if (!matcher.lookingAt()) {
            parsePosition.setErrorIndex(parsePosition.getIndex());
            return false;
        }
        parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
        f(calendar, matcher.group(1));
        return true;
    }

    public abstract void f(Calendar calendar, String str);

    public String toString() {
        return getClass().getSimpleName() + " [pattern=" + this.g + "]";
    }
}
