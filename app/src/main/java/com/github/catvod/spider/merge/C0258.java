package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.C0338;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ܐ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0258 extends C0469<C0367> {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    private InterfaceC0465 f648 = C0081.m330(C0258.class);

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    private Stack<C0019> f649 = new Stack<>();

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    private C0019 f650;

    public C0258(C0455 c0455) {
        this.f650 = C0019.m218(c0455);
        this.f649.push(C0019.m218(c0455).m226(this.f650));
    }

    /* JADX INFO: renamed from: ޗ, reason: contains not printable characters */
    private C0019 m919() {
        return this.f649.peek();
    }

    /* JADX INFO: renamed from: ޘ, reason: contains not printable characters */
    private void m920(C0455 c0455) {
        this.f649.peek().m225(c0455);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޙ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo933(C0338.C0339 c0339) {
        if (!SOY.d("547C").equals(c0339.mo404())) {
            return C0367.m1420(m919().m220());
        }
        HashSet hashSet = new HashSet();
        C0455 c0455 = new C0455();
        Iterator<C0011> it = m919().m220().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().mo170());
        }
        c0455.addAll(hashSet);
        return C0367.m1420(c0455);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޚ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo942(C0338.C0340 c0340) {
        if (C0459.m1697(c0340.f897.mo1252(), SOY.d("557D"))) {
            m919().m224();
        }
        return m402(c0340.m1381());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޛ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo931(C0338.C0341 c0341) {
        List<C0338.C0351> listM1382 = c0341.m1382();
        if (listM1382.size() == 1) {
            return m402(listM1382.get(0));
        }
        Double dM1423 = m402(listM1382.get(0)).m1423();
        String strMo404 = null;
        for (int i = 1; i < c0341.mo405(); i++) {
            InterfaceC0122 interfaceC0122Mo414 = c0341.mo414(i);
            if (interfaceC0122Mo414 instanceof C0338.C0351) {
                C0367 c0367M402 = m402(interfaceC0122Mo414);
                if (SOY.d("51").equals(strMo404)) {
                    dM1423 = Double.valueOf(dM1423.doubleValue() + c0367M402.m1423().doubleValue());
                } else {
                    if (!SOY.d("57").equals(strMo404)) {
                        throw new C0249(SOY.d("092B3F02150F5A3723041B055672") + c0341.mo404());
                    }
                    dM1423 = Double.valueOf(dM1423.doubleValue() - c0367M402.m1423().doubleValue());
                }
            } else {
                strMo404 = interfaceC0122Mo414.mo404();
            }
        }
        return C0367.m1420(dM1423);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޜ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo928(C0338.C0342 c0342) {
        List<C0338.C0344> listM1383 = c0342.m1383();
        if (listM1383.size() <= 1) {
            return m402(listM1383.get(0));
        }
        Boolean boolM1421 = m402(listM1383.get(0)).m1421();
        for (int i = 1; i < listM1383.size(); i++) {
            boolM1421 = Boolean.valueOf(boolM1421.booleanValue() & m402(listM1383.get(i)).m1421().booleanValue());
        }
        return C0367.m1420(boolM1421);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޝ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo922(C0338.C0343 c0343) {
        if (c0343.m1384() != null) {
            return C0182.m644(c0343.m1384().mo404()).mo134(m919().m220());
        }
        if (SOY.d("3A").equals(c0343.mo404())) {
            return C0367.m1420(null).m1428();
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޞ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo925(C0338.C0344 c0344) {
        List<C0338.C0360> listM1385 = c0344.m1385();
        if (listM1385.size() == 1) {
            return m402(listM1385.get(0));
        }
        if (listM1385.size() == 2) {
            C0367 c0367M402 = m402(listM1385.get(0));
            C0367 c0367M4022 = m402(listM1385.get(1));
            return SOY.d("47").equals(c0344.f899.mo1252()) ? c0367M402.m1439().equals(c0367M4022.m1439()) ? C0367.m1420(Boolean.valueOf(C0459.m1697(c0367M402, c0367M4022))) : C0367.m1420(Boolean.valueOf(C0459.m1697(c0367M402.m1427(), c0367M4022.m1427()))) : c0367M402.m1439().equals(c0367M4022.m1439()) ? C0367.m1420(Boolean.valueOf(!C0459.m1697(c0367M402, c0367M4022))) : C0367.m1420(Boolean.valueOf(!C0459.m1697(c0367M402.m1427(), c0367M4022.m1427())));
        }
        throw new C0249(SOY.d("1F20231906571F232417181E0E2B140E04055A3C3417064D") + c0344.mo404());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޟ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo935(C0338.C0345 c0345) {
        return m402(c0345.m1386());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޠ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo923(C0338.C0346 c0346) {
        return m402(c0346.m1387());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo924(C0338.C0347 c0347) {
        LinkedList linkedList = new LinkedList();
        C0367 c0367M402 = m402(c0347.m1389());
        for (C0338.C0345 c0345 : c0347.m1388()) {
            this.f649.push(C0019.m219(m919()));
            linkedList.add(m402(c0345));
            this.f649.pop();
        }
        return C0182.m642(c0367M402.m1427()).mo343(m919(), linkedList);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo937(C0338.C0348 c0348) {
        return m402(c0348.m1390());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޣ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo938(C0338.C0349 c0349) {
        return (c0349.m1392() == null || c0349.m1392().m1536()) ? m402(c0349.m1391()) : m402(c0349.m1392());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo930(C0338.C0350 c0350) {
        return m402(c0350.m1393());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo934(C0338.C0351 c0351) {
        if (c0351.m1394() == null || c0351.m1394().m1536()) {
            return m402(c0351.m1395());
        }
        C0367 c0367M402 = m402(c0351.m1395());
        C0367 c0367M4022 = m402(c0351.m1394());
        switch (c0351.f900.getType()) {
            case 17:
                return C0367.m1420(Double.valueOf(c0367M402.m1423().doubleValue() * c0367M4022.m1423().doubleValue()));
            case 18:
                return C0367.m1420(Double.valueOf(c0367M402.m1423().doubleValue() / c0367M4022.m1423().doubleValue()));
            case 19:
                return C0367.m1420(Double.valueOf(c0367M402.m1423().doubleValue() % c0367M4022.m1423().doubleValue()));
            default:
                throw new C0249(SOY.d("092B3F02150F5A3723041B055672") + c0351.mo404());
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ޱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo932(C0338.C0352 c0352) {
        return c0352.m1396() != null ? C0367.m1420(c0352.m1396().mo404()).m1430() : C0367.m1420(c0352.m1397().mo404()).m1430();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡠ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo936(C0338.C0353 c0353) {
        String strMo404 = c0353.mo404();
        String strD = SOY.d("50");
        if (strD.equals(strMo404)) {
            return C0367.m1420(strD).m1430();
        }
        if (c0353.m1399() != null && !c0353.m1399().m1536()) {
            return m402(c0353.m1399());
        }
        if (c0353.m1398() == null || c0353.m1398().m1536()) {
            return null;
        }
        return m402(c0353.m1398());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡡ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo946(C0338.C0354 c0354) {
        if (c0354.m1401() != null) {
            return m402(c0354.m1401());
        }
        if (c0354.m1400() != null) {
            return C0182.m643(c0354.m1400().mo404()).mo275(m919());
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo940(C0338.C0355 c0355) {
        List<C0338.C0342> listM1402 = c0355.m1402();
        if (listM1402.size() <= 1) {
            return m402(listM1402.get(0));
        }
        Boolean boolM1421 = m402(listM1402.get(0)).m1421();
        for (int i = 1; i < listM1402.size(); i++) {
            boolM1421 = Boolean.valueOf(boolM1421.booleanValue() | m402(listM1402.get(i)).m1421().booleanValue());
        }
        return C0367.m1420(boolM1421);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡣ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo944(C0338.C0356 c0356) {
        if (c0356.m1404() != null && !c0356.m1404().m1536()) {
            return m402(c0356.m1404());
        }
        InterfaceC0398 interfaceC0398 = c0356.f901;
        if (interfaceC0398 == null) {
            return m402(c0356.m1403());
        }
        if (SOY.d("557D").equals(interfaceC0398.mo1252())) {
            m919().m224();
        }
        return m402(c0356.m1405());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo929(C0338.C0357 c0357) {
        C0455 c0455 = new C0455();
        for (C0011 c0011 : m919().m220()) {
            this.f649.push(C0019.m217(c0011).m226(m919()));
            C0367 c0367M402 = m402(c0357.m1406());
            this.f649.pop();
            if (c0367M402.m1437()) {
                long jLongValue = c0367M402.m1426().longValue();
                String strD = SOY.d("300A0E22312F2E");
                if (jLongValue < 0) {
                    jLongValue = ((long) (C0459.m1697(c0011.m203(), strD) ? C0097.m355(c0011) : C0097.m357(c0011, m919()))) + jLongValue + 1;
                    if (jLongValue < 0) {
                        jLongValue = 1;
                    }
                }
                if (C0459.m1697(c0011.m203(), strD)) {
                    if (jLongValue == C0097.m355(c0011)) {
                        c0455.add(c0011);
                    }
                } else if (jLongValue == C0097.m354(c0011, m919())) {
                    c0455.add(c0011);
                }
            } else if (c0367M402.m1432()) {
                if (c0367M402.m1421().booleanValue()) {
                    c0455.add(c0011);
                }
            } else if (c0367M402.m1438()) {
                if (C0131.m443(c0367M402.m1427())) {
                    c0455.add(c0011);
                }
            } else if (!c0367M402.m1434()) {
                if (!c0367M402.m1436()) {
                    throw new C0249(SOY.d("0F3C3A181B001472340E04055A24301A4E") + c0367M402);
                }
                if (c0367M402.m1425().size() > 0) {
                    c0455.add(c0011);
                }
            } else if (c0367M402.m1424().size() > 0) {
                c0455.add(c0011);
            }
        }
        return C0367.m1420(c0455);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo926(C0338.C0358 c0358) {
        if (c0358.m1409() != null && !c0358.m1409().m1536()) {
            return m402(c0358.m1409());
        }
        if (c0358.m1410() != null && !c0358.m1410().m1536()) {
            return m402(c0358.m1410());
        }
        if (c0358.m1407() != null) {
            return C0367.m1420(c0358.m1407().mo404()).m1430();
        }
        if (c0358.m1408() != null) {
            return C0367.m1420(C0112.m392(c0358.m1408().mo404()));
        }
        throw new C0249(SOY.d("143D255607020A223E0400570C33231F151516370313121208373F15114D") + c0358.mo404());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo927(C0338.C0359 c0359) {
        List<C0338.C0352> listM1411 = c0359.m1411();
        if (listM1411 == null) {
            return null;
        }
        if (listM1411.size() <= 1) {
            return m402(listM1411.get(0));
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C0338.C0352> it = listM1411.iterator();
        while (it.hasNext()) {
            C0367 c0367M402 = m402(it.next());
            if (c0367M402 != null) {
                linkedList.add(c0367M402.m1427());
            }
        }
        return C0367.m1420(C0131.m444(linkedList, SOY.d("40")));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo943(C0338.C0360 c0360) {
        List<C0338.C0341> listM1412 = c0360.m1412();
        if (listM1412.size() == 1) {
            return m402(listM1412.get(0));
        }
        if (listM1412.size() != 2) {
            throw new C0249(SOY.d("1F20231906571F232417181E0E2B140E04055A3C3417064D") + c0360.mo404());
        }
        C0367 c0367M402 = m402(listM1412.get(0));
        C0367 c0367M4022 = m402(listM1412.get(1));
        switch (c0360.f902.getType()) {
            case 24:
                return C0367.m1420(Boolean.valueOf(c0367M402.compareTo(c0367M4022) < 0));
            case 25:
                return C0367.m1420(Boolean.valueOf(c0367M402.compareTo(c0367M4022) > 0));
            case 26:
                return C0367.m1420(Boolean.valueOf(c0367M402.compareTo(c0367M4022) <= 0));
            case 27:
                return C0367.m1420(Boolean.valueOf(c0367M402.compareTo(c0367M4022) >= 0));
            case 28:
            case 29:
            default:
                throw new C0249(SOY.d("0F3C3A181B0014723E0611051B263E04") + c0360.f902.mo1252());
            case 30:
                return C0367.m1420(Boolean.valueOf(c0367M402.m1427().startsWith(c0367M4022.m1427())));
            case 31:
                return C0367.m1420(Boolean.valueOf(c0367M402.m1427().endsWith(c0367M4022.m1427())));
            case 32:
                return C0367.m1420(Boolean.valueOf(c0367M402.m1427().contains(c0367M4022.m1427())));
            case 33:
                return C0367.m1420(Boolean.valueOf(c0367M402.m1427().matches(c0367M4022.m1427())));
            case 34:
                return C0367.m1420(Boolean.valueOf(!c0367M402.m1427().matches(c0367M4022.m1427())));
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo921(C0338.C0361 c0361) {
        C0367 c0367M402 = null;
        for (int i = 0; i < c0361.mo405(); i++) {
            InterfaceC0122 interfaceC0122Mo414 = c0361.mo414(i);
            if (interfaceC0122Mo414 instanceof C0338.C0362) {
                c0367M402 = m402(interfaceC0122Mo414);
                if (c0367M402.m1434()) {
                    m920(c0367M402.m1424());
                }
            } else {
                if (SOY.d("557D").equals(interfaceC0122Mo414.mo404())) {
                    m919().m224();
                } else {
                    m919().m223();
                }
            }
        }
        return c0367M402;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡩ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo945(C0338.C0362 c0362) {
        boolean z;
        C0367 c0367M402;
        if (c0362.m1413() != null && !c0362.m1413().m1536()) {
            return m402(c0362.m1413());
        }
        boolean z2 = false;
        if (c0362.m1414() == null || c0362.m1414().m1536() || (c0367M402 = m402(c0362.m1414())) == null) {
            z = false;
        } else {
            if (c0367M402.m1434()) {
                m920(c0367M402.m1424());
            } else if (c0367M402.m1431()) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (c0362.m1415() != null && !c0362.m1415().m1536()) {
            C0367 c0367M4022 = m402(c0362.m1415());
            if (z2) {
                C0455 c0455M220 = m919().m220();
                String strM1427 = c0367M4022.m1427();
                if (!m919().m222()) {
                    if (c0455M220.size() == 1) {
                        return C0367.m1420(m919().m227().mo117(strM1427));
                    }
                    LinkedList linkedList = new LinkedList();
                    Iterator<C0011> it = c0455M220.iterator();
                    while (it.hasNext()) {
                        linkedList.add(it.next().mo117(strM1427));
                    }
                    return C0367.m1420(linkedList);
                }
                int size = c0455M220.size();
                String strD = SOY.d("27");
                String strD2 = SOY.d("21");
                if (size == 1) {
                    C0455 c0455M199 = m919().m227().m199(strD2 + strM1427 + strD);
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<C0011> it2 = c0455M199.iterator();
                    while (it2.hasNext()) {
                        linkedList2.add(it2.next().mo117(strM1427));
                    }
                    return C0367.m1420(linkedList2);
                }
                C0455 c0455 = new C0455();
                Iterator<C0011> it3 = c0455M220.iterator();
                while (it3.hasNext()) {
                    c0455.addAll(it3.next().m199(strD2 + strM1427 + strD));
                }
                LinkedList linkedList3 = new LinkedList();
                Iterator<C0011> it4 = c0455.iterator();
                while (it4.hasNext()) {
                    linkedList3.add(it4.next().mo117(strM1427));
                }
                return C0367.m1420(linkedList3);
            }
            if (c0367M4022.m1435()) {
                String strM14272 = c0367M4022.m1427();
                C0455 c0455M2202 = m919().m220();
                if (m919().m222()) {
                    m920(c0455M2202.m1692(strM14272));
                } else {
                    C0455 c04552 = new C0455();
                    for (C0011 c0011 : m919().m220()) {
                        String strD3 = SOY.d("50");
                        if (!z) {
                            for (C0011 c00112 : c0011.m179()) {
                                if (c00112.mo122().equals(strM14272) || strD3.equals(strM14272)) {
                                    c04552.add(c00112);
                                }
                            }
                        } else if (c0011.mo122().equals(strM14272) || strD3.equals(strM14272)) {
                            c04552.add(c0011);
                        }
                    }
                    m920(c04552);
                }
            } else {
                if (!c0367M4022.m1434()) {
                    return c0367M4022;
                }
                m920(c0367M4022.m1424());
            }
        }
        if (c0362.m1416() != null && c0362.m1416().size() > 0) {
            Iterator<C0338.C0357> it5 = c0362.m1416().iterator();
            while (it5.hasNext()) {
                m920(m402(it5.next()).m1424());
            }
        }
        return C0367.m1420(m919().m220());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࡪ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo939(C0338.C0363 c0363) {
        C0367 c0367M402 = m402(c0363.m1417());
        return c0363.f904 == null ? c0367M402 : C0367.m1420(Double.valueOf(-c0367M402.m1423().doubleValue()));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0380
    /* JADX INFO: renamed from: ࢠ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C0367 mo941(C0338.C0364 c0364) {
        if (c0364.m1418() == null && !c0364.m1418().m1536()) {
            return m402(c0364.m1419());
        }
        C0367 c0367M402 = m402(c0364.m1418());
        if (c0364.f905 == null) {
            return c0367M402;
        }
        this.f649.push(C0019.m219(m919().m221()));
        C0367 c0367M4022 = m402(c0364.m1419());
        this.f649.pop();
        boolean zM1434 = c0367M402.m1434();
        String strD = SOY.d("2C");
        if (zM1434) {
            if (c0367M4022.m1434()) {
                c0367M402.m1424().addAll(c0367M4022.m1424());
            } else {
                C0011 c0011 = new C0011(strD);
                c0011.m174(c0367M4022.m1427());
                c0367M402.m1424().add(c0011);
            }
            return c0367M402;
        }
        if (c0367M402.m1438()) {
            if (c0367M4022.m1434()) {
                C0011 c00112 = new C0011(strD);
                c00112.m174(c0367M402.m1427());
                c0367M4022.m1424().add(c00112);
                return c0367M4022;
            }
            return C0367.m1420(c0367M402.m1427() + c0367M4022.m1427());
        }
        boolean zM1432 = c0367M402.m1432();
        String strD2 = SOY.d("5624301A464A");
        String strD3 = SOY.d("19333F561A180E723C1306101F722717184647");
        if (zM1432) {
            if (c0367M4022.m1432()) {
                return C0367.m1420(Boolean.valueOf(c0367M4022.m1421().booleanValue() | c0367M402.m1421().booleanValue()));
            }
            if (c0367M4022.m1434()) {
                C0011 c00113 = new C0011(strD);
                c00113.m174(c0367M402.m1427());
                c0367M4022.m1424().add(c00113);
                return c0367M4022;
            }
            if (c0367M4022.m1438()) {
                return C0367.m1420(c0367M402.m1421() + c0367M4022.m1427());
            }
            throw new C0227(strD3 + c0367M402.m1421() + strD2 + c0367M4022.m1427());
        }
        if (!c0367M402.m1437()) {
            LinkedList linkedList = new LinkedList();
            if (C0131.m443(c0367M402.m1427())) {
                linkedList.add(c0367M402.m1427());
            }
            if (C0131.m443(c0367M4022.m1427())) {
                linkedList.add(c0367M4022.m1427());
            }
            return C0367.m1420(C0131.m444(linkedList, SOY.d("56")));
        }
        if (c0367M4022.m1438()) {
            return C0367.m1420(c0367M402.m1423() + c0367M4022.m1427());
        }
        if (c0367M4022.m1434()) {
            C0011 c00114 = new C0011(strD);
            c00114.m174(c0367M402.m1427());
            c0367M4022.m1424().add(c00114);
            return c0367M4022;
        }
        throw new C0227(strD3 + c0367M402.m1423() + strD2 + c0367M4022.m1427());
    }
}
