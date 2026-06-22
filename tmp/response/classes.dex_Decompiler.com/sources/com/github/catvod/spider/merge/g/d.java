package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.oZP;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
@Deprecated
public final class d {
    private static final String[][] a;
    private static final String[][] b;
    private static final String[][] c;
    private static final String[][] d;
    private static final String[][] e;
    private static final String[][] f;
    private static final String[][] g;
    private static final String[][] h;
    private static final String[][] i;
    private static final String[][] j;

    static {
        String[][] strArr = {new String[]{oZP.d("B7CF"), oZP.d("530115321C6E")}, new String[]{oZP.d("B7CE"), oZP.d("530612390F394E")}, new String[]{oZP.d("B7CD"), oZP.d("530C122F186E")}, new String[]{oZP.d("B7CC"), oZP.d("531F183402314E")}, new String[]{oZP.d("B7CB"), oZP.d("530C02331E301B54")}, new String[]{oZP.d("B7CA"), oZP.d("5316122F57")}, new String[]{oZP.d("B7C9"), oZP.d("530D05370E340754")}, new String[]{oZP.d("B7C8"), oZP.d("531C1222186E")}, new String[]{oZP.d("B7C7"), oZP.d("531A1A2D57")}, new String[]{oZP.d("B7C6"), oZP.d("530C1831156E")}, new String[]{oZP.d("B7C5"), oZP.d("530005250A6E")}, new String[]{oZP.d("B7C4"), oZP.d("53031630193A4E")}, new String[]{oZP.d("B7C3"), oZP.d("5301183557")}, new String[]{oZP.d("B7C2"), oZP.d("531C1F3857")}, new String[]{oZP.d("B7C1"), oZP.d("531D122657")}, new String[]{oZP.d("B7C0"), oZP.d("530216221E6E")}, new String[]{oZP.d("B7DF"), oZP.d("530B122657")}, new String[]{oZP.d("B7DE"), oZP.d("531F1B341F381B54")}, new String[]{oZP.d("B7DD"), oZP.d("531C02315E6E")}, new String[]{oZP.d("B7DC"), oZP.d("531C02315F6E")}, new String[]{oZP.d("B7DB"), oZP.d("530E143418304E")}, new String[]{oZP.d("B7DA"), oZP.d("53021E221E3A4E")}, new String[]{oZP.d("B7D9"), oZP.d("531F16330D6E")}, new String[]{oZP.d("B7D8"), oZP.d("53021E25083A0154")}, new String[]{oZP.d("B7D7"), oZP.d("530C122505394E")}, new String[]{oZP.d("B7D6"), oZP.d("531C02315D6E")}, new String[]{oZP.d("B7D5"), oZP.d("53000525016E")}, new String[]{oZP.d("B7D4"), oZP.d("531D1630193A4E")}, new String[]{oZP.d("B7D3"), oZP.d("530905200F644154")}, new String[]{oZP.d("B7D2"), oZP.d("530905200F644754")}, new String[]{oZP.d("B7D1"), oZP.d("530905200F664154")}, new String[]{oZP.d("B7D0"), oZP.d("5306063409260154")}, new String[]{oZP.d("B6EF"), oZP.d("532E10330D231054")}, new String[]{oZP.d("B6EE"), oZP.d("532E162219211054")}, new String[]{oZP.d("B6ED"), oZP.d("532E14281E364E")}, new String[]{oZP.d("B6EC"), oZP.d("532E032800311054")}, new String[]{oZP.d("B6EB"), oZP.d("532E022C006E")}, new String[]{oZP.d("B6EA"), oZP.d("532E052802324E")}, new String[]{oZP.d("B6E9"), oZP.d("532E322D05324E")}, new String[]{oZP.d("B6E8"), oZP.d("532C1424083C1954")}, new String[]{oZP.d("B6E7"), oZP.d("532A10330D231054")}, new String[]{oZP.d("B6E6"), oZP.d("532A162219211054")}, new String[]{oZP.d("B6E5"), oZP.d("532A14281E364E")}, new String[]{oZP.d("B6E4"), oZP.d("532A022C006E")}, new String[]{oZP.d("B6E3"), oZP.d("532610330D231054")}, new String[]{oZP.d("B6E2"), oZP.d("5326162219211054")}, new String[]{oZP.d("B6E1"), oZP.d("532614281E364E")}, new String[]{oZP.d("B6E0"), oZP.d("5326022C006E")}, new String[]{oZP.d("B6FF"), oZP.d("532A230957")}, new String[]{oZP.d("B6FE"), oZP.d("5321032800311054")}, new String[]{oZP.d("B6FD"), oZP.d("532010330D231054")}, new String[]{oZP.d("B6FC"), oZP.d("5320162219211054")}, new String[]{oZP.d("B6FB"), oZP.d("532014281E364E")}, new String[]{oZP.d("B6FA"), oZP.d("5320032800311054")}, new String[]{oZP.d("B6F9"), oZP.d("5320022C006E")}, new String[]{oZP.d("B6F8"), oZP.d("531B1E2C09264E")}, new String[]{oZP.d("B6F7"), oZP.d("5320042D0D261D54")}, new String[]{oZP.d("B6F6"), oZP.d("533A10330D231054")}, new String[]{oZP.d("B6F5"), oZP.d("533A162219211054")}, new String[]{oZP.d("B6F4"), oZP.d("533A14281E364E")}, new String[]{oZP.d("B6F3"), oZP.d("533A022C006E")}, new String[]{oZP.d("B6F2"), oZP.d("5336162219211054")}, new String[]{oZP.d("B6F1"), oZP.d("533B3F0E3E1B4E")}, new String[]{oZP.d("B6F0"), oZP.d("531C0D2D05324E")}, new String[]{oZP.d("B6CF"), oZP.d("530E10330D231054")}, new String[]{oZP.d("B6CE"), oZP.d("530E162219211054")}, new String[]{oZP.d("B6CD"), oZP.d("530E14281E364E")}, new String[]{oZP.d("B6CC"), oZP.d("530E032800311054")}, new String[]{oZP.d("B6CB"), oZP.d("530E022C006E")}, new String[]{oZP.d("B6CA"), oZP.d("530E052802324E")}, new String[]{oZP.d("B6C9"), oZP.d("530E122D05324E")}, new String[]{oZP.d("B6C8"), oZP.d("530C1424083C1954")}, new String[]{oZP.d("B6C7"), oZP.d("530A10330D231054")}, new String[]{oZP.d("B6C6"), oZP.d("530A162219211054")}, new String[]{oZP.d("B6C5"), oZP.d("530A14281E364E")}, new String[]{oZP.d("B6C4"), oZP.d("530A022C006E")}, new String[]{oZP.d("B6C3"), oZP.d("530610330D231054")}, new String[]{oZP.d("B6C2"), oZP.d("5306162219211054")}, new String[]{oZP.d("B6C1"), oZP.d("530614281E364E")}, new String[]{oZP.d("B6C0"), oZP.d("5306022C006E")}, new String[]{oZP.d("B6DF"), oZP.d("530A032957")}, new String[]{oZP.d("B6DE"), oZP.d("5301032800311054")}, new String[]{oZP.d("B6DD"), oZP.d("530010330D231054")}, new String[]{oZP.d("B6DC"), oZP.d("5300162219211054")}, new String[]{oZP.d("B6DB"), oZP.d("530014281E364E")}, new String[]{oZP.d("B6DA"), oZP.d("5300032800311054")}, new String[]{oZP.d("B6D9"), oZP.d("5300022C006E")}, new String[]{oZP.d("B6D8"), oZP.d("530B1E3705311054")}, new String[]{oZP.d("B6D7"), oZP.d("5300042D0D261D54")}, new String[]{oZP.d("B6D6"), oZP.d("531A10330D231054")}, new String[]{oZP.d("B6D5"), oZP.d("531A162219211054")}, new String[]{oZP.d("B6D4"), oZP.d("531A14281E364E")}, new String[]{oZP.d("B6D3"), oZP.d("531A022C006E")}, new String[]{oZP.d("B6D2"), oZP.d("5316162219211054")}, new String[]{oZP.d("B6D1"), oZP.d("531B1F2E1E3B4E")}, new String[]{oZP.d("B6D0"), oZP.d("5316022C006E")}};
        a = strArr;
        b = k(strArr);
        String[][] strArr2 = {new String[]{oZP.d("B3FD"), oZP.d("5309192E0A6E")}, new String[]{oZP.d("BBFE"), oZP.d("532E1B3104344E")}, new String[]{oZP.d("BBFD"), oZP.d("532D12350D6E")}, new String[]{oZP.d("BBFC"), oZP.d("5328162C01344E")}, new String[]{oZP.d("BBFB"), oZP.d("532B122D18344E")}, new String[]{oZP.d("BBFA"), oZP.d("532A073205391A014C")}, new String[]{oZP.d("BBF9"), oZP.d("533512350D6E")}, new String[]{oZP.d("BBF8"), oZP.d("532A032057")}, new String[]{oZP.d("BBF7"), oZP.d("533B1F2418344E")}, new String[]{oZP.d("BBF6"), oZP.d("532618350D6E")}, new String[]{oZP.d("BBF5"), oZP.d("532416311C344E")}, new String[]{oZP.d("BBF4"), oZP.d("5323162C0E311454")}, new String[]{oZP.d("BBF3"), oZP.d("5322027A")}, new String[]{oZP.d("BBF2"), oZP.d("5321027A")}, new String[]{oZP.d("BBF1"), oZP.d("53371E7A")}, new String[]{oZP.d("BBF0"), oZP.d("53201A280F271A014C")}, new String[]{oZP.d("BBCF"), oZP.d("533F1E7A")}, new String[]{oZP.d("BBCE"), oZP.d("533D1F2E57")}, new String[]{oZP.d("BBCC"), oZP.d("533C1E2601344E")}, new String[]{oZP.d("BBCB"), oZP.d("533B163457")}, new String[]{oZP.d("BBCA"), oZP.d("533A073205391A014C")}, new String[]{oZP.d("BBC9"), oZP.d("533F1F2857")}, new String[]{oZP.d("BBC8"), oZP.d("532C1F2857")}, new String[]{oZP.d("BBC7"), oZP.d("533F042857")}, new String[]{oZP.d("BBC6"), oZP.d("53201A240B344E")}, new String[]{oZP.d("BBDE"), oZP.d("530E1B3104344E")}, new String[]{oZP.d("BBDD"), oZP.d("530D12350D6E")}, new String[]{oZP.d("BBDC"), oZP.d("5308162C01344E")}, new String[]{oZP.d("BBDB"), oZP.d("530B122D18344E")}, new String[]{oZP.d("BBDA"), oZP.d("530A073205391A014C")}, new String[]{oZP.d("BBD9"), oZP.d("531512350D6E")}, new String[]{oZP.d("BBD8"), oZP.d("530A032057")}, new String[]{oZP.d("BBD7"), oZP.d("531B1F2418344E")}, new String[]{oZP.d("BBD6"), oZP.d("530618350D6E")}, new String[]{oZP.d("BBD5"), oZP.d("530416311C344E")}, new String[]{oZP.d("BBD4"), oZP.d("5303162C0E311454")}, new String[]{oZP.d("BBD3"), oZP.d("5302027A")}, new String[]{oZP.d("BBD2"), oZP.d("5301027A")}, new String[]{oZP.d("BBD1"), oZP.d("53171E7A")}, new String[]{oZP.d("BBD0"), oZP.d("53001A280F271A014C")}, new String[]{oZP.d("BAEF"), oZP.d("531F1E7A")}, new String[]{oZP.d("BAEE"), oZP.d("531D1F2E57")}, new String[]{oZP.d("BAED"), oZP.d("531C1E2601341354")}, new String[]{oZP.d("BAEC"), oZP.d("531C1E2601344E")}, new String[]{oZP.d("BAEB"), oZP.d("531B163457")}, new String[]{oZP.d("BAEA"), oZP.d("531A073205391A014C")}, new String[]{oZP.d("BAE9"), oZP.d("531F1F2857")}, new String[]{oZP.d("BAE8"), oZP.d("530C1F2857")}, new String[]{oZP.d("BAE7"), oZP.d("531F042857")}, new String[]{oZP.d("BAE6"), oZP.d("53001A240B344E")}, new String[]{oZP.d("BAFE"), oZP.d("531B1F24183406161A7A")}, new String[]{oZP.d("BAFD"), oZP.d("531A0732053D4E")}, new String[]{oZP.d("BAF9"), oZP.d("531F1E3757")}, new String[]{oZP.d("97EFD5"), oZP.d("530D022D006E")}, new String[]{oZP.d("97EFD1"), oZP.d("5307122D003C0554")}, new String[]{oZP.d("97EFC5"), oZP.d("531F052801304E")}, new String[]{oZP.d("97EFC4"), oZP.d("533F052801304E")}, new String[]{oZP.d("97EFC9"), oZP.d("53001B2802304E")}, new String[]{oZP.d("97EEF3"), oZP.d("530905201F394E")}, new String[]{oZP.d("97EBEF"), oZP.d("5318122809270554")}, new String[]{oZP.d("97EBE6"), oZP.d("53061A200B304E")}, new String[]{oZP.d("97EBEB"), oZP.d("531D1220006E")}, new String[]{oZP.d("97EBD5"), oZP.d("531B052008304E")}, new String[]{oZP.d("97EBC2"), oZP.d("530E1B240A260C024C")}, new String[]{oZP.d("97E9E7"), oZP.d("530316331E6E")}, new String[]{oZP.d("97E9E6"), oZP.d("531A16331E6E")}, new String[]{oZP.d("97E9E5"), oZP.d("531D16331E6E")}, new String[]{oZP.d("97E9E4"), oZP.d("530B16331E6E")}, new String[]{oZP.d("97E9E3"), oZP.d("530716331E6E")}, new String[]{oZP.d("97E9C2"), oZP.d("530C05201E274E")}, new String[]{oZP.d("97E8E7"), oZP.d("530336331E6E")}, new String[]{oZP.d("97E8E6"), oZP.d("531A36331E6E")}, new String[]{oZP.d("97E8E5"), oZP.d("531D36331E6E")}, new String[]{oZP.d("97E8E4"), oZP.d("530B36331E6E")}, new String[]{oZP.d("97E8E3"), oZP.d("530736331E6E")}, new String[]{oZP.d("97E7F7"), oZP.d("530918330D391954")}, new String[]{oZP.d("97E7F5"), oZP.d("531F1633186E")}, new String[]{oZP.d("97E7F4"), oZP.d("530A0F281F214E")}, new String[]{oZP.d("97E7F2"), oZP.d("530A1A31182C4E")}, new String[]{oZP.d("97E7F0"), oZP.d("5301162300344E")}, new String[]{oZP.d("97E7FF"), oZP.d("53060428026E")}, new String[]{oZP.d("97E7FE"), oZP.d("53011835053B4E")}, new String[]{oZP.d("97E7FC"), oZP.d("53011E7A")}, new String[]{oZP.d("97E7F8"), oZP.d("531F052E086E")}, new String[]{oZP.d("97E7E6"), oZP.d("531C022C57")}, new String[]{oZP.d("97E7E5"), oZP.d("53021E2F19264E")}, new String[]{oZP.d("97E7E0"), oZP.d("530318360D260154")}, new String[]{oZP.d("97E7ED"), oZP.d("531D162505364E")}, new String[]{oZP.d("97E7EA"), oZP.d("531F052E1C6E")}, new String[]{oZP.d("97E7E9"), oZP.d("53061927053B4E")}, new String[]{oZP.d("97E7D7"), oZP.d("530E192657")}, new String[]{oZP.d("97E7D0"), oZP.d("530E192557")}, new String[]{oZP.d("97E7DF"), oZP.d("5300057A")}, new String[]{oZP.d("97E7DE"), oZP.d("530C163157")}, new String[]{oZP.d("97E7DD"), oZP.d("530C023157")}, new String[]{oZP.d("97E7DC"), oZP.d("5306193557")}, new String[]{oZP.d("97E7C3"), oZP.d("531B1F241E304154")}, new String[]{oZP.d("97E7CB"), oZP.d("531C1E2C57")}, new String[]{oZP.d("97E6F2"), oZP.d("530C182F0B6E")}, new String[]{oZP.d("97E6FF"), oZP.d("530E043801254E")}, new String[]{oZP.d("97E6D7"), oZP.d("5301127A")}, new String[]{oZP.d("97E6D6"), oZP.d("530A063405234E")}, new String[]{oZP.d("97E6D3"), oZP.d("5303127A")}, new String[]{oZP.d("97E6D2"), oZP.d("5308127A")}, new String[]{oZP.d("97E5F5"), oZP.d("531C022357")}, new String[]{oZP.d("97E5F4"), oZP.d("531C023157")}, new String[]{oZP.d("97E5F3"), oZP.d("530104340E6E")}, new String[]{oZP.d("97E5F1"), oZP.d("531C0223096E")}, new String[]{oZP.d("97E5F0"), oZP.d("531C0231096E")}, new String[]{oZP.d("97E5E2"), oZP.d("5300072D19264E")}, new String[]{oZP.d("97E5E0"), oZP.d("5300032801300654")}, new String[]{oZP.d("97E5D2"), oZP.d("531F12331C6E")}, new String[]{oZP.d("97E4F2"), oZP.d("531C132E186E")}, new String[]{oZP.d("97E3FF"), oZP.d("5303142405394E")}, new String[]{oZP.d("97E3FE"), oZP.d("531D142405394E")}, new String[]{oZP.d("97E3FD"), oZP.d("5303112D033A0754")}, new String[]{oZP.d("97E3FC"), oZP.d("531D112D033A0754")}, new String[]{oZP.d("97E3DE"), oZP.d("5303162F0B6E")}, new String[]{oZP.d("97E3DD"), oZP.d("531D162F0B6E")}, new String[]{oZP.d("97F8FD"), oZP.d("5303183B57")}, new String[]{oZP.d("97F6D7"), oZP.d("531C072008300654")}, new String[]{oZP.d("97F6D4"), oZP.d("530C1B340E264E")}, new String[]{oZP.d("97F6D2"), oZP.d("530712201E210654")}, new String[]{oZP.d("97F6D1"), oZP.d("530B1E2001264E")}, new String[]{oZP.d("B0FD"), oZP.d("5320322D05324E")}, new String[]{oZP.d("B0FC"), oZP.d("5300122D05324E")}, new String[]{oZP.d("B0CF"), oZP.d("533C14201E3A1B54")}, new String[]{oZP.d("B0CE"), oZP.d("531C14201E3A1B54")}, new String[]{oZP.d("B0D7"), oZP.d("5336022C006E")}, new String[]{oZP.d("BEE9"), oZP.d("530C1E330F6E")}, new String[]{oZP.d("BEF3"), oZP.d("531B1E2D08304E")}, new String[]{oZP.d("97EFF5"), oZP.d("530A19321C6E")}, new String[]{oZP.d("97EFF4"), oZP.d("530A1A321C6E")}, new String[]{oZP.d("97EFFE"), oZP.d("531B1F2802260554")}, new String[]{oZP.d("97EFFB"), oZP.d("5315002F066E")}, new String[]{oZP.d("97EFFA"), oZP.d("5315002B57")}, new String[]{oZP.d("97EFF9"), oZP.d("5303052C57")}, new String[]{oZP.d("97EFF8"), oZP.d("531D1B2C57")}, new String[]{oZP.d("97EFE4"), oZP.d("530113201F3D4E")}, new String[]{oZP.d("97EFE3"), oZP.d("530213201F3D4E")}, new String[]{oZP.d("97EFEF"), oZP.d("53030430193A4E")}, new String[]{oZP.d("97EFEE"), oZP.d("531D0430193A4E")}, new String[]{oZP.d("97EFED"), oZP.d("531C1530193A4E")}, new String[]{oZP.d("97EFEB"), oZP.d("53031330193A4E")}, new String[]{oZP.d("97EFEA"), oZP.d("531D1330193A4E")}, new String[]{oZP.d("97EFE9"), oZP.d("530D1330193A4E")}, new String[]{oZP.d("97EFD7"), oZP.d("530B16260B300754")}, new String[]{oZP.d("97EFD6"), oZP.d("532B16260B300754")}, new String[]{oZP.d("97EFC7"), oZP.d("531F1233013C1954")}, new String[]{oZP.d("97EFCE"), oZP.d("530304201D201A54")}, new String[]{oZP.d("97EFCD"), oZP.d("531D04201D201A54")}, new String[]{oZP.d("97EDDB"), oZP.d("530A0233036E")}};
        c = strArr2;
        d = k(strArr2);
        String[][] strArr3 = {new String[]{oZP.d("57"), oZP.d("531E022E186E")}, new String[]{oZP.d("53"), oZP.d("530E1A3157")}, new String[]{oZP.d("49"), oZP.d("5303037A")}, new String[]{oZP.d("4B"), oZP.d("5308037A")}};
        e = strArr3;
        f = k(strArr3);
        String[][] strArr4 = {new String[]{oZP.d("52"), oZP.d("530E072E1F6E")}};
        g = strArr4;
        h = k(strArr4);
        String[][] strArr5 = {new String[]{oZP.d("7D"), oZP.d("290D")}, new String[]{oZP.d("7F"), oZP.d("2901")}, new String[]{oZP.d("7C"), oZP.d("291B")}, new String[]{oZP.d("79"), oZP.d("2909")}, new String[]{oZP.d("78"), oZP.d("291D")}};
        i = strArr5;
        j = k(strArr5);
    }

    public static String[][] a() {
        return (String[][]) g.clone();
    }

    public static String[][] b() {
        return (String[][]) h.clone();
    }

    public static String[][] c() {
        return (String[][]) e.clone();
    }

    public static String[][] d() {
        return (String[][]) f.clone();
    }

    public static String[][] e() {
        return (String[][]) c.clone();
    }

    public static String[][] f() {
        return (String[][]) d.clone();
    }

    public static String[][] g() {
        return (String[][]) a.clone();
    }

    public static String[][] h() {
        return (String[][]) b.clone();
    }

    public static String[][] i() {
        return (String[][]) i.clone();
    }

    public static String[][] j() {
        return (String[][]) j.clone();
    }

    public static String[][] k(String[][] strArr) {
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length, 2);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr2[i2][0] = strArr[i2][1];
            strArr2[i2][1] = strArr[i2][0];
        }
        return strArr2;
    }
}
