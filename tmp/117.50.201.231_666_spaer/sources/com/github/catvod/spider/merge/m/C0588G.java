package com.github.catvod.spider.merge.m;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.AmuBiliV2;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.merge.b.C0536B;
import com.github.catvod.spider.merge.b.C0545i;
import com.github.catvod.spider.merge.b.C0546j;
import com.github.catvod.spider.merge.b.C0548l;
import com.github.catvod.spider.merge.b.RunnableC0540d;
import com.github.catvod.spider.merge.f.C0563b;
import com.github.catvod.spider.merge.k.C0575b;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0588G {
    public static AlertDialog currentDialog;
    static int lastFocusPosition;
    static int lastFocusViewId;
    static ListView listView;
    static boolean needRestoreFocus;
    public static int restoreRetryCount;
    private AlertDialog a;
    private String b;
    private ScheduledExecutorService c;
    private boolean d;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string = ((TextView) view).getText().toString();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            intent.addFlags(268435456);
            Init.context().startActivity(intent);
            Application applicationContext = Init.context();
            ((ClipboardManager) applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("URL", string));
            Toast.makeText(applicationContext, "链接已复制并打开", 0).show();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$8, reason: invalid class name */
    /* synthetic */ class AnonymousClass8 implements View.OnClickListener {
        AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0588G.this.dismissAlertDialog();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$ArrowAdapter */
    class ArrowAdapter extends ArrayAdapter {
        public final ArrayList<String> items;

        ArrowAdapter(Context context, int i, ArrayList arrayList) {
            super(context, i, arrayList);
            this.items = arrayList;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(final int i, View view, ViewGroup viewGroup) {
            TextView textView;
            RelativeLayout relativeLayout = view == null ? new RelativeLayout(viewGroup.getContext()) : (RelativeLayout) view;
            relativeLayout.setFocusable(false);
            relativeLayout.setDescendantFocusability(262144);
            if (relativeLayout.getChildCount() == 0) {
                textView = new TextView(viewGroup.getContext());
                textView.setId(R.id.text1);
                textView.setTypeface(Typeface.create("monospace", 0));
                textView.setGravity(17);
                textView.setTextSize(16.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(15);
                textView.setLayoutParams(layoutParams);
                TextView textView2 = new TextView(viewGroup.getContext());
                textView2.setId(1);
                textView2.setText("▲");
                textView2.setTextSize(18.0f);
                textView2.setFocusable(true);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(11);
                layoutParams2.addRule(15);
                layoutParams2.rightMargin = (int) (50.0f * viewGroup.getContext().getResources().getDisplayMetrics().density);
                textView2.setLayoutParams(layoutParams2);
                TextView textView3 = new TextView(viewGroup.getContext());
                textView3.setId(2);
                textView3.setText("▼");
                textView3.setTextSize(18.0f);
                textView3.setFocusable(true);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(11);
                layoutParams3.addRule(15);
                layoutParams3.rightMargin = (int) (15.0f * viewGroup.getContext().getResources().getDisplayMetrics().density);
                textView3.setLayoutParams(layoutParams3);
                relativeLayout.addView(textView);
                relativeLayout.addView(textView2);
                relativeLayout.addView(textView3);
                relativeLayout.setLayoutParams(new AbsListView.LayoutParams(-1, (int) (40.0f * relativeLayout.getContext().getResources().getDisplayMetrics().density)));
            } else {
                textView = (TextView) relativeLayout.findViewById(R.id.text1);
            }
            textView.setText(this.items.get(i));
            TextView textView4 = (TextView) relativeLayout.findViewById(1);
            final boolean z = true;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.ArrowAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int size = ArrowAdapter.this.items.size();
                    int i2 = i;
                    if (z) {
                        if (i2 > 0) {
                            String str = ArrowAdapter.this.items.get(i2 - 1);
                            ArrowAdapter.this.items.set(i2 - 1, ArrowAdapter.this.items.get(i2));
                            ArrowAdapter.this.items.set(i2, str);
                            C0588G.lastFocusPosition = i2 - 1;
                            C0588G.lastFocusViewId = 1;
                            C0588G.needRestoreFocus = true;
                            C0588G.restoreRetryCount = 0;
                            ArrowAdapter.this.notifyDataSetChanged();
                            ListView listView = C0588G.listView;
                            if (listView != null) {
                                listView.post(new FocusRestorer());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i2 < size - 1) {
                        String str2 = ArrowAdapter.this.items.get(i2 + 1);
                        ArrowAdapter.this.items.set(i2 + 1, ArrowAdapter.this.items.get(i2));
                        ArrowAdapter.this.items.set(i2, str2);
                        C0588G.lastFocusPosition = i2 + 1;
                        C0588G.lastFocusViewId = 2;
                        C0588G.needRestoreFocus = true;
                        C0588G.restoreRetryCount = 0;
                        ArrowAdapter.this.notifyDataSetChanged();
                        ListView listView2 = C0588G.listView;
                        if (listView2 != null) {
                            listView2.post(new FocusRestorer());
                        }
                    }
                }
            });
            textView4.setOnFocusChangeListener(new View.OnFocusChangeListener(textView4) { // from class: com.github.catvod.spider.merge.m.G.ArrowAdapter.2
                private int originalColor;
                final /* synthetic */ TextView val$textView;

                {
                    this.val$textView = textView4;
                    this.originalColor = textView4.getCurrentTextColor();
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z2) {
                    TextView textView5 = this.val$textView;
                    if (z2) {
                        textView5.setTextColor(-16776961);
                    } else {
                        textView5.setTextColor(this.originalColor);
                    }
                }
            });
            final int i2 = 1;
            textView4.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.merge.m.G.ArrowAdapter.3
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view2, int i3, KeyEvent keyEvent) {
                    View viewFindViewById;
                    View viewFindViewById2;
                    Button button;
                    View childAt;
                    View viewFindViewById3;
                    int i4;
                    int firstVisiblePosition;
                    View childAt2;
                    View viewFindViewById4;
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (i3 == 19) {
                        ListView listView = C0588G.listView;
                        if (listView == null || (i4 = i) <= 0 || (firstVisiblePosition = (i4 - 1) - listView.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= listView.getChildCount() || (childAt2 = listView.getChildAt(firstVisiblePosition)) == null || (viewFindViewById4 = ((ViewGroup) childAt2).findViewById(i2)) == null) {
                            return true;
                        }
                        viewFindViewById4.requestFocus();
                        return true;
                    }
                    if (i3 != 20) {
                        if (i3 == 21) {
                            if (i2 != 2 || (viewFindViewById2 = ((ViewGroup) view2.getParent()).findViewById(1)) == null) {
                                return true;
                            }
                            viewFindViewById2.requestFocus();
                            return true;
                        }
                        if (i3 != 22) {
                            return false;
                        }
                        if (i2 != 1 || (viewFindViewById = ((ViewGroup) view2.getParent()).findViewById(2)) == null) {
                            return true;
                        }
                        viewFindViewById.requestFocus();
                        return true;
                    }
                    ListView listView2 = C0588G.listView;
                    if (listView2 == null) {
                        return false;
                    }
                    int i5 = i + 1;
                    if (i5 >= ArrowAdapter.this.items.size()) {
                        AlertDialog alertDialog = C0588G.currentDialog;
                        if (alertDialog == null || (button = alertDialog.getButton(-1)) == null) {
                            return false;
                        }
                        button.requestFocus();
                        return true;
                    }
                    int firstVisiblePosition2 = i5 - listView2.getFirstVisiblePosition();
                    if (firstVisiblePosition2 < 0 || firstVisiblePosition2 >= listView2.getChildCount() || (childAt = listView2.getChildAt(firstVisiblePosition2)) == null || (viewFindViewById3 = ((ViewGroup) childAt).findViewById(i2)) == null) {
                        return true;
                    }
                    viewFindViewById3.requestFocus();
                    return true;
                }
            });
            TextView textView5 = (TextView) relativeLayout.findViewById(2);
            final boolean z2 = false;
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.ArrowAdapter.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    int size = ArrowAdapter.this.items.size();
                    int i22 = i;
                    if (z2) {
                        if (i22 > 0) {
                            String str = ArrowAdapter.this.items.get(i22 - 1);
                            ArrowAdapter.this.items.set(i22 - 1, ArrowAdapter.this.items.get(i22));
                            ArrowAdapter.this.items.set(i22, str);
                            C0588G.lastFocusPosition = i22 - 1;
                            C0588G.lastFocusViewId = 1;
                            C0588G.needRestoreFocus = true;
                            C0588G.restoreRetryCount = 0;
                            ArrowAdapter.this.notifyDataSetChanged();
                            ListView listView = C0588G.listView;
                            if (listView != null) {
                                listView.post(new FocusRestorer());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i22 < size - 1) {
                        String str2 = ArrowAdapter.this.items.get(i22 + 1);
                        ArrowAdapter.this.items.set(i22 + 1, ArrowAdapter.this.items.get(i22));
                        ArrowAdapter.this.items.set(i22, str2);
                        C0588G.lastFocusPosition = i22 + 1;
                        C0588G.lastFocusViewId = 2;
                        C0588G.needRestoreFocus = true;
                        C0588G.restoreRetryCount = 0;
                        ArrowAdapter.this.notifyDataSetChanged();
                        ListView listView2 = C0588G.listView;
                        if (listView2 != null) {
                            listView2.post(new FocusRestorer());
                        }
                    }
                }
            });
            textView5.setOnFocusChangeListener(new View.OnFocusChangeListener(textView5) { // from class: com.github.catvod.spider.merge.m.G.ArrowAdapter.2
                private int originalColor;
                final /* synthetic */ TextView val$textView;

                {
                    this.val$textView = textView5;
                    this.originalColor = textView5.getCurrentTextColor();
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view2, boolean z22) {
                    TextView textView52 = this.val$textView;
                    if (z22) {
                        textView52.setTextColor(-16776961);
                    } else {
                        textView52.setTextColor(this.originalColor);
                    }
                }
            });
            final int i3 = 2;
            textView5.setOnKeyListener(new View.OnKeyListener() { // from class: com.github.catvod.spider.merge.m.G.ArrowAdapter.3
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view2, int i32, KeyEvent keyEvent) {
                    View viewFindViewById;
                    View viewFindViewById2;
                    Button button;
                    View childAt;
                    View viewFindViewById3;
                    int i4;
                    int firstVisiblePosition;
                    View childAt2;
                    View viewFindViewById4;
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (i32 == 19) {
                        ListView listView = C0588G.listView;
                        if (listView == null || (i4 = i) <= 0 || (firstVisiblePosition = (i4 - 1) - listView.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= listView.getChildCount() || (childAt2 = listView.getChildAt(firstVisiblePosition)) == null || (viewFindViewById4 = ((ViewGroup) childAt2).findViewById(i3)) == null) {
                            return true;
                        }
                        viewFindViewById4.requestFocus();
                        return true;
                    }
                    if (i32 != 20) {
                        if (i32 == 21) {
                            if (i3 != 2 || (viewFindViewById2 = ((ViewGroup) view2.getParent()).findViewById(1)) == null) {
                                return true;
                            }
                            viewFindViewById2.requestFocus();
                            return true;
                        }
                        if (i32 != 22) {
                            return false;
                        }
                        if (i3 != 1 || (viewFindViewById = ((ViewGroup) view2.getParent()).findViewById(2)) == null) {
                            return true;
                        }
                        viewFindViewById.requestFocus();
                        return true;
                    }
                    ListView listView2 = C0588G.listView;
                    if (listView2 == null) {
                        return false;
                    }
                    int i5 = i + 1;
                    if (i5 >= ArrowAdapter.this.items.size()) {
                        AlertDialog alertDialog = C0588G.currentDialog;
                        if (alertDialog == null || (button = alertDialog.getButton(-1)) == null) {
                            return false;
                        }
                        button.requestFocus();
                        return true;
                    }
                    int firstVisiblePosition2 = i5 - listView2.getFirstVisiblePosition();
                    if (firstVisiblePosition2 < 0 || firstVisiblePosition2 >= listView2.getChildCount() || (childAt = listView2.getChildAt(firstVisiblePosition2)) == null || (viewFindViewById3 = ((ViewGroup) childAt).findViewById(i3)) == null) {
                        return true;
                    }
                    viewFindViewById3.requestFocus();
                    return true;
                }
            });
            return relativeLayout;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$ArrowConfirm */
    class ArrowConfirm implements DialogInterface.OnClickListener {
        final /* synthetic */ ArrayList val$items;

        ArrowConfirm(ArrayList arrayList) {
            this.val$items = arrayList;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i != -1) {
                return;
            }
            try {
                File fileC = C0602k.c("/config.json");
                JSONObject jSONObject = new JSONObject();
                if (fileC.exists()) {
                    String strA = C0602k.a(fileC);
                    if (!strA.isEmpty() && strA.length() > 0) {
                        jSONObject = new JSONObject(strA);
                    }
                }
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                for (String str : this.val$items) {
                    if (!z) {
                        sb.append(",");
                    }
                    z = false;
                    sb.append(str);
                }
                jSONObject.put("panOrder", sb.toString());
                C0602k.c(fileC, jSONObject.toString());
                C0590I.i("排序已保存");
            } catch (Exception e) {
                C0590I.i("排序设置失败: " + e);
                Log.e("Config", "保存排序配置失败", e);
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$BackupTip */
    class BackupTip implements DialogInterface.OnClickListener {
        final /* synthetic */ Context val$context;

        BackupTip(Context context) {
            this.val$context = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Context context = this.val$context;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            int iC = C0590I.c(24);
            int iC2 = C0590I.c(20);
            linearLayout.setPadding(iC, iC2, iC, iC2);
            TextView textView = new TextView(context);
            textView.setText("提示");
            textView.setGravity(17);
            textView.setTextColor(-15066598);
            textView.setTextSize(24.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = C0590I.c(16);
            linearLayout.addView(textView, layoutParams);
            View view = new View(context);
            view.setBackgroundColor(-1512723);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C0590I.c(2));
            layoutParams2.bottomMargin = C0590I.c(12);
            linearLayout.addView(view, layoutParams2);
            TextView textView2 = new TextView(context);
            textView2.setText("🖥️ 电视端恢复数据步骤：\n\n1. 保持手机和电视在同一局域网内\n2. 打开电视端软件\n3. 点击\"推送\"\n4. 用手机浏览器扫描二维码\n5. 上传压缩包");
            textView2.setGravity(0);
            textView2.setTextColor(-10525848);
            textView2.setTextSize(14.0f);
            textView2.setLineSpacing(1.5f, 1.5f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.bottomMargin = C0590I.c(16);
            linearLayout.addView(textView2, layoutParams3);
            TextView textView3 = new TextView(context);
            textView3.setText("✓ 我知道了");
            textView3.setGravity(17);
            textView3.setTextColor(-15043608);
            textView3.setTextSize(16.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C0590I.c(24);
            layoutParams4.gravity = 1;
            linearLayout.addView(textView3, layoutParams4);
            final AlertDialog alertDialogShow = new AlertDialog.Builder(this.val$context).setView(linearLayout).setCancelable(true).show();
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.BackupTip.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    alertDialogShow.dismiss();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$CloudDialogClickListener */
    public class CloudDialogClickListener implements DialogInterface.OnClickListener {
        private final String cloudType;
        private final Context context;
        private final boolean enable;

        CloudDialogClickListener(Context context, boolean z, String str) {
            this.context = context;
            this.enable = z;
            this.cloudType = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0588G.updateCloudConfig(this.enable, this.context, this.cloudType);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$DeleteBackup */
    class DeleteBackup implements DialogInterface.OnClickListener {
        private final Context context;

        public DeleteBackup(Context context) {
            this.context = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            File file = new File("/sdcard/TVBoxBackup.zip");
            if (!file.exists()) {
                Toast.makeText(this.context, "备份文件不存在", 0).show();
            } else if (file.delete()) {
                Toast.makeText(this.context, "备份已删除", 0).show();
            } else {
                Toast.makeText(this.context, "删除备份失败", 0).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$FocusRestorer */
    class FocusRestorer implements Runnable {
        FocusRestorer() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView;
            View childAt;
            View viewFindViewById;
            if (C0588G.needRestoreFocus && (listView = C0588G.listView) != null) {
                int i = C0588G.lastFocusPosition;
                listView.setSelection(i);
                int firstVisiblePosition = i - listView.getFirstVisiblePosition();
                if (firstVisiblePosition >= 0 && firstVisiblePosition < listView.getChildCount() && (childAt = listView.getChildAt(firstVisiblePosition)) != null && (viewFindViewById = ((ViewGroup) childAt).findViewById(C0588G.lastFocusViewId)) != null && viewFindViewById.requestFocus()) {
                    C0588G.needRestoreFocus = false;
                    C0588G.restoreRetryCount = 0;
                    return;
                }
                int i2 = C0588G.restoreRetryCount;
                if (i2 >= 3) {
                    C0588G.needRestoreFocus = false;
                    C0588G.restoreRetryCount = 0;
                } else {
                    C0588G.restoreRetryCount = i2 + 1;
                    listView.post(new FocusRestorer());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$HomePageOption */
    public class HomePageOption implements DialogInterface.OnMultiChoiceClickListener {
        private boolean[] selectedOptions;

        public HomePageOption(int i) {
            this.selectedOptions = new boolean[i];
        }

        public boolean[] getSelectedOptions() {
            return this.selectedOptions;
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.selectedOptions[i] = z;
        }

        public void setInitialSelection(boolean[] zArr) {
            int i = 0;
            while (true) {
                boolean[] zArr2 = this.selectedOptions;
                if (i >= zArr2.length) {
                    return;
                }
                zArr2[i] = zArr[i];
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$LocalBackup */
    class LocalBackup implements DialogInterface.OnClickListener {
        final /* synthetic */ Context val$context;

        LocalBackup(Context context) {
            this.val$context = context;
        }

        public static void zipFolder(File file, File file2) throws IOException {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
            byte[] bArr = new byte[1024];
            try {
                LinkedList linkedList = new LinkedList();
                Collections.addAll(linkedList, file.listFiles());
                while (!linkedList.isEmpty()) {
                    File file3 = (File) linkedList.remove(0);
                    String str = "TVBox/" + file3.getAbsolutePath().substring(file.getAbsolutePath().length() + 1);
                    if (file3.isDirectory()) {
                        zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
                        zipOutputStream.closeEntry();
                        File[] fileArrListFiles = file3.listFiles();
                        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                            Collections.addAll(linkedList, fileArrListFiles);
                        }
                    } else {
                        zipOutputStream.putNextEntry(new ZipEntry(str));
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i);
                            }
                        }
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                    }
                }
                zipOutputStream.close();
            } finally {
                zipOutputStream.close();
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            try {
                File file = new File("/sdcard/TVBox");
                if (!file.exists()) {
                    Toast.makeText(this.val$context, "TVBox文件夹不存在", 0).show();
                    return;
                }
                File file2 = new File("/sdcard/TVBoxBackup.zip");
                zipFolder(file, file2);
                Toast.makeText(this.val$context, "备份成功: " + file2.getName(), 1).show();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(this.val$context, e.getMessage(), 0).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$Option */
    public static class Option implements DialogInterface.OnClickListener {
        private int selectedOption = 0;

        public int getSelectedOption() {
            return this.selectedOption;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.selectedOption = i;
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$UpdateListener */
    class UpdateListener implements DialogInterface.OnClickListener {
        private final boolean enable;

        public UpdateListener(boolean z) {
            this.enable = z;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.enable) {
                Config.enableUpdateCheck();
            } else {
                Config.disableUpdateCheck();
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$a */
    private static class a {
        static volatile C0588G a = new C0588G();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$b */
    class b implements Runnable {
        final /* synthetic */ TextView val$goView;
        final /* synthetic */ TextView val$javaView;

        b(TextView textView, TextView textView2) {
            this.val$goView = textView;
            this.val$javaView = textView2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String str = C0575b.l("http://127.0.0.1:1314/api/ping", null).contains("ok") ? "🐢 Go: 🟢 在线" : "🐢 Go: ⚫ 离线";
                TextView textView = this.val$goView;
                textView.post(new c(textView, str));
            } catch (Exception e) {
                TextView textView2 = this.val$goView;
                textView2.post(new c(textView2, "🐢 Go: 🔴 错误"));
            }
            try {
                String str2 = C0575b.l("http://127.0.0.1:9978/proxy?do=ck", null).contains("ok") ? "☕ Java: 🟢 在线" : "☕ Java: ⚫ 离线";
                TextView textView3 = this.val$javaView;
                textView3.post(new c(textView3, str2));
            } catch (Exception e2) {
                TextView textView4 = this.val$javaView;
                textView4.post(new c(textView4, "☕ Java: 🔴 错误"));
            }
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$c */
    class c implements Runnable {
        final /* synthetic */ TextView val$targetView;
        final /* synthetic */ String val$text;

        c(TextView textView, String str) {
            this.val$targetView = textView;
            this.val$text = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$targetView.setText(this.val$text);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX INFO: renamed from: 123login, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m122123login() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.m.C0588G.m122123login():void");
    }

    /* JADX INFO: renamed from: 123panfxck, reason: not valid java name */
    private void m123123panfxck(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint("请输入123云盘社区Cookie");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(0, 0, 0, 0);
        String str = map.get("model");
        if (TextUtils.isEmpty(str)) {
            TextView textView = new TextView(Init.context());
            textView.setText("请输入123云盘社区Cookie");
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C0590I.c(20);
            layoutParams.bottomMargin = C0590I.c(10);
            linearLayout.addView(textView, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            int iC = C0590I.c(16);
            layoutParams2.setMargins(iC, 0, iC, 0);
            linearLayout.addView(editText, layoutParams2);
            TextView textView2 = new TextView(Init.context());
            textView2.setText("请访问123云盘社区获取Cookie");
            textView2.setGravity(17);
            textView2.setTextColor(-16777216);
            textView2.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            int iC2 = C0590I.c(10);
            textView2.setPadding(iC2, iC2, iC2, iC2);
            linearLayout.addView(textView2, layoutParams3);
            TextView textView3 = new TextView(Init.context());
            textView3.setText("https://123panfx.com");
            textView3.setGravity(17);
            textView3.setTextColor(-16776961);
            textView3.setTextSize(15.0f);
            textView3.setClickable(true);
            textView3.setOnClickListener(new AnonymousClass1());
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 17;
            int iC3 = C0590I.c(10);
            textView3.setPadding(iC3, C0590I.c(10), iC3, iC3);
            linearLayout.addView(textView3, layoutParams4);
            ImageView imageView = new ImageView(Init.context());
            Bitmap bitmapA = C0604m.a("https://123panfx.com");
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C0590I.c(200), C0590I.c(200));
                layoutParams5.topMargin = C0590I.c(10);
                layoutParams5.gravity = 17;
                linearLayout.addView(imageView, layoutParams5);
            }
        } else {
            TextView textView4 = new TextView(Init.context());
            textView4.setText("请使用浏览器或者微信扫描二维码");
            textView4.setGravity(17);
            textView4.setTextColor(-16777216);
            textView4.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams6.topMargin = C0590I.c(20);
            layoutParams6.bottomMargin = C0590I.c(10);
            linearLayout.addView(textView4, layoutParams6);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(C0590I.c(200), C0590I.c(200));
            layoutParams7.gravity = 17;
            ImageView imageView2 = new ImageView(Init.context());
            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView2.setImageBitmap(C0604m.a(this.b));
            linearLayout.addView(imageView2, layoutParams7);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
        view.setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                File file = new File(new File(Environment.getExternalStorageDirectory(), "TVBox"), "diy_cookie.txt");
                try {
                    String strTrim = editText.getText().toString().trim();
                    if (strTrim.isEmpty()) {
                        Toast.makeText(Init.context(), "输入为空，未设置Cookie", 0).show();
                        return;
                    }
                    if (!file.getParentFile().exists()) {
                        file.getParentFile().mkdirs();
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (file.exists()) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        }
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                        jSONObject = new JSONObject(sb.toString());
                    }
                    jSONObject.put("123panfx_cookie", strTrim);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
                    outputStreamWriter.write(jSONObject.toString());
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    Toast.makeText(Init.context(), "123云盘社区Cookie已设置", 0).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        if (TextUtils.isEmpty(str)) {
            view.setNeutralButton("远程输入", new DialogInterfaceOnClickListenerC0584C(this, map));
        } else {
            view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.DD
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0588G c0588g = this.a;
                    Map map2 = map;
                    c0588g.getClass();
                    map2.put("model", "");
                    map2.put("flag", "");
                    Init.execute(new s(c0588g, map2, 1));
                }
            });
        }
        this.a = view.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX INFO: renamed from: 189login, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m124189login() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.m.C0588G.m124189login():void");
    }

    /* JADX INFO: renamed from: 189tip, reason: not valid java name */
    private void m125189tip(Map<String, String> map) {
        Application applicationContext = Init.context();
        LinearLayout linearLayout = new LinearLayout(applicationContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iC = C0590I.c(24);
        int iC2 = C0590I.c(20);
        linearLayout.setPadding(iC, iC2, iC, iC2);
        TextView textView = new TextView(applicationContext);
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-15066598);
        textView.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView, layoutParams);
        View view = new View(applicationContext);
        view.setBackgroundColor(-1512723);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C0590I.c(2));
        layoutParams2.bottomMargin = C0590I.c(12);
        linearLayout.addView(view, layoutParams2);
        TextView textView2 = new TextView(applicationContext);
        textView2.setText("1. 请确认您输入的账号和密码准确无误\n\n2. 建议尝试在账号后添加@189.cn后缀进行登录\n\n3. 请点击下方链接或者扫描二维码，通过浏览器访问天翼云官网完成登录，并在账号安全设置中关闭设备锁功能");
        textView2.setGravity(0);
        textView2.setTextColor(-10525848);
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing(1.5f, 1.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(applicationContext);
        textView3.setText("https://e.dlife.cn/user/index.do");
        textView3.setGravity(17);
        textView3.setTextColor(-16776961);
        textView3.setTextSize(12.0f);
        textView3.setClickable(true);
        textView3.setOnClickListener(new AnonymousClass1());
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(applicationContext);
        Bitmap bitmapA = C0604m.a("https://e.dlife.cn/user/index.do");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C0590I.c(120), C0590I.c(120));
        layoutParams4.topMargin = C0590I.c(16);
        layoutParams4.bottomMargin = C0590I.c(16);
        linearLayout.addView(imageView, layoutParams4);
        TextView textView4 = new TextView(applicationContext);
        textView4.setText("✓ 我知道了");
        textView4.setGravity(17);
        textView4.setTextColor(-15043608);
        textView4.setTextSize(16.0f);
        textView4.setOnClickListener(new AnonymousClass8());
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = C0590I.c(24);
        layoutParams5.gravity = 1;
        linearLayout.addView(textView4, layoutParams5);
        Init.execute(new q(this, map, 0));
        this.a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    C0588G() {
        String hostAddress;
        Enumeration<NetworkInterface> networkInterfaces;
        this.b = "";
        Init.checkPermission();
        this.d = C0590I.f();
        StringBuilder sb = new StringBuilder();
        String url = Proxy.getUrl();
        int ipAddress = ((WifiManager) Init.context().getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                networkInterfaces = NetworkInterface.getNetworkInterfaces();
            } catch (SocketException e) {
                e.printStackTrace();
            }
            loop0: while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                String displayName = networkInterfaceNextElement.getDisplayName();
                if (displayName.equals("eth0") || displayName.equals("wlan0")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                            hostAddress = inetAddressNextElement.getHostAddress();
                            break loop0;
                        }
                        hostAddress = "127.0.0.1";
                    }
                }
            }
            hostAddress = "127.0.0.1";
        } else {
            hostAddress = String.format("%d.%d.%d.%d", Integer.valueOf(ipAddress & 255), Integer.valueOf((ipAddress >> 8) & 255), Integer.valueOf((ipAddress >> 16) & 255), Integer.valueOf((ipAddress >> 24) & 255));
        }
        sb.append(url.replace("127.0.0.1", hostAddress));
        sb.append("?do=push&operate=web");
        this.b = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(Map<String, String> map) {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.c = null;
        }
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new com.github.catvod.spider.merge.b.r(this, map, 3), 1L, 1L, TimeUnit.SECONDS);
    }

    private void B() {
        Init.run(new RunnableC0540d(this, 3));
    }

    private void C() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.c.shutdown();
        }
    }

    private void PanOrder(Map<String, String> map) {
        ArrayList<String> labelsFromPanOrder = getLabelsFromPanOrder(C0602k.a(C0602k.c("/config.json")));
        if (labelsFromPanOrder == null || labelsFromPanOrder.size() <= 0) {
            labelsFromPanOrder = new ArrayList<>();
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("云盘排序").setAdapter(new ArrowAdapter(Init.getConfigActivity(), R.layout.simple_list_item_1, labelsFromPanOrder), null).setPositiveButton("确定", new ArrowConfirm(labelsFromPanOrder)).create();
        alertDialogCreate.getWindow().setSoftInputMode(8);
        alertDialogCreate.show();
        currentDialog = alertDialogCreate;
        ListView listView2 = alertDialogCreate.getListView();
        listView = listView2;
        if (listView2 != null) {
            listView2.setItemsCanFocus(true);
            listView2.setSelection(0);
            lastFocusPosition = 0;
            lastFocusViewId = 1;
            needRestoreFocus = true;
            restoreRetryCount = 0;
            listView2.post(new FocusRestorer());
        }
    }

    public static void Refresh189() throws Exception {
        File file = new File("/sdcard/TVBox/cloud189.txt");
        if (!file.exists()) {
            SpiderDebug.log("cloud189.txt 文件不存在");
            return;
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            } else {
                sb.append(line);
            }
        }
        bufferedReader.close();
        fileReader.close();
        JSONObject jSONObject = new JSONObject(sb.toString());
        SpiderDebug.log(C0548l.c().b(jSONObject.getString("userName"), jSONObject.getString("passWord")) ? "189云盘登录成功" : "189云盘登录失败");
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$4(ClassGen.java:366)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:178)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1708)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:367)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:329)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
     */
    public static /* synthetic */ void a(C0588G c0588g, Map map) {
        c0588g.A(map);
    }

    private void aliHD(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("阿里云盘画质");
        String[] strArr = {"阿里原画", "阿里普画", "阿里原画|阿里普画", "阿里普画|阿里原画"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("aliHD");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.b()).create().show();
    }

    private void aliThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("阿里云盘线程");
        String[] strArr = {"4", "8", "16", "32", "64", "128", "256"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("aliThread");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.e()).create().show();
    }

    public static /* synthetic */ void b(C0588G c0588g, Map map) {
        c0588g.C();
        Init.execute(new r(c0588g, map, 0));
    }

    private void backup(Map<String, String> map) {
        Activity configActivity = Init.getConfigActivity();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(configActivity).setTitle("数据备份").setMessage("请选择操作").setCancelable(true).setPositiveButton("备份", new LocalBackup(configActivity)).setNegativeButton("删除备份", new DeleteBackup(Init.getConfigActivity())).setNeutralButton("帮助", new BackupTip(Init.getConfigActivity())).create();
        alertDialogCreate.setCanceledOnTouchOutside(true);
        alertDialogCreate.show();
    }

    public static /* synthetic */ void c(C0588G c0588g, EditText editText, EditText editText2) {
        c0588g.getClass();
        c0588g.u("cloud189", editText.getText().toString() + "|" + editText2.getText().toString() + "|Y");
    }

    private void cloudSwitch(Map<String, String> map) {
        Activity configActivity = Init.getConfigActivity();
        String str = map.get("site");
        new AlertDialog.Builder(configActivity).setTitle(str).setMessage("请选择操作").setPositiveButton("开启", new CloudDialogClickListener(configActivity, true, str)).setNegativeButton("关闭", new CloudDialogClickListener(configActivity, false, str)).create().show();
    }

    public static void d(C0588G c0588g, Map map) {
        Runnable sVar;
        String str;
        String strOptString;
        String str2;
        JSONObject jSONObject;
        c0588g.getClass();
        String str3 = (String) map.get("site");
        int i = 2;
        try {
            try {
            } catch (Exception e) {
                e.printStackTrace();
                map.put("push", "");
                map.put("flag", c0588g.r(str3));
                map.put("button", "1");
                Init.execute(new r(c0588g, map, 2));
                sVar = new s(c0588g, map, i);
            }
            if ("quark".equals(str3)) {
                str2 = "com.ucpro.MainActivity";
                Activity configActivity = Init.getConfigActivity();
                Intent intent = new Intent();
                intent.setClassName("com.quark.browser", "com.ucpro.MainActivity");
                str = configActivity.getPackageManager().resolveActivity(intent, 65536) == null ? "com.quark.clouddrive" : "com.quark.browser";
                jSONObject = new JSONObject((String) map.get("url"));
            } else if ("uc".equals(str3)) {
                str = "com.UCMobile";
                str2 = "com.UCMobile.main.UCMobile";
                jSONObject = new JSONObject((String) map.get("url"));
            } else {
                if (!"bili".equals(str3)) {
                    str = "";
                    strOptString = str;
                    str2 = strOptString;
                    Activity configActivity2 = Init.getConfigActivity();
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setClassName(str, str2);
                    intent2.setData(Uri.parse(strOptString));
                    configActivity2.startActivity(intent2);
                    sVar = new q(c0588g, map, i);
                    Init.execute(sVar);
                }
                str = "tv.danmaku.bili";
                str2 = "tv.danmaku.bili.ui.intent.IntentHandlerActivity";
                jSONObject = new JSONObject((String) map.get("url"));
            }
            strOptString = jSONObject.optString("url");
            Activity configActivity22 = Init.getConfigActivity();
            Intent intent22 = new Intent("android.intent.action.VIEW");
            intent22.setClassName(str, str2);
            intent22.setData(Uri.parse(strOptString));
            configActivity22.startActivity(intent22);
            sVar = new q(c0588g, map, i);
            Init.execute(sVar);
        } catch (Throwable th) {
            Init.execute(new p(c0588g, map, 1));
            throw th;
        }
    }

    private void danmuColor(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("弹幕颜色");
        String[] strArr = {"默认", "彩色"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("danmuColor");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.i()).create().show();
    }

    public static /* synthetic */ void e(C0588G c0588g, Map map, String str) {
        c0588g.getClass();
        map.put("push", "");
        map.put("flag", c0588g.r(str));
        map.put("button", "1");
        map.put("input", "");
        Init.execute(new r(c0588g, map, 1));
    }

    public static /* synthetic */ void f(C0588G c0588g, EditText editText) {
        c0588g.getClass();
        c0588g.u("ucMachineCode", editText.getText().toString());
    }

    public static /* synthetic */ void g(C0588G c0588g, String str, EditText editText) {
        c0588g.getClass();
        c0588g.u(str, editText.getText().toString());
    }

    private ArrayList<String> getLabelsFromPanOrder(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null && !str.isEmpty()) {
            try {
                String strOptString = new JSONObject(str).optString("panOrder", "");
                if (strOptString.isEmpty()) {
                    return arrayList;
                }
                for (String str2 : strOptString.split(",")) {
                    String strTrim = str2.trim();
                    if (!strTrim.isEmpty()) {
                        arrayList.add(strTrim);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add("百度");
            arrayList.add("夸克");
            arrayList.add("UC");
            arrayList.add("天翼");
            arrayList.add("123");
            arrayList.add("阿里");
            arrayList.add("移动");
        }
        return arrayList;
    }

    private boolean handleSpecialSite(String str, Map map) {
        if ("cloud123".equals(str)) {
            x(map);
            return true;
        }
        if ("cloud189".equals(str)) {
            y(map);
            return true;
        }
        if ("189tip".equals(str)) {
            m125189tip(map);
            return true;
        }
        if ("123panfxck".equals(str)) {
            m123123panfxck(map);
            return true;
        }
        if ("quarktip".equals(str)) {
            quarktip(map);
            return true;
        }
        if ("uctip".equals(str)) {
            uctip(map);
            return true;
        }
        if ("newaliyun".equals(str)) {
            newaliyun(map);
            return true;
        }
        if ("newquark".equals(str)) {
            newquark(map);
            return true;
        }
        if ("newuc".equals(str)) {
            newuc(map);
            return true;
        }
        if ("newbaidu".equals(str)) {
            newbaidu(map);
            return true;
        }
        if ("new189".equals(str)) {
            new189(map);
            return true;
        }
        if ("new123".equals(str)) {
            new123(map);
            return true;
        }
        if ("newbili".equals(str)) {
            newbili(map);
            return true;
        }
        if ("baidu".equals(str)) {
            v(map);
            return true;
        }
        if ("homePage".equals(str)) {
            homePage(map);
            return true;
        }
        if ("danmuColor".equals(str)) {
            danmuColor(map);
            return true;
        }
        if ("panOrder".equals(str)) {
            PanOrder(map);
            return true;
        }
        if ("pansou".equals(str)) {
            pansou(map);
            return true;
        }
        if ("proxyMode".equals(str)) {
            proxyMode(map);
            return true;
        }
        if ("backup".equals(str)) {
            backup(map);
            return true;
        }
        if ("update".equals(str)) {
            update(map);
            return true;
        }
        if ("aliThread".equals(str)) {
            aliThread(map);
            return true;
        }
        if ("quarkThread".equals(str)) {
            quarkThread(map);
            return true;
        }
        if ("ucThread".equals(str)) {
            ucThread(map);
            return true;
        }
        if ("aliHD".equals(str)) {
            aliHD(map);
            return true;
        }
        if ("quarkHD".equals(str)) {
            quarkHD(map);
            return true;
        }
        if (!"ucHD".equals(str)) {
            return false;
        }
        ucHD(map);
        return true;
    }

    private void homePage(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("主页分类");
        String[] strArr = {"热门电影", "热播剧集", "热门动漫", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单"};
        String strA = C0602k.a(C0602k.c("/config.json"));
        boolean[] zArr = new boolean[8];
        for (int i = 0; i < 8; i++) {
            zArr[i] = true;
        }
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("homePage");
                if (!TextUtils.isEmpty(strOptString)) {
                    List listAsList = Arrays.asList(strOptString.split(","));
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        if (listAsList.contains(strArr[i2])) {
                            zArr[i2] = true;
                        } else {
                            zArr[i2] = false;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        HomePageOption homePageOption = new HomePageOption(8);
        homePageOption.setInitialSelection(zArr);
        title.setMultiChoiceItems(strArr, zArr, homePageOption).setPositiveButton("确定", new com.github.catvod.spider.merge.A.h(homePageOption)).create().show();
    }

    public static void i(C0588G c0588g) {
        c0588g.getClass();
        try {
            AlertDialog alertDialog = c0588g.a;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            ScheduledExecutorService scheduledExecutorService = c0588g.c;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isCloudSite(String str) {
        return "阿里云盘".equals(str) || "夸克网盘".equals(str) || "UC网盘".equals(str) || "天翼云盘".equals(str) || "123云盘".equals(str) || "百度网盘".equals(str) || "移动云盘".equals(str);
    }

    public static /* synthetic */ void j(C0588G c0588g, Map map) {
        c0588g.C();
        map.put("push", "1");
        map.put("flag", c0588g.r(""));
        map.put("button", "1");
        c0588g.w(map);
    }

    public static void k(C0588G c0588g, Map map) {
        String str;
        String string;
        String string2;
        C0588G c0588g2;
        c0588g.getClass();
        try {
            if ("ali".equals(map.get("site"))) {
                JSONObject jSONObjectOptJSONObject = new JSONObject((String) map.get("url")).optJSONObject("token");
                HashMap map2 = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map2.put(next, jSONObjectOptJSONObject.optString(next));
                }
                com.github.catvod.spider.merge.d.d dVarC = com.github.catvod.spider.merge.d.d.g(C0575b.i(map2)).b().c();
                if (!dVarC.f()) {
                    return;
                }
                C0590I.i("阿里云盘授权成功");
                str = (String) map.get("site");
                string = dVarC.e();
            } else if ("quark".equals(map.get("site"))) {
                String strL = C0575b.l("https://uop.quark.cn/cas/ajax/getServiceTicketByQrcodeToken?client_id=532&v=1.2&token=" + new JSONObject((String) map.get("url")).optString("token"), null);
                SpiderDebug.log(strL);
                JSONObject jSONObject = new JSONObject(strL);
                if (!"ok".equals(jSONObject.optString("message"))) {
                    return;
                }
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map3 = new HashMap();
                map3.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.122 Safari/537.36 SE 2.X MetaSr 1.0");
                map3.put("Accept", "application/json, text/plain, */*");
                map3.put("Referer", "https://pan.quark.cn/");
                String str2 = "";
                for (String str3 : C0575b.d("https://pan.quark.cn/account/info?st=" + strOptString + "&lw=scan", map3).headers("set-cookie")) {
                    if (str3.contains("__pus=")) {
                        str2 = str2 + str3.split(";")[0] + ";";
                    }
                }
                str = (String) map.get("site");
                string = str2;
            } else {
                String str4 = ";";
                if ("uc".equals(map.get("site"))) {
                    HashMap map4 = new HashMap();
                    map4.put("Accept", "application/json, text/plain, */*");
                    map4.put("Content-Type", "application/x-www-form-urlencoded");
                    map4.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    map4.put("Referer", "https://broccoli.uc.cn/");
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    string2 = "";
                    sb.append(string2);
                    String string3 = sb.toString();
                    HashMap map5 = new HashMap();
                    map5.put("client_id", "381");
                    map5.put("v", "1.2");
                    map5.put("request_id", string3);
                    map5.put("token", new JSONObject((String) map.get("url")).optString("token"));
                    JSONObject jSONObject2 = new JSONObject(C0575b.g("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=18884&__t=" + string3, map5, map4).a());
                    if ("ok".equals(jSONObject2.optString("message"))) {
                        for (String str5 : C0575b.d("https://drive.uc.cn/account/info?st=" + jSONObject2.optJSONObject("data").optJSONObject("members").optString("service_ticket"), map4).headers("set-cookie")) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(string2);
                            String str6 = str4;
                            sb2.append(str5.split(str6)[0]);
                            sb2.append(str6);
                            string2 = sb2.toString();
                            str4 = str6;
                        }
                        str = (String) map.get("site");
                        c0588g2 = c0588g;
                        c0588g2.u(str, string2);
                    }
                    return;
                }
                if (!"bili".equals(map.get("site"))) {
                    if ("cloud".equals(map.get("site"))) {
                        if (!C0548l.u()) {
                            return;
                        } else {
                            C0590I.i("天翼云盘授权成功");
                        }
                    } else if (!"baidu".equals(map.get("site")) || !C0546j.t()) {
                        return;
                    } else {
                        C0590I.i("百度网盘授权成功");
                    }
                    c0588g.B();
                    return;
                }
                HashMap map6 = new HashMap();
                map6.put("Accept", "application/json, text/plain, */*");
                map6.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                String strQ = com.github.catvod.spider.merge.f.e.b(C0575b.l("https://passport.bilibili.com/x/passport-login/web/qrcode/poll?qrcode_key=" + new JSONObject((String) map.get("url")).optString("token") + "&source=main_mini", map6)).a().q();
                if (TextUtils.isEmpty(strQ)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                for (String str7 : Uri.parse(strQ).getQuery().split("&")) {
                    sb3.append(str7);
                    sb3.append(str4);
                }
                str = (String) map.get("site");
                string = sb3.toString();
            }
            c0588g2 = c0588g;
            string2 = string;
            c0588g2.u(str, string2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void m(C0588G c0588g, EditText editText, EditText editText2) {
        c0588g.getClass();
        c0588g.u("cloud123", editText.getText().toString() + "|" + editText2.getText().toString() + "|Y");
    }

    private void new123(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 123个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C0590I.c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.62
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0588G.this.dismissAlertDialog();
                C0588G.this.callShow123RegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0590I.c(45));
        int iC2 = C0590I.c(40);
        layoutParams3.leftMargin = iC2;
        layoutParams3.rightMargin = iC2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.63
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strJ = com.github.catvod.spider.merge.b.m.a().j();
                    if (TextUtils.isEmpty(strJ)) {
                        final String str = "获取失败：账号未登录或Token已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.63.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    HashMap map2 = new HashMap();
                    map2.put("Authorization", strJ);
                    map2.put("Platform", "open_platform");
                    map2.put("Accept", "application/json");
                    JSONObject jSONObject = new JSONObject(C0575b.l("https://open-api.123pan.com/api/v1/user/info", map2));
                    if (jSONObject.optInt("code") != 0) {
                        final String str2 = "获取失败：账号未登录或Token已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.63.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str2);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str3 = "获取失败：返回数据为空";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.63.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str3);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("nickname");
                    long jOptLong = jSONObjectOptJSONObject.optLong("spaceUsed");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("spacePermanent");
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("vip");
                    String strE = jOptLong == 0 ? "0 B" : C0590I.e(jOptLong);
                    String strE2 = jOptLong2 == 0 ? "0 B" : C0590I.e(jOptLong2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("🏷️ 会员类型：");
                    sb.append(zOptBoolean ? "VIP会员" : "普通用户");
                    sb.append("\n\n");
                    sb.append("💾 存储空间：");
                    sb.append(strE);
                    sb.append(" / ");
                    sb.append(strE2);
                    sb.append("\n\n");
                    sb.append(zOptBoolean ? "✅ 会员有效" : "⚠️ 未开通会员");
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.63.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                    TextView textView3 = textView2;
                    final String str4 = "获取失败：" + th.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.63.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str4);
                        }
                    });
                }
            }
        }).start();
    }

    private void new189(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 天翼个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C0590I.c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.52
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0588G.this.dismissAlertDialog();
                C0588G.this.callShow189RegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0590I.c(45));
        int iC2 = C0590I.c(40);
        layoutParams3.leftMargin = iC2;
        layoutParams3.rightMargin = iC2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        String strM89k = C0548l.c().m89k();
                        if (TextUtils.isEmpty(strM89k)) {
                            final String str = "获取失败：账号未登录或Cookie已失效";
                            textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(str);
                                }
                            });
                            return;
                        }
                        HashMap map2 = new HashMap();
                        map2.put("Referer", "https://cloud.189.cn/");
                        map2.put("accept", "application/json;charset=UTF-8");
                        map2.put("Cookie", strM89k);
                        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                        String strL = C0575b.l("https://cloud.189.cn/api/portal/getUserSizeInfo.action", map2);
                        JSONObject jSONObject = new JSONObject(strL);
                        String strOptString = jSONObject.optString("errorCode");
                        if (TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject2 = new JSONObject(strL);
                            if (jSONObject2.optInt("res_code") != 0) {
                                TextView textView3 = textView2;
                                final String str2 = "获取信息失败：" + jSONObject2.optString("res_message");
                                textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        textView2.setText(str2);
                                    }
                                });
                                return;
                            }
                            String strOptString2 = jSONObject2.optString("account");
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("cloudCapacityInfo");
                            long jOptLong = 0;
                            long jOptLong2 = 0;
                            if (jSONObjectOptJSONObject != null) {
                                jOptLong = jSONObjectOptJSONObject.optLong("usedSize", 0L);
                                jOptLong2 = jSONObjectOptJSONObject.optLong("totalSize", 0L);
                            }
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("familyCapacityInfo");
                            String strE = C0590I.e(jOptLong);
                            if (TextUtils.isEmpty(strE)) {
                                strE = "0 B";
                            }
                            String strE2 = C0590I.e(jOptLong2);
                            if (TextUtils.isEmpty(strE2)) {
                                strE2 = "0 B";
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("👤 账号：");
                            sb.append(strOptString2);
                            sb.append("\n\n");
                            sb.append("☁️ 个人云空间：");
                            sb.append(strE);
                            sb.append(" / ");
                            sb.append(strE2);
                            if (jSONObjectOptJSONObject2 != null) {
                                sb.append("\n\n");
                                sb.append("🏠 家庭云空间：");
                                String strE3 = C0590I.e(jSONObjectOptJSONObject2.optLong("usedSize", 0L));
                                if (TextUtils.isEmpty(strE3)) {
                                    strE3 = "0 B";
                                }
                                sb.append(strE3);
                                sb.append(" / ");
                                String strE4 = C0590I.e(jSONObjectOptJSONObject2.optLong("totalSize", 0L));
                                if (TextUtils.isEmpty(strE4)) {
                                    strE4 = "0 B";
                                }
                                sb.append(strE4);
                            }
                            sb.append("\n");
                            final String string = sb.toString();
                            textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(string);
                                }
                            });
                            return;
                        }
                        if (!"InvalidSessionKey".equals(strOptString)) {
                            TextView textView4 = textView2;
                            final String str3 = "获取信息失败：" + jSONObject.optString("errorMsg");
                            textView4.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(str3);
                                }
                            });
                            return;
                        }
                        if (i >= 1) {
                            final String str4 = "获取失败：账号未登录或Cookie已失效";
                            textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    textView2.setText(str4);
                                }
                            });
                            return;
                        } else {
                            i++;
                            C0588G.Refresh189();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        TextView textView5 = textView2;
                        final String str5 = "获取失败：" + e.getMessage();
                        textView5.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.53.2
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str5);
                            }
                        });
                        return;
                    }
                }
            }
        }).start();
    }

    private void newaliyun(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 阿里个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C0590I.c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0588G.this.dismissAlertDialog();
                C0588G.this.callShowAliyunRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0590I.c(45));
        int iC2 = C0590I.c(40);
        layoutParams3.leftMargin = iC2;
        layoutParams3.rightMargin = iC2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.13

            /* JADX INFO: renamed from: com.github.catvod.spider.merge.m.G$13$1, reason: invalid class name */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ String val$text;

                AnonymousClass1(String str) {
                    this.val$text = str;
                }

                @Override // java.lang.Runnable
                public void run() {
                    textView2.setText(this.val$text);
                }
            }

            private boolean tryFetchUserInfo() {
                try {
                    HashMap map2 = new HashMap();
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) aDrive/6.1.0 Chrome/112.0.5615.165 Electron/24.1.3.7 Safari/537.36");
                    map2.put("Referer", "https://www.aliyundrive.com/");
                    map2.put("authorization", C0545i.d().g().c().a());
                    map2.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
                    JSONObject jSONObject = new JSONObject(C0575b.f("https://user.aliyundrive.com/v2/user/get", "{}", map2).a());
                    String strOptString = jSONObject.optString("nick_name");
                    String strOptString2 = jSONObject.optString("vip_identity");
                    JSONObject jSONObject2 = new JSONObject(C0575b.f("https://api.aliyundrive.com/v2/databox/get_personal_info", "{}", map2).a());
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("personal_rights_info");
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("personal_space_info");
                    if (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject2 == null) {
                        return false;
                    }
                    jSONObjectOptJSONObject.optString("name");
                    long jOptLong = jSONObjectOptJSONObject2.optLong("used_size");
                    long jOptLong2 = jSONObjectOptJSONObject2.optLong("total_size");
                    String strE = jOptLong != 0 ? C0590I.e(jOptLong) : "0 B";
                    String strE2 = jOptLong2 != 0 ? C0590I.e(jOptLong2) : "0 B";
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("👑️ 会员类型：");
                    sb.append(strOptString2.equals("vip") ? "VIP会员" : strOptString2.equals("svip") ? "超级会员" : "普通用户");
                    sb.append("\n\n");
                    sb.append("💾 存储空间：");
                    sb.append(strE);
                    sb.append(" / ");
                    sb.append(strE2);
                    sb.append("\n");
                    textView2.post(new AnonymousClass1(sb.toString()));
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (tryFetchUserInfo()) {
                        return;
                    }
                    if (C0545i.d().t()) {
                        tryFetchUserInfo();
                    } else {
                        textView2.post(new AnonymousClass1("获取失败：账号未登录或Token已失效"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.13.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str);
                        }
                    });
                }
            }
        }).start();
    }

    private void newbaidu(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 百度个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C0590I.c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.42
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0588G.this.dismissAlertDialog();
                C0588G.this.callShowBaiduRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0590I.c(45));
        int iC2 = C0590I.c(40);
        layoutParams3.leftMargin = iC2;
        layoutParams3.rightMargin = iC2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.43
            @Override // java.lang.Runnable
            public void run() {
                String strE;
                String strE2;
                try {
                    String strJ = C0546j.f().j();
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://pan.baidu.com");
                    map2.put("Cookie", strJ);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                    JSONObject jSONObject = new JSONObject(C0575b.l("https://mbd.baidu.com/userx/v1/info/get?appname=baiduboxapp&fields=[\"bg_image\",\"member\",\"uid\",\"avatar\",\"avatar_member\",\"username\",\"displayname\"]", map2));
                    if (jSONObject.optInt("errno") != 0) {
                        final String str = "获取失败：账号未登录或Cookie已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.43.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data").optJSONObject("fields");
                    if (jSONObjectOptJSONObject == null) {
                        final String str2 = "获取失败：数据格式异常";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.43.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str2);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("username");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("member");
                    int iOptInt = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("is_vip") : 0;
                    HashMap map3 = new HashMap();
                    map3.put("Referer", "https://pan.baidu.com");
                    map3.put("Cookie", strJ);
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                    JSONObject jSONObject2 = new JSONObject(C0575b.l("https://pan.baidu.com/api/quota?checkfree=1&checkexpire=1", map3));
                    if (jSONObject2.optInt("errno") != 0) {
                        strE = "容量信息获取失败";
                        strE2 = "N/A";
                    } else {
                        long jOptLong = jSONObject2.optLong("used");
                        long jOptLong2 = jSONObject2.optLong("total");
                        strE = jOptLong == 0 ? "0 B" : C0590I.e(jOptLong);
                        strE2 = jOptLong2 == 0 ? "0 B" : C0590I.e(jOptLong2);
                    }
                    final String str3 = "👤 用户：" + strOptString + "\n\n👑️ 会员类型：" + (iOptInt == 1 ? "VIP会员" : "普通用户") + "\n\n💾 存储空间：" + strE + " / " + strE2 + "\n";
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.43.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str3);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str4 = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.43.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str4);
                        }
                    });
                }
            }
        }).start();
    }

    private void newbili(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 哔哩哔哩个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strA = C0602k.a(C0602k.b("/bili_cookie.txt"));
                    if (TextUtils.isEmpty(strA)) {
                        final String str = "获取失败：Cookie为空，请先登录";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    String strOptString = new JSONObject(strA).optString("cookie");
                    if (TextUtils.isEmpty(strOptString)) {
                        final String str2 = "获取失败：Cookie字段为空";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str2);
                            }
                        });
                        return;
                    }
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://www.bilibili.com/");
                    map2.put("Cookie", strOptString);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                    JSONObject jSONObject = new JSONObject(C0575b.l("https://api.bilibili.com/x/web-interface/nav", map2));
                    if (jSONObject.optInt("code") != 0) {
                        TextView textView3 = textView2;
                        final String str3 = "获取信息失败：" + jSONObject.optString("message");
                        textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str3);
                            }
                        });
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str4 = "获取失败：数据为空";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str4);
                            }
                        });
                        return;
                    }
                    if (!jSONObjectOptJSONObject.optBoolean("isLogin")) {
                        final String str5 = "获取失败：未登录状态";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str5);
                            }
                        });
                        return;
                    }
                    String strOptString2 = jSONObjectOptJSONObject.optString("uname");
                    long jOptLong = jSONObjectOptJSONObject.optLong("mid");
                    int iOptInt = jSONObjectOptJSONObject.optInt("money");
                    jSONObjectOptJSONObject.optInt("moral");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("level_info");
                    int iOptInt2 = 0;
                    int iOptInt3 = 0;
                    int iOptInt4 = 0;
                    if (jSONObjectOptJSONObject2 != null) {
                        iOptInt2 = jSONObjectOptJSONObject2.optInt("current_level");
                        iOptInt3 = jSONObjectOptJSONObject2.optInt("current_exp");
                        iOptInt4 = jSONObjectOptJSONObject2.optInt("next_exp");
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("vip");
                    int iOptInt5 = 0;
                    int iOptInt6 = 0;
                    long jOptLong2 = 0;
                    if (jSONObjectOptJSONObject3 != null) {
                        iOptInt5 = jSONObjectOptJSONObject3.optInt("status");
                        iOptInt6 = jSONObjectOptJSONObject3.optInt("type");
                        jOptLong2 = jSONObjectOptJSONObject3.optLong("due_date");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户名：");
                    sb.append(strOptString2);
                    sb.append("\n\n");
                    sb.append("🎭 UID：");
                    sb.append(jOptLong);
                    sb.append("\n\n");
                    sb.append("💎 等级：");
                    sb.append(iOptInt2);
                    sb.append("\n\n");
                    sb.append("📊 经验：");
                    sb.append(iOptInt3);
                    sb.append(" / ");
                    sb.append(iOptInt4);
                    sb.append("\n\n");
                    sb.append("💰 硬币：");
                    sb.append(iOptInt);
                    sb.append("\n\n");
                    if (iOptInt5 > 0) {
                        sb.append("👑 大会员：");
                        sb.append(iOptInt6 == 2 ? "年度大会员" : iOptInt6 == 1 ? "月度大会员" : "已开通");
                        sb.append("\n\n");
                        sb.append("⏰ 到期时间：");
                        sb.append(jOptLong2);
                    } else {
                        sb.append("👑 大会员：未开通");
                    }
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView4 = textView2;
                    final String str6 = "获取失败：" + e.getMessage();
                    textView4.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.73.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str6);
                        }
                    });
                }
            }
        }).start();
    }

    private void newquark(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 夸克个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册（送1T空间）");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C0590I.c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0588G.this.dismissAlertDialog();
                C0588G.this.callShowQuarkRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0590I.c(45));
        int iC2 = C0590I.c(40);
        layoutParams3.leftMargin = iC2;
        layoutParams3.rightMargin = iC2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.23
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strNickname = com.github.catvod.spider.merge.b.w.e().nickname();
                    String strJ = com.github.catvod.spider.merge.b.w.e().j();
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://pan.quark.cn");
                    map2.put("Cookie", strJ);
                    map2.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                    JSONObject jSONObjectOptJSONObject = new JSONObject(C0575b.l("https://drive-pc.quark.cn/1/clouddrive/member?pr=ucpro&fr=pc&fetch_subscribe=true&_ch=home&fetch_identity=true", map2)).optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str = "获取失败：账号未登录或Cookie已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.23.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("member_type");
                    long jOptLong = jSONObjectOptJSONObject.optLong("use_capacity");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("total_capacity");
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("is_new_user");
                    String strE = jOptLong == 0 ? "0 B" : C0590I.e(jOptLong);
                    String strE2 = jOptLong2 == 0 ? "0 B" : C0590I.e(jOptLong2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strNickname);
                    sb.append("\n\n");
                    sb.append("👑️ 会员类型：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("💾 存储空间：");
                    sb.append(strE);
                    sb.append(" / ");
                    sb.append(strE2);
                    sb.append("\n\n");
                    if (zOptBoolean) {
                        sb.append("🎉 新用户福利：注册送1T空间！");
                    } else {
                        sb.append("✅ 已注册老用户");
                    }
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.23.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    TextView textView3 = textView2;
                    final String str2 = "获取失败：" + e.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.23.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str2);
                        }
                    });
                }
            }
        }).start();
    }

    private void newuc(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("👤 UC个人中心");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(20.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        final TextView textView2 = new TextView(Init.context());
        textView2.setText("加载中...");
        textView2.setGravity(17);
        textView2.setTextColor(-16777216);
        textView2.setTextSize(14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C0590I.c(400), -2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView2, layoutParams2);
        Button button = new Button(Init.context());
        button.setText("新用户注册（送1T空间）");
        button.setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C0590I.c(40));
        gradientDrawable.setColor(-14059009);
        button.setBackground(gradientDrawable);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.32
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C0588G.this.dismissAlertDialog();
                C0588G.this.callShowUCRegisterDialog();
            }
        });
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C0590I.c(45));
        int iC2 = C0590I.c(40);
        layoutParams3.leftMargin = iC2;
        layoutParams3.rightMargin = iC2;
        layoutParams3.gravity = 17;
        linearLayout.addView(button, layoutParams3);
        AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
        Window window = alertDialogShow.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.a = alertDialogShow;
        new Thread(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.33
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strNickname = C0536B.c().nickname();
                    String strM87j = C0536B.c().m87j();
                    HashMap map2 = new HashMap();
                    map2.put("Referer", "https://drive.uc.cn");
                    map2.put("Cookie", strM87j);
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.7 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch");
                    JSONObject jSONObjectOptJSONObject = new JSONObject(C0575b.l("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", map2)).optJSONObject("data");
                    if (jSONObjectOptJSONObject == null) {
                        final String str = "获取失败：账号未登录或Cookie已失效";
                        textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.33.1
                            @Override // java.lang.Runnable
                            public void run() {
                                textView2.setText(str);
                            }
                        });
                        return;
                    }
                    String strOptString = jSONObjectOptJSONObject.optString("member_type");
                    long jOptLong = jSONObjectOptJSONObject.optLong("use_capacity");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("total_capacity");
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("is_new_user");
                    String strE = jOptLong == 0 ? "0 B" : C0590I.e(jOptLong);
                    String strE2 = jOptLong2 == 0 ? "0 B" : C0590I.e(jOptLong2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("👤 用户：");
                    sb.append(strNickname);
                    sb.append("\n\n");
                    sb.append("👑️ 会员类型：");
                    sb.append(strOptString);
                    sb.append("\n\n");
                    sb.append("💾 存储空间：");
                    sb.append(strE);
                    sb.append(" / ");
                    sb.append(strE2);
                    sb.append("\n\n");
                    String strA = C0602k.a(C0602k.b("/uc_token.txt"));
                    sb.append((strA == null || strA.length() == 0) ? "🖥️ UC TV Token：未登录" : "🖥️ UC TV Token：已登录");
                    sb.append("\n\n");
                    if (zOptBoolean) {
                        sb.append("🎉 新用户福利：注册送1T空间！");
                    } else {
                        sb.append("✅ 已注册老用户");
                    }
                    final String string = sb.toString();
                    textView2.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.33.1
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(string);
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                    TextView textView3 = textView2;
                    final String str2 = "获取失败：" + th.getMessage();
                    textView3.post(new Runnable() { // from class: com.github.catvod.spider.merge.m.G.33.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView2.setText(str2);
                        }
                    });
                }
            }
        }).start();
    }

    public static /* synthetic */ void o(C0588G c0588g, Map map) {
        c0588g.C();
        map.put("button", "0");
        map.put("input", "1");
        c0588g.w(map);
    }

    public static /* synthetic */ void p(C0588G c0588g, Map map, String str) {
        c0588g.getClass();
        map.put("push", "");
        map.put("flag", c0588g.r(str));
        map.put("button", "1");
        Init.execute(new q(c0588g, map, 1));
    }

    private void pansou(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("盘搜域名");
        String[] strArr = {"https://so.252035.xyz", "https://so.566987.xyz", "https://pan.wnng.cn", "https://gyps.banye.tech:7777"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("pansouUrl");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.j()).create().show();
    }

    private void proxyMode(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iC = C0590I.c(20);
        int iC2 = C0590I.c(12);
        linearLayout.setPadding(iC, iC2, iC, iC2);
        TextView textView = new TextView(Init.context());
        textView.setText("🌐 多线程状态");
        textView.setGravity(17);
        textView.setTextColor(-125269880);
        textView.setTextSize(22.0f);
        textView.setTypeface(Typeface.defaultFromStyle(0));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C0590I.c(8);
        linearLayout.addView(textView, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(Init.context());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        TextView textView2 = new TextView(Init.context());
        textView2.setText("🐢 Go: 检测中...");
        textView2.setGravity(17);
        textView2.setTextColor(-125269880);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(Typeface.defaultFromStyle(0));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.rightMargin = C0590I.c(20);
        linearLayout2.addView(textView2, layoutParams2);
        View view = new View(Init.context());
        view.setBackgroundColor(-3355444);
        linearLayout2.addView(view, new LinearLayout.LayoutParams(1, C0590I.c(32)));
        TextView textView3 = new TextView(Init.context());
        textView3.setText("☕ Java: 检测中...");
        textView3.setGravity(17);
        textView3.setTextColor(-125269880);
        textView3.setTextSize(14.0f);
        textView3.setTypeface(Typeface.defaultFromStyle(0));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = C0590I.c(20);
        linearLayout2.addView(textView3, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.bottomMargin = C0590I.c(16);
        linearLayout.addView(linearLayout2, layoutParams4);
        String[] strArr = {"🐢 Go多线程（高性能）", "☕ Java多线程（稳定）"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("proxyMode");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].contains(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("选择代理引擎").setView(linearLayout).setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.k()).create();
        alertDialogCreate.show();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        new Thread(new b(textView2, textView3)).start();
    }

    public static C0588G q() {
        return a.a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void quarkHD(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("夸克网盘画质");
        String[] strArr = {"夸克原画", "夸克普画", "夸克智能", "夸克原画|夸克普画", "夸克普画|夸克原画"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("quarkHD");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.c()).create().show();
    }

    private void quarkThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("夸克网盘线程");
        String[] strArr = {"4", "8", "16", "32", "64", "128", "256"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("quarkThread");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.f()).create().show();
    }

    private void quarktip(Map<String, String> map) {
        Application applicationContext = Init.context();
        LinearLayout linearLayout = new LinearLayout(applicationContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iC = C0590I.c(24);
        int iC2 = C0590I.c(20);
        linearLayout.setPadding(iC, iC2, iC, iC2);
        TextView textView = new TextView(applicationContext);
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-15066598);
        textView.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView, layoutParams);
        View view = new View(applicationContext);
        view.setBackgroundColor(-1512723);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C0590I.c(2));
        layoutParams2.bottomMargin = C0590I.c(12);
        linearLayout.addView(view, layoutParams2);
        TextView textView2 = new TextView(applicationContext);
        textView2.setText("✦ 夸克原画\n4K画质，超级会员不限速，非会员建议观看10G以内视频\n\n✦ 夸克普画\n转码画质，超级会员4K，非会员标清\n\n✦ 夸克智能\n4K画质，不转存，超级会员不限速，非会员建议观看30G以内视频");
        textView2.setGravity(0);
        textView2.setTextColor(-10525848);
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing(1.5f, 1.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(applicationContext);
        textView3.setText("⚠ 夸克网盘会自动创建临时缓存文件夹 Quarktemp，文件夹内的文件会定时清空，请不要存放任何文件！");
        textView3.setGravity(17);
        textView3.setTextColor(-3857889);
        textView3.setTextSize(13.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-202522);
        gradientDrawable.setCornerRadius(8.0f);
        textView3.setBackground(gradientDrawable);
        int iC3 = C0590I.c(12);
        textView3.setPadding(iC3, iC3, iC3, iC3);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(applicationContext);
        textView4.setText("✓ 我知道了");
        textView4.setGravity(17);
        textView4.setTextColor(-15043608);
        textView4.setTextSize(16.0f);
        textView4.setOnClickListener(new AnonymousClass8());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = C0590I.c(24);
        layoutParams4.gravity = 1;
        linearLayout.addView(textView4, layoutParams4);
        Init.execute(new q(this, map, 0));
        this.a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private String r(String str) {
        return "ali".equals(str) ? "请使用阿里云盘APP扫码" : "quark".equals(str) ? "请使用夸克浏览器扫码" : "uc".equals(str) ? "请使用UC浏览器扫码" : "bili".equals(str) ? "请使用哔哩哔哩APP扫码" : "cloud189".equals(str) ? "请使用天翼云盘APP扫码" : "请使用浏览器或者微信扫描二维码";
    }

    public static void restartApp() {
        try {
            new Handler(Looper.getMainLooper()).postDelayed(new HH$1(Init.context()), 500L);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JSONObject s(String str) {
        String strL;
        try {
            JSONObject jSONObject = new JSONObject();
            if ("ali".equals(str)) {
                String strL2 = C0575b.l("https://passport.aliyundrive.com/newlogin/qrcode/generate.do?appName=aliyun_drive&fromSite=52&appName=aliyun_drive&appEntrance=web&isMobile=false&lang=zh_CN&returnUrl=&bizParams=&_bx-v=2.2.3", null);
                com.github.catvod.spider.merge.d.d dVarC = com.github.catvod.spider.merge.d.d.g(strL2).b().c();
                SpiderDebug.log(dVarC.toString());
                jSONObject.put("url", dVarC.a());
                jSONObject.put("token", new JSONObject(dVarC.d()));
                jSONObject.put("json", strL2);
            } else {
                if ("quark".equals(str)) {
                    HashMap map = new HashMap();
                    map.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) quark-cloud-drive/3.0.1 Chrome/100.0.4896.160 Electron/18.3.5.12-a038f7b798 Safari/537.36 Channel/pckk_other_ch");
                    strL = new JSONObject(C0575b.l("https://uop.quark.cn/cas/ajax/getTokenForQrcodeLogin?client_id=532&v=1.2", map)).optJSONObject("data").optJSONObject("members").optString("token");
                    jSONObject.put("url", "https://su.quark.cn/4_eMHBJ?token=" + strL + "&client_id=532&ssb=weblogin&uc_param_str=&uc_biz_str=S%3Acustom%7COPT%3ASAREA%400%7COPT%3AIMMERSIVE%401%7COPT%3ABACK_BTN_STYLE%400");
                } else if ("uc".equals(str)) {
                    HashMap map2 = new HashMap();
                    map2.put("Accept", "application/json, text/plain, */*");
                    map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    map2.put("Referer", "https://broccoli.uc.cn/");
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    strL = new JSONObject(C0575b.l("https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?pr=UCBrowser&fr=pc&sys=win32&client_id=529&v=1.2&request_id=" + sb.toString(), map2)).optJSONObject("data").optJSONObject("members").optString("token");
                    jSONObject.put("url", "https://su.uc.cn/4_fzMj2?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strL + "&client_id=529&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
                } else if ("bili".equals(str)) {
                    HashMap map3 = new HashMap();
                    map3.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 Edg/126.0.0.0");
                    C0563b c0563bA = com.github.catvod.spider.merge.f.e.b(C0575b.l("https://passport.bilibili.com/x/passport-login/web/qrcode/generate?source=main-mini", map3)).a();
                    jSONObject.put("url", c0563bA.q());
                    strL = c0563bA.l();
                } else if ("cloud".equals(str)) {
                    if (C0548l.k()) {
                        jSONObject.put("url", C0548l.c().j());
                    }
                } else if ("baidu".equals(str)) {
                    C0546j.o();
                }
                jSONObject.put("token", strL);
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private void show123RegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册123云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapA = C0604m.a("https://www.123pan.com");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        int iC2 = C0590I.c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void show189RegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册天翼云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapA = C0604m.a("https://h5.cloud.189.cn");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        int iC2 = C0590I.c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showAliyunRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册阿里云盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapA = C0604m.a("https://www.alipan.com");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        int iC2 = C0590I.c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showAuthDialog(final Map map, final String str, String str2, boolean z, boolean z2, boolean z3) {
        try {
            String strOptString = z3 ? this.b : new JSONObject((String) map.get("url")).optString("url");
            LinearLayout linearLayout = new LinearLayout(Init.context());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(-1);
            if (z) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.topMargin = C0590I.c(20);
                TextView textView = new TextView(Init.context());
                textView.setText(str2);
                textView.setGravity(17);
                textView.setTextColor(-16777216);
                linearLayout.addView(textView, layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                ImageView imageView = new ImageView(Init.context());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setImageBitmap(C0604m.a(strOptString));
                linearLayout.addView(imageView, layoutParams2);
                Init.execute(new p(this, map, 0));
            }
            final EditText editText = null;
            if (z2) {
                if ("cloud".equals(str)) {
                    y(map);
                    return;
                }
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(C0590I.c(16), C0590I.c(16), C0590I.c(16), C0590I.c(16));
                EditText editText2 = new EditText(Init.context());
                editText2.setHintTextColor(-3355444);
                editText2.setHint("请将已有" + ("ali".equals(str) ? "阿里云盘32位Token" : "quark".equals(str) ? "夸克网盘Cookie" : "uc".equals(str) ? "UC网盘Cookie" : "哔哩哔哩Cookie") + "粘贴到此处...");
                linearLayout.addView(editText2, layoutParams3);
                editText = editText2;
            }
            AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
            if (z) {
                AlertDialog.Builder positiveButton = z3 ? view.setPositiveButton("扫码授权", new o(this, map, str, 0)) : view.setPositiveButton("远程输入", new x(this, map, 0));
                if ((Init.context().getPackageManager().hasSystemFeature("android.hardware.type.television") ? false : true) && !"ali".equals(str) && !"cloud123".equals(str) && !"cloud".equals(str)) {
                    positiveButton = positiveButton.setNeutralButton("APP授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.A
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C0588G.b(this.a, map);
                        }
                    });
                }
                view = positiveButton.setNegativeButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.B
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0588G.o(this.a, map);
                    }
                });
            }
            if (z2) {
                final EditText editText3 = null;
                view = view.setNeutralButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.F
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C0588G.e(this.a, map, str);
                    }
                }).setNegativeButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.z
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        final C0588G c0588g = this.a;
                        final EditText editText4 = editText;
                        final String str3 = str;
                        EditText editText5 = editText3;
                        c0588g.getClass();
                        if (editText4 != null && !TextUtils.isEmpty(editText4.getText().toString())) {
                            Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.m.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0588G.g(c0588g, str3, editText4);
                                }
                            });
                        }
                        if (editText5 == null || TextUtils.isEmpty(editText5.getText().toString())) {
                            return;
                        }
                        Init.execute(new com.github.catvod.spider.merge.b.r(c0588g, editText5, 4));
                    }
                });
            }
            AlertDialog alertDialogShow = view.show();
            this.a = alertDialogShow;
            this.a = alertDialogShow;
            alertDialogShow.setOnCancelListener(new H0(this));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showBaiduRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册百度网盘 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapA = C0604m.a("https://pan.baidu.com");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        int iC2 = C0590I.c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showQuarkRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册夸克网盘 ✨\n✨ 新用户注册赠送1T空间 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapA = C0604m.a("https://pan.quark.cn/s/24f565ff8b77");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        int iC2 = C0590I.c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void showUCRegisterDialog() {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText("✨ 扫码下载APP注册UC网盘 ✨\n✨ 新用户注册赠送1T空间 ✨");
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        textView.setTypeface(null, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(20);
        linearLayout.addView(textView, layoutParams);
        ImageView imageView = new ImageView(Init.context());
        Bitmap bitmapA = C0604m.a("https://drive.uc.cn/s/81ab6c3095e24");
        if (bitmapA != null) {
            imageView.setImageBitmap(bitmapA);
        }
        int iC2 = C0590I.c(200);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.topMargin = C0590I.c(20);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private String u(String str, String str2) {
        String str3;
        String str4;
        try {
            if ("ali".equals(str)) {
                C0545i.d().t(str2);
            } else if ("quark".equals(str)) {
                if (com.github.catvod.spider.merge.b.w.e().v(str2)) {
                    C0590I.i("夸克网盘授权成功");
                }
            } else if ("uc".equals(str)) {
                if (C0536B.c().t(str2)) {
                    C0590I.i("UC网盘授权成功");
                }
            } else if ("bili".equals(str)) {
                if (AmuBiliV2.refreshUser(str2)) {
                    C0590I.i("哔哩哔哩授权成功");
                }
            } else if ("123panfxck".equals(str)) {
                C0545i.d().x(str2);
            } else {
                if ("cloud123".equals(str)) {
                    String[] strArrSplit = str2.split("\\|");
                    if (com.github.catvod.spider.merge.b.m.a().j(strArrSplit[0], strArrSplit[1])) {
                        str4 = "123云盘登录成功";
                    } else {
                        str4 = "123云盘登录失败:" + com.github.catvod.spider.merge.b.m.a().f();
                    }
                    if (strArrSplit.length == 3) {
                        C0590I.i(str4);
                    }
                    B();
                    return str4;
                }
                if ("cloud189".equals(str)) {
                    String[] strArrSplit2 = str2.split("\\|");
                    if (C0548l.c().b(strArrSplit2[0], strArrSplit2[1])) {
                        str3 = "天翼云盘登录成功";
                    } else {
                        str3 = "天翼云盘登录失败:" + C0548l.c().i();
                    }
                    if (strArrSplit2.length == 3) {
                        C0590I.i(str3);
                    }
                    B();
                    return str3;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            B();
            throw th;
        }
        B();
        return "推送成功,请在设备上查看";
    }

    private void ucHD(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("UC网盘画质");
        String[] strArr = {"UC原画", "UC普画", "UC原画|UC普画", "UC普画|UC原画"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("ucHD");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.d()).create().show();
    }

    private void ucThread(Map<String, String> map) {
        AlertDialog.Builder title = new AlertDialog.Builder(Init.getConfigActivity()).setTitle("UC网盘线程");
        String[] strArr = {"自动", "4", "8", "16", "32", "64", "128", "256"};
        int i = 0;
        String strA = C0602k.a(C0602k.c("/config.json"));
        if (!TextUtils.isEmpty(strA)) {
            try {
                String strOptString = new JSONObject(strA).optString("ucThread");
                int i2 = 0;
                while (true) {
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if (strArr[i2].equals(strOptString)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        title.setSingleChoiceItems(strArr, i, new Option()).setPositiveButton("确定", new com.github.catvod.spider.merge.A.g()).create().show();
    }

    private void uctip(Map<String, String> map) {
        Application applicationContext = Init.context();
        LinearLayout linearLayout = new LinearLayout(applicationContext);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        int iC = C0590I.c(24);
        int iC2 = C0590I.c(20);
        linearLayout.setPadding(iC, iC2, iC, iC2);
        TextView textView = new TextView(applicationContext);
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-15066598);
        textView.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView, layoutParams);
        View view = new View(applicationContext);
        view.setBackgroundColor(-1512723);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C0590I.c(2));
        layoutParams2.bottomMargin = C0590I.c(12);
        linearLayout.addView(view, layoutParams2);
        TextView textView2 = new TextView(applicationContext);
        textView2.setText("✦ UC原画\n4K画质，超级会员不限速，非会员建议观看5G以内的视频\n\n✦ UC普画\n转码画质，超级会员4K，非会员标清\n\n✦ UC普画(设置UC TV)\n转码4K画质，不限速");
        textView2.setGravity(0);
        textView2.setTextColor(-10525848);
        textView2.setTextSize(14.0f);
        textView2.setLineSpacing(1.5f, 1.5f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView2, layoutParams3);
        TextView textView3 = new TextView(applicationContext);
        textView3.setText("⚠ UC网盘会自动创建临时缓存文件夹 UCtemp，文件夹内的文件会定时清空，请不要存放任何文件！");
        textView3.setGravity(17);
        textView3.setTextColor(-3857889);
        textView3.setTextSize(13.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-202522);
        gradientDrawable.setCornerRadius(8.0f);
        textView3.setBackground(gradientDrawable);
        int iC3 = C0590I.c(12);
        textView3.setPadding(iC3, iC3, iC3, iC3);
        linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(applicationContext);
        textView4.setText("✓ 我知道了");
        textView4.setGravity(17);
        textView4.setTextColor(-15043608);
        textView4.setTextSize(16.0f);
        textView4.setOnClickListener(new AnonymousClass8());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = C0590I.c(24);
        layoutParams4.gravity = 1;
        linearLayout.addView(textView4, layoutParams4);
        Init.execute(new q(this, map, 0));
        this.a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    private void update(Map<String, String> map) {
        new AlertDialog.Builder(Init.getConfigActivity()).setTitle("检查更新").setMessage("请选择操作").setPositiveButton("开启", new UpdateListener(true)).setNegativeButton("关闭", new UpdateListener(false)).create().show();
    }

    public static void updateCloudConfig(boolean z, Context context, String str) {
        String str2 = null;
        try {
            File fileC = C0602k.c("/config.json");
            JsonObject jsonObject = new JsonObject();
            if (fileC.exists() && fileC.length() > 0) {
                String strA = C0602k.a(fileC);
                if (strA.length() > 0) {
                    jsonObject = new JsonParser().parse(strA).getAsJsonObject();
                }
            }
            String asString = jsonObject.has("panBlock") ? jsonObject.get("panBlock").getAsString() : "";
            if (z) {
                if (asString.contains(str)) {
                    jsonObject.addProperty("panBlock", asString.replace("," + str, "").replace(str + ",", "").replace(str, ""));
                    C0602k.c(fileC, jsonObject.toString());
                    str2 = str + "已开启";
                } else {
                    str2 = str + "已是开启状态";
                }
            } else if (!asString.contains(str)) {
                jsonObject.addProperty("panBlock", asString.isEmpty() ? str : asString + "," + str);
                C0602k.c(fileC, jsonObject.toString());
                str2 = str + "已关闭";
            }
            if (str2 == null) {
                str2 = str + "已是关闭状态";
            }
            Toast.makeText(context, str2, 0).show();
        } catch (Exception e) {
            e.printStackTrace();
            C0590I.i("操作失败");
        }
    }

    private void v(Map<String, String> map) {
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        int iC = C0590I.c(20);
        linearLayout.setPadding(iC, iC, iC, iC);
        TextView textView = new TextView(Init.context());
        textView.setText(map.get("flag"));
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = C0590I.c(16);
        linearLayout.addView(textView, layoutParams);
        int iC2 = C0590I.c(200);
        ImageView imageView = new ImageView(Init.context());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(C0546j.f().n());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iC2, iC2);
        layoutParams2.gravity = 17;
        linearLayout.addView(imageView, layoutParams2);
        Init.execute(new q(this, map, 0));
        this.a = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout).setCancelable(true).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Map<String, String> map) {
        try {
            String str = map.get("site");
            if (handleSpecialSite(str, map)) {
                return;
            }
            if (isCloudSite(str)) {
                cloudSwitch(map);
            } else {
                showAuthDialog(map, str, map.get("flag"), !"0".equals(map.get("button")), !TextUtils.isEmpty(map.get("input")), !TextUtils.isEmpty(map.get("push")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void x(final Map<String, String> map) {
        final EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint("请输入123云盘账号");
        final EditText editText2 = new EditText(Init.context());
        editText2.setHintTextColor(-3355444);
        editText2.setHint("请输入123云盘密码");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(0, 0, 0, 0);
        String str = map.get("model");
        String str2 = map.get("flag");
        if (TextUtils.isEmpty(str)) {
            TextView textView = new TextView(Init.context());
            if (TextUtils.isEmpty(str2)) {
                str2 = "请输入123云盘账号密码";
            }
            textView.setText(str2);
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C0590I.c(20);
            layoutParams.bottomMargin = C0590I.c(10);
            linearLayout.addView(textView, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            int iC = C0590I.c(16);
            layoutParams2.setMargins(iC, 0, iC, 0);
            layoutParams2.bottomMargin = C0590I.c(10);
            linearLayout.addView(editText, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int iC2 = C0590I.c(16);
            layoutParams3.setMargins(iC2, 0, iC2, 0);
            linearLayout.addView(editText2, layoutParams3);
        } else {
            TextView textView2 = new TextView(Init.context());
            textView2.setText("请使用浏览器或者微信扫描二维码");
            textView2.setGravity(17);
            textView2.setTextColor(-16777216);
            textView2.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C0590I.c(20);
            layoutParams4.bottomMargin = C0590I.c(10);
            linearLayout.addView(textView2, layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C0590I.c(200), C0590I.c(200));
            layoutParams5.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0604m.a(this.b));
            linearLayout.addView(imageView, layoutParams5);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
        this.a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterfaceOnClickListenerC0584C(this, map)).setNegativeButton("登录", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final C0588G c0588g = this.a;
                final EditText editText3 = editText;
                final EditText editText4 = editText2;
                c0588g.getClass();
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.merge.m.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0588G.m(c0588g, editText3, editText4);
                    }
                });
            }
        }) : view.setNeutralButton("手动输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C0588G c0588g = this.a;
                Map map2 = map;
                c0588g.getClass();
                map2.put("model", "");
                map2.put("flag", "请输入123云盘账号密码");
                Init.execute(new s(c0588g, map2, 1));
            }
        })).show();
    }

    private void y(final Map<String, String> map) {
        EditText editText = new EditText(Init.context());
        editText.setHintTextColor(-3355444);
        editText.setHint("请输入天翼云盘账号");
        EditText editText2 = new EditText(Init.context());
        editText2.setHintTextColor(-3355444);
        editText2.setHint("请输入天翼云盘密码");
        LinearLayout linearLayout = new LinearLayout(Init.context());
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(0, 0, 0, 0);
        String str = map.get("model");
        String str2 = map.get("flag");
        if (TextUtils.isEmpty(str)) {
            TextView textView = new TextView(Init.context());
            if (TextUtils.isEmpty(str2)) {
                str2 = "请输入天翼云盘账号密码";
            }
            textView.setText(str2);
            textView.setGravity(17);
            textView.setTextColor(-16777216);
            textView.setTextSize(15.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = C0590I.c(20);
            layoutParams.bottomMargin = C0590I.c(10);
            linearLayout.addView(textView, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            int iC = C0590I.c(16);
            layoutParams2.setMargins(iC, 0, iC, 0);
            layoutParams2.bottomMargin = C0590I.c(10);
            linearLayout.addView(editText, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            int iC2 = C0590I.c(16);
            layoutParams3.setMargins(iC2, 0, iC2, 0);
            linearLayout.addView(editText2, layoutParams3);
        } else {
            TextView textView2 = new TextView(Init.context());
            textView2.setText("请使用浏览器或者微信扫描二维码");
            textView2.setGravity(17);
            textView2.setTextColor(-16777216);
            textView2.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams4.topMargin = C0590I.c(20);
            layoutParams4.bottomMargin = C0590I.c(10);
            linearLayout.addView(textView2, layoutParams4);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(C0590I.c(200), C0590I.c(200));
            layoutParams5.gravity = 17;
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0604m.a(this.b));
            linearLayout.addView(imageView, layoutParams5);
        }
        AlertDialog.Builder view = new AlertDialog.Builder(Init.getConfigActivity()).setView(linearLayout);
        this.a = (TextUtils.isEmpty(str) ? view.setNeutralButton("远程输入", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.E
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C0588G c0588g = this.a;
                Map map2 = map;
                c0588g.getClass();
                map2.put("model", "1");
                map2.put("flag", "请使用浏览器或者微信扫描二维码");
                Init.execute(new t(c0588g, map2, 0));
            }
        }).setPositiveButton("登录", new o(this, editText, editText2, i)).setNegativeButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                HashMap map2 = new HashMap();
                map2.put("site", "cloud");
                map2.put("push", "");
                map2.put("flag", "请使用天翼云盘APP扫码");
                map2.put("button", "1");
                Init.execute(new q(C0588G.this, map2, 1));
                dialogInterface.dismiss();
            }
        }) : view.setNeutralButton("手动输入", new x(this, map, i)).setNegativeButton("扫码授权", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.m.G.7
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                HashMap map2 = new HashMap();
                map2.put("site", "cloud");
                map2.put("push", "");
                map2.put("flag", "请使用天翼云盘APP扫码");
                map2.put("button", "1");
                Init.execute(new q(C0588G.this, map2, 1));
                dialogInterface.dismiss();
            }
        })).show();
    }

    void callShow123RegisterDialog() {
        show123RegisterDialog();
    }

    void callShow189RegisterDialog() {
        show189RegisterDialog();
    }

    void callShowAliyunRegisterDialog() {
        showAliyunRegisterDialog();
    }

    void callShowBaiduRegisterDialog() {
        showBaiduRegisterDialog();
    }

    void callShowQuarkRegisterDialog() {
        showQuarkRegisterDialog();
    }

    void callShowUCRegisterDialog() {
        showUCRegisterDialog();
    }

    void dismissAlertDialog() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final Object[] t(Map<String, String> map) {
        try {
            return "push".equals(map.get("operate")) ? new Object[]{200, "text/plain; charset=utf-8", new ByteArrayInputStream(u(map.get("site"), map.get("token")).getBytes("UTF-8"))} : new Object[]{200, "text/html; charset=utf-8", new ByteArrayInputStream("<!DOCTYPE html> <html lang=\"zh-cmn-Hans\"> <head> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,user-scalable=0,viewport-fit-cover\"> <title></title> <style> body { display: flex; flex-direction: column; align-items: center; justify-content: center; min-height: 100vh; margin: 0; font-family: Arial, sans-serif } .container { width: 90%; max-width: 500px; display: flex; flex-direction: column; align-items: center } .title { font-size: 1.2em; margin-bottom: 30px; text-align: center } .title span { color: red; font-weight: bold } .input-wrapper { width: 100%; margin-bottom: 15px } .input-wrapper textarea { width: 100%; height: 100px; box-sizing: border-box; padding: 10px; font-size: 1em; resize: none } .select-container { width: 100%; margin-bottom: 15px } .select-container select { width: 100%; height: 42px; box-sizing: border-box; padding: 0 10px; font-size: 1em; text-align: center; text-align-last: center } .button { width: 100%; height: 42px; box-sizing: border-box; font-size: 1em; margin-bottom: 10px; cursor: pointer } .button.push { background-color: #4CAF50; color: white; border: none } .button.clear { background-color: #f44336; color: white; border: none } .account-wrapper { width: 100%; margin-bottom: 15px; display: none } .account-wrapper input { width: 100%; height: 42px; margin-bottom: 10px; padding: 0 10px; box-sizing: border-box; font-size: 1em } </style> </head> <body> <div class=\"container\"> <div class=\"title\"><span></span></div> <div class=\"select-container\"><select id=\"push_type\"> <option value=\"\">请选择需要操作的云盘</option> <option value=\"uc\">UC Cookie</option> <option value=\"quark\">夸克Cookie</option> <option value=\"ali\">阿里Token</option> <option value=\"bili\">哔哩Cookie</option> <option value=\"cloud189\">天翼云盘登录</option> <option value=\"cloud123\">123云盘登录</option> <option value=\"123panfxck\">123云盘社区Cookie</option> </select></div><!--原有textarea容器--> <div class=\"input-wrapper\"><textarea id=\"token\" placeholder=\"请输入需要推送的Cookie或Token\"></textarea></div> <!--新增账号密码容器--> <div class=\"account-wrapper\"><input type=\"text\" id=\"account\" placeholder=\"云盘账号\"><input type=\"text\" id=\"password\" placeholder=\"云盘密码\"></div><button class=\"button push\" onclick=\"push()\">推送</button><button class=\"button clear\" onclick=\"clearInput()\">清除</button> </div> <script> document.addEventListener('DOMContentLoaded', function() { const tokenWrapper = document.querySelector('.input-wrapper'); const accountWrapper = document.querySelector('.account-wrapper'); tokenWrapper.style.display = 'none'; accountWrapper.style.display = 'none'; document.getElementById('push_type').addEventListener('change', function() { const is123 = this.value === 'cloud123' || this.value === 'cloud189' ; const hasValue = this.value !== ''; tokenWrapper.style.display = hasValue && !is123 ? 'block' : 'none'; accountWrapper.style.display = is123 ? 'block' : 'none' }) }); function push() { const pushType = document.getElementById('push_type').value; let apiUrl = '/proxy?do=push&site=' + pushType + '&operate=push'; let token = ''; if (pushType === 'cloud123' || pushType === 'cloud189' ) { const account = encodeURIComponent(document.getElementById('account').value); const password = encodeURIComponent(document.getElementById('password').value); token = account + '|' + password; } else { token = encodeURIComponent(document.getElementById('token').value); } apiUrl += '&token=' + token; const xhr = new XMLHttpRequest(); xhr.open('GET', apiUrl, true); xhr.onreadystatechange = function() { if (xhr.readyState === XMLHttpRequest.DONE) { alert(xhr.status === 200 ? xhr.responseText : '请求失败') } }; xhr.send() } function clearInput() { document.getElementById('token').value = ''; document.getElementById('account').value = ''; document.getElementById('password').value = '' } </script> </body> </html>".getBytes("UTF-8"))};
        } catch (Exception unused) {
            return new Object[]{200, "text/html; charset=utf-8", new ByteArrayInputStream("ok".getBytes())};
        }
    }

    public final void z(Map<String, String> map) {
        try {
            map.put("url", s(map.get("site")).toString());
            Init.run(new s(this, map, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
