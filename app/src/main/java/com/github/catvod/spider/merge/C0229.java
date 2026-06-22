package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0021;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ײ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class C0229 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final char[] f577;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    static final int[] f578 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private final C0179 f579;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private final C0180 f580;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private AbstractC0021 f582;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    AbstractC0021.AbstractC0030 f587;

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private String f593;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private EnumC0470 f581 = EnumC0470.f1130;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private boolean f583 = false;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private String f584 = null;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private StringBuilder f585 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    StringBuilder f586 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    AbstractC0021.C0029 f588 = new AbstractC0021.C0029();

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    AbstractC0021.C0028 f589 = new AbstractC0021.C0028();

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    AbstractC0021.C0024 f590 = new AbstractC0021.C0024();

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    AbstractC0021.C0026 f591 = new AbstractC0021.C0026();

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    AbstractC0021.C0025 f592 = new AbstractC0021.C0025();

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private final int[] f594 = new int[1];

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    private final int[] f595 = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f577 = cArr;
        Arrays.sort(cArr);
    }

    C0229(C0179 c0179, C0180 c0180) {
        this.f579 = c0179;
        this.f580 = c0180;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private void m780(String str) {
        if (this.f580.m641()) {
            this.f580.add(new C0378(this.f579.m636(), SOY.d("333C2717181E1E72321E15051B31251306570837371306121431344C545209"), str));
        }
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    void m781(EnumC0470 enumC0470) {
        this.f579.m605();
        this.f581 = enumC0470;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    String m782() {
        return this.f593;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    int[] m783(Character ch, boolean z) {
        int iIntValue;
        if (this.f579.m623()) {
            return null;
        }
        if ((ch != null && ch.charValue() == this.f579.m622()) || this.f579.m630(f577)) {
            return null;
        }
        int[] iArr = this.f594;
        this.f579.m624();
        boolean zM625 = this.f579.m625(SOY.d("59"));
        String strD = SOY.d("173B22051D191D722213191E193D3D191A");
        String strD2 = SOY.d("41");
        if (zM625) {
            boolean zM626 = this.f579.m626(SOY.d("22"));
            C0179 c0179 = this.f579;
            String strM611 = zM626 ? c0179.m611() : c0179.m610();
            if (strM611.length() == 0) {
                m780(SOY.d("14273C13061E19722313121208373F1511570D3B251E541915723F03191208333D05"));
                this.f579.m637();
                return null;
            }
            this.f579.m639();
            if (!this.f579.m625(strD2)) {
                m780(strD);
            }
            try {
                iIntValue = Integer.valueOf(strM611, zM626 ? 16 : 10).intValue();
            } catch (NumberFormatException unused) {
                iIntValue = -1;
            }
            if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                m780(SOY.d("193A300415140E3723561B020E213812115715347100151B1336710415191D37"));
                iArr[0] = 65533;
            } else {
                if (iIntValue >= 128) {
                    int[] iArr2 = f578;
                    if (iIntValue < iArr2.length + 128) {
                        m780(SOY.d("193A300415140E3723561D045A3C3E0254165A24301A1D135A273F1F17181E3771151B131F7221191D190E"));
                        iIntValue = iArr2[iIntValue - 128];
                    }
                }
                iArr[0] = iIntValue;
            }
            return iArr;
        }
        String strM613 = this.f579.m613();
        boolean zM627 = this.f579.m627(';');
        if (!(C0195.m736(strM613) || (C0195.m737(strM613) && zM627))) {
            this.f579.m637();
            if (zM627) {
                m780(SOY.d("133C2717181E1E723F1719121E722313121208373F1511"));
            }
            return null;
        }
        if (z && (this.f579.m633() || this.f579.m631() || this.f579.m629('=', '-', '_'))) {
            this.f579.m637();
            return null;
        }
        this.f579.m639();
        if (!this.f579.m625(strD2)) {
            m780(strD);
        }
        int iM734 = C0195.m734(strM613, this.f595);
        if (iM734 == 1) {
            iArr[0] = this.f595[0];
            return iArr;
        }
        if (iM734 == 2) {
            return this.f595;
        }
        C0034.m276(SOY.d("2F3C340E04121926341254141233231717031F20225606120E27231811135A343E0454") + strM613);
        return this.f595;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    void m784() {
        this.f592.mo241();
        this.f592.f178 = true;
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    void m785() {
        this.f592.mo241();
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    void m786() {
        this.f591.mo241();
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    AbstractC0021.AbstractC0030 m787(boolean z) {
        AbstractC0021.AbstractC0030 abstractC0030Mo241 = z ? this.f588.mo241() : this.f589.mo241();
        this.f587 = abstractC0030Mo241;
        return abstractC0030Mo241;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    void m788() {
        AbstractC0021.m228(this.f586);
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    void m789(char c) {
        if (this.f584 == null) {
            this.f584 = String.valueOf(c);
            return;
        }
        if (this.f585.length() == 0) {
            this.f585.append(this.f584);
        }
        this.f585.append(c);
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    void m790(String str) {
        if (this.f584 == null) {
            this.f584 = str;
            return;
        }
        if (this.f585.length() == 0) {
            this.f585.append(this.f584);
        }
        this.f585.append(str);
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    void m791(StringBuilder sb) {
        if (this.f584 == null) {
            this.f584 = sb.toString();
            return;
        }
        if (this.f585.length() == 0) {
            this.f585.append(this.f584);
        }
        this.f585.append((CharSequence) sb);
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    void m792(AbstractC0021 abstractC0021) {
        C0034.m277(this.f583);
        this.f582 = abstractC0021;
        this.f583 = true;
        AbstractC0021.EnumC0031 enumC0031 = abstractC0021.f174;
        if (enumC0031 == AbstractC0021.EnumC0031.f194) {
            this.f593 = ((AbstractC0021.C0029) abstractC0021).f184;
        } else if (enumC0031 == AbstractC0021.EnumC0031.f195 && ((AbstractC0021.C0028) abstractC0021).m266()) {
            m798(SOY.d("3B2625041D150F263405541E14313E04061219263D0F5407083722131A035A3D3F5611191E72251713"));
        }
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    void m793(int[] iArr) {
        m790(new String(iArr, 0, iArr.length));
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    void m794() {
        m792(this.f592);
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    void m795() {
        m792(this.f591);
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    void m796() {
        this.f587.m264();
        m792(this.f587);
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    void m797(EnumC0470 enumC0470) {
        if (this.f580.m641()) {
            this.f580.add(new C0378(this.f579.m636(), SOY.d("2F3C340E041219263412180E5A203417171F1F3671131A135A3D3756121E1637715E31383C7B711F1A57133C210300570926300211572177222B"), enumC0470));
        }
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    void m798(String str) {
        if (this.f580.m641()) {
            this.f580.add(new C0378(this.f579.m636(), str));
        }
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    void m799(EnumC0470 enumC0470) {
        if (this.f580.m641()) {
            this.f580.add(new C0378(this.f579.m636(), SOY.d("2F3C340E04121926341254141233231717031F20715151045D723818541E1422240254040E332513542C5F210C"), Character.valueOf(this.f579.m622()), enumC0470));
        }
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    boolean m800() {
        return this.f593 != null && this.f587.m268().equalsIgnoreCase(this.f593);
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    AbstractC0021 m801() {
        while (!this.f583) {
            this.f581.mo1730(this, this.f579);
        }
        StringBuilder sb = this.f585;
        if (sb.length() != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f584 = null;
            return this.f590.m243(string);
        }
        String str = this.f584;
        if (str == null) {
            this.f583 = false;
            return this.f582;
        }
        AbstractC0021.C0024 c0024M243 = this.f590.m243(str);
        this.f584 = null;
        return c0024M243;
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    void m802(EnumC0470 enumC0470) {
        this.f581 = enumC0470;
    }
}
