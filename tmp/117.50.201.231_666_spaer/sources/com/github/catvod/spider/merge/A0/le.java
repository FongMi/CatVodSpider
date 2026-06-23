package com.github.catvod.spider.merge.A0;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public abstract class le {
    public static final fy c = new fy();
    public static final np d = new np();
    public static final qu e = new qu();
    public static final gh f = new gh();
    public static final zu g = new zu();
    public static final ij h = new ij();
    public static final bn i = new bn();
    public static final fn j = new fn();
    public static final mw k = new mw();
    public static final qo l = new qo();
    public static final gj m = new gj();
    public static final qr n = new qr();
    public static final dk o = new dk();
    public static final zj p = new zj();
    public static final wn q = new wn();
    public static final zk r = new zk();
    public static final xx s = new xx();
    public static final cq t = new cq();
    public static final vt u = new vt();
    public static final mg v = new mg();
    public static final od w = new od();
    public static final cs x = new cs();
    public static final hw y = new hw();
    public static final dj z = new dj();
    public static final String aa = String.valueOf((char) 0);

    public static boolean ab(uz uzVar) {
        if (uzVar.i()) {
            return ws.j(((im) uzVar).b);
        }
        return false;
    }

    public static void ac(w wVar, zl zlVar) {
        zlVar.m.al(wa.g);
        zlVar.w = zlVar.v;
        zlVar.v = j;
        zlVar.bf(wVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void ad(w wVar, ed edVar) {
        Map map;
        Object obj;
        qh qhVar = wVar.f;
        if (qhVar != null) {
            qhVar.getClass();
            qg qgVar = new qg(qhVar);
            while (qgVar.hasNext()) {
                qe qeVar = (qe) qgVar.next();
                qh qhVarL = edVar.l();
                String str = qeVar.d;
                if (!qhVarL.j(str)) {
                    qh qhVar2 = qeVar.f;
                    if (qhVar2 != null && qhVar2.j(str)) {
                        if (qhVar2.j("/jsoup.userdata")) {
                            int iL = qhVar2.l("/jsoup.userdata");
                            if (iL == -1) {
                                HashMap map2 = new HashMap();
                                qhVar2.e("/jsoup.userdata", map2);
                                map = map2;
                            } else {
                                map = (Map) qhVar2.c[iL];
                            }
                            obj = map.get("jsoup.attrs");
                        } else {
                            obj = null;
                        }
                        Map map3 = (Map) obj;
                        if (map3 == null || ((de) map3.get(str)) == null) {
                            int i2 = de.a;
                        }
                    } else {
                        int i3 = de.a;
                    }
                    String str2 = qeVar.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    qhVarL.n(qeVar.d, str2);
                    qeVar.f = qhVarL;
                }
            }
        }
    }

    public abstract boolean a(uz uzVar, zl zlVar);
}
