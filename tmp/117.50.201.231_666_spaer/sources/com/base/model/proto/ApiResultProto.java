package com.base.model.proto;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AnyProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class ApiResultProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ApiResult_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ApiResult_fieldAccessorTable;

    public final class ApiResult extends GeneratedMessage implements ApiResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 3;
        private static final ApiResult DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 2;
        private static final Parser<ApiResult> PARSER;
        private static final long serialVersionUID = 0;
        private long code_;
        private ByteString data_;
        private byte memoizedIsInitialized;
        private volatile Object msg_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ApiResultOrBuilder {
            private int bitField0_;
            private long code_;
            private ByteString data_;
            private Object msg_;

            private Builder() {
                this.msg_ = "";
                this.data_ = ByteString.EMPTY;
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.msg_ = "";
                this.data_ = ByteString.EMPTY;
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ApiResult apiResult) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    apiResult.code_ = this.code_;
                }
                if ((i & 2) != 0) {
                    apiResult.msg_ = this.msg_;
                }
                if ((i & 4) != 0) {
                    apiResult.data_ = this.data_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ApiResultProto.internal_static_com_base_model_proto_ApiResult_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApiResult build() {
                ApiResult apiResultBuildPartial = buildPartial();
                if (apiResultBuildPartial.isInitialized()) {
                    return apiResultBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) apiResultBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ApiResult buildPartial() {
                ApiResult apiResult = new ApiResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(apiResult);
                }
                onBuilt();
                return apiResult;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.code_ = 0L;
                this.msg_ = "";
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -5;
                this.data_ = ApiResult.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            public Builder clearMsg() {
                this.msg_ = ApiResult.getDefaultInstance().getMsg();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
            public long getCode() {
                return this.code_;
            }

            @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ApiResult getDefaultInstanceForType() {
                return ApiResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ApiResultProto.internal_static_com_base_model_proto_ApiResult_descriptor;
            }

            @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
            public String getMsg() {
                Object obj = this.msg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.msg_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
            public ByteString getMsgBytes() {
                Object obj = this.msg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.msg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ApiResultProto.internal_static_com_base_model_proto_ApiResult_fieldAccessorTable.ensureFieldAccessorsInitialized(ApiResult.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ApiResult apiResult) {
                if (apiResult == ApiResult.getDefaultInstance()) {
                    return this;
                }
                if (apiResult.getCode() != 0) {
                    setCode(apiResult.getCode());
                }
                if (!apiResult.getMsg().isEmpty()) {
                    this.msg_ = apiResult.msg_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!apiResult.getData().isEmpty()) {
                    setData(apiResult.getData());
                }
                mergeUnknownFields(apiResult.getUnknownFields());
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
                                if (tag == 8) {
                                    this.code_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.msg_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
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
                if (message instanceof ApiResult) {
                    return mergeFrom((ApiResult) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCode(long j) {
                this.code_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMsg(String str) {
                str.getClass();
                this.msg_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMsgBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.msg_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ApiResult.class.getName());
            DEFAULT_INSTANCE = new ApiResult();
            PARSER = new AbstractParser<ApiResult>() { // from class: com.base.model.proto.ApiResultProto.ApiResult.1
                @Override // com.google.protobuf.Parser
                public ApiResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ApiResult.newBuilder();
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

        private ApiResult() {
            this.code_ = 0L;
            this.msg_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.data_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.msg_ = "";
            this.data_ = byteString;
        }

        public /* synthetic */ ApiResult(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ApiResult(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.code_ = 0L;
            this.msg_ = "";
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ApiResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ApiResultProto.internal_static_com_base_model_proto_ApiResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ApiResult apiResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(apiResult);
        }

        public static ApiResult parseDelimitedFrom(InputStream inputStream) {
            return (ApiResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ApiResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApiResult) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApiResult parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ApiResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ApiResult parseFrom(CodedInputStream codedInputStream) {
            return (ApiResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ApiResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApiResult) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ApiResult parseFrom(InputStream inputStream) {
            return (ApiResult) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ApiResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ApiResult) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ApiResult parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ApiResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ApiResult parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ApiResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ApiResult> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ApiResult)) {
                return super.equals(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            return getCode() == apiResult.getCode() && getMsg().equals(apiResult.getMsg()) && getData().equals(apiResult.getData()) && getUnknownFields().equals(apiResult.getUnknownFields());
        }

        @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
        public long getCode() {
            return this.code_;
        }

        @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ApiResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
        public String getMsg() {
            Object obj = this.msg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.msg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ApiResultProto.ApiResultOrBuilder
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
        public Parser<ApiResult> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.code_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessage.isStringEmpty(this.msg_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.msg_);
            }
            if (!this.data_.isEmpty()) {
                iComputeInt64Size += CodedOutputStream.computeBytesSize(3, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getData().hashCode() + ((((getMsg().hashCode() + ((((Internal.hashLong(getCode()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ApiResultProto.internal_static_com_base_model_proto_ApiResult_fieldAccessorTable.ensureFieldAccessorsInitialized(ApiResult.class, Builder.class);
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
            long j = this.code_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.msg_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.msg_);
            }
            if (!this.data_.isEmpty()) {
                codedOutputStream.writeBytes(3, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ApiResultOrBuilder extends MessageOrBuilder {
        long getCode();

        ByteString getData();

        String getMsg();

        ByteString getMsgBytes();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ApiResultProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fApiResult.proto\u0012\u0014com.base.model.proto\u001a\u0019google/protobuf/any.proto\"4\n\tApiResult\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0003\u0012\u000b\n\u0003msg\u0018\u0002 \u0001(\t\u0012\f\n\u0004data\u0018\u0003 \u0001(\fB\u0010B\u000eApiResultProtob\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_ApiResult_descriptor = descriptor2;
        internal_static_com_base_model_proto_ApiResult_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Code", "Msg", "Data"});
        descriptor.resolveAllFeaturesImmutable();
        AnyProto.getDescriptor();
    }

    private ApiResultProto() {
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
