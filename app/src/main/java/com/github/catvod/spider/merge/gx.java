package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.mt;
import java.io.Reader;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class gx {
    protected rO N;
    protected ArrayList<Iw> OL;
    kJ S;
    Ig T4;
    protected g9 b;
    protected String l;
    protected B8 l8;
    protected mt tT;
    private mt.i HM = new mt.i();
    private mt.XT n = new mt.XT();

    gx() {
    }

    public boolean HM(String str, Rz rz) {
        mt.i iVar = this.HM;
        if (this.tT == iVar) {
            return l(new mt.i().Bz(str, rz));
        }
        iVar.cD();
        iVar.Bz(str, rz);
        return l(iVar);
    }

    protected boolean N(String str) {
        mt.i iVar = this.HM;
        return this.tT == iVar ? l(new mt.i().rD(str)) : l(iVar.cD().rD(str));
    }

    @ParametersAreNonnullByDefault
    g9 OL(Reader reader, String str, B8 b8) {
        b(reader, str, b8);
        n();
        this.S.b();
        this.S = null;
        this.T4 = null;
        this.OL = null;
        return this.b;
    }

    abstract rO S();

    protected void T4(String str) {
        O oL8 = this.l8.l8();
        if (oL8.l8()) {
            oL8.add(new cz(this.S.Bz(), str));
        }
    }

    @ParametersAreNonnullByDefault
    protected void b(Reader reader, String str, B8 b8) {
        Rc.n(reader, "String input must not be null");
        Rc.n(str, "BaseURI must not be null");
        Rc.HM(b8);
        g9 g9Var = new g9(str);
        this.b = g9Var;
        g9Var.Yr(b8);
        this.l8 = b8;
        this.N = b8.b();
        this.S = new kJ(reader);
        this.tT = null;
        this.T4 = new Ig(this.S, b8.l8());
        this.OL = new ArrayList<>(32);
        this.l = str;
    }

    protected abstract boolean l(mt mtVar);

    protected Iw l8() {
        int size = this.OL.size();
        if (size > 0) {
            return this.OL.get(size - 1);
        }
        return null;
    }

    protected void n() {
        mt mtVarW;
        Ig ig = this.T4;
        mt.Q q = mt.Q.EOF;
        do {
            mtVarW = ig.W();
            l(mtVarW);
            mtVarW.cD();
        } while (mtVarW.l8 != q);
    }

    protected boolean tT(String str) {
        mt mtVar = this.tT;
        mt.XT xt = this.n;
        return mtVar == xt ? l(new mt.XT().rD(str)) : l(xt.cD().rD(str));
    }
}
