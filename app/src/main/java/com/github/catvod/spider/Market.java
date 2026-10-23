package com.github.catvod.spider;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.format.Formatter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.github.catvod.Runtime;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.market.Data;
import com.github.catvod.bean.market.Item;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.Download;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Path;
import com.github.catvod.utils.Response;
import com.github.catvod.utils.Task;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Future;
import java.util.zip.ZipFile;

public class Market extends Spider {

    private final Handler main = new Handler(Looper.getMainLooper());
    private volatile boolean destroyed;
    private DownloadDialog dialog;
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
        return Response.create().classes(classes).vods(datas.get(0).getVod()).string();
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        for (Data data : datas) if (data.getName().equals(tid)) return Response.create().page().vods(data.getVod()).string();
        return "";
    }

    @Override
    public String action(String action) {
        main.post(() -> showDownload(action));
        return "{}";
    }

    private void showDownload(String url) {
        if (destroyed) return;
        if (dialog != null) {
            Runtime.toast("請先完成或取消目前下載");
            return;
        }
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            Runtime.toast("目前無可用畫面");
            return;
        }
        try {
            dialog = new DownloadDialog(activity, url);
            dialog.show();
        } catch (Exception e) {
            if (dialog != null) dialog.close();
            Runtime.toast(e.getMessage());
        }
    }

    @Override
    public void destroy() {
        destroyed = true;
        main.post(() -> {
            if (dialog != null) dialog.close();
        });
    }

    private void checkCopy(String url) {
        for (Data data : datas) {
            int index = data.getList().indexOf(Item.create().url(url));
            if (index == -1) continue;
            String text = data.getList().get(index).getCopy();
            if (!text.isEmpty()) {
                ClipboardManager manager = (ClipboardManager) Runtime.context().getSystemService(Context.CLIPBOARD_SERVICE);
                manager.setPrimaryClip(ClipData.newPlainText("fongmi", text));
                Runtime.toast("已複製 " + text);
            }
            break;
        }
    }

    private final class DownloadDialog implements Download.Callback, View.OnAttachStateChangeListener {

        private final String url;
        private final File folder;
        private final File target;
        private final File temporary;
        private final Download download;
        private final AlertDialog window;
        private final View anchor;
        private final TextView status;
        private final TextView details;
        private final ProgressBar progress;
        private Future<?> verification;
        private String transferred = "等待伺服器回應";
        private boolean paused;
        private boolean finishing;
        private volatile boolean closed;

        private DownloadDialog(Activity activity, String url) throws IOException {
            this.url = url;
            String name = getFileName(url);
            folder = prepareFolder();
            target = new File(folder, name);
            String ext = name.toLowerCase(Locale.ROOT).endsWith(".apk") ? ".apk" : ".tmp";
            temporary = File.createTempFile(".market-", ext, folder);
            download = Download.create(url, temporary);
            anchor = activity.getWindow().getDecorView();
            status = new TextView(activity);
            progress = new ProgressBar(activity, null, android.R.attr.progressBarStyleHorizontal);
            details = new TextView(activity);
            window = new AlertDialog.Builder(activity).setTitle(name).setView(createContent(activity)).setPositiveButton("暫停", null).setNegativeButton("取消", null).create();
        }

        private String getFileName(String url) throws IOException {
            Uri uri = Uri.parse(url);
            String name = uri.getLastPathSegment();
            if (!("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) || uri.getHost() == null || name == null || name.isEmpty()) throw new IOException("下載網址無效");
            if (name.contains("/") || name.contains("\\") || name.equals(".") || name.equals("..")) throw new IOException("下載檔名無效");
            return name;
        }

        private File prepareFolder() throws IOException {
            File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (!folder.isDirectory() && !folder.mkdirs()) throw new IOException("無法建立下載目錄");
            return folder;
        }

        private View createContent(Activity activity) {
            LinearLayout content = new LinearLayout(activity);
            content.setOrientation(LinearLayout.VERTICAL);
            int padding = Math.round(24 * activity.getResources().getDisplayMetrics().density);
            content.setPadding(padding, padding / 3, padding, 0);
            status.setText("正在連線…");
            status.setTextSize(14);
            status.setPadding(0, padding / 2, 0, padding / 2);
            content.addView(status);
            progress.setMax(100);
            progress.setIndeterminate(true);
            content.addView(progress, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            details.setText("等待伺服器回應");
            details.setTextSize(14);
            details.setPadding(0, padding / 3, 0, padding / 3);
            content.addView(details);
            return content;
        }

        private void show() {
            window.setCanceledOnTouchOutside(false);
            window.setOnDismissListener(ignored -> close());
            window.show();
            window.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(ignored -> togglePause());
            window.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(ignored -> close());
            anchor.addOnAttachStateChangeListener(this);
            download.start(this);
        }

        private void togglePause() {
            if (closed || finishing) return;
            if (paused) resume();
            else pause();
        }

        private void resume() {
            paused = false;
            status.setText("正在繼續下載…");
            window.getButton(AlertDialog.BUTTON_POSITIVE).setText("暫停");
            download.start(this);
        }

        private void pause() {
            status.setText("正在暫停…");
            window.getButton(AlertDialog.BUTTON_POSITIVE).setEnabled(false);
            download.pause();
        }

        @Override
        public void progress(long total, long downloaded, long speed) {
            if (closed || finishing) return;
            boolean known = total > 0;
            int percent = known ? (int) Math.min(100, downloaded * 100.0 / total) : 0;
            progress.setIndeterminate(!known);
            if (known) progress.setProgress(percent);
            status.setText(known ? "下載中 · " + percent + "%" : "下載中");
            transferred = size(downloaded) + (known ? " / " + size(total) : "");
            details.setText(transferred + " · " + size(speed) + "/s");
        }

        private String size(long bytes) {
            return Formatter.formatShortFileSize(Runtime.context(), Math.max(0, bytes));
        }

        @Override
        public void paused() {
            if (closed) return;
            paused = true;
            progress.setIndeterminate(false);
            status.setText("已暫停");
            details.setText(transferred);
            window.getButton(AlertDialog.BUTTON_POSITIVE).setText("繼續");
            window.getButton(AlertDialog.BUTTON_POSITIVE).setEnabled(true);
        }

        @Override
        public void success(File file) {
            if (closed) return;
            finishing = true;
            status.setText("正在驗證檔案…");
            progress.setIndeterminate(true);
            window.getButton(AlertDialog.BUTTON_POSITIVE).setEnabled(false);
            verification = Task.submit(() -> finishDownload(file));
        }

        private void finishDownload(File file) {
            try {
                validate(file);
                if (Thread.currentThread().isInterrupted()) throw new InterruptedIOException("下載已取消");
                Path.move(file, target);
                if (target.getName().toLowerCase(Locale.ROOT).endsWith(".zip")) FileUtil.unzip(target, folder);
                main.post(() -> complete(target));
            } catch (Exception e) {
                main.post(() -> error(e.getMessage()));
            }
        }

        private void validate(File file) throws IOException {
            if (file.length() == 0) throw new IOException("下載檔案為空");
            String name = target.getName().toLowerCase(Locale.ROOT);
            if (name.endsWith(".zip")) validateZip(file);
            if (name.endsWith(".apk") && Runtime.context().getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 0) == null) throw new IOException("下載內容不是有效的 APK");
        }

        private void validateZip(File file) throws IOException {
            try (ZipFile zip = new ZipFile(file)) {
                zip.size();
            } catch (IOException e) {
                throw new IOException("下載內容不是有效的 ZIP", e);
            }
        }

        private void complete(File file) {
            if (closed) return;
            close();
            try {
                Runtime.toast("下載完成");
                if (file.getName().toLowerCase(Locale.ROOT).endsWith(".apk")) FileUtil.openFile(file);
                checkCopy(url);
            } catch (Exception e) {
                Runtime.toast(e.getMessage());
            }
        }

        @Override
        public void error(String msg) {
            if (closed) return;
            finishing = true;
            status.setText("下載失敗");
            details.setText(msg == null || msg.isEmpty() ? "無法完成下載" : msg);
            progress.setIndeterminate(false);
            window.getButton(AlertDialog.BUTTON_POSITIVE).setVisibility(View.GONE);
            window.getButton(AlertDialog.BUTTON_NEGATIVE).setText("關閉");
            temporary.delete();
        }

        private void close() {
            if (closed) return;
            closed = true;
            download.cancel();
            if (verification != null) verification.cancel(true);
            anchor.removeOnAttachStateChangeListener(this);
            window.dismiss();
            temporary.delete();
            if (dialog == this) dialog = null;
        }

        @Override
        public void onViewAttachedToWindow(@NonNull View view) {
        }

        @Override
        public void onViewDetachedFromWindow(@NonNull View view) {
            close();
        }
    }
}
