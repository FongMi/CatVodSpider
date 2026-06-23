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
public final class SecureRequestProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_SecureRequest_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_SecureRequest_fieldAccessorTable;

    public final class SecureRequest extends GeneratedMessage implements SecureRequestOrBuilder {
        public static final int AES_ENCRYPT1_FIELD_NUMBER = 1;
        public static final int AES_ENCRYPT2_FIELD_NUMBER = 2;
        public static final int AES_FAKESTR_FIELD_NUMBER = 3;
        private static final SecureRequest DEFAULT_INSTANCE;
        private static final Parser<SecureRequest> PARSER;
        public static final int RANDOM_STR_FIELD_NUMBER = 5;
        public static final int TIMESTAMP_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private volatile Object aesEncrypt1_;
        private volatile Object aesEncrypt2_;
        private volatile Object aesFakestr_;
        private byte memoizedIsInitialized;
        private volatile Object randomStr_;
        private long timestamp_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements SecureRequestOrBuilder {
            private Object aesEncrypt1_;
            private Object aesEncrypt2_;
            private Object aesFakestr_;
            private int bitField0_;
            private Object randomStr_;
            private long timestamp_;

            private Builder() {
                this.aesEncrypt1_ = "";
                this.aesEncrypt2_ = "";
                this.aesFakestr_ = "";
                this.randomStr_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.aesEncrypt1_ = "";
                this.aesEncrypt2_ = "";
                this.aesFakestr_ = "";
                this.randomStr_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(SecureRequest secureRequest) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    secureRequest.aesEncrypt1_ = this.aesEncrypt1_;
                }
                if ((i & 2) != 0) {
                    secureRequest.aesEncrypt2_ = this.aesEncrypt2_;
                }
                if ((i & 4) != 0) {
                    secureRequest.aesFakestr_ = this.aesFakestr_;
                }
                if ((i & 8) != 0) {
                    secureRequest.timestamp_ = this.timestamp_;
                }
                if ((i & 16) != 0) {
                    secureRequest.randomStr_ = this.randomStr_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureRequestProto.internal_static_com_base_model_proto_SecureRequest_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SecureRequest build() {
                SecureRequest secureRequestBuildPartial = buildPartial();
                if (secureRequestBuildPartial.isInitialized()) {
                    return secureRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) secureRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SecureRequest buildPartial() {
                SecureRequest secureRequest = new SecureRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(secureRequest);
                }
                onBuilt();
                return secureRequest;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.aesEncrypt1_ = "";
                this.aesEncrypt2_ = "";
                this.aesFakestr_ = "";
                this.timestamp_ = 0L;
                this.randomStr_ = "";
                return this;
            }

            public Builder clearAesEncrypt1() {
                this.aesEncrypt1_ = SecureRequest.getDefaultInstance().getAesEncrypt1();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearAesEncrypt2() {
                this.aesEncrypt2_ = SecureRequest.getDefaultInstance().getAesEncrypt2();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearAesFakestr() {
                this.aesFakestr_ = SecureRequest.getDefaultInstance().getAesFakestr();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRandomStr() {
                this.randomStr_ = SecureRequest.getDefaultInstance().getRandomStr();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -9;
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public String getAesEncrypt1() {
                Object obj = this.aesEncrypt1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.aesEncrypt1_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public ByteString getAesEncrypt1Bytes() {
                Object obj = this.aesEncrypt1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.aesEncrypt1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public String getAesEncrypt2() {
                Object obj = this.aesEncrypt2_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.aesEncrypt2_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public ByteString getAesEncrypt2Bytes() {
                Object obj = this.aesEncrypt2_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.aesEncrypt2_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public String getAesFakestr() {
                Object obj = this.aesFakestr_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.aesFakestr_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public ByteString getAesFakestrBytes() {
                Object obj = this.aesFakestr_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.aesFakestr_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SecureRequest getDefaultInstanceForType() {
                return SecureRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureRequestProto.internal_static_com_base_model_proto_SecureRequest_descriptor;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public String getRandomStr() {
                Object obj = this.randomStr_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.randomStr_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public ByteString getRandomStrBytes() {
                Object obj = this.randomStr_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.randomStr_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureRequestProto.internal_static_com_base_model_proto_SecureRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SecureRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SecureRequest secureRequest) {
                if (secureRequest == SecureRequest.getDefaultInstance()) {
                    return this;
                }
                if (!secureRequest.getAesEncrypt1().isEmpty()) {
                    this.aesEncrypt1_ = secureRequest.aesEncrypt1_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!secureRequest.getAesEncrypt2().isEmpty()) {
                    this.aesEncrypt2_ = secureRequest.aesEncrypt2_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!secureRequest.getAesFakestr().isEmpty()) {
                    this.aesFakestr_ = secureRequest.aesFakestr_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (secureRequest.getTimestamp() != 0) {
                    setTimestamp(secureRequest.getTimestamp());
                }
                if (!secureRequest.getRandomStr().isEmpty()) {
                    this.randomStr_ = secureRequest.randomStr_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(secureRequest.getUnknownFields());
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
                                    this.aesEncrypt1_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.aesEncrypt2_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.aesFakestr_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.timestamp_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.randomStr_ = codedInputStream.readStringRequireUtf8();
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
                if (message instanceof SecureRequest) {
                    return mergeFrom((SecureRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAesEncrypt1(String str) {
                str.getClass();
                this.aesEncrypt1_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAesEncrypt1Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.aesEncrypt1_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAesEncrypt2(String str) {
                str.getClass();
                this.aesEncrypt2_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAesEncrypt2Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.aesEncrypt2_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAesFakestr(String str) {
                str.getClass();
                this.aesFakestr_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAesFakestrBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.aesFakestr_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRandomStr(String str) {
                str.getClass();
                this.randomStr_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRandomStrBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.randomStr_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j) {
                this.timestamp_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", SecureRequest.class.getName());
            DEFAULT_INSTANCE = new SecureRequest();
            PARSER = new AbstractParser<SecureRequest>() { // from class: com.base.model.proto.SecureRequestProto.SecureRequest.1
                @Override // com.google.protobuf.Parser
                public SecureRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SecureRequest.newBuilder();
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

        private SecureRequest() {
            this.aesEncrypt1_ = "";
            this.aesEncrypt2_ = "";
            this.aesFakestr_ = "";
            this.timestamp_ = 0L;
            this.randomStr_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.aesEncrypt1_ = "";
            this.aesEncrypt2_ = "";
            this.aesFakestr_ = "";
            this.randomStr_ = "";
        }

        public /* synthetic */ SecureRequest(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private SecureRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.aesEncrypt1_ = "";
            this.aesEncrypt2_ = "";
            this.aesFakestr_ = "";
            this.timestamp_ = 0L;
            this.randomStr_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SecureRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureRequestProto.internal_static_com_base_model_proto_SecureRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SecureRequest secureRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(secureRequest);
        }

        public static SecureRequest parseDelimitedFrom(InputStream inputStream) {
            return (SecureRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SecureRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureRequest) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SecureRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static SecureRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SecureRequest parseFrom(CodedInputStream codedInputStream) {
            return (SecureRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SecureRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureRequest) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static SecureRequest parseFrom(InputStream inputStream) {
            return (SecureRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SecureRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SecureRequest) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SecureRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SecureRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SecureRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SecureRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<SecureRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SecureRequest)) {
                return super.equals(obj);
            }
            SecureRequest secureRequest = (SecureRequest) obj;
            return getAesEncrypt1().equals(secureRequest.getAesEncrypt1()) && getAesEncrypt2().equals(secureRequest.getAesEncrypt2()) && getAesFakestr().equals(secureRequest.getAesFakestr()) && getTimestamp() == secureRequest.getTimestamp() && getRandomStr().equals(secureRequest.getRandomStr()) && getUnknownFields().equals(secureRequest.getUnknownFields());
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public String getAesEncrypt1() {
            Object obj = this.aesEncrypt1_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.aesEncrypt1_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public ByteString getAesEncrypt1Bytes() {
            Object obj = this.aesEncrypt1_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aesEncrypt1_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public String getAesEncrypt2() {
            Object obj = this.aesEncrypt2_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.aesEncrypt2_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public ByteString getAesEncrypt2Bytes() {
            Object obj = this.aesEncrypt2_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aesEncrypt2_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public String getAesFakestr() {
            Object obj = this.aesFakestr_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.aesFakestr_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public ByteString getAesFakestrBytes() {
            Object obj = this.aesFakestr_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.aesFakestr_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SecureRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SecureRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public String getRandomStr() {
            Object obj = this.randomStr_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.randomStr_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
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
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.aesEncrypt1_) ? GeneratedMessage.computeStringSize(1, this.aesEncrypt1_) : 0;
            if (!GeneratedMessage.isStringEmpty(this.aesEncrypt2_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.aesEncrypt2_);
            }
            if (!GeneratedMessage.isStringEmpty(this.aesFakestr_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.aesFakestr_);
            }
            long j = this.timestamp_;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(4, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.randomStr_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.randomStr_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.SecureRequestProto.SecureRequestOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getRandomStr().hashCode() + ((((Internal.hashLong(getTimestamp()) + ((((getAesFakestr().hashCode() + ((((getAesEncrypt2().hashCode() + ((((getAesEncrypt1().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureRequestProto.internal_static_com_base_model_proto_SecureRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SecureRequest.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.aesEncrypt1_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.aesEncrypt1_);
            }
            if (!GeneratedMessage.isStringEmpty(this.aesEncrypt2_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.aesEncrypt2_);
            }
            if (!GeneratedMessage.isStringEmpty(this.aesFakestr_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.aesFakestr_);
            }
            long j = this.timestamp_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.randomStr_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.randomStr_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface SecureRequestOrBuilder extends MessageOrBuilder {
        String getAesEncrypt1();

        ByteString getAesEncrypt1Bytes();

        String getAesEncrypt2();

        ByteString getAesEncrypt2Bytes();

        String getAesFakestr();

        ByteString getAesFakestrBytes();

        String getRandomStr();

        ByteString getRandomStrBytes();

        long getTimestamp();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", SecureRequestProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013SecureRequest.proto\u0012\u0014com.base.model.proto\"w\n\rSecureRequest\u0012\u0014\n\faes_encrypt1\u0018\u0001 \u0001(\t\u0012\u0014\n\faes_encrypt2\u0018\u0002 \u0001(\t\u0012\u0013\n\u000baes_fakestr\u0018\u0003 \u0001(\t\u0012\u0011\n\ttimestamp\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nrandom_str\u0018\u0005 \u0001(\tB\u0014B\u0012SecureRequestProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_SecureRequest_descriptor = descriptor2;
        internal_static_com_base_model_proto_SecureRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"AesEncrypt1", "AesEncrypt2", "AesFakestr", "Timestamp", "RandomStr"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private SecureRequestProto() {
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
