package com.github.catvod.spider.merge.A0;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class ado {
    public static final wv aa;
    public static final bb ab;
    public static final vl c;
    public static final ix d;
    public static final ix e;
    public static final ix f;
    public static final ix g;
    public static final wv h;
    public static final wv i;
    public static final wv j;
    public static final wm k;
    public static final ix l;
    public static final me m;
    public static final qs n;
    public static final jf o;
    public static final wv p;
    public static final wv q;
    public static final wv r;
    public static final wv s;
    public static final wv t;
    public static final wv u;
    public static final wv v;
    public static final wv w;
    public static final ct x;
    public static final wv y;
    public static final vd z;
    public static final wv a = new wv(Class.class, new rv(2, new ih()), 0);
    public static final wv b = new wv(BitSet.class, new rv(2, new acx()), 0);

    static {
        hu huVar = new hu();
        c = new vl();
        d = new ix(Boolean.TYPE, Boolean.class, huVar);
        e = new ix(Byte.TYPE, Byte.class, new adm());
        f = new ix(Short.TYPE, Short.class, new xq());
        g = new ix(Integer.TYPE, Integer.class, new ud());
        h = new wv(AtomicInteger.class, new rv(2, new yf()), 0);
        i = new wv(AtomicBoolean.class, new rv(2, new cb()), 0);
        j = new wv(AtomicIntegerArray.class, new rv(2, new kq()), 0);
        k = new wm();
        new hh();
        new mt();
        l = new ix(Character.TYPE, Character.class, new gb());
        nh nhVar = new nh();
        m = new me();
        n = new qs();
        o = new jf();
        p = new wv(String.class, nhVar, 0);
        q = new wv(StringBuilder.class, new vi(), 0);
        r = new wv(StringBuffer.class, new jg(), 0);
        s = new wv(URL.class, new hv(), 0);
        t = new wv(URI.class, new adl(), 0);
        u = new wv(InetAddress.class, new mu(), 1);
        v = new wv(UUID.class, new js(), 0);
        w = new wv(Currency.class, new rv(2, new vw()), 0);
        x = new ct(2, new gs());
        y = new wv(Locale.class, new abq(), 0);
        vd vdVar = new vd();
        z = vdVar;
        aa = new wv(il.class, vdVar, 1);
        ab = new bb();
    }
}
