package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.C.C;
import com.github.catvod.spider.merge.C.C0597c;
import com.github.catvod.spider.merge.C.D;
import com.github.catvod.spider.merge.C.q;
import com.github.catvod.spider.merge.C.s;
import com.github.catvod.spider.merge.C.t;
import com.github.catvod.spider.merge.C.v;
import com.github.catvod.spider.merge.C.w;
import com.github.catvod.spider.merge.C.x;
import com.github.catvod.spider.merge.C.y;
import com.github.catvod.spider.merge.C.z;
import com.github.catvod.spider.merge.D.C0607h;
import com.github.catvod.spider.merge.D.C0609j;
import com.github.catvod.spider.merge.D.C0612m;
import com.github.catvod.spider.merge.D.C0613n;
import com.github.catvod.spider.merge.D.C0614o;
import com.github.catvod.spider.merge.D.C0616q;
import com.github.catvod.spider.merge.D.C0617s;
import com.github.catvod.spider.merge.D.C0618t;
import com.github.catvod.spider.merge.D.C0620v;
import com.github.catvod.spider.merge.D.E;
import com.github.catvod.spider.merge.D.F;
import com.github.catvod.spider.merge.D.G;
import com.github.catvod.spider.merge.D.S;
import com.github.catvod.spider.merge.D.U;
import com.github.catvod.spider.merge.D.W;
import com.github.catvod.spider.merge.D.b0;
import com.github.catvod.spider.merge.D.j0;
import com.github.catvod.spider.merge.D.r;
import com.github.catvod.spider.merge.H.A;
import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1413b;
import com.github.catvod.spider.merge.y.C1415d;
import com.github.catvod.spider.merge.y.C1416e;
import com.github.catvod.spider.merge.y.C1417f;
import com.github.catvod.spider.merge.y.N;
import com.github.catvod.spider.merge.y.X;
import com.github.catvod.spider.merge.z.InterfaceC1447a;
import com.github.catvod.spider.merge.z.InterfaceC1448b;
import com.github.catvod.spider.merge.z.InterfaceC1450d;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.xml.datatype.XMLGregorianCalendar;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class o {
    private static com.github.catvod.spider.merge.H.f<Class<?>, Boolean> A;
    private static final String[] r;
    private static final long[] u;
    public static o v;
    private static boolean w;
    private static boolean x;
    private static boolean y;
    private static boolean z;
    private boolean d;
    protected C0597c f;
    private long[] h;
    private long[] i;
    private long[] j;
    public final boolean k;
    private final Callable<Void> o;
    public static final String[] p = n(com.github.catvod.spider.merge.H.i.e("fastjson.parser.deny.internal"));
    public static final String[] q = n(com.github.catvod.spider.merge.H.i.e("fastjson.parser.deny"));
    public static final boolean s = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.parser.autoTypeSupport"));
    public static final boolean t = "true".equals(com.github.catvod.spider.merge.H.i.e("fastjson.parser.safeMode"));
    private final com.github.catvod.spider.merge.H.k<Type, w> a = new com.github.catvod.spider.merge.H.k<>();
    private final com.github.catvod.spider.merge.H.k<Type, com.github.catvod.spider.merge.H.k<Type, w>> b = new com.github.catvod.spider.merge.H.k<>(16);
    private final ConcurrentMap<String, Class<?>> c = new ConcurrentHashMap(16, 0.75f, 1);
    public final p e = new p();
    private boolean g = s;
    public boolean l = A.b;
    private List<com.github.catvod.spider.merge.E.a> m = new ArrayList();
    private boolean n = t;

    static {
        String[] strArrN = n(com.github.catvod.spider.merge.H.i.e("fastjson.parser.autoTypeAccept"));
        if (strArrN == null) {
            strArrN = new String[0];
        }
        r = strArrN;
        u = new long[]{-6976602508726000783L, -6293031534589903644L, 59775428743665658L, 7267793227937552092L};
        v = new o();
        w = false;
        x = false;
        y = false;
        z = false;
        A = new m();
    }

    public o() {
        C0597c c0597c;
        this.d = !com.github.catvod.spider.merge.H.c.a;
        this.i = new long[]{-9164606388214699518L, -8754006975464705441L, -8720046426850100497L, -8649961213709896794L, -8614556368991373401L, -8382625455832334425L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6149130139291498841L, -6149093380703242441L, -6088208984980396913L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5767141746063564198L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4836620931940850535L, -4733542790109620528L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3967588558552655563L, -3935185854875733362L, -3750763034362895579L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1800035667138631116L, -1650485814983027158L, -1589194880214235129L, -1363634950764737555L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -803541446955902575L, -731978084025273882L, -666475508176557463L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 744602970950881621L, 823641066473609950L, 860052378298585747L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1268707909007641340L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3058452313624178956L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3740226159580918099L, 3794316665763266033L, 3977090344859527316L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4215053018660518963L, 4241163808635564644L, 4254584350247334433L, 4319304524795015394L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5120543992130540564L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5916409771425455946L, 5944107969236155580L, 6007332606592876737L, 6090377589998869205L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6800727078373023163L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7164889056054194741L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8064026652676081192L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8711531061028787095L, 8735538376409180149L, 8838294710098435315L, 8861402923078831179L, 9140390920032557669L, 9140416208800006522L, 9144212112462101475L};
        long[] jArr = new long[r.length];
        int i = 0;
        while (true) {
            String[] strArr = r;
            if (i >= strArr.length) {
                break;
            }
            jArr[i] = A.z(strArr[i]);
            i++;
        }
        Arrays.sort(jArr);
        this.j = jArr;
        this.o = new l(this);
        this.k = false;
        if (com.github.catvod.spider.merge.H.c.a) {
            c0597c = null;
        } else {
            try {
                c0597c = new C0597c(new com.github.catvod.spider.merge.H.b());
            } catch (ExceptionInInitializerError | NoClassDefFoundError | AccessControlException unused) {
                c0597c = null;
            }
        }
        this.f = c0597c;
        if (c0597c == null) {
            this.d = false;
        }
        com.github.catvod.spider.merge.H.k<Type, w> kVar = this.a;
        U u2 = U.b;
        kVar.c(SimpleDateFormat.class, u2);
        com.github.catvod.spider.merge.H.k<Type, w> kVar2 = this.a;
        r rVar = r.b;
        kVar2.c(Calendar.class, rVar);
        this.a.c(XMLGregorianCalendar.class, rVar);
        com.github.catvod.spider.merge.H.k<Type, w> kVar3 = this.a;
        t tVar = t.a;
        kVar3.c(C1416e.class, tVar);
        com.github.catvod.spider.merge.H.k<Type, w> kVar4 = this.a;
        C0620v c0620v = C0620v.a;
        kVar4.c(C1413b.class, c0620v);
        this.a.c(Map.class, tVar);
        this.a.c(HashMap.class, tVar);
        this.a.c(LinkedHashMap.class, tVar);
        this.a.c(TreeMap.class, tVar);
        this.a.c(ConcurrentMap.class, tVar);
        this.a.c(ConcurrentHashMap.class, tVar);
        this.a.c(Collection.class, c0620v);
        this.a.c(List.class, c0620v);
        this.a.c(ArrayList.class, c0620v);
        com.github.catvod.spider.merge.H.k<Type, w> kVar5 = this.a;
        com.github.catvod.spider.merge.C.r rVar2 = com.github.catvod.spider.merge.C.r.a;
        kVar5.c(Object.class, rVar2);
        com.github.catvod.spider.merge.H.k<Type, w> kVar6 = this.a;
        j0 j0Var = j0.a;
        kVar6.c(String.class, j0Var);
        this.a.c(StringBuffer.class, j0Var);
        this.a.c(StringBuilder.class, j0Var);
        com.github.catvod.spider.merge.H.k<Type, w> kVar7 = this.a;
        Class cls = Character.TYPE;
        C0618t c0618t = C0618t.a;
        kVar7.c(cls, c0618t);
        this.a.c(Character.class, c0618t);
        com.github.catvod.spider.merge.H.k<Type, w> kVar8 = this.a;
        Class cls2 = Byte.TYPE;
        v vVar = v.a;
        kVar8.c(cls2, vVar);
        this.a.c(Byte.class, vVar);
        this.a.c(Short.TYPE, vVar);
        this.a.c(Short.class, vVar);
        com.github.catvod.spider.merge.H.k<Type, w> kVar9 = this.a;
        Class cls3 = Integer.TYPE;
        G g = G.a;
        kVar9.c(cls3, g);
        this.a.c(Integer.class, g);
        com.github.catvod.spider.merge.H.k<Type, w> kVar10 = this.a;
        Class cls4 = Long.TYPE;
        S s2 = S.a;
        kVar10.c(cls4, s2);
        this.a.c(Long.class, s2);
        this.a.c(BigInteger.class, C0613n.c);
        this.a.c(BigDecimal.class, C0612m.c);
        com.github.catvod.spider.merge.H.k<Type, w> kVar11 = this.a;
        Class cls5 = Float.TYPE;
        E e = E.b;
        kVar11.c(cls5, e);
        this.a.c(Float.class, e);
        this.a.c(Double.TYPE, vVar);
        this.a.c(Double.class, vVar);
        com.github.catvod.spider.merge.H.k<Type, w> kVar12 = this.a;
        Class cls6 = Boolean.TYPE;
        C0614o c0614o = C0614o.a;
        kVar12.c(cls6, c0614o);
        this.a.c(Boolean.class, c0614o);
        this.a.c(Class.class, u2);
        this.a.c(char[].class, new C0617s());
        this.a.c(AtomicBoolean.class, c0614o);
        this.a.c(AtomicInteger.class, g);
        this.a.c(AtomicLong.class, s2);
        com.github.catvod.spider.merge.H.k<Type, w> kVar13 = this.a;
        b0 b0Var = b0.a;
        kVar13.c(AtomicReference.class, b0Var);
        this.a.c(WeakReference.class, b0Var);
        this.a.c(SoftReference.class, b0Var);
        this.a.c(UUID.class, u2);
        this.a.c(TimeZone.class, u2);
        this.a.c(Locale.class, u2);
        this.a.c(Currency.class, u2);
        this.a.c(Inet4Address.class, u2);
        this.a.c(Inet6Address.class, u2);
        this.a.c(InetSocketAddress.class, u2);
        this.a.c(File.class, u2);
        this.a.c(URI.class, u2);
        this.a.c(URL.class, u2);
        this.a.c(Pattern.class, u2);
        this.a.c(Charset.class, u2);
        this.a.c(N.class, u2);
        this.a.c(Number.class, vVar);
        com.github.catvod.spider.merge.H.k<Type, w> kVar14 = this.a;
        C0607h c0607h = C0607h.a;
        kVar14.c(AtomicIntegerArray.class, c0607h);
        this.a.c(AtomicLongArray.class, c0607h);
        this.a.c(StackTraceElement.class, C.a);
        this.a.c(Serializable.class, rVar2);
        this.a.c(Cloneable.class, rVar2);
        this.a.c(Comparable.class, rVar2);
        this.a.c(Closeable.class, rVar2);
        this.a.c(C1417f.class, new com.github.catvod.spider.merge.C.p());
        com.github.catvod.spider.merge.H.m.c(this.o);
        String[] strArr2 = q;
        if (strArr2 != null) {
            for (String str : strArr2) {
                if (str != null && str.length() != 0) {
                    long jZ = A.z(str);
                    if (Arrays.binarySearch(this.i, jZ) < 0) {
                        long[] jArr2 = this.i;
                        int length = jArr2.length + 1;
                        long[] jArr3 = new long[length];
                        jArr3[length - 1] = jZ;
                        System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
                        Arrays.sort(jArr3);
                        this.i = jArr3;
                    }
                }
            }
        }
        String[] strArr3 = p;
        if (strArr3 != null) {
            for (String str2 : strArr3) {
                if (str2 != null && str2.length() != 0) {
                    long jZ2 = A.z(str2);
                    long[] jArr4 = this.h;
                    if (jArr4 == null) {
                        this.h = new long[]{jZ2};
                    } else if (Arrays.binarySearch(jArr4, jZ2) < 0) {
                        long[] jArr5 = this.h;
                        int length2 = jArr5.length + 1;
                        long[] jArr6 = new long[length2];
                        jArr6[length2 - 1] = jZ2;
                        System.arraycopy(jArr5, 0, jArr6, 0, jArr5.length);
                        Arrays.sort(jArr6);
                        this.h = jArr6;
                    }
                }
            }
        }
        String[] strArr4 = r;
        if (strArr4 == null) {
            return;
        }
        for (String str3 : strArr4) {
            if (str3 != null && str3.length() != 0) {
                long jZ3 = A.z(str3);
                if (Arrays.binarySearch(this.j, jZ3) < 0) {
                    long[] jArr7 = this.j;
                    int length3 = jArr7.length + 1;
                    long[] jArr8 = new long[length3];
                    jArr8[length3 - 1] = jZ3;
                    System.arraycopy(jArr7, 0, jArr8, 0, jArr7.length);
                    Arrays.sort(jArr8);
                    this.j = jArr8;
                }
            }
        }
    }

    private static Method g(Class cls, Class cls2) {
        for (Method method : cls.getMethods()) {
            if (Modifier.isStatic(method.getModifiers()) && method.getReturnType() == cls2 && method.getParameterTypes().length == 1 && ((InterfaceC1447a) method.getAnnotation(InterfaceC1447a.class)) != null) {
                return method;
            }
        }
        return null;
    }

    public static Field h(String str, Map<String, Field> map) {
        Field field = map.get(str);
        if (field == null) {
            field = map.get("_" + str);
        }
        if (field == null) {
            field = map.get("m_" + str);
        }
        if (field != null) {
            return field;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] - ' ');
            field = map.get(new String(charArray));
        }
        if (str.length() <= 2) {
            return field;
        }
        char cCharAt2 = str.charAt(1);
        if (cCharAt < 'a' || cCharAt > 'z' || cCharAt2 < 'A' || cCharAt2 > 'Z') {
            return field;
        }
        for (Map.Entry<String, Field> entry : map.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                return entry.getValue();
            }
        }
        return field;
    }

    public static boolean i(Class<?> cls) {
        Boolean boolValueOf = Boolean.valueOf(cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls.isEnum());
        if (!boolValueOf.booleanValue()) {
            boolValueOf = (Boolean) com.github.catvod.spider.merge.H.m.b(A, cls);
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public static void k(Class<?> cls, Map<String, Field> map) {
        for (Field field : cls.getDeclaredFields()) {
            String name = field.getName();
            if (!map.containsKey(name)) {
                map.put(name, field);
            }
        }
        if (cls.getSuperclass() == null || cls.getSuperclass() == Object.class) {
            return;
        }
        k(cls.getSuperclass(), map);
    }

    private static String[] n(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.split(",");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class<?> b(java.lang.String r21, java.lang.Class<?> r22, int r23) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.B.o.b(java.lang.String, java.lang.Class, int):java.lang.Class");
    }

    public final w c(Class<?> cls, Type type) {
        InterfaceC1448b interfaceC1448bC;
        Method method;
        C0597c c0597c;
        boolean zA = this.d & (!this.k);
        if (zA) {
            InterfaceC1450d interfaceC1450d = (InterfaceC1450d) A.D(cls, InterfaceC1450d.class);
            if (interfaceC1450d != null) {
                Class<?> clsDeserializer = interfaceC1450d.deserializer();
                if (clsDeserializer != Void.class) {
                    try {
                        Object objNewInstance = clsDeserializer.newInstance();
                        if (objNewInstance instanceof w) {
                            return (w) objNewInstance;
                        }
                    } catch (Throwable unused) {
                    }
                }
                zA = interfaceC1450d.asm() && interfaceC1450d.parseFeatures().length == 0;
            }
            if (zA) {
                Class<?> clsE = com.github.catvod.spider.merge.H.l.e(cls, interfaceC1450d);
                if (clsE == null) {
                    clsE = cls;
                }
                while (true) {
                    if (!Modifier.isPublic(clsE.getModifiers())) {
                        zA = false;
                        break;
                    }
                    clsE = clsE.getSuperclass();
                    if (clsE == Object.class || clsE == null) {
                        break;
                    }
                }
            }
        }
        if (cls.getTypeParameters().length != 0) {
            zA = false;
        }
        if (zA && (c0597c = this.f) != null && c0597c.a.b(cls)) {
            zA = false;
        }
        if (zA) {
            zA = com.github.catvod.spider.merge.H.c.a(cls.getSimpleName());
        }
        if (zA) {
            if (cls.isInterface()) {
                zA = false;
            }
            boolean z2 = A.b;
            com.github.catvod.spider.merge.H.l lVarB = com.github.catvod.spider.merge.H.l.b(cls, type, false);
            if (zA && lVarB.h.length > 200) {
                zA = false;
            }
            Constructor<?> constructor = lVarB.c;
            if (zA && constructor == null && !cls.isInterface()) {
                zA = false;
            }
            for (com.github.catvod.spider.merge.H.e eVar : lVarB.h) {
                if (!eVar.i) {
                    Class<?> cls2 = eVar.f;
                    if (Modifier.isPublic(cls2.getModifiers()) && ((!cls2.isMemberClass() || Modifier.isStatic(cls2.getModifiers())) && ((eVar.g() == null || com.github.catvod.spider.merge.H.c.a(eVar.g().getName())) && (((interfaceC1448bC = eVar.c()) == null || (com.github.catvod.spider.merge.H.c.a(interfaceC1448bC.name()) && interfaceC1448bC.format().length() == 0 && interfaceC1448bC.deserializeUsing() == Void.class && interfaceC1448bC.parseFeatures().length == 0 && !interfaceC1448bC.unwrapped())) && (((method = eVar.c) == null || method.getParameterTypes().length <= 1) && (!cls2.isEnum() || (f(cls2) instanceof com.github.catvod.spider.merge.C.j))))))) {
                    }
                }
                zA = false;
                break;
            }
        }
        if (zA && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            zA = false;
        }
        if (zA && A.k0(cls)) {
            zA = false;
        }
        if (!zA) {
            return new q(this, cls, type);
        }
        boolean z3 = A.b;
        com.github.catvod.spider.merge.H.l lVarB2 = com.github.catvod.spider.merge.H.l.b(cls, type, false);
        try {
            return this.f.o(this, lVarB2);
        } catch (C1415d unused2) {
            return new q(this, lVarB2);
        } catch (NoSuchMethodException unused3) {
            return new q(this, cls, type);
        } catch (Exception e) {
            throw new C1415d(com.github.catvod.spider.merge.H0.j.b(cls, t0.b("create asm deserializer error, ")), e);
        }
    }

    public final w d(Type type) {
        w wVarB;
        Type typeC = AbstractC1412a.c(type);
        if (typeC == null) {
            wVarB = this.a.b(type);
        } else {
            com.github.catvod.spider.merge.H.k<Type, w> kVarB = this.b.b(type);
            if (kVarB == null) {
                return null;
            }
            wVarB = kVarB.b(typeC);
        }
        return wVarB;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.merge.E.a>] */
    public final w e(Class<?> cls, Type type) {
        w d;
        Class<?> clsMappingTo;
        Type type2 = type;
        w wVarD = d(type2);
        if (wVarD == null && (type2 instanceof com.github.catvod.spider.merge.H.n)) {
            wVarD = d(X.a((com.github.catvod.spider.merge.H.n) type2));
        }
        if (wVarD != null) {
            return wVarD;
        }
        if (type2 == null) {
            type2 = cls;
        }
        w wVarD2 = d(type2);
        if (wVarD2 != null) {
            return wVarD2;
        }
        InterfaceC1450d interfaceC1450d = (InterfaceC1450d) A.D(cls, InterfaceC1450d.class);
        if (interfaceC1450d != null && (clsMappingTo = interfaceC1450d.mappingTo()) != Void.class) {
            return e(clsMappingTo, clsMappingTo);
        }
        if ((type2 instanceof WildcardType) || (type2 instanceof TypeVariable) || (type2 instanceof ParameterizedType)) {
            wVarD2 = d(cls);
        }
        if (wVarD2 != null) {
            return wVarD2;
        }
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            wVarD2 = ((com.github.catvod.spider.merge.E.a) it.next()).b();
            if (wVarD2 != null) {
                l(type2, wVarD2);
                return wVarD2;
            }
        }
        String strReplace = cls.getName().replace('$', '.');
        if (strReplace.startsWith("java.awt.") && C0609j.j(cls) && !w) {
            String[] strArr = {"java.awt.Point", "java.awt.Font", "java.awt.Rectangle", "java.awt.Color"};
            for (int i = 0; i < 4; i++) {
                try {
                    String str = strArr[i];
                    if (str.equals(strReplace)) {
                        Type cls2 = Class.forName(str);
                        w wVar = C0609j.a;
                        l(cls2, wVar);
                        return wVar;
                    }
                } catch (Throwable unused) {
                    w = true;
                }
            }
            wVarD2 = C0609j.a;
        }
        if (!x) {
            try {
                if (strReplace.startsWith("java.time.")) {
                    String[] strArr2 = {"java.time.LocalDateTime", "java.time.LocalDate", "java.time.LocalTime", "java.time.ZonedDateTime", "java.time.OffsetDateTime", "java.time.OffsetTime", "java.time.ZoneOffset", "java.time.ZoneRegion", "java.time.ZoneId", "java.time.Period", "java.time.Duration", "java.time.Instant"};
                    int i2 = 0;
                    for (int i3 = 12; i2 < i3; i3 = 12) {
                        String str2 = strArr2[i2];
                        if (str2.equals(strReplace)) {
                            Type cls3 = Class.forName(str2);
                            w wVar2 = s.a;
                            l(cls3, wVar2);
                            return wVar2;
                        }
                        i2++;
                    }
                } else if (strReplace.startsWith("java.util.Optional")) {
                    String[] strArr3 = {"java.util.Optional", "java.util.OptionalDouble", "java.util.OptionalInt", "java.util.OptionalLong"};
                    for (int i4 = 0; i4 < 4; i4++) {
                        String str3 = strArr3[i4];
                        if (str3.equals(strReplace)) {
                            Type cls4 = Class.forName(str3);
                            w wVar3 = x.a;
                            l(cls4, wVar3);
                            return wVar3;
                        }
                    }
                }
            } catch (Throwable unused2) {
                x = true;
            }
        }
        if (!y) {
            try {
                if (strReplace.startsWith("org.joda.time.")) {
                    String[] strArr4 = {"org.joda.time.DateTime", "org.joda.time.LocalDate", "org.joda.time.LocalDateTime", "org.joda.time.LocalTime", "org.joda.time.Instant", "org.joda.time.Period", "org.joda.time.Duration", "org.joda.time.DateTimeZone", "org.joda.time.format.DateTimeFormatter"};
                    for (int i5 = 0; i5 < 9; i5++) {
                        String str4 = strArr4[i5];
                        if (str4.equals(strReplace)) {
                            Type cls5 = Class.forName(str4);
                            wVarD2 = com.github.catvod.spider.merge.D.N.a;
                            l(cls5, wVarD2);
                            return wVarD2;
                        }
                    }
                }
            } catch (Throwable unused3) {
                y = true;
            }
        }
        if (!z && strReplace.startsWith("com.google.common.collect.")) {
            try {
                String[] strArr5 = {"com.google.common.collect.HashMultimap", "com.google.common.collect.LinkedListMultimap", "com.google.common.collect.LinkedHashMultimap", "com.google.common.collect.ArrayListMultimap", "com.google.common.collect.TreeMultimap"};
                for (int i6 = 0; i6 < 5; i6++) {
                    String str5 = strArr5[i6];
                    if (str5.equals(strReplace)) {
                        Type cls6 = Class.forName(str5);
                        wVarD2 = F.a;
                        l(cls6, wVarD2);
                        return wVarD2;
                    }
                }
            } catch (ClassNotFoundException unused4) {
                z = true;
            }
        }
        if (strReplace.equals("java.nio.ByteBuffer")) {
            wVarD2 = C0616q.a;
            l(cls, wVarD2);
        }
        if (strReplace.equals("java.nio.file.Path")) {
            wVarD2 = U.b;
            l(cls, wVarD2);
        }
        if (cls == Map.Entry.class) {
            wVarD2 = U.b;
            l(cls, wVarD2);
        }
        if (strReplace.equals("org.javamoney.moneta.Money")) {
            wVarD2 = com.github.catvod.spider.merge.F.a.a;
            l(cls, wVarD2);
        }
        try {
            for (com.github.catvod.spider.merge.C.f fVar : com.github.catvod.spider.merge.H.q.a(com.github.catvod.spider.merge.C.f.class, Thread.currentThread().getContextClassLoader())) {
                Iterator<Type> it2 = fVar.a().iterator();
                while (it2.hasNext()) {
                    l(it2.next(), fVar);
                }
            }
        } catch (Exception unused5) {
        }
        if (wVarD2 == null) {
            wVarD2 = d(type2);
        }
        if (wVarD2 != null) {
            return wVarD2;
        }
        if (cls.isEnum()) {
            Class<?> cls7 = (Class) AbstractC1412a.c(cls);
            InterfaceC1450d interfaceC1450d2 = (InterfaceC1450d) A.D(cls7 != null ? cls7 : cls, InterfaceC1450d.class);
            if (interfaceC1450d2 != null) {
                try {
                    w wVar4 = (w) interfaceC1450d2.deserializer().newInstance();
                    l(cls, wVar4);
                    return wVar4;
                } catch (Throwable unused6) {
                }
            }
            Method methodG = null;
            if (cls7 != null) {
                Method methodG2 = g(cls7, cls);
                if (methodG2 != null) {
                    try {
                        methodG = cls.getMethod(methodG2.getName(), methodG2.getParameterTypes());
                    } catch (Exception unused7) {
                    }
                }
            } else {
                methodG = g(cls, cls);
            }
            if (methodG != null) {
                w iVar = new com.github.catvod.spider.merge.C.i(methodG);
                l(cls, iVar);
                return iVar;
            }
            d = new com.github.catvod.spider.merge.C.j(cls);
        } else {
            d = cls.isArray() ? W.a : (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) ? C0620v.a : Map.class.isAssignableFrom(cls) ? t.a : Throwable.class.isAssignableFrom(cls) ? new D(this, cls) : y.class.isAssignableFrom(cls) ? new z(cls) : cls == InetAddress.class ? U.b : c(cls, type2);
        }
        l(type2, d);
        return d;
    }

    public final w f(Type type) {
        w wVarD = d(type);
        if (wVarD != null) {
            return wVarD;
        }
        if (type instanceof Class) {
            return e((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return rawType instanceof Class ? e((Class) rawType, type) : f(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return f(upperBounds[0]);
            }
        }
        return com.github.catvod.spider.merge.C.r.a;
    }

    public final boolean j() {
        return this.n;
    }

    public final void l(Type type, w wVar) {
        Type typeC = AbstractC1412a.c(type);
        if (typeC == null) {
            this.a.c(type, wVar);
            return;
        }
        com.github.catvod.spider.merge.H.k<Type, w> kVarB = this.b.b(type);
        if (kVarB == null) {
            kVarB = new com.github.catvod.spider.merge.H.k<>(4);
            this.b.c(type, kVarB);
        }
        kVarB.c(typeC, wVar);
    }

    public final void m() {
        this.d = false;
    }
}
