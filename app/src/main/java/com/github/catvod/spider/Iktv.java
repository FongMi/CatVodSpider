package com.github.catvod.spider;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Filter;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.FileUtil;
import com.github.catvod.utils.Notify;
import com.github.catvod.utils.Path;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import okhttp3.Response;

/**
 * @author leospring
 * K歌
 */
public class Iktv extends Spider {

    private SQLiteOpenHelper dataBaseHelper;

    private SQLiteDatabase db;

    private String host = "http://em.21dtv.com/songs/";

    private final String DB_URL = "https://raw.kkgithub.com/leosprings/soft/main/song.db.zip";

    private final File DB_FILE = new File(Path.tv(), "song.db");
    @Override
    public void init(Context context, String extend) throws Exception {
        try {
            if (!TextUtils.isEmpty(extend)) host = extend;
            //首次下载sqlite文件至tv目录
            if (!DB_FILE.exists()) {
                Notify.show("等待下载DB文件。。。");
                Init.checkPermission();
                downloadSongDB();
                initDbCon(context);

            } else {
                initDbCon(context);
            }
        } catch (Exception e) {
            Notify.show(e.getMessage());
        }

    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classList = new ArrayList<>();
        LinkedHashMap<String, List<Filter>> filters = new LinkedHashMap<>();

        classList.add(new Class("1", "歌手"));
        classList.add(new Class("2", "曲库"));

        List<Filter> singerFilterList = new ArrayList<>();
        List<Filter.Value> areaVals = new ArrayList<>();
        areaVals.add(new Filter.Value("大陆", "1"));
        areaVals.add(new Filter.Value("港台", "2"));
        areaVals.add(new Filter.Value("国外", "3"));

        List<Filter.Value> formVals = new ArrayList<>();
        formVals.add(new Filter.Value("男", "1"));
        formVals.add(new Filter.Value("女", "2"));
        formVals.add(new Filter.Value("组合", "3"));
        singerFilterList.add(new Filter("region", "地区", areaVals));
        singerFilterList.add(new Filter("form", "类别", formVals));

        List<Filter> songPoolFilterList = new ArrayList<>();
        List<Filter.Value> lanVals = new ArrayList<>();
        lanVals.add(new Filter.Value("国语", "2"));
        lanVals.add(new Filter.Value("藏语", "1"));
        lanVals.add(new Filter.Value("韩语", "3"));
        lanVals.add(new Filter.Value("日语", "4"));
        lanVals.add(new Filter.Value("闽南语", "5"));
        lanVals.add(new Filter.Value("英语", "6"));
        lanVals.add(new Filter.Value("粤语", "7"));
        lanVals.add(new Filter.Value("其他", "8"));
        lanVals.add(new Filter.Value("马来语", "9"));
        lanVals.add(new Filter.Value("泰语", "10"));
        lanVals.add(new Filter.Value("印尼语", "11"));
        lanVals.add(new Filter.Value("越南语", "12"));

        List<Filter.Value> typeVals = new ArrayList<>();
        typeVals.add(new Filter.Value("流行", "1"));
        typeVals.add(new Filter.Value("合唱", "2"));
        typeVals.add(new Filter.Value("怀旧", "3"));
        typeVals.add(new Filter.Value("儿歌", "4"));
        typeVals.add(new Filter.Value("革命", "5"));
        typeVals.add(new Filter.Value("民歌", "6"));
        typeVals.add(new Filter.Value("舞曲", "7"));
        typeVals.add(new Filter.Value("喜庆", "8"));
        typeVals.add(new Filter.Value("迪高", "9"));
        typeVals.add(new Filter.Value("无损DISCO", "10"));
        typeVals.add(new Filter.Value("影视", "11"));

        songPoolFilterList.add(new Filter("lan", "语言", lanVals));
        songPoolFilterList.add(new Filter("type", "类型", typeVals));

        filters.put("1", singerFilterList);
        filters.put("2", songPoolFilterList);
        return Result.string(classList, filters);
    }

