package com.google.protobuf;

import java.util.logging.Logger;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    private static final int MAX_WARNING_COUNT = 20;
    public static final int MINOR = 31;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 31;
    public static final int OSS_PATCH = 0;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 0;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;
    static int majorWarningLoggedCount;
    static int minorWarningLoggedCount;

    public final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        majorWarningLoggedCount = 0;
        minorWarningLoggedCount = 0;
        VERSION_STRING = versionString(4, 31, 0, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        return str != null && str.equals("true");
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        validateProtobufGencodeVersionImpl(runtimeDomain, i, i2, i3, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        String strVersionString;
        if (checkDisabled()) {
            return;
        }
        if (i < 0 || i2 < 0 || i3 < 0) {
            throw new ProtobufRuntimeVersionException("Invalid gencode version: " + versionString(i, i2, i3, str));
        }
        RuntimeDomain runtimeDomain2 = DOMAIN;
        if (runtimeDomain != runtimeDomain2) {
            throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
        }
        if (i == 4) {
            strVersionString = null;
        } else {
            if (i != 3 || majorWarningLoggedCount >= 20) {
                throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime major versions when loading " + str2 + ": gencode " + versionString(i, i2, i3, str) + ", runtime " + VERSION_STRING + ". Same major version is required.");
            }
            strVersionString = versionString(i, i2, i3, str);
            logger.warning(" Protobuf gencode version " + strVersionString + " is exactly one major version older than the runtime version " + VERSION_STRING + " at " + str2 + ". Please update the gencode to avoid compatibility violations in the next runtime release.");
            majorWarningLoggedCount = majorWarningLoggedCount + 1;
        }
        if (31 < i2 || (i2 == 31 && i3 > 0)) {
            if (strVersionString == null) {
                strVersionString = versionString(i, i2, i3, str);
            }
            throw new ProtobufRuntimeVersionException("Detected incompatible Protobuf Gencode/Runtime versions when loading " + str2 + ": gencode " + strVersionString + ", runtime " + VERSION_STRING + ". Runtime version cannot be older than the linked gencode version.");
        }
        if (str.equals("")) {
            return;
        }
        if (strVersionString == null) {
            strVersionString = versionString(i, i2, i3, str);
        }
        throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading " + str2 + ": gencode " + strVersionString + ", runtime " + VERSION_STRING + ". Version suffixes must be the same.");
    }

    private static String versionString(int i, int i2, int i3, String str) {
        return String.format("%d.%d.%d%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
    }
}
