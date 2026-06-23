package com.google.protobuf;

import com.github.catvod.spider.merge.A.w;
import com.google.protobuf.ProtobufToStringOutput;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ProtobufToStringOutput {
    private static final ThreadLocal<OutputMode> outputMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public enum OutputMode {
        DEBUG_FORMAT,
        TEXT_FORMAT
    }

    static {
        final w wVar = new w();
        outputMode = new ThreadLocal() { // from class: com.github.catvod.spider.merge.A.x
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                wVar.getClass();
                return ProtobufToStringOutput.OutputMode.TEXT_FORMAT;
            }
        };
    }

    private ProtobufToStringOutput() {
    }

    public static void callWithDebugFormat(Runnable runnable) {
        callWithSpecificFormat(runnable, OutputMode.DEBUG_FORMAT);
    }

    private static void callWithSpecificFormat(Runnable runnable, OutputMode outputMode2) {
        OutputMode outputMode3 = setOutputMode(outputMode2);
        try {
            runnable.run();
        } finally {
            setOutputMode(outputMode3);
        }
    }

    public static void callWithTextFormat(Runnable runnable) {
        callWithSpecificFormat(runnable, OutputMode.TEXT_FORMAT);
    }

    private static OutputMode setOutputMode(OutputMode outputMode2) {
        ThreadLocal<OutputMode> threadLocal = outputMode;
        OutputMode outputMode3 = threadLocal.get();
        threadLocal.set(outputMode2);
        return outputMode3;
    }

    public static boolean shouldOutputDebugFormat() {
        return outputMode.get() == OutputMode.DEBUG_FORMAT;
    }
}
