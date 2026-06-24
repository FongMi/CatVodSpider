package com.github.catvod.utils.server;

/**
 * Stub for deleted obfuscated HTTP response type used by Server.
 */
public class o {
    public int statusCode;
    public String mimeType;
    public java.io.InputStream data;
    public java.util.Map<String, String> headers;

    public o() {
    }

    public o(int statusCode, String mimeType, java.io.InputStream data) {
        this.statusCode = statusCode;
        this.mimeType = mimeType;
        this.data = data;
    }
}
