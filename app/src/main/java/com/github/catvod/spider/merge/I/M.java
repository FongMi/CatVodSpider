package com.github.catvod.spider.merge.I;

import android.widget.EditText;
import com.github.catvod.demo.MainActivity;
import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.TgYunDouBanPan;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final /* synthetic */ class M implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ M(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                O o = (O) this.c;
                o.getClass();
                EditText editTextInitEditText = BaseApi.get().initEditText();
                editTextInitEditText.setHint("請輸入Refresh Token");
                editTextInitEditText.setPadding(com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8), com.github.catvod.spider.merge.i0.m.f(8));
                editTextInitEditText.setBackground(BaseApi.createRoundedBackground(-3355444, com.github.catvod.spider.merge.i0.m.f(8)));
                Init.run(new RunnableC0757h(o, editTextInitEditText, new I(o, editTextInitEditText, i2), i));
                break;
            case 1:
                com.github.catvod.spider.merge.L.g gVar = (com.github.catvod.spider.merge.L.g) this.c;
                gVar.getClass();
                C0773p.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("aliyundrive_oauth"), gVar.toString());
                break;
            case 2:
                com.github.catvod.spider.merge.W.a aVar = (com.github.catvod.spider.merge.W.a) this.c;
                aVar.getClass();
                int i3 = C0.i;
                y0.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("xunlei_user"), aVar.toString());
                break;
            case 3:
                com.github.catvod.spider.merge.b0.c cVar = (com.github.catvod.spider.merge.b0.c) this.c;
                cVar.getClass();
                P0.a.getClass();
                com.github.catvod.spider.merge.g.b.g(com.github.catvod.spider.merge.g.b.f("115_user"), cVar.toString());
                break;
            case 4:
                ((MainActivity) this.c).j();
                break;
            case 5:
                final BaseApi baseApi = (BaseApi) this.c;
                baseApi.getClass();
                BaseApi baseApi2 = BaseApi.get();
                BaseApi.Task task = new BaseApi.Task() { // from class: com.github.catvod.spider.merge.d0.g
                    @Override // com.github.catvod.en.BaseApi.Task
                    public final void execute(String str) {
                        BaseApi.e(baseApi, str);
                    }
                };
                StringBuilder sbB = t0.b("设置网盘顺序、画质 \n 当前 ");
                sbB.append(BaseApi.get().c);
                baseApi2.showInputWithOption("", null, task, sbB.toString(), "请输入网盘顺序、画质或点击上方默认选项", Arrays.asList("uc|quark|p123|ali|115|ty|yd###原畫|普畫", "ty|ali|p123|quark|uc|115|yd###原畫|普畫", "quark|p123|uc|115|ali|ty|yd###原畫"));
                break;
            default:
                TgYunDouBanPan.j((TgYunDouBanPan) this.c);
                break;
        }
    }
}
