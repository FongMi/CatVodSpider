package com.github.catvod.bean.quark;

import com.google.gson.Gson;

/**
 * Quark/UC share page pagination metadata.
 * Replaces obfuscated class: com.github.catvod.spider.merge.S.pkg.c
 *
 * API client usage (QuarkDriveApi / UcDriveApi):
 *   if (((getPage() - 1) * getPageSize()) + getCount() < getTotal()) { ... }
 */
public class QuarkMetadata {
    private int count;
    private int page;
    private int size;
    private int total;

    public static QuarkMetadata fromJson(String json) {
        return new Gson().fromJson(json, QuarkMetadata.class);
    }

    /** Returns the number of items on the current page. */
    public int getCount() { return count; }

    /** Returns the current page number (1-based). */
    public int getPage() { return page; }

    /** Returns the page size (items per page). */
    public int getPageSize() { return size; }

    /** Returns the total number of items across all pages. */
    public int getTotal() { return total; }
}
