package com.github.catvod.spider.merge.I;

import com.github.catvod.demo.MainActivity;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.I.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class RunnableC0744a0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0744a0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((C0754f0) this.c).m();
                break;
            case 1:
                com.github.catvod.spider.merge.L.m mVar = (com.github.catvod.spider.merge.L.m) this.c;
                mVar.getClass();
                C0773p.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("aliyundrive_user"), mVar.toString());
                break;
            case 2:
                com.github.catvod.spider.merge.Y.c cVar = (com.github.catvod.spider.merge.Y.c) this.c;
                cVar.getClass();
                D0.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("115_user"), cVar.toString());
                break;
            case 3:
                ((MainActivity) this.c).l();
                break;
            default:
                try {
                    String str = ((String) this.c).split("###")[0];
                    com.github.catvod.spider.merge.f0.d.a().newCall(new Request.Builder().url("http://127.0.0.1:9190/proxies/select").method("PUT", RequestBody.create(MediaType.parse("text/plain;charset=UTF-8"), "{\"name\":\"" + str + "\"}")).build()).execute();
                    StringBuilder sb = new StringBuilder();
                    sb.append("singbox 节点 当前为");
                    sb.append(str);
                    com.github.catvod.spider.merge.i0.d.b(sb.toString());
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
