package com.github.catvod.spider.merge.k;

import android.content.Context;
import android.view.View;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.PTT;
import com.orhanobut.logger.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0127a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ ViewOnClickListenerC0127a(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                final MainActivity mainActivity = this.b;
                final int i = 6;
                mainActivity.a.execute(new Runnable() { // from class: com.github.catvod.spider.merge.k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = mainActivity;
                        switch (i) {
                            case 0:
                                context.getClass();
                                try {
                                    Logger.t("detailContent").d(((MainActivity) context).b.detailContent(Arrays.asList("434686")));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return;
                                }
                                break;
                            case 1:
                                context.getClass();
                                try {
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put("c", "19");
                                    map.put("year", "2024");
                                    Logger.t("categoryContent").d(((MainActivity) context).b.categoryContent("3", "2", true, map));
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return;
                                }
                                break;
                            case 2:
                                context.getClass();
                                try {
                                    Logger.t("searchContent").d(((MainActivity) context).b.searchContent("我的人间烟火", false));
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    return;
                                }
                                break;
                            case 3:
                                int i2 = MainActivity.c;
                                context.getClass();
                                try {
                                    Init.init(context.getApplicationContext());
                                    PTT ptt = new PTT();
                                    ((MainActivity) context).b = ptt;
                                    ptt.init(context, "");
                                } catch (Throwable th4) {
                                    th4.printStackTrace();
                                    return;
                                }
                                break;
                            case 4:
                                context.getClass();
                                try {
                                    Logger.t("playerContent").d(((MainActivity) context).b.playerContent("", "382044/1/78", new ArrayList()));
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                                break;
                            case 5:
                                context.getClass();
                                try {
                                    Logger.t("homeVideoContent").d(((MainActivity) context).b.homeVideoContent());
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                context.getClass();
                                try {
                                    Logger.t("homeContent").d(((MainActivity) context).b.homeContent(true));
                                } catch (Throwable th7) {
                                    th7.printStackTrace();
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final MainActivity mainActivity2 = this.b;
                final int i2 = 5;
                mainActivity2.a.execute(new Runnable() { // from class: com.github.catvod.spider.merge.k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = mainActivity2;
                        switch (i2) {
                            case 0:
                                context.getClass();
                                try {
                                    Logger.t("detailContent").d(((MainActivity) context).b.detailContent(Arrays.asList("434686")));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return;
                                }
                                break;
                            case 1:
                                context.getClass();
                                try {
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put("c", "19");
                                    map.put("year", "2024");
                                    Logger.t("categoryContent").d(((MainActivity) context).b.categoryContent("3", "2", true, map));
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return;
                                }
                                break;
                            case 2:
                                context.getClass();
                                try {
                                    Logger.t("searchContent").d(((MainActivity) context).b.searchContent("我的人间烟火", false));
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    return;
                                }
                                break;
                            case 3:
                                int i22 = MainActivity.c;
                                context.getClass();
                                try {
                                    Init.init(context.getApplicationContext());
                                    PTT ptt = new PTT();
                                    ((MainActivity) context).b = ptt;
                                    ptt.init(context, "");
                                } catch (Throwable th4) {
                                    th4.printStackTrace();
                                    return;
                                }
                                break;
                            case 4:
                                context.getClass();
                                try {
                                    Logger.t("playerContent").d(((MainActivity) context).b.playerContent("", "382044/1/78", new ArrayList()));
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                                break;
                            case 5:
                                context.getClass();
                                try {
                                    Logger.t("homeVideoContent").d(((MainActivity) context).b.homeVideoContent());
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                context.getClass();
                                try {
                                    Logger.t("homeContent").d(((MainActivity) context).b.homeContent(true));
                                } catch (Throwable th7) {
                                    th7.printStackTrace();
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final MainActivity mainActivity3 = this.b;
                final int i3 = 1;
                mainActivity3.a.execute(new Runnable() { // from class: com.github.catvod.spider.merge.k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = mainActivity3;
                        switch (i3) {
                            case 0:
                                context.getClass();
                                try {
                                    Logger.t("detailContent").d(((MainActivity) context).b.detailContent(Arrays.asList("434686")));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return;
                                }
                                break;
                            case 1:
                                context.getClass();
                                try {
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put("c", "19");
                                    map.put("year", "2024");
                                    Logger.t("categoryContent").d(((MainActivity) context).b.categoryContent("3", "2", true, map));
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return;
                                }
                                break;
                            case 2:
                                context.getClass();
                                try {
                                    Logger.t("searchContent").d(((MainActivity) context).b.searchContent("我的人间烟火", false));
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    return;
                                }
                                break;
                            case 3:
                                int i22 = MainActivity.c;
                                context.getClass();
                                try {
                                    Init.init(context.getApplicationContext());
                                    PTT ptt = new PTT();
                                    ((MainActivity) context).b = ptt;
                                    ptt.init(context, "");
                                } catch (Throwable th4) {
                                    th4.printStackTrace();
                                    return;
                                }
                                break;
                            case 4:
                                context.getClass();
                                try {
                                    Logger.t("playerContent").d(((MainActivity) context).b.playerContent("", "382044/1/78", new ArrayList()));
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                                break;
                            case 5:
                                context.getClass();
                                try {
                                    Logger.t("homeVideoContent").d(((MainActivity) context).b.homeVideoContent());
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                context.getClass();
                                try {
                                    Logger.t("homeContent").d(((MainActivity) context).b.homeContent(true));
                                } catch (Throwable th7) {
                                    th7.printStackTrace();
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final MainActivity mainActivity4 = this.b;
                final int i4 = 0;
                mainActivity4.a.execute(new Runnable() { // from class: com.github.catvod.spider.merge.k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = mainActivity4;
                        switch (i4) {
                            case 0:
                                context.getClass();
                                try {
                                    Logger.t("detailContent").d(((MainActivity) context).b.detailContent(Arrays.asList("434686")));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return;
                                }
                                break;
                            case 1:
                                context.getClass();
                                try {
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put("c", "19");
                                    map.put("year", "2024");
                                    Logger.t("categoryContent").d(((MainActivity) context).b.categoryContent("3", "2", true, map));
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return;
                                }
                                break;
                            case 2:
                                context.getClass();
                                try {
                                    Logger.t("searchContent").d(((MainActivity) context).b.searchContent("我的人间烟火", false));
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    return;
                                }
                                break;
                            case 3:
                                int i22 = MainActivity.c;
                                context.getClass();
                                try {
                                    Init.init(context.getApplicationContext());
                                    PTT ptt = new PTT();
                                    ((MainActivity) context).b = ptt;
                                    ptt.init(context, "");
                                } catch (Throwable th4) {
                                    th4.printStackTrace();
                                    return;
                                }
                                break;
                            case 4:
                                context.getClass();
                                try {
                                    Logger.t("playerContent").d(((MainActivity) context).b.playerContent("", "382044/1/78", new ArrayList()));
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                                break;
                            case 5:
                                context.getClass();
                                try {
                                    Logger.t("homeVideoContent").d(((MainActivity) context).b.homeVideoContent());
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                context.getClass();
                                try {
                                    Logger.t("homeContent").d(((MainActivity) context).b.homeContent(true));
                                } catch (Throwable th7) {
                                    th7.printStackTrace();
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final MainActivity mainActivity5 = this.b;
                final int i5 = 4;
                mainActivity5.a.execute(new Runnable() { // from class: com.github.catvod.spider.merge.k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = mainActivity5;
                        switch (i5) {
                            case 0:
                                context.getClass();
                                try {
                                    Logger.t("detailContent").d(((MainActivity) context).b.detailContent(Arrays.asList("434686")));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return;
                                }
                                break;
                            case 1:
                                context.getClass();
                                try {
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put("c", "19");
                                    map.put("year", "2024");
                                    Logger.t("categoryContent").d(((MainActivity) context).b.categoryContent("3", "2", true, map));
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return;
                                }
                                break;
                            case 2:
                                context.getClass();
                                try {
                                    Logger.t("searchContent").d(((MainActivity) context).b.searchContent("我的人间烟火", false));
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    return;
                                }
                                break;
                            case 3:
                                int i22 = MainActivity.c;
                                context.getClass();
                                try {
                                    Init.init(context.getApplicationContext());
                                    PTT ptt = new PTT();
                                    ((MainActivity) context).b = ptt;
                                    ptt.init(context, "");
                                } catch (Throwable th4) {
                                    th4.printStackTrace();
                                    return;
                                }
                                break;
                            case 4:
                                context.getClass();
                                try {
                                    Logger.t("playerContent").d(((MainActivity) context).b.playerContent("", "382044/1/78", new ArrayList()));
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                                break;
                            case 5:
                                context.getClass();
                                try {
                                    Logger.t("homeVideoContent").d(((MainActivity) context).b.homeVideoContent());
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                context.getClass();
                                try {
                                    Logger.t("homeContent").d(((MainActivity) context).b.homeContent(true));
                                } catch (Throwable th7) {
                                    th7.printStackTrace();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final MainActivity mainActivity6 = this.b;
                final int i6 = 2;
                mainActivity6.a.execute(new Runnable() { // from class: com.github.catvod.spider.merge.k.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = mainActivity6;
                        switch (i6) {
                            case 0:
                                context.getClass();
                                try {
                                    Logger.t("detailContent").d(((MainActivity) context).b.detailContent(Arrays.asList("434686")));
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                    return;
                                }
                                break;
                            case 1:
                                context.getClass();
                                try {
                                    HashMap<String, String> map = new HashMap<>();
                                    map.put("c", "19");
                                    map.put("year", "2024");
                                    Logger.t("categoryContent").d(((MainActivity) context).b.categoryContent("3", "2", true, map));
                                } catch (Throwable th2) {
                                    th2.printStackTrace();
                                    return;
                                }
                                break;
                            case 2:
                                context.getClass();
                                try {
                                    Logger.t("searchContent").d(((MainActivity) context).b.searchContent("我的人间烟火", false));
                                } catch (Throwable th3) {
                                    th3.printStackTrace();
                                    return;
                                }
                                break;
                            case 3:
                                int i22 = MainActivity.c;
                                context.getClass();
                                try {
                                    Init.init(context.getApplicationContext());
                                    PTT ptt = new PTT();
                                    ((MainActivity) context).b = ptt;
                                    ptt.init(context, "");
                                } catch (Throwable th4) {
                                    th4.printStackTrace();
                                    return;
                                }
                                break;
                            case 4:
                                context.getClass();
                                try {
                                    Logger.t("playerContent").d(((MainActivity) context).b.playerContent("", "382044/1/78", new ArrayList()));
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                                break;
                            case 5:
                                context.getClass();
                                try {
                                    Logger.t("homeVideoContent").d(((MainActivity) context).b.homeVideoContent());
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                                break;
                            default:
                                context.getClass();
                                try {
                                    Logger.t("homeContent").d(((MainActivity) context).b.homeContent(true));
                                } catch (Throwable th7) {
                                    th7.printStackTrace();
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
