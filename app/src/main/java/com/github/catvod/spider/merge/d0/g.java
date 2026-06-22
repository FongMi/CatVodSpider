package com.github.catvod.spider.merge.D0;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class g {
    private Serializable a;
    private int b;
    private j c;

    g(j jVar) {
        this.c = jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int a(boolean z, boolean z2) throws h {
        Serializable string;
        if (z2) {
            this.c.h--;
        }
        int iB = this.c.b(z);
        this.b = iB;
        switch (iB) {
            case 5:
                this.a = null;
                return this.b;
            case 6:
                string = Boolean.TRUE;
                this.a = string;
                return this.b;
            case 7:
                string = Boolean.FALSE;
                this.a = string;
                return this.b;
            case 8:
            case 12:
                string = this.c.l.toString();
                this.a = string;
                return this.b;
            case 9:
                String string2 = this.c.l.toString();
                try {
                    if (this.c.m) {
                        string = Double.valueOf(Double.parseDouble(string2));
                    } else if (string2.length() == 1) {
                        string = Integer.valueOf(string2.charAt(0) - '0');
                    } else if (string2.length() == 2 && string2.charAt(0) == '-') {
                        string = Integer.valueOf('0' - string2.charAt(1));
                    } else {
                        int i = string2.charAt(0) == '-' ? 1 : 0;
                        int length = i != 0 ? string2.length() - 1 : string2.length();
                        string = (length < 10 || (length == 10 && string2.charAt(i) < '2')) ? Integer.valueOf(Integer.parseInt(string2)) : (length < 19 || (length == 19 && string2.charAt(i) < '9')) ? Long.valueOf(Long.parseLong(string2)) : new BigInteger(string2);
                    }
                    this.a = string;
                    return this.b;
                } catch (NumberFormatException e) {
                    throw this.c.f(e, C1290c.a("Malformed number: ", string2), true);
                }
            case 10:
                e eVar = new e();
                if (a(true, false) != 3) {
                    do {
                        int i2 = this.b;
                        if (i2 == 5 || i2 == 6 || i2 == 7) {
                            this.a = this.a.toString();
                        } else if (i2 != 8 && i2 != 12) {
                            j jVar = this.c;
                            StringBuilder sbB = t0.b("Expected STRING, got ");
                            sbB.append(this.b);
                            throw jVar.f(null, sbB.toString(), true);
                        }
                        String str = (String) this.a;
                        if (this.b == 12) {
                            if (a(false, true) != 2) {
                                j jVar2 = this.c;
                                StringBuilder sbB2 = t0.b("Expected COLON, got ");
                                sbB2.append(this.b);
                                throw jVar2.f(null, sbB2.toString(), true);
                            }
                        } else if (a(false, false) != 2) {
                            j jVar3 = this.c;
                            StringBuilder sbB3 = t0.b("Expected COLON, got ");
                            sbB3.append(this.b);
                            throw jVar3.f(null, sbB3.toString(), true);
                        }
                        a(false, false);
                        eVar.put(str, c());
                        if (a(false, false) != 3) {
                            if (this.b != 1) {
                                j jVar4 = this.c;
                                StringBuilder sbB4 = t0.b("Expected a comma or end of the object instead of ");
                                sbB4.append(this.b);
                                throw jVar4.f(null, sbB4.toString(), true);
                            }
                        }
                    } while (a(true, false) != 3);
                    throw this.c.f(null, "Trailing object found in array", true);
                }
                this.a = eVar;
                this.b = 10;
                return 10;
            case 11:
                c cVar = new c();
                if (a(false, false) != 4) {
                    do {
                        cVar.add(c());
                        if (this.b == 12) {
                            throw this.c.f(null, "Semi-string is not allowed in array", true);
                        }
                        if (a(false, false) != 4) {
                            if (this.b != 1) {
                                j jVar5 = this.c;
                                StringBuilder sbB5 = t0.b("Expected a comma or end of the array instead of ");
                                sbB5.append(this.b);
                                throw jVar5.f(null, sbB5.toString(), true);
                            }
                        }
                    } while (a(false, false) != 4);
                    throw this.c.f(null, "Trailing comma found in array", true);
                }
                this.a = cVar;
                this.b = 11;
                return 11;
            default:
                return this.b;
        }
    }

    public static f<c> b() {
        return new f<>(c.class);
    }

    private Object c() throws h {
        if (this.b >= 5) {
            return this.a;
        }
        j jVar = this.c;
        StringBuilder sbB = t0.b("Expected JSON value, got ");
        sbB.append(this.b);
        throw jVar.f(null, sbB.toString(), true);
    }

    public static f<e> d() {
        return new f<>(e.class);
    }

    final <T> T e(Class<T> cls) throws h {
        a(false, false);
        Object objC = c();
        if (a(false, false) != 0) {
            j jVar = this.c;
            StringBuilder sbB = t0.b("Expected end of input, got ");
            sbB.append(this.b);
            throw jVar.f(null, sbB.toString(), true);
        }
        if (cls == Object.class || (objC != null && cls.isAssignableFrom(objC.getClass()))) {
            return cls.cast(objC);
        }
        j jVar2 = this.c;
        StringBuilder sbB2 = t0.b("JSON did not contain the correct type, expected ");
        sbB2.append(cls.getSimpleName());
        sbB2.append(".");
        throw jVar2.f(null, sbB2.toString(), true);
    }
}
