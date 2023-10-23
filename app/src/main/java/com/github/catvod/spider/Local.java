package com.github.catvod.spider;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Sub;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Local extends Spider {

    private SimpleDateFormat format;

    @Override
    public void init(Context context, String extend) {
        format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault());
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        classes.add(new Class(Environment.getExternalStorageDirectory().getAbsolutePath(), "本地文件", "1"));
        File[] files = new File("/storage").listFiles();
        if (files == null) return Result.string(classes, new ArrayList<>());
        List<String> exclude = Arrays.asList("emulated", "sdcard", "self");
        for (File file : files) {
            if (exclude.contains(file.getName())) continue;
            classes.add(new Class(file.getAbsolutePath(), file.getName(), "1"));
        }
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        List<Vod> items = new ArrayList<>();
        List<Vod> media = new ArrayList<>();
        List<Vod> folders = new ArrayList<>();
        File[] files = new File(tid).listFiles();
        if (files == null) return Result.string(items);
        Arrays.sort(files, (a, b) -> a.getName().compareTo(b.getName()));
        for (File file : files) {
            if (file.getName().startsWith(".")) continue;
            if (file.isDirectory()) folders.add(create(file));
            else if (Utils.isMedia(file.getName())) media.add(create(file));
        }
        items.addAll(folders);
        items.addAll(media);
        return Result.get().vod(items).page().string();
    }

    @Override
    public String detailContent(List<String> ids) {
        String url = ids.get(0);
        if (url.startsWith("http")) {
            String name = Uri.parse(url).getLastPathSegment();
            return Result.string(create(name, url));
        } else {
            File file = new File(ids.get(0));
            return Result.string(create(file.getName(), file.getAbsolutePath()));
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        if (id.startsWith("http")) {
            return Result.get().url(id).string();
        } else {
            return Result.get().url("file://" + id).subs(getSubs(id)).string();
        }
    }

    private Vod create(String name, String url) {
        Vod vod = new Vod();
        vod.setTypeName("FongMi");
        vod.setVodId(url);
        vod.setVodName(name);
        vod.setVodPic(Image.VIDEO);
        vod.setVodPlayFrom("播放");
        vod.setVodPlayUrl(name + "$" + url);
        return vod;
    }

    private Vod create(File file) {
        Vod vod = new Vod();
        vod.setVodId(file.getAbsolutePath());
        vod.setVodName(file.getName());
        vod.setVodPic(Image.getIcon(file.isDirectory()));
        vod.setVodRemarks(format.format(file.lastModified()));
        vod.setVodTag(file.isDirectory() ? "folder" : "file");
        return vod;
    }

    private List<Sub> getSubs(String path) {
        File file = new File(path);
        if (file.getParentFile() == null) return Collections.emptyList();
        List<Sub> subs = new ArrayList<>();
        for (File f : file.getParentFile().listFiles()) {
            String ext = Utils.getExt(f.getName());
            if (Utils.isSub(ext)) subs.add(Sub.create().name(Utils.removeExt(f.getName())).ext(ext).url("file://" + f.getAbsolutePath()));
        }
        return subs;
    }
}