package com.github.catvod.spider.merge.A0;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
import java.util.Stack;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class xa implements ub, fd {
    public final /* synthetic */ int a;
    public Object d;

    public xa(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.d = new HashMap();
                break;
        }
    }

    public /* synthetic */ xa(int i, Object obj) {
        this.a = i;
        this.d = obj;
    }

    public xa(zl zlVar) {
        this.a = 6;
        this.d = new kx(0);
    }

    @Override // com.github.catvod.spider.merge.A0.fd
    public void b(fw fwVar, int i) {
        if (fwVar instanceof ed) {
            ed edVar = (ed) fwVar;
            fw fwVarAx = fwVar.ax();
            if (edVar.g.e) {
                if ((fwVarAx instanceof vy) || ((fwVarAx instanceof ed) && !((ed) fwVarAx).g.f)) {
                    StringBuilder sb = (StringBuilder) this.d;
                    if (vy.h(sb)) {
                        return;
                    }
                    sb.append(' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.A0.fd
    public void c(fw fwVar, int i) {
        boolean z = fwVar instanceof vy;
        StringBuilder sb = (StringBuilder) this.d;
        if (z) {
            vy vyVar = (vy) fwVar;
            String strF = vyVar.f();
            if (ed.k(vyVar.ap) || (vyVar instanceof rm)) {
                sb.append(strF);
                return;
            } else {
                ws.f(sb, strF, vy.h(sb));
                return;
            }
        }
        if (fwVar instanceof ed) {
            ed edVar = (ed) fwVar;
            if (sb.length() > 0) {
                if ((edVar.g.e || edVar.aw("br")) && !vy.h(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    public void e(lq lqVar, xr xrVar, ii iiVar, HashSet hashSet, BitSet bitSet) {
        ii iiVar2;
        abw abwVar;
        lq lqVar2 = lqVar;
        xr xrVar2 = xrVar;
        if (hashSet.add(new jk(lqVar2, 0, xrVar2))) {
            if (lqVar2 == null) {
                if (xrVar2 == null) {
                    iiVar.c(-2);
                    return;
                } else if (xrVar.c()) {
                    iiVar.c(-1);
                    return;
                }
            }
            boolean z = lqVar2 instanceof hy;
            jj jjVar = (jj) this.d;
            if (z) {
                if (xrVar2 == null) {
                    iiVar.c(-2);
                    return;
                }
                if (xrVar.c()) {
                    iiVar.c(-1);
                    return;
                }
                if (xrVar2 != xr.h) {
                    boolean z2 = bitSet.get(lqVar2.f);
                    try {
                        bitSet.clear(lqVar2.f);
                        for (int i = 0; i < xrVar.d(); i++) {
                            e((lq) jjVar.a.get(xrVar2.b(i)), xrVar2.a(i), iiVar, hashSet, bitSet);
                        }
                        if (z2) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (z2) {
                            bitSet.set(lqVar2.f);
                        }
                    }
                }
            }
            int size = lqVar2.h.size();
            int i2 = 0;
            while (i2 < size) {
                nw nwVarK = lqVar2.k(i2);
                if (nwVarK.getClass() == abw.class) {
                    abw abwVar2 = (abw) nwVarK;
                    if (bitSet.get(abwVar2.g.f)) {
                        continue;
                    } else {
                        ga gaVarG = ga.g(xrVar2, abwVar2.f.e);
                        try {
                            bitSet.set(((abw) nwVarK).g.f);
                            abwVar = abwVar2;
                            try {
                                e(nwVarK.g, gaVarG, iiVar, hashSet, bitSet);
                                bitSet.clear(abwVar.g.f);
                            } catch (Throwable th) {
                                th = th;
                                bitSet.clear(abwVar.g.f);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            abwVar = abwVar2;
                        }
                    }
                } else if (nwVarK instanceof pk) {
                    e(nwVarK.g, xrVar, iiVar, hashSet, bitSet);
                } else if (nwVarK.e()) {
                    e(nwVarK.g, xrVar, iiVar, hashSet, bitSet);
                } else if (nwVarK.getClass() == iy.class) {
                    int i3 = jjVar.f;
                    ii iiVar3 = new ii(new int[0]);
                    iiVar3.d(1, i3);
                    iiVar.e(iiVar3);
                } else {
                    ii iiVarC = nwVarK.c();
                    if (iiVarC != null) {
                        if (nwVarK instanceof ju) {
                            int i4 = jjVar.f;
                            ii iiVar4 = new ii(new int[0]);
                            iiVar4.d(1, i4);
                            if (iiVar4.g()) {
                                iiVarC = null;
                            } else {
                                if (iiVarC.g()) {
                                    iiVar2 = new ii(iiVar4);
                                } else if (iiVar4.g()) {
                                    iiVar2 = new ii(new int[0]);
                                } else {
                                    iiVar2 = new ii(iiVar4);
                                    if (!iiVarC.g()) {
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (i5 < iiVar2.a.size()) {
                                            ArrayList arrayList = iiVarC.a;
                                            if (i6 >= arrayList.size()) {
                                                break;
                                            }
                                            bd bdVar = (bd) iiVar2.a.get(i5);
                                            bd bdVar2 = (bd) arrayList.get(i6);
                                            int i7 = bdVar2.c;
                                            int i8 = bdVar.b;
                                            if (i7 < i8) {
                                                i6++;
                                            } else {
                                                int i9 = bdVar2.b;
                                                int i10 = bdVar.c;
                                                if (i9 > i10) {
                                                    i5++;
                                                } else {
                                                    bd bdVar3 = i9 > i8 ? new bd(i8, i9 - 1) : null;
                                                    bd bdVar4 = i7 < i10 ? new bd(i7 + 1, i10) : null;
                                                    if (bdVar3 != null) {
                                                        if (bdVar4 != null) {
                                                            iiVar2.a.set(i5, bdVar3);
                                                            i5++;
                                                            iiVar2.a.add(i5, bdVar4);
                                                            i6++;
                                                        } else {
                                                            iiVar2.a.set(i5, bdVar3);
                                                            i5++;
                                                        }
                                                    } else if (bdVar4 != null) {
                                                        iiVar2.a.set(i5, bdVar4);
                                                        i6++;
                                                    } else {
                                                        iiVar2.a.remove(i5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                iiVarC = iiVar2;
                            }
                        }
                        iiVar.e(iiVarC);
                    }
                }
                i2++;
                lqVar2 = lqVar;
                xrVar2 = xrVar;
            }
        }
    }

    public Object f(xr xrVar, xr xrVar2) {
        Map map = (Map) ((LinkedHashMap) this.d).get(xrVar);
        if (map == null) {
            return null;
        }
        return map.get(xrVar2);
    }

    public void g(xr xrVar, xr xrVar2, xr xrVar3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        Map linkedHashMap2 = (Map) linkedHashMap.get(xrVar);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(xrVar, linkedHashMap2);
        } else {
            linkedHashMap2.get(xrVar2);
        }
        linkedHashMap2.put(xrVar2, xrVar3);
    }

    public LinkedList h(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            zc zcVar = new zc(aai.a(str));
            zcVar.r = new fu(zcVar, zc.e, zc.a, zc.b);
            tp tpVar = new tp();
            tpVar.b = new ArrayList(100);
            tpVar.c = -1;
            tpVar.a = zcVar;
            wl wlVar = new wl(tpVar);
            wlVar.r = new ol(wlVar, wl.y, wl.u, wl.v);
            wlVar.a = new ads();
            ci ciVarAk = wlVar.ak();
            rp rpVar = (rp) this.d;
            uv uvVar = new uv();
            uvVar.a = LoggerFactory.getLogger((Class<?>) uv.class);
            Stack stack = new Stack();
            uvVar.b = stack;
            rg rgVar = new rg(rpVar);
            uvVar.c = rgVar;
            rg rgVar2 = new rg(rpVar);
            rgVar2.c = rgVar;
            stack.push(rgVar2);
            as asVar = (as) ciVarAk.b(uvVar);
            if (asVar == null) {
                linkedList.add(cw.b(""));
                return linkedList;
            }
            Serializable serializable = asVar.a;
            if (serializable instanceof rp) {
                Iterator<E> it = ((rp) serializable).iterator();
                while (it.hasNext()) {
                    linkedList.add(cw.b((ed) it.next()));
                }
                return linkedList;
            }
            if (serializable instanceof List) {
                Iterator it2 = ((List) serializable).iterator();
                while (it2.hasNext()) {
                    linkedList.add(cw.b((String) it2.next()));
                }
                return linkedList;
            }
            if (serializable instanceof String) {
                linkedList.add(cw.b(asVar.i()));
                return linkedList;
            }
            if (serializable instanceof Number) {
                Class<?> cls = serializable == null ? Object.class : serializable.getClass();
                if (cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Integer.class)) {
                    linkedList.add(cw.b(asVar.h()));
                } else {
                    linkedList.add(cw.b(asVar.g()));
                }
                return linkedList;
            }
            if (serializable instanceof Boolean) {
                linkedList.add(cw.b(asVar.e()));
                return linkedList;
            }
            if (serializable instanceof Date) {
                linkedList.add(cw.b(asVar.f()));
                return linkedList;
            }
            linkedList.add(cw.b(asVar.i()));
            return linkedList;
        } catch (Exception e) {
            throw new tv("Please check the syntax of your xpath expr or commit a " + abx.a(e), e);
        }
    }

    @Override // com.github.catvod.spider.merge.A0.ub
    public Object m() {
        switch (this.a) {
            case 0:
                Class cls = (Class) this.d;
                try {
                    return yt.d.c(cls);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
                }
            default:
                Constructor constructor = (Constructor) this.d;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e2) {
                    acs acsVar = ce.a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + ce.c(constructor) + "' with no args", e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + ce.c(constructor) + "' with no args", e4.getCause());
                }
        }
    }
}
