package com.github.catvod.spider.merge.F1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n {
    private static final Pattern a = Pattern.compile("(?s)^ +[/•] +(.*?) +$");
    public static final /* synthetic */ int b = 0;

    public static /* synthetic */ String a(String str) {
        Matcher matcher = a.matcher(str);
        return matcher.find() ? matcher.group(1) : str;
    }

    public static String b(com.github.catvod.spider.merge.D0.e eVar) {
        String strI;
        int i;
        if (com.github.catvod.spider.merge.L1.m.l(eVar) || (strI = eVar.i("content", null)) == null) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        eVar.b("commandRuns").stream().filter(new com.github.catvod.spider.merge.z1.d(com.github.catvod.spider.merge.D0.e.class, 2)).map(new com.github.catvod.spider.merge.z1.b(com.github.catvod.spider.merge.D0.e.class, 2)).forEach(new Consumer() { // from class: com.github.catvod.spider.merge.F1.f
            /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
            @Override // java.util.function.Consumer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void accept(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.util.List r0 = r1
                    java.util.List r1 = r2
                    com.github.catvod.spider.merge.D0.e r10 = (com.github.catvod.spider.merge.D0.e) r10
                    java.lang.String r2 = "onTap"
                    com.github.catvod.spider.merge.D0.e r2 = r10.g(r2)
                    java.lang.String r3 = "innertubeCommand"
                    com.github.catvod.spider.merge.D0.e r2 = r2.g(r3)
                    r3 = -1
                    java.lang.String r4 = "startIndex"
                    int r3 = r10.e(r4, r3)
                    r4 = 0
                    java.lang.String r5 = "length"
                    int r5 = r10.e(r5, r4)
                    if (r3 < 0) goto L95
                    r6 = 1
                    if (r5 < r6) goto L95
                    if (r2 != 0) goto L28
                    goto L95
                L28:
                    java.lang.String r2 = com.github.catvod.spider.merge.F1.B.r(r2)
                    if (r2 != 0) goto L2f
                    goto L95
                L2f:
                    java.net.URL r7 = new java.net.URL     // Catch: java.net.MalformedURLException -> L42
                    r7.<init>(r2)     // Catch: java.net.MalformedURLException -> L42
                    boolean r8 = com.github.catvod.spider.merge.F1.B.B(r7)     // Catch: java.net.MalformedURLException -> L42
                    if (r8 != 0) goto L40
                    boolean r7 = com.github.catvod.spider.merge.F1.B.A(r7)     // Catch: java.net.MalformedURLException -> L42
                    if (r7 == 0) goto L43
                L40:
                    r4 = 1
                    goto L43
                L42:
                L43:
                    java.lang.String r2 = com.github.catvod.spider.merge.c1.o.d(r2)
                    java.lang.String r7 = "<a href=\""
                    java.lang.String r8 = "\">"
                    java.lang.String r2 = com.github.catvod.spider.merge.I.t0.a(r7, r2, r8)
                    java.lang.String r7 = "onTapOptions"
                    com.github.catvod.spider.merge.D0.e r10 = r10.g(r7)
                    java.lang.String r7 = "accessibilityInfo"
                    com.github.catvod.spider.merge.D0.e r10 = r10.g(r7)
                    java.lang.String r7 = ""
                    java.lang.String r8 = "accessibilityLabel"
                    java.lang.String r10 = r10.i(r8, r7)
                    java.lang.String r8 = " Channel Link"
                    java.lang.String r10 = r10.replaceFirst(r8, r7)
                    if (r4 != 0) goto L80
                    boolean r4 = r10.isEmpty()
                    if (r4 != 0) goto L80
                    java.lang.String r4 = "YouTube: "
                    boolean r4 = r10.startsWith(r4)
                    if (r4 == 0) goto L7a
                    goto L80
                L7a:
                    com.github.catvod.spider.merge.u1.a r4 = new com.github.catvod.spider.merge.u1.a
                    r4.<init>(r10, r6)
                    goto L82
                L80:
                    com.github.catvod.spider.merge.F1.g r4 = new java.util.function.Function() { // from class: com.github.catvod.spider.merge.F1.g
                        static {
                            /*
                                com.github.catvod.spider.merge.F1.g r0 = new com.github.catvod.spider.merge.F1.g
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:com.github.catvod.spider.merge.F1.g) com.github.catvod.spider.merge.F1.g.a com.github.catvod.spider.merge.F1.g
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F1.g.<clinit>():void");
                        }

                        {
                            /*
                                r0 = this;
                                r0.<init>()
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F1.g.<init>():void");
                        }

                        @Override // java.util.function.Function
                        public final java.lang.Object apply(java.lang.Object r1) {
                            /*
                                r0 = this;
                                java.lang.String r1 = (java.lang.String) r1
                                java.lang.String r1 = com.github.catvod.spider.merge.F1.n.a(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F1.g.apply(java.lang.Object):java.lang.Object");
                        }
                    }
                L82:
                    com.github.catvod.spider.merge.F1.m r10 = new com.github.catvod.spider.merge.F1.m
                    java.lang.String r6 = "</a>"
                    r10.<init>(r2, r6, r3, r4)
                    r0.add(r10)
                    com.github.catvod.spider.merge.F1.m r10 = new com.github.catvod.spider.merge.F1.m
                    int r3 = r3 + r5
                    r10.<init>(r2, r6, r3, r4)
                    r1.add(r10)
                L95:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F1.C0630f.accept(java.lang.Object):void");
            }
        });
        int i2 = 0;
        eVar.b("styleRuns").stream().filter(new h(com.github.catvod.spider.merge.D0.e.class, 0)).map(new com.github.catvod.spider.merge.D1.b(com.github.catvod.spider.merge.D0.e.class, 0)).forEach(new Consumer() { // from class: com.github.catvod.spider.merge.F1.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                List list = arrayList;
                List list2 = arrayList2;
                com.github.catvod.spider.merge.D0.e eVar2 = (com.github.catvod.spider.merge.D0.e) obj;
                int iE = eVar2.e("startIndex", -1);
                int iE2 = eVar2.e("length", 0);
                if (iE < 0 || iE2 < 1) {
                    return;
                }
                int i3 = iE2 + iE;
                if (eVar2.containsKey("strikethrough")) {
                    list.add(new m("<s>", "</s>", iE, null));
                    list2.add(new m("<s>", "</s>", i3, null));
                }
                if (eVar2.d("italic")) {
                    list.add(new m("<i>", "</i>", iE, null));
                    list2.add(new m("<i>", "</i>", i3, null));
                }
                if (!eVar2.containsKey("weightLabel") || "FONT_WEIGHT_NORMAL".equals(eVar2.i("weightLabel", null))) {
                    return;
                }
                list.add(new m("<b>", "</b>", iE, null));
                list2.add(new m("<b>", "</b>", i3, null));
            }
        });
        Collections.sort(arrayList, Comparator.comparingInt(new ToIntFunction() { // from class: com.github.catvod.spider.merge.F1.i
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int i3 = n.b;
                return ((m) obj).c;
            }
        }));
        Collections.sort(arrayList2, Comparator.comparingInt(new ToIntFunction() { // from class: com.github.catvod.spider.merge.F1.j
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int i3 = n.b;
                return ((m) obj).c;
            }
        }));
        String strReplace = strI.replace((char) 160, ' ');
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int i4 = 0;
        while (i2 < arrayList2.size()) {
            int iMin = i4 < arrayList.size() ? Math.min(((m) arrayList2.get(i2)).c, ((m) arrayList.get(i4)).c) : ((m) arrayList2.get(i2)).c;
            sb.append(com.github.catvod.spider.merge.c1.o.d(strReplace.substring(i3, iMin)));
            if (((m) arrayList2.get(i2)).c == iMin) {
                m mVar = (m) arrayList2.get(i2);
                i2++;
                while (true) {
                    if (stack.empty()) {
                        break;
                    }
                    m mVar2 = (m) stack.pop();
                    if (mVar2.a.equals(mVar.a)) {
                        if (mVar2.d != null && (i = mVar2.e) >= 0) {
                            sb.replace(i, sb.length(), mVar2.d.apply(sb.substring(mVar2.e)));
                        }
                        sb.append(mVar2.b);
                    } else {
                        sb.append(mVar2.b);
                        stack2.push(mVar2);
                    }
                }
                while (!stack2.empty()) {
                    m mVar3 = (m) stack2.pop();
                    sb.append(mVar3.a);
                    stack.push(mVar3);
                }
            } else {
                m mVar4 = (m) arrayList.get(i4);
                sb.append(mVar4.a);
                mVar4.e = sb.length();
                stack.push(mVar4);
                i4++;
            }
            i3 = iMin;
        }
        sb.append(com.github.catvod.spider.merge.c1.o.d(strReplace.substring(i3)));
        return sb.toString().replace("\n", "<br>").replace("  ", " &nbsp;");
    }
}
