package com.github.catvod.spider.merge.FM.F;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public final class f extends b {
    private final HashMap<String, String> b = new HashMap<>();
    private final HashSet<Character> c = new HashSet<>();
    private final int d;
    private final int e;

    public f(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.github.catvod.spider.merge.FM.F.b
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.e;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.d) {
            String str = this.b.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
