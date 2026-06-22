package com.github.catvod.spider.merge.D;

import com.github.catvod.spider.merge.C.C0595a;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.l.C1290c;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.z.InterfaceC1450d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.D.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C0601b {
    static final String c = com.github.catvod.spider.merge.H.c.f(L.class);
    static final String d;
    static final String e;
    static final String f;
    static final String g;
    static final String h;
    static final String i;
    static final String j;
    protected final com.github.catvod.spider.merge.H.b a = new com.github.catvod.spider.merge.H.b();
    private final AtomicLong b = new AtomicLong();

    static {
        String strF = com.github.catvod.spider.merge.H.c.f(X.class);
        d = strF;
        e = t0.a("L", strF, ";");
        String strF2 = com.github.catvod.spider.merge.H.c.f(h0.class);
        f = strF2;
        g = t0.a("L", strF2, ";");
        h = com.github.catvod.spider.merge.H.c.f(M.class);
        com.github.catvod.spider.merge.H.c.f(M.class);
        i = com.github.catvod.spider.merge.H.c.b(c0.class);
        j = com.github.catvod.spider.merge.H.c.b(g0.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.github.catvod.spider.merge.A.i r30, com.github.catvod.spider.merge.H.e r31, com.github.catvod.spider.merge.D.C0600a r32, com.github.catvod.spider.merge.A.g r33) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.C0601b.a(com.github.catvod.spider.merge.A.i, com.github.catvod.spider.merge.H.e, com.github.catvod.spider.merge.D.a, com.github.catvod.spider.merge.A.g):void");
    }

    private void b(com.github.catvod.spider.merge.A.i iVar, C0600a c0600a, com.github.catvod.spider.merge.H.e eVar) {
        Method method = eVar.c;
        iVar.m(25, c0600a.g("entity"));
        if (method != null) {
            Class<?> declaringClass = method.getDeclaringClass();
            iVar.k(declaringClass.isInterface() ? 185 : 182, com.github.catvod.spider.merge.H.c.f(declaringClass), method.getName(), com.github.catvod.spider.merge.H.c.c(method));
            if (method.getReturnType().equals(eVar.f)) {
                return;
            }
        } else {
            Field field = eVar.d;
            iVar.c(180, com.github.catvod.spider.merge.H.c.f(eVar.h), field.getName(), com.github.catvod.spider.merge.H.c.b(field.getType()));
            if (field.getType().equals(eVar.f)) {
                return;
            }
        }
        iVar.l(192, com.github.catvod.spider.merge.H.c.f(eVar.f));
    }

    private void c(C0600a c0600a, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, 0);
        String str = c0600a.b;
        String strB = C1290c.b(new StringBuilder(), eVar.b, "_asm_ser_");
        String str2 = e;
        iVar.c(180, str, strB, str2);
        iVar.g(199, gVar);
        iVar.m(25, 0);
        iVar.m(25, 1);
        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(eVar.f)));
        iVar.k(182, c, "getObjectWriter", C1290c.a("(Ljava/lang/Class;)", str2));
        iVar.c(181, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_ser_"), str2);
        iVar.h(gVar);
        iVar.m(25, 0);
        iVar.c(180, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_ser_"), str2);
    }

    private void d(C0600a c0600a, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, Class<?> cls) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, 0);
        String str = c0600a.b;
        String strB = C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_ser_");
        String str2 = e;
        iVar.c(180, str, strB, str2);
        iVar.g(199, gVar);
        iVar.m(25, 0);
        iVar.m(25, 1);
        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls)));
        iVar.k(182, c, "getObjectWriter", C1290c.a("(Ljava/lang/Class;)", str2));
        iVar.c(181, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_ser_"), str2);
        iVar.h(gVar);
        iVar.m(25, 0);
        iVar.c(180, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_list_item_ser_"), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.github.catvod.spider.merge.A.i r17, com.github.catvod.spider.merge.H.e r18, com.github.catvod.spider.merge.D.C0600a r19) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.D.C0601b.e(com.github.catvod.spider.merge.A.i, com.github.catvod.spider.merge.H.e, com.github.catvod.spider.merge.D.a):void");
    }

    private void f(com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, C0600a c0600a, int i2, char c2) {
        com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
        g(iVar, eVar, c0600a, gVar);
        b(iVar, c0600a, eVar);
        iVar.m(54, i2);
        a(iVar, eVar, c0600a, gVar);
        iVar.m(25, c0600a.g("out"));
        iVar.m(21, c0600a.g("seperator"));
        iVar.m(25, 6);
        iVar.m(21, i2);
        iVar.k(182, f, "writeFieldValue", "(CLjava/lang/String;" + c2 + ")V");
        h(iVar, c0600a);
        iVar.h(gVar);
    }

    private void g(com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, C0600a c0600a, com.github.catvod.spider.merge.A.g gVar) {
        if (!c0600a.d) {
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(25, 6);
            String str = h;
            StringBuilder sbB = t0.b("(L");
            String str2 = c;
            iVar.k(182, str, "applyName", C1290c.b(sbB, str2, ";Ljava/lang/Object;Ljava/lang/String;)Z"));
            iVar.g(153, gVar);
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.i(eVar.l);
            iVar.k(182, str, "applyLabel", "(L" + str2 + ";Ljava/lang/String;)Z");
            iVar.g(153, gVar);
        }
        if (eVar.d == null) {
            iVar.m(25, c0600a.g("out"));
            iVar.i(Integer.valueOf(i0.IgnoreNonFieldGetter.b));
            iVar.k(182, f, "isEnabled", "(I)Z");
            iVar.g(154, gVar);
        }
    }

    private void h(com.github.catvod.spider.merge.A.i iVar, C0600a c0600a) {
        iVar.m(16, 44);
        iVar.m(54, c0600a.g("seperator"));
    }

    private void i(com.github.catvod.spider.merge.A.i iVar, C0600a c0600a) {
        String str;
        String str2;
        String str3;
        boolean z = c0600a.d;
        iVar.m(25, c0600a.g("out"));
        iVar.m(25, 6);
        if (z) {
            str = f;
            str2 = "writeFieldNameDirect";
            str3 = "(Ljava/lang/String;)V";
        } else {
            iVar.e(3);
            str = f;
            str2 = "writeFieldName";
            str3 = "(Ljava/lang/String;Z)V";
        }
        iVar.k(182, str, str2, str3);
    }

    private void j(com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e eVar, C0600a c0600a, com.github.catvod.spider.merge.A.g gVar) {
        Class<?> cls;
        String str;
        com.github.catvod.spider.merge.A.g gVar2;
        com.github.catvod.spider.merge.A.g gVar3;
        String str2;
        String str3;
        String str4 = eVar.t;
        Class<?> cls2 = eVar.f;
        com.github.catvod.spider.merge.A.g gVar4 = new com.github.catvod.spider.merge.A.g();
        if (c0600a.d) {
            iVar.m(25, c0600a.g("object"));
        } else {
            iVar.m(25, 8);
        }
        iVar.e(89);
        iVar.m(58, c0600a.g("object"));
        iVar.g(199, gVar4);
        e(iVar, eVar, c0600a);
        iVar.g(167, gVar);
        iVar.h(gVar4);
        iVar.m(25, c0600a.g("out"));
        iVar.m(21, c0600a.g("seperator"));
        iVar.k(182, f, "write", "(I)V");
        i(iVar, c0600a);
        com.github.catvod.spider.merge.A.g gVar5 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar6 = new com.github.catvod.spider.merge.A.g();
        if (!Modifier.isPublic(cls2.getModifiers()) || com.github.catvod.spider.merge.B.o.i(cls2)) {
            cls = String.class;
            str = str4;
            gVar2 = gVar5;
            gVar3 = gVar6;
        } else {
            iVar.m(25, c0600a.g("object"));
            cls = String.class;
            iVar.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
            iVar.g(166, gVar6);
            c(c0600a, iVar, eVar);
            com.github.catvod.spider.merge.A.g gVarA = C0595a.a(iVar, 58, c0600a.g("fied_ser"));
            com.github.catvod.spider.merge.A.g gVar7 = new com.github.catvod.spider.merge.A.g();
            iVar.m(25, c0600a.g("fied_ser"));
            String str5 = h;
            iVar.l(193, str5);
            iVar.g(153, gVarA);
            int i2 = eVar.j;
            boolean z = (i0.DisableCircularReferenceDetect.b & i2) != 0;
            str = str4;
            boolean z2 = (i0.BeanToArray.b & i2) != 0;
            String str6 = (z || (c0600a.g && c0600a.d)) ? z2 ? "writeAsArrayNonContext" : "writeDirectNonContext" : z2 ? "writeAsArray" : "write";
            iVar.m(25, c0600a.g("fied_ser"));
            iVar.l(192, str5);
            iVar.m(25, 1);
            iVar.m(25, c0600a.g("object"));
            iVar.m(25, 6);
            iVar.m(25, 0);
            gVar3 = gVar6;
            iVar.c(180, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            iVar.i(Integer.valueOf(eVar.j));
            StringBuilder sb = new StringBuilder();
            sb.append("(L");
            String str7 = c;
            iVar.k(182, str5, str6, C1290c.b(sb, str7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            iVar.g(167, gVar7);
            iVar.h(gVarA);
            iVar.m(25, c0600a.g("fied_ser"));
            iVar.m(25, 1);
            iVar.m(25, c0600a.g("object"));
            iVar.m(25, 6);
            iVar.m(25, 0);
            iVar.c(180, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            iVar.i(Integer.valueOf(eVar.j));
            iVar.k(185, d, "write", t0.a("(L", str7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            iVar.h(gVar7);
            gVar2 = gVar5;
            iVar.g(167, gVar2);
        }
        iVar.h(gVar3);
        iVar.m(25, 1);
        iVar.m(25, c0600a.d ? c0600a.g("object") : 8);
        if (str != null) {
            iVar.i(str);
            iVar.k(182, c, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            iVar.m(25, 6);
            Type type = eVar.g;
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                str2 = c;
                str3 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
            } else {
                Class<?> cls3 = cls;
                if (eVar.f == cls3) {
                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls3)));
                } else {
                    iVar.m(25, 0);
                    iVar.c(180, c0600a.b, C1290c.b(new StringBuilder(), eVar.b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                }
                iVar.i(Integer.valueOf(eVar.j));
                str2 = c;
                str3 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
            }
            iVar.k(182, str2, "writeWithFieldName", str3);
        }
        iVar.h(gVar2);
        h(iVar, c0600a);
    }

    private void l(com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e[] eVarArr, C0600a c0600a) {
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        int i3;
        C0601b c0601b;
        int i4;
        com.github.catvod.spider.merge.A.g gVar;
        com.github.catvod.spider.merge.A.g gVar2;
        String str5;
        int i5;
        String str6;
        Class<?> cls;
        com.github.catvod.spider.merge.A.g gVar3;
        com.github.catvod.spider.merge.A.g gVar4;
        com.github.catvod.spider.merge.A.g gVar5;
        String str7;
        com.github.catvod.spider.merge.A.g gVar6;
        String str8;
        com.github.catvod.spider.merge.H.e eVar;
        Class<?> cls2;
        String str9;
        com.github.catvod.spider.merge.A.g gVar7;
        String str10;
        String str11;
        int i6;
        String str12;
        int i7;
        int i8;
        String str13;
        com.github.catvod.spider.merge.A.g gVar8;
        String str14;
        String str15;
        String str16;
        com.github.catvod.spider.merge.H.e[] eVarArr2 = eVarArr;
        com.github.catvod.spider.merge.A.g gVar9 = new com.github.catvod.spider.merge.A.g();
        iVar.m(25, 1);
        iVar.m(25, 0);
        String str17 = c;
        iVar.k(182, str17, "hasPropertyFilters", C1290c.b(t0.b("("), j, ")Z"));
        iVar.g(154, gVar9);
        iVar.m(25, 0);
        iVar.m(25, 1);
        iVar.m(25, 2);
        iVar.m(25, 3);
        iVar.m(25, 4);
        iVar.m(21, 5);
        String str18 = "(L";
        String str19 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        iVar.k(183, h, "writeNoneASM", t0.a("(L", str17, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
        iVar.e(177);
        iVar.h(gVar9);
        String str20 = "out";
        iVar.m(25, c0600a.g("out"));
        iVar.m(16, 91);
        String str21 = f;
        String str22 = "(I)V";
        iVar.k(182, str21, "write", "(I)V");
        int length = eVarArr2.length;
        if (length == 0) {
            iVar.m(25, c0600a.g("out"));
            iVar.m(16, 93);
            iVar.k(182, str21, "write", "(I)V");
            return;
        }
        int i9 = 0;
        C0601b c0601b2 = this;
        while (i9 < length) {
            int i10 = i9 == length + (-1) ? 93 : 44;
            com.github.catvod.spider.merge.H.e eVar2 = eVarArr2[i9];
            Class<?> cls3 = eVar2.f;
            iVar.i(eVar2.b);
            iVar.m(58, 6);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                str = str20;
                i2 = i9;
                str2 = str18;
                int i11 = i10;
                str3 = str19;
                str4 = str22;
                i3 = length;
                iVar.m(25, c0600a.g(str));
                iVar.e(89);
                c0601b = this;
                c0601b.b(iVar, c0600a, eVar2);
                String str23 = f;
                iVar.k(182, str23, "writeInt", str4);
                iVar.m(16, i11);
                iVar.k(182, str23, "write", str4);
            } else {
                if (cls3 == Long.TYPE) {
                    iVar.m(25, c0600a.g(str20));
                    iVar.e(89);
                    c0601b2.b(iVar, c0600a, eVar2);
                    str14 = f;
                    str15 = "writeLong";
                    str16 = "(J)V";
                } else if (cls3 == Float.TYPE) {
                    iVar.m(25, c0600a.g(str20));
                    iVar.e(89);
                    c0601b2.b(iVar, c0600a, eVar2);
                    iVar.e(4);
                    str14 = f;
                    str15 = "writeFloat";
                    str16 = "(FZ)V";
                } else if (cls3 == Double.TYPE) {
                    iVar.m(25, c0600a.g(str20));
                    iVar.e(89);
                    c0601b2.b(iVar, c0600a, eVar2);
                    iVar.e(4);
                    str14 = f;
                    str15 = "writeDouble";
                    str16 = "(DZ)V";
                } else {
                    i4 = 182;
                    if (cls3 == Boolean.TYPE) {
                        iVar.m(25, c0600a.g(str20));
                        iVar.e(89);
                        c0601b2.b(iVar, c0600a, eVar2);
                        str14 = f;
                        iVar.k(182, str14, "write", "(Z)V");
                        iVar.m(16, i10);
                        iVar.k(i4, str14, "write", str22);
                        str = str20;
                        i2 = i9;
                        str2 = str18;
                        str3 = str19;
                        str4 = str22;
                        i3 = length;
                        str22 = str4;
                        i9 = i2 + 1;
                        str19 = str3;
                        length = i3;
                        str18 = str2;
                        str20 = str;
                        eVarArr2 = eVarArr;
                    } else {
                        if (cls3 == Character.TYPE) {
                            iVar.m(25, c0600a.g(str20));
                            c0601b2.b(iVar, c0600a, eVar2);
                            iVar.k(184, "java/lang/Character", "toString", "(C)Ljava/lang/String;");
                        } else if (cls3 == String.class) {
                            iVar.m(25, c0600a.g(str20));
                            c0601b2.b(iVar, c0600a, eVar2);
                        } else {
                            i4 = 182;
                            if (cls3.isEnum()) {
                                iVar.m(25, c0600a.g(str20));
                                iVar.e(89);
                                c0601b2.b(iVar, c0600a, eVar2);
                                str14 = f;
                                str15 = "writeEnum";
                                str16 = "(Ljava/lang/Enum;)V";
                                iVar.k(i4, str14, str15, str16);
                                iVar.m(16, i10);
                                iVar.k(i4, str14, "write", str22);
                                str = str20;
                                i2 = i9;
                                str2 = str18;
                                str3 = str19;
                                str4 = str22;
                                i3 = length;
                                str22 = str4;
                                i9 = i2 + 1;
                                str19 = str3;
                                length = i3;
                                str18 = str2;
                                str20 = str;
                                eVarArr2 = eVarArr;
                            } else {
                                i3 = length;
                                i2 = i9;
                                if (List.class.isAssignableFrom(cls3)) {
                                    Type type = eVar2.g;
                                    Type type2 = type instanceof Class ? Object.class : ((ParameterizedType) type).getActualTypeArguments()[0];
                                    if (!(type2 instanceof Class) || (cls = (Class) type2) == Object.class) {
                                        cls = null;
                                    }
                                    c0601b2.b(iVar, c0600a, eVar2);
                                    int i12 = i10;
                                    iVar.l(192, "java/util/List");
                                    Type type3 = type2;
                                    iVar.m(58, c0600a.g("list"));
                                    if (cls == String.class && c0600a.d) {
                                        iVar.m(25, c0600a.g(str20));
                                        iVar.m(25, c0600a.g("list"));
                                        iVar.k(182, f, "write", "(Ljava/util/List;)V");
                                        str12 = str20;
                                        str2 = str18;
                                        str3 = str19;
                                        str13 = str22;
                                        i7 = 25;
                                        i6 = 182;
                                        i8 = 16;
                                    } else {
                                        com.github.catvod.spider.merge.A.g gVar10 = new com.github.catvod.spider.merge.A.g();
                                        com.github.catvod.spider.merge.A.g gVar11 = new com.github.catvod.spider.merge.A.g();
                                        String str24 = str19;
                                        String str25 = str18;
                                        iVar.m(25, c0600a.g("list"));
                                        iVar.g(199, gVar11);
                                        iVar.m(25, c0600a.g(str20));
                                        String str26 = f;
                                        iVar.k(182, str26, "writeNull", "()V");
                                        iVar.g(167, gVar10);
                                        iVar.h(gVar11);
                                        iVar.m(25, c0600a.g("list"));
                                        iVar.k(185, "java/util/List", "size", "()I");
                                        iVar.m(54, c0600a.g("size"));
                                        iVar.m(25, c0600a.g(str20));
                                        iVar.m(16, 91);
                                        iVar.k(182, str26, "write", str22);
                                        com.github.catvod.spider.merge.A.g gVar12 = new com.github.catvod.spider.merge.A.g();
                                        com.github.catvod.spider.merge.A.g gVar13 = new com.github.catvod.spider.merge.A.g();
                                        com.github.catvod.spider.merge.A.g gVar14 = new com.github.catvod.spider.merge.A.g();
                                        C0601b c0601b3 = c0601b2;
                                        iVar.e(3);
                                        Class<?> cls4 = cls;
                                        iVar.m(54, c0600a.g("i"));
                                        iVar.h(gVar12);
                                        iVar.m(21, c0600a.g("i"));
                                        iVar.m(21, c0600a.g("size"));
                                        iVar.g(162, gVar14);
                                        iVar.m(21, c0600a.g("i"));
                                        iVar.g(153, gVar13);
                                        iVar.m(25, c0600a.g(str20));
                                        iVar.m(16, 44);
                                        iVar.k(182, str26, "write", str22);
                                        iVar.h(gVar13);
                                        iVar.m(25, c0600a.g("list"));
                                        iVar.m(21, c0600a.g("i"));
                                        iVar.k(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                                        com.github.catvod.spider.merge.A.g gVarA = C0595a.a(iVar, 58, c0600a.g("list_item"));
                                        com.github.catvod.spider.merge.A.g gVar15 = new com.github.catvod.spider.merge.A.g();
                                        iVar.m(25, c0600a.g("list_item"));
                                        iVar.g(199, gVar15);
                                        iVar.m(25, c0600a.g(str20));
                                        iVar.k(182, str26, "writeNull", "()V");
                                        iVar.g(167, gVarA);
                                        iVar.h(gVar15);
                                        com.github.catvod.spider.merge.A.g gVar16 = new com.github.catvod.spider.merge.A.g();
                                        com.github.catvod.spider.merge.A.g gVar17 = new com.github.catvod.spider.merge.A.g();
                                        if (cls4 == null || !Modifier.isPublic(cls4.getModifiers())) {
                                            gVar3 = gVar12;
                                            gVar4 = gVarA;
                                            gVar5 = gVar16;
                                            str7 = str26;
                                            gVar6 = gVar17;
                                            str8 = str22;
                                            str3 = str24;
                                            eVar = eVar2;
                                            cls2 = cls4;
                                            str9 = str20;
                                            gVar7 = gVar14;
                                            str2 = str25;
                                        } else {
                                            iVar.m(25, c0600a.g("list_item"));
                                            str7 = str26;
                                            iVar.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                            iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls4)));
                                            iVar.g(166, gVar17);
                                            eVar = eVar2;
                                            cls2 = cls4;
                                            c0601b3.d(c0600a, iVar, eVar, cls2);
                                            str8 = str22;
                                            com.github.catvod.spider.merge.A.g gVarA2 = C0595a.a(iVar, 58, c0600a.g("list_item_desc"));
                                            com.github.catvod.spider.merge.A.g gVar18 = new com.github.catvod.spider.merge.A.g();
                                            if (c0600a.d) {
                                                str9 = str20;
                                                gVar7 = gVar14;
                                                iVar.m(25, c0600a.g("list_item_desc"));
                                                String str27 = h;
                                                iVar.l(193, str27);
                                                iVar.g(153, gVarA2);
                                                gVar3 = gVar12;
                                                iVar.m(25, c0600a.g("list_item_desc"));
                                                iVar.l(192, str27);
                                                iVar.m(25, 1);
                                                iVar.m(25, c0600a.g("list_item"));
                                                if (c0600a.g) {
                                                    iVar.e(1);
                                                    gVar4 = gVarA;
                                                    gVar6 = gVar17;
                                                } else {
                                                    iVar.m(21, c0600a.g("i"));
                                                    gVar4 = gVarA;
                                                    gVar6 = gVar17;
                                                    iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                                }
                                                iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
                                                iVar.i(Integer.valueOf(eVar.j));
                                                StringBuilder sb = new StringBuilder();
                                                str2 = str25;
                                                sb.append(str2);
                                                str3 = str24;
                                                gVar8 = gVar16;
                                                iVar.k(182, str27, "writeAsArrayNonContext", C1290c.b(sb, c, str3));
                                                iVar.g(167, gVar18);
                                                iVar.h(gVarA2);
                                            } else {
                                                gVar3 = gVar12;
                                                str9 = str20;
                                                gVar4 = gVarA;
                                                gVar6 = gVar17;
                                                gVar7 = gVar14;
                                                str3 = str24;
                                                str2 = str25;
                                                gVar8 = gVar16;
                                            }
                                            iVar.m(25, c0600a.g("list_item_desc"));
                                            iVar.m(25, 1);
                                            iVar.m(25, c0600a.g("list_item"));
                                            if (c0600a.g) {
                                                iVar.e(1);
                                            } else {
                                                iVar.m(21, c0600a.g("i"));
                                                iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                            }
                                            iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
                                            iVar.i(Integer.valueOf(eVar.j));
                                            iVar.k(185, d, "write", C1290c.b(t0.b(str2), c, str3));
                                            iVar.h(gVar18);
                                            gVar5 = gVar8;
                                            iVar.g(167, gVar5);
                                        }
                                        iVar.h(gVar6);
                                        iVar.m(25, 1);
                                        iVar.m(25, c0600a.g("list_item"));
                                        if (c0600a.g) {
                                            iVar.e(1);
                                        } else {
                                            iVar.m(21, c0600a.g("i"));
                                            iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                        }
                                        if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                            str10 = c;
                                            str11 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                        } else {
                                            iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b((Class) type3)));
                                            iVar.i(Integer.valueOf(eVar.j));
                                            str10 = c;
                                            str11 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                        }
                                        i6 = 182;
                                        iVar.k(182, str10, "writeWithFieldName", str11);
                                        iVar.h(gVar5);
                                        iVar.h(gVar4);
                                        iVar.d(c0600a.g("i"));
                                        iVar.g(167, gVar3);
                                        iVar.h(gVar7);
                                        str12 = str9;
                                        i7 = 25;
                                        iVar.m(25, c0600a.g(str12));
                                        i8 = 16;
                                        iVar.m(16, 93);
                                        str13 = str8;
                                        iVar.k(182, str7, "write", str13);
                                        iVar.h(gVar10);
                                    }
                                    iVar.m(i7, c0600a.g(str12));
                                    iVar.m(i8, i12);
                                    iVar.k(i6, f, "write", str13);
                                    str4 = str13;
                                    str = str12;
                                } else {
                                    String str28 = str20;
                                    str2 = str18;
                                    String str29 = str22;
                                    int i13 = i10;
                                    str3 = str19;
                                    com.github.catvod.spider.merge.A.g gVar19 = new com.github.catvod.spider.merge.A.g();
                                    com.github.catvod.spider.merge.A.g gVar20 = new com.github.catvod.spider.merge.A.g();
                                    b(iVar, c0600a, eVar2);
                                    iVar.e(89);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("field_");
                                    iVar.m(58, c0600a.g(com.github.catvod.spider.merge.H0.j.b(eVar2.f, sb2)));
                                    iVar.g(199, gVar20);
                                    iVar.m(25, c0600a.g(str28));
                                    String str30 = f;
                                    iVar.k(182, str30, "writeNull", "()V");
                                    iVar.g(167, gVar19);
                                    iVar.h(gVar20);
                                    com.github.catvod.spider.merge.A.g gVar21 = new com.github.catvod.spider.merge.A.g();
                                    com.github.catvod.spider.merge.A.g gVar22 = new com.github.catvod.spider.merge.A.g();
                                    iVar.m(25, c0600a.g(com.github.catvod.spider.merge.H0.j.b(eVar2.f, t0.b("field_"))));
                                    iVar.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls3)));
                                    iVar.g(166, gVar22);
                                    c(c0600a, iVar, eVar2);
                                    com.github.catvod.spider.merge.A.g gVarA3 = C0595a.a(iVar, 58, c0600a.g("fied_ser"));
                                    com.github.catvod.spider.merge.A.g gVar23 = new com.github.catvod.spider.merge.A.g();
                                    if (c0600a.d && Modifier.isPublic(cls3.getModifiers())) {
                                        iVar.m(25, c0600a.g("fied_ser"));
                                        String str31 = h;
                                        iVar.l(193, str31);
                                        iVar.g(153, gVarA3);
                                        gVar = gVar19;
                                        iVar.m(25, c0600a.g("fied_ser"));
                                        iVar.l(192, str31);
                                        iVar.m(25, 1);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("field_");
                                        iVar.m(25, c0600a.g(com.github.catvod.spider.merge.H0.j.b(eVar2.f, sb3)));
                                        iVar.m(25, 6);
                                        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls3)));
                                        iVar.i(Integer.valueOf(eVar2.j));
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(str2);
                                        gVar2 = gVar22;
                                        iVar.k(182, str31, "writeAsArrayNonContext", C1290c.b(sb4, c, str3));
                                        iVar.g(167, gVar23);
                                        iVar.h(gVarA3);
                                    } else {
                                        gVar = gVar19;
                                        gVar2 = gVar22;
                                    }
                                    iVar.m(25, c0600a.g("fied_ser"));
                                    iVar.m(25, 1);
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("field_");
                                    iVar.m(25, c0600a.g(com.github.catvod.spider.merge.H0.j.b(eVar2.f, sb5)));
                                    iVar.m(25, 6);
                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls3)));
                                    iVar.i(Integer.valueOf(eVar2.j));
                                    String str32 = d;
                                    StringBuilder sbB = t0.b(str2);
                                    String str33 = c;
                                    iVar.k(185, str32, "write", C1290c.b(sbB, str33, str3));
                                    iVar.h(gVar23);
                                    iVar.g(167, gVar21);
                                    iVar.h(gVar2);
                                    String str34 = eVar2.t;
                                    iVar.m(25, 1);
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("field_");
                                    iVar.m(25, c0600a.g(com.github.catvod.spider.merge.H0.j.b(eVar2.f, sb6)));
                                    if (str34 != null) {
                                        iVar.i(str34);
                                        str6 = "writeWithFormat";
                                        str5 = "(Ljava/lang/Object;Ljava/lang/String;)V";
                                    } else {
                                        iVar.m(25, 6);
                                        Type type4 = eVar2.g;
                                        if ((type4 instanceof Class) && ((Class) type4).isPrimitive()) {
                                            str5 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                            str6 = "writeWithFieldName";
                                        } else {
                                            iVar.m(25, 0);
                                            iVar.c(180, c0600a.b, C1290c.b(new StringBuilder(), eVar2.b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                                            iVar.i(Integer.valueOf(eVar2.j));
                                            str5 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                            i5 = 182;
                                            str6 = "writeWithFieldName";
                                            iVar.k(i5, str33, str6, str5);
                                            iVar.h(gVar21);
                                            iVar.h(gVar);
                                            str = str28;
                                            iVar.m(25, c0600a.g(str));
                                            iVar.m(16, i13);
                                            str4 = str29;
                                            iVar.k(182, str30, "write", str4);
                                        }
                                    }
                                    i5 = 182;
                                    iVar.k(i5, str33, str6, str5);
                                    iVar.h(gVar21);
                                    iVar.h(gVar);
                                    str = str28;
                                    iVar.m(25, c0600a.g(str));
                                    iVar.m(16, i13);
                                    str4 = str29;
                                    iVar.k(182, str30, "write", str4);
                                }
                                c0601b = this;
                            }
                        }
                        iVar.m(16, i10);
                        iVar.k(182, f, "writeString", "(Ljava/lang/String;C)V");
                        str = str20;
                        i2 = i9;
                        str2 = str18;
                        str3 = str19;
                        str4 = str22;
                        i3 = length;
                        str22 = str4;
                        i9 = i2 + 1;
                        str19 = str3;
                        length = i3;
                        str18 = str2;
                        str20 = str;
                        eVarArr2 = eVarArr;
                    }
                }
                i4 = 182;
                iVar.k(i4, str14, str15, str16);
                iVar.m(16, i10);
                iVar.k(i4, str14, "write", str22);
                str = str20;
                i2 = i9;
                str2 = str18;
                str3 = str19;
                str4 = str22;
                i3 = length;
                str22 = str4;
                i9 = i2 + 1;
                str19 = str3;
                length = i3;
                str18 = str2;
                str20 = str;
                eVarArr2 = eVarArr;
            }
            c0601b2 = c0601b;
            str22 = str4;
            i9 = i2 + 1;
            str19 = str3;
            length = i3;
            str18 = str2;
            str20 = str;
            eVarArr2 = eVarArr;
        }
    }

    private void m(Class<?> cls, com.github.catvod.spider.merge.A.i iVar, com.github.catvod.spider.merge.H.e[] eVarArr, C0600a c0600a) {
        com.github.catvod.spider.merge.A.g gVar;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        int i3;
        int i4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C0601b c0601b;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        com.github.catvod.spider.merge.A.g gVar2;
        com.github.catvod.spider.merge.A.g gVar3;
        com.github.catvod.spider.merge.A.g gVar4;
        String str16;
        String str17;
        Class<?> cls2;
        com.github.catvod.spider.merge.A.g gVar5;
        com.github.catvod.spider.merge.A.g gVar6;
        com.github.catvod.spider.merge.H.e eVar;
        com.github.catvod.spider.merge.A.g gVar7;
        String str18;
        String str19;
        String str20;
        int i5;
        int i6;
        int i7;
        com.github.catvod.spider.merge.A.g gVar8;
        com.github.catvod.spider.merge.H.e eVar2;
        String str21;
        String str22;
        String str23;
        int iG;
        char c2;
        C0601b c0601b2;
        com.github.catvod.spider.merge.A.i iVar2;
        C0600a c0600a2;
        boolean z;
        int i8;
        com.github.catvod.spider.merge.H.e[] eVarArr2 = eVarArr;
        com.github.catvod.spider.merge.A.g gVar9 = new com.github.catvod.spider.merge.A.g();
        int length = eVarArr2.length;
        String str24 = "write";
        String str25 = "(L";
        String str26 = "out";
        if (!c0600a.d) {
            com.github.catvod.spider.merge.A.g gVar10 = new com.github.catvod.spider.merge.A.g();
            com.github.catvod.spider.merge.A.g gVar11 = new com.github.catvod.spider.merge.A.g();
            iVar.m(25, c0600a.g("out"));
            iVar.i(Integer.valueOf(i0.PrettyFormat.b));
            iVar.k(182, f, "isEnabled", "(I)Z");
            iVar.g(154, gVar11);
            int length2 = eVarArr2.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    z = false;
                    break;
                }
                int i10 = length2;
                if (eVarArr2[i9].c != null) {
                    z = true;
                    break;
                } else {
                    i9++;
                    length2 = i10;
                }
            }
            if (z) {
                iVar.m(25, c0600a.g("out"));
                iVar.i(Integer.valueOf(i0.IgnoreErrorGetter.b));
                iVar.k(182, f, "isEnabled", "(I)Z");
                i8 = 153;
            } else {
                i8 = 167;
            }
            iVar.g(i8, gVar10);
            iVar.h(gVar11);
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(25, 3);
            iVar.m(25, 4);
            iVar.m(21, 5);
            iVar.k(183, h, "write", C1290c.b(t0.b("(L"), c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            iVar.e(177);
            iVar.h(gVar10);
        }
        if (c0600a.g) {
            gVar = gVar9;
        } else {
            com.github.catvod.spider.merge.A.g gVar12 = new com.github.catvod.spider.merge.A.g();
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(21, 5);
            gVar = gVar9;
            iVar.k(182, h, "writeReference", C1290c.b(t0.b("(L"), c, ";Ljava/lang/Object;I)Z"));
            iVar.g(153, gVar12);
            iVar.e(177);
            iVar.h(gVar12);
        }
        String str27 = c0600a.d ? c0600a.g ? "writeAsArrayNonContext" : "writeAsArray" : "writeAsArrayNormal";
        int i11 = c0600a.c.g;
        i0 i0Var = i0.BeanToArray;
        if ((i11 & i0Var.b) == 0) {
            com.github.catvod.spider.merge.A.g gVar13 = new com.github.catvod.spider.merge.A.g();
            iVar.m(25, c0600a.g("out"));
            iVar.i(Integer.valueOf(i0Var.b));
            iVar.k(182, f, "isEnabled", "(I)Z");
            iVar.g(153, gVar13);
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(25, 3);
            iVar.m(25, 4);
            iVar.m(21, 5);
            iVar.k(182, c0600a.b, str27, C1290c.b(t0.b("(L"), c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            iVar.e(177);
            iVar.h(gVar13);
        } else {
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(25, 3);
            iVar.m(25, 4);
            iVar.m(21, 5);
            iVar.k(182, c0600a.b, str27, C1290c.b(t0.b("(L"), c, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
            iVar.e(177);
        }
        String str28 = "(";
        if (!c0600a.g) {
            iVar.m(25, 1);
            String str29 = c;
            StringBuilder sbB = t0.b("()");
            String str30 = i;
            sbB.append(str30);
            iVar.k(182, str29, "getContext", sbB.toString());
            iVar.m(58, c0600a.g("parent"));
            iVar.m(25, 1);
            iVar.m(25, c0600a.g("parent"));
            iVar.m(25, 2);
            iVar.m(25, 3);
            iVar.i(Integer.valueOf(c0600a.c.g));
            iVar.k(182, str29, "setContext", "(" + str30 + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }
        boolean z2 = (c0600a.c.g & i0.WriteClassName.b) != 0;
        String str31 = "(I)V";
        if (z2 || !c0600a.d) {
            com.github.catvod.spider.merge.A.g gVar14 = new com.github.catvod.spider.merge.A.g();
            com.github.catvod.spider.merge.A.g gVar15 = new com.github.catvod.spider.merge.A.g();
            com.github.catvod.spider.merge.A.g gVar16 = new com.github.catvod.spider.merge.A.g();
            if (z2) {
                str = "parent";
                str2 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                i2 = 182;
            } else {
                str = "parent";
                iVar.m(25, 1);
                iVar.m(25, 4);
                iVar.m(25, 2);
                str2 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                i2 = 182;
                iVar.k(182, c, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                iVar.g(153, gVar15);
            }
            iVar.m(25, 4);
            iVar.m(25, 2);
            iVar.k(i2, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            iVar.g(165, gVar15);
            iVar.h(gVar16);
            iVar.m(25, c0600a.g("out"));
            iVar.m(16, 123);
            iVar.k(i2, f, "write", "(I)V");
            iVar.m(25, 0);
            iVar.m(25, 1);
            if (c0600a.c.c != null) {
                iVar.i(c0600a.c.c);
            } else {
                iVar.e(1);
            }
            iVar.m(25, 2);
            iVar.k(182, h, "writeClassName", C1290c.b(t0.b("(L"), c, ";Ljava/lang/String;Ljava/lang/Object;)V"));
            iVar.m(16, 44);
            iVar.g(167, gVar14);
            iVar.h(gVar15);
            iVar.m(16, 123);
            iVar.h(gVar14);
        } else {
            iVar.m(16, 123);
            str = "parent";
            str2 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        }
        String str32 = "seperator";
        iVar.m(54, c0600a.g("seperator"));
        if (!c0600a.d) {
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(21, c0600a.g("seperator"));
            iVar.k(182, h, "writeBefore", C1290c.b(t0.b("(L"), c, ";Ljava/lang/Object;C)C"));
            iVar.m(54, c0600a.g("seperator"));
        }
        if (!c0600a.d) {
            iVar.m(25, c0600a.g("out"));
            iVar.k(182, f, "isNotWriteDefaultValue", "()Z");
            iVar.m(54, c0600a.g("notWriteDefaultValue"));
            iVar.m(25, 1);
            iVar.m(25, 0);
            String str33 = c;
            StringBuilder sbB2 = t0.b("(");
            String str34 = j;
            iVar.k(182, str33, "checkValue", C1290c.b(sbB2, str34, ")Z"));
            iVar.m(54, c0600a.g("checkValue"));
            iVar.m(25, 1);
            iVar.m(25, 0);
            iVar.k(182, str33, "hasNameFilters", com.github.catvod.spider.merge.y.z.b(new StringBuilder(), "(", str34, ")Z"));
            iVar.m(54, c0600a.g("hasNameFilters"));
        }
        int i12 = 0;
        while (i12 < length) {
            com.github.catvod.spider.merge.H.e eVar3 = eVarArr2[i12];
            Class<?> cls3 = eVar3.f;
            iVar.i(eVar3.b);
            iVar.m(58, 6);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                str3 = str31;
                str4 = str28;
                i3 = i12;
                i4 = length;
                str5 = str24;
                str6 = str25;
                str7 = str32;
                str8 = str26;
                str9 = str2;
                f(iVar, eVar3, c0600a, c0600a.g(cls3.getName()), 'I');
            } else {
                String str35 = "writeFieldValue";
                if (cls3 == Long.TYPE) {
                    com.github.catvod.spider.merge.A.g gVar17 = new com.github.catvod.spider.merge.A.g();
                    c0601b = this;
                    c0601b.g(iVar, eVar3, c0600a, gVar17);
                    c0601b.b(iVar, c0600a, eVar3);
                    str10 = str31;
                    str11 = str28;
                    iVar.m(55, c0600a.h("long"));
                    c0601b.a(iVar, eVar3, c0600a, gVar17);
                    iVar.m(25, c0600a.g(str26));
                    iVar.m(21, c0600a.g(str32));
                    iVar.m(25, 6);
                    iVar.m(22, c0600a.h("long"));
                    iVar.k(182, f, "writeFieldValue", "(CLjava/lang/String;J)V");
                    c0601b.h(iVar, c0600a);
                    iVar.h(gVar17);
                } else {
                    c0601b = this;
                    str10 = str31;
                    str11 = str28;
                    if (cls3 == Float.TYPE) {
                        com.github.catvod.spider.merge.A.g gVar18 = new com.github.catvod.spider.merge.A.g();
                        c0601b.g(iVar, eVar3, c0600a, gVar18);
                        c0601b.b(iVar, c0600a, eVar3);
                        iVar.m(56, c0600a.g("float"));
                        c0601b.a(iVar, eVar3, c0600a, gVar18);
                        iVar.m(25, c0600a.g(str26));
                        iVar.m(21, c0600a.g(str32));
                        iVar.m(25, 6);
                        iVar.m(23, c0600a.g("float"));
                        iVar.k(182, f, "writeFieldValue", "(CLjava/lang/String;F)V");
                        c0601b.h(iVar, c0600a);
                        iVar.h(gVar18);
                    } else if (cls3 == Double.TYPE) {
                        com.github.catvod.spider.merge.A.g gVar19 = new com.github.catvod.spider.merge.A.g();
                        c0601b.g(iVar, eVar3, c0600a, gVar19);
                        c0601b.b(iVar, c0600a, eVar3);
                        iVar.m(57, c0600a.h("double"));
                        c0601b.a(iVar, eVar3, c0600a, gVar19);
                        iVar.m(25, c0600a.g(str26));
                        iVar.m(21, c0600a.g(str32));
                        iVar.m(25, 6);
                        iVar.m(24, c0600a.h("double"));
                        iVar.k(182, f, "writeFieldValue", "(CLjava/lang/String;D)V");
                        c0601b.h(iVar, c0600a);
                        iVar.h(gVar19);
                    } else {
                        if (cls3 == Boolean.TYPE) {
                            iG = c0600a.g("boolean");
                            c2 = 'Z';
                            c0601b2 = this;
                            iVar2 = iVar;
                            c0600a2 = c0600a;
                            str3 = str10;
                            str4 = str11;
                        } else {
                            str3 = str10;
                            str4 = str11;
                            if (cls3 == Character.TYPE) {
                                iG = c0600a.g("char");
                                c2 = 'C';
                                c0601b2 = this;
                                iVar2 = iVar;
                                c0600a2 = c0600a;
                            } else {
                                if (cls3 == String.class) {
                                    com.github.catvod.spider.merge.A.g gVar20 = new com.github.catvod.spider.merge.A.g();
                                    if (eVar3.b.equals(c0600a.c.c)) {
                                        iVar.m(25, 1);
                                        iVar.m(25, 4);
                                        iVar.m(25, 2);
                                        i4 = length;
                                        iVar.k(182, c, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                                        iVar.g(154, gVar20);
                                    } else {
                                        i4 = length;
                                    }
                                    c0601b.g(iVar, eVar3, c0600a, gVar20);
                                    c0601b.b(iVar, c0600a, eVar3);
                                    iVar.m(58, c0600a.g("string"));
                                    c0601b.a(iVar, eVar3, c0600a, gVar20);
                                    com.github.catvod.spider.merge.A.g gVar21 = new com.github.catvod.spider.merge.A.g();
                                    com.github.catvod.spider.merge.A.g gVar22 = new com.github.catvod.spider.merge.A.g();
                                    i3 = i12;
                                    iVar.m(25, c0600a.g("string"));
                                    iVar.g(199, gVar21);
                                    c0601b.e(iVar, eVar3, c0600a);
                                    iVar.g(167, gVar22);
                                    iVar.h(gVar21);
                                    if ("trim".equals(eVar3.t)) {
                                        iVar.m(25, c0600a.g("string"));
                                        iVar.k(182, "java/lang/String", "trim", "()Ljava/lang/String;");
                                        iVar.m(58, c0600a.g("string"));
                                    }
                                    if (c0600a.d) {
                                        iVar.m(25, c0600a.g(str26));
                                        iVar.m(21, c0600a.g(str32));
                                        iVar.m(25, 6);
                                        iVar.m(25, c0600a.g("string"));
                                        str23 = f;
                                        str35 = "writeFieldValueStringWithDoubleQuoteCheck";
                                    } else {
                                        iVar.m(25, c0600a.g(str26));
                                        iVar.m(21, c0600a.g(str32));
                                        iVar.m(25, 6);
                                        iVar.m(25, c0600a.g("string"));
                                        str23 = f;
                                    }
                                    iVar.k(182, str23, str35, "(CLjava/lang/String;Ljava/lang/String;)V");
                                    c0601b.h(iVar, c0600a);
                                    iVar.h(gVar22);
                                    iVar.h(gVar20);
                                } else {
                                    i3 = i12;
                                    i4 = length;
                                    if (cls3 == BigDecimal.class) {
                                        com.github.catvod.spider.merge.A.g gVar23 = new com.github.catvod.spider.merge.A.g();
                                        c0601b.g(iVar, eVar3, c0600a, gVar23);
                                        c0601b.b(iVar, c0600a, eVar3);
                                        iVar.m(58, c0600a.g("decimal"));
                                        c0601b.a(iVar, eVar3, c0600a, gVar23);
                                        com.github.catvod.spider.merge.A.g gVar24 = new com.github.catvod.spider.merge.A.g();
                                        com.github.catvod.spider.merge.A.g gVar25 = new com.github.catvod.spider.merge.A.g();
                                        com.github.catvod.spider.merge.A.g gVar26 = new com.github.catvod.spider.merge.A.g();
                                        iVar.h(gVar24);
                                        iVar.m(25, c0600a.g("decimal"));
                                        iVar.g(199, gVar25);
                                        c0601b.e(iVar, eVar3, c0600a);
                                        iVar.g(167, gVar26);
                                        iVar.h(gVar25);
                                        iVar.m(25, c0600a.g(str26));
                                        iVar.m(21, c0600a.g(str32));
                                        iVar.m(25, 6);
                                        iVar.m(25, c0600a.g("decimal"));
                                        iVar.k(182, f, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
                                        c0601b.h(iVar, c0600a);
                                        iVar.g(167, gVar26);
                                        iVar.h(gVar26);
                                        iVar.h(gVar23);
                                    } else {
                                        if (List.class.isAssignableFrom(cls3)) {
                                            Type typeL = com.github.catvod.spider.merge.H.A.L(eVar3.g);
                                            Class<?> cls4 = null;
                                            Class<?> cls5 = typeL instanceof Class ? (Class) typeL : null;
                                            if (cls5 != Object.class && cls5 != Serializable.class) {
                                                cls4 = cls5;
                                            }
                                            com.github.catvod.spider.merge.A.g gVar27 = new com.github.catvod.spider.merge.A.g();
                                            com.github.catvod.spider.merge.A.g gVar28 = new com.github.catvod.spider.merge.A.g();
                                            com.github.catvod.spider.merge.A.g gVar29 = new com.github.catvod.spider.merge.A.g();
                                            c0601b.g(iVar, eVar3, c0600a, gVar27);
                                            c0601b.b(iVar, c0600a, eVar3);
                                            iVar.l(192, "java/util/List");
                                            str6 = str25;
                                            Class<?> cls6 = cls4;
                                            iVar.m(58, c0600a.g("list"));
                                            c0601b.a(iVar, eVar3, c0600a, gVar27);
                                            iVar.m(25, c0600a.g("list"));
                                            iVar.g(199, gVar28);
                                            c0601b.e(iVar, eVar3, c0600a);
                                            iVar.g(167, gVar29);
                                            iVar.h(gVar28);
                                            iVar.m(25, c0600a.g(str26));
                                            iVar.m(21, c0600a.g(str32));
                                            String str36 = f;
                                            iVar.k(182, str36, str24, str3);
                                            c0601b.i(iVar, c0600a);
                                            iVar.m(25, c0600a.g("list"));
                                            String str37 = str32;
                                            iVar.k(185, "java/util/List", "size", "()I");
                                            com.github.catvod.spider.merge.A.g gVarA = C0595a.a(iVar, 54, c0600a.g("size"));
                                            com.github.catvod.spider.merge.A.g gVar30 = new com.github.catvod.spider.merge.A.g();
                                            iVar.m(21, c0600a.g("size"));
                                            iVar.e(3);
                                            iVar.g(160, gVarA);
                                            iVar.m(25, c0600a.g(str26));
                                            iVar.i("[]");
                                            iVar.k(182, str36, str24, "(Ljava/lang/String;)V");
                                            iVar.g(167, gVar30);
                                            iVar.h(gVarA);
                                            if (c0600a.g) {
                                                gVar2 = gVar30;
                                            } else {
                                                iVar.m(25, 1);
                                                iVar.m(25, c0600a.g("list"));
                                                iVar.m(25, 6);
                                                gVar2 = gVar30;
                                                iVar.k(182, c, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                            }
                                            if (typeL == String.class && c0600a.d) {
                                                i5 = 25;
                                                iVar.m(25, c0600a.g(str26));
                                                iVar.m(25, c0600a.g("list"));
                                                i7 = 182;
                                                iVar.k(182, str36, str24, "(Ljava/util/List;)V");
                                                i6 = 1;
                                                str5 = str24;
                                                str8 = str26;
                                                str12 = str2;
                                            } else {
                                                iVar.m(25, c0600a.g(str26));
                                                iVar.m(16, 91);
                                                iVar.k(182, str36, str24, str3);
                                                com.github.catvod.spider.merge.A.g gVar31 = new com.github.catvod.spider.merge.A.g();
                                                com.github.catvod.spider.merge.A.g gVar32 = new com.github.catvod.spider.merge.A.g();
                                                com.github.catvod.spider.merge.A.g gVar33 = new com.github.catvod.spider.merge.A.g();
                                                iVar.e(3);
                                                iVar.m(54, c0600a.g("i"));
                                                iVar.h(gVar31);
                                                iVar.m(21, c0600a.g("i"));
                                                iVar.m(21, c0600a.g("size"));
                                                iVar.g(162, gVar33);
                                                iVar.m(21, c0600a.g("i"));
                                                iVar.g(153, gVar32);
                                                iVar.m(25, c0600a.g(str26));
                                                iVar.m(16, 44);
                                                iVar.k(182, str36, str24, str3);
                                                iVar.h(gVar32);
                                                iVar.m(25, c0600a.g("list"));
                                                iVar.m(21, c0600a.g("i"));
                                                iVar.k(185, "java/util/List", "get", "(I)Ljava/lang/Object;");
                                                com.github.catvod.spider.merge.A.g gVarA2 = C0595a.a(iVar, 58, c0600a.g("list_item"));
                                                com.github.catvod.spider.merge.A.g gVar34 = new com.github.catvod.spider.merge.A.g();
                                                iVar.m(25, c0600a.g("list_item"));
                                                iVar.g(199, gVar34);
                                                iVar.m(25, c0600a.g(str26));
                                                iVar.k(182, str36, "writeNull", "()V");
                                                iVar.g(167, gVarA2);
                                                iVar.h(gVar34);
                                                com.github.catvod.spider.merge.A.g gVar35 = new com.github.catvod.spider.merge.A.g();
                                                com.github.catvod.spider.merge.A.g gVar36 = new com.github.catvod.spider.merge.A.g();
                                                if (cls6 == null || !Modifier.isPublic(cls6.getModifiers())) {
                                                    gVar3 = gVar31;
                                                    gVar4 = gVar33;
                                                    str16 = str3;
                                                    str5 = str24;
                                                    str17 = str26;
                                                    str12 = str2;
                                                    cls2 = cls6;
                                                    gVar5 = gVarA2;
                                                    gVar6 = gVar35;
                                                    eVar = eVar3;
                                                    gVar7 = gVar36;
                                                } else {
                                                    str16 = str3;
                                                    str17 = str26;
                                                    iVar.m(25, c0600a.g("list_item"));
                                                    gVar4 = gVar33;
                                                    gVar3 = gVar31;
                                                    iVar.k(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls6)));
                                                    iVar.g(166, gVar36);
                                                    cls2 = cls6;
                                                    c0601b.d(c0600a, iVar, eVar3, cls2);
                                                    com.github.catvod.spider.merge.A.g gVarA3 = C0595a.a(iVar, 58, c0600a.g("list_item_desc"));
                                                    com.github.catvod.spider.merge.A.g gVar37 = new com.github.catvod.spider.merge.A.g();
                                                    if (c0600a.d) {
                                                        if (c0600a.g && c0600a.d) {
                                                            gVar7 = gVar36;
                                                            gVar5 = gVarA2;
                                                            str22 = "writeDirectNonContext";
                                                        } else {
                                                            gVar5 = gVarA2;
                                                            gVar7 = gVar36;
                                                            str22 = str24;
                                                        }
                                                        gVar8 = gVar35;
                                                        iVar.m(25, c0600a.g("list_item_desc"));
                                                        String str38 = h;
                                                        iVar.l(193, str38);
                                                        iVar.g(153, gVarA3);
                                                        str21 = str24;
                                                        iVar.m(25, c0600a.g("list_item_desc"));
                                                        iVar.l(192, str38);
                                                        iVar.m(25, 1);
                                                        iVar.m(25, c0600a.g("list_item"));
                                                        if (c0600a.g) {
                                                            iVar.e(1);
                                                        } else {
                                                            iVar.m(21, c0600a.g("i"));
                                                            iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                                        }
                                                        iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
                                                        iVar.i(Integer.valueOf(eVar3.j));
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(str6);
                                                        eVar2 = eVar3;
                                                        str12 = str2;
                                                        iVar.k(182, str38, str22, C1290c.b(sb, c, str12));
                                                        iVar.g(167, gVar37);
                                                        iVar.h(gVarA3);
                                                    } else {
                                                        gVar5 = gVarA2;
                                                        gVar8 = gVar35;
                                                        eVar2 = eVar3;
                                                        gVar7 = gVar36;
                                                        str21 = str24;
                                                        str12 = str2;
                                                    }
                                                    iVar.m(25, c0600a.g("list_item_desc"));
                                                    iVar.m(25, 1);
                                                    iVar.m(25, c0600a.g("list_item"));
                                                    if (c0600a.g) {
                                                        iVar.e(1);
                                                    } else {
                                                        iVar.m(21, c0600a.g("i"));
                                                        iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                                    }
                                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(cls2)));
                                                    eVar = eVar2;
                                                    iVar.i(Integer.valueOf(eVar.j));
                                                    str5 = str21;
                                                    iVar.k(185, d, str5, C1290c.b(t0.b(str6), c, str12));
                                                    iVar.h(gVar37);
                                                    gVar6 = gVar8;
                                                    iVar.g(167, gVar6);
                                                }
                                                iVar.h(gVar7);
                                                iVar.m(25, 1);
                                                iVar.m(25, c0600a.g("list_item"));
                                                if (c0600a.g) {
                                                    iVar.e(1);
                                                } else {
                                                    iVar.m(21, c0600a.g("i"));
                                                    iVar.k(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                                }
                                                if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                                    str18 = c;
                                                    str19 = "writeWithFieldName";
                                                    str20 = "(Ljava/lang/Object;Ljava/lang/Object;)V";
                                                } else {
                                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b((Class) typeL)));
                                                    iVar.i(Integer.valueOf(eVar.j));
                                                    str18 = c;
                                                    str19 = "writeWithFieldName";
                                                    str20 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                                }
                                                iVar.k(182, str18, str19, str20);
                                                iVar.h(gVar6);
                                                iVar.h(gVar5);
                                                iVar.d(c0600a.g("i"));
                                                iVar.g(167, gVar3);
                                                iVar.h(gVar4);
                                                str8 = str17;
                                                i5 = 25;
                                                iVar.m(25, c0600a.g(str8));
                                                iVar.m(16, 93);
                                                str3 = str16;
                                                iVar.k(182, str36, str5, str3);
                                                i6 = 1;
                                                i7 = 182;
                                            }
                                            iVar.m(i5, i6);
                                            iVar.k(i7, c, "popContext", "()V");
                                            iVar.h(gVar2);
                                            h(iVar, c0600a);
                                            iVar.h(gVar29);
                                            iVar.h(gVar27);
                                            str7 = str37;
                                        } else {
                                            String str39 = str32;
                                            str5 = str24;
                                            str6 = str25;
                                            str8 = str26;
                                            str12 = str2;
                                            if (cls3.isEnum()) {
                                                com.github.catvod.spider.merge.A.g gVar38 = new com.github.catvod.spider.merge.A.g();
                                                com.github.catvod.spider.merge.A.g gVar39 = new com.github.catvod.spider.merge.A.g();
                                                com.github.catvod.spider.merge.A.g gVar40 = new com.github.catvod.spider.merge.A.g();
                                                c0601b.g(iVar, eVar3, c0600a, gVar40);
                                                c0601b.b(iVar, c0600a, eVar3);
                                                iVar.l(192, "java/lang/Enum");
                                                iVar.m(58, c0600a.g("enum"));
                                                c0601b.a(iVar, eVar3, c0600a, gVar40);
                                                iVar.m(25, c0600a.g("enum"));
                                                iVar.g(199, gVar38);
                                                c0601b.e(iVar, eVar3, c0600a);
                                                iVar.g(167, gVar39);
                                                iVar.h(gVar38);
                                                if (c0600a.d) {
                                                    iVar.m(25, c0600a.g(str8));
                                                    str7 = str39;
                                                    iVar.m(21, c0600a.g(str7));
                                                    iVar.m(25, 6);
                                                    iVar.m(25, c0600a.g("enum"));
                                                    iVar.k(182, "java/lang/Enum", "name", "()Ljava/lang/String;");
                                                    str13 = f;
                                                    str14 = "writeFieldValueStringWithDoubleQuote";
                                                    str15 = "(CLjava/lang/String;Ljava/lang/String;)V";
                                                } else {
                                                    str7 = str39;
                                                    iVar.m(25, c0600a.g(str8));
                                                    iVar.m(21, c0600a.g(str7));
                                                    String str40 = f;
                                                    iVar.k(182, str40, str5, str3);
                                                    iVar.m(25, c0600a.g(str8));
                                                    iVar.m(25, 6);
                                                    iVar.e(3);
                                                    iVar.k(182, str40, "writeFieldName", "(Ljava/lang/String;Z)V");
                                                    iVar.m(25, 1);
                                                    iVar.m(25, c0600a.g("enum"));
                                                    iVar.m(25, 6);
                                                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(eVar3.f)));
                                                    iVar.i(Integer.valueOf(eVar3.j));
                                                    str13 = c;
                                                    str14 = "writeWithFieldName";
                                                    str15 = "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
                                                }
                                                iVar.k(182, str13, str14, str15);
                                                c0601b.h(iVar, c0600a);
                                                iVar.h(gVar39);
                                                iVar.h(gVar40);
                                            } else {
                                                str7 = str39;
                                                com.github.catvod.spider.merge.A.g gVar41 = new com.github.catvod.spider.merge.A.g();
                                                c0601b.g(iVar, eVar3, c0600a, gVar41);
                                                c0601b.b(iVar, c0600a, eVar3);
                                                iVar.m(58, c0600a.g("object"));
                                                c0601b.a(iVar, eVar3, c0600a, gVar41);
                                                c0601b.j(iVar, eVar3, c0600a, gVar41);
                                                iVar.h(gVar41);
                                            }
                                        }
                                        str9 = str12;
                                    }
                                }
                                str5 = str24;
                                str6 = str25;
                                str12 = str2;
                                str7 = str32;
                                str8 = str26;
                                str9 = str12;
                            }
                        }
                        c0601b2.f(iVar2, eVar3, c0600a2, iG, c2);
                        i3 = i12;
                        i4 = length;
                        str5 = str24;
                        str6 = str25;
                        str12 = str2;
                        str7 = str32;
                        str8 = str26;
                        str9 = str12;
                    }
                }
                i3 = i12;
                i4 = length;
                str5 = str24;
                str12 = str2;
                str3 = str10;
                str4 = str11;
                str7 = str32;
                str6 = str25;
                str8 = str26;
                str9 = str12;
            }
            i12 = i3 + 1;
            str26 = str8;
            str31 = str3;
            str32 = str7;
            str2 = str9;
            str28 = str4;
            str25 = str6;
            length = i4;
            eVarArr2 = eVarArr;
            str24 = str5;
        }
        String str41 = str31;
        String str42 = str28;
        String str43 = str24;
        String str44 = str25;
        String str45 = str32;
        String str46 = str26;
        if (!c0600a.d) {
            iVar.m(25, 0);
            iVar.m(25, 1);
            iVar.m(25, 2);
            iVar.m(21, c0600a.g(str45));
            iVar.k(182, h, "writeAfter", C1290c.b(t0.b(str44), c, ";Ljava/lang/Object;C)C"));
            iVar.m(54, c0600a.g(str45));
        }
        com.github.catvod.spider.merge.A.g gVar42 = new com.github.catvod.spider.merge.A.g();
        com.github.catvod.spider.merge.A.g gVar43 = new com.github.catvod.spider.merge.A.g();
        iVar.m(21, c0600a.g(str45));
        iVar.f(16, 123);
        iVar.g(160, gVar42);
        iVar.m(25, c0600a.g(str46));
        iVar.m(16, 123);
        String str47 = f;
        iVar.k(182, str47, str43, str41);
        iVar.h(gVar42);
        iVar.m(25, c0600a.g(str46));
        iVar.m(16, 125);
        iVar.k(182, str47, str43, str41);
        iVar.h(gVar43);
        iVar.h(gVar);
        if (c0600a.g) {
            return;
        }
        iVar.m(25, 1);
        iVar.m(25, c0600a.g(str));
        iVar.k(182, c, "setContext", C1290c.b(t0.b(str42), i, ")V"));
    }

    public final M k(d0 d0Var) {
        String str;
        String strA;
        boolean z;
        com.github.catvod.spider.merge.H.e[] eVarArr;
        Class<?> cls;
        String str2;
        String str3;
        C0601b c0601b;
        String str4;
        boolean z2;
        boolean z3;
        String str5;
        boolean z4;
        String str6;
        boolean z5;
        boolean z6;
        String str7;
        Class<String> cls2;
        com.github.catvod.spider.merge.H.e[] eVarArr2;
        String str8;
        Method method;
        Class<String> cls3 = String.class;
        Class<d0> cls4 = d0.class;
        Class<?> cls5 = d0Var.a;
        if (cls5.isPrimitive()) {
            throw new C1415d(com.github.catvod.spider.merge.H0.j.b(cls5, t0.b("unsupportd class ")));
        }
        InterfaceC1450d interfaceC1450d = (InterfaceC1450d) com.github.catvod.spider.merge.H.A.D(cls5, InterfaceC1450d.class);
        com.github.catvod.spider.merge.H.e[] eVarArr3 = d0Var.e;
        for (com.github.catvod.spider.merge.H.e eVar : eVarArr3) {
            if (eVar.d == null && (method = eVar.c) != null && method.getDeclaringClass().isInterface()) {
                return new M(d0Var);
            }
        }
        com.github.catvod.spider.merge.H.e[] eVarArr4 = d0Var.f;
        boolean z7 = eVarArr4 == d0Var.e;
        if (eVarArr4.length > 256) {
            return new M(d0Var);
        }
        for (com.github.catvod.spider.merge.H.e eVar2 : eVarArr4) {
            if (!com.github.catvod.spider.merge.H.c.a(eVar2.g().getName())) {
                return new M(d0Var);
            }
        }
        StringBuilder sbB = t0.b("ASMSerializer_");
        sbB.append(this.b.incrementAndGet());
        sbB.append("_");
        sbB.append(cls5.getSimpleName());
        String string = sbB.toString();
        Package r5 = C0601b.class.getPackage();
        if (r5 != null) {
            String name = r5.getName();
            String str9 = name.replace('.', '/') + "/" + string;
            strA = t0.a(name, ".", string);
            str = str9;
        } else {
            str = string;
            strA = str;
        }
        com.github.catvod.spider.merge.A.d dVar = new com.github.catvod.spider.merge.A.d();
        dVar.j(str, h, new String[]{d});
        int length = eVarArr4.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = length;
            com.github.catvod.spider.merge.H.e eVar3 = eVarArr4[i2];
            if (eVar3.f.isPrimitive() || eVar3.f == cls3) {
                eVarArr2 = eVarArr3;
                str8 = strA;
            } else {
                str8 = strA;
                eVarArr2 = eVarArr3;
                new com.github.catvod.spider.merge.A.e(dVar, C1290c.b(new StringBuilder(), eVar3.b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
                if (List.class.isAssignableFrom(eVar3.f)) {
                    new com.github.catvod.spider.merge.A.e(dVar, C1290c.b(new StringBuilder(), eVar3.b, "_asm_list_item_ser_"), e);
                }
                new com.github.catvod.spider.merge.A.e(dVar, C1290c.b(new StringBuilder(), eVar3.b, "_asm_ser_"), e);
            }
            i2++;
            length = i3;
            strA = str8;
            eVarArr3 = eVarArr2;
        }
        com.github.catvod.spider.merge.H.e[] eVarArr5 = eVarArr3;
        String str10 = strA;
        StringBuilder sbB2 = t0.b("(");
        sbB2.append(com.github.catvod.spider.merge.H.c.b(cls4));
        sbB2.append(")V");
        com.github.catvod.spider.merge.A.i iVar = new com.github.catvod.spider.merge.A.i(dVar, "<init>", sbB2.toString(), null);
        iVar.m(25, 0);
        iVar.m(25, 1);
        String str11 = h;
        StringBuilder sbB3 = t0.b("(");
        sbB3.append(com.github.catvod.spider.merge.H.c.b(cls4));
        sbB3.append(")V");
        iVar.k(183, str11, "<init>", sbB3.toString());
        int i4 = 0;
        while (i4 < eVarArr4.length) {
            com.github.catvod.spider.merge.H.e eVar4 = eVarArr4[i4];
            if (eVar4.f.isPrimitive() || eVar4.f == cls3) {
                cls2 = cls3;
            } else {
                iVar.m(25, 0);
                if (eVar4.c != null) {
                    iVar.i(com.github.catvod.spider.merge.A.j.e(com.github.catvod.spider.merge.H.c.b(eVar4.h)));
                    iVar.i(eVar4.c.getName());
                    cls2 = cls3;
                    iVar.k(184, com.github.catvod.spider.merge.H.c.f(com.github.catvod.spider.merge.H.c.class), "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
                } else {
                    cls2 = cls3;
                    iVar.m(25, 0);
                    iVar.i(Integer.valueOf(i4));
                    iVar.k(183, h, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                }
                iVar.c(181, str, C1290c.b(new StringBuilder(), eVar4.b, "_asm_fieldType"), "Ljava/lang/reflect/Type;");
            }
            i4++;
            cls3 = cls2;
        }
        iVar.e(177);
        iVar.j(4, 4);
        if (interfaceC1450d != null) {
            for (i0 i0Var : interfaceC1450d.serialzeFeatures()) {
                if (i0Var == i0.DisableCircularReferenceDetect) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        int i5 = 0;
        while (i5 < 3) {
            Class<d0> cls6 = cls4;
            if (i5 == 0) {
                z5 = true;
                z6 = z;
                z4 = z6;
                str5 = "writeNormal";
                str6 = "write";
            } else {
                str5 = "writeNormal";
                if (i5 == 1) {
                    z6 = z;
                    z4 = z6;
                    str6 = str5;
                    z5 = false;
                } else {
                    z4 = z;
                    str6 = "writeDirectNonContext";
                    z5 = true;
                    z6 = true;
                }
            }
            int i6 = i5;
            String str12 = str5;
            Class<?> cls7 = cls5;
            com.github.catvod.spider.merge.H.e[] eVarArr6 = eVarArr4;
            com.github.catvod.spider.merge.A.d dVar2 = dVar;
            C0600a c0600a = new C0600a(eVarArr4, d0Var, str, z5, z6);
            StringBuilder sbB4 = t0.b("(L");
            String str13 = c;
            com.github.catvod.spider.merge.A.i iVar2 = new com.github.catvod.spider.merge.A.i(dVar2, str6, C1290c.b(sbB4, str13, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
            com.github.catvod.spider.merge.A.g gVar = new com.github.catvod.spider.merge.A.g();
            iVar2.m(25, 2);
            iVar2.g(199, gVar);
            iVar2.m(25, 1);
            iVar2.k(182, str13, "writeNull", "()V");
            iVar2.e(177);
            iVar2.h(gVar);
            iVar2.m(25, 1);
            iVar2.c(180, str13, "out", g);
            iVar2.m(58, c0600a.g("out"));
            if (z7 || c0600a.d || !(interfaceC1450d == null || interfaceC1450d.alphabetic())) {
                str7 = "(L";
            } else {
                com.github.catvod.spider.merge.A.g gVar2 = new com.github.catvod.spider.merge.A.g();
                iVar2.m(25, c0600a.g("out"));
                iVar2.k(182, f, "isSortField", "()Z");
                iVar2.g(154, gVar2);
                iVar2.m(25, 0);
                iVar2.m(25, 1);
                iVar2.m(25, 2);
                iVar2.m(25, 3);
                iVar2.m(25, 4);
                iVar2.m(21, 5);
                str7 = "(L";
                iVar2.k(182, str, "writeUnsorted", com.github.catvod.spider.merge.y.z.b(new StringBuilder(), str7, str13, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
                iVar2.e(177);
                iVar2.h(gVar2);
            }
            if (c0600a.d && !z6) {
                com.github.catvod.spider.merge.A.g gVar3 = new com.github.catvod.spider.merge.A.g();
                com.github.catvod.spider.merge.A.g gVar4 = new com.github.catvod.spider.merge.A.g();
                iVar2.m(25, 0);
                iVar2.m(25, 1);
                iVar2.k(182, h, "writeDirect", t0.a(str7, str13, ";)Z"));
                iVar2.g(154, gVar4);
                iVar2.m(25, 0);
                iVar2.m(25, 1);
                iVar2.m(25, 2);
                iVar2.m(25, 3);
                iVar2.m(25, 4);
                iVar2.m(21, 5);
                iVar2.k(182, str, str12, com.github.catvod.spider.merge.y.z.b(new StringBuilder(), str7, str13, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
                iVar2.e(177);
                iVar2.h(gVar4);
                iVar2.m(25, c0600a.g("out"));
                iVar2.i(Integer.valueOf(i0.DisableCircularReferenceDetect.b));
                iVar2.k(182, f, "isEnabled", "(I)Z");
                iVar2.g(153, gVar3);
                iVar2.m(25, 0);
                iVar2.m(25, 1);
                iVar2.m(25, 2);
                iVar2.m(25, 3);
                iVar2.m(25, 4);
                iVar2.m(21, 5);
                iVar2.k(182, str, "writeDirectNonContext", com.github.catvod.spider.merge.y.z.b(new StringBuilder(), str7, str13, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"));
                iVar2.e(177);
                iVar2.h(gVar3);
            }
            iVar2.m(25, 2);
            iVar2.l(192, com.github.catvod.spider.merge.H.c.f(cls7));
            iVar2.m(58, c0600a.g("entity"));
            m(cls7, iVar2, eVarArr6, c0600a);
            iVar2.e(177);
            iVar2.j(7, c0600a.f + 2);
            eVarArr4 = eVarArr6;
            cls5 = cls7;
            dVar = dVar2;
            cls4 = cls6;
            i5 = i6 + 1;
            z = z4;
        }
        boolean z8 = z;
        com.github.catvod.spider.merge.A.d dVar3 = dVar;
        Class<d0> cls8 = cls4;
        Class<?> cls9 = cls5;
        com.github.catvod.spider.merge.H.e[] eVarArr7 = eVarArr4;
        if (z7) {
            eVarArr = eVarArr7;
            cls = cls9;
            str2 = "entity";
            str3 = str;
            c0601b = this;
        } else {
            eVarArr = eVarArr7;
            String str14 = str;
            str3 = str;
            c0601b = this;
            str2 = "entity";
            C0600a c0600a2 = new C0600a(eVarArr7, d0Var, str14, false, z8);
            StringBuilder sbB5 = t0.b("(L");
            String str15 = c;
            com.github.catvod.spider.merge.A.i iVar3 = new com.github.catvod.spider.merge.A.i(dVar3, "writeUnsorted", C1290c.b(sbB5, str15, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
            iVar3.m(25, 1);
            iVar3.c(180, str15, "out", g);
            iVar3.m(58, c0600a2.g("out"));
            iVar3.m(25, 2);
            iVar3.l(192, com.github.catvod.spider.merge.H.c.f(cls9));
            iVar3.m(58, c0600a2.g(str2));
            cls = cls9;
            c0601b.m(cls, iVar3, eVarArr5, c0600a2);
            iVar3.e(177);
            iVar3.j(7, c0600a2.f + 2);
        }
        int i7 = 0;
        for (int i8 = 3; i7 < i8; i8 = 3) {
            if (i7 == 0) {
                str4 = "writeAsArray";
                z3 = z8;
                z2 = true;
            } else if (i7 == 1) {
                str4 = "writeAsArrayNormal";
                z3 = z8;
                z2 = false;
            } else {
                str4 = "writeAsArrayNonContext";
                z2 = true;
                z3 = true;
            }
            com.github.catvod.spider.merge.H.e[] eVarArr8 = eVarArr;
            C0600a c0600a3 = new C0600a(eVarArr, d0Var, str3, z2, z3);
            StringBuilder sbB6 = t0.b("(L");
            String str16 = c;
            com.github.catvod.spider.merge.A.i iVar4 = new com.github.catvod.spider.merge.A.i(dVar3, str4, C1290c.b(sbB6, str16, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"), new String[]{"java/io/IOException"});
            iVar4.m(25, 1);
            iVar4.c(180, str16, "out", g);
            iVar4.m(58, c0600a3.g("out"));
            iVar4.m(25, 2);
            iVar4.l(192, com.github.catvod.spider.merge.H.c.f(cls));
            iVar4.m(58, c0600a3.g(str2));
            c0601b.l(iVar4, eVarArr8, c0600a3);
            iVar4.e(177);
            iVar4.j(7, c0600a3.f + 2);
            i7++;
            eVarArr = eVarArr8;
        }
        byte[] bArrI = dVar3.i();
        return (M) c0601b.a.a(str10, bArrI, bArrI.length).getConstructor(cls8).newInstance(d0Var);
    }
}
