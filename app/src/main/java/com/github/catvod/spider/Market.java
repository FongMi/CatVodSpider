package com.github.catvod.spider;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;

import com.github.catvod.Init;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.market.Data;
import com.github.catvod.bean.market.Item;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.Net;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Path;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Market extends Spider {

    private Net download;
    private List<Data> datas;

    @Override
    public void init(Context context, String extend) {
        if (extend.startsWith("http")) extend = net.get(extend);
        datas = Data.arrayFrom(extend);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        if (datas.size() > 1) for (int i = 1; i < datas.size(); i++) classes.add(datas.get(i).type());
        return Result.string(classes, datas.get(0).getVod());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        for (Data data : datas) if (data.getName().equals(tid)) return Result.get().page().vod(data.getVod()).string();
        return "";
    }

    @Override
    public String action(String action) {
        try (Net flow = download()) {
            String name = Uri.parse(action).getLastPathSegment();
            Init.toast("正在下載..." + name);
            File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            File file = Path.create(new File(folder, name));
            flow.download(action, "{\"timeout\":15000}", file);
            if (file.getName().endsWith(".zip")) FileUtil.unzip(file, folder);
            if (file.getName().endsWith(".apk")) FileUtil.openFile(file);
            checkCopy(action);
            return Result.notify("下載完成");
        } catch (Exception e) {
            return Result.notify(e.getMessage());
        }
    }

    private synchronized Net download() {
        if (download != null) download.close();
        return download = net.session();
    }

    private void checkCopy(String url) {
        for (Data data : datas) {
            int index = data.getList().indexOf(new Item(url));
            if (index == -1) continue;
            String text = data.getList().get(index).getCopy();
            if (!text.isEmpty()) {
                ClipboardManager manager = (ClipboardManager) Init.context().getSystemService(Context.CLIPBOARD_SERVICE);
                manager.setPrimaryClip(ClipData.newPlainText("fongmi", text));
                Init.toast("已複製 " + text);
            }
            break;
        }
    }
}
