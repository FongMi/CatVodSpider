package com.github.catvod.utils.merge;

/**
 * Stub for deleted AliDriveApi class.
 * Originally handled Aliyun Drive API interactions.
 * Returns safe defaults so dependent code compiles.
 */
public final class AliDriveApi {

    private static final AliDriveApi INSTANCE = new AliDriveApi();

    public String r = "";

    private AliDriveApi() {
    }

    public static AliDriveApi getInstance() {
        return INSTANCE;
    }

    /**
     * Stub: retrieve URL via drive proxy.
     */
    public String F(String url, String param) {
        return url;
    }
}
