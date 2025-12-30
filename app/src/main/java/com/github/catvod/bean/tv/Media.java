package com.github.catvod.bean.tv;

/**
 * 媒体信息 http://127.0.0.1:9978/media
 */
public class Media {
    /**
     * 播放地址
     */
    private String url;

    /**
     * 播放状态
     */
    private int state;

    /**
     * 播放速度
     */
    private float speed;

    /**
     * 播放标题
     */
    private String title;

    /**
     * 正在播放：{{文件名}}
     */
    private String artist;

    /**
     * 封面图片
     */
    private String artwork;

    /**
     * 播放时长
     */
    private long duration;

    /**
     * 播放进度
     */
    private long position;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtwork() {
        return artwork;
    }

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }
}
