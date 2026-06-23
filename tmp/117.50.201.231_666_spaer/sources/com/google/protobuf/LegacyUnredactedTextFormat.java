package com.google.protobuf;

import com.github.catvod.MainActivity;
import com.google.protobuf.LegacyUnredactedTextFormat;
import com.google.protobuf.TextFormat;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class LegacyUnredactedTextFormat {
    private LegacyUnredactedTextFormat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$legacyUnredactedToString$0(String[] strArr, Object obj) {
        strArr[0] = obj.toString();
    }

    public static String legacyUnredactedMultilineString(MessageOrBuilder messageOrBuilder) {
        return TextFormat.printer().printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.LEGACY_MULTILINE);
    }

    public static String legacyUnredactedMultilineString(UnknownFieldSet unknownFieldSet) {
        return TextFormat.printer().printToString(unknownFieldSet);
    }

    public static String legacyUnredactedSingleLineString(MessageOrBuilder messageOrBuilder) {
        return TextFormat.printer().emittingSingleLine(true).printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.LEGACY_SINGLE_LINE);
    }

    public static String legacyUnredactedSingleLineString(UnknownFieldSet unknownFieldSet) {
        return TextFormat.printer().emittingSingleLine(true).printToString(unknownFieldSet);
    }

    public static String legacyUnredactedStringValueOf(Object obj) {
        return obj == null ? String.valueOf(obj) : legacyUnredactedToString(obj);
    }

    public static String legacyUnredactedToString(final Object obj) {
        final String[] strArr = new String[1];
        final int i = 7;
        ProtobufToStringOutput.callWithTextFormat(new Runnable() { // from class: com.github.catvod.spider.merge.A.v
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    case 1:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    case 2:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    case 3:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    case 4:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    case 5:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    case 6:
                        ((MainActivity) strArr).a.h.setText((String) obj);
                        break;
                    default:
                        LegacyUnredactedTextFormat.lambda$legacyUnredactedToString$0((String[]) strArr, obj);
                        break;
                }
            }
        });
        return strArr[0];
    }
}
