package com.github.catvod.en;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;
import com.github.catvod.spider.Init;
import com.github.catvod.bean.VodItem;
import com.github.catvod.spider.merge.i0.m;
import com.github.catvod.utils.server.Server;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class BaseApi {
    public String a;
    private AlertDialog b;
    public String c;
    public Boolean d;
    public Boolean e;
    public String f;
    public EditText g;
    public ConcurrentHashMap<String, String> h;
    public String i;

    /* JADX INFO: renamed from: com.github.catvod.en.BaseApi$1, reason: invalid class name */
    class AnonymousClass1 implements Comparator<String> {
        AnonymousClass1() {
        }

        private int a(String str) {
            String[] strArrSplit = str.replace("ms", "").split("###");
            if (strArrSplit[0].equals("auto")) {
                return Integer.MIN_VALUE;
            }
            if (strArrSplit.length >= 2 && !strArrSplit[1].isEmpty()) {
                try {
                    return Integer.parseInt(strArrSplit[1]);
                } catch (NumberFormatException unused) {
                }
            }
            return Integer.MAX_VALUE;
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            int iA = a(str);
            int iA2 = a(str2);
            if (iA == iA2) {
                return 0;
            }
            return iA < iA2 ? -1 : 1;
        }
    }

    class Loader {
        static volatile BaseApi a = new BaseApi();
    }

    @FunctionalInterface
    public interface Task {
        void execute(String str);
    }

    public static native String MD5(String str, String str2);

    public static native /* synthetic */ void a(BaseApi baseApi, String str);

    public static native void ab();

    public static native void b(Activity activity, String str);

    public static native /* synthetic */ void c(BaseApi baseApi, String str);

    public static native byte[] calculateMethodHash(byte[] bArr);

    public static native byte[] convertFileToByteArray(String str);

    public static native Drawable createRoundedBackground(int i, int i2);

    public static native /* synthetic */ void d(Activity activity);

    public static native /* synthetic */ void e(BaseApi baseApi, String str);

    public static native /* synthetic */ void f(Activity activity);

    public static native VodItem fakeVod(List list, String str);

    private static native void g(Activity activity);

    public static native BaseApi get();

    public static native String getAppSignature(Context context);

    public static native String getDexPathMatcher();

    private native void h(LinearLayout linearLayout, int i);

    private static native void i(Activity activity, String str);

    public static native boolean isDebuggable(Context context);

    public static native boolean isOk(String str);

    private static native TextView j(Activity activity, View view);

    private native void k();

    private static native int l(int i);

    private static native List m(View view, List list);

    public static native boolean monitorCurrentActivityButtons();

    private static native View n(View view);

    private static native LinearLayout o(String str);

    private static native void p(Activity activity);

    private static native void q(View view, View view2);

    private static native void r(Activity activity, String str);

    private native void s(String str);

    public native void downloadFileWithDownloadManager(String str, String str2, Map map);

    public native void getDexPathList();

    public native void getDexPathList3();

    public native File getNetPanDownCache();

    public native File getNetPanIsoCache();

    public native File getNetPanOrderCache();

    public native File getSubscriptionUrlCache();

    public native EditText initEditText();

    public native void onClashUiNeutral();

    public native void onSubscriptionUrlPositive(String str);

    public native void openBrower(String str, String str2);

    public native void openFile(String str);

    public native void setNetPanDown();

    public native void setNetPanIso();

    public native void setNetPanOrder(String str, boolean z);

    public void showInputWithOption(String str, DialogInterface.OnClickListener onClickListener, final Task task, String str2, String str3, List<String> list) {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            boolean z = true;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            int i = 16;
            linearLayout.setPadding(m.f(16), m.f(16), m.f(16), m.f(16));
            ScrollView scrollView = new ScrollView(Init.context());
            LinearLayout linearLayout2 = new LinearLayout(Init.context());
            linearLayout2.setOrientation(1);
            for (final String str4 : list) {
                TextView textView = new TextView(Init.context());
                textView.setText(str4);
                textView.setPadding(i, i, i, i);
                textView.setGravity(17);
                textView.setTypeface(null, 1);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(-3355444);
                gradientDrawable.setCornerRadius(8.0f);
                gradientDrawable.setStroke(2, -16777216);
                if (Build.VERSION.SDK_INT >= 21) {
                    textView.setBackground(new RippleDrawable(ColorStateList.valueOf(-7829368), gradientDrawable, null));
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(0, 1, 0, 8);
                textView.setLayoutParams(layoutParams);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.d0.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseApi baseApi = this.b;
                        baseApi.g.setText(str4);
                    }
                });
                linearLayout2.addView(textView);
                i = 16;
            }
            scrollView.addView(linearLayout2);
            if (!list.isEmpty()) {
                scrollView.setVerticalScrollBarEnabled(true);
                scrollView.setScrollbarFadingEnabled(false);
            }
            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, m.f(list.size() > 3 ? 200 : 100)));
            linearLayout.addView(scrollView);
            h(linearLayout, m.f(10));
            final EditText editTextInitEditText = get().initEditText();
            editTextInitEditText.setHint(str3);
            editTextInitEditText.setPadding(m.f(8), m.f(8), m.f(8), m.f(8));
            editTextInitEditText.setBackground(createRoundedBackground(-3355444, m.f(8)));
            linearLayout.addView(editTextInitEditText, new LinearLayout.LayoutParams(-1, -2));
            h(linearLayout, m.f(10));
            linearLayout.addView(o(Server.u()), new LinearLayout.LayoutParams(-1, -2));
            TextView textView2 = new TextView(Init.context());
            textView2.setText(str2);
            textView2.setGravity(17);
            textView2.setPadding(m.f(1), m.f(16), m.f(1), m.f(1));
            textView2.setTextSize(20.0f);
            textView2.setTypeface(null, 1);
            AlertDialog.Builder builder = new AlertDialog.Builder(Init.getConfigActivity());
            builder.setCustomTitle(textView2).setView(linearLayout).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.d0.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    BaseApi baseApi = this.a;
                    EditText editText = editTextInitEditText;
                    Task task2 = task;
                    baseApi.getClass();
                    String string = editText.getText().toString();
                    if (string.isEmpty()) {
                        Toast.makeText(Init.context(), "输入不能为空", 0).show();
                    } else {
                        task2.execute(string);
                    }
                }
            });
            if (onClickListener != null) {
                z = false;
            }
            if (!z) {
                builder.setNeutralButton(str, onClickListener);
            }
            AlertDialog alertDialogCreate = builder.create();
            this.b = alertDialogCreate;
            alertDialogCreate.show();
            int width = ((WindowManager) Init.context().getSystemService("window")).getDefaultDisplay().getWidth();
            Window window = this.b.getWindow();
            double d = width;
            Double.isNaN(d);
            Double.isNaN(d);
            window.setLayout((int) (d * 0.9d), -2);
        } catch (Exception e) {
            m.w("当前节点为" + e);
            e.printStackTrace();
        }
    }

    public native void showNetPanOrderInputWithOption();

    public native void showSingBoxInputWithOption();

    public native void showSubscriptionUrlInput();

    public void showThreadInputWithQRCode(String str, String str2, String str3, String str4, EditText editText, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        try {
            LinearLayout linearLayout = new LinearLayout(Init.context());
            boolean z = true;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(m.f(24), m.f(24), m.f(24), m.f(24));
            linearLayout.setBackground(createRoundedBackground(-1, m.f(16)));
            TextView textView = new TextView(Init.context());
            textView.setText(str);
            textView.setTextSize(18.0f);
            textView.setTextColor(-16777216);
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setGravity(17);
            linearLayout.addView(textView);
            ScrollView scrollView = new ScrollView(Init.context());
            TextView textView2 = new TextView(Init.context());
            textView2.setText(str2);
            textView2.setTextSize(14.0f);
            textView2.setTextColor(-7829368);
            textView2.setGravity(17);
            scrollView.addView(textView2);
            if (e.d(str2)) {
                scrollView.setVerticalScrollBarEnabled(true);
                scrollView.setScrollbarFadingEnabled(false);
            }
            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, m.f((!e.d(str2) || str2.length() <= 200) ? 50 : 150)));
            linearLayout.addView(scrollView);
            h(linearLayout, m.f(5));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            frameLayout.addView(editText, new FrameLayout.LayoutParams(-1, -2));
            linearLayout.addView(frameLayout);
            h(linearLayout, m.f(24));
            linearLayout.addView(o(str4));
            AlertDialog.Builder builder = new AlertDialog.Builder(Init.getConfigActivity());
            if (onClickListener2 != null) {
                z = false;
            }
            if (!z) {
                builder.setNeutralButton(str3, onClickListener2);
            }
            this.b = builder.setView(linearLayout).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, onClickListener).show();
        } catch (Exception unused) {
        }
    }
}
