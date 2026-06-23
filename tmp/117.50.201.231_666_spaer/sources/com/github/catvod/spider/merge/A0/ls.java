package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ls extends sd {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public final int d;
    public final int e;

    public ls(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.a.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.b.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.A0.sd
    public final int c(String str, int i, StringWriter stringWriter) throws IOException {
        if (!this.b.contains(Character.valueOf(str.charAt(i)))) {
            return 0;
        }
        int length = this.e;
        if (i + length > str.length()) {
            length = str.length() - i;
        }
        while (length >= this.d) {
            String str2 = (String) this.a.get(str.subSequence(i, i + length).toString());
            if (str2 != null) {
                stringWriter.write(str2);
                return length;
            }
            length--;
        }
        return 0;
    }
}
