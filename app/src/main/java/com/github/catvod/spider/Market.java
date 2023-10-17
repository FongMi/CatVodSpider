package com.github.catvod.spider;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.market.Item;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Response;

public class Market extends Spider {

    private List<Item> mItems;

    @Override
    public void init(Context context, String extend) throws Exception {
        mItems = Item.arrayFrom(extend);
    }

    @Override
    public String homeVideoContent() {
        List<Vod> list = new ArrayList<>();
        for (Item item : mItems) list.add(item.vod());
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Init.execute(() -> download(ids.get(0)));
        Vod vod = new Vod();
        vod.setVodPlayFrom("FongMi");
        vod.setVodPlayUrl("FongMi$FongMi");
        return Result.string(vod);
    }

    private void finish() {
        try {
            Activity activity = Init.getActivity();
            if (activity != null) activity.finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void download(String url) {
        try {
            Init.run(this::finish);
            Utils.notify("正在下載...");
            Response response = OkHttp.newCall(url);
            File file = FileUtil.getCacheFile(Uri.parse(url).getLastPathSegment());
            download(file, response.body().byteStream(), Double.parseDouble(response.header("Content-Length", "1")));
            FileUtil.openFile(FileUtil.chmod(file));
        } catch (Exception e) {
            Utils.notify(e.getMessage());
        }
    }

    private void download(File file, InputStream is, double length) throws Exception {
        FileOutputStream os = new FileOutputStream(file);
        try (BufferedInputStream input = new BufferedInputStream(is)) {
            byte[] buffer = new byte[4096];
            int readBytes;
            long totalBytes = 0;
            while ((readBytes = input.read(buffer)) != -1) {
                totalBytes += readBytes;
                os.write(buffer, 0, readBytes);
                int progress = (int) (totalBytes / length * 100.0);
                if (progress % 10 < 5) Utils.notify("正在下載..." + progress + "%");
            }
        }
    }
}
