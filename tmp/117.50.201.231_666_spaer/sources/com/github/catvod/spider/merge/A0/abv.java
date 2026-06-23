package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abv implements Serializable {
    public final Pattern a;

    public abv(String str) {
        Pattern patternCompile = Pattern.compile(str);
        ko.e("compile(...)", patternCompile);
        this.a = patternCompile;
    }

    public final String toString() {
        String string = this.a.toString();
        ko.e("toString(...)", string);
        return string;
    }
}
