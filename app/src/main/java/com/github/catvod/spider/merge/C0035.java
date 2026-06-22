package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0040;
import com.github.catvod.spider.merge.C0195;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ǐ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0035 extends C0011 {

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private static final AbstractC0040 f201 = new AbstractC0040.C0076(SOY.d("0E3B251A11"));

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private C0036 f202;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private C0165 f203;

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private EnumC0038 f204;

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private final String f205;

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private boolean f206;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ǐ$Ϳ, reason: contains not printable characters */
    public static class C0036 implements Cloneable {

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        @Nullable
        C0195.EnumC0197 f210;

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        private C0195.EnumC0198 f207 = C0195.EnumC0198.f501;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        private Charset f208 = C0246.f629;

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
        private final ThreadLocal<CharsetEncoder> f209 = new ThreadLocal<>();

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        private boolean f211 = true;

        /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
        private boolean f212 = false;

        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
        private int f213 = 1;

        /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
        private EnumC0037 f214 = EnumC0037.f215;

        /* JADX INFO: renamed from: com.github.catvod.spider.merge.ǐ$Ϳ$Ϳ, reason: contains not printable characters */
        public enum EnumC0037 {
            f215,
            f216
        }

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public C0036 m295(String str) {
            m296(Charset.forName(str));
            return this;
        }

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        public C0036 m296(Charset charset) {
            this.f208 = charset;
            return this;
        }

        /* JADX INFO: renamed from: ԩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C0036 clone() {
            try {
                C0036 c0036 = (C0036) super.clone();
                c0036.m295(this.f208.name());
                c0036.f207 = C0195.EnumC0198.m749(this.f207.name());
                return c0036;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
        CharsetEncoder m298() {
            CharsetEncoder charsetEncoder = this.f209.get();
            return charsetEncoder != null ? charsetEncoder : m302();
        }

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        public C0195.EnumC0198 m299() {
            return this.f207;
        }

        /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
        public int m300() {
            return this.f213;
        }

        /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
        public boolean m301() {
            return this.f212;
        }

        /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
        CharsetEncoder m302() {
            CharsetEncoder charsetEncoderNewEncoder = this.f208.newEncoder();
            this.f209.set(charsetEncoderNewEncoder);
            this.f210 = C0195.EnumC0197.m739(charsetEncoderNewEncoder.charset().name());
            return charsetEncoderNewEncoder;
        }

        /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
        public boolean m303() {
            return this.f211;
        }

        /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
        public EnumC0037 m304() {
            return this.f214;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ǐ$Ԩ, reason: contains not printable characters */
    public enum EnumC0038 {
        f218,
        f219,
        f220
    }

    public C0035(String str) {
        super(C0039.m307(SOY.d("59203E1900"), C0435.f1064), str);
        this.f202 = new C0036();
        this.f204 = EnumC0038.f218;
        this.f206 = false;
        this.f205 = str;
        this.f203 = C0165.m579();
    }

    /* JADX INFO: renamed from: ৼ, reason: contains not printable characters */
    private C0011 m286() {
        String strD;
        C0011 next;
        Iterator<C0011> it = m178().iterator();
        do {
            boolean zHasNext = it.hasNext();
            strD = SOY.d("12263C1A");
            if (!zHasNext) {
                return m173(strD);
            }
            next = it.next();
        } while (!next.m193().equals(strD));
        return next;
    }

    @Override // com.github.catvod.spider.merge.C0011, com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: މ */
    public String mo122() {
        return SOY.d("59363E15011A1F3C25");
    }

    @Override // com.github.catvod.spider.merge.AbstractC0191
    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public String mo287() {
        return super.m189();
    }

    @Override // com.github.catvod.spider.merge.C0011
    /* JADX INFO: renamed from: ࢺ */
    public C0011 mo205(String str) {
        m288().mo205(str);
        return this;
    }

    /* JADX INFO: renamed from: ࢼ, reason: contains not printable characters */
    public C0011 m288() {
        C0011 next;
        C0011 c0011M286 = m286();
        Iterator<C0011> it = c0011M286.m178().iterator();
        do {
            boolean zHasNext = it.hasNext();
            String strD = SOY.d("183D350F");
            if (!zHasNext) {
                return c0011M286.m173(strD);
            }
            next = it.next();
            if (strD.equals(next.m193())) {
                break;
            }
        } while (!SOY.d("1C20301B11041F26").equals(next.m193()));
        return next;
    }

    @Override // com.github.catvod.spider.merge.C0011
    /* JADX INFO: renamed from: ࢽ, reason: contains not printable characters and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0035 mo120() {
        C0035 c0035 = (C0035) super.mo120();
        c0035.f202 = this.f202.clone();
        return c0035;
    }

    /* JADX INFO: renamed from: ૹ, reason: contains not printable characters */
    public C0036 m290() {
        return this.f202;
    }

    /* JADX INFO: renamed from: ಀ, reason: contains not printable characters */
    public C0035 m291(C0165 c0165) {
        this.f203 = c0165;
        return this;
    }

    /* JADX INFO: renamed from: ೱ, reason: contains not printable characters */
    public C0165 m292() {
        return this.f203;
    }

    /* JADX INFO: renamed from: ೲ, reason: contains not printable characters */
    public EnumC0038 m293() {
        return this.f204;
    }

    /* JADX INFO: renamed from: ഩ, reason: contains not printable characters */
    public C0035 m294(EnumC0038 enumC0038) {
        this.f204 = enumC0038;
        return this;
    }
}