    private List<Vod> getList(String tid, Integer page, HashMap<String, String> extend) {
        List<Vod> list = new ArrayList<>();
        if (tid.equals("1")) {
            String selection = "1 = 1 ";
            List<String> selectionArgsList = new ArrayList<>();
            String[] selectionArgs = null;
            if (extend.get("region") != null) {
                selection += "and region_id = ?";
                selectionArgsList.add(extend.get("region"));
            }
            if (extend.get("form") != null) {
                selection += " and form_id = ? ";
                selectionArgsList.add(extend.get("form"));
            }
            if (!selectionArgsList.isEmpty()) {
                selectionArgs = new String[selectionArgsList.size()];
                selectionArgsList.toArray(selectionArgs);
            }
            // 查询数据
            String[] projection = { "id", "name" };
            String limit = 20 * (page - 1) + ",20";
            Cursor cursor = db.query("singer", projection, selection, selectionArgs, null, null, "id", limit);

            // 遍历查询结果
            while (cursor.moveToNext()) {
                int id = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                // 处理查询到的数据
                list.add(new Vod(name, name, host + id + ".jpg", ""));
            }
            // 关闭数据库连接
            cursor.close();
        } else {
            String selection = "language_id = ? ";
            List<String> selectionArgsList = new ArrayList<>();

            String[] selectionArgs = null;
            if (extend.get("lan") != null) {
                selectionArgsList.add(extend.get("lan"));
            } else {
                selectionArgsList.add("2");
            }
            if (extend.get("type") != null) {
                selection += "and type_id = ?";
                selectionArgsList.add(extend.get("type"));
            }
            selectionArgs = new String[selectionArgsList.size()];
            selectionArgsList.toArray(selectionArgs);

            // 查询数据
            String[] projection = { "number", "name" };
            String limit = 20 * (page - 1) + ",20";
            Cursor cursor = db.query("song", projection, selection, selectionArgs, null, null, "number", limit);

            // 遍历查询结果
            while (cursor.moveToNext()) {
                String id = cursor.getString(cursor.getColumnIndexOrThrow("number"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));
                // 处理查询到的数据
                list.add(new Vod(host + id + ".mkv", name, null, null));
            }
            // 关闭数据库连接
            cursor.close();
        }
        return list;
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (tid.endsWith("_onclick")) return searchContent(tid.split("_")[0], false);
        int page = Integer.parseInt(pg);
        List<Vod> list = getList(tid, page, extend);
        return  Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        Vod vod = new Vod();
        vod.setVodId(ids.get(0));
        vod.setVodName(ids.get(0));
        vod.setVodPlayFrom("Leospring");
        if (ids.get(0).endsWith(".mkv")) {
            vod.setVodPlayUrl("播放$" + ids.get(0));
        } else {
            vod.setVodActor(getLink(ids.get(0)));
            String[] projection = { "number", "name" };
            String limit = "0,999";
            String selection = "singer_names = ?";
            String[] selectionArgs = { ids.get(0) };
            Cursor cursor = db.query("song", projection, selection, selectionArgs, null, null, "number", limit);
            List<String> list = new ArrayList<>();
            // 遍历查询结果
            while (cursor.moveToNext()) {
                String id = cursor.getString(cursor.getColumnIndexOrThrow("number"));
                String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));

                list.add(name + "$" + host + id + ".mkv");
            }
            cursor.close();
            vod.setVodPlayUrl(TextUtils.join("#", list));
        }
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return Result.get().url(id).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        // 查询数据
        String[] projection = { "number", "name" };
        String limit = "0,999";
        String selection = "name LIKE ? OR singer_names LIKE ?";
        String[] selectionArgs = { "%"+key+"%", "%"+key+"%"};
        Cursor cursor = db.query("song", projection, selection, selectionArgs, null, null, null, limit);
        List<Vod> list = new ArrayList<>();
        // 遍历查询结果
        while (cursor.moveToNext()) {
            String id = cursor.getString(cursor.getColumnIndexOrThrow("number"));
            String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));

            list.add(new Vod(host + id + ".mkv", name,null,null));
        }
        cursor.close();
        return Result.string(list);
    }

    private void initDbCon(Context context) {
        dataBaseHelper = new SQLiteOpenHelper(context, DB_FILE.getAbsolutePath(), null, 1) {
            @Override
            public void onCreate(SQLiteDatabase db) {

            }

            @Override
            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            }
        };
        db = dataBaseHelper.getReadableDatabase();
    }

    private void downloadSongDB() throws Exception {
        Response response = OkHttp.newCall(DB_URL);
        File file = Path.create(new File(Path.download(), "song.zip"));
        download(file, response.body().byteStream());
        FileUtil.unzip(file, Path.tv());
        if (file.exists() && file.isFile()) file.delete();
        Notify.show("DB文件下载完成");
    }

    private static void download(File file, InputStream is) throws Exception {
        FileOutputStream os = new FileOutputStream(file);
        try (BufferedInputStream input = new BufferedInputStream(is)) {
            byte[] buffer = new byte[4096];
            int readBytes;
            while ((readBytes = input.read(buffer)) != -1) {
                os.write(buffer, 0, readBytes);
            }
        }
    }
    private String getLink(String title) {
        return String.format("[a=cr:{\"id\":\"%s\",\"name\":\"%s\"}/]%s[/a]", title + "_onclick", title, title);
    }

    @Override
    public void destroy() {
        db.close();
        dataBaseHelper.close();
    }
}
