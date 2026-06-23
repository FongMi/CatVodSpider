package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class TypeProto {
    private static Descriptors.FileDescriptor descriptor;
    static final Descriptors.Descriptor internal_static_google_protobuf_EnumValue_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_google_protobuf_EnumValue_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_protobuf_Enum_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_google_protobuf_Enum_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_protobuf_Field_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_google_protobuf_Field_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_protobuf_Option_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_google_protobuf_Option_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_google_protobuf_Type_descriptor;
    static final GeneratedMessage.FieldAccessorTable internal_static_google_protobuf_Type_fieldAccessorTable;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", TypeProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001agoogle/protobuf/type.proto\u0012\u000fgoogle.protobuf\u001a\u0019google/protobuf/any.proto\u001a$google/protobuf/source_context.proto\"§\u0002\n\u0004Type\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012.\n\u0006fields\u0018\u0002 \u0003(\u000b2\u0016.google.protobuf.FieldR\u0006fields\u0012\u0016\n\u0006oneofs\u0018\u0003 \u0003(\tR\u0006oneofs\u00121\n\u0007options\u0018\u0004 \u0003(\u000b2\u0017.google.protobuf.OptionR\u0007options\u0012E\n\u000esource_context\u0018\u0005 \u0001(\u000b2\u001e.google.protobuf.SourceContextR\rsourceContext\u0012/\n\u0006syntax\u0018\u0006 \u0001(\u000e2\u0017.google.protobuf.SyntaxR\u0006syntax\u0012\u0018\n\u0007edition\u0018\u0007 \u0001(\tR\u0007edition\"´\u0006\n\u0005Field\u0012/\n\u0004kind\u0018\u0001 \u0001(\u000e2\u001b.google.protobuf.Field.KindR\u0004kind\u0012D\n\u000bcardinality\u0018\u0002 \u0001(\u000e2\".google.protobuf.Field.CardinalityR\u000bcardinality\u0012\u0016\n\u0006number\u0018\u0003 \u0001(\u0005R\u0006number\u0012\u0012\n\u0004name\u0018\u0004 \u0001(\tR\u0004name\u0012\u0019\n\btype_url\u0018\u0006 \u0001(\tR\u0007typeUrl\u0012\u001f\n\u000boneof_index\u0018\u0007 \u0001(\u0005R\noneofIndex\u0012\u0016\n\u0006packed\u0018\b \u0001(\bR\u0006packed\u00121\n\u0007options\u0018\t \u0003(\u000b2\u0017.google.protobuf.OptionR\u0007options\u0012\u001b\n\tjson_name\u0018\n \u0001(\tR\bjsonName\u0012#\n\rdefault_value\u0018\u000b \u0001(\tR\fdefaultValue\"È\u0002\n\u0004Kind\u0012\u0010\n\fTYPE_UNKNOWN\u0010\u0000\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"t\n\u000bCardinality\u0012\u0017\n\u0013CARDINALITY_UNKNOWN\u0010\u0000\u0012\u0018\n\u0014CARDINALITY_OPTIONAL\u0010\u0001\u0012\u0018\n\u0014CARDINALITY_REQUIRED\u0010\u0002\u0012\u0018\n\u0014CARDINALITY_REPEATED\u0010\u0003\"\u0099\u0002\n\u0004Enum\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u00128\n\tenumvalue\u0018\u0002 \u0003(\u000b2\u001a.google.protobuf.EnumValueR\tenumvalue\u00121\n\u0007options\u0018\u0003 \u0003(\u000b2\u0017.google.protobuf.OptionR\u0007options\u0012E\n\u000esource_context\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.SourceContextR\rsourceContext\u0012/\n\u0006syntax\u0018\u0005 \u0001(\u000e2\u0017.google.protobuf.SyntaxR\u0006syntax\u0012\u0018\n\u0007edition\u0018\u0006 \u0001(\tR\u0007edition\"j\n\tEnumValue\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u0016\n\u0006number\u0018\u0002 \u0001(\u0005R\u0006number\u00121\n\u0007options\u0018\u0003 \u0003(\u000b2\u0017.google.protobuf.OptionR\u0007options\"H\n\u0006Option\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012*\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.AnyR\u0005value*C\n\u0006Syntax\u0012\u0011\n\rSYNTAX_PROTO2\u0010\u0000\u0012\u0011\n\rSYNTAX_PROTO3\u0010\u0001\u0012\u0013\n\u000fSYNTAX_EDITIONS\u0010\u0002B{\n\u0013com.google.protobufB\tTypeProtoP\u0001Z-google.golang.org/protobuf/types/known/typepbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), SourceContextProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_google_protobuf_Type_descriptor = descriptor2;
        internal_static_google_protobuf_Type_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Name", "Fields", "Oneofs", "Options", "SourceContext", "Syntax", "Edition"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_google_protobuf_Field_descriptor = descriptor3;
        internal_static_google_protobuf_Field_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"Kind", "Cardinality", "Number", "Name", "TypeUrl", "OneofIndex", "Packed", "Options", "JsonName", "DefaultValue"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_google_protobuf_Enum_descriptor = descriptor4;
        internal_static_google_protobuf_Enum_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor4, new String[]{"Name", "Enumvalue", "Options", "SourceContext", "Syntax", "Edition"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_google_protobuf_EnumValue_descriptor = descriptor5;
        internal_static_google_protobuf_EnumValue_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor5, new String[]{"Name", "Number", "Options"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_google_protobuf_Option_descriptor = descriptor6;
        internal_static_google_protobuf_Option_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor6, new String[]{"Name", "Value"});
        descriptor.resolveAllFeaturesImmutable();
        AnyProto.getDescriptor();
        SourceContextProto.getDescriptor();
    }

    private TypeProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
