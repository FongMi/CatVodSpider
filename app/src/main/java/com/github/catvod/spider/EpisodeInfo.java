package com.github.catvod.spider;

public class EpisodeInfo {
    /**
     * 集名
     */
    private String episodeName;

    /**
     * 集数
     */
    private String episodeNum;

    /**
     * 年份
     */
    private String episodeYear;

    /**
     * 季数
     */
    private String episodeSeasonNum;

    /**
     * 片名
     */
    private String seriesName;

    /**
     * 类型 1:电影 2:电视剧 3:综艺
     */
    private String type;

    private String fileName;

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getEpisodeNum() {
        return episodeNum;
    }

    public void setEpisodeNum(String episodeNum) {
        this.episodeNum = episodeNum;
    }

    public String getEpisodeYear() {
        return episodeYear;
    }

    public void setEpisodeYear(String episodeYear) {
        this.episodeYear = episodeYear;
    }

    public String getEpisodeSeasonNum() {
        return episodeSeasonNum;
    }

    public void setEpisodeSeasonNum(String episodeSeasonNum) {
        this.episodeSeasonNum = episodeSeasonNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
