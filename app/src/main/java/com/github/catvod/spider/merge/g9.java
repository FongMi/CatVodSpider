package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.Y9;
import com.github.catvod.spider.merge.i3;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class g9 extends Iw {
    private static final i3 v = new i3.MN("title");
    private aA A;
    private boolean Kf;
    private B8 cD;
    private final String hR;
    private ut s;

    public static class aA implements Cloneable {

        @Nullable
        Y9.ut b;
        private Y9.Y l8 = Y9.Y.base;
        private Charset S = qS.S;
        private final ThreadLocal<CharsetEncoder> T4 = new ThreadLocal<>();
        private boolean OL = true;
        private boolean l = false;
        private int tT = 1;
        private EnumC0001aA N = EnumC0001aA.html;

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.g9$aA$aA, reason: collision with other inner class name */
        public enum EnumC0001aA {
            html,
            xml
        }

        public boolean HM() {
            return this.OL;
        }

        CharsetEncoder N() {
            CharsetEncoder charsetEncoderNewEncoder = this.S.newEncoder();
            this.T4.set(charsetEncoderNewEncoder);
            this.b = Y9.ut.l8(charsetEncoderNewEncoder.charset().name());
            return charsetEncoderNewEncoder;
        }

        public Y9.Y OL() {
            return this.l8;
        }

        public aA S(Charset charset) {
            this.S = charset;
            return this;
        }

        /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
        public aA clone() {
            try {
                aA aAVar = (aA) super.clone();
                aAVar.l8(this.S.name());
                aAVar.l8 = Y9.Y.v(this.l8.name());
                return aAVar;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        CharsetEncoder b() {
            CharsetEncoder charsetEncoder = this.T4.get();
            return charsetEncoder != null ? charsetEncoder : N();
        }

        public int l() {
            return this.tT;
        }

        public aA l8(String str) {
            S(Charset.forName(str));
            return this;
        }

        public EnumC0001aA n() {
            return this.N;
        }

        public boolean tT() {
            return this.l;
        }
    }

    public enum ut {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public g9(String str) {
        super(hs.hR("#root", rO.l8), str);
        this.A = new aA();
        this.s = ut.noQuirks;
        this.Kf = false;
        this.hR = str;
        this.cD = B8.S();
    }

    @Override // com.github.catvod.spider.merge.A0
    public String C() {
        return super.Xc();
    }

    public g9 E7(ut utVar) {
        this.s = utVar;
        return this;
    }

    public aA K() {
        return this.A;
    }

    @Override // com.github.catvod.spider.merge.Iw, com.github.catvod.spider.merge.A0
    public String Q() {
        return "#document";
    }

    public ut Qy() {
        return this.s;
    }

    public B8 T() {
        return this.cD;
    }

    public g9 Yr(B8 b8) {
        this.cD = b8;
        return this;
    }

    @Override // com.github.catvod.spider.merge.Iw, com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public g9 v() {
        g9 g9Var = (g9) super.v();
        g9Var.A = this.A.clone();
        return g9Var;
    }
}
