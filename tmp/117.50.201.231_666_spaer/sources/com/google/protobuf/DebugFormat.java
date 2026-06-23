package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.TextFormat;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class DebugFormat {
    private final boolean isSingleLine;

    class LazyDebugOutput {
        private final UnknownFieldSet fields;
        private final DebugFormat format;
        private final MessageOrBuilder message;

        public LazyDebugOutput(MessageOrBuilder messageOrBuilder, DebugFormat debugFormat) {
            this.message = messageOrBuilder;
            this.fields = null;
            this.format = debugFormat;
        }

        public LazyDebugOutput(UnknownFieldSet unknownFieldSet, DebugFormat debugFormat) {
            this.message = null;
            this.fields = unknownFieldSet;
            this.format = debugFormat;
        }

        public String toString() {
            MessageOrBuilder messageOrBuilder = this.message;
            return messageOrBuilder != null ? this.format.toString(messageOrBuilder) : this.format.toString(this.fields);
        }
    }

    private DebugFormat(boolean z) {
        this.isSingleLine = z;
    }

    public static DebugFormat multiline() {
        return new DebugFormat(false);
    }

    public static DebugFormat singleLine() {
        return new DebugFormat(true);
    }

    public Object lazyToString(MessageOrBuilder messageOrBuilder) {
        return new LazyDebugOutput(messageOrBuilder, this);
    }

    public Object lazyToString(UnknownFieldSet unknownFieldSet) {
        return new LazyDebugOutput(unknownFieldSet, this);
    }

    public String toString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return !this.isSingleLine ? TextFormat.debugFormatPrinter().printFieldToString(fieldDescriptor, obj) : TextFormat.debugFormatPrinter().emittingSingleLine(this.isSingleLine).printFieldToString(fieldDescriptor, obj);
    }

    public String toString(MessageOrBuilder messageOrBuilder) {
        return !this.isSingleLine ? TextFormat.debugFormatPrinter().printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.DEBUG_MULTILINE) : TextFormat.debugFormatPrinter().emittingSingleLine(this.isSingleLine).printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.DEBUG_SINGLE_LINE);
    }

    public String toString(UnknownFieldSet unknownFieldSet) {
        return !this.isSingleLine ? TextFormat.debugFormatPrinter().printToString(unknownFieldSet) : TextFormat.debugFormatPrinter().emittingSingleLine(this.isSingleLine).printToString(unknownFieldSet);
    }
}
