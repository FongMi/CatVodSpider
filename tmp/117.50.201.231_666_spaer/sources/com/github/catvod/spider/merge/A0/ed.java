package com.github.catvod.spider.merge.A0;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class ed extends fw {
    public static final List e = Collections.emptyList();
    public static final String f;
    public final ad g;
    public WeakReference h;
    public List i;
    public qh j;

    static {
        Pattern.compile("\\s+");
        f = "/baseUri";
    }

    public ed(ad adVar, String str, qh qhVar) {
        wc.e(adVar);
        this.i = fw.ao;
        this.j = qhVar;
        this.g = adVar;
        if (str != null) {
            aa(str);
        }
    }

    public ed(String str) {
        this(ad.m(str, "http://www.w3.org/1999/xhtml", vz.b), "", null);
    }

    public static boolean k(fw fwVar) {
        if (fwVar instanceof ed) {
            ed edVar = (ed) fwVar;
            int i = 0;
            while (!edVar.g.i) {
                edVar = (ed) edVar.ap;
                i++;
                if (i >= 6 || edVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    public final void aa(String str) {
        l().n(f, str);
    }

    public final int ab() {
        fw fwVar = this.ap;
        if (((ed) fwVar) == null) {
            return 0;
        }
        List listZ = ((ed) fwVar).z();
        int size = listZ.size();
        for (int i = 0; i < size; i++) {
            if (listZ.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    public final ed ac() {
        for (fw fwVarAx = n() == 0 ? null : (fw) q().get(0); fwVarAx != null; fwVarAx = fwVarAx.ax()) {
            if (fwVarAx instanceof ed) {
                return (ed) fwVarAx;
            }
        }
        return null;
    }

    public final boolean ad(String str) {
        qh qhVar = this.j;
        if (qhVar == null) {
            return false;
        }
        String strI = qhVar.i("class");
        int length = strI.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strI);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strI.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strI.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strI.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public final String ae() {
        em emVar;
        StringBuilder sbG = ws.g();
        int size = this.i.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            fw fwVar = (fw) this.i.get(i);
            fw fwVarX = fwVar.x();
            emVar = fwVarX instanceof em ? (em) fwVarX : null;
            if (emVar == null) {
                emVar = new em();
            }
            pp.b(new abb(sbG, emVar.a, 1), fwVar);
            i++;
        }
        String strN = ws.n(sbG);
        fw fwVarX2 = x();
        emVar = fwVarX2 instanceof em ? (em) fwVarX2 : null;
        return (emVar != null ? emVar.a : new em().a).c ? strN.trim() : strN;
    }

    public final ed af() {
        fw fwVarAx = this;
        do {
            fwVarAx = fwVarAx.ax();
            if (fwVarAx == null) {
                return null;
            }
        } while (!(fwVarAx instanceof ed));
        return (ed) fwVarAx;
    }

    public final String ag() {
        StringBuilder sbG = ws.g();
        for (int i = 0; i < this.i.size(); i++) {
            fw fwVar = (fw) this.i.get(i);
            if (fwVar instanceof vy) {
                vy vyVar = (vy) fwVar;
                String strF = vyVar.f();
                if (k(vyVar.ap) || (vyVar instanceof rm)) {
                    sbG.append(strF);
                } else {
                    ws.f(sbG, strF, vy.h(sbG));
                }
            } else if (fwVar.aw("br") && !vy.h(sbG)) {
                sbG.append(" ");
            }
        }
        return ws.n(sbG).trim();
    }

    public final rp ah(String str) {
        wc.c(str);
        dr drVarH = nf.h(str);
        wc.e(drVarH);
        return bh.a(drVarH, this);
    }

    public final ed ai(String str) {
        wc.c(str);
        dr drVarH = nf.h(str);
        drVarH.d();
        return (ed) ps.d(pq.b(this, ed.class).filter(new ri(drVarH, this)).findFirst());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean aj(com.github.catvod.spider.merge.A0.ut r3) {
        /*
            r2 = this;
            boolean r3 = r3.c
            if (r3 == 0) goto L55
            com.github.catvod.spider.merge.A0.ad r3 = r2.g
            boolean r3 = r3.e
            if (r3 != 0) goto L17
            com.github.catvod.spider.merge.A0.fw r0 = r2.ap
            com.github.catvod.spider.merge.A0.ed r0 = (com.github.catvod.spider.merge.A0.ed) r0
            if (r0 == 0) goto L55
            com.github.catvod.spider.merge.A0.ad r0 = r0.g
            boolean r0 = r0.f
            if (r0 != 0) goto L17
            goto L55
        L17:
            r0 = 1
            if (r3 == 0) goto L1b
            goto L4c
        L1b:
            com.github.catvod.spider.merge.A0.fw r3 = r2.ap
            com.github.catvod.spider.merge.A0.ed r3 = (com.github.catvod.spider.merge.A0.ed) r3
            if (r3 == 0) goto L27
            com.github.catvod.spider.merge.A0.ad r3 = r3.g
            boolean r3 = r3.e
            if (r3 == 0) goto L4c
        L27:
            int r3 = r2.aq
            if (r3 != 0) goto L2c
            goto L4c
        L2c:
            if (r3 != r0) goto L43
            com.github.catvod.spider.merge.A0.fw r3 = r2.ay()
            boolean r1 = r3 instanceof com.github.catvod.spider.merge.A0.vy
            if (r1 == 0) goto L43
            com.github.catvod.spider.merge.A0.vy r3 = (com.github.catvod.spider.merge.A0.vy) r3
            java.lang.String r3 = r3.f()
            boolean r3 = com.github.catvod.spider.merge.A0.ws.j(r3)
            if (r3 == 0) goto L43
            goto L4c
        L43:
            java.lang.String r3 = "br"
            boolean r3 = r2.aw(r3)
            if (r3 != 0) goto L4c
            goto L55
        L4c:
            com.github.catvod.spider.merge.A0.fw r3 = r2.ap
            boolean r3 = k(r3)
            if (r3 != 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.A0.ed.aj(com.github.catvod.spider.merge.A0.ut):boolean");
    }

    public final String ak() {
        StringBuilder sbG = ws.g();
        pp.b(new xa(3, sbG), this);
        return ws.n(sbG).trim();
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ed clone() {
        return (ed) super.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final qh l() {
        if (this.j == null) {
            this.j = new qh();
        }
        return this.j;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String m() {
        for (ed edVar = this; edVar != null; edVar = (ed) edVar.ap) {
            qh qhVar = edVar.j;
            if (qhVar != null) {
                String str = f;
                if (qhVar.j(str)) {
                    return edVar.j.h(str);
                }
            }
        }
        return "";
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final int n() {
        return this.i.size();
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final fw o(fw fwVar) {
        ed edVar = (ed) super.o(fwVar);
        qh qhVar = this.j;
        edVar.j = qhVar != null ? qhVar.clone() : null;
        rq rqVar = new rq(edVar, this.i.size());
        edVar.i = rqVar;
        rqVar.addAll(this.i);
        return edVar;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final fw p() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((fw) it.next()).ap = null;
        }
        this.i.clear();
        return this;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final List q() {
        if (this.i == fw.ao) {
            this.i = new rq(this, 4);
        }
        return this.i;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final boolean r() {
        return this.j != null;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public String s() {
        return this.g.b;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String t() {
        return this.g.c;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public void u(StringBuilder sb, int i, ut utVar) throws IOException {
        if (aj(utVar) && (!(sb instanceof StringBuilder) || sb.length() > 0)) {
            fw.ar(sb, i, utVar);
        }
        Appendable appendableAppend = sb.append('<');
        ad adVar = this.g;
        appendableAppend.append(adVar.b);
        qh qhVar = this.j;
        if (qhVar != null) {
            qhVar.k(sb, utVar);
        }
        if (this.i.isEmpty()) {
            boolean z = adVar.g;
            if (z || adVar.h) {
                if (utVar.f == 1 && z) {
                    sb.append('>');
                    return;
                } else {
                    sb.append(" />");
                    return;
                }
            }
        }
        sb.append('>');
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public void v(StringBuilder sb, int i, ut utVar) throws IOException {
        boolean zIsEmpty = this.i.isEmpty();
        ad adVar = this.g;
        if (zIsEmpty && (adVar.g || adVar.h)) {
            return;
        }
        if (utVar.c && !this.i.isEmpty() && adVar.f && !k(this.ap)) {
            fw.ar(sb, i, utVar);
        }
        sb.append("</").append(adVar.b).append('>');
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final fw w() {
        return (ed) this.ap;
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final fw x() {
        fw fwVar = this;
        while (true) {
            fw fwVar2 = fwVar.ap;
            if (fwVar2 == null) {
                return (ed) fwVar;
            }
            fwVar = fwVar2;
        }
    }

    public final void y(fw fwVar) {
        fw fwVar2 = fwVar.ap;
        if (fwVar2 != null) {
            fwVar2.c(fwVar);
        }
        fwVar.ap = this;
        q();
        this.i.add(fwVar);
        fwVar.aq = this.i.size() - 1;
    }

    public final List z() {
        List list;
        if (this.i.size() == 0) {
            return e;
        }
        WeakReference weakReference = this.h;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.i.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            fw fwVar = (fw) this.i.get(i);
            if (fwVar instanceof ed) {
                arrayList.add((ed) fwVar);
            }
        }
        this.h = new WeakReference(arrayList);
        return arrayList;
    }
}
