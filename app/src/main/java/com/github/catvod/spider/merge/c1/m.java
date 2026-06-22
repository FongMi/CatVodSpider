package com.github.catvod.spider.merge.c1;

import com.github.catvod.spider.merge.a1.C0899d;
import com.github.catvod.spider.merge.a1.C0900e;
import com.github.catvod.spider.merge.b1.C0906c;
import com.github.catvod.spider.merge.d1.G;
import com.github.catvod.spider.merge.e1.C1032c;
import com.github.catvod.spider.merge.e1.C1036g;
import com.github.catvod.spider.merge.e1.L;
import com.github.catvod.spider.merge.e1.N;
import com.github.catvod.spider.merge.e1.P;
import com.github.catvod.spider.merge.e1.Q;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class m extends s {
    private static final List<m> i = Collections.emptyList();
    private static final String j;
    private G e;
    private WeakReference<List<m>> f;
    List<s> g;
    C0947c h;

    static {
        Pattern.compile("\\s+");
        j = C0947c.v("baseUri");
    }

    public m(G g, String str, C0947c c0947c) {
        C0899d.h(g);
        this.g = s.d;
        this.h = c0947c;
        this.e = g;
        if (str != null) {
            k(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(StringBuilder sb, v vVar) {
        String strI = vVar.I();
        if (j0(vVar.b) || (vVar instanceof d)) {
            sb.append(strI);
        } else {
            C0906c.a(sb, strI, v.N(sb));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(s sVar, StringBuilder sb) {
        if (sVar instanceof v) {
            sb.append(((v) sVar).I());
        } else if ((sVar instanceof m) && ((m) sVar).e.j().equals("br")) {
            sb.append("\n");
        }
    }

    static boolean j0(s sVar) {
        if (sVar instanceof m) {
            m mVar = (m) sVar;
            int i2 = 0;
            while (!mVar.e.k()) {
                mVar = (m) mVar.b;
                i2++;
                if (i2 >= 6 || mVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final s E() {
        s sVar = this;
        while (true) {
            s sVar2 = sVar.b;
            if (sVar2 == null) {
                return (m) sVar;
            }
            sVar = sVar2;
        }
    }

    public final m K(s sVar) {
        s sVar2 = sVar.b;
        if (sVar2 != null) {
            sVar2.C(sVar);
        }
        sVar.b = this;
        m();
        this.g.add(sVar);
        sVar.c = this.g.size() - 1;
        return this;
    }

    public final m L(Collection<? extends s> collection) {
        if (collection == null) {
            throw new C0900e("Children collection to be inserted must not be null.");
        }
        int iG = g();
        int i2 = (iG + 1) - 1;
        C0899d.e(i2 >= 0 && i2 <= iG, "Insert position out of bounds.");
        b(i2, (s[]) new ArrayList(collection).toArray(new s[0]));
        return this;
    }

    public final m M(String str) {
        m mVar = new m(G.m(str, t.a(this).g()), e(), null);
        K(mVar);
        return mVar;
    }

    public final m P(String str, String str2) {
        d().B(t.a(this).g().b(str), str2);
        return this;
    }

    public final m Q(s sVar) {
        C0899d.h(this.b);
        this.b.b(this.c, sVar);
        return this;
    }

    public final m R() {
        return S().get(0);
    }

    final List<m> S() {
        List<m> list;
        if (g() == 0) {
            return i;
        }
        WeakReference<List<m>> weakReference = this.f;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.g.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.g.get(i2);
            if (sVar instanceof m) {
                arrayList.add((m) sVar);
            }
        }
        this.f = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final C1036g T() {
        return new C1036g(S());
    }

    @Override // com.github.catvod.spider.merge.c1.s
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m i() {
        return (m) super.i();
    }

    public final String V() {
        String strI;
        StringBuilder sbB = C0906c.b();
        for (s sVar : this.g) {
            if (sVar instanceof f) {
                strI = ((f) sVar).I();
            } else if (sVar instanceof e) {
                strI = ((e) sVar).I();
            } else if (sVar instanceof m) {
                strI = ((m) sVar).V();
            } else if (sVar instanceof d) {
                strI = ((d) sVar).I();
            }
            sbB.append(strI);
        }
        return C0906c.h(sbB);
    }

    public final int W() {
        s sVar = this.b;
        if (((m) sVar) == null) {
            return 0;
        }
        List<m> listS = ((m) sVar).S();
        int size = listS.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (listS.get(i2) == this) {
                return i2;
            }
        }
        return 0;
    }

    public final C1036g X(String str) {
        C0899d.f(str);
        return C1032c.a(new com.github.catvod.spider.merge.e1.r(str), this);
    }

    public final C1036g Y() {
        C0899d.f("a");
        return C1032c.a(new L(com.github.catvod.spider.merge.g.b.c("a")), this);
    }

    public final boolean Z(String str) {
        C0947c c0947c = this.h;
        if (c0947c == null) {
            return false;
        }
        String strO = c0947c.o("class");
        int length = strO.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strO);
            }
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.isWhitespace(strO.charAt(i3))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i3 - i2 == length2 && strO.regionMatches(true, i2, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i2 = i3;
                    z = true;
                }
            }
            if (z && length - i2 == length2) {
                return strO.regionMatches(true, i2, str, 0, length2);
            }
        }
        return false;
    }

    public final boolean a0() {
        for (s sVar : this.g) {
            if (sVar instanceof v) {
                if (!((v) sVar).M()) {
                    return true;
                }
            } else if ((sVar instanceof m) && ((m) sVar).a0()) {
                return true;
            }
        }
        return false;
    }

    public final String b0() {
        StringBuilder sbB = C0906c.b();
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.g.get(i2).u(sbB);
        }
        String strH = C0906c.h(sbB);
        h hVarX = x();
        if (hVarX == null) {
            hVarX = new h("");
        }
        return hVarX.C0().i() ? strH.trim() : strH;
    }

    public final String c0() {
        C0947c c0947c = this.h;
        return c0947c != null ? c0947c.o("id") : "";
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final C0947c d() {
        if (this.h == null) {
            this.h = new C0947c();
        }
        return this.h;
    }

    public final boolean d0() {
        return this.e.c();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final String e() {
        String str = j;
        for (m mVar = this; mVar != null; mVar = (m) mVar.b) {
            C0947c c0947c = mVar.h;
            if (c0947c != null) {
                if (c0947c.t(str) != -1) {
                    return mVar.h.n(str);
                }
            }
        }
        return "";
    }

    final void e0() {
        this.f = null;
    }

    public final String f0() {
        return this.e.j();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final int g() {
        return this.g.size();
    }

    public final String g0() {
        StringBuilder sbB = C0906c.b();
        for (int i2 = 0; i2 < g(); i2++) {
            s sVar = this.g.get(i2);
            if (sVar instanceof v) {
                N(sbB, (v) sVar);
            } else if ((sVar instanceof m) && ((m) sVar).e.j().equals("br") && !v.N(sbB)) {
                sbB.append(" ");
            }
        }
        return C0906c.h(sbB).trim();
    }

    public final m h0() {
        return (m) this.b;
    }

    public final m i0(s sVar) {
        b(0, sVar);
        return this;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final s j(s sVar) {
        m mVar = (m) super.j(sVar);
        C0947c c0947c = this.h;
        mVar.h = c0947c != null ? c0947c.clone() : null;
        l lVar = new l(mVar, this.g.size());
        mVar.g = lVar;
        lVar.addAll(this.g);
        return mVar;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final void k(String str) {
        d().A(j, str);
    }

    public final m k0() {
        s sVar = this.b;
        if (sVar == null) {
            return null;
        }
        List<m> listS = ((m) sVar).S();
        int size = listS.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (listS.get(i3) == this) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 > 0) {
            return listS.get(i2 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final s l() {
        this.g.clear();
        return this;
    }

    public final C1036g l0(String str) {
        C0899d.f(str);
        N nJ = P.j(str);
        C0899d.h(nJ);
        return C1032c.a(nJ, this);
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final List<s> m() {
        if (this.g == s.d) {
            this.g = new l(this, 4);
        }
        return this.g;
    }

    public final m m0(String str) {
        C0899d.f(str);
        return C1032c.b(P.j(str), this);
    }

    public final C1036g n0(String str) {
        C0899d.f(str);
        com.github.catvod.spider.merge.a1.g gVar = new com.github.catvod.spider.merge.a1.g();
        gVar.c();
        Node node = (Node) gVar.b(this).getUserData("jsoupContextNode");
        if (str.length() == 0) {
            throw new C0900e(String.format("The '%s' parameter must not be empty.", "xpath"));
        }
        C0899d.i(node, "contextNode");
        try {
            NodeList nodeList = (NodeList) (System.getProperty("javax.xml.xpath.XPathFactory:jsoup") != null ? XPathFactory.newInstance("jsoup") : XPathFactory.newInstance()).newXPath().compile(str).evaluate(node, XPathConstants.NODESET);
            C0899d.h(nodeList);
            ArrayList arrayList = new ArrayList(nodeList.getLength());
            for (int i2 = 0; i2 < nodeList.getLength(); i2++) {
                Object userData = nodeList.item(i2).getUserData("jsoupSource");
                if (m.class.isInstance(userData)) {
                    arrayList.add((s) m.class.cast(userData));
                }
            }
            return new C1036g(arrayList);
        } catch (XPathExpressionException | XPathFactoryConfigurationException e) {
            throw new Q("Could not evaluate XPath query [%s]: %s", str, e.getMessage());
        }
    }

    @Override // com.github.catvod.spider.merge.c1.s
    protected final boolean o() {
        return this.h != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean o0(com.github.catvod.spider.merge.c1.g r5) {
        /*
            r4 = this;
            boolean r5 = r5.i()
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.d1.G r5 = r4.e
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
            com.github.catvod.spider.merge.c1.s r5 = r4.b
            com.github.catvod.spider.merge.c1.m r5 = (com.github.catvod.spider.merge.c1.m) r5
            if (r5 == 0) goto L1e
            com.github.catvod.spider.merge.d1.G r5 = r5.e
            boolean r5 = r5.a()
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L21
        L20:
            r5 = 1
        L21:
            if (r5 == 0) goto L58
            com.github.catvod.spider.merge.d1.G r5 = r4.e
            boolean r5 = r5.f()
            if (r5 == 0) goto L54
            com.github.catvod.spider.merge.c1.s r5 = r4.b
            com.github.catvod.spider.merge.c1.m r5 = (com.github.catvod.spider.merge.c1.m) r5
            if (r5 == 0) goto L37
            boolean r5 = r5.d0()
            if (r5 == 0) goto L54
        L37:
            com.github.catvod.spider.merge.c1.s r5 = r4.b
            r2 = 0
            if (r5 != 0) goto L3d
            goto L50
        L3d:
            int r3 = r4.c
            if (r3 <= 0) goto L50
            java.util.List r5 = r5.m()
            int r2 = r4.c
            int r2 = r2 + (-1)
            java.lang.Object r5 = r5.get(r2)
            r2 = r5
            com.github.catvod.spider.merge.c1.s r2 = (com.github.catvod.spider.merge.c1.s) r2
        L50:
            if (r2 == 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            if (r5 != 0) goto L58
            goto L59
        L58:
            r0 = 0
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.c1.m.o0(com.github.catvod.spider.merge.c1.g):boolean");
    }

    public final C1036g p0() {
        s sVar = this.b;
        if (sVar == null) {
            return new C1036g(0);
        }
        List<m> listS = ((m) sVar).S();
        C1036g c1036g = new C1036g(listS.size() - 1);
        for (m mVar : listS) {
            if (mVar != this) {
                c1036g.add(mVar);
            }
        }
        return c1036g;
    }

    public final G q0() {
        return this.e;
    }

    public final String r0() {
        return this.e.b();
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public String s() {
        return this.e.b();
    }

    public final String s0() {
        StringBuilder sbB = C0906c.b();
        com.github.catvod.spider.merge.L1.l.i(new k(sbB), this);
        return C0906c.h(sbB).trim();
    }

    public final List<v> t0() {
        ArrayList arrayList = new ArrayList();
        for (s sVar : this.g) {
            if (sVar instanceof v) {
                arrayList.add((v) sVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String u0() {
        StringBuilder sbB = C0906c.b();
        int iG = g();
        for (int i2 = 0; i2 < iG; i2++) {
            O(this.g.get(i2), sbB);
        }
        return C0906c.h(sbB);
    }

    @Override // com.github.catvod.spider.merge.c1.s
    void v(Appendable appendable, int i2, g gVar) throws IOException {
        if (o0(gVar) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            q(appendable, i2, gVar);
        }
        appendable.append('<').append(r0());
        C0947c c0947c = this.h;
        if (c0947c != null) {
            c0947c.s(appendable, gVar);
        }
        if (this.g.isEmpty() && this.e.i() && (gVar.j() != 1 || !this.e.d())) {
            appendable.append(" />");
        } else {
            appendable.append('>');
        }
    }

    @Override // com.github.catvod.spider.merge.c1.s
    void w(Appendable appendable, int i2, g gVar) throws IOException {
        if (this.g.isEmpty() && this.e.i()) {
            return;
        }
        if (gVar.i() && !this.g.isEmpty() && this.e.a()) {
            q(appendable, i2, gVar);
        }
        appendable.append("</").append(r0()).append('>');
    }

    @Override // com.github.catvod.spider.merge.c1.s
    public final s y() {
        return (m) this.b;
    }
}
