package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0108Zo;
import java.io.IOException;

/* renamed from: com.github.catvod.spider.merge.dT */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
abstract class EnumC0115dT extends Enum<EnumC0115dT> {

    /* renamed from: q */
    public static final EnumC0115dT f657q = new N("Data", 0);

    /* renamed from: xC */
    public static final EnumC0115dT f670xC = new EnumC0115dT("CharacterReferenceInData", 1) { // from class: com.github.catvod.spider.merge.dT.lm


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m586W(c0059ev, EnumC0115dT.f657q);
        }
    };

    /* renamed from: QU */
    public static final EnumC0115dT f624QU = new EnumC0115dT("Rcdata", 2) { // from class: com.github.catvod.spider.merge.dT.au


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else {
                if (cM162E == '&') {
                    c0059ev.m151q(EnumC0115dT.f629UJ);
                    return;
                }
                if (cM162E == '<') {
                    c0059ev.m151q(EnumC0115dT.f611FN);
                } else if (cM162E != 65535) {
                    c0059ev.m137FN(c0060Eo.m182i());
                } else {
                    c0059ev.m154w8(new AbstractC0108Zo.oK());
                }
            }
        }
    };

    /* renamed from: UJ */
    public static final EnumC0115dT f629UJ = new EnumC0115dT("CharacterReferenceInRcdata", 3) { // from class: com.github.catvod.spider.merge.dT.wT


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m586W(c0059ev, EnumC0115dT.f624QU);
        }
    };

    /* renamed from: u */
    public static final EnumC0115dT f663u = new EnumC0115dT("Rawtext", 4) { // from class: com.github.catvod.spider.merge.dT.Ks


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m580B(c0059ev, c0060Eo, this, EnumC0115dT.f610F);
        }
    };

    /* renamed from: Mo */
    public static final EnumC0115dT f621Mo = new EnumC0115dT("ScriptData", 5) { // from class: com.github.catvod.spider.merge.dT.OO


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m580B(c0059ev, c0060Eo, this, EnumC0115dT.f646k);
        }
    };

    /* renamed from: i */
    public static final EnumC0115dT f643i = new EnumC0115dT("PLAINTEXT", 6) { // from class: com.github.catvod.spider.merge.dT.BN


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else if (cM162E != 65535) {
                c0059ev.m137FN(c0060Eo.m163F((char) 0));
            } else {
                c0059ev.m154w8(new AbstractC0108Zo.oK());
            }
        }
    };

    /* renamed from: MH */
    public static final EnumC0115dT f620MH = new EnumC0115dT("TagOpen", 7) { // from class: com.github.catvod.spider.merge.dT.lK


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == '!') {
                c0059ev.m151q(EnumC0115dT.f631V);
                return;
            }
            if (cM162E == '/') {
                c0059ev.m151q(EnumC0115dT.f661se);
                return;
            }
            if (cM162E == '?') {
                c0059ev.m153u();
                c0059ev.m151q(EnumC0115dT.f650mT);
            } else if (c0060Eo.m180d()) {
                c0059ev.m140MH(true);
                c0059ev.m149l(EnumC0115dT.f632W);
            } else {
                c0059ev.m135E(this);
                c0059ev.m145W('<');
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: se */
    public static final EnumC0115dT f661se = new EnumC0115dT("EndTagOpen", 8) { // from class: com.github.catvod.spider.merge.dT.SP


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m137FN("</");
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (c0060Eo.m180d()) {
                c0059ev.m140MH(false);
                c0059ev.m149l(EnumC0115dT.f632W);
            } else if (c0060Eo.m177UN('>')) {
                c0059ev.m135E(this);
                c0059ev.m151q(EnumC0115dT.f657q);
            } else {
                c0059ev.m135E(this);
                c0059ev.m153u();
                c0059ev.m151q(EnumC0115dT.f650mT);
            }
        }
    };

    /* renamed from: W */
    public static final EnumC0115dT f632W = new EnumC0115dT("TagName", 9) { // from class: com.github.catvod.spider.merge.dT.p


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0059ev.f332FN.m545go(c0060Eo.m192w8());
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.f332FN.m545go(EnumC0115dT.f665v);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == '/') {
                    c0059ev.m149l(EnumC0115dT.f635c);
                    return;
                }
                if (cM191u == '<') {
                    c0060Eo.m168M();
                    c0059ev.m135E(this);
                } else if (cM191u != '>') {
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    } else if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                        c0059ev.f332FN.m548p(cM191u);
                        return;
                    }
                }
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            c0059ev.m149l(EnumC0115dT.f649m);
        }
    };

    /* renamed from: FN */
    public static final EnumC0115dT f611FN = new EnumC0115dT("RcdataLessthanSign", 10) { // from class: com.github.catvod.spider.merge.dT.Qe


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m177UN('/')) {
                c0059ev.m152se();
                c0059ev.m151q(EnumC0115dT.f605B);
                return;
            }
            if (c0060Eo.m180d() && c0059ev.m155xC() != null) {
                if (!c0060Eo.m166IS("</" + c0059ev.m155xC())) {
                    c0059ev.f332FN = c0059ev.m140MH(false).m539P(c0059ev.m155xC());
                    c0059ev.m148k();
                    c0059ev.m149l(EnumC0115dT.f620MH);
                    return;
                }
            }
            c0059ev.m137FN("<");
            c0059ev.m149l(EnumC0115dT.f624QU);
        }
    };

    /* renamed from: B */
    public static final EnumC0115dT f605B = new EnumC0115dT("RCDATAEndTagOpen", 11) { // from class: com.github.catvod.spider.merge.dT.J


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m180d()) {
                c0059ev.m137FN("</");
                c0059ev.m149l(EnumC0115dT.f624QU);
            } else {
                c0059ev.m140MH(false);
                c0059ev.f332FN.m548p(c0060Eo.m162E());
                c0059ev.f341W.append(c0060Eo.m162E());
                c0059ev.m151q(EnumC0115dT.f666w8);
            }
        }
    };

    /* renamed from: w8 */
    public static final EnumC0115dT f666w8 = new EnumC0115dT("RCDATAEndTagName", 12) { // from class: com.github.catvod.spider.merge.dT.FD


        /* renamed from: w8 */
        private void m592w8(C0059EV c0059ev, C0060Eo c0060Eo) {
            c0059ev.m137FN("</");
            c0059ev.m134B(c0059ev.f341W);
            c0060Eo.m168M();
            c0059ev.m149l(EnumC0115dT.f624QU);
        }

        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m180d()) {
                String strM178W = c0060Eo.m178W();
                c0059ev.f332FN.m545go(strM178W);
                c0059ev.f341W.append(strM178W);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                if (c0059ev.m150p()) {
                    c0059ev.m149l(EnumC0115dT.f649m);
                    return;
                } else {
                    m592w8(c0059ev, c0060Eo);
                    return;
                }
            }
            if (cM191u == '/') {
                if (c0059ev.m150p()) {
                    c0059ev.m149l(EnumC0115dT.f635c);
                    return;
                } else {
                    m592w8(c0059ev, c0060Eo);
                    return;
                }
            }
            if (cM191u != '>') {
                m592w8(c0059ev, c0060Eo);
            } else if (!c0059ev.m150p()) {
                m592w8(c0059ev, c0060Eo);
            } else {
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: F */
    public static final EnumC0115dT f610F = new EnumC0115dT("RawtextLessthanSign", 13) { // from class: com.github.catvod.spider.merge.dT.Qt


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m177UN('/')) {
                c0059ev.m152se();
                c0059ev.m151q(EnumC0115dT.f625RH);
            } else {
                c0059ev.m145W('<');
                c0059ev.m149l(EnumC0115dT.f663u);
            }
        }
    };

    /* renamed from: RH */
    public static final EnumC0115dT f625RH = new EnumC0115dT("RawtextEndTagOpen", 14) { // from class: com.github.catvod.spider.merge.dT.oK


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m581FN(c0059ev, c0060Eo, EnumC0115dT.f616KT, EnumC0115dT.f663u);
        }
    };

    /* renamed from: KT */
    public static final EnumC0115dT f616KT = new EnumC0115dT("RawtextEndTagName", 15) { // from class: com.github.catvod.spider.merge.dT.t7


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m582MH(c0059ev, c0060Eo, EnumC0115dT.f663u);
        }
    };

    /* renamed from: k */
    public static final EnumC0115dT f646k = new EnumC0115dT("ScriptDataLessthanSign", 16) { // from class: com.github.catvod.spider.merge.dT.Vm


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '!') {
                c0059ev.m137FN("<!");
                c0059ev.m149l(EnumC0115dT.f609E);
                return;
            }
            if (cM191u == '/') {
                c0059ev.m152se();
                c0059ev.m149l(EnumC0115dT.f627Tz);
            } else if (cM191u != 65535) {
                c0059ev.m137FN("<");
                c0060Eo.m168M();
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else {
                c0059ev.m137FN("<");
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: Tz */
    public static final EnumC0115dT f627Tz = new EnumC0115dT("ScriptDataEndTagOpen", 17) { // from class: com.github.catvod.spider.merge.dT.yn


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m581FN(c0059ev, c0060Eo, EnumC0115dT.f615IS, EnumC0115dT.f621Mo);
        }
    };

    /* renamed from: IS */
    public static final EnumC0115dT f615IS = new EnumC0115dT("ScriptDataEndTagName", 18) { // from class: com.github.catvod.spider.merge.dT.O


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m582MH(c0059ev, c0060Eo, EnumC0115dT.f621Mo);
        }
    };

    /* renamed from: E */
    public static final EnumC0115dT f609E = new EnumC0115dT("ScriptDataEscapeStart", 19) { // from class: com.github.catvod.spider.merge.dT.b


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m177UN('-')) {
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else {
                c0059ev.m145W('-');
                c0059ev.m151q(EnumC0115dT.f654p);
            }
        }
    };

    /* renamed from: p */
    public static final EnumC0115dT f654p = new EnumC0115dT("ScriptDataEscapeStartDash", 20) { // from class: com.github.catvod.spider.merge.dT.HU


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m177UN('-')) {
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else {
                c0059ev.m145W('-');
                c0059ev.m151q(EnumC0115dT.f607BP);
            }
        }
    };

    /* renamed from: go */
    public static final EnumC0115dT f641go = new EnumC0115dT("ScriptDataEscaped", 21) { // from class: com.github.catvod.spider.merge.dT.Q


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else if (cM162E == '-') {
                c0059ev.m145W('-');
                c0059ev.m151q(EnumC0115dT.f648l);
            } else if (cM162E != '<') {
                c0059ev.m137FN(c0060Eo.m167KT('-', '<', 0));
            } else {
                c0059ev.m151q(EnumC0115dT.f672yS);
            }
        }
    };

    /* renamed from: l */
    public static final EnumC0115dT f648l = new EnumC0115dT("ScriptDataEscapedDash", 22) { // from class: com.github.catvod.spider.merge.dT.MS


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f641go);
            } else if (cM191u == '-') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f607BP);
            } else if (cM191u == '<') {
                c0059ev.m149l(EnumC0115dT.f672yS);
            } else {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f641go);
            }
        }
    };

    /* renamed from: BP */
    public static final EnumC0115dT f607BP = new EnumC0115dT("ScriptDataEscapedDashDash", 23) { // from class: com.github.catvod.spider.merge.dT.tY


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f641go);
            } else {
                if (cM191u == '-') {
                    c0059ev.m145W(cM191u);
                    return;
                }
                if (cM191u == '<') {
                    c0059ev.m149l(EnumC0115dT.f672yS);
                } else if (cM191u != '>') {
                    c0059ev.m145W(cM191u);
                    c0059ev.m149l(EnumC0115dT.f641go);
                } else {
                    c0059ev.m145W(cM191u);
                    c0059ev.m149l(EnumC0115dT.f621Mo);
                }
            }
        }
    };

    /* renamed from: yS */
    public static final EnumC0115dT f672yS = new EnumC0115dT("ScriptDataEscapedLessthanSign", 24) { // from class: com.github.catvod.spider.merge.dT.Y


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m180d()) {
                c0059ev.m152se();
                c0059ev.f341W.append(c0060Eo.m162E());
                c0059ev.m137FN("<");
                c0059ev.m145W(c0060Eo.m162E());
                c0059ev.m151q(EnumC0115dT.f656pb);
                return;
            }
            if (c0060Eo.m177UN('/')) {
                c0059ev.m152se();
                c0059ev.m151q(EnumC0115dT.f630UN);
            } else {
                c0059ev.m145W('<');
                c0059ev.m149l(EnumC0115dT.f641go);
            }
        }
    };

    /* renamed from: UN */
    public static final EnumC0115dT f630UN = new EnumC0115dT("ScriptDataEscapedEndTagOpen", 25) { // from class: com.github.catvod.spider.merge.dT.LA


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m180d()) {
                c0059ev.m137FN("</");
                c0059ev.m149l(EnumC0115dT.f641go);
            } else {
                c0059ev.m140MH(false);
                c0059ev.f332FN.m548p(c0060Eo.m162E());
                c0059ev.f341W.append(c0060Eo.m162E());
                c0059ev.m151q(EnumC0115dT.f612Fp);
            }
        }
    };

    /* renamed from: Fp */
    public static final EnumC0115dT f612Fp = new EnumC0115dT("ScriptDataEscapedEndTagName", 26) { // from class: com.github.catvod.spider.merge.dT.Ux


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m582MH(c0059ev, c0060Eo, EnumC0115dT.f641go);
        }
    };

    /* renamed from: pb */
    public static final EnumC0115dT f656pb = new EnumC0115dT("ScriptDataDoubleEscapeStart", 27) { // from class: com.github.catvod.spider.merge.dT.Dl


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m587i(c0059ev, c0060Eo, EnumC0115dT.f623P, EnumC0115dT.f641go);
        }
    };

    /* renamed from: P */
    public static final EnumC0115dT f623P = new EnumC0115dT("ScriptDataDoubleEscaped", 28) { // from class: com.github.catvod.spider.merge.dT.V


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else if (cM162E == '-') {
                c0059ev.m145W(cM162E);
                c0059ev.m151q(EnumC0115dT.f633Xl);
            } else if (cM162E == '<') {
                c0059ev.m145W(cM162E);
                c0059ev.m151q(EnumC0115dT.f636d);
            } else if (cM162E != 65535) {
                c0059ev.m137FN(c0060Eo.m167KT('-', '<', 0));
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: Xl */
    public static final EnumC0115dT f633Xl = new EnumC0115dT("ScriptDataDoubleEscapedDash", 29) { // from class: com.github.catvod.spider.merge.dT.Tb


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f623P);
            } else if (cM191u == '-') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f640fH);
            } else if (cM191u == '<') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f636d);
            } else if (cM191u != 65535) {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f623P);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: fH */
    public static final EnumC0115dT f640fH = new EnumC0115dT("ScriptDataDoubleEscapedDashDash", 30) { // from class: com.github.catvod.spider.merge.dT.s


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f623P);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m145W(cM191u);
                return;
            }
            if (cM191u == '<') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f636d);
            } else if (cM191u == '>') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else if (cM191u != 65535) {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f623P);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: d */
    public static final EnumC0115dT f636d = new EnumC0115dT("ScriptDataDoubleEscapedLessthanSign", 31) { // from class: com.github.catvod.spider.merge.dT.l


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m177UN('/')) {
                c0059ev.m149l(EnumC0115dT.f623P);
                return;
            }
            c0059ev.m145W('/');
            c0059ev.m152se();
            c0059ev.m151q(EnumC0115dT.f628U);
        }
    };

    /* renamed from: U */
    public static final EnumC0115dT f628U = new EnumC0115dT("ScriptDataDoubleEscapeEnd", 32) { // from class: com.github.catvod.spider.merge.dT.qB


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m587i(c0059ev, c0060Eo, EnumC0115dT.f641go, EnumC0115dT.f623P);
        }
    };

    /* renamed from: m */
    public static final EnumC0115dT f649m = new EnumC0115dT("BeforeAttributeName", 33) { // from class: com.github.catvod.spider.merge.dT.U


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0060Eo.m168M();
                c0059ev.m135E(this);
                c0059ev.f332FN.m543Xl();
                c0059ev.m149l(EnumC0115dT.f626T);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '\'') {
                    if (cM191u == '/') {
                        c0059ev.m149l(EnumC0115dT.f635c);
                        return;
                    }
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                        return;
                    }
                    switch (cM191u) {
                        case '<':
                            c0060Eo.m168M();
                            c0059ev.m135E(this);
                            break;
                        case '=':
                            break;
                        case '>':
                            break;
                        default:
                            c0059ev.f332FN.m543Xl();
                            c0060Eo.m168M();
                            c0059ev.m149l(EnumC0115dT.f626T);
                            return;
                    }
                    c0059ev.m148k();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m543Xl();
                c0059ev.f332FN.m538KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f626T);
            }
        }
    };

    /* renamed from: T */
    public static final EnumC0115dT f626T = new EnumC0115dT("AttributeName", 34) { // from class: com.github.catvod.spider.merge.dT.F


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0059ev.f332FN.m546k(c0060Eo.m183k(EnumC0115dT.f647kB));
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m538KT((char) 65533);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '\'') {
                    if (cM191u == '/') {
                        c0059ev.m149l(EnumC0115dT.f635c);
                        return;
                    }
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                        switch (cM191u) {
                            case '<':
                                break;
                            case '=':
                                c0059ev.m149l(EnumC0115dT.f658rF);
                                break;
                            case '>':
                                c0059ev.m148k();
                                c0059ev.m149l(EnumC0115dT.f657q);
                                break;
                            default:
                                c0059ev.f332FN.m538KT(cM191u);
                                break;
                        }
                        return;
                    }
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m538KT(cM191u);
                return;
            }
            c0059ev.m149l(EnumC0115dT.f660s);
        }
    };

    /* renamed from: s */
    public static final EnumC0115dT f660s = new EnumC0115dT("AfterAttributeName", 35) { // from class: com.github.catvod.spider.merge.dT.Sb


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m538KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f626T);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '\'') {
                    if (cM191u == '/') {
                        c0059ev.m149l(EnumC0115dT.f635c);
                        return;
                    }
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                        return;
                    }
                    switch (cM191u) {
                        case '<':
                            break;
                        case '=':
                            c0059ev.m149l(EnumC0115dT.f658rF);
                            break;
                        case '>':
                            c0059ev.m148k();
                            c0059ev.m149l(EnumC0115dT.f657q);
                            break;
                        default:
                            c0059ev.f332FN.m543Xl();
                            c0060Eo.m168M();
                            c0059ev.m149l(EnumC0115dT.f626T);
                            break;
                    }
                    return;
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m543Xl();
                c0059ev.f332FN.m538KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f626T);
            }
        }
    };

    /* renamed from: rF */
    public static final EnumC0115dT f658rF = new EnumC0115dT("BeforeAttributeValue", 36) { // from class: com.github.catvod.spider.merge.dT.jm


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                c0059ev.m149l(EnumC0115dT.f662t);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == '\"') {
                    c0059ev.m149l(EnumC0115dT.f618M);
                    return;
                }
                if (cM191u != '`') {
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m148k();
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                        return;
                    }
                    if (cM191u == '&') {
                        c0060Eo.m168M();
                        c0059ev.m149l(EnumC0115dT.f662t);
                        return;
                    }
                    if (cM191u == '\'') {
                        c0059ev.m149l(EnumC0115dT.f667wR);
                        return;
                    }
                    switch (cM191u) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            c0059ev.m135E(this);
                            c0059ev.m148k();
                            c0059ev.m149l(EnumC0115dT.f657q);
                            break;
                        default:
                            c0060Eo.m168M();
                            c0059ev.m149l(EnumC0115dT.f662t);
                            break;
                    }
                    return;
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz(cM191u);
                c0059ev.m149l(EnumC0115dT.f662t);
            }
        }
    };

    /* renamed from: M */
    public static final EnumC0115dT f618M = new EnumC0115dT("AttributeValue_doubleQuoted", 37) { // from class: com.github.catvod.spider.merge.dT.d


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            String strM170Mo = c0060Eo.m170Mo(false);
            if (strM170Mo.length() > 0) {
                c0059ev.f332FN.m537IS(strM170Mo);
            } else {
                c0059ev.f332FN.m541U();
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f673z);
                return;
            }
            if (cM191u != '&') {
                if (cM191u != 65535) {
                    c0059ev.f332FN.m540Tz(cM191u);
                    return;
                } else {
                    c0059ev.m143Tz(this);
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
            }
            int[] iArrM144UJ = c0059ev.m144UJ('\"', true);
            if (iArrM144UJ != null) {
                c0059ev.f332FN.m535E(iArrM144UJ);
            } else {
                c0059ev.f332FN.m540Tz('&');
            }
        }
    };

    /* renamed from: wR */
    public static final EnumC0115dT f667wR = new EnumC0115dT("AttributeValue_singleQuoted", 38) { // from class: com.github.catvod.spider.merge.dT.p8


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            String strM170Mo = c0060Eo.m170Mo(true);
            if (strM170Mo.length() > 0) {
                c0059ev.f332FN.m537IS(strM170Mo);
            } else {
                c0059ev.f332FN.m541U();
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                return;
            }
            if (cM191u == 65535) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != '&') {
                if (cM191u != '\'') {
                    c0059ev.f332FN.m540Tz(cM191u);
                    return;
                } else {
                    c0059ev.m149l(EnumC0115dT.f673z);
                    return;
                }
            }
            int[] iArrM144UJ = c0059ev.m144UJ('\'', true);
            if (iArrM144UJ != null) {
                c0059ev.f332FN.m535E(iArrM144UJ);
            } else {
                c0059ev.f332FN.m540Tz('&');
            }
        }
    };

    /* renamed from: t */
    public static final EnumC0115dT f662t = new EnumC0115dT("AttributeValue_unquoted", 39) { // from class: com.github.catvod.spider.merge.dT.r


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            String strM183k = c0060Eo.m183k(EnumC0115dT.f659rO);
            if (strM183k.length() > 0) {
                c0059ev.f332FN.m537IS(strM183k);
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '`') {
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                        if (cM191u == '&') {
                            int[] iArrM144UJ = c0059ev.m144UJ('>', true);
                            if (iArrM144UJ != null) {
                                c0059ev.f332FN.m535E(iArrM144UJ);
                                return;
                            } else {
                                c0059ev.f332FN.m540Tz('&');
                                return;
                            }
                        }
                        if (cM191u != '\'') {
                            switch (cM191u) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c0059ev.m148k();
                                    c0059ev.m149l(EnumC0115dT.f657q);
                                    break;
                                default:
                                    c0059ev.f332FN.m540Tz(cM191u);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz(cM191u);
                return;
            }
            c0059ev.m149l(EnumC0115dT.f649m);
        }
    };

    /* renamed from: z */
    public static final EnumC0115dT f673z = new EnumC0115dT("AfterAttributeValue_quoted", 40) { // from class: com.github.catvod.spider.merge.dT.vp


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f649m);
                return;
            }
            if (cM191u == '/') {
                c0059ev.m149l(EnumC0115dT.f635c);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u == 65535) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            } else {
                c0060Eo.m168M();
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f649m);
            }
        }
    };

    /* renamed from: c */
    public static final EnumC0115dT f635c = new EnumC0115dT("SelfClosingStartTag", 41) { // from class: com.github.catvod.spider.merge.dT.mQ


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '>') {
                c0059ev.f332FN.f595se = true;
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u == 65535) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            } else {
                c0060Eo.m168M();
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f649m);
            }
        }
    };

    /* renamed from: mT */
    public static final EnumC0115dT f650mT = new EnumC0115dT("BogusComment", 42) { // from class: com.github.catvod.spider.merge.dT.tG


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0060Eo.m168M();
            c0059ev.f334KT.m522k(c0060Eo.m163F('>'));
            char cM191u = c0060Eo.m191u();
            if (cM191u == '>' || cM191u == 65535) {
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: V */
    public static final EnumC0115dT f631V = new EnumC0115dT("MarkupDeclarationOpen", 43) { // from class: com.github.catvod.spider.merge.dT.Nx


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m161BP("--")) {
                c0059ev.m141Mo();
                c0059ev.m149l(EnumC0115dT.f644id);
            } else {
                if (c0060Eo.m194yS("DOCTYPE")) {
                    c0059ev.m149l(EnumC0115dT.f652nT);
                    return;
                }
                if (c0060Eo.m161BP("[CDATA[")) {
                    c0059ev.m152se();
                    c0059ev.m149l(EnumC0115dT.f603A);
                } else {
                    c0059ev.m135E(this);
                    c0059ev.m153u();
                    c0059ev.m151q(EnumC0115dT.f650mT);
                }
            }
        }
    };

    /* renamed from: id */
    public static final EnumC0115dT f644id = new EnumC0115dT("CommentStart", 44) { // from class: com.github.catvod.spider.merge.dT.w


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m149l(EnumC0115dT.f608BY);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0060Eo.m168M();
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: BY */
    public static final EnumC0115dT f608BY = new EnumC0115dT("CommentStartDash", 45) { // from class: com.github.catvod.spider.merge.dT.ga


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m149l(EnumC0115dT.f608BY);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.f334KT.m521KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: Oz */
    public static final EnumC0115dT f622Oz = new EnumC0115dT("Comment", 46) { // from class: com.github.catvod.spider.merge.dT.c


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.f334KT.m521KT((char) 65533);
            } else if (cM162E == '-') {
                c0059ev.m151q(EnumC0115dT.f606BE);
            } else {
                if (cM162E != 65535) {
                    c0059ev.f334KT.m522k(c0060Eo.m167KT('-', 0));
                    return;
                }
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: BE */
    public static final EnumC0115dT f606BE = new EnumC0115dT("CommentEndDash", 47) { // from class: com.github.catvod.spider.merge.dT.dC


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT('-').m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                if (cM191u == '-') {
                    c0059ev.m149l(EnumC0115dT.f634Z);
                    return;
                }
                if (cM191u != 65535) {
                    c0059ev.f334KT.m521KT('-').m521KT(cM191u);
                    c0059ev.m149l(EnumC0115dT.f622Oz);
                } else {
                    c0059ev.m143Tz(this);
                    c0059ev.m142RH();
                    c0059ev.m149l(EnumC0115dT.f657q);
                }
            }
        }
    };

    /* renamed from: Z */
    public static final EnumC0115dT f634Z = new EnumC0115dT("CommentEnd", 48) { // from class: com.github.catvod.spider.merge.dT.i9


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m522k("--").m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '!') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f614I);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT('-');
                return;
            }
            if (cM191u == '>') {
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m522k("--").m521KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: I */
    public static final EnumC0115dT f614I = new EnumC0115dT("CommentEndBang", 49) { // from class: com.github.catvod.spider.merge.dT.f4


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m522k("--!").m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '-') {
                c0059ev.f334KT.m522k("--!");
                c0059ev.m149l(EnumC0115dT.f606BE);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.f334KT.m522k("--!").m521KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: nT */
    public static final EnumC0115dT f652nT = new EnumC0115dT("Doctype", 50) { // from class: com.github.catvod.spider.merge.dT.V3


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f645ip);
                return;
            }
            if (cM191u != '>') {
                if (cM191u != 65535) {
                    c0059ev.m135E(this);
                    c0059ev.m149l(EnumC0115dT.f645ip);
                    return;
                }
                c0059ev.m143Tz(this);
            }
            c0059ev.m135E(this);
            c0059ev.m147i();
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    };

    /* renamed from: ip */
    public static final EnumC0115dT f645ip = new EnumC0115dT("BeforeDoctypeName", 51) { // from class: com.github.catvod.spider.merge.dT.ZM


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m180d()) {
                c0059ev.m147i();
                c0059ev.m149l(EnumC0115dT.f617L);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m147i();
                c0059ev.f338RH.f588xC.append((char) 65533);
                c0059ev.m149l(EnumC0115dT.f617L);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == 65535) {
                    c0059ev.m143Tz(this);
                    c0059ev.m147i();
                    c0059ev.f338RH.f584Mo = true;
                    c0059ev.m139KT();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                    return;
                }
                c0059ev.m147i();
                c0059ev.f338RH.f588xC.append(cM191u);
                c0059ev.m149l(EnumC0115dT.f617L);
            }
        }
    };

    /* renamed from: L */
    public static final EnumC0115dT f617L = new EnumC0115dT("DoctypeName", 52) { // from class: com.github.catvod.spider.merge.dT.ZJ


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m180d()) {
                c0059ev.f338RH.f588xC.append(c0060Eo.m178W());
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f588xC.append((char) 65533);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == '>') {
                    c0059ev.m139KT();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                if (cM191u == 65535) {
                    c0059ev.m143Tz(this);
                    c0059ev.f338RH.f584Mo = true;
                    c0059ev.m139KT();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                    c0059ev.f338RH.f588xC.append(cM191u);
                    return;
                }
            }
            c0059ev.m149l(EnumC0115dT.f653om);
        }
    };

    /* renamed from: om */
    public static final EnumC0115dT f653om = new EnumC0115dT("AfterDoctypeName", 53) { // from class: com.github.catvod.spider.merge.dT.Os


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (c0060Eo.m187pb('\t', '\n', '\r', '\f', ' ')) {
                c0060Eo.m188q();
                return;
            }
            if (c0060Eo.m177UN('>')) {
                c0059ev.m139KT();
                c0059ev.m151q(EnumC0115dT.f657q);
                return;
            }
            if (c0060Eo.m194yS("PUBLIC")) {
                c0059ev.f338RH.f585QU = "PUBLIC";
                c0059ev.m149l(EnumC0115dT.f655pS);
            } else if (c0060Eo.m194yS("SYSTEM")) {
                c0059ev.f338RH.f585QU = "SYSTEM";
                c0059ev.m149l(EnumC0115dT.f671y);
            } else {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m151q(EnumC0115dT.f669x);
            }
        }
    };

    /* renamed from: pS */
    public static final EnumC0115dT f655pS = new EnumC0115dT("AfterDoctypePublicKeyword", 54) { // from class: com.github.catvod.spider.merge.dT.v2


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f638eq);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f613GD);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f619M2);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: eq */
    public static final EnumC0115dT f638eq = new EnumC0115dT("BeforeDoctypePublicIdentifier", 55) { // from class: com.github.catvod.spider.merge.dT.Tt


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f613GD);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f619M2);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: GD */
    public static final EnumC0115dT f613GD = new EnumC0115dT("DoctypePublicIdentifier_doubleQuoted", 56) { // from class: com.github.catvod.spider.merge.dT.qw


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f586UJ.append((char) 65533);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f668wt);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f586UJ.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    };

    /* renamed from: M2 */
    public static final EnumC0115dT f619M2 = new EnumC0115dT("DoctypePublicIdentifier_singleQuoted", 57) { // from class: com.github.catvod.spider.merge.dT.ze


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f586UJ.append((char) 65533);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f668wt);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f586UJ.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    };

    /* renamed from: wt */
    public static final EnumC0115dT f668wt = new EnumC0115dT("AfterDoctypePublicIdentifier", 58) { // from class: com.github.catvod.spider.merge.dT.hs


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f637el);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: el */
    public static final EnumC0115dT f637el = new EnumC0115dT("BetweenDoctypePublicAndSystemIdentifiers", 59) { // from class: com.github.catvod.spider.merge.dT.bw


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: y */
    public static final EnumC0115dT f671y = new EnumC0115dT("AfterDoctypeSystemKeyword", 60) { // from class: com.github.catvod.spider.merge.dT.qf


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f664uR);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: uR */
    public static final EnumC0115dT f664uR = new EnumC0115dT("BeforeDoctypeSystemIdentifier", 61) { // from class: com.github.catvod.spider.merge.dT.x3


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: f */
    public static final EnumC0115dT f639f = new EnumC0115dT("DoctypeSystemIdentifier_doubleQuoted", 62) { // from class: com.github.catvod.spider.merge.dT.nW


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f587u.append((char) 65533);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f604AI);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f587u.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    };

    /* renamed from: mu */
    public static final EnumC0115dT f651mu = new EnumC0115dT("DoctypeSystemIdentifier_singleQuoted", 63) { // from class: com.github.catvod.spider.merge.dT.Tz


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f587u.append((char) 65533);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f604AI);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f587u.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    };

    /* renamed from: AI */
    public static final EnumC0115dT f604AI = new EnumC0115dT("AfterDoctypeSystemIdentifier", 64) { // from class: com.github.catvod.spider.merge.dT.t


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: x */
    public static final EnumC0115dT f669x = new EnumC0115dT("BogusDoctype", 65) { // from class: com.github.catvod.spider.merge.dT.ti


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else {
                if (cM191u != 65535) {
                    return;
                }
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: A */
    public static final EnumC0115dT f603A = new EnumC0115dT("CdataSection", 66) { // from class: com.github.catvod.spider.merge.dT.oh


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0059ev.f341W.append(c0060Eo.m172RH("]]>"));
            if (c0060Eo.m161BP("]]>") || c0060Eo.m186p()) {
                c0059ev.m154w8(new AbstractC0108Zo.Qe(c0059ev.f341W.toString()));
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    };

    /* renamed from: hp */
    private static final /* synthetic */ EnumC0115dT[] f642hp = {f657q, f670xC, f624QU, f629UJ, f663u, f621Mo, f643i, f620MH, f661se, f632W, f611FN, f605B, f666w8, f610F, f625RH, f616KT, f646k, f627Tz, f615IS, f609E, f654p, f641go, f648l, f607BP, f672yS, f630UN, f612Fp, f656pb, f623P, f633Xl, f640fH, f636d, f628U, f649m, f626T, f660s, f658rF, f618M, f667wR, f662t, f673z, f635c, f650mT, f631V, f644id, f608BY, f622Oz, f606BE, f634Z, f614I, f652nT, f645ip, f617L, f653om, f655pS, f638eq, f613GD, f619M2, f668wt, f637el, f671y, f664uR, f639f, f651mu, f604AI, f669x, f603A};

    /* renamed from: kB */
    static final char[] f647kB = {0, '\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};

    /* renamed from: rO */
    static final char[] f659rO = {0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};

    /* renamed from: v */
    private static final String f665v = String.valueOf((char) 65533);

    /* renamed from: com.github.catvod.spider.merge.dT$BN */
    class BN extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else if (cM162E != 65535) {
                c0059ev.m137FN(c0060Eo.m163F((char) 0));
            } else {
                c0059ev.m154w8(new AbstractC0108Zo.oK());
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Dl */
    class Dl extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m587i(c0059ev, c0060Eo, EnumC0115dT.f623P, EnumC0115dT.f641go);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$F */
    class F extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0059ev.f332FN.m546k(c0060Eo.m183k(EnumC0115dT.f647kB));
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m538KT((char) 65533);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '\'') {
                    if (cM191u == '/') {
                        c0059ev.m149l(EnumC0115dT.f635c);
                        return;
                    }
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                        switch (cM191u) {
                            case '<':
                                break;
                            case '=':
                                c0059ev.m149l(EnumC0115dT.f658rF);
                                break;
                            case '>':
                                c0059ev.m148k();
                                c0059ev.m149l(EnumC0115dT.f657q);
                                break;
                            default:
                                c0059ev.f332FN.m538KT(cM191u);
                                break;
                        }
                        return;
                    }
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m538KT(cM191u);
                return;
            }
            c0059ev.m149l(EnumC0115dT.f660s);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$FD */
    class FD extends EnumC0115dT {


        /* renamed from: w8 */
        private void m592w8(C0059EV c0059ev, C0060Eo c0060Eo) {
            c0059ev.m137FN("</");
            c0059ev.m134B(c0059ev.f341W);
            c0060Eo.m168M();
            c0059ev.m149l(EnumC0115dT.f624QU);
        }

        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m180d()) {
                String strM178W = c0060Eo.m178W();
                c0059ev.f332FN.m545go(strM178W);
                c0059ev.f341W.append(strM178W);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                if (c0059ev.m150p()) {
                    c0059ev.m149l(EnumC0115dT.f649m);
                    return;
                } else {
                    m592w8(c0059ev, c0060Eo);
                    return;
                }
            }
            if (cM191u == '/') {
                if (c0059ev.m150p()) {
                    c0059ev.m149l(EnumC0115dT.f635c);
                    return;
                } else {
                    m592w8(c0059ev, c0060Eo);
                    return;
                }
            }
            if (cM191u != '>') {
                m592w8(c0059ev, c0060Eo);
            } else if (!c0059ev.m150p()) {
                m592w8(c0059ev, c0060Eo);
            } else {
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$HU */
    class HU extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m177UN('-')) {
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else {
                c0059ev.m145W('-');
                c0059ev.m151q(EnumC0115dT.f607BP);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$J */
    class J extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m180d()) {
                c0059ev.m137FN("</");
                c0059ev.m149l(EnumC0115dT.f624QU);
            } else {
                c0059ev.m140MH(false);
                c0059ev.f332FN.m548p(c0060Eo.m162E());
                c0059ev.f341W.append(c0060Eo.m162E());
                c0059ev.m151q(EnumC0115dT.f666w8);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Ks */
    class Ks extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m580B(c0059ev, c0060Eo, this, EnumC0115dT.f610F);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$LA */
    class LA extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m180d()) {
                c0059ev.m137FN("</");
                c0059ev.m149l(EnumC0115dT.f641go);
            } else {
                c0059ev.m140MH(false);
                c0059ev.f332FN.m548p(c0060Eo.m162E());
                c0059ev.f341W.append(c0060Eo.m162E());
                c0059ev.m151q(EnumC0115dT.f612Fp);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$MS */
    class MS extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f641go);
            } else if (cM191u == '-') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f607BP);
            } else if (cM191u == '<') {
                c0059ev.m149l(EnumC0115dT.f672yS);
            } else {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f641go);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$N */
    class N extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W(c0060Eo.m191u());
            } else {
                if (cM162E == '&') {
                    c0059ev.m151q(EnumC0115dT.f670xC);
                    return;
                }
                if (cM162E == '<') {
                    c0059ev.m151q(EnumC0115dT.f620MH);
                } else if (cM162E != 65535) {
                    c0059ev.m137FN(c0060Eo.m182i());
                } else {
                    c0059ev.m154w8(new AbstractC0108Zo.oK());
                }
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Nx */
    class Nx extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m161BP("--")) {
                c0059ev.m141Mo();
                c0059ev.m149l(EnumC0115dT.f644id);
            } else {
                if (c0060Eo.m194yS("DOCTYPE")) {
                    c0059ev.m149l(EnumC0115dT.f652nT);
                    return;
                }
                if (c0060Eo.m161BP("[CDATA[")) {
                    c0059ev.m152se();
                    c0059ev.m149l(EnumC0115dT.f603A);
                } else {
                    c0059ev.m135E(this);
                    c0059ev.m153u();
                    c0059ev.m151q(EnumC0115dT.f650mT);
                }
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$O */
    class O extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m582MH(c0059ev, c0060Eo, EnumC0115dT.f621Mo);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$OO */
    class OO extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m580B(c0059ev, c0060Eo, this, EnumC0115dT.f646k);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Os */
    class Os extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (c0060Eo.m187pb('\t', '\n', '\r', '\f', ' ')) {
                c0060Eo.m188q();
                return;
            }
            if (c0060Eo.m177UN('>')) {
                c0059ev.m139KT();
                c0059ev.m151q(EnumC0115dT.f657q);
                return;
            }
            if (c0060Eo.m194yS("PUBLIC")) {
                c0059ev.f338RH.f585QU = "PUBLIC";
                c0059ev.m149l(EnumC0115dT.f655pS);
            } else if (c0060Eo.m194yS("SYSTEM")) {
                c0059ev.f338RH.f585QU = "SYSTEM";
                c0059ev.m149l(EnumC0115dT.f671y);
            } else {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m151q(EnumC0115dT.f669x);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Q */
    class Q extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else if (cM162E == '-') {
                c0059ev.m145W('-');
                c0059ev.m151q(EnumC0115dT.f648l);
            } else if (cM162E != '<') {
                c0059ev.m137FN(c0060Eo.m167KT('-', '<', 0));
            } else {
                c0059ev.m151q(EnumC0115dT.f672yS);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Qe */
    class Qe extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m177UN('/')) {
                c0059ev.m152se();
                c0059ev.m151q(EnumC0115dT.f605B);
                return;
            }
            if (c0060Eo.m180d() && c0059ev.m155xC() != null) {
                if (!c0060Eo.m166IS("</" + c0059ev.m155xC())) {
                    c0059ev.f332FN = c0059ev.m140MH(false).m539P(c0059ev.m155xC());
                    c0059ev.m148k();
                    c0059ev.m149l(EnumC0115dT.f620MH);
                    return;
                }
            }
            c0059ev.m137FN("<");
            c0059ev.m149l(EnumC0115dT.f624QU);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Qt */
    class Qt extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m177UN('/')) {
                c0059ev.m152se();
                c0059ev.m151q(EnumC0115dT.f625RH);
            } else {
                c0059ev.m145W('<');
                c0059ev.m149l(EnumC0115dT.f663u);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$SP */
    class SP extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m137FN("</");
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (c0060Eo.m180d()) {
                c0059ev.m140MH(false);
                c0059ev.m149l(EnumC0115dT.f632W);
            } else if (c0060Eo.m177UN('>')) {
                c0059ev.m135E(this);
                c0059ev.m151q(EnumC0115dT.f657q);
            } else {
                c0059ev.m135E(this);
                c0059ev.m153u();
                c0059ev.m151q(EnumC0115dT.f650mT);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Sb */
    class Sb extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m538KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f626T);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '\'') {
                    if (cM191u == '/') {
                        c0059ev.m149l(EnumC0115dT.f635c);
                        return;
                    }
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                        return;
                    }
                    switch (cM191u) {
                        case '<':
                            break;
                        case '=':
                            c0059ev.m149l(EnumC0115dT.f658rF);
                            break;
                        case '>':
                            c0059ev.m148k();
                            c0059ev.m149l(EnumC0115dT.f657q);
                            break;
                        default:
                            c0059ev.f332FN.m543Xl();
                            c0060Eo.m168M();
                            c0059ev.m149l(EnumC0115dT.f626T);
                            break;
                    }
                    return;
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m543Xl();
                c0059ev.f332FN.m538KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f626T);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Tb */
    class Tb extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f623P);
            } else if (cM191u == '-') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f640fH);
            } else if (cM191u == '<') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f636d);
            } else if (cM191u != 65535) {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f623P);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Tt */
    class Tt extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f613GD);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f619M2);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Tz */
    class Tz extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f587u.append((char) 65533);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f604AI);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f587u.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$U */
    class U extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0060Eo.m168M();
                c0059ev.m135E(this);
                c0059ev.f332FN.m543Xl();
                c0059ev.m149l(EnumC0115dT.f626T);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '\'') {
                    if (cM191u == '/') {
                        c0059ev.m149l(EnumC0115dT.f635c);
                        return;
                    }
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                        return;
                    }
                    switch (cM191u) {
                        case '<':
                            c0060Eo.m168M();
                            c0059ev.m135E(this);
                            break;
                        case '=':
                            break;
                        case '>':
                            break;
                        default:
                            c0059ev.f332FN.m543Xl();
                            c0060Eo.m168M();
                            c0059ev.m149l(EnumC0115dT.f626T);
                            return;
                    }
                    c0059ev.m148k();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m543Xl();
                c0059ev.f332FN.m538KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f626T);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Ux */
    class Ux extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m582MH(c0059ev, c0060Eo, EnumC0115dT.f641go);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$V */
    class V extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else if (cM162E == '-') {
                c0059ev.m145W(cM162E);
                c0059ev.m151q(EnumC0115dT.f633Xl);
            } else if (cM162E == '<') {
                c0059ev.m145W(cM162E);
                c0059ev.m151q(EnumC0115dT.f636d);
            } else if (cM162E != 65535) {
                c0059ev.m137FN(c0060Eo.m167KT('-', '<', 0));
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$V3 */
    class V3 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f645ip);
                return;
            }
            if (cM191u != '>') {
                if (cM191u != 65535) {
                    c0059ev.m135E(this);
                    c0059ev.m149l(EnumC0115dT.f645ip);
                    return;
                }
                c0059ev.m143Tz(this);
            }
            c0059ev.m135E(this);
            c0059ev.m147i();
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Vm */
    class Vm extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '!') {
                c0059ev.m137FN("<!");
                c0059ev.m149l(EnumC0115dT.f609E);
                return;
            }
            if (cM191u == '/') {
                c0059ev.m152se();
                c0059ev.m149l(EnumC0115dT.f627Tz);
            } else if (cM191u != 65535) {
                c0059ev.m137FN("<");
                c0060Eo.m168M();
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else {
                c0059ev.m137FN("<");
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$Y */
    class Y extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (c0060Eo.m180d()) {
                c0059ev.m152se();
                c0059ev.f341W.append(c0060Eo.m162E());
                c0059ev.m137FN("<");
                c0059ev.m145W(c0060Eo.m162E());
                c0059ev.m151q(EnumC0115dT.f656pb);
                return;
            }
            if (c0060Eo.m177UN('/')) {
                c0059ev.m152se();
                c0059ev.m151q(EnumC0115dT.f630UN);
            } else {
                c0059ev.m145W('<');
                c0059ev.m149l(EnumC0115dT.f641go);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$ZJ */
    class ZJ extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m180d()) {
                c0059ev.f338RH.f588xC.append(c0060Eo.m178W());
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f588xC.append((char) 65533);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == '>') {
                    c0059ev.m139KT();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                if (cM191u == 65535) {
                    c0059ev.m143Tz(this);
                    c0059ev.f338RH.f584Mo = true;
                    c0059ev.m139KT();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                    c0059ev.f338RH.f588xC.append(cM191u);
                    return;
                }
            }
            c0059ev.m149l(EnumC0115dT.f653om);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$ZM */
    class ZM extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m180d()) {
                c0059ev.m147i();
                c0059ev.m149l(EnumC0115dT.f617L);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m147i();
                c0059ev.f338RH.f588xC.append((char) 65533);
                c0059ev.m149l(EnumC0115dT.f617L);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == 65535) {
                    c0059ev.m143Tz(this);
                    c0059ev.m147i();
                    c0059ev.f338RH.f584Mo = true;
                    c0059ev.m139KT();
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
                if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                    return;
                }
                c0059ev.m147i();
                c0059ev.f338RH.f588xC.append(cM191u);
                c0059ev.m149l(EnumC0115dT.f617L);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$au */
    class au extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.m145W((char) 65533);
            } else {
                if (cM162E == '&') {
                    c0059ev.m151q(EnumC0115dT.f629UJ);
                    return;
                }
                if (cM162E == '<') {
                    c0059ev.m151q(EnumC0115dT.f611FN);
                } else if (cM162E != 65535) {
                    c0059ev.m137FN(c0060Eo.m182i());
                } else {
                    c0059ev.m154w8(new AbstractC0108Zo.oK());
                }
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$b */
    class b extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m177UN('-')) {
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else {
                c0059ev.m145W('-');
                c0059ev.m151q(EnumC0115dT.f654p);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$bw */
    class bw extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$c */
    class c extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == 0) {
                c0059ev.m135E(this);
                c0060Eo.m188q();
                c0059ev.f334KT.m521KT((char) 65533);
            } else if (cM162E == '-') {
                c0059ev.m151q(EnumC0115dT.f606BE);
            } else {
                if (cM162E != 65535) {
                    c0059ev.f334KT.m522k(c0060Eo.m167KT('-', 0));
                    return;
                }
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$d */
    class d extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            String strM170Mo = c0060Eo.m170Mo(false);
            if (strM170Mo.length() > 0) {
                c0059ev.f332FN.m537IS(strM170Mo);
            } else {
                c0059ev.f332FN.m541U();
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f673z);
                return;
            }
            if (cM191u != '&') {
                if (cM191u != 65535) {
                    c0059ev.f332FN.m540Tz(cM191u);
                    return;
                } else {
                    c0059ev.m143Tz(this);
                    c0059ev.m149l(EnumC0115dT.f657q);
                    return;
                }
            }
            int[] iArrM144UJ = c0059ev.m144UJ('\"', true);
            if (iArrM144UJ != null) {
                c0059ev.f332FN.m535E(iArrM144UJ);
            } else {
                c0059ev.f332FN.m540Tz('&');
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$dC */
    class dC extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT('-').m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                if (cM191u == '-') {
                    c0059ev.m149l(EnumC0115dT.f634Z);
                    return;
                }
                if (cM191u != 65535) {
                    c0059ev.f334KT.m521KT('-').m521KT(cM191u);
                    c0059ev.m149l(EnumC0115dT.f622Oz);
                } else {
                    c0059ev.m143Tz(this);
                    c0059ev.m142RH();
                    c0059ev.m149l(EnumC0115dT.f657q);
                }
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$f4 */
    class f4 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m522k("--!").m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '-') {
                c0059ev.f334KT.m522k("--!");
                c0059ev.m149l(EnumC0115dT.f606BE);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.f334KT.m522k("--!").m521KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$ga */
    class ga extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m149l(EnumC0115dT.f608BY);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.f334KT.m521KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$hs */
    class hs extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f637el);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$i9 */
    class i9 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m522k("--").m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '!') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f614I);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT('-');
                return;
            }
            if (cM191u == '>') {
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m522k("--").m521KT(cM191u);
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$jm */
    class jm extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                c0059ev.m149l(EnumC0115dT.f662t);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == '\"') {
                    c0059ev.m149l(EnumC0115dT.f618M);
                    return;
                }
                if (cM191u != '`') {
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m148k();
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r') {
                        return;
                    }
                    if (cM191u == '&') {
                        c0060Eo.m168M();
                        c0059ev.m149l(EnumC0115dT.f662t);
                        return;
                    }
                    if (cM191u == '\'') {
                        c0059ev.m149l(EnumC0115dT.f667wR);
                        return;
                    }
                    switch (cM191u) {
                        case '<':
                        case '=':
                            break;
                        case '>':
                            c0059ev.m135E(this);
                            c0059ev.m148k();
                            c0059ev.m149l(EnumC0115dT.f657q);
                            break;
                        default:
                            c0060Eo.m168M();
                            c0059ev.m149l(EnumC0115dT.f662t);
                            break;
                    }
                    return;
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz(cM191u);
                c0059ev.m149l(EnumC0115dT.f662t);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$l */
    class l extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            if (!c0060Eo.m177UN('/')) {
                c0059ev.m149l(EnumC0115dT.f623P);
                return;
            }
            c0059ev.m145W('/');
            c0059ev.m152se();
            c0059ev.m151q(EnumC0115dT.f628U);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$lK */
    class lK extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM162E = c0060Eo.m162E();
            if (cM162E == '!') {
                c0059ev.m151q(EnumC0115dT.f631V);
                return;
            }
            if (cM162E == '/') {
                c0059ev.m151q(EnumC0115dT.f661se);
                return;
            }
            if (cM162E == '?') {
                c0059ev.m153u();
                c0059ev.m151q(EnumC0115dT.f650mT);
            } else if (c0060Eo.m180d()) {
                c0059ev.m140MH(true);
                c0059ev.m149l(EnumC0115dT.f632W);
            } else {
                c0059ev.m135E(this);
                c0059ev.m145W('<');
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$lm */
    class lm extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m586W(c0059ev, EnumC0115dT.f657q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$mQ */
    class mQ extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '>') {
                c0059ev.f332FN.f595se = true;
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u == 65535) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            } else {
                c0060Eo.m168M();
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f649m);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$nW */
    class nW extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f587u.append((char) 65533);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f604AI);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f587u.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$oK */
    class oK extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m581FN(c0059ev, c0060Eo, EnumC0115dT.f616KT, EnumC0115dT.f663u);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$oh */
    class oh extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0059ev.f341W.append(c0060Eo.m172RH("]]>"));
            if (c0060Eo.m161BP("]]>") || c0060Eo.m186p()) {
                c0059ev.m154w8(new AbstractC0108Zo.Qe(c0059ev.f341W.toString()));
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$p */
    class p extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0059ev.f332FN.m545go(c0060Eo.m192w8());
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.f332FN.m545go(EnumC0115dT.f665v);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u == '/') {
                    c0059ev.m149l(EnumC0115dT.f635c);
                    return;
                }
                if (cM191u == '<') {
                    c0060Eo.m168M();
                    c0059ev.m135E(this);
                } else if (cM191u != '>') {
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    } else if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                        c0059ev.f332FN.m548p(cM191u);
                        return;
                    }
                }
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            c0059ev.m149l(EnumC0115dT.f649m);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$p8 */
    class p8 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            String strM170Mo = c0060Eo.m170Mo(true);
            if (strM170Mo.length() > 0) {
                c0059ev.f332FN.m537IS(strM170Mo);
            } else {
                c0059ev.f332FN.m541U();
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                return;
            }
            if (cM191u == 65535) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != '&') {
                if (cM191u != '\'') {
                    c0059ev.f332FN.m540Tz(cM191u);
                    return;
                } else {
                    c0059ev.m149l(EnumC0115dT.f673z);
                    return;
                }
            }
            int[] iArrM144UJ = c0059ev.m144UJ('\'', true);
            if (iArrM144UJ != null) {
                c0059ev.f332FN.m535E(iArrM144UJ);
            } else {
                c0059ev.f332FN.m540Tz('&');
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$qB */
    class qB extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m587i(c0059ev, c0060Eo, EnumC0115dT.f641go, EnumC0115dT.f623P);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$qf */
    class qf extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f664uR);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$qw */
    class qw extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f586UJ.append((char) 65533);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f668wt);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f586UJ.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$r */
    class r extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            String strM183k = c0060Eo.m183k(EnumC0115dT.f659rO);
            if (strM183k.length() > 0) {
                c0059ev.f332FN.m537IS(strM183k);
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz((char) 65533);
                return;
            }
            if (cM191u != ' ') {
                if (cM191u != '\"' && cM191u != '`') {
                    if (cM191u == 65535) {
                        c0059ev.m143Tz(this);
                        c0059ev.m149l(EnumC0115dT.f657q);
                        return;
                    }
                    if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r') {
                        if (cM191u == '&') {
                            int[] iArrM144UJ = c0059ev.m144UJ('>', true);
                            if (iArrM144UJ != null) {
                                c0059ev.f332FN.m535E(iArrM144UJ);
                                return;
                            } else {
                                c0059ev.f332FN.m540Tz('&');
                                return;
                            }
                        }
                        if (cM191u != '\'') {
                            switch (cM191u) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c0059ev.m148k();
                                    c0059ev.m149l(EnumC0115dT.f657q);
                                    break;
                                default:
                                    c0059ev.f332FN.m540Tz(cM191u);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c0059ev.m135E(this);
                c0059ev.f332FN.m540Tz(cM191u);
                return;
            }
            c0059ev.m149l(EnumC0115dT.f649m);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$s */
    class s extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f623P);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m145W(cM191u);
                return;
            }
            if (cM191u == '<') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f636d);
            } else if (cM191u == '>') {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f621Mo);
            } else if (cM191u != 65535) {
                c0059ev.m145W(cM191u);
                c0059ev.m149l(EnumC0115dT.f623P);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$t */
    class t extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$t7 */
    class t7 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            EnumC0115dT.m582MH(c0059ev, c0060Eo, EnumC0115dT.f663u);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$tG */
    class tG extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            c0060Eo.m168M();
            c0059ev.f334KT.m522k(c0060Eo.m163F('>'));
            char cM191u = c0060Eo.m191u();
            if (cM191u == '>' || cM191u == 65535) {
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$tY */
    class tY extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            if (c0060Eo.m186p()) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.m145W((char) 65533);
                c0059ev.m149l(EnumC0115dT.f641go);
            } else {
                if (cM191u == '-') {
                    c0059ev.m145W(cM191u);
                    return;
                }
                if (cM191u == '<') {
                    c0059ev.m149l(EnumC0115dT.f672yS);
                } else if (cM191u != '>') {
                    c0059ev.m145W(cM191u);
                    c0059ev.m149l(EnumC0115dT.f641go);
                } else {
                    c0059ev.m145W(cM191u);
                    c0059ev.m149l(EnumC0115dT.f621Mo);
                }
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$ti */
    class ti extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '>') {
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else {
                if (cM191u != 65535) {
                    return;
                }
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$v2 */
    class v2 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f638eq);
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f613GD);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f619M2);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$vp */
    class vp extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(EnumC0115dT.f649m);
                return;
            }
            if (cM191u == '/') {
                c0059ev.m149l(EnumC0115dT.f635c);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m148k();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u == 65535) {
                c0059ev.m143Tz(this);
                c0059ev.m149l(EnumC0115dT.f657q);
            } else {
                c0060Eo.m168M();
                c0059ev.m135E(this);
                c0059ev.m149l(EnumC0115dT.f649m);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$w */
    class w extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f334KT.m521KT((char) 65533);
                c0059ev.m149l(EnumC0115dT.f622Oz);
                return;
            }
            if (cM191u == '-') {
                c0059ev.m149l(EnumC0115dT.f608BY);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            } else if (cM191u != 65535) {
                c0060Eo.m168M();
                c0059ev.m149l(EnumC0115dT.f622Oz);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.m142RH();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$wT */
    class wT extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m586W(c0059ev, EnumC0115dT.f624QU);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$x3 */
    class x3 extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                return;
            }
            if (cM191u == '\"') {
                c0059ev.m149l(EnumC0115dT.f639f);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f651mu);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m149l(EnumC0115dT.f669x);
            } else {
                c0059ev.m143Tz(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
            }
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$yn */
    class yn extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) {
            EnumC0115dT.m581FN(c0059ev, c0060Eo, EnumC0115dT.f615IS, EnumC0115dT.f621Mo);
        }
    }

    /* renamed from: com.github.catvod.spider.merge.dT$ze */
    class ze extends EnumC0115dT {


        @Override // com.github.catvod.spider.merge.EnumC0115dT
        /* renamed from: se */
        void mo591se(C0059EV c0059ev, C0060Eo c0060Eo) throws IOException {
            char cM191u = c0060Eo.m191u();
            if (cM191u == 0) {
                c0059ev.m135E(this);
                c0059ev.f338RH.f586UJ.append((char) 65533);
                return;
            }
            if (cM191u == '\'') {
                c0059ev.m149l(EnumC0115dT.f668wt);
                return;
            }
            if (cM191u == '>') {
                c0059ev.m135E(this);
                c0059ev.f338RH.f584Mo = true;
                c0059ev.m139KT();
                c0059ev.m149l(EnumC0115dT.f657q);
                return;
            }
            if (cM191u != 65535) {
                c0059ev.f338RH.f586UJ.append(cM191u);
                return;
            }
            c0059ev.m143Tz(this);
            c0059ev.f338RH.f584Mo = true;
            c0059ev.m139KT();
            c0059ev.m149l(EnumC0115dT.f657q);
        }
    }

    private EnumC0115dT(String str, int i) {
        super(str, i);
    }

    /* renamed from: B */
    public static void m580B(C0059EV c0059ev, C0060Eo c0060Eo, EnumC0115dT enumC0115dT, EnumC0115dT enumC0115dT2) throws IOException {
        char cM162E = c0060Eo.m162E();
        if (cM162E == 0) {
            c0059ev.m135E(enumC0115dT);
            c0060Eo.m188q();
            c0059ev.m145W((char) 65533);
        } else if (cM162E == '<') {
            c0059ev.m151q(enumC0115dT2);
        } else if (cM162E != 65535) {
            c0059ev.m137FN(c0060Eo.m160B());
        } else {
            c0059ev.m154w8(new AbstractC0108Zo.oK());
        }
    }

    /* renamed from: FN */
    public static void m581FN(C0059EV c0059ev, C0060Eo c0060Eo, EnumC0115dT enumC0115dT, EnumC0115dT enumC0115dT2) {
        if (c0060Eo.m180d()) {
            c0059ev.m140MH(false);
            c0059ev.m149l(enumC0115dT);
        } else {
            c0059ev.m137FN("</");
            c0059ev.m149l(enumC0115dT2);
        }
    }

    /* renamed from: MH */
    public static void m582MH(C0059EV c0059ev, C0060Eo c0060Eo, EnumC0115dT enumC0115dT) throws IOException {
        if (c0060Eo.m180d()) {
            String strM178W = c0060Eo.m178W();
            c0059ev.f332FN.m545go(strM178W);
            c0059ev.f341W.append(strM178W);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (c0059ev.m150p() && !c0060Eo.m186p()) {
            char cM191u = c0060Eo.m191u();
            if (cM191u == '\t' || cM191u == '\n' || cM191u == '\f' || cM191u == '\r' || cM191u == ' ') {
                c0059ev.m149l(f649m);
            } else if (cM191u == '/') {
                c0059ev.m149l(f635c);
            } else if (cM191u != '>') {
                c0059ev.f341W.append(cM191u);
                z = true;
            } else {
                c0059ev.m148k();
                c0059ev.m149l(f657q);
            }
            z2 = z;
        }
        if (z2) {
            c0059ev.m137FN("</");
            c0059ev.m134B(c0059ev.f341W);
            c0059ev.m149l(enumC0115dT);
        }
    }

    /* renamed from: W */
    public static void m586W(C0059EV c0059ev, EnumC0115dT enumC0115dT) {
        int[] iArrM144UJ = c0059ev.m144UJ(null, false);
        if (iArrM144UJ == null) {
            c0059ev.m145W('&');
        } else {
            c0059ev.m136F(iArrM144UJ);
        }
        c0059ev.m149l(enumC0115dT);
    }

    /* renamed from: i */
    public static void m587i(C0059EV c0059ev, C0060Eo c0060Eo, EnumC0115dT enumC0115dT, EnumC0115dT enumC0115dT2) throws IOException {
        if (c0060Eo.m180d()) {
            String strM178W = c0060Eo.m178W();
            c0059ev.f341W.append(strM178W);
            c0059ev.m137FN(strM178W);
            return;
        }
        char cM191u = c0060Eo.m191u();
        if (cM191u != '\t' && cM191u != '\n' && cM191u != '\f' && cM191u != '\r' && cM191u != ' ' && cM191u != '/' && cM191u != '>') {
            c0060Eo.m168M();
            c0059ev.m149l(enumC0115dT2);
        } else {
            if (c0059ev.f341W.toString().equals("script")) {
                c0059ev.m149l(enumC0115dT);
            } else {
                c0059ev.m149l(enumC0115dT2);
            }
            c0059ev.m145W(cM191u);
        }
    }

    /* renamed from: se */
    abstract void mo591se(C0059EV c0059ev, C0060Eo c0060Eo);

    /* synthetic */ EnumC0115dT(String str, int i, N n) {
        this(str, i);
    }
}
