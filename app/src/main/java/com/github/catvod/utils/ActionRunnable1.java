package com.github.catvod.utils;

import com.github.catvod.en.BaseApi;
import com.github.catvod.spider.ConfigCenter;
import com.github.catvod.spider.Init;

import com.github.catvod.utils.merge.UcDriveApi;

public final /* synthetic */ class ActionRunnable1 implements Runnable {
    public static final /* synthetic */ ActionRunnable1 c = new ActionRunnable1(0);
    public static final /* synthetic */ ActionRunnable1 d = new ActionRunnable1(1);
    public static final /* synthetic */ ActionRunnable1 e = new ActionRunnable1(2);
    public static final /* synthetic */ ActionRunnable1 f = new ActionRunnable1(3);
    public final /* synthetic */ int b;

    public /* synthetic */ ActionRunnable1(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                String str = ConfigCenter.m;
                UcDriveApi v0VarR = UcDriveApi.r();
                v0VarR.getClass();
                Init.run(new Runnable(){public void run(){}});
                return;
            case 1:
                String str2 = ConfigCenter.m;
                com.github.catvod.utils.merge.GuangYaPanApi oL = com.github.catvod.utils.merge.GuangYaPanApi.getInstance();
                oL.getClass();
                Init.run(new com.github.catvod.internal.GuangYaAuthRunnable(oL, 0));
                return;
            case 2:
                String str3 = ConfigCenter.m;
                new Thread(RunnableC1212h.f).start();
                return;
        }
        while (true) {
            try {
                Thread.sleep(2000L);
                BaseApi.monitorCurrentActivityButtons();
            } catch (Exception unused) {
                return;
            }
        }
    }
}
