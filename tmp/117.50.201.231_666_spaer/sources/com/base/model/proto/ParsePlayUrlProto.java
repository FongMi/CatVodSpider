package com.base.model.proto;

import com.github.catvod.spider.merge.A.a;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ParsePlayUrlProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ParsePlayUrlBean_HeadersEntry_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ParsePlayUrlBean_HeadersEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ParsePlayUrlBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ParsePlayUrlBean_fieldAccessorTable;

    public final class ParsePlayUrlBean extends GeneratedMessage implements ParsePlayUrlBeanOrBuilder {
        public static final int ANDROID_PLAY_CORE_FIELD_NUMBER = 7;
        private static final ParsePlayUrlBean DEFAULT_INSTANCE;
        public static final int DIRECT_FIELD_NUMBER = 5;
        public static final int FIT_MODE_FIELD_NUMBER = 2;
        public static final int HEADERS_FIELD_NUMBER = 6;
        public static final int IOS_PLAY_CORE_FIELD_NUMBER = 8;
        public static final int MIRROR_MODE_FIELD_NUMBER = 3;
        public static final int MSG_FIELD_NUMBER = 9;
        private static final Parser<ParsePlayUrlBean> PARSER;
        public static final int PLAY_URL_FIELD_NUMBER = 1;
        public static final int TIMEOUT_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object androidPlayCore_;
        private int direct_;
        private int fitMode_;
        private MapField<String, String> headers_;
        private volatile Object iosPlayCore_;
        private byte memoizedIsInitialized;
        private int mirrorMode_;
        private volatile Object msg_;
        private volatile Object playUrl_;
        private int timeout_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ParsePlayUrlBeanOrBuilder {
            private Object androidPlayCore_;
            private int bitField0_;
            private int direct_;
            private int fitMode_;
            private MapField<String, String> headers_;
            private Object iosPlayCore_;
            private int mirrorMode_;
            private Object msg_;
            private Object playUrl_;
            private int timeout_;

            private Builder() {
                this.playUrl_ = "";
                this.androidPlayCore_ = "";
                this.iosPlayCore_ = "";
                this.msg_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.playUrl_ = "";
                this.androidPlayCore_ = "";
                this.iosPlayCore_ = "";
                this.msg_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ParsePlayUrlBean parsePlayUrlBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    parsePlayUrlBean.playUrl_ = this.playUrl_;
                }
                if ((i & 2) != 0) {
                    parsePlayUrlBean.fitMode_ = this.fitMode_;
                }
                if ((i & 4) != 0) {
                    parsePlayUrlBean.mirrorMode_ = this.mirrorMode_;
                }
                if ((i & 8) != 0) {
                    parsePlayUrlBean.timeout_ = this.timeout_;
                }
                if ((i & 16) != 0) {
                    parsePlayUrlBean.direct_ = this.direct_;
                }
                if ((i & 32) != 0) {
                    parsePlayUrlBean.headers_ = internalGetHeaders();
                    parsePlayUrlBean.headers_.makeImmutable();
                }
                if ((i & 64) != 0) {
                    parsePlayUrlBean.androidPlayCore_ = this.androidPlayCore_;
                }
                if ((i & 128) != 0) {
                    parsePlayUrlBean.iosPlayCore_ = this.iosPlayCore_;
                }
                if ((i & 256) != 0) {
                    parsePlayUrlBean.msg_ = this.msg_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ParsePlayUrlProto.internal_static_com_base_model_proto_ParsePlayUrlBean_descriptor;
            }

            private MapField<String, String> internalGetHeaders() {
                MapField<String, String> mapField = this.headers_;
                return mapField == null ? MapField.emptyMapField(HeadersDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableHeaders() {
                if (this.headers_ == null) {
                    this.headers_ = MapField.newMapField(HeadersDefaultEntryHolder.defaultEntry);
                }
                if (!this.headers_.isMutable()) {
                    this.headers_ = this.headers_.copy();
                }
                this.bitField0_ |= 32;
                onChanged();
                return this.headers_;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ParsePlayUrlBean build() {
                ParsePlayUrlBean parsePlayUrlBeanBuildPartial = buildPartial();
                if (parsePlayUrlBeanBuildPartial.isInitialized()) {
                    return parsePlayUrlBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) parsePlayUrlBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ParsePlayUrlBean buildPartial() {
                ParsePlayUrlBean parsePlayUrlBean = new ParsePlayUrlBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(parsePlayUrlBean);
                }
                onBuilt();
                return parsePlayUrlBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.playUrl_ = "";
                this.fitMode_ = 0;
                this.mirrorMode_ = 0;
                this.timeout_ = 0;
                this.direct_ = 0;
                internalGetMutableHeaders().clear();
                this.androidPlayCore_ = "";
                this.iosPlayCore_ = "";
                this.msg_ = "";
                return this;
            }

            public Builder clearAndroidPlayCore() {
                this.androidPlayCore_ = ParsePlayUrlBean.getDefaultInstance().getAndroidPlayCore();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearDirect() {
                this.bitField0_ &= -17;
                this.direct_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFitMode() {
                this.bitField0_ &= -3;
                this.fitMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeaders() {
                this.bitField0_ &= -33;
                internalGetMutableHeaders().getMutableMap().clear();
                return this;
            }

            public Builder clearIosPlayCore() {
                this.iosPlayCore_ = ParsePlayUrlBean.getDefaultInstance().getIosPlayCore();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearMirrorMode() {
                this.bitField0_ &= -5;
                this.mirrorMode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMsg() {
                this.msg_ = ParsePlayUrlBean.getDefaultInstance().getMsg();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearPlayUrl() {
                this.playUrl_ = ParsePlayUrlBean.getDefaultInstance().getPlayUrl();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTimeout() {
                this.bitField0_ &= -9;
                this.timeout_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public boolean containsHeaders(String str) {
                if (str != null) {
                    return internalGetHeaders().getMap().containsKey(str);
                }
                throw new NullPointerException("map key");
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public String getAndroidPlayCore() {
                Object obj = this.androidPlayCore_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.androidPlayCore_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public ByteString getAndroidPlayCoreBytes() {
                Object obj = this.androidPlayCore_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.androidPlayCore_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ParsePlayUrlBean getDefaultInstanceForType() {
                return ParsePlayUrlBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ParsePlayUrlProto.internal_static_com_base_model_proto_ParsePlayUrlBean_descriptor;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public int getDirect() {
                return this.direct_;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public int getFitMode() {
                return this.fitMode_;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            @Deprecated
            public Map<String, String> getHeaders() {
                return getHeadersMap();
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public int getHeadersCount() {
                return internalGetHeaders().getMap().size();
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public Map<String, String> getHeadersMap() {
                return internalGetHeaders().getMap();
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public String getHeadersOrDefault(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetHeaders().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public String getHeadersOrThrow(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                Map<String, String> map = internalGetHeaders().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public String getIosPlayCore() {
                Object obj = this.iosPlayCore_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.iosPlayCore_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public ByteString getIosPlayCoreBytes() {
                Object obj = this.iosPlayCore_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.iosPlayCore_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public int getMirrorMode() {
                return this.mirrorMode_;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public String getMsg() {
                Object obj = this.msg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.msg_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public ByteString getMsgBytes() {
                Object obj = this.msg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.msg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Deprecated
            public Map<String, String> getMutableHeaders() {
                this.bitField0_ |= 32;
                return internalGetMutableHeaders().getMutableMap();
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public String getPlayUrl() {
                Object obj = this.playUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.playUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public ByteString getPlayUrlBytes() {
                Object obj = this.playUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.playUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
            public int getTimeout() {
                return this.timeout_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ParsePlayUrlProto.internal_static_com_base_model_proto_ParsePlayUrlBean_fieldAccessorTable.ensureFieldAccessorsInitialized(ParsePlayUrlBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
                if (i == 6) {
                    return internalGetHeaders();
                }
                throw new RuntimeException(a.c("Invalid map field number: ", i));
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
                if (i == 6) {
                    return internalGetMutableHeaders();
                }
                throw new RuntimeException(a.c("Invalid map field number: ", i));
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ParsePlayUrlBean parsePlayUrlBean) {
                if (parsePlayUrlBean == ParsePlayUrlBean.getDefaultInstance()) {
                    return this;
                }
                if (!parsePlayUrlBean.getPlayUrl().isEmpty()) {
                    this.playUrl_ = parsePlayUrlBean.playUrl_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (parsePlayUrlBean.getFitMode() != 0) {
                    setFitMode(parsePlayUrlBean.getFitMode());
                }
                if (parsePlayUrlBean.getMirrorMode() != 0) {
                    setMirrorMode(parsePlayUrlBean.getMirrorMode());
                }
                if (parsePlayUrlBean.getTimeout() != 0) {
                    setTimeout(parsePlayUrlBean.getTimeout());
                }
                if (parsePlayUrlBean.getDirect() != 0) {
                    setDirect(parsePlayUrlBean.getDirect());
                }
                internalGetMutableHeaders().mergeFrom(parsePlayUrlBean.internalGetHeaders());
                this.bitField0_ |= 32;
                if (!parsePlayUrlBean.getAndroidPlayCore().isEmpty()) {
                    this.androidPlayCore_ = parsePlayUrlBean.androidPlayCore_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (!parsePlayUrlBean.getIosPlayCore().isEmpty()) {
                    this.iosPlayCore_ = parsePlayUrlBean.iosPlayCore_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (!parsePlayUrlBean.getMsg().isEmpty()) {
                    this.msg_ = parsePlayUrlBean.msg_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                mergeUnknownFields(parsePlayUrlBean.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.playUrl_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.fitMode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.mirrorMode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.timeout_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.direct_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(HeadersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                    internalGetMutableHeaders().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    this.androidPlayCore_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    this.iosPlayCore_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    this.msg_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 256;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ParsePlayUrlBean) {
                    return mergeFrom((ParsePlayUrlBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder putAllHeaders(Map<String, String> map) {
                internalGetMutableHeaders().getMutableMap().putAll(map);
                this.bitField0_ |= 32;
                return this;
            }

            public Builder putHeaders(String str, String str2) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                if (str2 == null) {
                    throw new NullPointerException("map value");
                }
                internalGetMutableHeaders().getMutableMap().put(str, str2);
                this.bitField0_ |= 32;
                return this;
            }

            public Builder removeHeaders(String str) {
                if (str == null) {
                    throw new NullPointerException("map key");
                }
                internalGetMutableHeaders().getMutableMap().remove(str);
                return this;
            }

            public Builder setAndroidPlayCore(String str) {
                str.getClass();
                this.androidPlayCore_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setAndroidPlayCoreBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.androidPlayCore_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDirect(int i) {
                this.direct_ = i;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFitMode(int i) {
                this.fitMode_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIosPlayCore(String str) {
                str.getClass();
                this.iosPlayCore_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setIosPlayCoreBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.iosPlayCore_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMirrorMode(int i) {
                this.mirrorMode_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMsg(String str) {
                str.getClass();
                this.msg_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMsgBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.msg_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPlayUrl(String str) {
                str.getClass();
                this.playUrl_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPlayUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.playUrl_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTimeout(int i) {
                this.timeout_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }
        }

        final class HeadersDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry;

            static {
                Descriptors.Descriptor descriptor = ParsePlayUrlProto.internal_static_com_base_model_proto_ParsePlayUrlBean_HeadersEntry_descriptor;
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
            }

            private HeadersDefaultEntryHolder() {
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ParsePlayUrlBean.class.getName());
            DEFAULT_INSTANCE = new ParsePlayUrlBean();
            PARSER = new AbstractParser<ParsePlayUrlBean>() { // from class: com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBean.1
                @Override // com.google.protobuf.Parser
                public ParsePlayUrlBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ParsePlayUrlBean.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                        return builderNewBuilder.buildPartial();
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (UninitializedMessageException e2) {
                        throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(builderNewBuilder.buildPartial());
                    }
                }
            };
        }

        private ParsePlayUrlBean() {
            this.playUrl_ = "";
            this.fitMode_ = 0;
            this.mirrorMode_ = 0;
            this.timeout_ = 0;
            this.direct_ = 0;
            this.androidPlayCore_ = "";
            this.iosPlayCore_ = "";
            this.msg_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.playUrl_ = "";
            this.androidPlayCore_ = "";
            this.iosPlayCore_ = "";
            this.msg_ = "";
        }

        public /* synthetic */ ParsePlayUrlBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ParsePlayUrlBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.playUrl_ = "";
            this.fitMode_ = 0;
            this.mirrorMode_ = 0;
            this.timeout_ = 0;
            this.direct_ = 0;
            this.androidPlayCore_ = "";
            this.iosPlayCore_ = "";
            this.msg_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ParsePlayUrlBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ParsePlayUrlProto.internal_static_com_base_model_proto_ParsePlayUrlBean_descriptor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, String> internalGetHeaders() {
            MapField<String, String> mapField = this.headers_;
            return mapField == null ? MapField.emptyMapField(HeadersDefaultEntryHolder.defaultEntry) : mapField;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ParsePlayUrlBean parsePlayUrlBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(parsePlayUrlBean);
        }

        public static ParsePlayUrlBean parseDelimitedFrom(InputStream inputStream) {
            return (ParsePlayUrlBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ParsePlayUrlBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ParsePlayUrlBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ParsePlayUrlBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ParsePlayUrlBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ParsePlayUrlBean parseFrom(CodedInputStream codedInputStream) {
            return (ParsePlayUrlBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ParsePlayUrlBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ParsePlayUrlBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ParsePlayUrlBean parseFrom(InputStream inputStream) {
            return (ParsePlayUrlBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ParsePlayUrlBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ParsePlayUrlBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ParsePlayUrlBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ParsePlayUrlBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ParsePlayUrlBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ParsePlayUrlBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ParsePlayUrlBean> parser() {
            return PARSER;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public boolean containsHeaders(String str) {
            if (str != null) {
                return internalGetHeaders().getMap().containsKey(str);
            }
            throw new NullPointerException("map key");
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ParsePlayUrlBean)) {
                return super.equals(obj);
            }
            ParsePlayUrlBean parsePlayUrlBean = (ParsePlayUrlBean) obj;
            return getPlayUrl().equals(parsePlayUrlBean.getPlayUrl()) && getFitMode() == parsePlayUrlBean.getFitMode() && getMirrorMode() == parsePlayUrlBean.getMirrorMode() && getTimeout() == parsePlayUrlBean.getTimeout() && getDirect() == parsePlayUrlBean.getDirect() && internalGetHeaders().equals(parsePlayUrlBean.internalGetHeaders()) && getAndroidPlayCore().equals(parsePlayUrlBean.getAndroidPlayCore()) && getIosPlayCore().equals(parsePlayUrlBean.getIosPlayCore()) && getMsg().equals(parsePlayUrlBean.getMsg()) && getUnknownFields().equals(parsePlayUrlBean.getUnknownFields());
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public String getAndroidPlayCore() {
            Object obj = this.androidPlayCore_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.androidPlayCore_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public ByteString getAndroidPlayCoreBytes() {
            Object obj = this.androidPlayCore_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.androidPlayCore_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ParsePlayUrlBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public int getDirect() {
            return this.direct_;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public int getFitMode() {
            return this.fitMode_;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        @Deprecated
        public Map<String, String> getHeaders() {
            return getHeadersMap();
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public int getHeadersCount() {
            return internalGetHeaders().getMap().size();
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public Map<String, String> getHeadersMap() {
            return internalGetHeaders().getMap();
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public String getHeadersOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetHeaders().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public String getHeadersOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetHeaders().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public String getIosPlayCore() {
            Object obj = this.iosPlayCore_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.iosPlayCore_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public ByteString getIosPlayCoreBytes() {
            Object obj = this.iosPlayCore_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iosPlayCore_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public int getMirrorMode() {
            return this.mirrorMode_;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public String getMsg() {
            Object obj = this.msg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.msg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public ByteString getMsgBytes() {
            Object obj = this.msg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.msg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ParsePlayUrlBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public String getPlayUrl() {
            Object obj = this.playUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.playUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public ByteString getPlayUrlBytes() {
            Object obj = this.playUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.playUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.playUrl_) ? GeneratedMessage.computeStringSize(1, this.playUrl_) : 0;
            int i2 = this.fitMode_;
            if (i2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(2, i2);
            }
            int i3 = this.mirrorMode_;
            if (i3 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(3, i3);
            }
            int i4 = this.timeout_;
            if (i4 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(4, i4);
            }
            int i5 = this.direct_;
            if (i5 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(5, i5);
            }
            for (Map.Entry<String, String> entry : internalGetHeaders().getMap().entrySet()) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(6, HeadersDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            if (!GeneratedMessage.isStringEmpty(this.androidPlayCore_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.androidPlayCore_);
            }
            if (!GeneratedMessage.isStringEmpty(this.iosPlayCore_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(8, this.iosPlayCore_);
            }
            if (!GeneratedMessage.isStringEmpty(this.msg_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(9, this.msg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.ParsePlayUrlProto.ParsePlayUrlBeanOrBuilder
        public int getTimeout() {
            return this.timeout_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int direct = getDirect() + ((((getTimeout() + ((((getMirrorMode() + ((((getFitMode() + ((((getPlayUrl().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53);
            if (!internalGetHeaders().getMap().isEmpty()) {
                direct = internalGetHeaders().hashCode() + a.a(direct, 37, 6, 53);
            }
            int iHashCode = getUnknownFields().hashCode() + ((getMsg().hashCode() + ((((getIosPlayCore().hashCode() + ((((getAndroidPlayCore().hashCode() + a.a(direct, 37, 7, 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ParsePlayUrlProto.internal_static_com_base_model_proto_ParsePlayUrlBean_fieldAccessorTable.ensureFieldAccessorsInitialized(ParsePlayUrlBean.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 6) {
                return internalGetHeaders();
            }
            throw new RuntimeException(a.c("Invalid map field number: ", i));
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // com.google.protobuf.AbstractMessage
        public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i) : new Builder(i).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!GeneratedMessage.isStringEmpty(this.playUrl_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.playUrl_);
            }
            int i = this.fitMode_;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            int i2 = this.mirrorMode_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            int i3 = this.timeout_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(4, i3);
            }
            int i4 = this.direct_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(5, i4);
            }
            GeneratedMessage.serializeStringMapTo(codedOutputStream, internalGetHeaders(), HeadersDefaultEntryHolder.defaultEntry, 6);
            if (!GeneratedMessage.isStringEmpty(this.androidPlayCore_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.androidPlayCore_);
            }
            if (!GeneratedMessage.isStringEmpty(this.iosPlayCore_)) {
                GeneratedMessage.writeString(codedOutputStream, 8, this.iosPlayCore_);
            }
            if (!GeneratedMessage.isStringEmpty(this.msg_)) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.msg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ParsePlayUrlBeanOrBuilder extends MessageOrBuilder {
        boolean containsHeaders(String str);

        String getAndroidPlayCore();

        ByteString getAndroidPlayCoreBytes();

        int getDirect();

        int getFitMode();

        @Deprecated
        Map<String, String> getHeaders();

        int getHeadersCount();

        Map<String, String> getHeadersMap();

        String getHeadersOrDefault(String str, String str2);

        String getHeadersOrThrow(String str);

        String getIosPlayCore();

        ByteString getIosPlayCoreBytes();

        int getMirrorMode();

        String getMsg();

        ByteString getMsgBytes();

        String getPlayUrl();

        ByteString getPlayUrlBytes();

        int getTimeout();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ParsePlayUrlProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012ParsePlayUrl.proto\u0012\u0014com.base.model.proto\"¡\u0002\n\u0010ParsePlayUrlBean\u0012\u0010\n\bplay_url\u0018\u0001 \u0001(\t\u0012\u0010\n\bfit_mode\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000bmirror_mode\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007timeout\u0018\u0004 \u0001(\u0005\u0012\u000e\n\u0006direct\u0018\u0005 \u0001(\u0005\u0012D\n\u0007headers\u0018\u0006 \u0003(\u000b23.com.base.model.proto.ParsePlayUrlBean.HeadersEntry\u0012\u0019\n\u0011android_play_core\u0018\u0007 \u0001(\t\u0012\u0015\n\rios_play_core\u0018\b \u0001(\t\u0012\u000b\n\u0003msg\u0018\t \u0001(\t\u001a.\n\fHeadersEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B\u0013B\u0011ParsePlayUrlProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_ParsePlayUrlBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_ParsePlayUrlBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"PlayUrl", "FitMode", "MirrorMode", "Timeout", "Direct", "Headers", "AndroidPlayCore", "IosPlayCore", "Msg"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_com_base_model_proto_ParsePlayUrlBean_HeadersEntry_descriptor = descriptor3;
        internal_static_com_base_model_proto_ParsePlayUrlBean_HeadersEntry_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"Key", "Value"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private ParsePlayUrlProto() {
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
