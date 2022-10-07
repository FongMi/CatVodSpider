package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;

import java.util.HashMap;
import java.util.List;

public class Doll extends Spider {

    private final String url = "https://hongkongdollvideo.com/";

    @Override
    public String homeContent(boolean filter) throws Exception {
        return super.homeContent(filter);
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        return super.categoryContent(tid, pg, filter, extend);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        return super.detailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return super.searchContent(key, quick);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        return super.playerContent(flag, id, vipFlags);
    }
}
