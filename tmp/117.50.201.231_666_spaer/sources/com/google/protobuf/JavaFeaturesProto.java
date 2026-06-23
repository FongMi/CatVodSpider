package com.google.protobuf;

import com.github.catvod.spider.merge.A.a;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Internal;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class JavaFeaturesProto {
    public static final int JAVA_FIELD_NUMBER = 1001;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_pb_JavaFeatures_NestInFileClassFeature_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_pb_JavaFeatures_NestInFileClassFeature_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_pb_JavaFeatures_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_pb_JavaFeatures_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<DescriptorProtos.FeatureSet, JavaFeatures> java_;

    public final class JavaFeatures extends GeneratedMessage implements JavaFeaturesOrBuilder {
        private static final JavaFeatures DEFAULT_INSTANCE;
        public static final int LARGE_ENUM_FIELD_NUMBER = 3;
        public static final int LEGACY_CLOSED_ENUM_FIELD_NUMBER = 1;
        public static final int NEST_IN_FILE_CLASS_FIELD_NUMBER = 5;
        private static final Parser<JavaFeatures> PARSER;
        public static final int USE_OLD_OUTER_CLASSNAME_DEFAULT_FIELD_NUMBER = 4;
        public static final int UTF8_VALIDATION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean largeEnum_;
        private boolean legacyClosedEnum_;
        private byte memoizedIsInitialized;
        private int nestInFileClass_;
        private boolean useOldOuterClassnameDefault_;
        private int utf8Validation_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements JavaFeaturesOrBuilder {
            private int bitField0_;
            private boolean largeEnum_;
            private boolean legacyClosedEnum_;
            private int nestInFileClass_;
            private boolean useOldOuterClassnameDefault_;
            private int utf8Validation_;

            private Builder() {
                this.utf8Validation_ = 0;
                this.nestInFileClass_ = 0;
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.utf8Validation_ = 0;
                this.nestInFileClass_ = 0;
            }

            private void buildPartial0(JavaFeatures javaFeatures) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    javaFeatures.legacyClosedEnum_ = this.legacyClosedEnum_;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    javaFeatures.utf8Validation_ = this.utf8Validation_;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    javaFeatures.largeEnum_ = this.largeEnum_;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    javaFeatures.useOldOuterClassnameDefault_ = this.useOldOuterClassnameDefault_;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    javaFeatures.nestInFileClass_ = this.nestInFileClass_;
                    i |= 16;
                }
                JavaFeatures.access$1576(javaFeatures, i);
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return JavaFeaturesProto.internal_static_pb_JavaFeatures_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public JavaFeatures build() {
                JavaFeatures javaFeaturesBuildPartial = buildPartial();
                if (javaFeaturesBuildPartial.isInitialized()) {
                    return javaFeaturesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) javaFeaturesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public JavaFeatures buildPartial() {
                JavaFeatures javaFeatures = new JavaFeatures(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(javaFeatures);
                }
                onBuilt();
                return javaFeatures;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.legacyClosedEnum_ = false;
                this.utf8Validation_ = 0;
                this.largeEnum_ = false;
                this.useOldOuterClassnameDefault_ = false;
                this.nestInFileClass_ = 0;
                return this;
            }

            public Builder clearLargeEnum() {
                this.bitField0_ &= -5;
                this.largeEnum_ = false;
                onChanged();
                return this;
            }

            public Builder clearLegacyClosedEnum() {
                this.bitField0_ &= -2;
                this.legacyClosedEnum_ = false;
                onChanged();
                return this;
            }

            public Builder clearNestInFileClass() {
                this.bitField0_ &= -17;
                this.nestInFileClass_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUseOldOuterClassnameDefault() {
                this.bitField0_ &= -9;
                this.useOldOuterClassnameDefault_ = false;
                onChanged();
                return this;
            }

            public Builder clearUtf8Validation() {
                this.bitField0_ &= -3;
                this.utf8Validation_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public JavaFeatures getDefaultInstanceForType() {
                return JavaFeatures.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return JavaFeaturesProto.internal_static_pb_JavaFeatures_descriptor;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean getLargeEnum() {
                return this.largeEnum_;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean getLegacyClosedEnum() {
                return this.legacyClosedEnum_;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
                NestInFileClassFeature.NestInFileClass nestInFileClassForNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
                return nestInFileClassForNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : nestInFileClassForNumber;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean getUseOldOuterClassnameDefault() {
                return this.useOldOuterClassnameDefault_;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public Utf8Validation getUtf8Validation() {
                Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
                return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasLargeEnum() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasLegacyClosedEnum() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasNestInFileClass() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasUseOldOuterClassnameDefault() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
            public boolean hasUtf8Validation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return JavaFeaturesProto.internal_static_pb_JavaFeatures_fieldAccessorTable.ensureFieldAccessorsInitialized(JavaFeatures.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
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
                                    this.legacyClosedEnum_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i = codedInputStream.readEnum();
                                    if (Utf8Validation.forNumber(i) == null) {
                                        mergeUnknownVarintField(2, i);
                                    } else {
                                        this.utf8Validation_ = i;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.largeEnum_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.useOldOuterClassnameDefault_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    int i2 = codedInputStream.readEnum();
                                    if (NestInFileClassFeature.NestInFileClass.forNumber(i2) == null) {
                                        mergeUnknownVarintField(5, i2);
                                    } else {
                                        this.nestInFileClass_ = i2;
                                        this.bitField0_ |= 16;
                                    }
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

            public Builder mergeFrom(JavaFeatures javaFeatures) {
                if (javaFeatures == JavaFeatures.getDefaultInstance()) {
                    return this;
                }
                if (javaFeatures.hasLegacyClosedEnum()) {
                    setLegacyClosedEnum(javaFeatures.getLegacyClosedEnum());
                }
                if (javaFeatures.hasUtf8Validation()) {
                    setUtf8Validation(javaFeatures.getUtf8Validation());
                }
                if (javaFeatures.hasLargeEnum()) {
                    setLargeEnum(javaFeatures.getLargeEnum());
                }
                if (javaFeatures.hasUseOldOuterClassnameDefault()) {
                    setUseOldOuterClassnameDefault(javaFeatures.getUseOldOuterClassnameDefault());
                }
                if (javaFeatures.hasNestInFileClass()) {
                    setNestInFileClass(javaFeatures.getNestInFileClass());
                }
                mergeUnknownFields(javaFeatures.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof JavaFeatures) {
                    return mergeFrom((JavaFeatures) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setLargeEnum(boolean z) {
                this.largeEnum_ = z;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLegacyClosedEnum(boolean z) {
                this.legacyClosedEnum_ = z;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNestInFileClass(NestInFileClassFeature.NestInFileClass nestInFileClass) {
                nestInFileClass.getClass();
                this.bitField0_ |= 16;
                this.nestInFileClass_ = nestInFileClass.getNumber();
                onChanged();
                return this;
            }

            public Builder setUseOldOuterClassnameDefault(boolean z) {
                this.useOldOuterClassnameDefault_ = z;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUtf8Validation(Utf8Validation utf8Validation) {
                utf8Validation.getClass();
                this.bitField0_ |= 2;
                this.utf8Validation_ = utf8Validation.getNumber();
                onChanged();
                return this;
            }
        }

        public final class NestInFileClassFeature extends GeneratedMessage implements NestInFileClassFeatureOrBuilder {
            private static final NestInFileClassFeature DEFAULT_INSTANCE;
            private static final Parser<NestInFileClassFeature> PARSER;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;

            public final class Builder extends GeneratedMessage.Builder<Builder> implements NestInFileClassFeatureOrBuilder {
                private Builder() {
                }

                private Builder(AbstractMessage.BuilderParent builderParent) {
                    super(builderParent);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return JavaFeaturesProto.internal_static_pb_JavaFeatures_NestInFileClassFeature_descriptor;
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public NestInFileClassFeature build() {
                    NestInFileClassFeature nestInFileClassFeatureBuildPartial = buildPartial();
                    if (nestInFileClassFeatureBuildPartial.isInitialized()) {
                        return nestInFileClassFeatureBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) nestInFileClassFeatureBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public NestInFileClassFeature buildPartial() {
                    NestInFileClassFeature nestInFileClassFeature = new NestInFileClassFeature(this);
                    onBuilt();
                    return nestInFileClassFeature;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public NestInFileClassFeature getDefaultInstanceForType() {
                    return NestInFileClassFeature.getDefaultInstance();
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return JavaFeaturesProto.internal_static_pb_JavaFeatures_NestInFileClassFeature_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                    return JavaFeaturesProto.internal_static_pb_JavaFeatures_NestInFileClassFeature_fieldAccessorTable.ensureFieldAccessorsInitialized(NestInFileClassFeature.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    z = true;
                                }
                            } catch (InvalidProtocolBufferException e) {
                                throw e.unwrapIOException();
                            }
                        } finally {
                            onChanged();
                        }
                    }
                    return this;
                }

                public Builder mergeFrom(NestInFileClassFeature nestInFileClassFeature) {
                    if (nestInFileClassFeature == NestInFileClassFeature.getDefaultInstance()) {
                        return this;
                    }
                    mergeUnknownFields(nestInFileClassFeature.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof NestInFileClassFeature) {
                        return mergeFrom((NestInFileClassFeature) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }
            }

            public enum NestInFileClass implements ProtocolMessageEnum {
                NEST_IN_FILE_CLASS_UNKNOWN(0),
                NO(1),
                YES(2),
                LEGACY(3);

                public static final int LEGACY_VALUE = 3;
                public static final int NEST_IN_FILE_CLASS_UNKNOWN_VALUE = 0;
                public static final int NO_VALUE = 1;
                private static final NestInFileClass[] VALUES;
                public static final int YES_VALUE = 2;
                private static final Internal.EnumLiteMap<NestInFileClass> internalValueMap;
                private final int value;

                static {
                    RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", NestInFileClass.class.getName());
                    internalValueMap = new Internal.EnumLiteMap<NestInFileClass>() { // from class: com.google.protobuf.JavaFeaturesProto.JavaFeatures.NestInFileClassFeature.NestInFileClass.1
                        @Override // com.google.protobuf.Internal.EnumLiteMap
                        public NestInFileClass findValueByNumber(int i) {
                            return NestInFileClass.forNumber(i);
                        }
                    };
                    VALUES = values();
                }

                NestInFileClass(int i) {
                    this.value = i;
                }

                public static NestInFileClass forNumber(int i) {
                    if (i == 0) {
                        return NEST_IN_FILE_CLASS_UNKNOWN;
                    }
                    if (i == 1) {
                        return NO;
                    }
                    if (i == 2) {
                        return YES;
                    }
                    if (i != 3) {
                        return null;
                    }
                    return LEGACY;
                }

                public static Descriptors.EnumDescriptor getDescriptor() {
                    return NestInFileClassFeature.getDescriptor().getEnumTypes().get(0);
                }

                public static Internal.EnumLiteMap<NestInFileClass> internalGetValueMap() {
                    return internalValueMap;
                }

                @Deprecated
                public static NestInFileClass valueOf(int i) {
                    return forNumber(i);
                }

                public static NestInFileClass valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                    if (enumValueDescriptor.getType() == getDescriptor()) {
                        return VALUES[enumValueDescriptor.getIndex()];
                    }
                    throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
                }

                @Override // com.google.protobuf.ProtocolMessageEnum
                public final Descriptors.EnumDescriptor getDescriptorForType() {
                    return getDescriptor();
                }

                @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                @Override // com.google.protobuf.ProtocolMessageEnum
                public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                    return getDescriptor().getValues().get(ordinal());
                }
            }

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", NestInFileClassFeature.class.getName());
                DEFAULT_INSTANCE = new NestInFileClassFeature();
                PARSER = new AbstractParser<NestInFileClassFeature>() { // from class: com.google.protobuf.JavaFeaturesProto.JavaFeatures.NestInFileClassFeature.1
                    @Override // com.google.protobuf.Parser
                    public NestInFileClassFeature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        Builder builderNewBuilder = NestInFileClassFeature.newBuilder();
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

            private NestInFileClassFeature() {
                this.memoizedIsInitialized = (byte) -1;
            }

            private NestInFileClassFeature(GeneratedMessage.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static NestInFileClassFeature getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return JavaFeaturesProto.internal_static_pb_JavaFeatures_NestInFileClassFeature_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(NestInFileClassFeature nestInFileClassFeature) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nestInFileClassFeature);
            }

            public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream) {
                return (NestInFileClassFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NestInFileClassFeature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NestInFileClassFeature) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static NestInFileClassFeature parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static NestInFileClassFeature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static NestInFileClassFeature parseFrom(CodedInputStream codedInputStream) {
                return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
            }

            public static NestInFileClassFeature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public static NestInFileClassFeature parseFrom(InputStream inputStream) {
                return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream);
            }

            public static NestInFileClassFeature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (NestInFileClassFeature) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static NestInFileClassFeature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static NestInFileClassFeature parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static NestInFileClassFeature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Parser<NestInFileClassFeature> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return !(obj instanceof NestInFileClassFeature) ? super.equals(obj) : getUnknownFields().equals(((NestInFileClassFeature) obj).getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NestInFileClassFeature getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<NestInFileClassFeature> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int serializedSize = getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i = this.memoizedHashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessage
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return JavaFeaturesProto.internal_static_pb_JavaFeatures_NestInFileClassFeature_fieldAccessorTable.ensureFieldAccessorsInitialized(NestInFileClassFeature.class, Builder.class);
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
                return new Builder(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getUnknownFields().writeTo(codedOutputStream);
            }
        }

        public interface NestInFileClassFeatureOrBuilder extends MessageOrBuilder {
        }

        public enum Utf8Validation implements ProtocolMessageEnum {
            UTF8_VALIDATION_UNKNOWN(0),
            DEFAULT(1),
            VERIFY(2);

            public static final int DEFAULT_VALUE = 1;
            public static final int UTF8_VALIDATION_UNKNOWN_VALUE = 0;
            private static final Utf8Validation[] VALUES;
            public static final int VERIFY_VALUE = 2;
            private static final Internal.EnumLiteMap<Utf8Validation> internalValueMap;
            private final int value;

            static {
                RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", Utf8Validation.class.getName());
                internalValueMap = new Internal.EnumLiteMap<Utf8Validation>() { // from class: com.google.protobuf.JavaFeaturesProto.JavaFeatures.Utf8Validation.1
                    @Override // com.google.protobuf.Internal.EnumLiteMap
                    public Utf8Validation findValueByNumber(int i) {
                        return Utf8Validation.forNumber(i);
                    }
                };
                VALUES = values();
            }

            Utf8Validation(int i) {
                this.value = i;
            }

            public static Utf8Validation forNumber(int i) {
                if (i == 0) {
                    return UTF8_VALIDATION_UNKNOWN;
                }
                if (i == 1) {
                    return DEFAULT;
                }
                if (i != 2) {
                    return null;
                }
                return VERIFY;
            }

            public static Descriptors.EnumDescriptor getDescriptor() {
                return JavaFeatures.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Utf8Validation> internalGetValueMap() {
                return internalValueMap;
            }

            @Deprecated
            public static Utf8Validation valueOf(int i) {
                return forNumber(i);
            }

            public static Utf8Validation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", JavaFeatures.class.getName());
            DEFAULT_INSTANCE = new JavaFeatures();
            PARSER = new AbstractParser<JavaFeatures>() { // from class: com.google.protobuf.JavaFeaturesProto.JavaFeatures.1
                @Override // com.google.protobuf.Parser
                public JavaFeatures parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = JavaFeatures.newBuilder();
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

        private JavaFeatures() {
            this.legacyClosedEnum_ = false;
            this.largeEnum_ = false;
            this.useOldOuterClassnameDefault_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.utf8Validation_ = 0;
            this.nestInFileClass_ = 0;
        }

        private JavaFeatures(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.legacyClosedEnum_ = false;
            this.utf8Validation_ = 0;
            this.largeEnum_ = false;
            this.useOldOuterClassnameDefault_ = false;
            this.nestInFileClass_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static /* synthetic */ int access$1576(JavaFeatures javaFeatures, int i) {
            int i2 = i | javaFeatures.bitField0_;
            javaFeatures.bitField0_ = i2;
            return i2;
        }

        public static JavaFeatures getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return JavaFeaturesProto.internal_static_pb_JavaFeatures_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(JavaFeatures javaFeatures) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(javaFeatures);
        }

        public static JavaFeatures parseDelimitedFrom(InputStream inputStream) {
            return (JavaFeatures) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static JavaFeatures parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (JavaFeatures) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static JavaFeatures parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static JavaFeatures parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static JavaFeatures parseFrom(CodedInputStream codedInputStream) {
            return (JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static JavaFeatures parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static JavaFeatures parseFrom(InputStream inputStream) {
            return (JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static JavaFeatures parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (JavaFeatures) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static JavaFeatures parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static JavaFeatures parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static JavaFeatures parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static JavaFeatures parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<JavaFeatures> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof JavaFeatures)) {
                return super.equals(obj);
            }
            JavaFeatures javaFeatures = (JavaFeatures) obj;
            if (hasLegacyClosedEnum() != javaFeatures.hasLegacyClosedEnum()) {
                return false;
            }
            if ((hasLegacyClosedEnum() && getLegacyClosedEnum() != javaFeatures.getLegacyClosedEnum()) || hasUtf8Validation() != javaFeatures.hasUtf8Validation()) {
                return false;
            }
            if ((hasUtf8Validation() && this.utf8Validation_ != javaFeatures.utf8Validation_) || hasLargeEnum() != javaFeatures.hasLargeEnum()) {
                return false;
            }
            if ((hasLargeEnum() && getLargeEnum() != javaFeatures.getLargeEnum()) || hasUseOldOuterClassnameDefault() != javaFeatures.hasUseOldOuterClassnameDefault()) {
                return false;
            }
            if ((!hasUseOldOuterClassnameDefault() || getUseOldOuterClassnameDefault() == javaFeatures.getUseOldOuterClassnameDefault()) && hasNestInFileClass() == javaFeatures.hasNestInFileClass()) {
                return (!hasNestInFileClass() || this.nestInFileClass_ == javaFeatures.nestInFileClass_) && getUnknownFields().equals(javaFeatures.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public JavaFeatures getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean getLargeEnum() {
            return this.largeEnum_;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean getLegacyClosedEnum() {
            return this.legacyClosedEnum_;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public NestInFileClassFeature.NestInFileClass getNestInFileClass() {
            NestInFileClassFeature.NestInFileClass nestInFileClassForNumber = NestInFileClassFeature.NestInFileClass.forNumber(this.nestInFileClass_);
            return nestInFileClassForNumber == null ? NestInFileClassFeature.NestInFileClass.NEST_IN_FILE_CLASS_UNKNOWN : nestInFileClassForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<JavaFeatures> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.legacyClosedEnum_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(2, this.utf8Validation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.largeEnum_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.useOldOuterClassnameDefault_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += CodedOutputStream.computeEnumSize(5, this.nestInFileClass_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean getUseOldOuterClassnameDefault() {
            return this.useOldOuterClassnameDefault_;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public Utf8Validation getUtf8Validation() {
            Utf8Validation utf8ValidationForNumber = Utf8Validation.forNumber(this.utf8Validation_);
            return utf8ValidationForNumber == null ? Utf8Validation.UTF8_VALIDATION_UNKNOWN : utf8ValidationForNumber;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasLargeEnum() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasLegacyClosedEnum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasNestInFileClass() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasUseOldOuterClassnameDefault() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.JavaFeaturesProto.JavaFeaturesOrBuilder
        public boolean hasUtf8Validation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLegacyClosedEnum()) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + Internal.hashBoolean(getLegacyClosedEnum());
            }
            if (hasUtf8Validation()) {
                iHashCode = a.a(iHashCode, 37, 2, 53) + this.utf8Validation_;
            }
            if (hasLargeEnum()) {
                iHashCode = a.a(iHashCode, 37, 3, 53) + Internal.hashBoolean(getLargeEnum());
            }
            if (hasUseOldOuterClassnameDefault()) {
                iHashCode = a.a(iHashCode, 37, 4, 53) + Internal.hashBoolean(getUseOldOuterClassnameDefault());
            }
            if (hasNestInFileClass()) {
                iHashCode = a.a(iHashCode, 37, 5, 53) + this.nestInFileClass_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return JavaFeaturesProto.internal_static_pb_JavaFeatures_fieldAccessorTable.ensureFieldAccessorsInitialized(JavaFeatures.class, Builder.class);
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
            return new Builder(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.legacyClosedEnum_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.utf8Validation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.largeEnum_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.useOldOuterClassnameDefault_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.nestInFileClass_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface JavaFeaturesOrBuilder extends MessageOrBuilder {
        boolean getLargeEnum();

        boolean getLegacyClosedEnum();

        JavaFeatures.NestInFileClassFeature.NestInFileClass getNestInFileClass();

        boolean getUseOldOuterClassnameDefault();

        JavaFeatures.Utf8Validation getUtf8Validation();

        boolean hasLargeEnum();

        boolean hasLegacyClosedEnum();

        boolean hasNestInFileClass();

        boolean hasUseOldOuterClassnameDefault();

        boolean hasUtf8Validation();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", JavaFeaturesProto.class.getName());
        GeneratedMessage.GeneratedExtension<DescriptorProtos.FeatureSet, JavaFeatures> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(JavaFeatures.class, JavaFeatures.getDefaultInstance());
        java_ = generatedExtensionNewFileScopedGeneratedExtension;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#google/protobuf/java_features.proto\u0012\u0002pb\u001a google/protobuf/descriptor.proto\"Ù\b\n\fJavaFeatures\u0012\u0090\u0002\n\u0012legacy_closed_enum\u0018\u0001 \u0001(\bBá\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\t\u0012\u0004true\u0018\u0084\u0007¢\u0001\n\u0012\u0005false\u0018ç\u0007²\u0001»\u0001\bè\u0007\u0010è\u0007\u001a²\u0001The legacy closed enum behavior in Java is deprecated and is scheduled to be removed in edition 2025.  See http://protobuf.dev/programming-guides/enum/#java for more information.R\u0010legacyClosedEnum\u0012¯\u0002\n\u000futf8_validation\u0018\u0002 \u0001(\u000e2\u001f.pb.JavaFeatures.Utf8ValidationBä\u0001\u0088\u0001\u0001\u0098\u0001\u0004\u0098\u0001\u0001¢\u0001\f\u0012\u0007DEFAULT\u0018\u0084\u0007²\u0001È\u0001\bè\u0007\u0010é\u0007\u001a¿\u0001The Java-specific utf8 validation feature is deprecated and is scheduled to be removed in edition 2025.  Utf8 validation behavior should use the global cross-language utf8_validation feature.R\u000eutf8Validation\u0012;\n\nlarge_enum\u0018\u0003 \u0001(\bB\u001c\u0088\u0001\u0001\u0098\u0001\u0006\u0098\u0001\u0001¢\u0001\n\u0012\u0005false\u0018\u0084\u0007²\u0001\u0003\bé\u0007R\tlargeEnum\u0012n\n\u001fuse_old_outer_classname_default\u0018\u0004 \u0001(\bB(\u0088\u0001\u0001\u0098\u0001\u0001¢\u0001\t\u0012\u0004true\u0018\u0084\u0007¢\u0001\n\u0012\u0005false\u0018é\u0007²\u0001\u0006\bé\u0007 é\u0007R\u001buseOldOuterClassnameDefault\u0012\u0090\u0001\n\u0012nest_in_file_class\u0018\u0005 \u0001(\u000e27.pb.JavaFeatures.NestInFileClassFeature.NestInFileClassB*\u0088\u0001\u0002\u0098\u0001\u0003\u0098\u0001\u0006\u0098\u0001\b¢\u0001\u000b\u0012\u0006LEGACY\u0018\u0084\u0007¢\u0001\u0007\u0012\u0002NO\u0018é\u0007²\u0001\u0003\bé\u0007R\u000fnestInFileClass\u001a|\n\u0016NestInFileClassFeature\"X\n\u000fNestInFileClass\u0012\u001e\n\u001aNEST_IN_FILE_CLASS_UNKNOWN\u0010\u0000\u0012\u0006\n\u0002NO\u0010\u0001\u0012\u0007\n\u0003YES\u0010\u0002\u0012\u0014\n\u0006LEGACY\u0010\u0003\u001a\b\"\u0006\bé\u0007 é\u0007J\b\b\u0001\u0010\u0080\u0080\u0080\u0080\u0002\"F\n\u000eUtf8Validation\u0012\u001b\n\u0017UTF8_VALIDATION_UNKNOWN\u0010\u0000\u0012\u000b\n\u0007DEFAULT\u0010\u0001\u0012\n\n\u0006VERIFY\u0010\u0002:B\n\u0004java\u0012\u001b.google.protobuf.FeatureSet\u0018é\u0007 \u0001(\u000b2\u0010.pb.JavaFeaturesR\u0004javaB(\n\u0013com.google.protobufB\u0011JavaFeaturesProto"}, new Descriptors.FileDescriptor[]{DescriptorProtos.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_pb_JavaFeatures_descriptor = descriptor2;
        internal_static_pb_JavaFeatures_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"LegacyClosedEnum", "Utf8Validation", "LargeEnum", "UseOldOuterClassnameDefault", "NestInFileClass"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_pb_JavaFeatures_NestInFileClassFeature_descriptor = descriptor3;
        internal_static_pb_JavaFeatures_NestInFileClassFeature_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[0]);
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        descriptor.resolveAllFeaturesImmutable();
        DescriptorProtos.getDescriptor();
    }

    private JavaFeaturesProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(java_);
    }
}
