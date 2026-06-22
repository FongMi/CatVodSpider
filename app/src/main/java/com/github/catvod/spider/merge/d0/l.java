package com.github.catvod.spider.merge.D0;

import com.github.catvod.spider.merge.D0.l;
import com.github.catvod.spider.merge.I.t0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class l<SELF extends l<SELF>> {
    private static final char[] i = {'n', 'u', 'l', 'l'};
    private static final char[] j = {'t', 'r', 'u', 'e'};
    private static final char[] k = {'f', 'a', 'l', 's', 'e'};
    private static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] m = {'\\', 'u', '0', '0'};
    private static final char[] n = {'\\', 'u'};
    protected final Appendable a;
    private boolean f;
    private BitSet c = new BitSet();
    private int d = 0;
    private boolean e = true;
    private int h = 0;
    private String g = null;
    private final StringBuilder b = new StringBuilder(10240);

    l(Appendable appendable) {
        this.a = appendable;
    }

    private void a() {
        p('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 34
            r7.p(r0)
            r1 = 0
            r2 = 0
            r3 = 0
        L8:
            int r4 = r8.length()
            if (r2 >= r4) goto La6
            char r4 = r8.charAt(r2)
            r5 = 12
            if (r4 == r5) goto L9e
            r5 = 13
            if (r4 == r5) goto L9b
            r5 = 92
            if (r4 == r0) goto L94
            r6 = 47
            if (r4 == r6) goto L90
            if (r4 == r5) goto L94
            switch(r4) {
                case 8: goto L8a;
                case 9: goto L87;
                case 10: goto L84;
                default: goto L27;
            }
        L27:
            r3 = 32
            if (r4 < r3) goto L3e
            r3 = 128(0x80, float:1.8E-43)
            if (r4 < r3) goto L33
            r3 = 160(0xa0, float:2.24E-43)
            if (r4 < r3) goto L3e
        L33:
            r3 = 8192(0x2000, float:1.148E-41)
            if (r4 < r3) goto L3c
            r3 = 8448(0x2100, float:1.1838E-41)
            if (r4 >= r3) goto L3c
            goto L3e
        L3c:
            r3 = 0
            goto L3f
        L3e:
            r3 = 1
        L3f:
            if (r3 == 0) goto L97
            r3 = 256(0x100, float:3.59E-43)
            if (r4 >= r3) goto L5a
            char[] r3 = com.github.catvod.spider.merge.D0.l.m
            r7.r(r3)
            char[] r3 = com.github.catvod.spider.merge.D0.l.l
            int r5 = r4 >> 4
            r5 = r5 & 15
            char r5 = r3[r5]
            r7.p(r5)
            r5 = r4 & 15
            char r3 = r3[r5]
            goto L80
        L5a:
            char[] r3 = com.github.catvod.spider.merge.D0.l.n
            r7.r(r3)
            char[] r3 = com.github.catvod.spider.merge.D0.l.l
            int r5 = r4 >> 12
            r5 = r5 & 15
            char r5 = r3[r5]
            r7.p(r5)
            int r5 = r4 >> 8
            r5 = r5 & 15
            char r5 = r3[r5]
            r7.p(r5)
            int r5 = r4 >> 4
            r5 = r5 & 15
            char r5 = r3[r5]
            r7.p(r5)
            r5 = r4 & 15
            char r3 = r3[r5]
        L80:
            r7.p(r3)
            goto La1
        L84:
            java.lang.String r3 = "\\n"
            goto L8c
        L87:
            java.lang.String r3 = "\\t"
            goto L8c
        L8a:
            java.lang.String r3 = "\\b"
        L8c:
            r7.q(r3)
            goto La1
        L90:
            r6 = 60
            if (r3 != r6) goto L97
        L94:
            r7.p(r5)
        L97:
            r7.p(r4)
            goto La1
        L9b:
            java.lang.String r3 = "\\r"
            goto L8c
        L9e:
            java.lang.String r3 = "\\f"
            goto L8c
        La1:
            int r2 = r2 + 1
            r3 = r4
            goto L8
        La6:
            r7.p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D0.l.f(java.lang.String):void");
    }

    private void h() {
        try {
            this.a.append(this.b.toString());
            this.b.setLength(0);
        } catch (IOException e) {
            throw new m(e);
        }
    }

    private void m() {
        if (this.e) {
            this.e = false;
            return;
        }
        if (this.d == 0) {
            throw new m("Invalid call to emit a value in a finished JSON writer");
        }
        p(',');
        if (this.g == null || !this.f) {
            return;
        }
        a();
    }

    private void n() {
        if (this.f) {
            throw new m("Invalid call to emit a keyless value while writing an object");
        }
        m();
    }

    private void o(String str) {
        if (!this.f) {
            throw new m("Invalid call to emit a key value while not writing an object");
        }
        m();
        if (this.g != null) {
            for (int i2 = 0; i2 < this.h; i2++) {
                q(this.g);
            }
        }
        f(str);
        p(':');
    }

    private void p(char c) {
        this.b.append(c);
        if (this.b.length() > 10240) {
            h();
        }
    }

    private void q(String str) {
        this.b.append(str);
        if (this.b.length() > 10240) {
            h();
        }
    }

    private void r(char[] cArr) {
        this.b.append(cArr);
        if (this.b.length() > 10240) {
            h();
        }
    }

    public final SELF b() {
        n();
        BitSet bitSet = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        bitSet.set(i2, this.f);
        this.f = false;
        this.e = true;
        p('[');
        return this;
    }

    public SELF c(String str) {
        o(str);
        BitSet bitSet = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        bitSet.set(i2, this.f);
        this.f = false;
        this.e = true;
        p('[');
        return this;
    }

    public final SELF d(String str, Collection<?> collection) {
        if (str == null) {
            b();
        } else {
            c(str);
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        g();
        return this;
    }

    protected final void e() {
        if (this.d > 0) {
            throw new m("Unclosed JSON objects and/or arrays when closing writer");
        }
        if (this.e) {
            throw new m("Nothing was written to the JSON writer");
        }
        h();
    }

    public SELF g() {
        char c;
        if (this.d == 0) {
            throw new m("Invalid call to end()");
        }
        if (this.f) {
            if (this.g != null) {
                this.h--;
                a();
                for (int i2 = 0; i2 < this.h; i2++) {
                    q(this.g);
                }
            }
            c = '}';
        } else {
            c = ']';
        }
        p(c);
        this.e = false;
        BitSet bitSet = this.c;
        int i3 = this.d - 1;
        this.d = i3;
        this.f = bitSet.get(i3);
        return this;
    }

    public final SELF i(String str) {
        o(str);
        r(i);
        return this;
    }

    public SELF j() {
        n();
        BitSet bitSet = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        bitSet.set(i2, this.f);
        this.f = true;
        this.e = true;
        p('{');
        if (this.g != null) {
            this.h++;
            a();
        }
        return this;
    }

    public SELF k(String str) {
        o(str);
        BitSet bitSet = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        bitSet.set(i2, this.f);
        this.f = true;
        this.e = true;
        p('{');
        if (this.g != null) {
            this.h++;
            a();
        }
        return this;
    }

    public final SELF l(String str, Map<?, ?> map) {
        if (str == null) {
            j();
        } else {
            k(str);
        }
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (!(entry.getKey() instanceof String)) {
                StringBuilder sbB = t0.b("Invalid key type for map: ");
                sbB.append(entry.getKey() == null ? "null" : entry.getKey().getClass());
                throw new m(sbB.toString());
            }
            String str2 = (String) entry.getKey();
            if (value == null) {
                i(str2);
            } else if (value instanceof String) {
                u(str2, (String) value);
            } else if (value instanceof Number) {
                o(str2);
                q(((Number) value).toString());
            } else if (value instanceof Boolean) {
                v(str2, ((Boolean) value).booleanValue());
            } else if (value instanceof Collection) {
                d(str2, (Collection) value);
            } else if (value instanceof Map) {
                l(str2, (Map) value);
            } else {
                if (!value.getClass().isArray()) {
                    StringBuilder sbB2 = t0.b("Unable to handle type: ");
                    sbB2.append(value.getClass());
                    throw new m(sbB2.toString());
                }
                int length = Array.getLength(value);
                c(str2);
                for (int i2 = 0; i2 < length; i2++) {
                    t(Array.get(value, i2));
                }
                g();
            }
        }
        g();
        return this;
    }

    public l s() {
        o("utcOffsetMinutes");
        q(Integer.toString(0));
        return this;
    }

    public final SELF t(Object obj) {
        if (obj == null) {
            n();
            r(i);
            return this;
        }
        if (obj instanceof String) {
            n();
            f((String) obj);
            return this;
        }
        if (obj instanceof Number) {
            n();
            q(((Number) obj).toString());
            return this;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            n();
            r(zBooleanValue ? j : k);
            return this;
        }
        if (obj instanceof Collection) {
            d(null, (Collection) obj);
            return this;
        }
        if (obj instanceof Map) {
            l(null, (Map) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            StringBuilder sbB = t0.b("Unable to handle type: ");
            sbB.append(obj.getClass());
            throw new m(sbB.toString());
        }
        int length = Array.getLength(obj);
        b();
        for (int i2 = 0; i2 < length; i2++) {
            t(Array.get(obj, i2));
        }
        g();
        return this;
    }

    public SELF u(String str, String str2) {
        if (str2 == null) {
            i(str);
            return this;
        }
        o(str);
        f(str2);
        return this;
    }

    public SELF v(String str, boolean z) {
        o(str);
        r(z ? j : k);
        return this;
    }
}
