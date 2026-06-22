package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.I.t0;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public enum n implements m {
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH_PROTOCOL(101, "Switching Protocols"),
    OK(200, "OK"),
    /* JADX INFO: Fake field, exist only in values array */
    CREATED(201, "Created"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPTED(202, "Accepted"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_CONTENT(204, "No Content"),
    PARTIAL_CONTENT(206, "Partial Content"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_STATUS(207, "Multi-Status"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT(301, "Moved Permanently"),
    /* JADX INFO: Fake field, exist only in values array */
    FOUND(302, "Found"),
    /* JADX INFO: Fake field, exist only in values array */
    REDIRECT_SEE_OTHER(303, "See Other"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_MODIFIED(304, "Not Modified"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(307, "Temporary Redirect"),
    BAD_REQUEST(400, "Bad Request"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(401, "Unauthorized"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(405, "Method Not Allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(406, "Not Acceptable"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(408, "Request Timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(409, "Conflict"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(410, "Gone"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(411, "Length Required"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(412, "Precondition Failed"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(413, "Payload Too Large"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(415, "Unsupported Media Type"),
    RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPECTATION_FAILED(417, "Expectation Failed"),
    /* JADX INFO: Fake field, exist only in values array */
    TOO_MANY_REQUESTS(429, "Too Many Requests"),
    INTERNAL_ERROR(500, "Internal Server Error"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_IMPLEMENTED(501, "Not Implemented"),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(503, "Service Unavailable"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

    private final int b;
    private final String c;

    n(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static n b(int i) {
        for (n nVar : values()) {
            if (nVar.b == i) {
                return nVar;
            }
        }
        return null;
    }

    public final String a() {
        StringBuilder sbB = t0.b("");
        sbB.append(this.b);
        sbB.append(" ");
        sbB.append(this.c);
        return sbB.toString();
    }
}
