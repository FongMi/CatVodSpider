package com.github.catvod.spider.merge.KW;

import com.github.catvod.spider.merge.ZrJ;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class t0 {
    public AbstractC0825m a;

    static {
        Collections.unmodifiableList(Arrays.asList(ZrJ.d("300D1D0C040C3D"), ZrJ.d("3C131804040A37"), ZrJ.d("2B02050A0D"), ZrJ.d("2B160708"), ZrJ.d("29110E09010638170E"), ZrJ.d("38170400"), ZrJ.d("38001F04070B"), ZrJ.d("2A061F"), ZrJ.d("370C1F121B002D"), ZrJ.d("2E0A07090B042B07"), ZrJ.d("29110E0E0D013C0D0808")));
        Collections.unmodifiableMap(new s0());
    }

    protected t0(AbstractC0825m abstractC0825m) {
        if (abstractC0825m == null) {
            throw new NullPointerException(ZrJ.d("0D22392A2D3159202A23262A0D632928682B0C2F2763"));
        }
        this.a = abstractC0825m;
    }

    public abstract int a();

    public boolean b() {
        return this instanceof C0827o;
    }

    public com.github.catvod.spider.merge.Bk.k c() {
        return null;
    }

    public abstract boolean d(int i, int i2);
}
