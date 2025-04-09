package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.bean.samba.Drive;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Image;
import com.github.catvod.utils.Util;
import com.hierynomus.msfscc.FileAttributes;
import com.hierynomus.msfscc.fileinformation.FileIdBothDirectoryInformation;
import com.hierynomus.protocol.commons.EnumWithValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Samba extends Spider {

    private List<Drive> drives;
    private String extend;

    private void fetchRule() {
        if (drives != null && !drives.isEmpty()) return;
        if (extend.startsWith("http")) extend = OkHttp.string(extend);
        drives = Drive.arrayFrom(extend);
    }

    private Drive getDrive(String name) {
        return drives.get(drives.indexOf(new Drive(name)));
    }

    private boolean isFolder(FileIdBothDirectoryInformation item) {
        return EnumWithValue.EnumUtils.isSet(item.getFileAttributes(), FileAttributes.FILE_ATTRIBUTE_DIRECTORY);
    }

    private boolean isFile(FileIdBothDirectoryInformation item) {
        return !EnumWithValue.EnumUtils.isSet(item.getFileAttributes(), FileAttributes.FILE_ATTRIBUTE_DIRECTORY);
    }

    @Override
    public void init(Context context, String extend) {
        this.extend = extend;
        fetchRule();
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        for (Drive drive : drives) classes.add(drive.toType());
        return Result.string(classes);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> hashMap) {
        String key = tid.contains("/") ? tid.substring(0, tid.indexOf("/")) : tid;
        String path = tid.contains("/") ? tid.substring(tid.indexOf("/") + 1) : "";
        Drive drive = getDrive(key);
        List<Vod> list = new ArrayList<>();
        for (FileIdBothDirectoryInformation item : getList(drive, path)) {
            String vodId = getPath(key, path, item.getFileName());
            if (isFolder(item)) list.add(new Vod(vodId, item.getFileName(), Image.FOLDER, "", true));
            if (isFile(item)) list.add(new Vod(vodId, item.getFileName(), Image.VIDEO, "", false));
        }
        return Result.get().vod(list).page().string();
    }

    @Override
    public String detailContent(List<String> ids) {
        String tid = ids.get(0);
        String key = tid.contains("/") ? tid.substring(0, tid.indexOf("/")) : tid;
        String path = tid.contains("/") ? tid.substring(tid.indexOf("/") + 1) : "";
        String parent = path.contains("/") ? path.substring(0, path.lastIndexOf("/")) : "";
        String name = parent.contains("/") ? parent.substring(parent.lastIndexOf("/") + 1) : key;
        Drive drive = getDrive(key);
        List<String> playUrls = new ArrayList<>();
        for (FileIdBothDirectoryInformation item : getList(drive, parent)) {
            if (isFile(item)) {
                playUrls.add(item.getFileName() + "$" + getPath(drive.getServer(), parent, item.getFileName()));
            }
        }
        Vod vod = new Vod();
        vod.setVodId(name);
        vod.setVodName(name);
        vod.setVodPlayFrom(key);
        vod.setVodPlayUrl(TextUtils.join("#", playUrls));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(id).string();
    }

    private String getPath(String... texts) {
        List<String> items = new ArrayList<>();
        for (String text : texts) if (!TextUtils.isEmpty(text)) items.add(text);
        return TextUtils.join("/", items);
    }

    private List<FileIdBothDirectoryInformation> getList(Drive drive, String path) {
        List<FileIdBothDirectoryInformation> items = drive.getShare().list(getPath(drive.getSubPath(), path));
        Iterator<FileIdBothDirectoryInformation> iterator = items.iterator();
        while (iterator.hasNext()) {
            FileIdBothDirectoryInformation item = iterator.next();
            if (isFolder(item) && item.getFileName().startsWith(".")) iterator.remove();
            if (isFile(item) && !Util.isMedia(item.getFileName())) iterator.remove();
        }
        Collections.sort(items, (o1, o2) -> {
            if (isFolder(o1) && isFile(o2)) return -1;
            if (isFile(o1) && isFolder(o2)) return 1;
            return o1.getFileName().toLowerCase().compareTo(o2.getFileName().toLowerCase());
        });
        return items;
    }

    @Override
    public void destroy() {
        for (Drive drive : drives) drive.release();
    }
}
