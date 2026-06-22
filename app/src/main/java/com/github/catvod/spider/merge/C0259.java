package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.AbstractC0004;
import com.github.catvod.spider.merge.AbstractC0040;
import com.github.catvod.spider.merge.AbstractC0089;
import com.github.catvod.spider.merge.C0170;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ܙ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0259 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final String[] f651 = {SOY.d("56"), SOY.d("44"), SOY.d("51"), SOY.d("04"), SOY.d("5A")};

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final String[] f652 = {SOY.d("47"), SOY.d("5B6F"), SOY.d("246F"), SOY.d("5E6F"), SOY.d("506F"), SOY.d("046F")};

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final Pattern f653 = Pattern.compile(SOY.d("527A0A5D592A536D792A105C536D78185C2B0978792D5F5A277B6E2A075D26367A5F4B"), 2);

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final Pattern f654 = Pattern.compile(SOY.d("52097A5B295E457A0D125F5E"));

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private final C0466 f655;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private final String f656;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private final List<AbstractC0040> f657 = new ArrayList();

    private C0259(String str) {
        C0034.m282(str);
        String strTrim = str.trim();
        this.f656 = strTrim;
        this.f655 = new C0466(strTrim);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private void m973() {
        this.f657.add(new AbstractC0040.C0041());
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private void m974() {
        C0466 c0466 = new C0466(this.f655.m1702('[', ']'));
        String strM1709 = c0466.m1709(f652);
        C0034.m282(strM1709);
        c0466.m1710();
        if (c0466.m1711()) {
            if (strM1709.startsWith(SOY.d("24"))) {
                this.f657.add(new AbstractC0040.C0044(strM1709.substring(1)));
                return;
            } else {
                this.f657.add(new AbstractC0040.C0042(strM1709));
                return;
            }
        }
        if (c0466.m1712(SOY.d("47"))) {
            this.f657.add(new AbstractC0040.C0045(strM1709, c0466.m1718()));
            return;
        }
        if (c0466.m1712(SOY.d("5B6F"))) {
            this.f657.add(new AbstractC0040.C0049(strM1709, c0466.m1718()));
            return;
        }
        if (c0466.m1712(SOY.d("246F"))) {
            this.f657.add(new AbstractC0040.C0050(strM1709, c0466.m1718()));
            return;
        }
        if (c0466.m1712(SOY.d("5E6F"))) {
            this.f657.add(new AbstractC0040.C0047(strM1709, c0466.m1718()));
        } else if (c0466.m1712(SOY.d("506F"))) {
            this.f657.add(new AbstractC0040.C0046(strM1709, c0466.m1718()));
        } else {
            if (!c0466.m1712(SOY.d("046F"))) {
                throw new C0170.C0171(SOY.d("393D241A1057143D255604160821345615030E20381401031F722003110503727653075040722418110F0A37320211135A263E1D11195A33255653520975"), this.f656, c0466.m1718());
            }
            this.f657.add(new AbstractC0040.C0048(strM1709, Pattern.compile(c0466.m1718())));
        }
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private void m975() {
        String strM1706 = this.f655.m1706();
        C0034.m282(strM1706);
        this.f657.add(new AbstractC0040.C0051(strM1706.trim()));
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private void m976() {
        String strM1706 = this.f655.m1706();
        C0034.m282(strM1706);
        this.f657.add(new AbstractC0040.C0056(strM1706));
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private void m977() {
        String strM917 = C0256.m917(this.f655.m1707());
        C0034.m282(strM917);
        String strD = SOY.d("502E");
        boolean zStartsWith = strM917.startsWith(strD);
        String strD2 = SOY.d("40");
        if (zStartsWith) {
            this.f657.add(new AbstractC0004.C0006(new AbstractC0040.C0076(strM917), new AbstractC0040.C0077(strM917.replace(strD, strD2))));
            return;
        }
        String strD3 = SOY.d("06");
        if (strM917.contains(strD3)) {
            strM917 = strM917.replace(strD3, strD2);
        }
        this.f657.add(new AbstractC0040.C0076(strM917));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m978(char r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.C0259.m978(char):void");
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private int m979() {
        String strTrim = this.f655.m1703(SOY.d("53")).trim();
        C0034.m279(C0008.m142(strTrim), SOY.d("333C35130C571727220254151F723F031912083B32"));
        return Integer.parseInt(strTrim);
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private String m980() {
        StringBuilder sbM136 = C0008.m136();
        while (!this.f655.m1711()) {
            C0466 c0466 = this.f655;
            String strD = SOY.d("52");
            if (c0466.m1713(strD)) {
                sbM136.append(strD);
                sbM136.append(this.f655.m1702('(', ')'));
                sbM136.append(SOY.d("53"));
            } else {
                C0466 c04662 = this.f655;
                String strD2 = SOY.d("21");
                if (c04662.m1713(strD2)) {
                    sbM136.append(strD2);
                    sbM136.append(this.f655.m1702('[', ']'));
                    sbM136.append(SOY.d("27"));
                } else {
                    if (this.f655.m1715(f651)) {
                        break;
                    }
                    sbM136.append(this.f655.m1704());
                }
            }
        }
        return C0008.m147(sbM136);
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private void m981(boolean z) {
        this.f655.m1705(z ? SOY.d("40313E180016133C22390319") : SOY.d("40313E180016133C22"));
        String strM1701 = C0466.m1701(this.f655.m1702('(', ')'));
        C0034.m283(strM1701, SOY.d("40313E180016133C225E00120226785605021F2028561902092671181B035A303456111A0A2628"));
        if (z) {
            this.f657.add(new AbstractC0040.C0053(strM1701));
        } else {
            this.f657.add(new AbstractC0040.C0054(strM1701));
        }
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private void m982() {
        this.f655.m1705(SOY.d("40313E180016133C223215031B"));
        String strM1701 = C0466.m1701(this.f655.m1702('(', ')'));
        C0034.m283(strM1701, SOY.d("40313E180016133C223215031B7A25130C0353722003110503723C0307035A3C3E0254151F72341B040303"));
        this.f657.add(new AbstractC0040.C0052(strM1701));
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    private void m983(boolean z, boolean z2) {
        String strM917 = C0256.m917(this.f655.m1703(SOY.d("53")));
        Matcher matcher = f653.matcher(strM917);
        Matcher matcher2 = f654.matcher(strM917);
        int i = 2;
        if (SOY.d("153635").equals(strM917)) {
            i = 1;
        } else if (!SOY.d("1F243418").equals(strM917)) {
            boolean zMatches = matcher.matches();
            String strD = SOY.d("240E7A");
            if (zMatches) {
                int i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst(strD, "")) : 1;
                i = matcher.group(4) != null ? Integer.parseInt(matcher.group(4).replaceFirst(strD, "")) : 0;
                i = i2;
            } else {
                if (!matcher2.matches()) {
                    throw new C0170.C0171(SOY.d("393D241A1057143D25560416082134561A03127F3818101202727653075040722418110F0A37320211135A343E0419160E"), strM917);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst(strD, ""));
                i = 0;
            }
        }
        if (z2) {
            if (z) {
                this.f657.add(new AbstractC0040.C0068(i, i));
                return;
            } else {
                this.f657.add(new AbstractC0040.C0069(i, i));
                return;
            }
        }
        if (z) {
            this.f657.add(new AbstractC0040.C0067(i, i));
        } else {
            this.f657.add(new AbstractC0040.C0066(i, i));
        }
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    private void m984() {
        if (this.f655.m1712(SOY.d("59"))) {
            m976();
            return;
        }
        if (this.f655.m1712(SOY.d("54"))) {
            m975();
            return;
        }
        if (this.f655.m1717() || this.f655.m1713(SOY.d("502E"))) {
            m977();
            return;
        }
        if (this.f655.m1713(SOY.d("21"))) {
            m974();
            return;
        }
        if (this.f655.m1712(SOY.d("50"))) {
            m973();
            return;
        }
        if (this.f655.m1712(SOY.d("403E255E"))) {
            m988();
            return;
        }
        if (this.f655.m1712(SOY.d("4035255E"))) {
            m987();
            return;
        }
        if (this.f655.m1712(SOY.d("4037205E"))) {
            m986();
            return;
        }
        if (this.f655.m1713(SOY.d("403A30055C"))) {
            m985();
            return;
        }
        if (this.f655.m1713(SOY.d("40313E180016133C225E"))) {
            m981(false);
            return;
        }
        if (this.f655.m1713(SOY.d("40313E180016133C2239031952"))) {
            m981(true);
            return;
        }
        if (this.f655.m1713(SOY.d("40313E180016133C223215031B7A"))) {
            m982();
            return;
        }
        if (this.f655.m1713(SOY.d("403F3002171F1F2179"))) {
            m989(false);
            return;
        }
        if (this.f655.m1713(SOY.d("403F3002171F1F211E011A5F"))) {
            m989(true);
            return;
        }
        if (this.f655.m1713(SOY.d("403C3E025C"))) {
            m990();
            return;
        }
        if (this.f655.m1712(SOY.d("403C251E5914123B3D125C"))) {
            m983(false, false);
            return;
        }
        if (this.f655.m1712(SOY.d("403C251E591B1B21255B171F133E355E"))) {
            m983(true, false);
            return;
        }
        if (this.f655.m1712(SOY.d("403C251E59181C7F250F041252"))) {
            m983(false, true);
            return;
        }
        if (this.f655.m1712(SOY.d("403C251E591B1B21255B1B1157262806115F"))) {
            m983(true, true);
            return;
        }
        if (this.f655.m1712(SOY.d("4034380407035731391F1813"))) {
            this.f657.add(new AbstractC0040.C0062());
            return;
        }
        if (this.f655.m1712(SOY.d("403E3005005A193A381A10"))) {
            this.f657.add(new AbstractC0040.C0064());
            return;
        }
        if (this.f655.m1712(SOY.d("403438040703573D375B000E0A37"))) {
            this.f657.add(new AbstractC0040.C0063());
            return;
        }
        if (this.f655.m1712(SOY.d("403E3005005A15347C020D071F"))) {
            this.f657.add(new AbstractC0040.C0065());
            return;
        }
        if (this.f655.m1712(SOY.d("403D3F1A0D5A193A381A10"))) {
            this.f657.add(new AbstractC0040.C0070());
            return;
        }
        if (this.f655.m1712(SOY.d("403D3F1A0D5A15347C020D071F"))) {
            this.f657.add(new AbstractC0040.C0071());
            return;
        }
        if (this.f655.m1712(SOY.d("40373C06000E"))) {
            this.f657.add(new AbstractC0040.C0061());
        } else if (this.f655.m1712(SOY.d("40203E1900"))) {
            this.f657.add(new AbstractC0040.C0072());
        } else {
            if (!this.f655.m1712(SOY.d("403F3002171F2E372902"))) {
                throw new C0170.C0171(SOY.d("393D241A1057143D255604160821345605021F202856535209756B5601191F2A211317031F3671021B1C1F3C711700575D772251"), this.f656, this.f655.m1718());
            }
            this.f657.add(new AbstractC0040.C0073());
        }
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    private void m985() {
        this.f655.m1705(SOY.d("403A3005"));
        String strM1702 = this.f655.m1702('(', ')');
        C0034.m283(strM1702, SOY.d("403A30055C12167B7105011509373D1317035A3F24050057143D255616125A373C06000E"));
        this.f657.add(new AbstractC0089.C0090(m991(strM1702)));
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    private void m986() {
        this.f657.add(new AbstractC0040.C0057(m979()));
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    private void m987() {
        this.f657.add(new AbstractC0040.C0059(m979()));
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    private void m988() {
        this.f657.add(new AbstractC0040.C0060(m979()));
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    private void m989(boolean z) {
        this.f655.m1705(z ? SOY.d("403F3002171F1F211E011A") : SOY.d("403F3002171F1F21"));
        String strM1702 = this.f655.m1702('(', ')');
        C0034.m283(strM1702, SOY.d("403F3002171F1F21790411101F2A785605021F2028561902092671181B035A303456111A0A2628"));
        if (z) {
            this.f657.add(new AbstractC0040.C0075(Pattern.compile(strM1702)));
        } else {
            this.f657.add(new AbstractC0040.C0074(Pattern.compile(strM1702)));
        }
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    private void m990() {
        this.f655.m1705(SOY.d("403C3E02"));
        String strM1702 = this.f655.m1702('(', ')');
        C0034.m283(strM1702, SOY.d("403C3E025C041F3E34150018087B7105011509373D1317035A3F24050057143D255616125A373C06000E"));
        this.f657.add(new AbstractC0089.C0093(m991(strM1702)));
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public static AbstractC0040 m991(String str) {
        try {
            return new C0259(str).m992();
        } catch (IllegalArgumentException e) {
            throw new C0170.C0171(e.getMessage(), new Object[0]);
        }
    }

    public String toString() {
        return this.f656;
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    AbstractC0040 m992() {
        this.f655.m1710();
        if (this.f655.m1715(f651)) {
            this.f657.add(new AbstractC0089.C0096());
            m978(this.f655.m1704());
        } else {
            m984();
        }
        while (!this.f655.m1711()) {
            boolean zM1710 = this.f655.m1710();
            if (this.f655.m1715(f651)) {
                m978(this.f655.m1704());
            } else if (zM1710) {
                m978(' ');
            } else {
                m984();
            }
        }
        return this.f657.size() == 1 ? this.f657.get(0) : new AbstractC0004.C0005(this.f657);
    }
}
