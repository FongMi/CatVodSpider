package com.github.catvod.spider.merge.A0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class aag implements Closeable, Flushable {
    public static final Pattern a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] b = new String[128];
    public static final String[] c;
    public final Writer d;
    public int[] e;
    public int f;
    public aba g;
    public String h;
    public String i;
    public boolean j;
    public int k;
    public boolean l;
    public String m;
    public boolean n;

    static {
        for (int i = 0; i <= 31; i++) {
            b[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public aag(Writer writer) {
        int[] iArr = new int[32];
        this.e = iArr;
        this.f = 0;
        if (iArr.length == 0) {
            this.e = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.e;
        int i = this.f;
        this.f = i + 1;
        iArr2[i] = 6;
        this.k = 2;
        this.n = true;
        Objects.requireNonNull(writer, "out == null");
        this.d = writer;
        y(aba.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aa(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.l
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.github.catvod.spider.merge.A0.aag.c
            goto L9
        L7:
            java.lang.String[] r0 = com.github.catvod.spider.merge.A0.aag.b
        L9:
            java.io.Writer r1 = r8.d
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.aag.aa(java.lang.String):void");
    }

    public void ab(double d) throws IOException {
        ag();
        if (this.k == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            o();
            this.d.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void ac(long j) throws IOException {
        ag();
        o();
        this.d.write(Long.toString(j));
    }

    public void ad(Number number) throws IOException {
        if (number == null) {
            w();
            return;
        }
        ag();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !a.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.k != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        o();
        this.d.append((CharSequence) string);
    }

    public void ae(String str) throws IOException {
        if (str == null) {
            w();
            return;
        }
        ag();
        o();
        aa(str);
    }

    public void af(boolean z) throws IOException {
        ag();
        o();
        this.d.write(z ? "true" : "false");
    }

    public final void ag() throws IOException {
        if (this.m != null) {
            int iX = x();
            if (iX == 5) {
                this.d.write(this.i);
            } else if (iX != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            v();
            this.e[this.f - 1] = 4;
            aa(this.m);
            this.m = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
        int i = this.f;
        if (i > 1 || (i == 1 && this.e[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.d.flush();
    }

    public final void o() throws IOException {
        int iX = x();
        if (iX == 1) {
            this.e[this.f - 1] = 2;
            v();
            return;
        }
        Writer writer = this.d;
        if (iX == 2) {
            writer.append((CharSequence) this.i);
            v();
        } else {
            if (iX == 4) {
                writer.append((CharSequence) this.h);
                this.e[this.f - 1] = 5;
                return;
            }
            if (iX != 6) {
                if (iX != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.k != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.e[this.f - 1] = 7;
        }
    }

    public void p() throws IOException {
        ag();
        o();
        int i = this.f;
        int[] iArr = this.e;
        if (i == iArr.length) {
            this.e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        iArr2[i2] = 1;
        this.d.write(91);
    }

    public void q() throws IOException {
        ag();
        o();
        int i = this.f;
        int[] iArr = this.e;
        if (i == iArr.length) {
            this.e = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.e;
        int i2 = this.f;
        this.f = i2 + 1;
        iArr2[i2] = 3;
        this.d.write(123);
    }

    public final void r(char c2, int i, int i2) throws IOException {
        int iX = x();
        if (iX != i2 && iX != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.m != null) {
            throw new IllegalStateException("Dangling name: " + this.m);
        }
        this.f--;
        if (iX == i2) {
            v();
        }
        this.d.write(c2);
    }

    public void s() throws IOException {
        r(']', 1, 2);
    }

    public void t() throws IOException {
        r('}', 3, 5);
    }

    public void u(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.m != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iX = x();
        if (iX != 3 && iX != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.m = str;
    }

    public final void v() throws IOException {
        if (this.j) {
            return;
        }
        String str = this.g.b;
        Writer writer = this.d;
        writer.write(str);
        int i = this.f;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.g.c);
        }
    }

    public aag w() throws IOException {
        if (this.m != null) {
            if (!this.n) {
                this.m = null;
                return this;
            }
            ag();
        }
        o();
        this.d.write("null");
        return this;
    }

    public final int x() {
        int i = this.f;
        if (i != 0) {
            return this.e[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void y(aba abaVar) {
        Objects.requireNonNull(abaVar);
        this.g = abaVar;
        this.i = ",";
        if (abaVar.d) {
            this.h = ": ";
            if (abaVar.b.isEmpty()) {
                this.i = ", ";
            }
        } else {
            this.h = ":";
        }
        this.j = this.g.b.isEmpty() && this.g.c.isEmpty();
    }

    public final void z(int i) {
        if (i == 0) {
            throw null;
        }
        this.k = i;
    }
}
