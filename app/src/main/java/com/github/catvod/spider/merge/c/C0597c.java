package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0597c {
    static final String c = com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.b.class);
    static final String d = com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.f.class);
    public final com.github.catvod.spider.merge.H.b a;
    protected final AtomicLong b = new AtomicLong();

    public C0597c(ClassLoader classLoader) {
        this.a = (com.github.catvod.spider.merge.H.b) classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.github.catvod.spider.merge.C.C0596b r12, com.github.catvod.spider.merge.A.i r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.C0597c.a(com.github.catvod.spider.merge.C.b, com.github.catvod.spider.merge.A.i, boolean):void");
    }

    private void b(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar) {
        Constructor<?> constructor = c0596b.d.c;
        if (Modifier.isPublic(constructor.getModifiers())) {
            iVar.l(187, com.github.catvod.spider.merge.H.c.f(c0596b.i()));
            iVar.e(89);
            iVar.k(183, com.github.catvod.spider.merge.H.c.f(constructor.getDeclaringClass()), "<init>", "()V");
        } else {
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 0);
            iVar.c(180, com.github.catvod.spider.merge.H.c.f(q.class), "clazz", "Ljava/lang/Class;");
            iVar.k(183, com.github.catvod.spider.merge.H.c.f(q.class), "createInstance", C1290c.b(t0.b("(L"), c, ";Ljava/lang/reflect/Type;)Ljava/lang/Object;"));
            iVar.l(192, com.github.catvod.spider.merge.H.c.f(c0596b.i()));
        }
        iVar.m(58, c0596b.k("instance"));
    }

    private void c(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, Class<?> cls, int i) {
        i(c0596b, iVar, eVar);
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
        if ((eVar.k & com.github.catvod.spider.merge.B.c.SupportArrayToBean.b) != 0) {
            iVar.e(89);
            iVar.l(193, com.github.catvod.spider.merge.H.c.f(q.class));
            iVar.g(153, gVar);
            iVar.l(192, com.github.catvod.spider.merge.H.c.f(q.class));
            iVar.m(25, 1);
            if (eVar.g instanceof Class) {
                iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(eVar.f)));
            } else {
                iVar.m(25, 0);
                iVar.i(Integer.valueOf(i));
                iVar.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }
            iVar.i(eVar.b);
            iVar.i(Integer.valueOf(eVar.k));
            iVar.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "deserialze", C1290c.b(t0.b("(L"), c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;"));
            iVar.l(192, com.github.catvod.spider.merge.H.c.f(cls));
            iVar.m(58, c0596b.l(eVar));
            iVar.g(167, gVar2);
            iVar.h(gVar);
        }
        iVar.m(25, 1);
        if (eVar.g instanceof Class) {
            iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(eVar.f)));
        } else {
            iVar.m(25, 0);
            iVar.i(Integer.valueOf(i));
            iVar.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
        }
        iVar.i(eVar.b);
        iVar.k(185, com.github.catvod.spider.merge.H.c.f(w.class), "deserialze", C1290c.b(t0.b("(L"), c, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        iVar.l(192, com.github.catvod.spider.merge.H.c.f(cls));
        iVar.m(58, c0596b.l(eVar));
        iVar.h(gVar2);
    }

    private void d(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.A.g gVar) {
        iVar.f(21, c0596b.k("matchedCount"));
        iVar.g(158, gVar);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, d, "token", "()I");
        iVar.i(13);
        iVar.g(160, gVar);
        l(c0596b, iVar);
    }

    private void e(com.github.catvod.spider.merge.A.d dVar, C0596b c0596b) {
        Class<com.github.catvod.spider.merge.B.p> cls;
        Class<q> cls2;
        String str;
        int i;
        C0597c c0597c;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int iL;
        int i2;
        int i3;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i4;
        int iL2;
        Class<com.github.catvod.spider.merge.B.p> cls3 = com.github.catvod.spider.merge.B.p.class;
        Class<q> cls4 = q.class;
        String str13 = "(L";
        StringBuilder sbB = t0.b("(L");
        String str14 = c;
        com.github.catvod.spider.merge.A.i iVar = new com.github.catvod.spider.merge.A.i(dVar, "deserialzeArrayMapping", C1290c.b(sbB, str14, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"), null);
        p(c0596b, iVar);
        iVar.m(25, c0596b.k("lexer"));
        iVar.m(25, 1);
        iVar.k(182, str14, "getSymbolTable", "()" + com.github.catvod.spider.merge.H.c.b(cls3));
        String str15 = d;
        StringBuilder sbB2 = t0.b("(");
        sbB2.append(com.github.catvod.spider.merge.H.c.b(cls3));
        sbB2.append(")Ljava/lang/String;");
        iVar.k(182, str15, "scanTypeName", sbB2.toString());
        com.github.catvod.spider.merge.A.g gVarA = C0595a.a(iVar, 58, c0596b.k("typeName"));
        iVar.m(25, c0596b.k("typeName"));
        iVar.g(198, gVarA);
        iVar.m(25, 1);
        iVar.k(182, str14, "getConfig", "()" + com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.o.class));
        iVar.m(25, 0);
        iVar.c(180, com.github.catvod.spider.merge.H.c.f(cls4), "beanInfo", com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.H.l.class));
        iVar.m(25, c0596b.k("typeName"));
        String strF = com.github.catvod.spider.merge.H.c.f(cls4);
        StringBuilder sbB3 = t0.b("(");
        sbB3.append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.o.class));
        sbB3.append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.H.l.class));
        sbB3.append("Ljava/lang/String;)");
        sbB3.append(com.github.catvod.spider.merge.H.c.b(cls4));
        iVar.k(184, strF, "getSeeAlso", sbB3.toString());
        iVar.m(58, c0596b.k("userTypeDeser"));
        iVar.m(25, c0596b.k("userTypeDeser"));
        iVar.l(193, com.github.catvod.spider.merge.H.c.f(cls4));
        iVar.g(153, gVarA);
        iVar.m(25, c0596b.k("userTypeDeser"));
        iVar.m(25, 1);
        iVar.m(25, 2);
        iVar.m(25, 3);
        iVar.m(25, 4);
        iVar.k(182, com.github.catvod.spider.merge.H.c.f(cls4), "deserialzeArrayMapping", t0.a("(L", str14, ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"));
        iVar.e(176);
        iVar.h(gVarA);
        b(c0596b, iVar);
        com.github.catvod.spider.merge.H.e[] eVarArr = c0596b.d.i;
        int length = eVarArr.length;
        C0597c c0597c2 = this;
        int i5 = 0;
        while (true) {
            C0597c c0597c3 = c0597c2;
            if (i5 >= length) {
                c0597c3.a(c0596b, iVar, false);
                com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
                com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
                com.github.catvod.spider.merge.A.g gVar3 = new com.github.catvod.spider.merge.A.g();
                com.github.catvod.spider.merge.A.g gVar4 = new com.github.catvod.spider.merge.A.g();
                iVar.m(25, c0596b.k("lexer"));
                String str16 = d;
                iVar.k(182, str16, "getCurrent", "()C");
                iVar.e(89);
                iVar.m(54, c0596b.k("ch"));
                iVar.m(16, 44);
                iVar.g(160, gVar2);
                iVar.m(25, c0596b.k("lexer"));
                iVar.k(182, str16, "next", "()C");
                iVar.e(87);
                iVar.m(25, c0596b.k("lexer"));
                iVar.i(16);
                iVar.k(182, str16, "setToken", "(I)V");
                iVar.g(167, gVar4);
                iVar.h(gVar2);
                iVar.m(21, c0596b.k("ch"));
                iVar.m(16, 93);
                iVar.g(160, gVar3);
                iVar.m(25, c0596b.k("lexer"));
                iVar.k(182, str16, "next", "()C");
                iVar.e(87);
                iVar.m(25, c0596b.k("lexer"));
                iVar.i(15);
                iVar.k(182, str16, "setToken", "(I)V");
                iVar.g(167, gVar4);
                iVar.h(gVar3);
                iVar.m(21, c0596b.k("ch"));
                iVar.m(16, 26);
                iVar.g(160, gVar);
                iVar.m(25, c0596b.k("lexer"));
                iVar.k(182, str16, "next", "()C");
                iVar.e(87);
                iVar.m(25, c0596b.k("lexer"));
                iVar.i(20);
                iVar.k(182, str16, "setToken", "(I)V");
                iVar.g(167, gVar4);
                iVar.h(gVar);
                iVar.m(25, c0596b.k("lexer"));
                iVar.i(16);
                iVar.k(182, str16, "nextToken", "(I)V");
                iVar.h(gVar4);
                iVar.m(25, c0596b.k("instance"));
                iVar.e(176);
                iVar.j(5, c0596b.a);
                return;
            }
            boolean z = i5 == length + (-1);
            int i6 = z ? 93 : 44;
            int i7 = length;
            com.github.catvod.spider.merge.H.e eVar = eVarArr[i5];
            com.github.catvod.spider.merge.H.e[] eVarArr2 = eVarArr;
            Class<?> cls5 = eVar.f;
            Type type = eVar.g;
            int i8 = i5;
            if (cls5 == Byte.TYPE || cls5 == Short.TYPE || cls5 == Integer.TYPE) {
                cls = cls3;
                cls2 = cls4;
                str = str13;
                i = i8;
                iVar.m(25, c0596b.k("lexer"));
                iVar.m(16, i6);
                iVar.k(182, d, "scanInt", "(C)I");
                iVar.m(54, c0596b.l(eVar));
                c0597c2 = c0597c3;
            } else {
                String str17 = str13;
                cls2 = cls4;
                if (cls5 == Byte.class) {
                    iVar.m(25, c0596b.k("lexer"));
                    iVar.m(16, i6);
                    str10 = d;
                    iVar.k(182, str10, "scanInt", "(C)I");
                    str11 = "java/lang/Byte";
                    str12 = "(B)Ljava/lang/Byte;";
                } else if (cls5 == Short.class) {
                    iVar.m(25, c0596b.k("lexer"));
                    iVar.m(16, i6);
                    str10 = d;
                    iVar.k(182, str10, "scanInt", "(C)I");
                    str11 = "java/lang/Short";
                    str12 = "(S)Ljava/lang/Short;";
                } else if (cls5 == Integer.class) {
                    iVar.m(25, c0596b.k("lexer"));
                    iVar.m(16, i6);
                    str10 = d;
                    iVar.k(182, str10, "scanInt", "(C)I");
                    str11 = "java/lang/Integer";
                    str12 = "(I)Ljava/lang/Integer;";
                } else {
                    if (cls5 == Long.TYPE) {
                        iVar.m(25, c0596b.k("lexer"));
                        iVar.m(16, i6);
                        iVar.k(182, d, "scanLong", "(C)J");
                        i4 = 55;
                    } else if (cls5 == Long.class) {
                        iVar.m(25, c0596b.k("lexer"));
                        iVar.m(16, i6);
                        str10 = d;
                        iVar.k(182, str10, "scanLong", "(C)J");
                        str11 = "java/lang/Long";
                        str12 = "(J)Ljava/lang/Long;";
                    } else {
                        if (cls5 == Boolean.TYPE) {
                            iVar.m(25, c0596b.k("lexer"));
                            iVar.m(16, i6);
                            str7 = d;
                            str8 = "scanBoolean";
                            str9 = "(C)Z";
                            i3 = 182;
                        } else if (cls5 == Float.TYPE) {
                            iVar.m(25, c0596b.k("lexer"));
                            iVar.m(16, i6);
                            iVar.k(182, d, "scanFloat", "(C)F");
                            i4 = 56;
                            iL2 = c0596b.l(eVar);
                            iVar.m(i4, iL2);
                            c0597c = this;
                            str2 = str17;
                            cls = cls3;
                            str3 = str2;
                            i = i8;
                            c0597c2 = c0597c;
                            str = str3;
                        } else if (cls5 == Float.class) {
                            iVar.m(25, c0596b.k("lexer"));
                            iVar.m(16, i6);
                            str10 = d;
                            iVar.k(182, str10, "scanFloat", "(C)F");
                            str11 = "java/lang/Float";
                            str12 = "(F)Ljava/lang/Float;";
                        } else if (cls5 == Double.TYPE) {
                            iVar.m(25, c0596b.k("lexer"));
                            iVar.m(16, i6);
                            iVar.k(182, d, "scanDouble", "(C)D");
                            i4 = 57;
                        } else if (cls5 == Double.class) {
                            iVar.m(25, c0596b.k("lexer"));
                            iVar.m(16, i6);
                            str10 = d;
                            iVar.k(182, str10, "scanDouble", "(C)D");
                            str11 = "java/lang/Double";
                            str12 = "(D)Ljava/lang/Double;";
                        } else if (cls5 == Character.TYPE) {
                            iVar.m(25, c0596b.k("lexer"));
                            iVar.m(16, i6);
                            i3 = 182;
                            iVar.k(182, d, "scanString", "(C)Ljava/lang/String;");
                            iVar.e(3);
                            str7 = "java/lang/String";
                            str8 = "charAt";
                            str9 = "(I)C";
                        } else {
                            if (cls5 == String.class) {
                                iVar.m(25, c0596b.k("lexer"));
                                iVar.m(16, i6);
                                str4 = d;
                                str5 = "scanString";
                                str6 = "(C)Ljava/lang/String;";
                            } else if (cls5 == BigDecimal.class) {
                                iVar.m(25, c0596b.k("lexer"));
                                iVar.m(16, i6);
                                str4 = d;
                                str5 = "scanDecimal";
                                str6 = "(C)Ljava/math/BigDecimal;";
                            } else if (cls5 == Date.class) {
                                iVar.m(25, c0596b.k("lexer"));
                                iVar.m(16, i6);
                                str4 = d;
                                str5 = "scanDate";
                                str6 = "(C)Ljava/util/Date;";
                            } else if (cls5 == UUID.class) {
                                iVar.m(25, c0596b.k("lexer"));
                                iVar.m(16, i6);
                                str4 = d;
                                str5 = "scanUUID";
                                str6 = "(C)Ljava/util/UUID;";
                            } else {
                                if (cls5.isEnum()) {
                                    com.github.catvod.spider.merge.A.g gVar5 = new com.github.catvod.spider.merge.A.g();
                                    com.github.catvod.spider.merge.A.g gVar6 = new com.github.catvod.spider.merge.A.g();
                                    com.github.catvod.spider.merge.A.g gVar7 = new com.github.catvod.spider.merge.A.g();
                                    com.github.catvod.spider.merge.A.g gVar8 = new com.github.catvod.spider.merge.A.g();
                                    iVar.m(25, c0596b.k("lexer"));
                                    String str18 = d;
                                    iVar.k(182, str18, "getCurrent", "()C");
                                    iVar.e(89);
                                    iVar.m(54, c0596b.k("ch"));
                                    iVar.i(110);
                                    iVar.g(159, gVar8);
                                    iVar.m(21, c0596b.k("ch"));
                                    iVar.i(34);
                                    iVar.g(160, gVar5);
                                    iVar.h(gVar8);
                                    iVar.m(25, c0596b.k("lexer"));
                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls5)));
                                    iVar.m(25, 1);
                                    String str19 = c;
                                    StringBuilder sbB4 = t0.b("()");
                                    sbB4.append(com.github.catvod.spider.merge.H.c.b(cls3));
                                    iVar.k(182, str19, "getSymbolTable", sbB4.toString());
                                    iVar.m(16, i6);
                                    iVar.k(182, str18, "scanEnum", "(Ljava/lang/Class;" + com.github.catvod.spider.merge.H.c.b(cls3) + "C)Ljava/lang/Enum;");
                                    iVar.g(167, gVar7);
                                    iVar.h(gVar5);
                                    iVar.m(21, c0596b.k("ch"));
                                    iVar.i(48);
                                    iVar.g(161, gVar6);
                                    iVar.m(21, c0596b.k("ch"));
                                    iVar.i(57);
                                    iVar.g(163, gVar6);
                                    c0597c = this;
                                    c0597c.i(c0596b, iVar, eVar);
                                    iVar.l(192, com.github.catvod.spider.merge.H.c.f(j.class));
                                    iVar.m(25, c0596b.k("lexer"));
                                    iVar.m(16, i6);
                                    iVar.k(182, str18, "scanInt", "(C)I");
                                    iVar.k(182, com.github.catvod.spider.merge.H.c.f(j.class), "valueOf", "(I)Ljava/lang/Enum;");
                                    iVar.g(167, gVar7);
                                    iVar.h(gVar6);
                                    iVar.m(25, 0);
                                    iVar.m(25, c0596b.k("lexer"));
                                    iVar.m(16, i6);
                                    str2 = str17;
                                    iVar.k(182, com.github.catvod.spider.merge.H.c.f(cls2), "scanEnum", t0.a(str2, str18, ";C)Ljava/lang/Enum;"));
                                    iVar.h(gVar7);
                                    iVar.l(192, com.github.catvod.spider.merge.H.c.f(cls5));
                                    iVar.m(58, c0596b.l(eVar));
                                } else {
                                    c0597c = this;
                                    str2 = str17;
                                    if (Collection.class.isAssignableFrom(cls5)) {
                                        Class<?> clsI = com.github.catvod.spider.merge.H.A.I(type);
                                        if (clsI == String.class) {
                                            if (cls5 == List.class || cls5 == Collections.class || cls5 == ArrayList.class) {
                                                iVar.l(187, com.github.catvod.spider.merge.H.c.f(ArrayList.class));
                                                iVar.e(89);
                                                iVar.k(183, com.github.catvod.spider.merge.H.c.f(ArrayList.class), "<init>", "()V");
                                            } else {
                                                iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls5)));
                                                iVar.k(184, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.H.A.class), "createCollection", "(Ljava/lang/Class;)Ljava/util/Collection;");
                                            }
                                            iVar.m(58, c0596b.l(eVar));
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.m(25, c0596b.l(eVar));
                                            iVar.m(16, i6);
                                            String str20 = d;
                                            iVar.k(182, str20, "scanStringArray", "(Ljava/util/Collection;C)V");
                                            com.github.catvod.spider.merge.A.g gVar9 = new com.github.catvod.spider.merge.A.g();
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.c(180, str20, "matchStat", "I");
                                            iVar.i(5);
                                            iVar.g(160, gVar9);
                                            iVar.e(1);
                                            iVar.m(58, c0596b.l(eVar));
                                            iVar.h(gVar9);
                                        } else {
                                            com.github.catvod.spider.merge.A.g gVar10 = new com.github.catvod.spider.merge.A.g();
                                            iVar.m(25, c0596b.k("lexer"));
                                            String str21 = d;
                                            iVar.k(182, str21, "token", "()I");
                                            iVar.m(54, c0596b.k("token"));
                                            iVar.m(21, c0596b.k("token"));
                                            int i9 = i8 == 0 ? 14 : 16;
                                            iVar.i(Integer.valueOf(i9));
                                            iVar.g(159, gVar10);
                                            iVar.m(25, 1);
                                            iVar.i(Integer.valueOf(i9));
                                            String str22 = c;
                                            cls = cls3;
                                            iVar.k(182, str22, "throwException", "(I)V");
                                            iVar.h(gVar10);
                                            com.github.catvod.spider.merge.A.g gVar11 = new com.github.catvod.spider.merge.A.g();
                                            com.github.catvod.spider.merge.A.g gVar12 = new com.github.catvod.spider.merge.A.g();
                                            str3 = str2;
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.k(182, str21, "getCurrent", "()C");
                                            iVar.m(16, 91);
                                            iVar.g(160, gVar11);
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.k(182, str21, "next", "()C");
                                            iVar.e(87);
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.i(14);
                                            iVar.k(182, str21, "setToken", "(I)V");
                                            iVar.g(167, gVar12);
                                            iVar.h(gVar11);
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.i(14);
                                            iVar.k(182, str21, "nextToken", "(I)V");
                                            iVar.h(gVar12);
                                            i = i8;
                                            c0597c.j(iVar, cls5, i, false);
                                            iVar.e(89);
                                            iVar.m(58, c0596b.l(eVar));
                                            c0597c.h(c0596b, iVar, eVar, clsI);
                                            iVar.m(25, 1);
                                            iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(clsI)));
                                            iVar.m(25, 3);
                                            String strF2 = com.github.catvod.spider.merge.H.c.f(cls2);
                                            StringBuilder sbB5 = t0.b("(Ljava/util/Collection;");
                                            sbB5.append(com.github.catvod.spider.merge.H.c.b(w.class));
                                            sbB5.append("L");
                                            sbB5.append(str22);
                                            sbB5.append(";Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                                            iVar.k(184, strF2, "parseArray", sbB5.toString());
                                        }
                                    } else {
                                        cls = cls3;
                                        str3 = str2;
                                        i = i8;
                                        if (cls5.isArray()) {
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.i(14);
                                            iVar.k(182, d, "nextToken", "(I)V");
                                            iVar.m(25, 1);
                                            iVar.m(25, 0);
                                            iVar.i(Integer.valueOf(i));
                                            iVar.k(182, com.github.catvod.spider.merge.H.c.f(cls2), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                                            iVar.k(182, c, "parseObject", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");
                                            iVar.l(192, com.github.catvod.spider.merge.H.c.f(cls5));
                                            iVar.m(58, c0596b.l(eVar));
                                        } else {
                                            com.github.catvod.spider.merge.A.g gVar13 = new com.github.catvod.spider.merge.A.g();
                                            com.github.catvod.spider.merge.A.g gVar14 = new com.github.catvod.spider.merge.A.g();
                                            if (cls5 == Date.class) {
                                                iVar.m(25, c0596b.k("lexer"));
                                                String str23 = d;
                                                iVar.k(182, str23, "getCurrent", "()C");
                                                iVar.i(49);
                                                iVar.g(160, gVar13);
                                                iVar.l(187, com.github.catvod.spider.merge.H.c.f(Date.class));
                                                iVar.e(89);
                                                iVar.m(25, c0596b.k("lexer"));
                                                iVar.m(16, i6);
                                                iVar.k(182, str23, "scanLong", "(C)J");
                                                iVar.k(183, com.github.catvod.spider.merge.H.c.f(Date.class), "<init>", "(J)V");
                                                iVar.m(58, c0596b.l(eVar));
                                                iVar.g(167, gVar14);
                                            }
                                            iVar.h(gVar13);
                                            c0597c.k(c0596b, iVar, 14);
                                            c(c0596b, iVar, eVar, cls5, i);
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.k(182, d, "token", "()I");
                                            iVar.i(15);
                                            iVar.g(159, gVar14);
                                            iVar.m(25, 0);
                                            iVar.m(25, c0596b.k("lexer"));
                                            iVar.i(Integer.valueOf(!z ? 16 : 15));
                                            String strF3 = com.github.catvod.spider.merge.H.c.f(cls2);
                                            StringBuilder sbB6 = t0.b("(");
                                            sbB6.append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.d.class));
                                            sbB6.append("I)V");
                                            iVar.k(183, strF3, "check", sbB6.toString());
                                            iVar.h(gVar14);
                                        }
                                    }
                                    c0597c2 = c0597c;
                                    str = str3;
                                }
                                cls = cls3;
                                str3 = str2;
                                i = i8;
                                c0597c2 = c0597c;
                                str = str3;
                            }
                            iVar.k(182, str4, str5, str6);
                            iL = c0596b.l(eVar);
                            i2 = 58;
                            iVar.m(i2, iL);
                            c0597c = this;
                            str2 = str17;
                            cls = cls3;
                            str3 = str2;
                            i = i8;
                            c0597c2 = c0597c;
                            str = str3;
                        }
                        iVar.k(i3, str7, str8, str9);
                        iL = c0596b.l(eVar);
                        i2 = 54;
                        iVar.m(i2, iL);
                        c0597c = this;
                        str2 = str17;
                        cls = cls3;
                        str3 = str2;
                        i = i8;
                        c0597c2 = c0597c;
                        str = str3;
                    }
                    iL2 = c0596b.m(eVar);
                    iVar.m(i4, iL2);
                    c0597c = this;
                    str2 = str17;
                    cls = cls3;
                    str3 = str2;
                    i = i8;
                    c0597c2 = c0597c;
                    str = str3;
                }
                iVar.k(184, str11, "valueOf", str12);
                com.github.catvod.spider.merge.A.g gVarA2 = C0595a.a(iVar, 58, c0596b.l(eVar));
                iVar.m(25, c0596b.k("lexer"));
                iVar.c(180, str10, "matchStat", "I");
                iVar.i(5);
                iVar.g(160, gVarA2);
                iVar.e(1);
                iVar.m(58, c0596b.l(eVar));
                iVar.h(gVarA2);
                c0597c = this;
                str2 = str17;
                cls = cls3;
                str3 = str2;
                i = i8;
                c0597c2 = c0597c;
                str = str3;
            }
            i5 = i + 1;
            str13 = str;
            length = i7;
            eVarArr = eVarArr2;
            cls3 = cls;
            cls4 = cls2;
        }
    }

    private void f(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.A.g gVar, com.github.catvod.spider.merge.H.e eVar, Class<?> cls, Class<?> cls2, int i) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3;
        String str4;
        int i4;
        com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
        String str5 = d;
        iVar.k(182, str5, "matchField", "([C)Z");
        iVar.g(153, gVar2);
        n(iVar, c0596b, i);
        com.github.catvod.spider.merge.A.g gVar3 = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str5, "token", "()I");
        iVar.i(8);
        iVar.g(160, gVar3);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(16);
        iVar.k(182, str5, "nextToken", "(I)V");
        iVar.g(167, gVar2);
        iVar.h(gVar3);
        com.github.catvod.spider.merge.A.g gVar4 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar5 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar6 = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str5, "token", "()I");
        iVar.i(21);
        iVar.g(160, gVar5);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(14);
        iVar.k(182, str5, "nextToken", "(I)V");
        j(iVar, cls, i, true);
        iVar.g(167, gVar4);
        iVar.h(gVar5);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str5, "token", "()I");
        iVar.i(14);
        iVar.g(159, gVar6);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str5, "token", "()I");
        iVar.i(12);
        iVar.g(160, gVar);
        j(iVar, cls, i, false);
        iVar.m(58, c0596b.l(eVar));
        h(c0596b, iVar, eVar, cls2);
        iVar.m(25, 1);
        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
        iVar.e(3);
        iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        String strF = com.github.catvod.spider.merge.H.c.f(w.class);
        StringBuilder sbB = t0.b("(L");
        String str6 = c;
        iVar.k(185, strF, "deserialze", C1290c.b(sbB, str6, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        iVar.m(58, c0596b.k("list_item_value"));
        iVar.m(25, c0596b.l(eVar));
        iVar.m(25, c0596b.k("list_item_value"));
        if (cls.isInterface()) {
            str = "list_item_value";
            iVar.k(185, com.github.catvod.spider.merge.H.c.f(cls), "add", "(Ljava/lang/Object;)Z");
        } else {
            str = "list_item_value";
            iVar.k(182, com.github.catvod.spider.merge.H.c.f(cls), "add", "(Ljava/lang/Object;)Z");
        }
        iVar.e(87);
        iVar.g(167, gVar2);
        iVar.h(gVar6);
        j(iVar, cls, i, false);
        iVar.h(gVar4);
        iVar.m(58, c0596b.l(eVar));
        boolean zI = com.github.catvod.spider.merge.B.o.i(eVar.f);
        h(c0596b, iVar, eVar, cls2);
        if (zI) {
            iVar.k(185, com.github.catvod.spider.merge.H.c.f(w.class), "getFastMatchToken", "()I");
            iVar.m(54, c0596b.k("fastMatchToken"));
            iVar.m(25, c0596b.k("lexer"));
            iVar.m(21, c0596b.k("fastMatchToken"));
            str2 = "(I)V";
            str3 = "nextToken";
            iVar.k(182, str5, str3, str2);
        } else {
            str2 = "(I)V";
            str3 = "nextToken";
            iVar.e(87);
            iVar.i(12);
            iVar.m(54, c0596b.k("fastMatchToken"));
            k(c0596b, iVar, 12);
        }
        iVar.m(25, 1);
        iVar.k(182, str6, "getContext", "()" + com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.k.class));
        iVar.m(58, c0596b.k("listContext"));
        iVar.m(25, 1);
        iVar.m(25, c0596b.l(eVar));
        iVar.i(eVar.b);
        iVar.k(182, str6, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)" + com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.k.class));
        iVar.e(87);
        com.github.catvod.spider.merge.A.g gVar7 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar8 = new com.github.catvod.spider.merge.A.g();
        iVar.e(3);
        String str7 = str3;
        String str8 = str2;
        iVar.m(54, c0596b.k("i"));
        iVar.h(gVar7);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str5, "token", "()I");
        iVar.i(15);
        iVar.g(159, gVar8);
        iVar.m(25, 0);
        iVar.c(180, c0596b.e, C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.m(25, 1);
        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
        iVar.m(21, c0596b.k("i"));
        iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        iVar.k(185, com.github.catvod.spider.merge.H.c.f(w.class), "deserialze", t0.a("(L", str6, ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;"));
        String str9 = str;
        iVar.m(58, c0596b.k(str9));
        iVar.d(c0596b.k("i"));
        iVar.m(25, c0596b.l(eVar));
        iVar.m(25, c0596b.k(str9));
        if (cls.isInterface()) {
            iVar.k(185, com.github.catvod.spider.merge.H.c.f(cls), "add", "(Ljava/lang/Object;)Z");
            i3 = 87;
            i2 = 182;
        } else {
            i2 = 182;
            iVar.k(182, com.github.catvod.spider.merge.H.c.f(cls), "add", "(Ljava/lang/Object;)Z");
            i3 = 87;
        }
        iVar.e(i3);
        iVar.m(25, 1);
        iVar.m(25, c0596b.l(eVar));
        iVar.k(i2, str6, "checkListResolve", "(Ljava/util/Collection;)V");
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(i2, str5, "token", "()I");
        iVar.i(16);
        iVar.g(160, gVar7);
        if (zI) {
            iVar.m(25, c0596b.k("lexer"));
            iVar.m(21, c0596b.k("fastMatchToken"));
            iVar.k(i2, str5, str7, str8);
            i4 = 167;
            str4 = str6;
        } else {
            str4 = str6;
            k(c0596b, iVar, 12);
            i4 = 167;
        }
        iVar.g(i4, gVar7);
        iVar.h(gVar8);
        iVar.m(25, 1);
        iVar.m(25, c0596b.k("listContext"));
        iVar.k(182, str4, "setContext", "(" + com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.k.class) + ")V");
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str5, "token", "()I");
        iVar.i(15);
        iVar.g(160, gVar);
        l(c0596b, iVar);
        iVar.h(gVar2);
    }

    private void g(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, Class cls, int i) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, c0596b.k("lexer"));
        iVar.m(25, 0);
        iVar.c(180, c0596b.e, c0596b.h(eVar), "[C");
        iVar.k(182, d, "matchField", "([C)Z");
        iVar.g(154, gVar);
        iVar.e(1);
        iVar.m(58, c0596b.l(eVar));
        iVar.g(167, gVar2);
        iVar.h(gVar);
        n(iVar, c0596b, i);
        iVar.m(21, c0596b.k("matchedCount"));
        iVar.e(4);
        iVar.e(96);
        iVar.m(54, c0596b.k("matchedCount"));
        c(c0596b, iVar, eVar, cls, i);
        iVar.m(25, 1);
        String str = c;
        iVar.k(182, str, "getResolveStatus", "()I");
        iVar.i(1);
        iVar.g(160, gVar2);
        iVar.m(25, 1);
        iVar.k(182, str, "getLastResolveTask", "()" + com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.a.class));
        iVar.m(58, c0596b.k("resolveTask"));
        iVar.m(25, c0596b.k("resolveTask"));
        iVar.m(25, 1);
        iVar.k(182, str, "getContext", "()" + com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.k.class));
        iVar.c(181, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.a.class), "ownerContext", com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.k.class));
        iVar.m(25, c0596b.k("resolveTask"));
        iVar.m(25, 0);
        iVar.i(eVar.b);
        String strF = com.github.catvod.spider.merge.H.c.f(q.class);
        StringBuilder sbB = t0.b("(Ljava/lang/String;)");
        sbB.append(com.github.catvod.spider.merge.H.c.b(n.class));
        iVar.k(182, strF, "getFieldDeserializer", sbB.toString());
        iVar.c(181, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.a.class), "fieldDeserializer", com.github.catvod.spider.merge.H.c.b(n.class));
        iVar.m(25, 1);
        iVar.i(0);
        iVar.k(182, str, "setResolveStatus", "(I)V");
        iVar.h(gVar2);
    }

    private void h(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, Class<?> cls) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, 0);
        iVar.c(180, c0596b.e, C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.g(199, gVar);
        iVar.m(25, 0);
        iVar.m(25, 1);
        String str = c;
        StringBuilder sbB = t0.b("()");
        sbB.append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.o.class));
        iVar.k(182, str, "getConfig", sbB.toString());
        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls)));
        String strF = com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.o.class);
        StringBuilder sbB2 = t0.b("(Ljava/lang/reflect/Type;)");
        sbB2.append(com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.k(182, strF, "getDeserializer", sbB2.toString());
        iVar.c(181, c0596b.e, C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.h(gVar);
        iVar.m(25, 0);
        iVar.c(180, c0596b.e, C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_deser__"), com.github.catvod.spider.merge.H.c.b(w.class));
    }

    private void i(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, 0);
        iVar.c(180, c0596b.e, c0596b.g(eVar), com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.g(199, gVar);
        iVar.m(25, 0);
        iVar.m(25, 1);
        String str = c;
        StringBuilder sbB = t0.b("()");
        sbB.append(com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.o.class));
        iVar.k(182, str, "getConfig", sbB.toString());
        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(eVar.f)));
        String strF = com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.B.o.class);
        StringBuilder sbB2 = t0.b("(Ljava/lang/reflect/Type;)");
        sbB2.append(com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.k(182, strF, "getDeserializer", sbB2.toString());
        iVar.c(181, c0596b.e, c0596b.g(eVar), com.github.catvod.spider.merge.H.c.b(w.class));
        iVar.h(gVar);
        iVar.m(25, 0);
        iVar.c(180, c0596b.e, c0596b.g(eVar), com.github.catvod.spider.merge.H.c.b(w.class));
    }

    private void j(com.github.catvod.spider.merge.A.i iVar, Class<?> cls, int i, boolean z) {
        Class cls2;
        String strF;
        if (!cls.isAssignableFrom(ArrayList.class) || z) {
            if (!cls.isAssignableFrom(LinkedList.class) || z) {
                if (cls.isAssignableFrom(HashSet.class)) {
                    iVar.l(187, com.github.catvod.spider.merge.H.c.f(HashSet.class));
                    iVar.e(89);
                    cls2 = HashSet.class;
                } else if (cls.isAssignableFrom(TreeSet.class)) {
                    iVar.l(187, com.github.catvod.spider.merge.H.c.f(TreeSet.class));
                    iVar.e(89);
                    cls2 = TreeSet.class;
                } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                    iVar.l(187, com.github.catvod.spider.merge.H.c.f(LinkedHashSet.class));
                    iVar.e(89);
                    cls2 = LinkedHashSet.class;
                } else {
                    if (!z) {
                        iVar.m(25, 0);
                        iVar.i(Integer.valueOf(i));
                        iVar.k(182, com.github.catvod.spider.merge.H.c.f(q.class), "getFieldType", "(I)Ljava/lang/reflect/Type;");
                        iVar.k(184, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.H.A.class), "createCollection", "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
                    }
                    iVar.l(187, com.github.catvod.spider.merge.H.c.f(HashSet.class));
                    iVar.e(89);
                    cls2 = HashSet.class;
                }
                iVar.l(192, com.github.catvod.spider.merge.H.c.f(cls));
            }
            iVar.l(187, com.github.catvod.spider.merge.H.c.f(LinkedList.class));
            iVar.e(89);
            cls2 = LinkedList.class;
            strF = com.github.catvod.spider.merge.H.c.f(cls2);
        } else {
            strF = "java/util/ArrayList";
            iVar.l(187, "java/util/ArrayList");
            iVar.e(89);
        }
        iVar.k(183, strF, "<init>", "()V");
        iVar.l(192, com.github.catvod.spider.merge.H.c.f(cls));
    }

    private void k(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar, int i) {
        int i2;
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, c0596b.k("lexer"));
        String str = d;
        iVar.k(182, str, "getCurrent", "()C");
        if (i == 12) {
            i2 = 123;
        } else {
            if (i != 14) {
                throw new IllegalStateException();
            }
            i2 = 91;
        }
        iVar.m(16, i2);
        iVar.g(160, gVar);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str, "next", "()C");
        iVar.e(87);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(Integer.valueOf(i));
        iVar.k(182, str, "setToken", "(I)V");
        iVar.g(167, gVar2);
        iVar.h(gVar);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(Integer.valueOf(i));
        iVar.k(182, str, "nextToken", "(I)V");
        iVar.h(gVar2);
    }

    private void l(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar3 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar4 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar5 = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, c0596b.k("lexer"));
        String str = d;
        iVar.k(182, str, "getCurrent", "()C");
        iVar.e(89);
        iVar.m(54, c0596b.k("ch"));
        iVar.m(16, 44);
        iVar.g(160, gVar2);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str, "next", "()C");
        iVar.e(87);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(16);
        iVar.k(182, str, "setToken", "(I)V");
        iVar.g(167, gVar5);
        iVar.h(gVar2);
        iVar.m(21, c0596b.k("ch"));
        iVar.m(16, 125);
        iVar.g(160, gVar3);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str, "next", "()C");
        iVar.e(87);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(13);
        iVar.k(182, str, "setToken", "(I)V");
        iVar.g(167, gVar5);
        iVar.h(gVar3);
        iVar.m(21, c0596b.k("ch"));
        iVar.m(16, 93);
        iVar.g(160, gVar4);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str, "next", "()C");
        iVar.e(87);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(15);
        iVar.k(182, str, "setToken", "(I)V");
        iVar.g(167, gVar5);
        iVar.h(gVar4);
        iVar.m(21, c0596b.k("ch"));
        iVar.m(16, 26);
        iVar.g(160, gVar);
        iVar.m(25, c0596b.k("lexer"));
        iVar.i(20);
        iVar.k(182, str, "setToken", "(I)V");
        iVar.g(167, gVar5);
        iVar.h(gVar);
        iVar.m(25, c0596b.k("lexer"));
        iVar.k(182, str, "nextToken", "()V");
        iVar.h(gVar5);
    }

    private void m(com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar) {
        Method method = eVar.c;
        if (method == null) {
            iVar.c(181, com.github.catvod.spider.merge.H.c.f(eVar.h), eVar.d.getName(), com.github.catvod.spider.merge.H.c.b(eVar.f));
            return;
        }
        iVar.k(method.getDeclaringClass().isInterface() ? 185 : 182, com.github.catvod.spider.merge.H.c.f(eVar.h), method.getName(), com.github.catvod.spider.merge.H.c.c(method));
        if (eVar.c.getReturnType().equals(Void.TYPE)) {
            return;
        }
        iVar.e(87);
    }

    private void n(com.github.catvod.spider.merge.A.i iVar, C0596b c0596b, int i) {
        StringBuilder sbB = t0.b("_asm_flag_");
        sbB.append(i / 32);
        String string = sbB.toString();
        iVar.m(21, c0596b.k(string));
        iVar.i(Integer.valueOf(1 << i));
        iVar.e(128);
        iVar.m(54, c0596b.k(string));
    }

    private void p(C0596b c0596b, com.github.catvod.spider.merge.A.i iVar) {
        iVar.m(25, 1);
        iVar.c(180, c, "lexer", com.github.catvod.spider.merge.H.c.b(com.github.catvod.spider.merge.B.d.class));
        iVar.l(192, d);
        iVar.m(58, c0596b.k("lexer"));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b39 A[PHI: r9 r12 r13 r14 r20 r21 r22 r23 r24
      0x0b39: PHI (r9v11 java.lang.String) = (r9v10 java.lang.String), (r9v14 java.lang.String) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r12v11 com.github.catvod.spider.merge.A.g) = (r12v10 com.github.catvod.spider.merge.A.g), (r12v12 com.github.catvod.spider.merge.A.g) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r13v8 com.github.catvod.spider.merge.A.g) = (r13v7 com.github.catvod.spider.merge.A.g), (r13v10 com.github.catvod.spider.merge.A.g) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r14v5 com.github.catvod.spider.merge.A.g) = (r14v4 com.github.catvod.spider.merge.A.g), (r14v7 com.github.catvod.spider.merge.A.g) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r20v3 java.lang.String) = (r20v2 java.lang.String), (r20v4 java.lang.String) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r21v3 java.lang.String) = (r21v2 java.lang.String), (r21v4 java.lang.String) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v4 java.lang.String) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r23v3 java.lang.String) = (r23v2 java.lang.String), (r23v4 java.lang.String) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]
      0x0b39: PHI (r24v4 java.lang.String) = (r24v3 java.lang.String), (r24v5 java.lang.String) binds: [B:172:0x0b37, B:169:0x0b16] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.github.catvod.spider.merge.C.w o(com.github.catvod.spider.merge.B.o r34, com.github.catvod.spider.merge.H.l r35) {
        /*
            Method dump skipped, instruction units count: 3388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C.C0597c.o(com.github.catvod.spider.merge.B.o, com.github.catvod.spider.merge.H.l):com.github.catvod.spider.merge.C.w");
    }
}
