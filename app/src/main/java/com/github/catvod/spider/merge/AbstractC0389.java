package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡧ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public abstract class AbstractC0389 extends AbstractC0394<InterfaceC0398, C0547> {

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    private static final Map<String, C0405> f960 = new WeakHashMap();

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected InterfaceC0314 f961 = new C0382();

    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    protected InterfaceC0401 f962;

    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    protected final C0124 f963;

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected C0391 f964;

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected boolean f965;

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    private C0390 f966;

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected List<InterfaceC0189> f967;

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected int f968;

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected boolean f969;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡧ$Ϳ, reason: contains not printable characters */
    public class C0390 implements InterfaceC0189 {
        public C0390() {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0189
        /* JADX INFO: renamed from: Ϳ */
        public void mo676(InterfaceC0375 interfaceC0375) {
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0189
        /* JADX INFO: renamed from: Ԩ */
        public void mo677(InterfaceC0104 interfaceC0104) {
            System.out.println(SOY.d("193D3F05011A1F72") + interfaceC0104.mo381() + SOY.d("5A20241A1157") + AbstractC0389.this.mo1349()[AbstractC0389.this.f964.mo1378()]);
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0189
        /* JADX INFO: renamed from: ފ */
        public void mo678(C0391 c0391) {
            System.out.println(SOY.d("1F3C251306575A72") + AbstractC0389.this.mo1349()[c0391.mo1378()] + SOY.d("56721D225C46536F") + AbstractC0389.this.f962.mo1213(1).mo1252());
        }

        @Override // com.github.catvod.spider.merge.InterfaceC0189
        /* JADX INFO: renamed from: ޓ */
        public void mo679(C0391 c0391) {
            System.out.println(SOY.d("1F2A380254575A72") + AbstractC0389.this.mo1349()[c0391.mo1378()] + SOY.d("56721D225C46536F") + AbstractC0389.this.f962.mo1213(1).mo1252());
        }
    }

    public AbstractC0389(InterfaceC0401 interfaceC0401) {
        C0124 c0124 = new C0124();
        this.f963 = c0124;
        c0124.m417(0);
        this.f965 = true;
        m1508(interfaceC0401);
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public InterfaceC0399<?> m1487() {
        return this.f962.mo1212().mo1468();
    }

    @Override // com.github.catvod.spider.merge.AbstractC0394
    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    public boolean mo1488(C0396 c0396, int i) {
        return i >= this.f963.m415();
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected void m1489() {
        C0391 c0391 = this.f964;
        C0391 c03912 = (C0391) c0391.f986;
        if (c03912 != null) {
            c03912.m1514(c0391);
        }
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    public void m1490(InterfaceC0189 interfaceC0189) {
        if (interfaceC0189 == null) {
            throw new NullPointerException(SOY.d("163B220211191F20"));
        }
        if (this.f967 == null) {
            this.f967 = new ArrayList();
        }
        this.f967.add(interfaceC0189);
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    public InterfaceC0398 m1491() {
        InterfaceC0398 interfaceC0398M1498 = m1498();
        if (interfaceC0398M1498.getType() != -1) {
            m1500().mo1217();
        }
        List<InterfaceC0189> list = this.f967;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        if (this.f965 || z) {
            if (this.f961.mo1207(this)) {
                C0391 c0391 = this.f964;
                InterfaceC0375 interfaceC0375M1516 = c0391.m1516(m1492(c0391, interfaceC0398M1498));
                List<InterfaceC0189> list2 = this.f967;
                if (list2 != null) {
                    Iterator<InterfaceC0189> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next().mo676(interfaceC0375M1516);
                    }
                }
            } else {
                C0391 c03912 = this.f964;
                InterfaceC0104 interfaceC0104M1515 = c03912.m1515(m1493(c03912, interfaceC0398M1498));
                List<InterfaceC0189> list3 = this.f967;
                if (list3 != null) {
                    Iterator<InterfaceC0189> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo677(interfaceC0104M1515);
                    }
                }
            }
        }
        return interfaceC0398M1498;
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    public InterfaceC0375 m1492(C0391 c0391, InterfaceC0398 interfaceC0398) {
        return new C0113(interfaceC0398);
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    public InterfaceC0104 m1493(C0391 c0391, InterfaceC0398 interfaceC0398) {
        return new C0116(interfaceC0398);
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    public void m1494(C0391 c0391, int i) {
        C0391 c03912;
        C0391 c03913;
        c0391.m1537(i);
        if (this.f965 && (c03912 = this.f964) != c0391 && (c03913 = (C0391) c03912.f986) != null) {
            c03913.m1522();
            c03913.m1514(c0391);
        }
        this.f964 = c0391;
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    public void m1495(C0391 c0391, int i, int i2) {
        m1534(i);
        this.f964 = c0391;
        c0391.f972 = this.f962.mo1213(1);
        if (this.f965) {
            m1489();
        }
        if (this.f967 != null) {
            m1511();
        }
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    public void m1496() {
        if (this.f969) {
            this.f964.f973 = this.f962.mo1213(1);
        } else {
            this.f964.f973 = this.f962.mo1213(-1);
        }
        if (this.f967 != null) {
            m1512();
        }
        m1534(this.f964.f987);
        this.f964 = (C0391) this.f964.f986;
    }

    /* JADX INFO: renamed from: ލ, reason: contains not printable characters */
    public C0391 m1497() {
        return this.f964;
    }

    /* JADX INFO: renamed from: ގ, reason: contains not printable characters */
    public InterfaceC0398 m1498() {
        return this.f962.mo1213(1);
    }

    /* JADX INFO: renamed from: ޏ, reason: contains not printable characters */
    public C0245 m1499() {
        return mo1348().m1547(m1532(), m1497());
    }

    /* JADX INFO: renamed from: ސ, reason: contains not printable characters */
    public InterfaceC0401 m1500() {
        return m1502();
    }

    /* JADX INFO: renamed from: ޑ, reason: contains not printable characters */
    public final int m1501() {
        if (this.f963.m1616()) {
            return -1;
        }
        return this.f963.m415();
    }

    /* JADX INFO: renamed from: ޒ, reason: contains not printable characters */
    public InterfaceC0401 m1502() {
        return this.f962;
    }

    /* JADX INFO: renamed from: ޓ, reason: contains not printable characters */
    public InterfaceC0398 m1503(int i) {
        InterfaceC0398 interfaceC0398M1498 = m1498();
        if (interfaceC0398M1498.getType() == i) {
            if (i == -1) {
                this.f969 = true;
            }
            this.f961.mo1204(this);
            m1491();
        } else {
            interfaceC0398M1498 = this.f961.mo729(this);
            if (this.f965 && interfaceC0398M1498.mo1255() == -1) {
                C0391 c0391 = this.f964;
                c0391.m1516(m1492(c0391, interfaceC0398M1498));
            }
        }
        return interfaceC0398M1498;
    }

    /* JADX INFO: renamed from: ޔ, reason: contains not printable characters */
    public void m1504(InterfaceC0398 interfaceC0398, String str, C0393 c0393) {
        this.f968++;
        m1529().mo1202(this, interfaceC0398, interfaceC0398.mo1253(), interfaceC0398.mo1251(), str, c0393);
    }

    /* JADX INFO: renamed from: ޕ, reason: contains not printable characters */
    public void m1505(InterfaceC0189 interfaceC0189) {
        List<InterfaceC0189> list = this.f967;
        if (list != null && list.remove(interfaceC0189) && this.f967.isEmpty()) {
            this.f967 = null;
        }
    }

    /* JADX INFO: renamed from: ޖ, reason: contains not printable characters */
    public void m1506() {
        if (m1500() != null) {
            m1500().mo1211(0);
        }
        this.f961.mo1205(this);
        this.f964 = null;
        this.f968 = 0;
        this.f969 = false;
        m1510(false);
        this.f963.m1614();
        this.f963.m417(0);
        C0547 c0547M1531 = m1531();
        if (c0547M1531 != null) {
            c0547M1531.mo1593();
        }
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    public void m1507(InterfaceC0314 interfaceC0314) {
        this.f961 = interfaceC0314;
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    public final void m1508(InterfaceC0385 interfaceC0385) {
        m1509((InterfaceC0401) interfaceC0385);
    }

    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters */
    public void m1509(InterfaceC0401 interfaceC0401) {
        this.f962 = null;
        m1506();
        this.f962 = interfaceC0401;
    }

    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters */
    public void m1510(boolean z) {
        if (!z) {
            m1505(this.f966);
            this.f966 = null;
            return;
        }
        C0390 c0390 = this.f966;
        if (c0390 != null) {
            m1505(c0390);
        } else {
            this.f966 = new C0390();
        }
        m1490(this.f966);
    }

    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters */
    protected void m1511() {
        for (InterfaceC0189 interfaceC0189 : this.f967) {
            interfaceC0189.mo678(this.f964);
            this.f964.mo1379(interfaceC0189);
        }
    }

    /* JADX INFO: renamed from: ޜ, reason: contains not printable characters */
    protected void m1512() {
        for (int size = this.f967.size() - 1; size >= 0; size--) {
            InterfaceC0189 interfaceC0189 = this.f967.get(size);
            this.f964.mo1380(interfaceC0189);
            interfaceC0189.mo679(this.f964);
        }
    }
}
