package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ʏ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0097 {
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public static C0455 m353(C0011 c0011) {
        C0455 c0455 = new C0455();
        for (C0011 c0011M192 = c0011.m192(); c0011M192 != null; c0011M192 = c0011M192.m192()) {
            c0455.add(c0011M192);
        }
        if (c0455.size() > 0) {
            return c0455;
        }
        return null;
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public static int m354(C0011 c0011, C0019 c0019) {
        int i = 1;
        for (C0011 c00112 : c0011.mo170().m179()) {
            if (c0011.m203().equals(c00112.m203()) && c0019.m220().contains(c00112)) {
                if (c0011.equals(c00112)) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public static int m355(C0011 c0011) {
        String strMo117 = c0011.mo117(SOY.d("3F1E0E25353A3F0D05373328331C15332C28311708"));
        if (C0131.m441(strMo117)) {
            return -1;
        }
        return Integer.parseInt(strMo117);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public static C0455 m356(C0011 c0011) {
        C0455 c0455 = new C0455();
        for (C0011 c0011M197 = c0011.m197(); c0011M197 != null; c0011M197 = c0011M197.m197()) {
            c0455.add(c0011M197);
        }
        if (c0455.size() > 0) {
            return c0455;
        }
        return null;
    }

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public static int m357(C0011 c0011, C0019 c0019) {
        C0455 c0455 = new C0455();
        for (C0011 c00112 : c0011.mo170().m186(c0011.m203())) {
            if (c0019.m220().contains(c00112)) {
                c0455.add(c00112);
            }
        }
        return c0455.size();
    }

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public static void m358(C0011 c0011, int i) {
        if (c0011 == null) {
            return;
        }
        c0011.m175(SOY.d("3F1E0E25353A3F0D05373328331C15332C28311708"), String.valueOf(i));
    }
}
