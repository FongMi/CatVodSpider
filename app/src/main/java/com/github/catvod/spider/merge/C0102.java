package com.github.catvod.spider.merge;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʱ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
@Deprecated
public class C0102 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private static final String[][] f270;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private static final String[][] f271;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private static final String[][] f272;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final String[][] f273;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    private static final String[][] f274;

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    private static final String[][] f275;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    private static final String[][] f276;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    private static final String[][] f277;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    private static final String[][] f278;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private static final String[][] f279;

    static {
        String[][] strArr = {new String[]{SOY.d("B8F2"), SOY.d("5C3C3305044C")}, new String[]{SOY.d("B8F3"), SOY.d("5C3B340E171B41")}, new String[]{SOY.d("B8F0"), SOY.d("5C313418004C")}, new String[]{SOY.d("B8F1"), SOY.d("5C223E031A1341")}, new String[]{SOY.d("B8F6"), SOY.d("5C31240406121469")}, new String[]{SOY.d("B8F7"), SOY.d("5C2B34184F")}, new String[]{SOY.d("B8F4"), SOY.d("5C30230016160869")}, new String[]{SOY.d("B8F5"), SOY.d("5C213415004C")}, new String[]{SOY.d("B8FA"), SOY.d("5C273C1A4F")}, new String[]{SOY.d("B8FB"), SOY.d("5C313E060D4C")}, new String[]{SOY.d("B8F8"), SOY.d("5C3D2312124C")}, new String[]{SOY.d("B8F9"), SOY.d("5C3E3007011841")}, new String[]{SOY.d("B8FE"), SOY.d("5C3C3E024F")}, new String[]{SOY.d("B8FF"), SOY.d("5C21390F4F")}, new String[]{SOY.d("B8FC"), SOY.d("5C2034114F")}, new String[]{SOY.d("B8FD"), SOY.d("5C3F3015064C")}, new String[]{SOY.d("B8E2"), SOY.d("5C3634114F")}, new String[]{SOY.d("B8E3"), SOY.d("5C223D03071A1469")}, new String[]{SOY.d("B8E0"), SOY.d("5C212406464C")}, new String[]{SOY.d("B8E1"), SOY.d("5C212406474C")}, new String[]{SOY.d("B8E6"), SOY.d("5C333203001241")}, new String[]{SOY.d("B8E7"), SOY.d("5C3F3815061841")}, new String[]{SOY.d("B8E4"), SOY.d("5C223004154C")}, new String[]{SOY.d("B8E5"), SOY.d("5C3F381210180E69")}, new String[]{SOY.d("B8EA"), SOY.d("5C3134121D1B41")}, new String[]{SOY.d("B8EB"), SOY.d("5C212406454C")}, new String[]{SOY.d("B8E8"), SOY.d("5C3D2312194C")}, new String[]{SOY.d("B8E9"), SOY.d("5C203007011841")}, new String[]{SOY.d("B8EE"), SOY.d("5C34231717464E69")}, new String[]{SOY.d("B8EF"), SOY.d("5C34231717464869")}, new String[]{SOY.d("B8EC"), SOY.d("5C34231717444E69")}, new String[]{SOY.d("B8ED"), SOY.d("5C3B200311040E69")}, new String[]{SOY.d("B9D2"), SOY.d("5C13360415011F69")}, new String[]{SOY.d("B9D3"), SOY.d("5C13301501031F69")}, new String[]{SOY.d("B9D0"), SOY.d("5C13321F061441")}, new String[]{SOY.d("B9D1"), SOY.d("5C13251F18131F69")}, new String[]{SOY.d("B9D6"), SOY.d("5C13241B184C")}, new String[]{SOY.d("B9D7"), SOY.d("5C13231F1A1041")}, new String[]{SOY.d("B9D4"), SOY.d("5C13141A1D1041")}, new String[]{SOY.d("B9D5"), SOY.d("5C113213101E1669")}, new String[]{SOY.d("B9DA"), SOY.d("5C17360415011F69")}, new String[]{SOY.d("B9DB"), SOY.d("5C17301501031F69")}, new String[]{SOY.d("B9D8"), SOY.d("5C17321F061441")}, new String[]{SOY.d("B9D9"), SOY.d("5C17241B184C")}, new String[]{SOY.d("B9DE"), SOY.d("5C1B360415011F69")}, new String[]{SOY.d("B9DF"), SOY.d("5C1B301501031F69")}, new String[]{SOY.d("B9DC"), SOY.d("5C1B321F061441")}, new String[]{SOY.d("B9DD"), SOY.d("5C1B241B184C")}, new String[]{SOY.d("B9C2"), SOY.d("5C17053E4F")}, new String[]{SOY.d("B9C3"), SOY.d("5C1C251F18131F69")}, new String[]{SOY.d("B9C0"), SOY.d("5C1D360415011F69")}, new String[]{SOY.d("B9C1"), SOY.d("5C1D301501031F69")}, new String[]{SOY.d("B9C6"), SOY.d("5C1D321F061441")}, new String[]{SOY.d("B9C7"), SOY.d("5C1D251F18131F69")}, new String[]{SOY.d("B9C4"), SOY.d("5C1D241B184C")}, new String[]{SOY.d("B9C5"), SOY.d("5C26381B110441")}, new String[]{SOY.d("B9CA"), SOY.d("5C1D221A15041269")}, new String[]{SOY.d("B9CB"), SOY.d("5C07360415011F69")}, new String[]{SOY.d("B9C8"), SOY.d("5C07301501031F69")}, new String[]{SOY.d("B9C9"), SOY.d("5C07321F061441")}, new String[]{SOY.d("B9CE"), SOY.d("5C07241B184C")}, new String[]{SOY.d("B9CF"), SOY.d("5C0B301501031F69")}, new String[]{SOY.d("B9CC"), SOY.d("5C061939263941")}, new String[]{SOY.d("B9CD"), SOY.d("5C212B1A1D1041")}, new String[]{SOY.d("B9F2"), SOY.d("5C33360415011F69")}, new String[]{SOY.d("B9F3"), SOY.d("5C33301501031F69")}, new String[]{SOY.d("B9F0"), SOY.d("5C33321F061441")}, new String[]{SOY.d("B9F1"), SOY.d("5C33251F18131F69")}, new String[]{SOY.d("B9F6"), SOY.d("5C33241B184C")}, new String[]{SOY.d("B9F7"), SOY.d("5C33231F1A1041")}, new String[]{SOY.d("B9F4"), SOY.d("5C33341A1D1041")}, new String[]{SOY.d("B9F5"), SOY.d("5C313213101E1669")}, new String[]{SOY.d("B9FA"), SOY.d("5C37360415011F69")}, new String[]{SOY.d("B9FB"), SOY.d("5C37301501031F69")}, new String[]{SOY.d("B9F8"), SOY.d("5C37321F061441")}, new String[]{SOY.d("B9F9"), SOY.d("5C37241B184C")}, new String[]{SOY.d("B9FE"), SOY.d("5C3B360415011F69")}, new String[]{SOY.d("B9FF"), SOY.d("5C3B301501031F69")}, new String[]{SOY.d("B9FC"), SOY.d("5C3B321F061441")}, new String[]{SOY.d("B9FD"), SOY.d("5C3B241B184C")}, new String[]{SOY.d("B9E2"), SOY.d("5C37251E4F")}, new String[]{SOY.d("B9E3"), SOY.d("5C3C251F18131F69")}, new String[]{SOY.d("B9E0"), SOY.d("5C3D360415011F69")}, new String[]{SOY.d("B9E1"), SOY.d("5C3D301501031F69")}, new String[]{SOY.d("B9E6"), SOY.d("5C3D321F061441")}, new String[]{SOY.d("B9E7"), SOY.d("5C3D251F18131F69")}, new String[]{SOY.d("B9E4"), SOY.d("5C3D241B184C")}, new String[]{SOY.d("B9E5"), SOY.d("5C3638001D131F69")}, new String[]{SOY.d("B9EA"), SOY.d("5C3D221A15041269")}, new String[]{SOY.d("B9EB"), SOY.d("5C27360415011F69")}, new String[]{SOY.d("B9E8"), SOY.d("5C27301501031F69")}, new String[]{SOY.d("B9E9"), SOY.d("5C27321F061441")}, new String[]{SOY.d("B9EE"), SOY.d("5C27241B184C")}, new String[]{SOY.d("B9EF"), SOY.d("5C2B301501031F69")}, new String[]{SOY.d("B9EC"), SOY.d("5C263919061941")}, new String[]{SOY.d("B9ED"), SOY.d("5C2B241B184C")}};
        f270 = strArr;
        f271 = m374(strArr);
        String[][] strArr2 = {new String[]{SOY.d("BCC0"), SOY.d("5C343F19124C")}, new String[]{SOY.d("B4C3"), SOY.d("5C133D061C1641")}, new String[]{SOY.d("B4C0"), SOY.d("5C103402154C")}, new String[]{SOY.d("B4C1"), SOY.d("5C15301B191641")}, new String[]{SOY.d("B4C6"), SOY.d("5C16341A001641")}, new String[]{SOY.d("B4C7"), SOY.d("5C1721051D1B153C6A")}, new String[]{SOY.d("B4C4"), SOY.d("5C083402154C")}, new String[]{SOY.d("B4C5"), SOY.d("5C1725174F")}, new String[]{SOY.d("B4CA"), SOY.d("5C063913001641")}, new String[]{SOY.d("B4CB"), SOY.d("5C1B3E02154C")}, new String[]{SOY.d("B4C8"), SOY.d("5C193006041641")}, new String[]{SOY.d("B4C9"), SOY.d("5C1E301B16131B69")}, new String[]{SOY.d("B4CE"), SOY.d("5C1F244D")}, new String[]{SOY.d("B4CF"), SOY.d("5C1C244D")}, new String[]{SOY.d("B4CC"), SOY.d("5C0A384D")}, new String[]{SOY.d("B4CD"), SOY.d("5C1D3C1F1705153C6A")}, new String[]{SOY.d("B4F2"), SOY.d("5C02384D")}, new String[]{SOY.d("B4F3"), SOY.d("5C0039194F")}, new String[]{SOY.d("B4F1"), SOY.d("5C013811191641")}, new String[]{SOY.d("B4F6"), SOY.d("5C0630034F")}, new String[]{SOY.d("B4F7"), SOY.d("5C0721051D1B153C6A")}, new String[]{SOY.d("B4F4"), SOY.d("5C02391F4F")}, new String[]{SOY.d("B4F5"), SOY.d("5C11391F4F")}, new String[]{SOY.d("B4FA"), SOY.d("5C02221F4F")}, new String[]{SOY.d("B4FB"), SOY.d("5C1D3C13131641")}, new String[]{SOY.d("B4E3"), SOY.d("5C333D061C1641")}, new String[]{SOY.d("B4E0"), SOY.d("5C303402154C")}, new String[]{SOY.d("B4E1"), SOY.d("5C35301B191641")}, new String[]{SOY.d("B4E6"), SOY.d("5C36341A001641")}, new String[]{SOY.d("B4E7"), SOY.d("5C3721051D1B153C6A")}, new String[]{SOY.d("B4E4"), SOY.d("5C283402154C")}, new String[]{SOY.d("B4E5"), SOY.d("5C3725174F")}, new String[]{SOY.d("B4EA"), SOY.d("5C263913001641")}, new String[]{SOY.d("B4EB"), SOY.d("5C3B3E02154C")}, new String[]{SOY.d("B4E8"), SOY.d("5C393006041641")}, new String[]{SOY.d("B4E9"), SOY.d("5C3E301B16131B69")}, new String[]{SOY.d("B4EE"), SOY.d("5C3F244D")}, new String[]{SOY.d("B4EF"), SOY.d("5C3C244D")}, new String[]{SOY.d("B4EC"), SOY.d("5C2A384D")}, new String[]{SOY.d("B4ED"), SOY.d("5C3D3C1F1705153C6A")}, new String[]{SOY.d("B5D2"), SOY.d("5C22384D")}, new String[]{SOY.d("B5D3"), SOY.d("5C2039194F")}, new String[]{SOY.d("B5D0"), SOY.d("5C21381119161C69")}, new String[]{SOY.d("B5D1"), SOY.d("5C213811191641")}, new String[]{SOY.d("B5D6"), SOY.d("5C2630034F")}, new String[]{SOY.d("B5D7"), SOY.d("5C2721051D1B153C6A")}, new String[]{SOY.d("B5D4"), SOY.d("5C22391F4F")}, new String[]{SOY.d("B5D5"), SOY.d("5C31391F4F")}, new String[]{SOY.d("B5DA"), SOY.d("5C22221F4F")}, new String[]{SOY.d("B5DB"), SOY.d("5C3D3C13131641")}, new String[]{SOY.d("B5C3"), SOY.d("5C2639130016092B3C4D")}, new String[]{SOY.d("B5C0"), SOY.d("5C2721051D1F41")}, new String[]{SOY.d("B5C4"), SOY.d("5C2238004F")}, new String[]{SOY.d("98D2F3"), SOY.d("5C30241A184C")}, new String[]{SOY.d("98D2F7"), SOY.d("5C3A341A181E0A69")}, new String[]{SOY.d("98D2E3"), SOY.d("5C22231F191241")}, new String[]{SOY.d("98D2E2"), SOY.d("5C02231F191241")}, new String[]{SOY.d("98D2EF"), SOY.d("5C3D3D1F1A1241")}, new String[]{SOY.d("98D3D5"), SOY.d("5C342317071B41")}, new String[]{SOY.d("98D6C9"), SOY.d("5C25341F11050A69")}, new String[]{SOY.d("98D6C0"), SOY.d("5C3B3C17131241")}, new String[]{SOY.d("98D6CD"), SOY.d("5C203417184C")}, new String[]{SOY.d("98D6F3"), SOY.d("5C262317101241")}, new String[]{SOY.d("98D6E4"), SOY.d("5C333D131204033F6A")}, new String[]{SOY.d("98D4C1"), SOY.d("5C3E3004064C")}, new String[]{SOY.d("98D4C0"), SOY.d("5C273004064C")}, new String[]{SOY.d("98D4C3"), SOY.d("5C203004064C")}, new String[]{SOY.d("98D4C2"), SOY.d("5C363004064C")}, new String[]{SOY.d("98D4C5"), SOY.d("5C3A3004064C")}, new String[]{SOY.d("98D4E4"), SOY.d("5C312317060541")}, new String[]{SOY.d("98D5C1"), SOY.d("5C3E1004064C")}, new String[]{SOY.d("98D5C0"), SOY.d("5C271004064C")}, new String[]{SOY.d("98D5C3"), SOY.d("5C201004064C")}, new String[]{SOY.d("98D5C2"), SOY.d("5C361004064C")}, new String[]{SOY.d("98D5C5"), SOY.d("5C3A1004064C")}, new String[]{SOY.d("98DAD1"), SOY.d("5C343E04151B1669")}, new String[]{SOY.d("98DAD3"), SOY.d("5C223004004C")}, new String[]{SOY.d("98DAD2"), SOY.d("5C37291F070341")}, new String[]{SOY.d("98DAD4"), SOY.d("5C373C06000E41")}, new String[]{SOY.d("98DAD6"), SOY.d("5C3C3014181641")}, new String[]{SOY.d("98DAD9"), SOY.d("5C3B221F1A4C")}, new String[]{SOY.d("98DAD8"), SOY.d("5C3C3E021D1941")}, new String[]{SOY.d("98DADA"), SOY.d("5C3C384D")}, new String[]{SOY.d("98DADE"), SOY.d("5C222319104C")}, new String[]{SOY.d("98DAC0"), SOY.d("5C21241B4F")}, new String[]{SOY.d("98DAC3"), SOY.d("5C3F3818010441")}, new String[]{SOY.d("98DAC6"), SOY.d("5C3E3E0115040E69")}, new String[]{SOY.d("98DACB"), SOY.d("5C2030121D1441")}, new String[]{SOY.d("98DACC"), SOY.d("5C222319044C")}, new String[]{SOY.d("98DACF"), SOY.d("5C3B3F101D1941")}, new String[]{SOY.d("98DAF1"), SOY.d("5C333F114F")}, new String[]{SOY.d("98DAF6"), SOY.d("5C333F124F")}, new String[]{SOY.d("98DAF9"), SOY.d("5C3D234D")}, new String[]{SOY.d("98DAF8"), SOY.d("5C3130064F")}, new String[]{SOY.d("98DAFB"), SOY.d("5C3124064F")}, new String[]{SOY.d("98DAFA"), SOY.d("5C3B3F024F")}, new String[]{SOY.d("98DAE5"), SOY.d("5C26391306124E69")}, new String[]{SOY.d("98DAED"), SOY.d("5C21381B4F")}, new String[]{SOY.d("98DBD4"), SOY.d("5C313E18134C")}, new String[]{SOY.d("98DBD9"), SOY.d("5C33220F190741")}, new String[]{SOY.d("98DBF1"), SOY.d("5C3C344D")}, new String[]{SOY.d("98DBF0"), SOY.d("5C3720031D0141")}, new String[]{SOY.d("98DBF5"), SOY.d("5C3E344D")}, new String[]{SOY.d("98DBF4"), SOY.d("5C35344D")}, new String[]{SOY.d("98D8D3"), SOY.d("5C2124144F")}, new String[]{SOY.d("98D8D2"), SOY.d("5C2124064F")}, new String[]{SOY.d("98D8D5"), SOY.d("5C3C2203164C")}, new String[]{SOY.d("98D8D7"), SOY.d("5C212414114C")}, new String[]{SOY.d("98D8D6"), SOY.d("5C212406114C")}, new String[]{SOY.d("98D8C4"), SOY.d("5C3D211A010441")}, new String[]{SOY.d("98D8C6"), SOY.d("5C3D251F19120969")}, new String[]{SOY.d("98D8F4"), SOY.d("5C223404044C")}, new String[]{SOY.d("98D9D4"), SOY.d("5C213519004C")}, new String[]{SOY.d("98DED9"), SOY.d("5C3E32131D1B41")}, new String[]{SOY.d("98DED8"), SOY.d("5C2032131D1B41")}, new String[]{SOY.d("98DEDB"), SOY.d("5C3E371A1B180869")}, new String[]{SOY.d("98DEDA"), SOY.d("5C20371A1B180869")}, new String[]{SOY.d("98DEF8"), SOY.d("5C3E3018134C")}, new String[]{SOY.d("98DEFB"), SOY.d("5C203018134C")}, new String[]{SOY.d("98C5DB"), SOY.d("5C3E3E0C4F")}, new String[]{SOY.d("98CBF1"), SOY.d("5C21211710120969")}, new String[]{SOY.d("98CBF2"), SOY.d("5C313D03160441")}, new String[]{SOY.d("98CBF4"), SOY.d("5C3A341706030969")}, new String[]{SOY.d("98CBF7"), SOY.d("5C363817190441")}, new String[]{SOY.d("BFC0"), SOY.d("5C1D141A1D1041")}, new String[]{SOY.d("BFC1"), SOY.d("5C3D341A1D1041")}, new String[]{SOY.d("BFF2"), SOY.d("5C01321706181469")}, new String[]{SOY.d("BFF3"), SOY.d("5C21321706181469")}, new String[]{SOY.d("BFEA"), SOY.d("5C0B241B184C")}, new String[]{SOY.d("B1D4"), SOY.d("5C313804174C")}, new String[]{SOY.d("B1CE"), SOY.d("5C26381A101241")}, new String[]{SOY.d("98D2D3"), SOY.d("5C373F05044C")}, new String[]{SOY.d("98D2D2"), SOY.d("5C373C05044C")}, new String[]{SOY.d("98D2D8"), SOY.d("5C26391F1A040A69")}, new String[]{SOY.d("98D2DD"), SOY.d("5C2826181E4C")}, new String[]{SOY.d("98D2DC"), SOY.d("5C28261C4F")}, new String[]{SOY.d("98D2DF"), SOY.d("5C3E231B4F")}, new String[]{SOY.d("98D2DE"), SOY.d("5C203D1B4F")}, new String[]{SOY.d("98D2C2"), SOY.d("5C3C3517071F41")}, new String[]{SOY.d("98D2C5"), SOY.d("5C3F3517071F41")}, new String[]{SOY.d("98D2C9"), SOY.d("5C3E2207011841")}, new String[]{SOY.d("98D2C8"), SOY.d("5C202207011841")}, new String[]{SOY.d("98D2CB"), SOY.d("5C213307011841")}, new String[]{SOY.d("98D2CD"), SOY.d("5C3E3507011841")}, new String[]{SOY.d("98D2CC"), SOY.d("5C203507011841")}, new String[]{SOY.d("98D2CF"), SOY.d("5C303507011841")}, new String[]{SOY.d("98D2F1"), SOY.d("5C36301113120869")}, new String[]{SOY.d("98D2F0"), SOY.d("5C16301113120869")}, new String[]{SOY.d("98D2E1"), SOY.d("5C223404191E1669")}, new String[]{SOY.d("98D2E8"), SOY.d("5C3E221705021569")}, new String[]{SOY.d("98D2EB"), SOY.d("5C20221705021569")}, new String[]{SOY.d("98D0FD"), SOY.d("5C3724041B4C")}};
        f272 = strArr2;
        f273 = m374(strArr2);
        String[][] strArr3 = {new String[]{SOY.d("58"), SOY.d("5C232419004C")}, new String[]{SOY.d("5C"), SOY.d("5C333C064F")}, new String[]{SOY.d("46"), SOY.d("5C3E254D")}, new String[]{SOY.d("44"), SOY.d("5C35254D")}};
        f274 = strArr3;
        f275 = m374(strArr3);
        String[][] strArr4 = {new String[]{SOY.d("5D"), SOY.d("5C332119074C")}};
        f276 = strArr4;
        f277 = m374(strArr4);
        String[][] strArr5 = {new String[]{SOY.d("72"), SOY.d("2630")}, new String[]{SOY.d("70"), SOY.d("263C")}, new String[]{SOY.d("73"), SOY.d("2626")}, new String[]{SOY.d("76"), SOY.d("2634")}, new String[]{SOY.d("77"), SOY.d("2620")}};
        f278 = strArr5;
        f279 = m374(strArr5);
    }

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static String[][] m364() {
        return (String[][]) f276.clone();
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static String[][] m365() {
        return (String[][]) f277.clone();
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static String[][] m366() {
        return (String[][]) f274.clone();
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static String[][] m367() {
        return (String[][]) f275.clone();
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static String[][] m368() {
        return (String[][]) f272.clone();
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static String[][] m369() {
        return (String[][]) f273.clone();
    }

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public static String[][] m370() {
        return (String[][]) f270.clone();
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public static String[][] m371() {
        return (String[][]) f271.clone();
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public static String[][] m372() {
        return (String[][]) f278.clone();
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public static String[][] m373() {
        return (String[][]) f279.clone();
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    public static String[][] m374(String[][] strArr) {
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length, 2);
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i][0] = strArr[i][1];
            strArr2[i][1] = strArr[i][0];
        }
        return strArr2;
    }
}
