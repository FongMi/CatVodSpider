package com.github.catvod.spider.merge.F1;

import com.github.catvod.spider.merge.m1.C1317i;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class s {
    public static List<C1317i> a(com.github.catvod.spider.merge.D0.c cVar) throws com.github.catvod.spider.merge.p1.i {
        String strR;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = cVar.iterator();
        while (it.hasNext()) {
            com.github.catvod.spider.merge.D0.e eVar = (com.github.catvod.spider.merge.D0.e) it.next();
            if (eVar.containsKey("itemSectionRenderer")) {
                for (com.github.catvod.spider.merge.D0.e eVar2 : eVar.g("itemSectionRenderer").b("contents")) {
                    if (eVar2.containsKey("infoPanelContentRenderer")) {
                        com.github.catvod.spider.merge.D0.e eVarG = eVar2.g("infoPanelContentRenderer");
                        C1317i c1317i = new C1317i();
                        StringBuilder sb = new StringBuilder();
                        for (Object obj : eVarG.b("paragraphs")) {
                            if (sb.length() != 0) {
                                sb.append("<br>");
                            }
                            sb.append(B.o((com.github.catvod.spider.merge.D0.e) obj, false));
                        }
                        if (eVarG.containsKey("sourceEndpoint")) {
                            try {
                                String strB = B.b(B.r(eVarG.g("sourceEndpoint")));
                                strB.getClass();
                                c1317i.a(new URL(strB));
                                String strO = B.o(eVarG.g(eVarG.containsKey("inlineSource") ? "inlineSource" : "disclaimer"), false);
                                if (com.github.catvod.spider.merge.L1.m.j(strO)) {
                                    throw new com.github.catvod.spider.merge.p1.i("Could not get metadata info link text.");
                                }
                                c1317i.b(strO);
                            } catch (NullPointerException | MalformedURLException e) {
                                throw new com.github.catvod.spider.merge.p1.i("Could not get metadata info URL", e);
                            }
                        }
                        arrayList.add(c1317i);
                    }
                    if (eVar2.containsKey("clarificationRenderer")) {
                        com.github.catvod.spider.merge.D0.e eVarG2 = eVar2.g("clarificationRenderer");
                        C1317i c1317i2 = new C1317i();
                        String strO2 = B.o(eVarG2.g("contentTitle"), false);
                        String strO3 = B.o(eVarG2.g("text"), false);
                        if (strO2 == null || strO3 == null) {
                            throw new com.github.catvod.spider.merge.p1.i("Could not extract clarification renderer content");
                        }
                        if (eVarG2.containsKey("actionButton")) {
                            com.github.catvod.spider.merge.D0.e eVarG3 = eVarG2.g("actionButton").g("buttonRenderer");
                            try {
                                String strB2 = B.b(B.r(eVarG3.g("command")));
                                strB2.getClass();
                                c1317i2.a(new URL(strB2));
                                String strO4 = B.o(eVarG3.g("text"), false);
                                if (com.github.catvod.spider.merge.L1.m.j(strO4)) {
                                    throw new com.github.catvod.spider.merge.p1.i("Could not get metadata info link text.");
                                }
                                c1317i2.b(strO4);
                            } catch (NullPointerException | MalformedURLException e2) {
                                throw new com.github.catvod.spider.merge.p1.i("Could not get metadata info URL", e2);
                            }
                        }
                        if (eVarG2.containsKey("secondaryEndpoint") && eVarG2.containsKey("secondarySource") && (strR = B.r(eVarG2.g("secondaryEndpoint"))) != null && !B.w(strR)) {
                            try {
                                c1317i2.a(new URL(strR));
                                String strO5 = B.o(eVarG2.g("secondarySource"), false);
                                if (strO5 != null) {
                                    strR = strO5;
                                }
                                c1317i2.b(strR);
                            } catch (MalformedURLException e3) {
                                throw new com.github.catvod.spider.merge.p1.i("Could not get metadata info secondary URL", e3);
                            }
                        }
                        arrayList.add(c1317i2);
                    }
                    if (eVar2.containsKey("emergencyOneboxRenderer")) {
                        com.github.catvod.spider.merge.D0.e eVarG4 = eVar2.g("emergencyOneboxRenderer");
                        com.github.catvod.spider.merge.u1.g gVar = new com.github.catvod.spider.merge.u1.g(arrayList, 1);
                        List<com.github.catvod.spider.merge.D0.e> list = (List) eVarG4.values().stream().filter(r.b).map(new Function() { // from class: com.github.catvod.spider.merge.F1.q
                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((com.github.catvod.spider.merge.D0.e) obj2).g("singleActionEmergencySupportRenderer");
                            }
                        }).collect(Collectors.toList());
                        if (list.isEmpty()) {
                            throw new com.github.catvod.spider.merge.p1.i("Could not extract any meta info from emergency renderer");
                        }
                        for (com.github.catvod.spider.merge.D0.e eVar3 : list) {
                            C1317i c1317i3 = new C1317i();
                            B.p(eVar3.g("title"), "title");
                            if (eVar3.containsKey("actionText")) {
                                B.p(eVar3.g("actionText"), "action");
                            } else if (eVar3.containsKey("contacts")) {
                                com.github.catvod.spider.merge.D0.c cVarB = eVar3.b("contacts");
                                for (int i = 0; i < cVarB.size(); i++) {
                                    B.p(cVarB.a(i).g("actionText"), "contacts.actionText");
                                }
                            }
                            B.p(eVar3.g("detailsText"), "details");
                            c1317i3.b(B.p(eVar3.g("navigationText"), "urlText"));
                            String strR2 = B.r(eVar3.g("navigationEndpoint"));
                            if (strR2 == null) {
                                throw new com.github.catvod.spider.merge.p1.i("Could not extract emergency renderer url");
                            }
                            try {
                                c1317i3.a(new URL(com.github.catvod.spider.merge.L1.m.p(strR2)));
                                gVar.accept(c1317i3);
                            } catch (MalformedURLException e4) {
                                throw new com.github.catvod.spider.merge.p1.i("Could not parse emergency renderer url", e4);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
