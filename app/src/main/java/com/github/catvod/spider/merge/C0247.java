package com.github.catvod.spider.merge;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ڈ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0247 implements InterfaceC0366 {

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ڈ$Ϳ, reason: contains not printable characters */
    class C0248 implements InterfaceC0539 {

        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        final /* synthetic */ Map f632;

        /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
        final /* synthetic */ C0455 f633;

        C0248(Map map, C0455 c0455) {
            this.f632 = map;
            this.f633 = c0455;
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ϳ */
        public void mo207(AbstractC0191 abstractC0191, int i) {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0539
        /* JADX INFO: renamed from: Ԩ */
        public void mo208(AbstractC0191 abstractC0191, int i) {
            Integer numValueOf;
            if (abstractC0191 instanceof C0016) {
                C0016 c0016 = (C0016) abstractC0191;
                String str = i + SOY.d("25") + c0016.mo170().hashCode();
                Integer num = (Integer) this.f632.get(str);
                if (num == null) {
                    numValueOf = 1;
                    this.f632.put(str, numValueOf);
                } else {
                    numValueOf = Integer.valueOf(num.intValue() + 1);
                    this.f632.put(str, numValueOf);
                }
                C0011 c0011 = new C0011(SOY.d("300A0E22312F2E"));
                c0011.mo205(c0016.m213());
                try {
                    Method declaredMethod = AbstractC0191.class.getDeclaredMethod(SOY.d("A4C9"), AbstractC0191.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(c0011, c0016.mo170());
                } catch (Exception unused) {
                }
                C0097.m358(c0011, numValueOf.intValue());
                this.f633.add(c0011);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    public String name() {
        return SOY.d("0E372902");
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0366
    /* JADX INFO: renamed from: Ϳ */
    public C0367 mo275(C0019 c0019) {
        C0455 c0455M220 = c0019.m220();
        C0455 c0455 = new C0455();
        if (c0455M220 != null && c0455M220.size() > 0) {
            if (c0019.m222()) {
                Iterator<C0011> it = c0455M220.iterator();
                while (it.hasNext()) {
                    C0088.m352(new C0248(new HashMap(), c0455), it.next());
                }
            } else {
                for (C0011 c0011 : c0455M220) {
                    boolean zEquals = SOY.d("0931231F0403").equals(c0011.mo122());
                    String strD = SOY.d("300A0E22312F2E");
                    if (zEquals) {
                        C0011 c00112 = new C0011(strD);
                        c00112.mo205(c0011.m181());
                        C0097.m358(c00112, 1);
                        c0455.add(c00112);
                    } else {
                        List<C0016> listM206 = c0011.m206();
                        int i = 0;
                        while (i < listM206.size()) {
                            C0016 c0016 = listM206.get(i);
                            C0011 c00113 = new C0011(strD);
                            c00113.mo205(c0016.m213());
                            i++;
                            C0097.m358(c00113, i);
                            c0455.add(c00113);
                        }
                    }
                }
            }
        }
        return C0367.m1420(c0455);
    }
}
