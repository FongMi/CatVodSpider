package com.github.catvod.spider.merge.A;

import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.M.C0032b;
import com.github.catvod.spider.merge.P.C0081a;
import com.github.catvod.spider.merge.c.RunnableC0098b;
import com.github.catvod.spider.merge.l.AbstractC0130b;
import com.github.catvod.spider.merge.l.C0132d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Dns;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final class C0019u implements com.github.catvod.spider.merge.N.p {
    public Object a;

    public /* synthetic */ C0019u(byte b) {
    }

    public static OkHttpClient d() {
        Dns dnsSafeDns;
        try {
            OkHttpClient okHttpClientClient = Spider.client();
            okHttpClientClient.getClass();
            return okHttpClientClient;
        } catch (Throwable unused) {
            C0019u c0019u = AbstractC0130b.a;
            OkHttpClient okHttpClient = (OkHttpClient) c0019u.a;
            if (okHttpClient != null) {
                return okHttpClient;
            }
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            try {
                dnsSafeDns = Spider.safeDns();
                dnsSafeDns.getClass();
            } catch (Throwable unused2) {
                dnsSafeDns = Dns.SYSTEM;
            }
            OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.merge.l.a
                @Override // javax.net.ssl.HostnameVerifier
                public final boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            }).sslSocketFactory(new C0132d(), C0132d.d).build();
            c0019u.a = okHttpClientBuild;
            return okHttpClientBuild;
        }
    }

    public static com.github.catvod.spider.merge.M.O f(String str, String str2, HashMap map) {
        Request.Builder builder = new Request.Builder();
        builder.post(!TextUtils.isEmpty(str2) ? RequestBody.create(MediaType.get("application/json; charset=utf-8"), str2) : new FormBody.Builder().build());
        if (map != null) {
            for (String str3 : map.keySet()) {
                builder.addHeader(str3, (String) map.get(str3));
            }
        }
        try {
            Response responseExecute = d().newCall(builder.url(str).build()).execute();
            int iCode = responseExecute.code();
            String strString = responseExecute.body().string();
            responseExecute.headers().toMultimap();
            return new com.github.catvod.spider.merge.M.O(iCode, strString);
        } catch (IOException unused) {
            return new com.github.catvod.spider.merge.M.O();
        }
    }

    public static com.github.catvod.spider.merge.M.O g(String str, HashMap map, HashMap map2) {
        RequestBody requestBodyBuild;
        Request.Builder builder = new Request.Builder();
        if (TextUtils.isEmpty(null)) {
            FormBody.Builder builder2 = new FormBody.Builder();
            for (String str2 : map.keySet()) {
                builder2.add(str2, (String) map.get(str2));
            }
            requestBodyBuild = builder2.build();
        } else {
            requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), (String) null);
        }
        builder.post(requestBodyBuild);
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                builder.addHeader(str3, (String) map2.get(str3));
            }
        }
        try {
            Response responseExecute = d().newCall(builder.url(str).build()).execute();
            int iCode = responseExecute.code();
            String strString = responseExecute.body().string();
            responseExecute.headers().toMultimap();
            return new com.github.catvod.spider.merge.M.O(iCode, strString);
        } catch (IOException unused) {
            return new com.github.catvod.spider.merge.M.O();
        }
    }

    public static void j(String str) {
        Init.run(new RunnableC0098b(1, str));
    }

    public static String k(String str, HashMap map) {
        com.github.catvod.spider.merge.M.O o;
        if (!str.startsWith("http")) {
            return "";
        }
        Request.Builder builder = new Request.Builder();
        if (map != null) {
            for (String str2 : map.keySet()) {
                builder.addHeader(str2, (String) map.get(str2));
            }
        }
        try {
            Response responseExecute = d().newCall(builder.url(str).build()).execute();
            int iCode = responseExecute.code();
            String strString = responseExecute.body().string();
            responseExecute.headers().toMultimap();
            o = new com.github.catvod.spider.merge.M.O(iCode, strString);
        } catch (IOException unused) {
            o = new com.github.catvod.spider.merge.M.O();
        }
        return o.g();
    }

    @Override // com.github.catvod.spider.merge.N.p
    public void a(com.github.catvod.spider.merge.L.q qVar, int i) {
        if ((qVar instanceof com.github.catvod.spider.merge.L.l) && ((com.github.catvod.spider.merge.L.l) qVar).d.c && (qVar.n() instanceof com.github.catvod.spider.merge.L.s)) {
            StringBuilder sb = (StringBuilder) this.a;
            if (com.github.catvod.spider.merge.L.s.B(sb)) {
                return;
            }
            sb.append(' ');
        }
    }

    @Override // com.github.catvod.spider.merge.N.p
    public void b(com.github.catvod.spider.merge.L.q qVar, int i) {
        boolean z = qVar instanceof com.github.catvod.spider.merge.L.s;
        StringBuilder sb = (StringBuilder) this.a;
        if (z) {
            com.github.catvod.spider.merge.L.s sVar = (com.github.catvod.spider.merge.L.s) qVar;
            String strY = sVar.y();
            if (com.github.catvod.spider.merge.L.l.J(sVar.a) || (sVar instanceof com.github.catvod.spider.merge.L.d)) {
                sb.append(strY);
                return;
            } else {
                com.github.catvod.bean.b.a(sb, strY, com.github.catvod.spider.merge.L.s.B(sb));
                return;
            }
        }
        if (qVar instanceof com.github.catvod.spider.merge.L.l) {
            com.github.catvod.spider.merge.L.l lVar = (com.github.catvod.spider.merge.L.l) qVar;
            if (sb.length() > 0) {
                com.github.catvod.spider.merge.M.E e = lVar.d;
                if ((e.c || e.b.equals("br")) && !com.github.catvod.spider.merge.L.s.B(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    public void c(AbstractC0008i abstractC0008i, Q q, com.github.catvod.spider.merge.C.f fVar, HashSet hashSet, BitSet bitSet) throws Throwable {
        com.github.catvod.spider.merge.C.f fVar2;
        X x;
        AbstractC0008i abstractC0008i2 = abstractC0008i;
        Q q2 = q;
        if (hashSet.add(new C0001b(abstractC0008i2, 0, q2))) {
            if (abstractC0008i2 == null) {
                if (q2 == null) {
                    fVar.a(-2);
                    return;
                } else if (q.f()) {
                    fVar.a(-1);
                    return;
                }
            }
            boolean z = abstractC0008i2 instanceof W;
            C0000a c0000a = (C0000a) this.a;
            if (z) {
                if (q2 == null) {
                    fVar.a(-2);
                    return;
                }
                if (q.f()) {
                    fVar.a(-1);
                    return;
                }
                if (q2 != Q.b) {
                    boolean z2 = bitSet.get(abstractC0008i2.c);
                    try {
                        bitSet.clear(abstractC0008i2.c);
                        for (int i = 0; i < q.h(); i++) {
                            c((AbstractC0008i) c0000a.a.get(q2.d(i)), q2.c(i), fVar, hashSet, bitSet);
                        }
                        if (z2) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z2) {
                            bitSet.set(abstractC0008i2.c);
                        }
                    }
                }
            }
            int size = abstractC0008i2.e.size();
            int i2 = 0;
            while (i2 < size) {
                l0 l0VarC = abstractC0008i2.c(i2);
                if (l0VarC.getClass() == X.class) {
                    X x2 = (X) l0VarC;
                    if (bitSet.get(x2.a.c)) {
                        continue;
                    } else {
                        f0 f0VarI = f0.i(q2, x2.c.b);
                        try {
                            bitSet.set(((X) l0VarC).a.c);
                            x = x2;
                            try {
                                c(l0VarC.a, f0VarI, fVar, hashSet, bitSet);
                                bitSet.clear(x.a.c);
                            } catch (Throwable th) {
                                th = th;
                                bitSet.clear(x.a.c);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            x = x2;
                        }
                    }
                } else if ((l0VarC instanceof AbstractC0009j) || l0VarC.b()) {
                    c(l0VarC.a, q, fVar, hashSet, bitSet);
                } else if (l0VarC.getClass() == m0.class) {
                    int i3 = c0000a.f;
                    com.github.catvod.spider.merge.C.f fVar3 = new com.github.catvod.spider.merge.C.f(new int[0]);
                    fVar3.b(1, i3);
                    fVar.c(fVar3);
                } else {
                    com.github.catvod.spider.merge.C.f fVarC = l0VarC.c();
                    if (fVarC != null) {
                        if (l0VarC instanceof J) {
                            int i4 = c0000a.f;
                            com.github.catvod.spider.merge.C.f fVar4 = new com.github.catvod.spider.merge.C.f(new int[0]);
                            fVar4.b(1, i4);
                            if (fVar4.e()) {
                                fVarC = null;
                            } else {
                                if (fVarC.e()) {
                                    fVar2 = new com.github.catvod.spider.merge.C.f(fVar4);
                                } else if (fVar4.e()) {
                                    fVar2 = new com.github.catvod.spider.merge.C.f(new int[0]);
                                } else {
                                    fVar2 = new com.github.catvod.spider.merge.C.f(fVar4);
                                    if (!fVarC.e()) {
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (i5 < fVar2.a.size()) {
                                            ArrayList arrayList = fVarC.a;
                                            if (i6 >= arrayList.size()) {
                                                break;
                                            }
                                            com.github.catvod.spider.merge.C.e eVar = (com.github.catvod.spider.merge.C.e) fVar2.a.get(i5);
                                            com.github.catvod.spider.merge.C.e eVar2 = (com.github.catvod.spider.merge.C.e) arrayList.get(i6);
                                            int i7 = eVar2.b;
                                            int i8 = eVar.a;
                                            if (i7 < i8) {
                                                i6++;
                                            } else {
                                                int i9 = eVar2.a;
                                                int i10 = eVar.b;
                                                if (i9 > i10) {
                                                    i5++;
                                                } else {
                                                    com.github.catvod.spider.merge.C.e eVar3 = i9 > i8 ? new com.github.catvod.spider.merge.C.e(i8, i9 - 1) : null;
                                                    com.github.catvod.spider.merge.C.e eVar4 = i7 < i10 ? new com.github.catvod.spider.merge.C.e(i7 + 1, i10) : null;
                                                    if (eVar3 != null) {
                                                        if (eVar4 != null) {
                                                            fVar2.a.set(i5, eVar3);
                                                            i5++;
                                                            fVar2.a.add(i5, eVar4);
                                                            i6++;
                                                        } else {
                                                            fVar2.a.set(i5, eVar3);
                                                            i5++;
                                                        }
                                                    } else if (eVar4 != null) {
                                                        fVar2.a.set(i5, eVar4);
                                                        i6++;
                                                    } else {
                                                        fVar2.a.remove(i5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                fVarC = fVar2;
                            }
                        }
                        fVar.c(fVarC);
                    }
                }
                i2++;
                abstractC0008i2 = abstractC0008i;
                q2 = q;
            }
        }
    }

    public Object e(Object obj, Object obj2) {
        Map map = (Map) ((LinkedHashMap) this.a).get(obj);
        if (map == null) {
            return null;
        }
        return map.get(obj2);
    }

    public void h(Object obj, Object obj2, Q q) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        Map linkedHashMap2 = (Map) linkedHashMap.get(obj);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(obj, linkedHashMap2);
        } else {
            linkedHashMap2.get(obj2);
        }
        linkedHashMap2.put(obj2, q);
    }

    public LinkedList i(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            com.github.catvod.spider.merge.P.A a = new com.github.catvod.spider.merge.P.A(new com.github.catvod.spider.merge.z.h(new C0081a(com.github.catvod.spider.merge.R.h.a(str))));
            a.d = new com.github.catvod.spider.merge.U.a();
            com.github.catvod.spider.merge.Q.b bVar = (com.github.catvod.spider.merge.Q.b) a.v().a(new com.github.catvod.spider.merge.Q.c((com.github.catvod.spider.merge.N.e) this.a));
            if (bVar == null) {
                linkedList.add(new com.github.catvod.spider.merge.O.a(""));
                return linkedList;
            }
            Object obj = bVar.a;
            if (obj instanceof com.github.catvod.spider.merge.N.e) {
                Iterator<E> it = ((com.github.catvod.spider.merge.N.e) obj).iterator();
                while (it.hasNext()) {
                    linkedList.add(new com.github.catvod.spider.merge.O.a((com.github.catvod.spider.merge.L.l) it.next()));
                }
                return linkedList;
            }
            if (obj instanceof List) {
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    linkedList.add(new com.github.catvod.spider.merge.O.a((String) it2.next()));
                }
                return linkedList;
            }
            if (obj instanceof String) {
                linkedList.add(new com.github.catvod.spider.merge.O.a(bVar.e()));
                return linkedList;
            }
            if (obj instanceof Number) {
                Class<?> cls = obj == null ? Object.class : obj.getClass();
                linkedList.add((cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Integer.class)) ? new com.github.catvod.spider.merge.O.a(bVar.d()) : new com.github.catvod.spider.merge.O.a(bVar.c()));
                return linkedList;
            }
            if (obj instanceof Boolean) {
                linkedList.add(new com.github.catvod.spider.merge.O.a(bVar.a()));
                return linkedList;
            }
            if (obj instanceof Date) {
                linkedList.add(new com.github.catvod.spider.merge.O.a(bVar.b()));
                return linkedList;
            }
            linkedList.add(new com.github.catvod.spider.merge.O.a(bVar.e()));
            return linkedList;
        } catch (Exception e) {
            throw new com.github.catvod.spider.merge.I.a("Please check the syntax of your xpath expr or commit a " + com.github.catvod.spider.merge.R.d.a(e), e);
        }
    }

    public C0019u(int i) {
        switch (i) {
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public C0019u(C0032b c0032b) {
        this.a = new com.github.catvod.spider.merge.M.C();
    }

    public /* synthetic */ C0019u(Object obj) {
        this.a = obj;
    }
}
