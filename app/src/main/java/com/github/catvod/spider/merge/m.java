package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.mt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class m {
    public static final m l8 = new a("Data", 0);
    public static final m S = new m("CharacterReferenceInData", 1) { // from class: com.github.catvod.spider.merge.m.VT
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.n(ig, m.l8);
        }
    };
    public static final m T4 = new m("Rcdata", 2) { // from class: com.github.catvod.spider.merge.m.ff
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cED = kJVar.eD();
            if (cED == 0) {
                ig.eD(this);
                kJVar.l8();
                ig.n((char) 65533);
            } else {
                if (cED == '&') {
                    ig.l8(m.b);
                    return;
                }
                if (cED == '<') {
                    ig.l8(m.v);
                } else if (cED != 65535) {
                    ig.v(kJVar.tT());
                } else {
                    ig.cD(new mt.OD());
                }
            }
        }
    };
    public static final m b = new m("CharacterReferenceInRcdata", 3) { // from class: com.github.catvod.spider.merge.m.ZF
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.n(ig, m.T4);
        }
    };
    public static final m OL = new m("Rawtext", 4) { // from class: com.github.catvod.spider.merge.m.YS
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.A(ig, kJVar, this, m.s);
        }
    };
    public static final m l = new m("ScriptData", 5) { // from class: com.github.catvod.spider.merge.m.Rz
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.A(ig, kJVar, this, m.E9);
        }
    };
    public static final m tT = new m("PLAINTEXT", 6) { // from class: com.github.catvod.spider.merge.m.PU
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cED = kJVar.eD();
            if (cED == 0) {
                ig.eD(this);
                kJVar.l8();
                ig.n((char) 65533);
            } else if (cED != 65535) {
                ig.v(kJVar.s((char) 0));
            } else {
                ig.cD(new mt.OD());
            }
        }
    };
    public static final m N = new m("TagOpen", 7) { // from class: com.github.catvod.spider.merge.m.qF
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cED = kJVar.eD();
            if (cED == '!') {
                ig.l8(m.DL);
                return;
            }
            if (cED == '/') {
                ig.l8(m.HM);
                return;
            }
            if (cED == '?') {
                ig.OL();
                ig.l8(m.Lw);
            } else if (kJVar.hd()) {
                ig.N(true);
                ig.C(m.n);
            } else {
                ig.eD(this);
                ig.n('<');
                ig.C(m.l8);
            }
        }
    };
    public static final m HM = new m("EndTagOpen", 8) { // from class: com.github.catvod.spider.merge.m.Lh
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.Q()) {
                ig.uS(this);
                ig.v("</");
                ig.C(m.l8);
            } else if (kJVar.hd()) {
                ig.N(false);
                ig.C(m.n);
            } else if (kJVar.R('>')) {
                ig.eD(this);
                ig.l8(m.l8);
            } else {
                ig.eD(this);
                ig.OL();
                ig.l8(m.Lw);
            }
        }
    };
    public static final m n = new m("TagName", 9) { // from class: com.github.catvod.spider.merge.m.aA
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            ig.v.W(kJVar.cD());
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.v.W(m.L);
                return;
            }
            if (cOL != ' ') {
                if (cOL == '/') {
                    ig.C(m.M);
                    return;
                }
                if (cOL == '<') {
                    kJVar.o();
                    ig.eD(this);
                } else if (cOL != '>') {
                    if (cOL == 65535) {
                        ig.uS(this);
                        ig.C(m.l8);
                        return;
                    } else if (cOL != '\t' && cOL != '\n' && cOL != '\f' && cOL != '\r') {
                        ig.v.Q(cOL);
                        return;
                    }
                }
                ig.E9();
                ig.C(m.l8);
                return;
            }
            ig.C(m.O);
        }
    };
    public static final m v = new m("RcdataLessthanSign", 10) { // from class: com.github.catvod.spider.merge.m.ut
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.R('/')) {
                ig.HM();
                ig.l8(m.A);
                return;
            }
            if (kJVar.hd() && ig.S() != null) {
                if (!kJVar.c("</" + ig.S())) {
                    ig.v = ig.N(false).rD(ig.S());
                    ig.E9();
                    ig.C(m.N);
                    return;
                }
            }
            ig.v("<");
            ig.C(m.T4);
        }
    };
    public static final m A = new m("RCDATAEndTagOpen", 11) { // from class: com.github.catvod.spider.merge.m.Y
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (!kJVar.hd()) {
                ig.v("</");
                ig.C(m.T4);
            } else {
                ig.N(false);
                ig.v.Q(kJVar.eD());
                ig.n.append(kJVar.eD());
                ig.l8(m.cD);
            }
        }
    };
    public static final m cD = new m("RCDATAEndTagName", 12) { // from class: com.github.catvod.spider.merge.m.c
        {
            a aVar = null;
        }

        private void cD(Ig ig, kJ kJVar) {
            ig.v("</");
            ig.A(ig.n);
            kJVar.o();
            ig.C(m.T4);
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.hd()) {
                String strN = kJVar.n();
                ig.v.W(strN);
                ig.n.append(strN);
                return;
            }
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                if (ig.Q()) {
                    ig.C(m.O);
                    return;
                } else {
                    cD(ig, kJVar);
                    return;
                }
            }
            if (cOL == '/') {
                if (ig.Q()) {
                    ig.C(m.M);
                    return;
                } else {
                    cD(ig, kJVar);
                    return;
                }
            }
            if (cOL != '>') {
                cD(ig, kJVar);
            } else if (!ig.Q()) {
                cD(ig, kJVar);
            } else {
                ig.E9();
                ig.C(m.l8);
            }
        }
    };
    public static final m s = new m("RawtextLessthanSign", 13) { // from class: com.github.catvod.spider.merge.m.xq
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.R('/')) {
                ig.HM();
                ig.l8(m.hR);
            } else {
                ig.n('<');
                ig.C(m.OL);
            }
        }
    };
    public static final m hR = new m("RawtextEndTagOpen", 14) { // from class: com.github.catvod.spider.merge.m.OD
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.v(ig, kJVar, m.Kf, m.OL);
        }
    };
    public static final m Kf = new m("RawtextEndTagName", 15) { // from class: com.github.catvod.spider.merge.m.XT
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.N(ig, kJVar, m.OL);
        }
    };
    public static final m E9 = new m("ScriptDataLessthanSign", 16) { // from class: com.github.catvod.spider.merge.m.i
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '!') {
                ig.v("<!");
                ig.C(m.eD);
                return;
            }
            if (cOL == '/') {
                ig.HM();
                ig.C(m.uS);
            } else if (cOL != 65535) {
                ig.v("<");
                kJVar.o();
                ig.C(m.l);
            } else {
                ig.v("<");
                ig.uS(this);
                ig.C(m.l8);
            }
        }
    };
    public static final m uS = new m("ScriptDataEndTagOpen", 17) { // from class: com.github.catvod.spider.merge.m.Ph
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.v(ig, kJVar, m.c, m.l);
        }
    };
    public static final m c = new m("ScriptDataEndTagName", 18) { // from class: com.github.catvod.spider.merge.m.Q
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.N(ig, kJVar, m.l);
        }
    };
    public static final m eD = new m("ScriptDataEscapeStart", 19) { // from class: com.github.catvod.spider.merge.m.b
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (!kJVar.R('-')) {
                ig.C(m.l);
            } else {
                ig.n('-');
                ig.l8(m.Q);
            }
        }
    };
    public static final m Q = new m("ScriptDataEscapeStartDash", 20) { // from class: com.github.catvod.spider.merge.m.cI
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (!kJVar.R('-')) {
                ig.C(m.l);
            } else {
                ig.n('-');
                ig.l8(m.OY);
            }
        }
    };
    public static final m W = new m("ScriptDataEscaped", 21) { // from class: com.github.catvod.spider.merge.m.U
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.Q()) {
                ig.uS(this);
                ig.C(m.l8);
                return;
            }
            char cED = kJVar.eD();
            if (cED == 0) {
                ig.eD(this);
                kJVar.l8();
                ig.n((char) 65533);
            } else if (cED == '-') {
                ig.n('-');
                ig.l8(m.C);
            } else if (cED != '<') {
                ig.v(kJVar.Kf('-', '<', 0));
            } else {
                ig.l8(m.r1);
            }
        }
    };
    public static final m C = new m("ScriptDataEscapedDash", 22) { // from class: com.github.catvod.spider.merge.m.r
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.Q()) {
                ig.uS(this);
                ig.C(m.l8);
                return;
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.n((char) 65533);
                ig.C(m.W);
            } else if (cOL == '-') {
                ig.n(cOL);
                ig.C(m.OY);
            } else if (cOL == '<') {
                ig.C(m.r1);
            } else {
                ig.n(cOL);
                ig.C(m.W);
            }
        }
    };
    public static final m OY = new m("ScriptDataEscapedDashDash", 23) { // from class: com.github.catvod.spider.merge.m.k
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.Q()) {
                ig.uS(this);
                ig.C(m.l8);
                return;
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.n((char) 65533);
                ig.C(m.W);
            } else {
                if (cOL == '-') {
                    ig.n(cOL);
                    return;
                }
                if (cOL == '<') {
                    ig.C(m.r1);
                } else if (cOL != '>') {
                    ig.n(cOL);
                    ig.C(m.W);
                } else {
                    ig.n(cOL);
                    ig.C(m.l);
                }
            }
        }
    };
    public static final m r1 = new m("ScriptDataEscapedLessthanSign", 24) { // from class: com.github.catvod.spider.merge.m.L
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.hd()) {
                ig.HM();
                ig.n.append(kJVar.eD());
                ig.v("<");
                ig.n(kJVar.eD());
                ig.l8(m.G);
                return;
            }
            if (kJVar.R('/')) {
                ig.HM();
                ig.l8(m.R);
            } else {
                ig.n('<');
                ig.C(m.W);
            }
        }
    };
    public static final m R = new m("ScriptDataEscapedEndTagOpen", 25) { // from class: com.github.catvod.spider.merge.m.rs
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (!kJVar.hd()) {
                ig.v("</");
                ig.C(m.W);
            } else {
                ig.N(false);
                ig.v.Q(kJVar.eD());
                ig.n.append(kJVar.eD());
                ig.l8(m.bc);
            }
        }
    };
    public static final m bc = new m("ScriptDataEscapedEndTagName", 26) { // from class: com.github.catvod.spider.merge.m.ii
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.N(ig, kJVar, m.W);
        }
    };
    public static final m G = new m("ScriptDataDoubleEscapeStart", 27) { // from class: com.github.catvod.spider.merge.m.Zv
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.tT(ig, kJVar, m.rD, m.W);
        }
    };
    public static final m rD = new m("ScriptDataDoubleEscaped", 28) { // from class: com.github.catvod.spider.merge.m.ib
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cED = kJVar.eD();
            if (cED == 0) {
                ig.eD(this);
                kJVar.l8();
                ig.n((char) 65533);
            } else if (cED == '-') {
                ig.n(cED);
                ig.l8(m.oH);
            } else if (cED == '<') {
                ig.n(cED);
                ig.l8(m.hd);
            } else if (cED != 65535) {
                ig.v(kJVar.Kf('-', '<', 0));
            } else {
                ig.uS(this);
                ig.C(m.l8);
            }
        }
    };
    public static final m oH = new m("ScriptDataDoubleEscapedDash", 29) { // from class: com.github.catvod.spider.merge.m.dY
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.n((char) 65533);
                ig.C(m.rD);
            } else if (cOL == '-') {
                ig.n(cOL);
                ig.C(m.A0);
            } else if (cOL == '<') {
                ig.n(cOL);
                ig.C(m.hd);
            } else if (cOL != 65535) {
                ig.n(cOL);
                ig.C(m.rD);
            } else {
                ig.uS(this);
                ig.C(m.l8);
            }
        }
    };
    public static final m A0 = new m("ScriptDataDoubleEscapedDashDash", 30) { // from class: com.github.catvod.spider.merge.m.F
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.n((char) 65533);
                ig.C(m.rD);
                return;
            }
            if (cOL == '-') {
                ig.n(cOL);
                return;
            }
            if (cOL == '<') {
                ig.n(cOL);
                ig.C(m.hd);
            } else if (cOL == '>') {
                ig.n(cOL);
                ig.C(m.l);
            } else if (cOL != 65535) {
                ig.n(cOL);
                ig.C(m.rD);
            } else {
                ig.uS(this);
                ig.C(m.l8);
            }
        }
    };
    public static final m hd = new m("ScriptDataDoubleEscapedLessthanSign", 31) { // from class: com.github.catvod.spider.merge.m.n
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (!kJVar.R('/')) {
                ig.C(m.rD);
                return;
            }
            ig.n('/');
            ig.HM();
            ig.l8(m.d);
        }
    };
    public static final m d = new m("ScriptDataDoubleEscapeEnd", 32) { // from class: com.github.catvod.spider.merge.m.Z
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            m.tT(ig, kJVar, m.W, m.rD);
        }
    };
    public static final m O = new m("BeforeAttributeName", 33) { // from class: com.github.catvod.spider.merge.m.No
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                kJVar.o();
                ig.eD(this);
                ig.v.oH();
                ig.C(m.Bz);
                return;
            }
            if (cOL != ' ') {
                if (cOL != '\"' && cOL != '\'') {
                    if (cOL == '/') {
                        ig.C(m.M);
                        return;
                    }
                    if (cOL == 65535) {
                        ig.uS(this);
                        ig.C(m.l8);
                        return;
                    }
                    if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r') {
                        return;
                    }
                    switch (cOL) {
                        case '<':
                            kJVar.o();
                            ig.eD(this);
                            break;
                        case '=':
                            break;
                        case '>':
                            break;
                        default:
                            ig.v.oH();
                            kJVar.o();
                            ig.C(m.Bz);
                            return;
                    }
                    ig.E9();
                    ig.C(m.l8);
                    return;
                }
                ig.eD(this);
                ig.v.oH();
                ig.v.Kf(cOL);
                ig.C(m.Bz);
            }
        }
    };
    public static final m Bz = new m("AttributeName", 34) { // from class: com.github.catvod.spider.merge.m.ok
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            ig.v.E9(kJVar.E9(m.UM));
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.v.Kf((char) 65533);
                return;
            }
            if (cOL != ' ') {
                if (cOL != '\"' && cOL != '\'') {
                    if (cOL == '/') {
                        ig.C(m.M);
                        return;
                    }
                    if (cOL == 65535) {
                        ig.uS(this);
                        ig.C(m.l8);
                        return;
                    }
                    if (cOL != '\t' && cOL != '\n' && cOL != '\f' && cOL != '\r') {
                        switch (cOL) {
                            case '<':
                                break;
                            case '=':
                                ig.C(m.PP);
                                break;
                            case '>':
                                ig.E9();
                                ig.C(m.l8);
                                break;
                            default:
                                ig.v.Kf(cOL);
                                break;
                        }
                        return;
                    }
                }
                ig.eD(this);
                ig.v.Kf(cOL);
                return;
            }
            ig.C(m.H6);
        }
    };
    public static final m H6 = new m("AfterAttributeName", 35) { // from class: com.github.catvod.spider.merge.m.j
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.v.Kf((char) 65533);
                ig.C(m.Bz);
                return;
            }
            if (cOL != ' ') {
                if (cOL != '\"' && cOL != '\'') {
                    if (cOL == '/') {
                        ig.C(m.M);
                        return;
                    }
                    if (cOL == 65535) {
                        ig.uS(this);
                        ig.C(m.l8);
                        return;
                    }
                    if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r') {
                        return;
                    }
                    switch (cOL) {
                        case '<':
                            break;
                        case '=':
                            ig.C(m.PP);
                            break;
                        case '>':
                            ig.E9();
                            ig.C(m.l8);
                            break;
                        default:
                            ig.v.oH();
                            kJVar.o();
                            ig.C(m.Bz);
                            break;
                    }
                    return;
                }
                ig.eD(this);
                ig.v.oH();
                ig.v.Kf(cOL);
                ig.C(m.Bz);
            }
        }
    };
    public static final m PP = new m("BeforeAttributeValue", 36) { // from class: com.github.catvod.spider.merge.m.cp
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.v.uS((char) 65533);
                ig.C(m.y);
                return;
            }
            if (cOL != ' ') {
                if (cOL == '\"') {
                    ig.C(m.o);
                    return;
                }
                if (cOL != '`') {
                    if (cOL == 65535) {
                        ig.uS(this);
                        ig.E9();
                        ig.C(m.l8);
                        return;
                    }
                    if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r') {
                        return;
                    }
                    if (cOL == '&') {
                        kJVar.o();
                        ig.C(m.y);
                        return;
                    }
                    if (cOL == '\'') {
                        ig.C(m.mF);
                        return;
                    }
                    switch (cOL) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            ig.eD(this);
                            ig.E9();
                            ig.C(m.l8);
                            break;
                        default:
                            kJVar.o();
                            ig.C(m.y);
                            break;
                    }
                    return;
                }
                ig.eD(this);
                ig.v.uS(cOL);
                ig.C(m.y);
            }
        }
    };
    public static final m o = new m("AttributeValue_doubleQuoted", 37) { // from class: com.github.catvod.spider.merge.m.D
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            String strL = kJVar.l(false);
            if (strL.length() > 0) {
                ig.v.c(strL);
            } else {
                ig.v.d();
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.v.uS((char) 65533);
                return;
            }
            if (cOL == '\"') {
                ig.C(m.Ws);
                return;
            }
            if (cOL != '&') {
                if (cOL != 65535) {
                    ig.v.uS(cOL);
                    return;
                } else {
                    ig.uS(this);
                    ig.C(m.l8);
                    return;
                }
            }
            int[] iArrB = ig.b('\"', true);
            if (iArrB != null) {
                ig.v.eD(iArrB);
            } else {
                ig.v.uS('&');
            }
        }
    };
    public static final m mF = new m("AttributeValue_singleQuoted", 38) { // from class: com.github.catvod.spider.merge.m.X0
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            String strL = kJVar.l(true);
            if (strL.length() > 0) {
                ig.v.c(strL);
            } else {
                ig.v.d();
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.v.uS((char) 65533);
                return;
            }
            if (cOL == 65535) {
                ig.uS(this);
                ig.C(m.l8);
                return;
            }
            if (cOL != '&') {
                if (cOL != '\'') {
                    ig.v.uS(cOL);
                    return;
                } else {
                    ig.C(m.Ws);
                    return;
                }
            }
            int[] iArrB = ig.b('\'', true);
            if (iArrB != null) {
                ig.v.eD(iArrB);
            } else {
                ig.v.uS('&');
            }
        }
    };
    public static final m y = new m("AttributeValue_unquoted", 39) { // from class: com.github.catvod.spider.merge.m.O5
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            String strE9 = kJVar.E9(m.b6);
            if (strE9.length() > 0) {
                ig.v.c(strE9);
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.v.uS((char) 65533);
                return;
            }
            if (cOL != ' ') {
                if (cOL != '\"' && cOL != '`') {
                    if (cOL == 65535) {
                        ig.uS(this);
                        ig.C(m.l8);
                        return;
                    }
                    if (cOL != '\t' && cOL != '\n' && cOL != '\f' && cOL != '\r') {
                        if (cOL == '&') {
                            int[] iArrB = ig.b('>', true);
                            if (iArrB != null) {
                                ig.v.eD(iArrB);
                                return;
                            } else {
                                ig.v.uS('&');
                                return;
                            }
                        }
                        if (cOL != '\'') {
                            switch (cOL) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    ig.E9();
                                    ig.C(m.l8);
                                    break;
                                default:
                                    ig.v.uS(cOL);
                                    break;
                            }
                            return;
                        }
                    }
                }
                ig.eD(this);
                ig.v.uS(cOL);
                return;
            }
            ig.C(m.O);
        }
    };
    public static final m Ws = new m("AfterAttributeValue_quoted", 40) { // from class: com.github.catvod.spider.merge.m.p
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                ig.C(m.O);
                return;
            }
            if (cOL == '/') {
                ig.C(m.M);
                return;
            }
            if (cOL == '>') {
                ig.E9();
                ig.C(m.l8);
            } else if (cOL == 65535) {
                ig.uS(this);
                ig.C(m.l8);
            } else {
                kJVar.o();
                ig.eD(this);
                ig.C(m.O);
            }
        }
    };
    public static final m M = new m("SelfClosingStartTag", 41) { // from class: com.github.catvod.spider.merge.m.MN
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '>') {
                ig.v.HM = true;
                ig.E9();
                ig.C(m.l8);
            } else if (cOL == 65535) {
                ig.uS(this);
                ig.C(m.l8);
            } else {
                kJVar.o();
                ig.eD(this);
                ig.C(m.O);
            }
        }
    };
    public static final m Lw = new m("BogusComment", 42) { // from class: com.github.catvod.spider.merge.m.G
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            kJVar.o();
            ig.Kf.E9(kJVar.s('>'));
            char cOL = kJVar.OL();
            if (cOL == '>' || cOL == 65535) {
                ig.hR();
                ig.C(m.l8);
            }
        }
    };
    public static final m DL = new m("MarkupDeclarationOpen", 43) { // from class: com.github.catvod.spider.merge.m.Xk
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.OY("--")) {
                ig.l();
                ig.C(m.f);
            } else {
                if (kJVar.r1("DOCTYPE")) {
                    ig.C(m.ec);
                    return;
                }
                if (kJVar.OY("[CDATA[")) {
                    ig.HM();
                    ig.C(m.m);
                } else {
                    ig.eD(this);
                    ig.OL();
                    ig.l8(m.Lw);
                }
            }
        }
    };
    public static final m f = new m("CommentStart", 44) { // from class: com.github.catvod.spider.merge.m.eE
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.Kf.Kf((char) 65533);
                ig.C(m.FG);
                return;
            }
            if (cOL == '-') {
                ig.C(m.x);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                kJVar.o();
                ig.C(m.FG);
            } else {
                ig.uS(this);
                ig.hR();
                ig.C(m.l8);
            }
        }
    };
    public static final m x = new m("CommentStartDash", 45) { // from class: com.github.catvod.spider.merge.m.ZP
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.Kf.Kf((char) 65533);
                ig.C(m.FG);
                return;
            }
            if (cOL == '-') {
                ig.C(m.x);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                ig.Kf.Kf(cOL);
                ig.C(m.FG);
            } else {
                ig.uS(this);
                ig.hR();
                ig.C(m.l8);
            }
        }
    };
    public static final m FG = new m("Comment", 46) { // from class: com.github.catvod.spider.merge.m.fS
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cED = kJVar.eD();
            if (cED == 0) {
                ig.eD(this);
                kJVar.l8();
                ig.Kf.Kf((char) 65533);
            } else if (cED == '-') {
                ig.l8(m.B);
            } else {
                if (cED != 65535) {
                    ig.Kf.E9(kJVar.Kf('-', 0));
                    return;
                }
                ig.uS(this);
                ig.hR();
                ig.C(m.l8);
            }
        }
    };
    public static final m B = new m("CommentEndDash", 47) { // from class: com.github.catvod.spider.merge.m.x
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.Kf.Kf('-').Kf((char) 65533);
                ig.C(m.FG);
            } else {
                if (cOL == '-') {
                    ig.C(m.Y);
                    return;
                }
                if (cOL != 65535) {
                    ig.Kf.Kf('-').Kf(cOL);
                    ig.C(m.FG);
                } else {
                    ig.uS(this);
                    ig.hR();
                    ig.C(m.l8);
                }
            }
        }
    };
    public static final m Y = new m("CommentEnd", 48) { // from class: com.github.catvod.spider.merge.m.W
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.Kf.E9("--").Kf((char) 65533);
                ig.C(m.FG);
                return;
            }
            if (cOL == '!') {
                ig.eD(this);
                ig.C(m.U);
                return;
            }
            if (cOL == '-') {
                ig.eD(this);
                ig.Kf.Kf('-');
                return;
            }
            if (cOL == '>') {
                ig.hR();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                ig.eD(this);
                ig.Kf.E9("--").Kf(cOL);
                ig.C(m.FG);
            } else {
                ig.uS(this);
                ig.hR();
                ig.C(m.l8);
            }
        }
    };
    public static final m U = new m("CommentEndBang", 49) { // from class: com.github.catvod.spider.merge.m.lE
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.Kf.E9("--!").Kf((char) 65533);
                ig.C(m.FG);
                return;
            }
            if (cOL == '-') {
                ig.Kf.E9("--!");
                ig.C(m.B);
                return;
            }
            if (cOL == '>') {
                ig.hR();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                ig.Kf.E9("--!").Kf(cOL);
                ig.C(m.FG);
            } else {
                ig.uS(this);
                ig.hR();
                ig.C(m.l8);
            }
        }
    };
    public static final m ec = new m("Doctype", 50) { // from class: com.github.catvod.spider.merge.m.xx
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                ig.C(m.im);
                return;
            }
            if (cOL != '>') {
                if (cOL != 65535) {
                    ig.eD(this);
                    ig.C(m.im);
                    return;
                }
                ig.uS(this);
            }
            ig.eD(this);
            ig.tT();
            ig.hR.l = true;
            ig.Kf();
            ig.C(m.l8);
        }
    };
    public static final m im = new m("BeforeDoctypeName", 51) { // from class: com.github.catvod.spider.merge.m.vV
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.hd()) {
                ig.tT();
                ig.C(m.H);
                return;
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.tT();
                ig.hR.S.append((char) 65533);
                ig.C(m.H);
                return;
            }
            if (cOL != ' ') {
                if (cOL == 65535) {
                    ig.uS(this);
                    ig.tT();
                    ig.hR.l = true;
                    ig.Kf();
                    ig.C(m.l8);
                    return;
                }
                if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r') {
                    return;
                }
                ig.tT();
                ig.hR.S.append(cOL);
                ig.C(m.H);
            }
        }
    };
    public static final m H = new m("DoctypeName", 52) { // from class: com.github.catvod.spider.merge.m.Yy
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.hd()) {
                ig.hR.S.append(kJVar.n());
                return;
            }
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.hR.S.append((char) 65533);
                return;
            }
            if (cOL != ' ') {
                if (cOL == '>') {
                    ig.Kf();
                    ig.C(m.l8);
                    return;
                }
                if (cOL == 65535) {
                    ig.uS(this);
                    ig.hR.l = true;
                    ig.Kf();
                    ig.C(m.l8);
                    return;
                }
                if (cOL != '\t' && cOL != '\n' && cOL != '\f' && cOL != '\r') {
                    ig.hR.S.append(cOL);
                    return;
                }
            }
            ig.C(m.J);
        }
    };
    public static final m J = new m("AfterDoctypeName", 53) { // from class: com.github.catvod.spider.merge.m.H
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            if (kJVar.Q()) {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (kJVar.G('\t', '\n', '\r', '\f', ' ')) {
                kJVar.l8();
                return;
            }
            if (kJVar.R('>')) {
                ig.Kf();
                ig.l8(m.l8);
                return;
            }
            if (kJVar.r1("PUBLIC")) {
                ig.hR.T4 = "PUBLIC";
                ig.C(m.I);
            } else if (kJVar.r1("SYSTEM")) {
                ig.hR.T4 = "SYSTEM";
                ig.C(m.Xc);
            } else {
                ig.eD(this);
                ig.hR.l = true;
                ig.l8(m.e);
            }
        }
    };
    public static final m I = new m("AfterDoctypePublicKeyword", 54) { // from class: com.github.catvod.spider.merge.m.Cj
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                ig.C(m.t2);
                return;
            }
            if (cOL == '\"') {
                ig.eD(this);
                ig.C(m.r0);
                return;
            }
            if (cOL == '\'') {
                ig.eD(this);
                ig.C(m.gh);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.eD(this);
                ig.hR.l = true;
                ig.C(m.e);
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m t2 = new m("BeforeDoctypePublicIdentifier", 55) { // from class: com.github.catvod.spider.merge.m.S
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                return;
            }
            if (cOL == '\"') {
                ig.C(m.r0);
                return;
            }
            if (cOL == '\'') {
                ig.C(m.gh);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.eD(this);
                ig.hR.l = true;
                ig.C(m.e);
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m r0 = new m("DoctypePublicIdentifier_doubleQuoted", 56) { // from class: com.github.catvod.spider.merge.m.xy
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.hR.b.append((char) 65533);
                return;
            }
            if (cOL == '\"') {
                ig.C(m.Jb);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.hR.b.append(cOL);
                return;
            }
            ig.uS(this);
            ig.hR.l = true;
            ig.Kf();
            ig.C(m.l8);
        }
    };
    public static final m gh = new m("DoctypePublicIdentifier_singleQuoted", 57) { // from class: com.github.catvod.spider.merge.m.kN
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.hR.b.append((char) 65533);
                return;
            }
            if (cOL == '\'') {
                ig.C(m.Jb);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.hR.b.append(cOL);
                return;
            }
            ig.uS(this);
            ig.hR.l = true;
            ig.Kf();
            ig.C(m.l8);
        }
    };
    public static final m Jb = new m("AfterDoctypePublicIdentifier", 58) { // from class: com.github.catvod.spider.merge.m.f3
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                ig.C(m.nZ);
                return;
            }
            if (cOL == '\"') {
                ig.eD(this);
                ig.C(m.n6);
                return;
            }
            if (cOL == '\'') {
                ig.eD(this);
                ig.C(m.OT);
                return;
            }
            if (cOL == '>') {
                ig.Kf();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                ig.eD(this);
                ig.hR.l = true;
                ig.C(m.e);
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m nZ = new m("BetweenDoctypePublicAndSystemIdentifiers", 59) { // from class: com.github.catvod.spider.merge.m.E
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                return;
            }
            if (cOL == '\"') {
                ig.eD(this);
                ig.C(m.n6);
                return;
            }
            if (cOL == '\'') {
                ig.eD(this);
                ig.C(m.OT);
                return;
            }
            if (cOL == '>') {
                ig.Kf();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                ig.eD(this);
                ig.hR.l = true;
                ig.C(m.e);
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m Xc = new m("AfterDoctypeSystemKeyword", 60) { // from class: com.github.catvod.spider.merge.m.VU
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                ig.C(m.h);
                return;
            }
            if (cOL == '\"') {
                ig.eD(this);
                ig.C(m.n6);
                return;
            }
            if (cOL == '\'') {
                ig.eD(this);
                ig.C(m.OT);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m h = new m("BeforeDoctypeSystemIdentifier", 61) { // from class: com.github.catvod.spider.merge.m.oU
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                return;
            }
            if (cOL == '\"') {
                ig.C(m.n6);
                return;
            }
            if (cOL == '\'') {
                ig.C(m.OT);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.eD(this);
                ig.hR.l = true;
                ig.C(m.e);
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m n6 = new m("DoctypeSystemIdentifier_doubleQuoted", 62) { // from class: com.github.catvod.spider.merge.m.qS
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.hR.OL.append((char) 65533);
                return;
            }
            if (cOL == '\"') {
                ig.C(m.vi);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.hR.OL.append(cOL);
                return;
            }
            ig.uS(this);
            ig.hR.l = true;
            ig.Kf();
            ig.C(m.l8);
        }
    };
    public static final m OT = new m("DoctypeSystemIdentifier_singleQuoted", 63) { // from class: com.github.catvod.spider.merge.m.Rc
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == 0) {
                ig.eD(this);
                ig.hR.OL.append((char) 65533);
                return;
            }
            if (cOL == '\'') {
                ig.C(m.vi);
                return;
            }
            if (cOL == '>') {
                ig.eD(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
                return;
            }
            if (cOL != 65535) {
                ig.hR.OL.append(cOL);
                return;
            }
            ig.uS(this);
            ig.hR.l = true;
            ig.Kf();
            ig.C(m.l8);
        }
    };
    public static final m vi = new m("AfterDoctypeSystemIdentifier", 64) { // from class: com.github.catvod.spider.merge.m.kA
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                return;
            }
            if (cOL == '>') {
                ig.Kf();
                ig.C(m.l8);
            } else if (cOL != 65535) {
                ig.eD(this);
                ig.C(m.e);
            } else {
                ig.uS(this);
                ig.hR.l = true;
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m e = new m("BogusDoctype", 65) { // from class: com.github.catvod.spider.merge.m.t
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cOL = kJVar.OL();
            if (cOL == '>') {
                ig.Kf();
                ig.C(m.l8);
            } else {
                if (cOL != 65535) {
                    return;
                }
                ig.Kf();
                ig.C(m.l8);
            }
        }
    };
    public static final m m = new m("CdataSection", 66) { // from class: com.github.catvod.spider.merge.m.in
        {
            a aVar = null;
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            ig.n.append(kJVar.hR("]]>"));
            if (kJVar.OY("]]>") || kJVar.Q()) {
                ig.cD(new mt.ut(ig.n.toString()));
                ig.C(m.l8);
            }
        }
    };
    private static final /* synthetic */ m[] Kw = {l8, S, T4, b, OL, l, tT, N, HM, n, v, A, cD, s, hR, Kf, E9, uS, c, eD, Q, W, C, OY, r1, R, bc, G, rD, oH, A0, hd, d, O, Bz, H6, PP, o, mF, y, Ws, M, Lw, DL, f, x, FG, B, Y, U, ec, im, H, J, I, t2, r0, gh, Jb, nZ, Xc, h, n6, OT, vi, e, m};
    static final char[] UM = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
    static final char[] b6 = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
    private static final String L = String.valueOf((char) 65533);

    class a extends m {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.github.catvod.spider.merge.m
        void HM(Ig ig, kJ kJVar) {
            char cED = kJVar.eD();
            if (cED == 0) {
                ig.eD(this);
                ig.n(kJVar.OL());
            } else {
                if (cED == '&') {
                    ig.l8(m.S);
                    return;
                }
                if (cED == '<') {
                    ig.l8(m.N);
                } else if (cED != 65535) {
                    ig.v(kJVar.tT());
                } else {
                    ig.cD(new mt.OD());
                }
            }
        }
    }

    private m(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(Ig ig, kJ kJVar, m mVar, m mVar2) {
        char cED = kJVar.eD();
        if (cED == 0) {
            ig.eD(mVar);
            kJVar.l8();
            ig.n((char) 65533);
        } else if (cED == '<') {
            ig.l8(mVar2);
        } else if (cED != 65535) {
            ig.v(kJVar.A());
        } else {
            ig.cD(new mt.OD());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Ig ig, kJ kJVar, m mVar) {
        if (kJVar.hd()) {
            String strN = kJVar.n();
            ig.v.W(strN);
            ig.n.append(strN);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (ig.Q() && !kJVar.Q()) {
            char cOL = kJVar.OL();
            if (cOL == '\t' || cOL == '\n' || cOL == '\f' || cOL == '\r' || cOL == ' ') {
                ig.C(O);
            } else if (cOL == '/') {
                ig.C(M);
            } else if (cOL != '>') {
                ig.n.append(cOL);
                z = true;
            } else {
                ig.E9();
                ig.C(l8);
            }
            z2 = z;
        }
        if (z2) {
            ig.v("</");
            ig.A(ig.n);
            ig.C(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Ig ig, m mVar) {
        int[] iArrB = ig.b(null, false);
        if (iArrB == null) {
            ig.n('&');
        } else {
            ig.s(iArrB);
        }
        ig.C(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tT(Ig ig, kJ kJVar, m mVar, m mVar2) {
        if (kJVar.hd()) {
            String strN = kJVar.n();
            ig.n.append(strN);
            ig.v(strN);
            return;
        }
        char cOL = kJVar.OL();
        if (cOL != '\t' && cOL != '\n' && cOL != '\f' && cOL != '\r' && cOL != ' ' && cOL != '/' && cOL != '>') {
            kJVar.o();
            ig.C(mVar2);
        } else {
            if (ig.n.toString().equals("script")) {
                ig.C(mVar);
            } else {
                ig.C(mVar2);
            }
            ig.n(cOL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(Ig ig, kJ kJVar, m mVar, m mVar2) {
        if (kJVar.hd()) {
            ig.N(false);
            ig.C(mVar);
        } else {
            ig.v("</");
            ig.C(mVar2);
        }
    }

    abstract void HM(Ig ig, kJ kJVar);

    /* synthetic */ m(String str, int i2, a aVar) {
        this(str, i2);
    }
}
