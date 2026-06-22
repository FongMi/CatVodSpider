package com.github.catvod.spider.merge.G1;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
final class P extends O {
    P(com.github.catvod.spider.merge.D0.e eVar) {
        super(eVar);
    }

    @Override // com.github.catvod.spider.merge.G1.O
    public final com.github.catvod.spider.merge.D0.e a() {
        return this.a.b("avatars").a(0);
    }

    @Override // com.github.catvod.spider.merge.G1.O
    public final com.github.catvod.spider.merge.D0.e b() {
        return (com.github.catvod.spider.merge.D0.e) this.a.g("rendererContext").g("commandContext").g("onTap").g("innertubeCommand").g("showDialogCommand").g("panelLoadingStrategy").g("inlineContent").g("dialogViewModel").g("customContent").g("listViewModel").b("listItems").b().map(C0694m.e).findFirst().orElse(null);
    }
}
