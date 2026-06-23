package com.github.catvod.spider.merge.AB.o;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.AB.b.RunnableC0083d;
import com.github.catvod.spider.merge.AB.b.RunnableC0085f;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0101e {
    protected Activity a;
    protected boolean b = false;
    protected ViewTreeObserver.OnGlobalLayoutListener c;
    protected View d;
    private ImageView e;
    private ViewGroup f;
    private String g;

    public C0101e(Activity activity) {
        try {
            this.a = activity;
            String strG = g(activity);
            this.g = strG;
            if (strG.contains("ok")) {
                if (this.g.contains("mobile")) {
                    View viewF = f(activity, "danmuSetting");
                    if (viewF != null) {
                        this.f = (ViewGroup) viewF.getParent();
                    }
                } else {
                    View viewF2 = f(activity, "danmu");
                    if (viewF2 != null) {
                        this.f = (ViewGroup) viewF2.getParent();
                    } else {
                        this.e = (ImageView) f(activity, "icon_lock");
                    }
                }
            } else if (this.g.contains("tvbox")) {
                if (this.g.contains("mobile")) {
                    View viewF3 = f(activity, "danmu");
                    if (viewF3 != null) {
                        this.f = (ViewGroup) viewF3.getParent();
                    } else {
                        this.e = (ImageView) f(activity, "icon_lock");
                    }
                } else {
                    this.f = (ViewGroup) ((TextView) f(activity, "play_next")).getParent();
                }
            }
            View view = this.e;
            if (view == null) {
                view = this.f;
            }
            this.d = view;
        } catch (Exception e) {
            SpiderDebug.log("ButtonMonitor 初始化失败: " + e.getMessage());
        }
    }

    public static void a(C0101e c0101e) {
        View view;
        View view2 = c0101e.e;
        if (view2 == null) {
            view2 = c0101e.f;
        }
        if (view2 != null && view2.getVisibility() == 0) {
            View view3 = c0101e.e;
            if (view3 == null) {
                view3 = c0101e.f;
            }
            view3.post(new RunnableC0085f(c0101e, 3));
            if (c0101e.b) {
                try {
                    if (c0101e.c != null && (view = c0101e.d) != null) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(c0101e.c);
                        c0101e.c = null;
                    }
                    c0101e.d = null;
                    c0101e.b = false;
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.github.catvod.spider.merge.AB.o.C0101e r5) {
        /*
            r5.getClass()
            com.github.catvod.spider.merge.AB.o.q r0 = new com.github.catvod.spider.merge.AB.o.q
            android.app.Activity r1 = com.github.catvod.spider.Init.getActivity()
            r0.<init>(r1)
            boolean r1 = r5.h()
            if (r1 == 0) goto L13
            goto L52
        L13:
            android.app.Activity r1 = r5.a
            java.lang.String r2 = r5.g
            java.lang.String r3 = "tvbox_mobile"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L32
            java.lang.String r2 = "vodName"
            android.view.View r1 = r5.f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L52
            java.lang.CharSequence r5 = r1.getText()
            java.lang.String r5 = r5.toString()
            goto L54
        L32:
            java.lang.String r2 = "name"
            android.view.View r1 = r5.f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L47
            android.app.Activity r1 = r5.a
            java.lang.String r2 = "tvName"
            android.view.View r5 = r5.f(r1, r2)
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
        L47:
            if (r1 == 0) goto L52
            java.lang.CharSequence r5 = r1.getText()
            java.lang.String r5 = r5.toString()
            goto L54
        L52:
            java.lang.String r5 = ""
        L54:
            r0.u(r5)
            java.lang.String r1 = "弹幕搜索中…"
            com.github.catvod.spider.merge.m.C0590I.i(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.AB.o.C0101e.b(com.github.catvod.spider.merge.AB.o.e):void");
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, android.widget.TextView] */
    public static void c(final C0101e c0101e) {
        Pair pair;
        ImageView imageView = c0101e.e;
        View view = null;
        ImageView imageView2 = null;
        if (imageView != null) {
            ViewGroup viewGroup = (ViewGroup) imageView.getParent();
            if (viewGroup != null && viewGroup.findViewWithTag("aw_danmu_search_button") == null) {
                ImageView imageView3 = c0101e.e;
                if (!c0101e.h()) {
                    imageView2 = new ImageView(c0101e.a);
                    try {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        int i = (int) ((8 * c0101e.a.getResources().getDisplayMetrics().density) + 0.5f);
                        layoutParams.setMargins(i, 0, 0, 0);
                        imageView2.setLayoutParams(layoutParams);
                        imageView2.setPadding(imageView3.getPaddingLeft(), imageView3.getPaddingTop(), imageView3.getPaddingRight(), imageView3.getPaddingBottom());
                        imageView2.setFocusable(imageView3.isFocusable());
                        imageView2.setFocusableInTouchMode(imageView3.isFocusableInTouchMode());
                        imageView2.setClickable(imageView3.isClickable());
                        Drawable background = imageView3.getBackground();
                        if (background != null) {
                            imageView2.setBackground(background.getConstantState().newDrawable());
                        }
                        imageView2.setScaleType(imageView3.getScaleType());
                        imageView2.setImageDrawable(d(c0101e.a, imageView3.getHeight() - (i * 2)));
                        imageView2.setOnClickListener(new View.OnClickListener(c0101e) { // from class: com.github.catvod.spider.merge.AB.o.b
                            public final C0101e a;

                            {
                                this.a = c0101e;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C0101e c0101e2 = this.a;
                                c0101e2.getClass();
                                Init.run(new RunnableC0083d(c0101e2, 6));
                            }
                        });
                        imageView2.setTag("aw_danmu_search_button");
                    } catch (Exception unused) {
                    }
                }
                if (imageView2 != null) {
                    viewGroup.addView(imageView2);
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = c0101e.f;
        if (viewGroup2 == null || viewGroup2.findViewWithTag("aw_danmu_search_button") != null) {
            return;
        }
        ViewGroup viewGroup3 = c0101e.f;
        if (viewGroup3 == null) {
            pair = null;
        } else {
            int childCount = viewGroup3.getChildCount();
            int i2 = 0;
            Pair pair2 = null;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup3.getChildAt(i2);
                if ((childAt instanceof TextView) && ((TextView) childAt).getText().toString().contains("弹幕")) {
                    pair2 = new Pair(childAt, Integer.valueOf(i2 + 1));
                    break;
                }
                i2++;
            }
            pair = pair2 != null ? pair2 : new Pair(viewGroup3.getChildAt(0), Integer.valueOf(childCount));
        }
        ?? r4 = (View) pair.first;
        if (!c0101e.h()) {
            String str = c0101e.g;
            if (str.contains("tvbox") || !str.contains("mobile")) {
                TextView textView = new TextView(c0101e.a);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) r4.getLayoutParams();
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                layoutParams3.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                textView.setLayoutParams(layoutParams3);
                textView.setPadding(r4.getPaddingLeft(), r4.getPaddingTop(), r4.getPaddingRight(), r4.getPaddingBottom());
                textView.setFocusable(r4.isFocusable());
                textView.setFocusableInTouchMode(r4.isFocusableInTouchMode());
                textView.setClickable(r4.isClickable());
                if (r4 instanceof TextView) {
                    textView.setTextColor(((TextView) r4).getTextColors());
                    textView.setTextSize(2, r4.getTextSize() / r4.getResources().getDisplayMetrics().scaledDensity);
                }
                Drawable background2 = r4.getBackground();
                if (background2 != null) {
                    textView.setBackground(background2.getConstantState().newDrawable());
                }
                textView.setOnClickListener(new View.OnClickListener(c0101e) { // from class: com.github.catvod.spider.merge.AB.o.c
                    public final C0101e a;

                    {
                        this.a = c0101e;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C0101e c0101e2 = this.a;
                        c0101e2.getClass();
                        Init.run(new RunnableC0083d(c0101e2, 6));
                    }
                });
                textView.setText("弹幕搜索");
                textView.setTag("aw_danmu_search_button");
                view = textView;
            } else {
                ImageView imageView4 = new ImageView(c0101e.a);
                imageView4.setLayoutParams(r4.getLayoutParams());
                imageView4.setPadding(r4.getPaddingLeft(), r4.getPaddingTop(), r4.getPaddingRight(), r4.getPaddingBottom());
                imageView4.setFocusable(r4.isFocusable());
                imageView4.setFocusableInTouchMode(r4.isFocusableInTouchMode());
                imageView4.setClickable(r4.isClickable());
                Drawable background3 = r4.getBackground();
                if (background3 != null) {
                    imageView4.setBackground(background3.getConstantState().newDrawable());
                }
                if (r4 instanceof ImageView) {
                    imageView4.setScaleType(((ImageView) r4).getScaleType());
                }
                imageView4.setImageDrawable(d(c0101e.a, (int) ((c0101e.a.getResources().getDisplayMetrics().density * 20.0f) + 0.5f)));
                imageView4.setOnClickListener(new View.OnClickListener(c0101e) { // from class: com.github.catvod.spider.merge.AB.o.c
                    public final C0101e a;

                    {
                        this.a = c0101e;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C0101e c0101e2 = this.a;
                        c0101e2.getClass();
                        Init.run(new RunnableC0083d(c0101e2, 6));
                    }
                });
                imageView4.setTag("aw_danmu_search_button");
                view = imageView4;
            }
        }
        if (view != null) {
            c0101e.f.addView(view, ((Integer) pair.second).intValue());
        }
    }

    public static BitmapDrawable d(Context context, int i) {
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 24.0f) + 0.5f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        float f = i2 / 24.0f;
        Path path = new Path();
        float f2 = f * 14.0f;
        path.moveTo(15.5f * f, f2);
        path.rLineTo((-0.79f) * f, 0.0f);
        path.rLineTo((-0.28f) * f, (-0.27f) * f);
        float f3 = f * 15.41f;
        float f4 = f * 12.59f;
        float f5 = f * 16.0f;
        float f6 = f * 11.11f;
        float f7 = f * 9.5f;
        path.cubicTo(f3, f4, f5, f6, f5, f7);
        float f8 = f * 5.91f;
        float f9 = f * 13.09f;
        float f10 = f * 3.0f;
        path.cubicTo(f5, f8, f9, f10, f7, f10);
        path.cubicTo(f8, f10, f10, f8, f10, f7);
        path.cubicTo(f10, f9, f8, f5, f7, f5);
        path.cubicTo(f6, f5, f4, f3, f * 13.73f, f * 14.43f);
        path.rLineTo(0.27f * f, 0.28f * f);
        path.rLineTo(0.0f, 0.79f * f);
        float f11 = f * 5.0f;
        path.rLineTo(f11, 4.99f * f);
        path.lineTo(20.49f * f, 19.0f * f);
        path.rLineTo((-4.99f) * f, (-5.0f) * f);
        path.close();
        path.moveTo(f7, f2);
        float f12 = f * 7.01f;
        float f13 = f * 11.99f;
        path.cubicTo(f12, f2, f11, f13, f11, f7);
        path.cubicTo(f11, f12, f12, f11, f7, f11);
        path.cubicTo(f13, f11, f2, f12, f2, f7);
        path.cubicTo(f2, f13, f13, f2, f7, f2);
        path.close();
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, paint);
        return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
    }

    private View f(Activity activity, String str) {
        if (activity == null) {
            return null;
        }
        return activity.findViewById(activity.getResources().getIdentifier(str, "id", activity.getPackageName()));
    }

    private String g(Activity activity) {
        String packageName = activity.getPackageName();
        String lowerCase = activity.getClass().getSimpleName().toLowerCase();
        if ((packageName.contains("com.fongmi.android.tv") || packageName.contains("com.layaboxhmhz.gamehmhz.okys")) && lowerCase.equals("videoactivity")) {
            if (f(activity, "danmuSetting") != null) {
                return "ok_mobile";
            }
            if (f(activity, "actionLayout") != null) {
                return "ok_tv";
            }
        } else {
            if ((packageName.contains("com.huawei.himovceie") || packageName.contains("com.github")) && lowerCase.equals("detailactivity")) {
                return "tvbox_tv";
            }
            if (packageName.contains(".ysc") && lowerCase.equals("playactivity")) {
                return "tvbox_mobile";
            }
        }
        return null;
    }

    protected final void e() {
        View view;
        ImageView imageView = this.e;
        if (imageView != null) {
            ViewGroup viewGroup = (ViewGroup) imageView.getParent();
            if (viewGroup != null && viewGroup.findViewWithTag("aw_danmu_search_button") != null) {
                return;
            }
            this.c = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.github.catvod.spider.merge.AB.o.d
                public final C0101e a;

                {
                    this.a = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C0101e.a(this.a);
                }
            };
            view = this.e;
        } else {
            ViewGroup viewGroup2 = this.f;
            if (viewGroup2 == null || viewGroup2.findViewWithTag("aw_danmu_search_button") != null) {
                return;
            }
            this.c = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.github.catvod.spider.merge.AB.o.d
                public final C0101e a;

                {
                    this.a = this;
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C0101e.a(this.a);
                }
            };
            view = this.f;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.c);
    }

    protected final boolean h() {
        Activity activity = this.a;
        return activity == null || activity.isFinishing() || this.a.isDestroyed();
    }
}
