package com.github.catvod.spider.merge.A0;

import java.io.IOException;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class abt extends ur {
    @Override // com.github.catvod.spider.merge.A0.fw
    /* JADX INFO: renamed from: b */
    public final fw clone() {
        return (abt) super.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final Object clone() {
        return (abt) super.clone();
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final String s() {
        return "#data";
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final void u(StringBuilder sb, int i, ut utVar) throws IOException {
        String strF = f();
        if (utVar.f != 2 || strF.contains("<![CDATA[")) {
            sb.append((CharSequence) f());
            return;
        }
        fw fwVar = this.ap;
        if (fwVar != null && fwVar.t().equals("script")) {
            sb.append("//<![CDATA[\n").append(strF).append("\n//]]>");
            return;
        }
        fw fwVar2 = this.ap;
        if (fwVar2 == null || !fwVar2.t().equals("style")) {
            sb.append("<![CDATA[").append(strF).append("]]>");
        } else {
            sb.append("/*<![CDATA[*/\n").append(strF).append("\n/*]]>*/");
        }
    }

    @Override // com.github.catvod.spider.merge.A0.fw
    public final void v(StringBuilder sb, int i, ut utVar) {
    }
}
