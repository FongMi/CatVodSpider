package com.github.catvod.spider.merge.AB.o;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.AB.b.RunnableC0083d;
import com.github.catvod.spider.merge.AB.b.RunnableC0084e;
import com.github.catvod.spider.merge.AB.b.RunnableC0085f;
import com.github.catvod.spider.merge.AB.b.RunnableC0086g;
import com.github.catvod.spider.merge.m.C0603l;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.AB.o.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0113q {
    public static int currentPlatformType;
    private final Activity a;
    private ArrayAdapter<String> d;
    private AlertDialog f;
    private ListView g;
    private TextView h;
    private List<String> b = new ArrayList();
    public List<String> c = new ArrayList();
    private int e = 0;
    private List<Button> i = new ArrayList();
    private final String[] j = {"腾讯", "爱奇艺", "优酷", "芒果", "哔哩", "人人", "韩剧", "西瓜", "乐视", "埋堆堆"};
    private final ExecutorService k = Executors.newSingleThreadExecutor();

    public C0113q(Activity activity) {
        this.a = activity;
    }

    public static /* synthetic */ void a(C0113q c0113q) {
        c0113q.getClass();
        c0113q.t(true, true);
        c0113q.v();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public static /* synthetic */ void c(final C0113q c0113q, final String str, int i) {
        String str2;
        c0113q.getClass();
        if (i < 0 || i >= c0113q.b.size()) {
            return;
        }
        final String str3 = (String) c0113q.b.get(i);
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        Iterator it = c0113q.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str2 = null;
                break;
            }
            str2 = (String) it.next();
            if (str2 != null && str2.startsWith(str3)) {
                break;
            }
        }
        if (str2 != null) {
            str3 = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        final String[] strArrSplit = str3.split("\\|");
        boolean z = str3.contains("http");
        if (str3.contains("vodid")) {
            z = true;
        }
        if (!z) {
            new Thread(new Runnable(c0113q, strArrSplit, str3) { // from class: com.github.catvod.spider.merge.AB.o.o
                public final C0113q a;
                public final String[] b;
                public final String c;

                {
                    this.a = c0113q;
                    this.b = strArrSplit;
                    this.c = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    List<String> listJuhe;
                    C0113q c0113q2 = this.a;
                    String[] strArr = this.b;
                    String str4 = this.c;
                    c0113q2.getClass();
                    String str5 = strArr[0];
                    if ("腾讯".equals(str5) || "优酷".equals(str5) || "芒果".equals(str5) || "爱奇艺".equals(str5) || "哔哩".equals(str5) || "人人".equals(str5) || "韩剧".equals(str5) || "西瓜".equals(str5) || "乐视".equals(str5) || "埋堆堆".equals(str5)) {
                        try {
                            listJuhe = K.juhe(str4);
                        } catch (Exception e) {
                            e.printStackTrace();
                            Init.run(new RunnableC0085f(c0113q2, 4));
                            return;
                        }
                    } else {
                        listJuhe = Collections.emptyList();
                    }
                    if (listJuhe == null || listJuhe.isEmpty()) {
                        Init.run(new RunnableC0084e(c0113q2, 3));
                    } else {
                        Init.run(new RunnableC0086g(c0113q2, listJuhe, 2));
                    }
                }
            }).start();
            return;
        }
        SpiderDebug.log("选中:" + strArrSplit[1]);
        new Thread(new Runnable(c0113q, str, strArrSplit) { // from class: com.github.catvod.spider.merge.AB.o.n
            public final C0113q a;
            public final String b;
            public final String[] c;

            {
                this.a = c0113q;
                this.b = str;
                this.c = strArrSplit;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0113q.n(this.a, this.b, this.c);
            }
        }).start();
        c0113q.f.dismiss();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void d(C0113q c0113q, List list, Runnable runnable) {
        int i = currentPlatformType;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? i != 8 ? i != 9 ? "腾讯" : "埋堆堆" : "乐视" : "西瓜" : "韩剧" : "人人" : "哔哩" : "芒果" : "优酷" : "爱奇艺";
        if (list != null && !list.isEmpty()) {
            boolean z = false;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && str2.contains(str)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        c0113q.b.clear();
        if (list != null && !list.isEmpty()) {
            c0113q.b.addAll(list);
        }
        c0113q.d.notifyDataSetChanged();
        c0113q.v();
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void e(C0113q c0113q, EditText editText) {
        c0113q.getClass();
        String strTrim = editText.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim)) {
            C0603l.a("searchvodname", strTrim);
        }
        int i = 0;
        if (TextUtils.isEmpty(strTrim)) {
            Toast.makeText(c0113q.a, "请输入关键词", 0).show();
            return;
        }
        c0113q.s(editText);
        c0113q.t(true, true);
        c0113q.q(strTrim, c0113q.e, new RunnableC0107k(c0113q, i));
    }

    public static /* synthetic */ void f(C0113q c0113q) {
        c0113q.getClass();
        c0113q.t(true, true);
        c0113q.v();
    }

    public static /* synthetic */ void h(C0113q c0113q) {
        c0113q.getClass();
        c0113q.t(true, true);
        c0113q.v();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<android.widget.Button>] */
    public static /* synthetic */ void i(C0113q c0113q, int i, Button button, int i2, EditText editText, HorizontalScrollView horizontalScrollView) {
        if (c0113q.e == i) {
            return;
        }
        c0113q.e = i;
        for (Button button2 : c0113q.i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            gradientDrawable.setCornerRadius(100000.0f);
            button2.setBackground(gradientDrawable);
            button2.setTextColor(-12303292);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-4464901);
        gradientDrawable2.setCornerRadius(100000.0f);
        button.setBackground(gradientDrawable2);
        button.setTextColor(-12303292);
        String strTrim = editText.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            Toast.makeText(c0113q.a, "请输入关键词", 0).show();
            return;
        }
        c0113q.s(editText);
        c0113q.t(true, true);
        c0113q.q(strTrim, c0113q.e, new RunnableC0083d(c0113q, 7));
        horizontalScrollView.smoothScrollTo(Math.max(button.getLeft() - ((horizontalScrollView.getWidth() - button.getWidth()) / 2), 0), 0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void l(C0113q c0113q, List list) {
        c0113q.b.clear();
        c0113q.b.addAll(list);
        c0113q.d.notifyDataSetChanged();
        ListView listView = c0113q.g;
        if (listView != null) {
            listView.setSelection(0);
        }
        c0113q.v();
    }

    public static /* synthetic */ void m(C0113q c0113q) {
        Window window = c0113q.f.getWindow();
        if (window != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            c0113q.a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = c0113q.a.getResources().getConfiguration().orientation == 2 ? (int) (((double) i) * 0.5d) : (int) (((double) i) * 0.97d);
            int iR = c0113q.r(309);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.y = 50;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(i2, iR);
            window.setWindowAnimations(R.style.Theme.NoTitleBar);
            window.setDimAmount(0.5f);
        }
    }

    public static /* synthetic */ void n(C0113q c0113q, String str, String[] strArr) {
        c0113q.getClass();
        int i = 1;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("searchKey", str);
            jSONObject.put("details", new JSONArray((Collection) c0113q.b));
            G.c("danmukey", jSONObject.toString());
            com.github.catvod.spider.merge.AB.m.c.k(String.format("%s/action?do=refresh&type=danmaku&path=%s", Proxy.getOriginUrl(), URLEncoder.encode(String.format("http://127.0.0.1:9978/proxy?do=danmu&site=js&url=%s", strArr.length > 1 ? strArr[1] : ""), "UTF-8")));
            String strB = C0603l.b("searchvodname");
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            String strB2 = C0603l.b("danmucache");
            if (TextUtils.isEmpty(strB2)) {
                strB2 = "{}";
            }
            JSONObject jSONObject2 = new JSONObject(strB2);
            jSONObject2.put(str, strB);
            if (jSONObject2.length() > 20) {
                Iterator<String> itKeys = jSONObject2.keys();
                ArrayList arrayList = new ArrayList();
                while (itKeys.hasNext()) {
                    arrayList.add(itKeys.next());
                }
                JSONObject jSONObject3 = new JSONObject();
                for (int size = arrayList.size() - 20; size < arrayList.size(); size++) {
                    String str2 = (String) arrayList.get(size);
                    jSONObject3.put(str2, jSONObject2.getString(str2));
                }
                jSONObject2 = jSONObject3;
            }
            C0603l.a("danmucache", jSONObject2.toString());
            C0603l.a("searchvodname", "");
        } catch (Exception e) {
            e.printStackTrace();
            Init.run(new RunnableC0107k(c0113q, i));
        }
    }

    public static void o(C0113q c0113q, int i, String str, Runnable runnable) {
        currentPlatformType = i;
        new Thread(new cc(c0113q, i, str, runnable)).start();
    }

    private void q(final String str, final int i, final Runnable runnable) {
        this.k.submit(new Runnable(this, i, str, runnable) { // from class: com.github.catvod.spider.merge.AB.o.m
            public final C0113q a;
            public final int b;
            public final String c;
            public final Runnable d;

            {
                this.a = this;
                this.b = i;
                this.c = str;
                this.d = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0113q.o(this.a, this.b, this.c, this.d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int r(int i) {
        return Math.round(i * this.a.getResources().getDisplayMetrics().density);
    }

    private void s(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService("input_method");
        if (inputMethodManager == null || view == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<android.widget.Button>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<android.widget.Button>] */
    private void t(boolean... zArr) {
        for (int i = 0; i < this.i.size(); i++) {
            if (i < zArr.length) {
                ((Button) this.i.get(i)).setEnabled(zArr[i]);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    private void v() {
        ?? r0 = this.b;
        if (r0 != 0 && !r0.isEmpty()) {
            this.g.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            this.g.setVisibility(8);
            this.h.setVisibility(0);
            this.h.setText("未搜索到影视信息...");
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void u(final String str) {
        char c;
        int iR = r(12);
        int color = Color.parseColor("#000000");
        LinearLayout linearLayout = new LinearLayout(this.a);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(iR, iR, iR, iR);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadii(new float[]{r(30), r(30), r(30), r(30), 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(this.a);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(this.a);
        int i = 0;
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(linearLayout3);
        final EditText editText = new EditText(this.a);
        editText.setHint("请输入关键词");
        editText.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        editText.setSingleLine(true);
        editText.setImeOptions(3);
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
        editText.setTextColor(color);
        Button button = new Button(this.a);
        button.setText("弹幕搜索");
        button.setTextColor(-12303292);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-4464901);
        gradientDrawable2.setCornerRadius(100000.0f);
        button.setBackground(gradientDrawable2);
        int iR2 = r(4);
        button.setPadding(iR2, iR2, iR2, iR2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, r(-2));
        layoutParams.leftMargin = r(8);
        button.setLayoutParams(layoutParams);
        linearLayout3.addView(editText);
        linearLayout3.addView(button);
        button.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.github.catvod.spider.merge.AB.o.q.2
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                TextView textView = (TextView) view;
                if (z) {
                    textView.setTextColor(-1);
                } else {
                    textView.setTextColor(-12303292);
                }
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(100000.0f);
                gradientDrawable3.setColor(z ? -14575885 : -4464901);
                view.setBackground(gradientDrawable3);
            }
        });
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.a);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        int iR3 = r(40);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iR3);
        int iR4 = r(5);
        layoutParams2.topMargin = iR4;
        layoutParams2.bottomMargin = iR4;
        horizontalScrollView.setLayoutParams(layoutParams2);
        linearLayout2.addView(horizontalScrollView);
        LinearLayout linearLayout4 = new LinearLayout(this.a);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(new ViewGroup.LayoutParams(iR3, iR3));
        horizontalScrollView.addView(linearLayout4);
        int iR5 = r(-12303292);
        int iR6 = r(8);
        int i2 = 0;
        while (true) {
            String[] strArr = this.j;
            if (i2 >= strArr.length) {
                break;
            }
            String str2 = strArr[i2];
            final Button button2 = new Button(this.a);
            button2.setText(str2);
            button2.setBackgroundColor(i);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            if (i2 == 0) {
                gradientDrawable3.setColor(-4464901);
                c = 20;
            } else {
                c = 20;
                gradientDrawable3.setColor(i);
            }
            gradientDrawable3.setCornerRadius(100000.0f);
            button2.setBackground(gradientDrawable3);
            button2.setTextColor(-12303292);
            button2.setAllCaps(true);
            button2.setPadding(iR5, iR6, iR5, iR6);
            button2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            LinearLayout linearLayout5 = linearLayout4;
            final HorizontalScrollView horizontalScrollView2 = horizontalScrollView;
            final int i3 = i2;
            final int i4 = color;
            button2.setOnClickListener(new View.OnClickListener(this, i3, button2, i4, editText, horizontalScrollView2) { // from class: com.github.catvod.spider.merge.AB.o.g
                public final C0113q a;
                public final int b;
                public final Button c;
                public final int d;
                public final EditText e;
                public final HorizontalScrollView f;

                {
                    this.a = this;
                    this.b = i3;
                    this.c = button2;
                    this.d = i4;
                    this.e = editText;
                    this.f = horizontalScrollView2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0113q.i(this.a, this.b, this.c, this.d, this.e, this.f);
                }
            });
            button2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.github.catvod.spider.merge.AB.o.q.1
                final C0113q a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    TextView textView = (TextView) view;
                    if (z) {
                        textView.setTextColor(-1);
                    } else {
                        textView.setTextColor(-12303292);
                    }
                    GradientDrawable gradientDrawable4 = new GradientDrawable();
                    gradientDrawable4.setCornerRadius(100000.0f);
                    gradientDrawable4.setColor(z ? -14575885 : 0);
                    view.setBackground(gradientDrawable4);
                }
            });
            linearLayout5.addView(button2);
            this.i.add(button2);
            i2++;
            linearLayout4 = linearLayout5;
            button = button;
            iR5 = iR5;
            horizontalScrollView = horizontalScrollView2;
            iR6 = iR6;
            color = color;
            i = 0;
        }
        final Button button3 = button;
        r(-1);
        TextView textView = new TextView(this.a);
        this.h = textView;
        textView.setText("未搜索到影视信息...");
        this.h.setTextColor(-7829368);
        this.h.setGravity(17);
        this.h.setLayoutParams(new LinearLayout.LayoutParams(-1, 800));
        this.h.setVisibility(8);
        linearLayout2.addView(this.h);
        ListView listView = new ListView(this.a);
        this.g = listView;
        listView.setLayoutParams(new LinearLayout.LayoutParams(-1, 800));
        this.g.setDivider(null);
        this.g.setDividerHeight(0);
        this.g.setVisibility(8);
        linearLayout2.addView(this.g);
        C0112p c0112p = new C0112p(this, this.a, this.b);
        this.d = c0112p;
        this.g.setAdapter((ListAdapter) c0112p);
        this.f = new AlertDialog.Builder(this.a).setView(linearLayout).create();
        Window window = this.f.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setShape(0);
            gradientDrawable4.setColor(0);
            gradientDrawable4.setCornerRadius(r(0));
            window.setBackgroundDrawable(gradientDrawable4);
        }
        button3.setOnClickListener(new View.OnClickListener(this, editText) { // from class: com.github.catvod.spider.merge.AB.o.h
            public final C0113q a;
            public final EditText b;

            {
                this.a = this;
                this.b = editText;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0113q.e(this.a, this.b);
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener(button3) { // from class: com.github.catvod.spider.merge.AB.o.j
            public final Button a;

            {
                this.a = button3;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i5, KeyEvent keyEvent) {
                Button button4 = this.a;
                if (i5 != 3) {
                    return false;
                }
                button4.performClick();
                return true;
            }
        });
        this.g.setOnItemClickListener(new AdapterView.OnItemClickListener(this, str) { // from class: com.github.catvod.spider.merge.AB.o.i
            public final C0113q a;
            public final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
                C0113q.c(this.a, this.b, i5);
            }
        });
        this.f.show();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        t(true, true);
        q(str, this.e, new com.github.catvod.spider.merge.AB.b.O(this, 3));
    }
}
