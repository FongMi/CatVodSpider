package com.github.catvod.spider.merge;

import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ჼ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0586 extends AbstractC0108 {

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private final HashMap<String, String> f1301 = new HashMap<>();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final HashSet<Character> f1302 = new HashSet<>();

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final int f1303;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private final int f1304;

    public C0586(CharSequence[]... charSequenceArr) {
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        if (charSequenceArr != null) {
            int i3 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.f1301.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.f1302.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i2 = length < i2 ? length : i2;
                if (length > i3) {
                    i3 = length;
                }
            }
            i = i3;
        }
        this.f1303 = i2;
        this.f1304 = i;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0108
    /* JADX INFO: renamed from: Ԩ */
    public int mo363(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.f1302.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f1304;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f1303) {
            String str = this.f1301.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                writer.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
