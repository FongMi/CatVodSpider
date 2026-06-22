package com.github.catvod.spider.merge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ଽ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0440 implements InterfaceC0174 {
    @Override // com.github.catvod.spider.merge.InterfaceC0174
    public String name() {
        return SOY.d("1C3D231B15035736300211");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0174
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo343(C0019 c0019, List<C0367> list) {
        String strM1427 = list.get(0).m1427();
        String strM14272 = list.get(1).m1427();
        try {
            return (list.size() <= 2 || list.get(2) == null) ? C0367.m1420(C0276.m1024(strM14272).m1026(strM1427)) : C0367.m1420(new SimpleDateFormat(strM14272, Locale.forLanguageTag(list.get(2).m1427())).parse(strM1427));
        } catch (ParseException e) {
            throw new C0249(SOY.d("1E332513541115203C1700571F2A32130403133D3F57"), e);
        }
    }
}
