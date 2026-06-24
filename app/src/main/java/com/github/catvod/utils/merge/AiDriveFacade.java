package com.github.catvod.utils.merge;

/**
 * Stub for deleted AiDriveFacade class.
 * Originally provided access to AliDriveApi singleton.
 * Returns safe defaults so dependent code compiles.
 */
public final class AiDriveFacade {

    private static final AliDriveApi api = AliDriveApi.getInstance();

    private AiDriveFacade() {
    }

    public static AliDriveApi getApi() {
        return api;
    }
}
