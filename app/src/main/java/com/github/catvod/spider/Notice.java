package com.github.catvod.spider;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.util.Base64;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.I.B;
import com.github.catvod.spider.merge.I.RunnableC0746b0;
import com.github.catvod.spider.merge.h0.C1230a;
import com.github.catvod.spider.merge.i0.GeneralUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/b6c77a94381e3ab8a4e2fa73d7b9922b/classes.dex */
public class Notice extends Spider {
    private C1230a a;
    private String b;
    private int c;
    private String d;
    private final Runnable e = new Runnable() { // from class: com.github.catvod.spider.Notice.1
        @Override // java.lang.Runnable
        public void run() {
            Random random = new Random();
            Notice.this.a.setTextColor(Color.argb(255, random.nextInt(128), random.nextInt(128), random.nextInt(128)));
            Notice.d(Notice.this);
        }
    };

    public static void a(Notice notice) {
        notice.getClass();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            sb.append("                                        ");
            sb.append(notice.d);
        }
        C1230a c1230a = new C1230a(Init.context());
        notice.a = c1230a;
        c1230a.setTextSize(20.0f);
        notice.a.a(notice.c);
        notice.a.setText(sb.toString());
        notice.a.setTypeface(null, 1);
        notice.a.setPadding(0, GeneralUtils.f(16), 0, GeneralUtils.f(16));
        notice.a.setBackgroundColor(Color.argb(200, 255, 255, 255));
        notice.a.b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        GeneralUtils.e(notice.a, layoutParams);
        Init.run(notice.e, 500);
        Init.run(new B(notice, 6), notice.c * 1000);
    }

    public static void b(Notice notice) {
        C1230a c1230a = notice.a;
        List<String> list = GeneralUtils.a;
        try {
            ((ViewGroup) Init.getActivity().getWindow().getDecorView().findViewById(R.id.content)).removeView(c1230a);
        } catch (Exception e) {
            StringUtils.printStackTrace();
        }
    }

    static void d(Notice notice) {
        Init.run(notice.e, 500);
    }

    public static void show(String str) {
        try {
            Notice notice = new Notice();
            notice.init(null, str);
            notice.homeContent(false);
        } catch (Exception unused) {
        }
    }

    public String homeContent(boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault());
        boolean z2 = false;
        JSONObject jSONObject = new JSONObject(this.VodCategory.startsWith("http") ? com.github.catvod.spider.merge.f0.HttpClient.l(this.b) : new String(Base64.decode(this.b, 0)));
        this.d = jSONObject.optString("msg");
        this.c = jSONObject.optInt("duration", 30);
        String strOptString = jSONObject.optString("date");
        if (this.FilterGroup.length() > 0 && (strOptString.isEmpty() || new Date().after(simpleDateFormat.parse(strOptString)))) {
            z2 = true;
        }
        if (!z2) {
            return "";
        }
        Init.run(new RunnableC0746b0(this, 3), 500);
        return "";
    }

    public void init(Context context, String str) {
        this.b = str;
    }
}
