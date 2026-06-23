package com.github.catvod.spider.merge.A;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class k implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        switch (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()) {
            case 0:
                str = "Go多线程";
                break;
            case 1:
                str = "Java多线程";
                break;
        }
        try {
            File fileC = C0602k.c("/config.json");
            JSONObject jSONObject = new JSONObject();
            if (fileC.exists() && ((int) fileC.length()) > 0) {
                String strA = C0602k.a(fileC);
                if (strA.length() > 0) {
                    jSONObject = new JSONObject(strA);
                }
            }
            jSONObject.put("proxyMode", str);
            C0602k.c(fileC, jSONObject.toString());
            Log.i("Config", "配置已保存到config.json, Multi: " + str);
            C0590I.i("多线程模式已设置: \n" + str);
            dialogInterface.dismiss();
        } catch (Exception e) {
            C0590I.i("多线程模式设置失败: " + e);
            Log.e("Config", "保存配置失败", e);
        }
    }
}
