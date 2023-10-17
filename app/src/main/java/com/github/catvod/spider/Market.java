package com.github.catvod.spider;

import android.app.Activity;
import android.app.ProgressDialog;
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

    private ProgressDialog dialog;
    private List<Item> items;
    private boolean busy;

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        items = Item.arrayFrom(extend);
    }

    @Override
    public String homeVideoContent() {
        List<Vod> list = new ArrayList<>();
        for (Item item : items) list.add(item.vod());
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Init.run(this::finish);
        Vod vod = new Vod();
        vod.setVodPlayFrom("FongMi");
        vod.setVodPlayUrl("FongMi$FongMi");
        Init.execute(() -> download(ids.get(0)));
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
            if (isBusy()) return;
            setBusy(true);
            Init.run(this::setDialog, 500);
            Response response = OkHttp.newCall(url);
            File file = FileUtil.getCacheFile(Uri.parse(url).getLastPathSegment());
            download(file, response.body().byteStream(), Double.parseDouble(response.header("Content-Length", "1")));
            FileUtil.openFile(FileUtil.chmod(file));
            dismiss();
        } catch (Exception e) {
            Utils.notify(e.getMessage());
            dismiss();
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
                setProgress((int) (totalBytes / length * 100.0));
            }
        }
    }

    private void setDialog() {
        Init.run(() -> {
            try {
                dialog = new ProgressDialog(Init.getActivity());
                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                dialog.setCancelable(false);
                dialog.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void dismiss() {
        Init.run(() -> {
            try {
                setBusy(false);
                if (dialog != null) dialog.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void setProgress(int value) {
        Init.run(() -> {
            try {
                if (dialog != null) dialog.setProgress(value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
