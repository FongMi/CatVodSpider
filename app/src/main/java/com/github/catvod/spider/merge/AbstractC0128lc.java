package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0108Zo;
import java.io.Reader;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* renamed from: com.github.catvod.spider.merge.lc */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class AbstractC0128lc {

    /* renamed from: MH */
    protected C0068Jt f714MH;

    /* renamed from: Mo */
    protected String f715Mo;

    /* renamed from: QU */
    C0059EV f716QU;

    /* renamed from: UJ */
    protected C0082OO f717UJ;

    /* renamed from: i */
    protected AbstractC0108Zo f719i;

    /* renamed from: q */
    protected C0080Nz f720q;

    /* renamed from: u */
    protected ArrayList<C0127lK> f722u;

    /* renamed from: xC */
    C0060Eo f723xC;

    /* renamed from: se */
    private AbstractC0108Zo.Vm f721se = new AbstractC0108Zo.Vm();

    /* renamed from: W */
    private AbstractC0108Zo.t7 f718W = new AbstractC0108Zo.t7();

    AbstractC0128lc() {
    }

    /* renamed from: MH */
    protected boolean m672MH(String str) {
        AbstractC0108Zo.Vm vm = this.f721se;
        return this.f719i == vm ? mo359Mo(new AbstractC0108Zo.Vm().m539P(str)) : mo359Mo(vm.mo517w8().m539P(str));
    }

    /* renamed from: Mo */
    protected abstract boolean mo359Mo(AbstractC0108Zo abstractC0108Zo);

    /* renamed from: QU */
    protected void m673QU(String str) {
        C0104Yh c0104YhM313q = this.f720q.m313q();
        if (c0104YhM313q.m479q()) {
            c0104YhM313q.add(new C0069K(this.f723xC.m173T(), str));
        }
    }

    @ParametersAreNonnullByDefault
    /* renamed from: UJ */
    protected void mo367UJ(Reader reader, String str, C0080Nz c0080Nz) {
        C0111bw.m556W(reader, "String input must not be null");
        C0111bw.m556W(str, "BaseURI must not be null");
        C0111bw.m559se(c0080Nz);
        C0082OO c0082oo = new C0082OO(str);
        this.f717UJ = c0082oo;
        c0082oo.m317cV(c0080Nz);
        this.f720q = c0080Nz;
        this.f714MH = c0080Nz.m312UJ();
        this.f723xC = new C0060Eo(reader);
        this.f719i = null;
        this.f716QU = new C0059EV(this.f723xC, c0080Nz.m313q());
        this.f722u = new ArrayList<>(32);
        this.f715Mo = str;
    }

    /* renamed from: W */
    protected void m674W() {
        AbstractC0108Zo abstractC0108ZoM146go;
        C0059EV c0059ev = this.f716QU;
        AbstractC0108Zo.O o = AbstractC0108Zo.O.EOF;
        do {
            abstractC0108ZoM146go = c0059ev.m146go();
            mo359Mo(abstractC0108ZoM146go);
            abstractC0108ZoM146go.mo517w8();
        } while (abstractC0108ZoM146go.f572q != o);
    }

    /* renamed from: i */
    protected boolean m675i(String str) {
        AbstractC0108Zo abstractC0108Zo = this.f719i;
        AbstractC0108Zo.t7 t7Var = this.f718W;
        return abstractC0108Zo == t7Var ? mo359Mo(new AbstractC0108Zo.t7().m539P(str)) : mo359Mo(t7Var.mo517w8().m539P(str));
    }

    /* renamed from: q */
    protected C0127lK m676q() {
        int size = this.f722u.size();
        if (size > 0) {
            return this.f722u.get(size - 1);
        }
        return null;
    }

    /* renamed from: se */
    public boolean mo401se(String str, C0094Tz c0094Tz) {
        AbstractC0108Zo.Vm vm = this.f721se;
        if (this.f719i == vm) {
            return mo359Mo(new AbstractC0108Zo.Vm().m531T(str, c0094Tz));
        }
        vm.mo517w8();
        vm.m531T(str, c0094Tz);
        return mo359Mo(vm);
    }

    @ParametersAreNonnullByDefault
    /* renamed from: u */
    C0082OO m677u(Reader reader, String str, C0080Nz c0080Nz) {
        mo367UJ(reader, str, c0080Nz);
        m674W();
        this.f723xC.m176UJ();
        this.f723xC = null;
        this.f716QU = null;
        this.f722u = null;
        return this.f717UJ;
    }

    /* renamed from: xC */
    abstract C0068Jt mo409xC();
}
