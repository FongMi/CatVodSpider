package com.github.catvod.spider;

import java.util.HashSet;
import java.util.Set;

/**
 * 弹幕配置实体类
 */
public class DanmakuConfig {
    public Set<String> apiUrls;
    public float lpWidth;
    public float lpHeight;
    public float lpAlpha;
    public boolean autoPushEnabled;

    public DanmakuConfig() {
        // 设置默认值
        apiUrls = new HashSet<>();
        lpWidth = 0.9f;
        lpHeight = 0.85f;
        lpAlpha = 0.8f;
        autoPushEnabled = false;
    }

    public Set<String> getApiUrls() {
        return apiUrls;
    }

    public void setApiUrls(Set<String> apiUrls) {
        this.apiUrls = apiUrls;
    }

    public float getLpWidth() {
        return lpWidth;
    }

    public void setLpWidth(float lpWidth) {
        this.lpWidth = lpWidth;
    }

    public float getLpHeight() {
        return lpHeight;
    }

    public void setLpHeight(float lpHeight) {
        this.lpHeight = lpHeight;
    }

    public float getLpAlpha() {
        return lpAlpha;
    }

    public void setLpAlpha(float lpAlpha) {
        this.lpAlpha = lpAlpha;
    }

    public boolean isAutoPushEnabled() {
        return autoPushEnabled;
    }

    public void setAutoPushEnabled(boolean autoPushEnabled) {
        this.autoPushEnabled = autoPushEnabled;
    }
}
