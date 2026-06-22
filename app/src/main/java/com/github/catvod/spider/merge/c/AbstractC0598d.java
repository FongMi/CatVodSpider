package com.github.catvod.spider.merge.C;

import com.github.catvod.spider.merge.I.t0;
import com.github.catvod.spider.merge.y.AbstractC1412a;
import com.github.catvod.spider.merge.y.C1415d;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.C.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0598d extends g {
    @Override // com.github.catvod.spider.merge.C.g, com.github.catvod.spider.merge.C.w
    public final <T> T c(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj) {
        return (T) f(bVar, type, obj, null, 0);
    }

    @Override // com.github.catvod.spider.merge.C.g
    public final <T> T f(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj, String str, int i) throws ParseException {
        Object objO;
        SimpleDateFormat simpleDateFormat;
        Object obj2;
        SimpleDateFormat simpleDateFormat2;
        com.github.catvod.spider.merge.B.d dVar = bVar.g;
        Object objO2 = null;
        objO2 = null;
        objO2 = null;
        objO2 = null;
        objO2 = null;
        if (dVar.p() == 2) {
            long jH = dVar.h();
            dVar.o(16);
            if ("unixtime".equals(str)) {
                jH *= 1000;
            }
            objO2 = Long.valueOf(jH);
        } else if (dVar.p() == 4) {
            String strK = dVar.K();
            if (str != null) {
                if ("yyyy-MM-dd HH:mm:ss.SSSSSSSSS".equals(str) && (type instanceof Class) && ((Class) type).getName().equals("java.sql.Timestamp")) {
                    return (T) com.github.catvod.spider.merge.H.m.b(com.github.catvod.spider.merge.H.A.R, strK);
                }
                try {
                    simpleDateFormat = new SimpleDateFormat(str, bVar.g.G());
                } catch (IllegalArgumentException e) {
                    if (str.contains("T")) {
                        try {
                            simpleDateFormat = new SimpleDateFormat(str.replaceAll("T", "'T'"), bVar.g.G());
                        } catch (IllegalArgumentException unused) {
                            throw e;
                        }
                    } else {
                        simpleDateFormat = null;
                    }
                }
                if (AbstractC1412a.b != null) {
                    simpleDateFormat.setTimeZone(bVar.g.M());
                }
                try {
                    obj2 = simpleDateFormat.parse(strK);
                } catch (ParseException unused2) {
                    obj2 = null;
                }
                if (obj2 == null && AbstractC1412a.c == Locale.CHINA) {
                    try {
                        simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
                    } catch (IllegalArgumentException e2) {
                        simpleDateFormat2 = simpleDateFormat;
                        if (str.contains("T")) {
                            try {
                                simpleDateFormat2 = new SimpleDateFormat(str.replaceAll("T", "'T'"), bVar.g.G());
                            } catch (IllegalArgumentException unused3) {
                                throw e2;
                            }
                        }
                    }
                    simpleDateFormat2.setTimeZone(bVar.g.M());
                    try {
                        obj2 = simpleDateFormat2.parse(strK);
                    } catch (ParseException unused4) {
                        obj2 = null;
                    }
                }
                if (obj2 != null) {
                    objO2 = obj2;
                } else if (str.equals("yyyy-MM-dd'T'HH:mm:ss.SSS") && strK.length() == 19) {
                    try {
                        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", AbstractC1412a.c);
                        simpleDateFormat3.setTimeZone(AbstractC1412a.b);
                        objO2 = simpleDateFormat3.parse(strK);
                    } catch (ParseException unused5) {
                    }
                }
            }
            if (objO2 == null) {
                dVar.o(16);
                Object obj3 = strK;
                if (dVar.l(com.github.catvod.spider.merge.B.c.AllowISO8601DateFormat)) {
                    com.github.catvod.spider.merge.B.i iVar = new com.github.catvod.spider.merge.B.i(strK);
                    Object time = strK;
                    if (iVar.x0(true)) {
                        time = iVar.S().getTime();
                    }
                    iVar.close();
                    obj3 = time;
                }
                objO2 = obj3;
            }
        } else if (dVar.p() == 8) {
            dVar.nextToken();
        } else {
            if (dVar.p() == 12) {
                dVar.nextToken();
                if (dVar.p() != 4) {
                    throw new C1415d("syntax error");
                }
                if (AbstractC1412a.d.equals(dVar.K())) {
                    dVar.nextToken();
                    bVar.a(17);
                    Type typeB = bVar.e().b(dVar.K(), null, dVar.w());
                    if (typeB != null) {
                        type = typeB;
                    }
                    bVar.a(4);
                    bVar.a(16);
                }
                dVar.a();
                if (dVar.p() != 2) {
                    StringBuilder sbB = t0.b("syntax error : ");
                    sbB.append(dVar.y());
                    throw new C1415d(sbB.toString());
                }
                long jH2 = dVar.h();
                dVar.nextToken();
                objO = Long.valueOf(jH2);
            } else if (bVar.l == 2) {
                bVar.l = 0;
                bVar.a(16);
                if (dVar.p() != 4) {
                    throw new C1415d("syntax error");
                }
                if (!"val".equals(dVar.K())) {
                    throw new C1415d("syntax error");
                }
                dVar.nextToken();
                bVar.a(17);
                objO = bVar.o(null);
            } else {
                objO2 = bVar.o(null);
            }
            objO2 = objO;
            bVar.a(13);
        }
        return (T) g(bVar, type, objO2);
    }

    protected abstract Object g(com.github.catvod.spider.merge.B.b bVar, Type type, Object obj);
}
