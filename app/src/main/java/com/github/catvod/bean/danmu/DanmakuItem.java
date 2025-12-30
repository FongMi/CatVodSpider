package com.github.catvod.bean.danmu;

import java.util.StringJoiner;

public class DanmakuItem {
    public String title;
    public String epTitle;
    public String shortTitle;
    public Integer epId;
    public String apiBase;

    public String from;

    public String animeTitle;

    public String getDanmakuUrl() {
        return apiBase + "/api/v2/comment/" + epId + "?format=xml";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEpTitle() {
        return epTitle;
    }

    public void setEpTitle(String epTitle) {
        this.epTitle = epTitle;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public Integer getEpId() {
        return epId;
    }

    public void setEpId(Integer epId) {
        this.epId = epId;
    }

    public String getApiBase() {
        return apiBase;
    }

    public void setApiBase(String apiBase) {
        this.apiBase = apiBase;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    public String getTitleWithEp() {
        if (title == null) {
            return epTitle;
        }
        String[] parts = title.split("from");
        String prefix = parts.length > 0 ? parts[0].trim() : title.trim();
        return prefix + " - " + epTitle;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DanmakuItem.class.getSimpleName() + "[", "]")
                .add("title='" + title + "'")
                .add("epTitle='" + epTitle + "'")
                .add("shortTitle='" + shortTitle + "'")
                .add("epId=" + epId)
                .add("apiBase='" + apiBase + "'")
                .add("from='" + from + "'")
                .add("animeTitle='" + animeTitle + "'")
                .toString();
    }
}
