package com.github.catvod.spider.merge.A;

import android.content.DialogInterface;
import android.util.Log;
import com.github.catvod.spider.merge.m.C0588G;
import com.github.catvod.spider.merge.m.C0590I;
import com.github.catvod.spider.merge.m.C0602k;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class h implements DialogInterface.OnClickListener {
    private C0588G.HomePageOption optionListener;

    public h(C0588G.HomePageOption homePageOption) {
        this.optionListener = homePageOption;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        boolean[] selectedOptions = this.optionListener.getSelectedOptions();
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"热门电影", "热播剧集", "热门动漫", "热播综艺", "电影筛选", "电视筛选", "电影榜单", "电视剧榜单"};
        for (int i2 = 0; i2 < selectedOptions.length; i2++) {
            if (selectedOptions[i2]) {
                arrayList.add(strArr[i2]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (i3 > 0) {
                sb.append(",");
            }
            sb.append((String) arrayList.get(i3));
        }
        String string = sb.toString();
        try {
            File fileC = C0602k.c("/config.json");
            JSONObject jSONObject = new JSONObject();
            if (fileC.exists() && ((int) fileC.length()) > 0) {
                String strA = C0602k.a(fileC);
                if (strA.length() > 0) {
                    jSONObject = new JSONObject(strA);
                }
            }
            jSONObject.put("homePage", string);
            C0602k.c(fileC, jSONObject.toString());
            Log.i("Config", "配置已保存到config.json, homepage: " + string);
            if (string.length() == 0) {
                C0590I.i("主页分类不能为空，已恢复默认配置！");
            } else {
                C0590I.i("主页分类已设置: \n" + string);
            }
            dialogInterface.dismiss();
        } catch (Exception e) {
            C0590I.i("分类设置失败: " + e);
            Log.e("Config", "保存配置失败", e);
        }
    }
}
