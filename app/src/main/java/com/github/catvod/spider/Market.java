package com.github.catvod.spider;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.market.Data;
import com.github.catvod.bean.market.Item;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Path;
import com.github.catvod.utils.Util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Response;

public class Market extends Spider {

    private ProgressDialog dialog;
    private List<Data> datas;
    private boolean busy;

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        if (extend.startsWith("http")) extend = OkHttp.string(extend);
        datas = Data.arrayFrom(extend);
        Init.checkPermission();
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        if (datas.size() > 1) for (int i = 1; i < datas.size(); i++) classes.add(datas.get(i).type());
        return Result.string(classes, datas.get(0).getVod());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        for (Data data : datas) if (data.getName().equals(tid)) return Result.get().page().vod(data.getVod()).string();
        return super.categoryContent(tid, pg, filter, extend);
    }

    @Override
    public String action(String action) {
        try {
            if (isBusy()) return "";
            setBusy(true);
            Init.run(this::setDialog, 500);
            Response response = OkHttp.newCall(action);
            File file = Path.create(new File(Path.download(), Uri.parse(action).getLastPathSegment()));
            download(file, response.body().byteStream(), Double.parseDouble(response.header("Content-Length", "1")));
            if (file.getName().endsWith(".zip")) FileUtil.unzip(file, Path.download());
            if (file.getName().endsWith(".apk")) FileUtil.openFile(file);
            else Result.notify("下載完成");
            checkCopy(action);
            dismiss();
            return "";
        } catch (Exception e) {
            dismiss();
            return Result.notify(e.getMessage());
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

    private void checkCopy(String url) {
        for (Data data : datas) {
            int index = data.getList().indexOf(new Item(url));
            if (index == -1) continue;
            String text = data.getList().get(index).getCopy();
            if (!text.isEmpty()) Util.copy(text);
            break;
        }
    }

    private void setDialog() {
        Init.run(() -> {
            try {
                dialog = new ProgressDialog(Init.getActivity());
                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                dialog.setCancelable(false);
                if (isBusy()) dialog.show();
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
