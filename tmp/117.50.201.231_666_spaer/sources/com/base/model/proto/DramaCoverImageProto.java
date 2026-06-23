package com.base.model.proto;

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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class DramaCoverImageProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_DramaCoverImageBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_DramaCoverImageBean_fieldAccessorTable;

    public final class DramaCoverImageBean extends GeneratedMessage implements DramaCoverImageBeanOrBuilder {
        private static final DramaCoverImageBean DEFAULT_INSTANCE;
        private static final Parser<DramaCoverImageBean> PARSER;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int THUMBNAIL_PATH_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object path_;
        private volatile Object thumbnailPath_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements DramaCoverImageBeanOrBuilder {
            private int bitField0_;
            private Object path_;
            private Object thumbnailPath_;

            private Builder() {
                this.path_ = "";
                this.thumbnailPath_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.path_ = "";
                this.thumbnailPath_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(DramaCoverImageBean dramaCoverImageBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    dramaCoverImageBean.path_ = this.path_;
                }
                if ((i & 2) != 0) {
                    dramaCoverImageBean.thumbnailPath_ = this.thumbnailPath_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DramaCoverImageProto.internal_static_com_base_model_proto_DramaCoverImageBean_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaCoverImageBean build() {
                DramaCoverImageBean dramaCoverImageBeanBuildPartial = buildPartial();
                if (dramaCoverImageBeanBuildPartial.isInitialized()) {
                    return dramaCoverImageBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dramaCoverImageBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaCoverImageBean buildPartial() {
                DramaCoverImageBean dramaCoverImageBean = new DramaCoverImageBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dramaCoverImageBean);
                }
                onBuilt();
                return dramaCoverImageBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.path_ = "";
                this.thumbnailPath_ = "";
                return this;
            }

            public Builder clearPath() {
                this.path_ = DramaCoverImageBean.getDefaultInstance().getPath();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearThumbnailPath() {
                this.thumbnailPath_ = DramaCoverImageBean.getDefaultInstance().getThumbnailPath();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DramaCoverImageBean getDefaultInstanceForType() {
                return DramaCoverImageBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DramaCoverImageProto.internal_static_com_base_model_proto_DramaCoverImageBean_descriptor;
            }

            @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
            public String getPath() {
                Object obj = this.path_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.path_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
            public ByteString getPathBytes() {
                Object obj = this.path_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.path_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
            public String getThumbnailPath() {
                Object obj = this.thumbnailPath_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.thumbnailPath_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
            public ByteString getThumbnailPathBytes() {
                Object obj = this.thumbnailPath_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.thumbnailPath_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DramaCoverImageProto.internal_static_com_base_model_proto_DramaCoverImageBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaCoverImageBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DramaCoverImageBean dramaCoverImageBean) {
                if (dramaCoverImageBean == DramaCoverImageBean.getDefaultInstance()) {
                    return this;
                }
                if (!dramaCoverImageBean.getPath().isEmpty()) {
                    this.path_ = dramaCoverImageBean.path_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!dramaCoverImageBean.getThumbnailPath().isEmpty()) {
                    this.thumbnailPath_ = dramaCoverImageBean.thumbnailPath_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(dramaCoverImageBean.getUnknownFields());
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
                                    this.path_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.thumbnailPath_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
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
                if (message instanceof DramaCoverImageBean) {
                    return mergeFrom((DramaCoverImageBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPath(String str) {
                str.getClass();
                this.path_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.path_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setThumbnailPath(String str) {
                str.getClass();
                this.thumbnailPath_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setThumbnailPathBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.thumbnailPath_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaCoverImageBean.class.getName());
            DEFAULT_INSTANCE = new DramaCoverImageBean();
            PARSER = new AbstractParser<DramaCoverImageBean>() { // from class: com.base.model.proto.DramaCoverImageProto.DramaCoverImageBean.1
                @Override // com.google.protobuf.Parser
                public DramaCoverImageBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = DramaCoverImageBean.newBuilder();
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

        private DramaCoverImageBean() {
            this.path_ = "";
            this.thumbnailPath_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.path_ = "";
            this.thumbnailPath_ = "";
        }

        public /* synthetic */ DramaCoverImageBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private DramaCoverImageBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.path_ = "";
            this.thumbnailPath_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DramaCoverImageBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DramaCoverImageProto.internal_static_com_base_model_proto_DramaCoverImageBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DramaCoverImageBean dramaCoverImageBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dramaCoverImageBean);
        }

        public static DramaCoverImageBean parseDelimitedFrom(InputStream inputStream) {
            return (DramaCoverImageBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DramaCoverImageBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaCoverImageBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaCoverImageBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static DramaCoverImageBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DramaCoverImageBean parseFrom(CodedInputStream codedInputStream) {
            return (DramaCoverImageBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DramaCoverImageBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaCoverImageBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DramaCoverImageBean parseFrom(InputStream inputStream) {
            return (DramaCoverImageBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static DramaCoverImageBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaCoverImageBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaCoverImageBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DramaCoverImageBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DramaCoverImageBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DramaCoverImageBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<DramaCoverImageBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DramaCoverImageBean)) {
                return super.equals(obj);
            }
            DramaCoverImageBean dramaCoverImageBean = (DramaCoverImageBean) obj;
            return getPath().equals(dramaCoverImageBean.getPath()) && getThumbnailPath().equals(dramaCoverImageBean.getThumbnailPath()) && getUnknownFields().equals(dramaCoverImageBean.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DramaCoverImageBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DramaCoverImageBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
        public String getPath() {
            Object obj = this.path_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.path_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
        public ByteString getPathBytes() {
            Object obj = this.path_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.path_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.path_) ? GeneratedMessage.computeStringSize(1, this.path_) : 0;
            if (!GeneratedMessage.isStringEmpty(this.thumbnailPath_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.thumbnailPath_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
        public String getThumbnailPath() {
            Object obj = this.thumbnailPath_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.thumbnailPath_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaCoverImageProto.DramaCoverImageBeanOrBuilder
        public ByteString getThumbnailPathBytes() {
            Object obj = this.thumbnailPath_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.thumbnailPath_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getThumbnailPath().hashCode() + ((((getPath().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DramaCoverImageProto.internal_static_com_base_model_proto_DramaCoverImageBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaCoverImageBean.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.path_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.path_);
            }
            if (!GeneratedMessage.isStringEmpty(this.thumbnailPath_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.thumbnailPath_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface DramaCoverImageBeanOrBuilder extends MessageOrBuilder {
        String getPath();

        ByteString getPathBytes();

        String getThumbnailPath();

        ByteString getThumbnailPathBytes();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaCoverImageProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015DramaCoverImage.proto\u0012\u0014com.base.model.proto\";\n\u0013DramaCoverImageBean\u0012\f\n\u0004path\u0018\u0001 \u0001(\t\u0012\u0016\n\u000ethumbnail_path\u0018\u0002 \u0001(\tB\u0016B\u0014DramaCoverImageProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_DramaCoverImageBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_DramaCoverImageBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Path", "ThumbnailPath"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private DramaCoverImageProto() {
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
