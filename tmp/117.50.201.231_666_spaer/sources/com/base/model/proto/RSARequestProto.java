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
public final class RSARequestProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_RSARequest_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_RSARequest_fieldAccessorTable;

    public final class RSARequest extends GeneratedMessage implements RSARequestOrBuilder {
        private static final RSARequest DEFAULT_INSTANCE;
        public static final int FAKE1_FIELD_NUMBER = 3;
        public static final int FAKE2_FIELD_NUMBER = 5;
        private static final Parser<RSARequest> PARSER;
        public static final int RANDOM_STR_FIELD_NUMBER = 4;
        public static final int SIGN_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object fake1_;
        private volatile Object fake2_;
        private byte memoizedIsInitialized;
        private volatile Object randomStr_;
        private volatile Object sign_;
        private long timestamp_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements RSARequestOrBuilder {
            private int bitField0_;
            private Object fake1_;
            private Object fake2_;
            private Object randomStr_;
            private Object sign_;
            private long timestamp_;

            private Builder() {
                this.sign_ = "";
                this.fake1_ = "";
                this.randomStr_ = "";
                this.fake2_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.sign_ = "";
                this.fake1_ = "";
                this.randomStr_ = "";
                this.fake2_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(RSARequest rSARequest) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    rSARequest.timestamp_ = this.timestamp_;
                }
                if ((i & 2) != 0) {
                    rSARequest.sign_ = this.sign_;
                }
                if ((i & 4) != 0) {
                    rSARequest.fake1_ = this.fake1_;
                }
                if ((i & 8) != 0) {
                    rSARequest.randomStr_ = this.randomStr_;
                }
                if ((i & 16) != 0) {
                    rSARequest.fake2_ = this.fake2_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RSARequestProto.internal_static_com_base_model_proto_RSARequest_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RSARequest build() {
                RSARequest rSARequestBuildPartial = buildPartial();
                if (rSARequestBuildPartial.isInitialized()) {
                    return rSARequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rSARequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RSARequest buildPartial() {
                RSARequest rSARequest = new RSARequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rSARequest);
                }
                onBuilt();
                return rSARequest;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timestamp_ = 0L;
                this.sign_ = "";
                this.fake1_ = "";
                this.randomStr_ = "";
                this.fake2_ = "";
                return this;
            }

            public Builder clearFake1() {
                this.fake1_ = RSARequest.getDefaultInstance().getFake1();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearFake2() {
                this.fake2_ = RSARequest.getDefaultInstance().getFake2();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearRandomStr() {
                this.randomStr_ = RSARequest.getDefaultInstance().getRandomStr();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearSign() {
                this.sign_ = RSARequest.getDefaultInstance().getSign();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -2;
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RSARequest getDefaultInstanceForType() {
                return RSARequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RSARequestProto.internal_static_com_base_model_proto_RSARequest_descriptor;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public String getFake1() {
                Object obj = this.fake1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fake1_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public ByteString getFake1Bytes() {
                Object obj = this.fake1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fake1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public String getFake2() {
                Object obj = this.fake2_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fake2_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public ByteString getFake2Bytes() {
                Object obj = this.fake2_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fake2_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public String getRandomStr() {
                Object obj = this.randomStr_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.randomStr_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public ByteString getRandomStrBytes() {
                Object obj = this.randomStr_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.randomStr_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public String getSign() {
                Object obj = this.sign_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sign_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public ByteString getSignBytes() {
                Object obj = this.sign_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sign_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RSARequestProto.internal_static_com_base_model_proto_RSARequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RSARequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(RSARequest rSARequest) {
                if (rSARequest == RSARequest.getDefaultInstance()) {
                    return this;
                }
                if (rSARequest.getTimestamp() != 0) {
                    setTimestamp(rSARequest.getTimestamp());
                }
                if (!rSARequest.getSign().isEmpty()) {
                    this.sign_ = rSARequest.sign_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!rSARequest.getFake1().isEmpty()) {
                    this.fake1_ = rSARequest.fake1_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!rSARequest.getRandomStr().isEmpty()) {
                    this.randomStr_ = rSARequest.randomStr_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!rSARequest.getFake2().isEmpty()) {
                    this.fake2_ = rSARequest.fake2_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(rSARequest.getUnknownFields());
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
                                    this.timestamp_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.sign_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.fake1_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.randomStr_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.fake2_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
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
                if (message instanceof RSARequest) {
                    return mergeFrom((RSARequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setFake1(String str) {
                str.getClass();
                this.fake1_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFake1Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fake1_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFake2(String str) {
                str.getClass();
                this.fake2_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFake2Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fake2_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRandomStr(String str) {
                str.getClass();
                this.randomStr_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setRandomStrBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.randomStr_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSign(String str) {
                str.getClass();
                this.sign_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSignBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.sign_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j) {
                this.timestamp_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", RSARequest.class.getName());
            DEFAULT_INSTANCE = new RSARequest();
            PARSER = new AbstractParser<RSARequest>() { // from class: com.base.model.proto.RSARequestProto.RSARequest.1
                @Override // com.google.protobuf.Parser
                public RSARequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = RSARequest.newBuilder();
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

        private RSARequest() {
            this.timestamp_ = 0L;
            this.sign_ = "";
            this.fake1_ = "";
            this.randomStr_ = "";
            this.fake2_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.sign_ = "";
            this.fake1_ = "";
            this.randomStr_ = "";
            this.fake2_ = "";
        }

        public /* synthetic */ RSARequest(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private RSARequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.timestamp_ = 0L;
            this.sign_ = "";
            this.fake1_ = "";
            this.randomStr_ = "";
            this.fake2_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RSARequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RSARequestProto.internal_static_com_base_model_proto_RSARequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(RSARequest rSARequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rSARequest);
        }

        public static RSARequest parseDelimitedFrom(InputStream inputStream) {
            return (RSARequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RSARequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RSARequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RSARequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static RSARequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RSARequest parseFrom(CodedInputStream codedInputStream) {
            return (RSARequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static RSARequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RSARequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static RSARequest parseFrom(InputStream inputStream) {
            return (RSARequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static RSARequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RSARequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RSARequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static RSARequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static RSARequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RSARequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<RSARequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RSARequest)) {
                return super.equals(obj);
            }
            RSARequest rSARequest = (RSARequest) obj;
            return getTimestamp() == rSARequest.getTimestamp() && getSign().equals(rSARequest.getSign()) && getFake1().equals(rSARequest.getFake1()) && getRandomStr().equals(rSARequest.getRandomStr()) && getFake2().equals(rSARequest.getFake2()) && getUnknownFields().equals(rSARequest.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RSARequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public String getFake1() {
            Object obj = this.fake1_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fake1_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public ByteString getFake1Bytes() {
            Object obj = this.fake1_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fake1_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public String getFake2() {
            Object obj = this.fake2_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fake2_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public ByteString getFake2Bytes() {
            Object obj = this.fake2_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fake2_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RSARequest> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public String getRandomStr() {
            Object obj = this.randomStr_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.randomStr_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public ByteString getRandomStrBytes() {
            Object obj = this.randomStr_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.randomStr_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.timestamp_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessage.isStringEmpty(this.sign_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.sign_);
            }
            if (!GeneratedMessage.isStringEmpty(this.fake1_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(3, this.fake1_);
            }
            if (!GeneratedMessage.isStringEmpty(this.randomStr_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(4, this.randomStr_);
            }
            if (!GeneratedMessage.isStringEmpty(this.fake2_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(5, this.fake2_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public String getSign() {
            Object obj = this.sign_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sign_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public ByteString getSignBytes() {
            Object obj = this.sign_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sign_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.RSARequestProto.RSARequestOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getFake2().hashCode() + ((((getRandomStr().hashCode() + ((((getFake1().hashCode() + ((((getSign().hashCode() + ((((Internal.hashLong(getTimestamp()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RSARequestProto.internal_static_com_base_model_proto_RSARequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RSARequest.class, Builder.class);
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
            long j = this.timestamp_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.sign_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.sign_);
            }
            if (!GeneratedMessage.isStringEmpty(this.fake1_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.fake1_);
            }
            if (!GeneratedMessage.isStringEmpty(this.randomStr_)) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.randomStr_);
            }
            if (!GeneratedMessage.isStringEmpty(this.fake2_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.fake2_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface RSARequestOrBuilder extends MessageOrBuilder {
        String getFake1();

        ByteString getFake1Bytes();

        String getFake2();

        ByteString getFake2Bytes();

        String getRandomStr();

        ByteString getRandomStrBytes();

        String getSign();

        ByteString getSignBytes();

        long getTimestamp();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", RSARequestProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010RSARequest.proto\u0012\u0014com.base.model.proto\"_\n\nRSARequest\u0012\u0011\n\ttimestamp\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004sign\u0018\u0002 \u0001(\t\u0012\r\n\u0005fake1\u0018\u0003 \u0001(\t\u0012\u0012\n\nrandom_str\u0018\u0004 \u0001(\t\u0012\r\n\u0005fake2\u0018\u0005 \u0001(\tB\u0011B\u000fRSARequestProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_RSARequest_descriptor = descriptor2;
        internal_static_com_base_model_proto_RSARequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Timestamp", "Sign", "Fake1", "RandomStr", "Fake2"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private RSARequestProto() {
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
