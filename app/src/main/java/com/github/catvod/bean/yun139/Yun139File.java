package com.github.catvod.bean.yun139;

import com.github.catvod.utils.PanStringUtils;

/**
 * Yun139 file model (replaces com.github.catvod.spider.merge.Z.b)
 */
public class Yun139File {
    public String coID;      // content ID
    public String coName;    // content name
    public long coSize;      // content size
    public String p;         // some property (share-related)
    public String i;         // some property
    public String h;         // thumbnail

    public Yun139File() {}

    /** Get MIME type for this file */
    public String a() {
        return PanStringUtils.getMimeType(coName);
    }

    /** Get display name */
    public String b() {
        return coName;
    }

    /** Get subtitle extension if applicable */
    public String c() {
        String ext = PanStringUtils.getExtension(coName);
        return PanStringUtils.isSubtitleExtension(ext) ? ext : null;
    }

    public String getCoName() { return coName; }
    public long getCoSize() { return coSize; }
}
