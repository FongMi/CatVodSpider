package com.github.catvod.bean.yiso;

import com.github.catvod.bean.Vod;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Item {

    @SerializedName("data")
    private DataDTO data;

    public static Item objectFrom(String str) {
        try {
            return new Gson().fromJson(str, Item.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new Item();
        }
    }

    public DataDTO getData() {
        return data == null ? new DataDTO() : data;
    }

    public static class DataDTO {

        @SerializedName("list")
        private List<ListDTO> list;

        public List<Vod> getList(String key) {
            List<Vod> items = new ArrayList<>();
            list = list == null ? Collections.emptyList() : list;
            for (ListDTO item : list) if (item.getName().contains(key)) items.add(item.getVod());
            return items;
        }

        public static class ListDTO {

            @SerializedName("url")
            private String url;
            @SerializedName("gmtCreate")
            private String gmtCreate;
            @SerializedName("fileInfos")
            private List<FileInfoDTO> fileInfos;

            public String getUrl() {
                return url;
            }

            public String getGmtCreate() {
                return gmtCreate;
            }

            public List<FileInfoDTO> getFileInfos() {
                return fileInfos;
            }

            public String getName() {
                return getFileInfos().get(0).getFileName();
            }

            public Vod getVod() {
                String id = getUrl();
                String name = getName();
                String remark = getGmtCreate();
                String pic = "https://inews.gtimg.com/newsapp_bt/0/13263837859/1000";
                return new Vod(id, name, pic, remark);
            }

            public static class FileInfoDTO {

                @SerializedName("fileName")
                private String fileName;

                public String getFileName() {
                    return fileName;
                }
            }
        }
    }
}
