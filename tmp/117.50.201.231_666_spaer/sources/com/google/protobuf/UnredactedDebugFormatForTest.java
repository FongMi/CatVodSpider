package com.google.protobuf;

import com.google.protobuf.TextFormat;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class UnredactedDebugFormatForTest {
    private UnredactedDebugFormatForTest() {
    }

    public static String unredactedMultilineString(MessageOrBuilder messageOrBuilder) {
        return TextFormat.printer().printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.TEXT_GENERATOR);
    }

    public static String unredactedMultilineString(UnknownFieldSet unknownFieldSet) {
        return TextFormat.printer().printToString(unknownFieldSet);
    }

    public static String unredactedSingleLineString(MessageOrBuilder messageOrBuilder) {
        return TextFormat.printer().emittingSingleLine(true).printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.TEXT_GENERATOR);
    }

    public static String unredactedSingleLineString(UnknownFieldSet unknownFieldSet) {
        return TextFormat.printer().emittingSingleLine(true).printToString(unknownFieldSet);
    }

    public static String unredactedStringValueOf(Object obj) {
        return LegacyUnredactedTextFormat.legacyUnredactedStringValueOf(obj);
    }

    public static String unredactedToString(Object obj) {
        return LegacyUnredactedTextFormat.legacyUnredactedToString(obj);
    }
}
