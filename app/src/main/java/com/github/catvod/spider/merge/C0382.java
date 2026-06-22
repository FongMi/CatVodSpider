package com.github.catvod.spider.merge;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ࡠ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0382 implements InterfaceC0314 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected boolean f938 = false;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected int f939 = -1;

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected C0245 f940;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected C0391 f941;

    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    protected int f942;

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: Ϳ */
    public InterfaceC0398 mo729(AbstractC0389 abstractC0389) {
        InterfaceC0398 interfaceC0398M1463 = m1463(abstractC0389);
        if (interfaceC0398M1463 != null) {
            abstractC0389.m1491();
            return interfaceC0398M1463;
        }
        if (m1464(abstractC0389)) {
            return m1454(abstractC0389);
        }
        if (this.f941 == null) {
            throw new C0384(abstractC0389);
        }
        throw new C0384(abstractC0389, this.f942, this.f941);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: Ԩ */
    public void mo1204(AbstractC0389 abstractC0389) {
        m1450(abstractC0389);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: ԩ */
    public void mo730(AbstractC0389 abstractC0389, C0393 c0393) {
        C0245 c0245;
        if (this.f939 == abstractC0389.m1500().mo1215() && (c0245 = this.f940) != null && c0245.m895(abstractC0389.m1532())) {
            abstractC0389.m1491();
        }
        this.f939 = abstractC0389.m1500().mo1215();
        if (this.f940 == null) {
            this.f940 = new C0245(new int[0]);
        }
        this.f940.m890(abstractC0389.m1532());
        m1449(abstractC0389, m1452(abstractC0389));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: Ԫ */
    public void mo1205(AbstractC0389 abstractC0389) {
        m1450(abstractC0389);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: ԫ */
    public void mo1206(AbstractC0389 abstractC0389, C0393 c0393) {
        if (mo1207(abstractC0389)) {
            return;
        }
        m1448(abstractC0389);
        if (c0393 instanceof C0388) {
            m1461(abstractC0389, (C0388) c0393);
            return;
        }
        if (c0393 instanceof C0384) {
            m1459(abstractC0389, (C0384) c0393);
            return;
        }
        if (c0393 instanceof C0383) {
            m1458(abstractC0389, (C0383) c0393);
            return;
        }
        System.err.println(SOY.d("0F3C3A181B001472231317181D3C38021D181472340406180872250F04124072") + c0393.getClass().getName());
        abstractC0389.m1504(c0393.m1525(), c0393.getMessage(), c0393);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: Ԭ */
    public boolean mo1207(AbstractC0389 abstractC0389) {
        return this.f938;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0314
    /* JADX INFO: renamed from: ԭ */
    public void mo1208(AbstractC0389 abstractC0389) {
        AbstractC0419 abstractC0419 = abstractC0389.m1531().f1038.f994.get(abstractC0389.m1532());
        if (mo1207(abstractC0389)) {
            return;
        }
        int iMo1214 = abstractC0389.m1500().mo1214(1);
        C0245 c0245M1549 = abstractC0389.mo1348().m1549(abstractC0419);
        if (c0245M1549.m895(iMo1214)) {
            this.f941 = null;
            this.f942 = -1;
            return;
        }
        if (c0245M1549.m895(-2)) {
            if (this.f941 == null) {
                this.f941 = abstractC0389.m1497();
                this.f942 = abstractC0389.m1532();
                return;
            }
            return;
        }
        int iMo1597 = abstractC0419.mo1597();
        if (iMo1597 != 3 && iMo1597 != 4 && iMo1597 != 5) {
            switch (iMo1597) {
                case 9:
                case 11:
                    m1462(abstractC0389);
                    m1449(abstractC0389, abstractC0389.m1499().m898(m1452(abstractC0389)));
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m1463(abstractC0389) == null) {
            throw new C0384(abstractC0389);
        }
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    protected void m1448(AbstractC0389 abstractC0389) {
        this.f938 = true;
    }

    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    protected void m1449(AbstractC0389 abstractC0389, C0245 c0245) {
        int iMo1214 = abstractC0389.m1500().mo1214(1);
        while (iMo1214 != -1 && !c0245.m895(iMo1214)) {
            abstractC0389.m1491();
            iMo1214 = abstractC0389.m1500().mo1214(1);
        }
    }

    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    protected void m1450(AbstractC0389 abstractC0389) {
        this.f938 = false;
        this.f940 = null;
        this.f939 = -1;
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected String m1451(String str) {
        String strReplace = str.replace(SOY.d("70"), SOY.d("263C")).replace(SOY.d("77"), SOY.d("2620")).replace(SOY.d("73"), SOY.d("2626"));
        StringBuilder sb = new StringBuilder();
        String strD = SOY.d("5D");
        sb.append(strD);
        sb.append(strReplace);
        sb.append(strD);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected C0245 m1452(AbstractC0389 abstractC0389) {
        C0405 c0405 = abstractC0389.m1531().f1038;
        C0245 c0245 = new C0245(new int[0]);
        for (C0396 c0396 = abstractC0389.f964; c0396 != null; c0396 = c0396.f986) {
            int i = c0396.f987;
            if (i < 0) {
                break;
            }
            c0245.m893(c0405.m1549(((C0560) c0405.f994.get(i).m1601(0)).f1248));
        }
        c0245.m899(-2);
        return c0245;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    protected C0245 m1453(AbstractC0389 abstractC0389) {
        return abstractC0389.m1499();
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected InterfaceC0398 m1454(AbstractC0389 abstractC0389) {
        String strD;
        InterfaceC0398 interfaceC0398M1498 = abstractC0389.m1498();
        C0245 c0245M1453 = m1453(abstractC0389);
        int iM897 = !c0245M1453.mo889() ? c0245M1453.m897() : 0;
        if (iM897 == -1) {
            strD = SOY.d("463F3805071E143571333B3144");
        } else {
            strD = SOY.d("463F3805071E143571") + abstractC0389.mo1350().mo1543(iM897) + SOY.d("44");
        }
        String str = strD;
        InterfaceC0398 interfaceC0398Mo1213 = abstractC0389.m1500().mo1213(-1);
        if (interfaceC0398M1498.getType() == -1 && interfaceC0398Mo1213 != null) {
            interfaceC0398M1498 = interfaceC0398Mo1213;
        }
        return abstractC0389.m1487().mo1262(new C0123<>(interfaceC0398M1498.mo1254(), interfaceC0398M1498.mo1254().mo1466()), iM897, str, 0, -1, -1, interfaceC0398M1498.mo1253(), interfaceC0398M1498.mo1251());
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    protected String m1455(InterfaceC0398 interfaceC0398) {
        return interfaceC0398.mo1252();
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected int m1456(InterfaceC0398 interfaceC0398) {
        return interfaceC0398.getType();
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected String m1457(InterfaceC0398 interfaceC0398) {
        if (interfaceC0398 == null) {
            return SOY.d("463C3E56001811373F48");
        }
        String strM1455 = m1455(interfaceC0398);
        if (strM1455 == null) {
            if (m1456(interfaceC0398) == -1) {
                strM1455 = SOY.d("46171E304A");
            } else {
                strM1455 = SOY.d("46") + m1456(interfaceC0398) + SOY.d("44");
            }
        }
        return m1451(strM1455);
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    protected void m1458(AbstractC0389 abstractC0389, C0383 c0383) {
        abstractC0389.m1504(c0383.m1525(), SOY.d("08273D1354") + abstractC0389.mo1349()[abstractC0389.f964.mo1378()] + SOY.d("5A") + c0383.getMessage(), c0383);
    }

    /* JADX INFO: renamed from: އ, reason: contains not printable characters */
    protected void m1459(AbstractC0389 abstractC0389, C0384 c0384) {
        abstractC0389.m1504(c0384.m1525(), SOY.d("173B221B1503193A3412541E1422240254") + m1457(c0384.m1525()) + SOY.d("5A37290611140E3B3F1154") + c0384.m1523().m903(abstractC0389.mo1350()), c0384);
    }

    /* JADX INFO: renamed from: ވ, reason: contains not printable characters */
    protected void m1460(AbstractC0389 abstractC0389) {
        if (mo1207(abstractC0389)) {
            return;
        }
        m1448(abstractC0389);
        InterfaceC0398 interfaceC0398M1498 = abstractC0389.m1498();
        abstractC0389.m1504(interfaceC0398M1498, SOY.d("173B22051D191D72") + m1453(abstractC0389).m903(abstractC0389.mo1350()) + SOY.d("5A332556") + m1457(interfaceC0398M1498), null);
    }

    /* JADX INFO: renamed from: މ, reason: contains not printable characters */
    protected void m1461(AbstractC0389 abstractC0389, C0388 c0388) {
        InterfaceC0401 interfaceC0401M1500 = abstractC0389.m1500();
        abstractC0389.m1504(c0388.m1525(), SOY.d("143D71001D16183E3456151B0E37231815031324345615035A3B3F0601035A") + m1451(interfaceC0401M1500 != null ? c0388.m1486().getType() == -1 ? SOY.d("46171E304A") : interfaceC0401M1500.mo1210(c0388.m1486(), c0388.m1525()) : SOY.d("46273F1D1A180D3C711F1A070F266F")), c0388);
    }

    /* JADX INFO: renamed from: ފ, reason: contains not printable characters */
    protected void m1462(AbstractC0389 abstractC0389) {
        if (mo1207(abstractC0389)) {
            return;
        }
        m1448(abstractC0389);
        InterfaceC0398 interfaceC0398M1498 = abstractC0389.m1498();
        abstractC0389.m1504(interfaceC0398M1498, SOY.d("1F2A250415191F3D2405541E1422240254") + m1457(interfaceC0398M1498) + SOY.d("5A37290611140E3B3F1154") + m1453(abstractC0389).m903(abstractC0389.mo1350()), null);
    }

    /* JADX INFO: renamed from: ދ, reason: contains not printable characters */
    protected InterfaceC0398 m1463(AbstractC0389 abstractC0389) {
        if (!m1453(abstractC0389).m895(abstractC0389.m1500().mo1214(2))) {
            return null;
        }
        m1462(abstractC0389);
        abstractC0389.m1491();
        InterfaceC0398 interfaceC0398M1498 = abstractC0389.m1498();
        mo1204(abstractC0389);
        return interfaceC0398M1498;
    }

    /* JADX INFO: renamed from: ތ, reason: contains not printable characters */
    protected boolean m1464(AbstractC0389 abstractC0389) {
        if (!abstractC0389.m1531().f1038.m1550(abstractC0389.m1531().f1038.f994.get(abstractC0389.m1532()).m1601(0).f1263, abstractC0389.f964).m895(abstractC0389.m1500().mo1214(1))) {
            return false;
        }
        m1460(abstractC0389);
        return true;
    }
}
