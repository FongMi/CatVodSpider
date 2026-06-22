package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class L extends g0 {
    protected final e0 i;
    public final h0 j;
    private int k;
    private String l;
    private String m;
    private SimpleDateFormat n;
    protected IdentityHashMap<Object, c0> o;
    protected c0 p;
    protected TimeZone q;
    protected Locale r;

    public L() {
        this(new h0(), e0.i);
    }

    public L(h0 h0Var, e0 e0Var) {
        this.k = 0;
        this.l = "\t";
        this.o = null;
        this.q = AbstractC1412a.b;
        this.r = AbstractC1412a.c;
        this.j = h0Var;
        this.i = e0Var;
    }

    private DateFormat k(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, this.r);
        simpleDateFormat.setTimeZone(this.q);
        return simpleDateFormat;
    }

    public final boolean i(Object obj) {
        c0 c0Var;
        IdentityHashMap<Object, c0> identityHashMap = this.o;
        if (identityHashMap == null || (c0Var = identityHashMap.get(obj)) == null || obj == Collections.emptyMap()) {
            return false;
        }
        Object obj2 = c0Var.c;
        return obj2 == null || (obj2 instanceof Integer) || (obj2 instanceof String);
    }

    public final void j() {
        this.k--;
    }

    public final DateFormat l() {
        String str;
        if (this.n == null && (str = this.m) != null) {
            this.n = (SimpleDateFormat) k(str);
        }
        return this.n;
    }

    public final String m() {
        SimpleDateFormat simpleDateFormat = this.n;
        return simpleDateFormat instanceof SimpleDateFormat ? simpleDateFormat.toPattern() : this.m;
    }

    public final X n(Class<?> cls) {
        return this.i.e(cls);
    }

    public final void o() {
        this.k++;
    }

    public final boolean p(i0 i0Var) {
        return this.j.g(i0Var);
    }

    public final boolean q(Type type) {
        c0 c0Var;
        return this.j.g(i0.WriteClassName) && !(type == null && this.j.g(i0.NotWriteRootClassName) && ((c0Var = this.p) == null || c0Var.a == null));
    }

    public final void r() {
        this.j.write(10);
        for (int i = 0; i < this.k; i++) {
            this.j.write(this.l);
        }
    }

    public final void s(c0 c0Var, Object obj, Object obj2) {
        t(c0Var, obj, obj2, 0, 0);
    }

    public final void t(c0 c0Var, Object obj, Object obj2, int i, int i2) {
        if (this.j.i) {
            return;
        }
        this.p = new c0(c0Var, obj, obj2, i);
        if (this.o == null) {
            this.o = new IdentityHashMap<>();
        }
        this.o.put(obj, this.p);
    }

    public final String toString() {
        return this.j.toString();
    }

    public final void u(Object obj) {
        if (obj == null) {
            this.j.s();
            return;
        }
        try {
            n(obj.getClass()).d(this, obj, null, null, 0);
        } catch (IOException e) {
            throw new C1415d(e.getMessage(), e);
        }
    }

    public final void v(String str) {
        h0 h0Var = this.j;
        if (str == null) {
            h0Var.u(i0.WriteNullStringAsEmpty);
        } else {
            h0Var.v(str);
        }
    }

    public final void w() {
        this.j.s();
    }

    public final void x(Object obj) {
        h0 h0Var;
        String str;
        h0 h0Var2;
        String str2;
        c0 c0Var = this.p;
        if (obj == c0Var.b) {
            h0Var2 = this.j;
            str2 = "{\"$ref\":\"@\"}";
        } else {
            c0 c0Var2 = c0Var.a;
            if (c0Var2 == null || obj != c0Var2.b) {
                while (true) {
                    c0 c0Var3 = c0Var.a;
                    if (c0Var3 == null) {
                        break;
                    } else {
                        c0Var = c0Var3;
                    }
                }
                if (obj == c0Var.b) {
                    h0Var = this.j;
                    str = "{\"$ref\":\"$\"}";
                } else {
                    this.j.write("{\"$ref\":\"");
                    this.j.write(this.o.get(obj).toString());
                    h0Var = this.j;
                    str = "\"}";
                }
                h0Var.write(str);
                return;
            }
            h0Var2 = this.j;
            str2 = "{\"$ref\":\"..\"}";
        }
        h0Var2.write(str2);
    }

    public final void y(Object obj, Object obj2) {
        try {
            if (obj == null) {
                this.j.s();
            } else {
                n(obj.getClass()).d(this, obj, obj2, null, 0);
            }
        } catch (IOException e) {
            throw new C1415d(e.getMessage(), e);
        }
    }

    public final void z(Object obj, String str) {
        String strReplaceAll;
        String str2;
        if (obj instanceof Date) {
            if ("unixtime".equals(str)) {
                this.j.q((int) (((Date) obj).getTime() / 1000));
                return;
            }
            if ("millis".equals(str)) {
                this.j.r(((Date) obj).getTime());
                return;
            }
            if (this.n == null && (str2 = this.m) != null) {
                this.n = (SimpleDateFormat) k(str2);
            }
            DateFormat dateFormatK = this.n;
            if (dateFormatK == null) {
                if (str != null) {
                    try {
                        dateFormatK = k(str);
                    } catch (IllegalArgumentException unused) {
                        strReplaceAll = str.replaceAll("T", "'T'");
                        dateFormatK = k(strReplaceAll);
                    }
                } else {
                    strReplaceAll = AbstractC1412a.f;
                }
                dateFormatK = k(strReplaceAll);
            }
            this.j.v(dateFormatK.format((Date) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof Collection)) {
                u(obj);
                return;
            }
            Collection collection = (Collection) obj;
            Iterator it = collection.iterator();
            this.j.write(91);
            for (int i = 0; i < collection.size(); i++) {
                Object next = it.next();
                if (i != 0) {
                    this.j.write(44);
                }
                z(next, str);
            }
            this.j.write(93);
            return;
        }
        byte[] bArr = (byte[]) obj;
        if (!"gzip".equals(str) && !"gzip,base64".equals(str)) {
            if ("hex".equals(str)) {
                this.j.p(bArr);
                return;
            } else {
                this.j.h(bArr);
                return;
            }
        }
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gZIPOutputStream = bArr.length < 512 ? new GZIPOutputStream(byteArrayOutputStream, bArr.length) : new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                this.j.h(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                throw new C1415d("write gzipBytes error", e);
            }
        } finally {
            com.github.catvod.spider.merge.H.i.a(gZIPOutputStream);
        }
    }
}
