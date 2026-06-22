package com.github.catvod.spider.merge;

import com.github.catvod.spider.merge.g9;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class DQ extends FR {
    public DQ(String str) {
        this.b = str;
    }

    static boolean Y(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    public boolean B() {
        return tv.l(Lw());
    }

    public String FG() {
        return Lw();
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ int HM() {
        return super.HM();
    }

    @Override // com.github.catvod.spider.merge.A0
    public String Q() {
        return "#text";
    }

    @Override // com.github.catvod.spider.merge.A0
    void R(Appendable appendable, int i, g9.aA aAVar) {
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ String T4(String str) {
        return super.T4(str);
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ String l8(String str) {
        return super.l8(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @Override // com.github.catvod.spider.merge.A0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void r1(java.lang.Appendable r10, int r11, com.github.catvod.spider.merge.g9.aA r12) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r12.HM()
            if (r0 == 0) goto L3d
            int r1 = r9.Ws()
            if (r1 != 0) goto L24
            com.github.catvod.spider.merge.A0 r1 = r9.S
            boolean r2 = r1 instanceof com.github.catvod.spider.merge.Iw
            if (r2 == 0) goto L24
            com.github.catvod.spider.merge.Iw r1 = (com.github.catvod.spider.merge.Iw) r1
            com.github.catvod.spider.merge.hs r1 = r1.cE()
            boolean r1 = r1.S()
            if (r1 == 0) goto L24
            boolean r1 = r9.B()
            if (r1 == 0) goto L3a
        L24:
            boolean r1 = r12.tT()
            if (r1 == 0) goto L3d
            java.util.List r1 = r9.M()
            int r1 = r1.size()
            if (r1 <= 0) goto L3d
            boolean r1 = r9.B()
            if (r1 != 0) goto L3d
        L3a:
            r9.c(r10, r11, r12)
        L3d:
            r11 = 1
            r1 = 0
            if (r0 == 0) goto L4b
            com.github.catvod.spider.merge.A0 r2 = r9.S
            boolean r2 = com.github.catvod.spider.merge.Iw.Kw(r2)
            if (r2 != 0) goto L4b
            r7 = 1
            goto L4c
        L4b:
            r7 = 0
        L4c:
            if (r0 == 0) goto L56
            com.github.catvod.spider.merge.A0 r0 = r9.S
            boolean r0 = r0 instanceof com.github.catvod.spider.merge.g9
            if (r0 == 0) goto L56
            r8 = 1
            goto L57
        L56:
            r8 = 0
        L57:
            java.lang.String r4 = r9.Lw()
            r6 = 0
            r3 = r10
            r5 = r12
            com.github.catvod.spider.merge.Y9.OL(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.DQ.r1(java.lang.Appendable, int, com.github.catvod.spider.merge.g9$aA):void");
    }

    @Override // com.github.catvod.spider.merge.FR, com.github.catvod.spider.merge.A0
    public /* bridge */ /* synthetic */ A0 s() {
        return super.s();
    }

    @Override // com.github.catvod.spider.merge.A0
    public String toString() {
        return C();
    }

    @Override // com.github.catvod.spider.merge.A0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public DQ v() {
        return (DQ) super.v();
    }
}
