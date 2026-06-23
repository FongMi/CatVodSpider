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
public final class VodProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_VodBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_VodBean_fieldAccessorTable;

    public final class VodBean extends GeneratedMessage implements VodBeanOrBuilder {
        private static final VodBean DEFAULT_INSTANCE;
        private static final Parser<VodBean> PARSER;
        public static final int VOD_ID_FIELD_NUMBER = 1;
        public static final int VOD_NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int vodId_;
        private volatile Object vodName_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements VodBeanOrBuilder {
            private int bitField0_;
            private int vodId_;
            private Object vodName_;

            private Builder() {
                this.vodName_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.vodName_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(VodBean vodBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    vodBean.vodId_ = this.vodId_;
                }
                if ((i & 2) != 0) {
                    vodBean.vodName_ = this.vodName_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return VodProto.internal_static_com_base_model_proto_VodBean_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VodBean build() {
                VodBean vodBeanBuildPartial = buildPartial();
                if (vodBeanBuildPartial.isInitialized()) {
                    return vodBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) vodBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VodBean buildPartial() {
                VodBean vodBean = new VodBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(vodBean);
                }
                onBuilt();
                return vodBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.vodId_ = 0;
                this.vodName_ = "";
                return this;
            }

            public Builder clearVodId() {
                this.bitField0_ &= -2;
                this.vodId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVodName() {
                this.vodName_ = VodBean.getDefaultInstance().getVodName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public VodBean getDefaultInstanceForType() {
                return VodBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return VodProto.internal_static_com_base_model_proto_VodBean_descriptor;
            }

            @Override // com.base.model.proto.VodProto.VodBeanOrBuilder
            public int getVodId() {
                return this.vodId_;
            }

            @Override // com.base.model.proto.VodProto.VodBeanOrBuilder
            public String getVodName() {
                Object obj = this.vodName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vodName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.VodProto.VodBeanOrBuilder
            public ByteString getVodNameBytes() {
                Object obj = this.vodName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vodName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return VodProto.internal_static_com_base_model_proto_VodBean_fieldAccessorTable.ensureFieldAccessorsInitialized(VodBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(VodBean vodBean) {
                if (vodBean == VodBean.getDefaultInstance()) {
                    return this;
                }
                if (vodBean.getVodId() != 0) {
                    setVodId(vodBean.getVodId());
                }
                if (!vodBean.getVodName().isEmpty()) {
                    this.vodName_ = vodBean.vodName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(vodBean.getUnknownFields());
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
                                    this.vodId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.vodName_ = codedInputStream.readStringRequireUtf8();
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
                if (message instanceof VodBean) {
                    return mergeFrom((VodBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setVodId(int i) {
                this.vodId_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVodName(String str) {
                str.getClass();
                this.vodName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVodNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.vodName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", VodBean.class.getName());
            DEFAULT_INSTANCE = new VodBean();
            PARSER = new AbstractParser<VodBean>() { // from class: com.base.model.proto.VodProto.VodBean.1
                @Override // com.google.protobuf.Parser
                public VodBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = VodBean.newBuilder();
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

        private VodBean() {
            this.vodId_ = 0;
            this.vodName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.vodName_ = "";
        }

        public /* synthetic */ VodBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private VodBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.vodId_ = 0;
            this.vodName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VodBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return VodProto.internal_static_com_base_model_proto_VodBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(VodBean vodBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(vodBean);
        }

        public static VodBean parseDelimitedFrom(InputStream inputStream) {
            return (VodBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VodBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VodBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VodBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static VodBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VodBean parseFrom(CodedInputStream codedInputStream) {
            return (VodBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static VodBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VodBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static VodBean parseFrom(InputStream inputStream) {
            return (VodBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static VodBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VodBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VodBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static VodBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static VodBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VodBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<VodBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VodBean)) {
                return super.equals(obj);
            }
            VodBean vodBean = (VodBean) obj;
            return getVodId() == vodBean.getVodId() && getVodName().equals(vodBean.getVodName()) && getUnknownFields().equals(vodBean.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VodBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VodBean> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.vodId_;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
            if (!GeneratedMessage.isStringEmpty(this.vodName_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(2, this.vodName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.VodProto.VodBeanOrBuilder
        public int getVodId() {
            return this.vodId_;
        }

        @Override // com.base.model.proto.VodProto.VodBeanOrBuilder
        public String getVodName() {
            Object obj = this.vodName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.vodName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.VodProto.VodBeanOrBuilder
        public ByteString getVodNameBytes() {
            Object obj = this.vodName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.vodName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getVodName().hashCode() + ((((getVodId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return VodProto.internal_static_com_base_model_proto_VodBean_fieldAccessorTable.ensureFieldAccessorsInitialized(VodBean.class, Builder.class);
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
            int i = this.vodId_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodName_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.vodName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface VodBeanOrBuilder extends MessageOrBuilder {
        int getVodId();

        String getVodName();

        ByteString getVodNameBytes();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", VodProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\tVod.proto\u0012\u0014com.base.model.proto\"+\n\u0007VodBean\u0012\u000e\n\u0006vod_id\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bvod_name\u0018\u0002 \u0001(\tB\nB\bVodProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_VodBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_VodBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"VodId", "VodName"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private VodProto() {
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
