package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0123i;
import com.github.catvod.spider.merge.C0090SP;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;

/* renamed from: com.github.catvod.spider.merge.OO */
/* loaded from: C:\Users\pengj\Downloads\jadx-gui-1.5.3-win\classes.dex */
public class C0082OO extends C0127lK {

    /* renamed from: FN */
    private static final AbstractC0123i f477FN = new AbstractC0123i.mQ("title");

    /* renamed from: B */
    private p f478B;

    /* renamed from: F */
    private Qe f479F;

    /* renamed from: KT */
    private boolean f480KT;

    /* renamed from: RH */
    private final String f481RH;

    /* renamed from: w8 */
    private C0080Nz f482w8;

    /* renamed from: com.github.catvod.spider.merge.OO$Qe */
    public enum Qe {
        noQuirks,
        quirks,
        limitedQuirks
    }

    /* renamed from: com.github.catvod.spider.merge.OO$p */
    public static class p implements Cloneable {

        /* renamed from: UJ */
        @Nullable
        C0090SP.Qe f490UJ;

        /* renamed from: q */
        private C0090SP.J f492q = C0090SP.J.base;

        /* renamed from: xC */
        private Charset f494xC = C0071Ks.f439xC;

        /* renamed from: QU */
        private final ThreadLocal<CharsetEncoder> f489QU = new ThreadLocal<>();

        /* renamed from: u */
        private boolean f493u = true;

        /* renamed from: Mo */
        private boolean f488Mo = false;

        /* renamed from: i */
        private int f491i = 1;

        /* renamed from: MH */
        private EnumC0167p f487MH = EnumC0167p.html;

        /* renamed from: com.github.catvod.spider.merge.OO$p$p */
        public enum EnumC0167p {
            html,
            xml
        }

        /* renamed from: MH */
        CharsetEncoder m321MH() {
            CharsetEncoder charsetEncoderNewEncoder = this.f494xC.newEncoder();
            this.f489QU.set(charsetEncoderNewEncoder);
            this.f490UJ = C0090SP.Qe.m437q(charsetEncoderNewEncoder.charset().name());
            return charsetEncoderNewEncoder;
        }

        /* renamed from: Mo */
        public int m322Mo() {
            return this.f491i;
        }

        /* renamed from: QU */
        public p clone() {
            try {
                p pVar = (p) super.clone();
                pVar.m327q(this.f494xC.name());
                pVar.f492q = C0090SP.J.m426FN(this.f492q.name());
                return pVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* renamed from: UJ */
        CharsetEncoder m324UJ() {
            CharsetEncoder charsetEncoder = this.f489QU.get();
            return charsetEncoder != null ? charsetEncoder : m321MH();
        }

        /* renamed from: W */
        public EnumC0167p m325W() {
            return this.f487MH;
        }

        /* renamed from: i */
        public boolean m326i() {
            return this.f488Mo;
        }

        /* renamed from: q */
        public p m327q(String str) {
            m330xC(Charset.forName(str));
            return this;
        }

        /* renamed from: se */
        public boolean m328se() {
            return this.f493u;
        }

        /* renamed from: u */
        public C0090SP.J m329u() {
            return this.f492q;
        }

        /* renamed from: xC */
        public p m330xC(Charset charset) {
            this.f494xC = charset;
            return this;
        }
    }

    public C0082OO(String str) {
        super(C0073Lt.m238RH("#root", C0068Jt.f429q), str);
        this.f478B = new p();
        this.f479F = Qe.noQuirks;
        this.f480KT = false;
        this.f481RH = str;
        this.f482w8 = C0080Nz.m311xC();
    }

    /* renamed from: R */
    public Qe m315R() {
        return this.f479F;
    }

    @Override // com.github.catvod.spider.merge.C0127lK, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: Zu, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0082OO mo314L() {
        C0082OO c0082oo = (C0082OO) super.mo314L();
        c0082oo.f478B = this.f478B.clone();
        return c0082oo;
    }

    /* renamed from: cV */
    public C0082OO m317cV(C0080Nz c0080Nz) {
        this.f482w8 = c0080Nz;
        return this;
    }

    /* renamed from: fi */
    public C0080Nz m318fi() {
        return this.f482w8;
    }

    @Override // com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: l */
    public String mo276l() {
        return super.m671y();
    }

    @Override // com.github.catvod.spider.merge.C0127lK, com.github.catvod.spider.merge.AbstractC0077NC
    /* renamed from: p */
    public String mo129p() {
        return "#document";
    }

    /* renamed from: xv */
    public C0082OO m319xv(Qe qe) {
        this.f479F = qe;
        return this;
    }

    /* renamed from: zw */
    public p m320zw() {
        return this.f478B;
    }
}
