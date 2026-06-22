package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.W;
import com.github.catvod.spider.merge.eE;
import com.github.catvod.spider.merge.fS;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

public class Init2 {
    private static EditText activationCodeInput;
    public static String imageUrl;
    public static String mpName;
    public static String message;
    public static String activationKey;
    public static String copyTip;
    public static int status;
    public static String title;
    public static String inputCode;
    public static int noticeType;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private Application application;

    private static final short[] f29short = {2371, 2328, 2334, 2371, 2370, 2375, 2323, 2323, 2372, 2381, 2375, 2381, 2371, 2381, 2373, 2332, 2373, 2328, 2375, 2332, 2380, 2375, 2334, 2374, 2332, 2328, 2369, 2370, 2380, 2369, 2333, 2323, 2332, 2333, 2323, 2332, 2333, 2369, 2369, 2372, 2380, 2375, 2380, 2328, 2375, 2369, 2375, 2381, 2372, 2375, 2373, 2375, 2368, 2332, 2323, 2370, 2332, 2371, 2373, 2334, 2368, 2380, 2372, 2373, 2373, 2369, 537, 548, 569, 545, 552, 1818, 1851, 1824, 1853, 1847, 1841, 2360, 2320, 2310, 2310, 2324, 2322, 2320, 2589, 2623, 2587, 2613, 2601, 1904, 1879, 1858, 1879, 1878, 1872, 707, 743, 749, 735, 760, 742, 1346, 1390, 1393, 1400, 1397, 1384, 1393, 1837, 1808, 1806, 1793, 1805, 1797, 1096, 1102, 1112, 1103, 1145, 1116, 1097, 1116, 2133, 2116, 2134, 2134, 2130, 2122, 2135, 2113, -30313, -29197, 21253, 28064, 28507, 31329, 17554, 23314, 26959, 29605, 27938, 28633, 3320, 3319, 3325, 3307, 3318, 3312, 3325, 3255, 3320, 3305, 3305, 3255, 3288, 3322, 3309, 3312, 3311, 3312, 3309, 3296, 3277, 3313, 3307, 3324, 3320, 3325, 2192, 2182, 2177, 2177, 2198, 2205, 2183, 2226, 2192, 2183, 2202, 2181, 2202, 2183, 2186, 2215, 2203, 2177, 2198, 2194, 2199, 1248, 1228, 1262, 1273, 1252, 1275, 1252, 1273, 1252, 1256, 1278, 2757, 2772, 2752, 2758, 2768, 2769, 2801, 2803, 2788, 2809, 2790, 2809, 2788, 2793, -30117, 20523, 17912, 31133, -29222, 17746, 29616, 22801, -31540, 27041, 22830, -2896};
    public static Boolean dialogShown = Boolean.FALSE;

    private static class Loader {
        static volatile Init2 l8 = new Init2();

        private Loader() {
        }
    }

    public Init2() {
    }

    public static AlertDialog N0() {
        try {
            JSONObject jSONObject = new JSONObject(eE.l8("{\"Status\":0,\"Notice\":0,\"MoKey\":\"8972\",\"Mpname\":\"\",\"Copytip\":\"\",\"Title\":\"\",\"Message\":\"激活码8972\",\"ImgUrl\":\"\",\"WcNob\":\"\"}"));
            title = jSONObject.optString("Title");
            noticeType = jSONObject.getInt("Notice");
            message = jSONObject.optString("Message");
            activationKey = jSONObject.optString("MoKey");
            status = jSONObject.getInt("Status");
            imageUrl = jSONObject.optString("ImgUrl");
            copyTip = jSONObject.optString("Copytip");
            mpName = jSONObject.optString("Mpname");
            String savedPassword = getActivity().getSharedPreferences("userData", 0).getString("password", "");

            if (status == 0) {
                if (savedPassword.equals(activationKey)) {
                    return null;
                }
                if (dialogShown.booleanValue()) {
                    return null;
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                LinearLayout linearLayout = new LinearLayout(getActivity());
                linearLayout.setOrientation(1);
                fS fSVar = new fS(getActivity());
                fSVar.setMaxHeight(300);
                fSVar.HM(imageUrl);
                EditText editText = new EditText(getActivity());
                activationCodeInput = editText;
                editText.setHint("请输入激活码");
                activationCodeInput.setInputType(2);
                linearLayout.addView(fSVar);
                linearLayout.addView(activationCodeInput);

                if (noticeType == 1) {
                    linearLayout.removeView(activationCodeInput);
                    builder.setCancelable(true).setMessage(message).setView(linearLayout)
                        .setNegativeButton("不再提示", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i7) {
                                SharedPreferences.Editor editorEdit = Init2.getActivity().getSharedPreferences("userData", 0).edit();
                                editorEdit.putString("password", Init2.activationKey);
                                editorEdit.apply();
                            }
                        });
                } else {
                    builder.setCancelable(false).setMessage(message).setView(linearLayout)
                        .setNeutralButton("激活", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i7) {
                            }
                        })
                        .setPositiveButton("不再提示", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i7) {
                                System.exit(0);
                            }
                        });
                }

                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialogInterface) {
                        Log.e("TAG", "对话框消失了");
                    }
                });
                alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialogInterface) {
                    }
                });
                alertDialogCreate.show();
                dialogShown = Boolean.TRUE;
                alertDialogCreate.getButton(-3).setOnClickListener(new View.OnClickListener() {
                    final AlertDialog l8 = alertDialogCreate;

                    @Override
                    public void onClick(View view) {
                        String string2 = Init2.activationCodeInput.getText().toString();
                        Init2.inputCode = string2;
                        if (!TextUtils.isEmpty(string2) && Init2.inputCode.equals(Init2.activationKey)) {
                            SharedPreferences.Editor editorEdit = Init2.getActivity().getSharedPreferences("userData", 0).edit();
                            editorEdit.putString("password", Init2.activationKey);
                            editorEdit.apply();
                            this.l8.dismiss();
                        } else {
                            Toast.makeText(Init2.getActivity(), "激活码错误", 1).show();
                        }
                    }
                });
                return alertDialogCreate;
            }
            return null;
        } catch (JSONException e) {
            StringUtils.printStackTrace();
        }
        return null;
    }

    static void showToast(String str) {
        Toast.makeText(context(), str, 1).show();
    }

    public static Application context() {
        return get().application;
    }

    public static Init2 get() {
        return Loader.l8;
    }

    public static Activity getActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Iterator it = ((Map) declaredField.get(objInvoke)).values().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Class<?> cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    Activity activity = (Activity) declaredField3.get(next);
                    SpiderDebug.log(activity.getComponentName().getClassName());
                    return activity;
                }
            }
            return null;
        } catch (Exception e) {
            StringUtils.printStackTrace();
            return null;
        }
    }

    public static void init(Context context) {
        W.l8();
        Application application = (Application) context;
        Init2 init2 = get();
        init2.application = application;
        SpiderDebug.log("自定义爬虫代码加载成功！");
    }

    public static void lj() {
        get().mainHandler.post(new Runnable() {
            @Override
            public final void run() {
                Init2.N0();
            }
        });
    }

    public static void run(Runnable runnable) {
        get().mainHandler.post(runnable);
    }

    public static void show(final String str) {
        Init2 init2 = get();
        Handler handler = init2.mainHandler;
        handler.post(new Runnable() {
            public final String l8 = str;

            @Override
            public final void run() {
                Init2.showToast(this.l8);
            }
        });
    }
}
