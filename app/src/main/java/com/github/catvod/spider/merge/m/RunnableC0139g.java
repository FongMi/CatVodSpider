package com.github.catvod.spider.merge.m;

import android.R;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.n.C0140a;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/54b771305498452abc8dc22b9bb2871e/classes.dex */
public final /* synthetic */ class RunnableC0139g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Notice b;

    public /* synthetic */ RunnableC0139g(Notice notice, int i) {
        this.a = i;
        this.b = notice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Notice notice = this.b;
        int i = 1;
        switch (this.a) {
            case 0:
                notice.getClass();
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < 2; i2++) {
                    sb.append("                                        ");
                    sb.append(notice.d);
                }
                C0140a c0140a = new C0140a(Init.context());
                notice.a = c0140a;
                c0140a.setTextSize(20.0f);
                C0140a c0140a2 = notice.a;
                c0140a2.b = notice.c;
                c0140a2.setText(sb.toString());
                notice.a.setTypeface(null, 1);
                notice.a.setPadding(0, com.github.catvod.spider.merge.o.c.b(16), 0, com.github.catvod.spider.merge.o.c.b(16));
                notice.a.setBackgroundColor(Color.argb(200, 255, 255, 255));
                C0140a c0140a3 = notice.a;
                Scroller scroller = c0140a3.a;
                int i3 = -c0140a3.getWidth();
                TextPaint paint = c0140a3.getPaint();
                Rect rect = new Rect();
                String string = c0140a3.getText().toString();
                paint.getTextBounds(string, 0, string.length(), rect);
                scroller.startScroll(i3, 0, c0140a3.getWidth() + rect.width(), 0, c0140a3.b * 1000);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 48;
                C0140a c0140a4 = notice.a;
                Pattern pattern = com.github.catvod.spider.merge.o.d.a;
                try {
                    ((ViewGroup) Init.getActivity().getWindow().getDecorView().findViewById(R.id.content)).addView(c0140a4, layoutParams);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Init.run(notice.e, 500);
                Init.run(new RunnableC0139g(notice, i), notice.c * 1000);
                break;
            default:
                C0140a c0140a5 = notice.a;
                Pattern pattern2 = com.github.catvod.spider.merge.o.d.a;
                try {
                    ((ViewGroup) Init.getActivity().getWindow().getDecorView().findViewById(R.id.content)).removeView(c0140a5);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
        }
    }
}
