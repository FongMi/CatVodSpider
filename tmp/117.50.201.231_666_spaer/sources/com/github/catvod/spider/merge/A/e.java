package com.github.catvod.spider.merge.A;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class e implements DialogInterface.OnClickListener {
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        String str = null;
        switch (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition()) {
            case 0:
                str = "4";
                break;
            case 1:
                str = "8";
                break;
            case 2:
                str = "16";
                break;
            case 3:
                str = "32";
                break;
            case 4:
                str = "64";
                break;
            case 5:
                str = "128";
                break;
            case 6:
                str = "256";
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
            jSONObject.put("aliThread", str);
            C0602k.c(fileC, jSONObject.toString());
            Log.i("Config", "配置已保存到config.json, aliThread: " + str);
            C0590I.i("阿里线程已设置: " + str);
            dialogInterface.dismiss();
        } catch (Exception e) {
            C0590I.i("线程设置失败: " + e);
            Log.e("Config", "保存配置失败", e);
        }
    }
}
