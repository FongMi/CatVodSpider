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
public final class RSAPublicProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_RSAPublic_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_RSAPublic_fieldAccessorTable;

    public final class RSAPublic extends GeneratedMessage implements RSAPublicOrBuilder {
        private static final RSAPublic DEFAULT_INSTANCE;
        private static final Parser<RSAPublic> PARSER;
        public static final int STR1_FIELD_NUMBER = 1;
        public static final int STR2_FIELD_NUMBER = 2;
        public static final int STR3_FIELD_NUMBER = 3;
        public static final int STR4_FIELD_NUMBER = 4;
        public static final int STR5_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object str1_;
        private volatile Object str2_;
        private volatile Object str3_;
        private volatile Object str4_;
        private volatile Object str5_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements RSAPublicOrBuilder {
            private int bitField0_;
            private Object str1_;
            private Object str2_;
            private Object str3_;
            private Object str4_;
            private Object str5_;

            private Builder() {
                this.str1_ = "";
                this.str2_ = "";
                this.str3_ = "";
                this.str4_ = "";
                this.str5_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.str1_ = "";
                this.str2_ = "";
                this.str3_ = "";
                this.str4_ = "";
                this.str5_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(RSAPublic rSAPublic) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    rSAPublic.str1_ = this.str1_;
                }
                if ((i & 2) != 0) {
                    rSAPublic.str2_ = this.str2_;
                }
                if ((i & 4) != 0) {
                    rSAPublic.str3_ = this.str3_;
                }
                if ((i & 8) != 0) {
                    rSAPublic.str4_ = this.str4_;
                }
                if ((i & 16) != 0) {
                    rSAPublic.str5_ = this.str5_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RSAPublicProto.internal_static_com_base_model_proto_RSAPublic_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RSAPublic build() {
                RSAPublic rSAPublicBuildPartial = buildPartial();
                if (rSAPublicBuildPartial.isInitialized()) {
                    return rSAPublicBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rSAPublicBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RSAPublic buildPartial() {
                RSAPublic rSAPublic = new RSAPublic(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(rSAPublic);
                }
                onBuilt();
                return rSAPublic;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.str1_ = "";
                this.str2_ = "";
                this.str3_ = "";
                this.str4_ = "";
                this.str5_ = "";
                return this;
            }

            public Builder clearStr1() {
                this.str1_ = RSAPublic.getDefaultInstance().getStr1();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStr2() {
                this.str2_ = RSAPublic.getDefaultInstance().getStr2();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearStr3() {
                this.str3_ = RSAPublic.getDefaultInstance().getStr3();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearStr4() {
                this.str4_ = RSAPublic.getDefaultInstance().getStr4();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearStr5() {
                this.str5_ = RSAPublic.getDefaultInstance().getStr5();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RSAPublic getDefaultInstanceForType() {
                return RSAPublic.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RSAPublicProto.internal_static_com_base_model_proto_RSAPublic_descriptor;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public String getStr1() {
                Object obj = this.str1_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.str1_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public ByteString getStr1Bytes() {
                Object obj = this.str1_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.str1_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public String getStr2() {
                Object obj = this.str2_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.str2_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public ByteString getStr2Bytes() {
                Object obj = this.str2_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.str2_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public String getStr3() {
                Object obj = this.str3_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.str3_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public ByteString getStr3Bytes() {
                Object obj = this.str3_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.str3_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public String getStr4() {
                Object obj = this.str4_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.str4_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public ByteString getStr4Bytes() {
                Object obj = this.str4_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.str4_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public String getStr5() {
                Object obj = this.str5_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.str5_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
            public ByteString getStr5Bytes() {
                Object obj = this.str5_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.str5_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return RSAPublicProto.internal_static_com_base_model_proto_RSAPublic_fieldAccessorTable.ensureFieldAccessorsInitialized(RSAPublic.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(RSAPublic rSAPublic) {
                if (rSAPublic == RSAPublic.getDefaultInstance()) {
                    return this;
                }
                if (!rSAPublic.getStr1().isEmpty()) {
                    this.str1_ = rSAPublic.str1_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!rSAPublic.getStr2().isEmpty()) {
                    this.str2_ = rSAPublic.str2_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!rSAPublic.getStr3().isEmpty()) {
                    this.str3_ = rSAPublic.str3_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!rSAPublic.getStr4().isEmpty()) {
                    this.str4_ = rSAPublic.str4_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!rSAPublic.getStr5().isEmpty()) {
                    this.str5_ = rSAPublic.str5_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(rSAPublic.getUnknownFields());
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
                                    this.str1_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.str2_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.str3_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.str4_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.str5_ = codedInputStream.readStringRequireUtf8();
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
                if (message instanceof RSAPublic) {
                    return mergeFrom((RSAPublic) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setStr1(String str) {
                str.getClass();
                this.str1_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStr1Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.str1_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStr2(String str) {
                str.getClass();
                this.str2_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStr2Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.str2_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStr3(String str) {
                str.getClass();
                this.str3_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStr3Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.str3_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStr4(String str) {
                str.getClass();
                this.str4_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStr4Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.str4_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStr5(String str) {
                str.getClass();
                this.str5_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStr5Bytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.str5_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", RSAPublic.class.getName());
            DEFAULT_INSTANCE = new RSAPublic();
            PARSER = new AbstractParser<RSAPublic>() { // from class: com.base.model.proto.RSAPublicProto.RSAPublic.1
                @Override // com.google.protobuf.Parser
                public RSAPublic parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = RSAPublic.newBuilder();
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

        private RSAPublic() {
            this.str1_ = "";
            this.str2_ = "";
            this.str3_ = "";
            this.str4_ = "";
            this.str5_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.str1_ = "";
            this.str2_ = "";
            this.str3_ = "";
            this.str4_ = "";
            this.str5_ = "";
        }

        public /* synthetic */ RSAPublic(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private RSAPublic(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.str1_ = "";
            this.str2_ = "";
            this.str3_ = "";
            this.str4_ = "";
            this.str5_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RSAPublic getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RSAPublicProto.internal_static_com_base_model_proto_RSAPublic_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(RSAPublic rSAPublic) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rSAPublic);
        }

        public static RSAPublic parseDelimitedFrom(InputStream inputStream) {
            return (RSAPublic) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RSAPublic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RSAPublic) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RSAPublic parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static RSAPublic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RSAPublic parseFrom(CodedInputStream codedInputStream) {
            return (RSAPublic) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static RSAPublic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RSAPublic) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static RSAPublic parseFrom(InputStream inputStream) {
            return (RSAPublic) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static RSAPublic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RSAPublic) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RSAPublic parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static RSAPublic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static RSAPublic parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RSAPublic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<RSAPublic> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RSAPublic)) {
                return super.equals(obj);
            }
            RSAPublic rSAPublic = (RSAPublic) obj;
            return getStr1().equals(rSAPublic.getStr1()) && getStr2().equals(rSAPublic.getStr2()) && getStr3().equals(rSAPublic.getStr3()) && getStr4().equals(rSAPublic.getStr4()) && getStr5().equals(rSAPublic.getStr5()) && getUnknownFields().equals(rSAPublic.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RSAPublic getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RSAPublic> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.str1_) ? GeneratedMessage.computeStringSize(1, this.str1_) : 0;
            if (!GeneratedMessage.isStringEmpty(this.str2_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.str2_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str3_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.str3_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str4_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.str4_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str5_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.str5_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public String getStr1() {
            Object obj = this.str1_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.str1_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public ByteString getStr1Bytes() {
            Object obj = this.str1_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.str1_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public String getStr2() {
            Object obj = this.str2_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.str2_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public ByteString getStr2Bytes() {
            Object obj = this.str2_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.str2_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public String getStr3() {
            Object obj = this.str3_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.str3_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public ByteString getStr3Bytes() {
            Object obj = this.str3_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.str3_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public String getStr4() {
            Object obj = this.str4_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.str4_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public ByteString getStr4Bytes() {
            Object obj = this.str4_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.str4_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public String getStr5() {
            Object obj = this.str5_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.str5_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.RSAPublicProto.RSAPublicOrBuilder
        public ByteString getStr5Bytes() {
            Object obj = this.str5_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.str5_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getStr5().hashCode() + ((((getStr4().hashCode() + ((((getStr3().hashCode() + ((((getStr2().hashCode() + ((((getStr1().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return RSAPublicProto.internal_static_com_base_model_proto_RSAPublic_fieldAccessorTable.ensureFieldAccessorsInitialized(RSAPublic.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.str1_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.str1_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str2_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.str2_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str3_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.str3_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str4_)) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.str4_);
            }
            if (!GeneratedMessage.isStringEmpty(this.str5_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.str5_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface RSAPublicOrBuilder extends MessageOrBuilder {
        String getStr1();

        ByteString getStr1Bytes();

        String getStr2();

        ByteString getStr2Bytes();

        String getStr3();

        ByteString getStr3Bytes();

        String getStr4();

        ByteString getStr4Bytes();

        String getStr5();

        ByteString getStr5Bytes();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", RSAPublicProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fRSAPublic.proto\u0012\u0014com.base.model.proto\"Q\n\tRSAPublic\u0012\f\n\u0004str1\u0018\u0001 \u0001(\t\u0012\f\n\u0004str2\u0018\u0002 \u0001(\t\u0012\f\n\u0004str3\u0018\u0003 \u0001(\t\u0012\f\n\u0004str4\u0018\u0004 \u0001(\t\u0012\f\n\u0004str5\u0018\u0005 \u0001(\tB\u0010B\u000eRSAPublicProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_RSAPublic_descriptor = descriptor2;
        internal_static_com_base_model_proto_RSAPublic_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Str1", "Str2", "Str3", "Str4", "Str5"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private RSAPublicProto() {
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
