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
import com.github.catvod.spider.merge.q1.StringUtils;
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
                linearLayout.setOrientation(LinearLayout.VERTICAL);
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
                            Toast.makeText(Init2.getActivity(), "激活码错误", Toast.LENGTH_LONG).show();
                        }
                    }
                });
                return alertDialogCreate;
            }
            return null;
        } catch (JSONException e) {
            StringUtils.printStackTrace(e);
        }
        return null;
    }

    static void showToast(String str) {
        Toast.makeText(context(), str, Toast.LENGTH_LONG).show();
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
