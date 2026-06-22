package com.github.catvod.spider.merge.f1;

import java.io.CharArrayWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.security.AccessController;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.f1.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC1125d2 extends RuntimeException {
    private static final Pattern h = Pattern.compile("_c_(.*)_\\d+");
    private static int i;
    private String b;
    private int c;
    private String d;
    private int e;
    Object f;
    int[] g;

    static {
        int i2 = 1;
        i = 1;
        String property = System.getProperty("rhino.stack.style");
        if (property != null) {
            if (!"Rhino".equalsIgnoreCase(property)) {
                if ("Mozilla".equalsIgnoreCase(property)) {
                    i2 = 2;
                } else if (!"V8".equalsIgnoreCase(property)) {
                    return;
                } else {
                    i2 = 4;
                }
            }
            i = i2;
        }
    }

    AbstractC1125d2() {
        InterfaceC1095K interfaceC1095KD = C1185v.d();
        if (interfaceC1095KD != null) {
            interfaceC1095KD.c(this);
        }
    }

    AbstractC1125d2(String str) {
        super(str);
        InterfaceC1095K interfaceC1095KD = C1185v.d();
        if (interfaceC1095KD != null) {
            interfaceC1095KD.c(this);
        }
    }

    static String b(m2[] m2VarArr, String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = (String) AccessController.doPrivileged(new q2());
        if (i == 4 && !"null".equals(str)) {
            sb.append(str);
            sb.append(str2);
        }
        for (m2 m2Var : m2VarArr) {
            int iC = com.github.catvod.spider.merge.y.z.c(i);
            if (iC == 0) {
                m2Var.b(sb);
            } else if (iC != 1) {
                if (iC == 2) {
                    m2Var.c(sb);
                    sb.append('\n');
                } else if (iC == 3) {
                    m2Var.d(sb);
                }
            } else {
                m2Var.c(sb);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private String c() {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        super.printStackTrace(new PrintWriter(charArrayWriter));
        String string = charArrayWriter.toString();
        InterfaceC1095K interfaceC1095KD = C1185v.d();
        if (interfaceC1095KD != null) {
            return interfaceC1095KD.d(this, string);
        }
        return null;
    }

    public String a() {
        return super.getMessage();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.f1.m2[] d(int r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.f1.AbstractC1125d2.d(int, java.lang.String):com.github.catvod.spider.merge.f1.m2[]");
    }

    public final void e(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.valueOf(i2));
        }
        if (this.c > 0) {
            throw new IllegalStateException();
        }
        this.c = i2;
    }

    public final void f(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.b != null) {
            throw new IllegalStateException();
        }
        this.b = str;
    }

    public final int g() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strA = a();
        if (this.b == null || this.c <= 0) {
            return strA;
        }
        StringBuilder sb = new StringBuilder(strA);
        sb.append(" (");
        sb.append(this.b);
        if (this.c > 0) {
            sb.append('#');
            sb.append(this.c);
        }
        sb.append(')');
        return sb.toString();
    }

    public final String h() {
        return this.d;
    }

    final void i(String str, int i2, String str2, int i3) {
        if (i2 == -1) {
            i2 = 0;
        }
        if (str != null) {
            f(str);
        }
        if (i2 != 0) {
            e(i2);
        }
        if (str2 != null) {
            if (this.d != null) {
                throw new IllegalStateException();
            }
            this.d = str2;
        }
        if (i3 != 0) {
            if (i3 <= 0) {
                throw new IllegalArgumentException(String.valueOf(i3));
            }
            if (this.e > 0) {
                throw new IllegalStateException();
            }
            this.e = i3;
        }
    }

    public final String j() {
        return this.b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        if (this.f == null) {
            super.printStackTrace(printStream);
        } else {
            printStream.print(c());
        }
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        if (this.f == null) {
            super.printStackTrace(printWriter);
        } else {
            printWriter.print(c());
        }
    }
}
