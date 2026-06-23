package com.base.model.proto;

import com.base.model.proto.DramaProto;
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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class SectionProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_SectionBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_SectionBean_fieldAccessorTable;

    public final class SectionBean extends GeneratedMessage implements SectionBeanOrBuilder {
        public static final int CARD_STYLE_FIELD_NUMBER = 2;
        private static final SectionBean DEFAULT_INSTANCE;
        public static final int FROM_FIELD_NUMBER = 4;
        public static final int MAX_ROW_FIELD_NUMBER = 3;
        private static final Parser<SectionBean> PARSER;
        public static final int SECTION_NAME_FIELD_NUMBER = 1;
        public static final int TYPE_ID_FIELD_NUMBER = 6;
        public static final int VODLIST_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int cardStyle_;
        private volatile Object from_;
        private int maxRow_;
        private byte memoizedIsInitialized;
        private volatile Object sectionName_;
        private int typeId_;
        private List<DramaProto.DramaBean> vodList_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements SectionBeanOrBuilder {
            private int bitField0_;
            private int cardStyle_;
            private Object from_;
            private int maxRow_;
            private Object sectionName_;
            private int typeId_;
            private RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> vodListBuilder_;
            private List<DramaProto.DramaBean> vodList_;

            private Builder() {
                this.sectionName_ = "";
                this.from_ = "";
                this.vodList_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.sectionName_ = "";
                this.from_ = "";
                this.vodList_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(SectionBean sectionBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    sectionBean.sectionName_ = this.sectionName_;
                }
                if ((i & 2) != 0) {
                    sectionBean.cardStyle_ = this.cardStyle_;
                }
                if ((i & 4) != 0) {
                    sectionBean.maxRow_ = this.maxRow_;
                }
                if ((i & 8) != 0) {
                    sectionBean.from_ = this.from_;
                }
                if ((i & 32) != 0) {
                    sectionBean.typeId_ = this.typeId_;
                }
            }

            private void buildPartialRepeatedFields(SectionBean sectionBean) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder != null) {
                    sectionBean.vodList_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.vodList_ = Collections.unmodifiableList(this.vodList_);
                    this.bitField0_ &= -17;
                }
                sectionBean.vodList_ = this.vodList_;
            }

            private void ensureVodListIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.vodList_ = new ArrayList(this.vodList_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SectionProto.internal_static_com_base_model_proto_SectionBean_descriptor;
            }

            private RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> internalGetVodListFieldBuilder() {
                if (this.vodListBuilder_ == null) {
                    this.vodListBuilder_ = new RepeatedFieldBuilder<>(this.vodList_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.vodList_ = null;
                }
                return this.vodListBuilder_;
            }

            public Builder addAllVodList(Iterable<? extends DramaProto.DramaBean> iterable) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVodListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.vodList_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addVodList(int i, DramaProto.DramaBean.Builder builder) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVodListIsMutable();
                    this.vodList_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addVodList(int i, DramaProto.DramaBean dramaBean) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaBean.getClass();
                    ensureVodListIsMutable();
                    this.vodList_.add(i, dramaBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, dramaBean);
                }
                return this;
            }

            public Builder addVodList(DramaProto.DramaBean.Builder builder) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVodListIsMutable();
                    this.vodList_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addVodList(DramaProto.DramaBean dramaBean) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaBean.getClass();
                    ensureVodListIsMutable();
                    this.vodList_.add(dramaBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(dramaBean);
                }
                return this;
            }

            public DramaProto.DramaBean.Builder addVodListBuilder() {
                return (DramaProto.DramaBean.Builder) internalGetVodListFieldBuilder().addBuilder(DramaProto.DramaBean.getDefaultInstance());
            }

            public DramaProto.DramaBean.Builder addVodListBuilder(int i) {
                return (DramaProto.DramaBean.Builder) internalGetVodListFieldBuilder().addBuilder(i, DramaProto.DramaBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SectionBean build() {
                SectionBean sectionBeanBuildPartial = buildPartial();
                if (sectionBeanBuildPartial.isInitialized()) {
                    return sectionBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sectionBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SectionBean buildPartial() {
                SectionBean sectionBean = new SectionBean(this);
                buildPartialRepeatedFields(sectionBean);
                if (this.bitField0_ != 0) {
                    buildPartial0(sectionBean);
                }
                onBuilt();
                return sectionBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sectionName_ = "";
                this.cardStyle_ = 0;
                this.maxRow_ = 0;
                this.from_ = "";
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.vodList_ = Collections.emptyList();
                } else {
                    this.vodList_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -17;
                this.typeId_ = 0;
                return this;
            }

            public Builder clearCardStyle() {
                this.bitField0_ &= -3;
                this.cardStyle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFrom() {
                this.from_ = SectionBean.getDefaultInstance().getFrom();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearMaxRow() {
                this.bitField0_ &= -5;
                this.maxRow_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSectionName() {
                this.sectionName_ = SectionBean.getDefaultInstance().getSectionName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTypeId() {
                this.bitField0_ &= -33;
                this.typeId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVodList() {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.vodList_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public int getCardStyle() {
                return this.cardStyle_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SectionBean getDefaultInstanceForType() {
                return SectionBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SectionProto.internal_static_com_base_model_proto_SectionBean_descriptor;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public String getFrom() {
                Object obj = this.from_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.from_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public ByteString getFromBytes() {
                Object obj = this.from_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.from_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public int getMaxRow() {
                return this.maxRow_;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public String getSectionName() {
                Object obj = this.sectionName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sectionName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public ByteString getSectionNameBytes() {
                Object obj = this.sectionName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sectionName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public int getTypeId() {
                return this.typeId_;
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public DramaProto.DramaBean getVodList(int i) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                return repeatedFieldBuilder == null ? this.vodList_.get(i) : (DramaProto.DramaBean) repeatedFieldBuilder.getMessage(i);
            }

            public DramaProto.DramaBean.Builder getVodListBuilder(int i) {
                return (DramaProto.DramaBean.Builder) internalGetVodListFieldBuilder().getBuilder(i);
            }

            public List<DramaProto.DramaBean.Builder> getVodListBuilderList() {
                return internalGetVodListFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public int getVodListCount() {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                return repeatedFieldBuilder == null ? this.vodList_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public List<DramaProto.DramaBean> getVodListList() {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.vodList_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public DramaProto.DramaBeanOrBuilder getVodListOrBuilder(int i) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                return repeatedFieldBuilder == null ? this.vodList_.get(i) : (DramaProto.DramaBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
            public List<? extends DramaProto.DramaBeanOrBuilder> getVodListOrBuilderList() {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.vodList_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return SectionProto.internal_static_com_base_model_proto_SectionBean_fieldAccessorTable.ensureFieldAccessorsInitialized(SectionBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SectionBean sectionBean) {
                if (sectionBean == SectionBean.getDefaultInstance()) {
                    return this;
                }
                if (!sectionBean.getSectionName().isEmpty()) {
                    this.sectionName_ = sectionBean.sectionName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sectionBean.getCardStyle() != 0) {
                    setCardStyle(sectionBean.getCardStyle());
                }
                if (sectionBean.getMaxRow() != 0) {
                    setMaxRow(sectionBean.getMaxRow());
                }
                if (!sectionBean.getFrom().isEmpty()) {
                    this.from_ = sectionBean.from_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (this.vodListBuilder_ == null) {
                    if (!sectionBean.vodList_.isEmpty()) {
                        if (this.vodList_.isEmpty()) {
                            this.vodList_ = sectionBean.vodList_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureVodListIsMutable();
                            this.vodList_.addAll(sectionBean.vodList_);
                        }
                        onChanged();
                    }
                } else if (!sectionBean.vodList_.isEmpty()) {
                    if (this.vodListBuilder_.isEmpty()) {
                        this.vodListBuilder_.dispose();
                        this.vodListBuilder_ = null;
                        this.vodList_ = sectionBean.vodList_;
                        this.bitField0_ &= -17;
                        this.vodListBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetVodListFieldBuilder() : null;
                    } else {
                        this.vodListBuilder_.addAllMessages(sectionBean.vodList_);
                    }
                }
                if (sectionBean.getTypeId() != 0) {
                    setTypeId(sectionBean.getTypeId());
                }
                mergeUnknownFields(sectionBean.getUnknownFields());
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
                                    this.sectionName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.cardStyle_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxRow_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.from_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    DramaProto.DramaBean dramaBean = (DramaProto.DramaBean) codedInputStream.readMessage(DramaProto.DramaBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureVodListIsMutable();
                                        this.vodList_.add(dramaBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(dramaBean);
                                    }
                                } else if (tag == 48) {
                                    this.typeId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 32;
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
                if (message instanceof SectionBean) {
                    return mergeFrom((SectionBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeVodList(int i) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVodListIsMutable();
                    this.vodList_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setCardStyle(int i) {
                this.cardStyle_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFrom(String str) {
                str.getClass();
                this.from_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFromBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.from_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMaxRow(int i) {
                this.maxRow_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSectionName(String str) {
                str.getClass();
                this.sectionName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSectionNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.sectionName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTypeId(int i) {
                this.typeId_ = i;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setVodList(int i, DramaProto.DramaBean.Builder builder) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVodListIsMutable();
                    this.vodList_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setVodList(int i, DramaProto.DramaBean dramaBean) {
                RepeatedFieldBuilder<DramaProto.DramaBean, DramaProto.DramaBean.Builder, DramaProto.DramaBeanOrBuilder> repeatedFieldBuilder = this.vodListBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaBean.getClass();
                    ensureVodListIsMutable();
                    this.vodList_.set(i, dramaBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, dramaBean);
                }
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", SectionBean.class.getName());
            DEFAULT_INSTANCE = new SectionBean();
            PARSER = new AbstractParser<SectionBean>() { // from class: com.base.model.proto.SectionProto.SectionBean.1
                @Override // com.google.protobuf.Parser
                public SectionBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SectionBean.newBuilder();
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

        private SectionBean() {
            this.sectionName_ = "";
            this.cardStyle_ = 0;
            this.maxRow_ = 0;
            this.from_ = "";
            this.typeId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.sectionName_ = "";
            this.from_ = "";
            this.vodList_ = Collections.emptyList();
        }

        public /* synthetic */ SectionBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private SectionBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.sectionName_ = "";
            this.cardStyle_ = 0;
            this.maxRow_ = 0;
            this.from_ = "";
            this.typeId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SectionBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SectionProto.internal_static_com_base_model_proto_SectionBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(SectionBean sectionBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sectionBean);
        }

        public static SectionBean parseDelimitedFrom(InputStream inputStream) {
            return (SectionBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SectionBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SectionBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SectionBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static SectionBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SectionBean parseFrom(CodedInputStream codedInputStream) {
            return (SectionBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static SectionBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SectionBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static SectionBean parseFrom(InputStream inputStream) {
            return (SectionBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static SectionBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SectionBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SectionBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static SectionBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static SectionBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SectionBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<SectionBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SectionBean)) {
                return super.equals(obj);
            }
            SectionBean sectionBean = (SectionBean) obj;
            return getSectionName().equals(sectionBean.getSectionName()) && getCardStyle() == sectionBean.getCardStyle() && getMaxRow() == sectionBean.getMaxRow() && getFrom().equals(sectionBean.getFrom()) && getVodListList().equals(sectionBean.getVodListList()) && getTypeId() == sectionBean.getTypeId() && getUnknownFields().equals(sectionBean.getUnknownFields());
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public int getCardStyle() {
            return this.cardStyle_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SectionBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public String getFrom() {
            Object obj = this.from_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.from_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public ByteString getFromBytes() {
            Object obj = this.from_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.from_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public int getMaxRow() {
            return this.maxRow_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SectionBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public String getSectionName() {
            Object obj = this.sectionName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sectionName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public ByteString getSectionNameBytes() {
            Object obj = this.sectionName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sectionName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.sectionName_) ? GeneratedMessage.computeStringSize(1, this.sectionName_) : 0;
            int i2 = this.cardStyle_;
            if (i2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(2, i2);
            }
            int i3 = this.maxRow_;
            if (i3 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(3, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.from_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.from_);
            }
            for (int i4 = 0; i4 < this.vodList_.size(); i4++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.vodList_.get(i4));
            }
            int i5 = this.typeId_;
            if (i5 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(6, i5);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public int getTypeId() {
            return this.typeId_;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public DramaProto.DramaBean getVodList(int i) {
            return this.vodList_.get(i);
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public int getVodListCount() {
            return this.vodList_.size();
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public List<DramaProto.DramaBean> getVodListList() {
            return this.vodList_;
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public DramaProto.DramaBeanOrBuilder getVodListOrBuilder(int i) {
            return this.vodList_.get(i);
        }

        @Override // com.base.model.proto.SectionProto.SectionBeanOrBuilder
        public List<? extends DramaProto.DramaBeanOrBuilder> getVodListOrBuilderList() {
            return this.vodList_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getFrom().hashCode() + ((((getMaxRow() + ((((getCardStyle() + ((((getSectionName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
            if (getVodListCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 5, 53) + getVodListList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + ((getTypeId() + a.a(iHashCode, 37, 6, 53)) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return SectionProto.internal_static_com_base_model_proto_SectionBean_fieldAccessorTable.ensureFieldAccessorsInitialized(SectionBean.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.sectionName_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.sectionName_);
            }
            int i = this.cardStyle_;
            if (i != 0) {
                codedOutputStream.writeInt32(2, i);
            }
            int i2 = this.maxRow_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(3, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.from_)) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.from_);
            }
            for (int i3 = 0; i3 < this.vodList_.size(); i3++) {
                codedOutputStream.writeMessage(5, this.vodList_.get(i3));
            }
            int i4 = this.typeId_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(6, i4);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface SectionBeanOrBuilder extends MessageOrBuilder {
        int getCardStyle();

        String getFrom();

        ByteString getFromBytes();

        int getMaxRow();

        String getSectionName();

        ByteString getSectionNameBytes();

        int getTypeId();

        DramaProto.DramaBean getVodList(int i);

        int getVodListCount();

        List<DramaProto.DramaBean> getVodListList();

        DramaProto.DramaBeanOrBuilder getVodListOrBuilder(int i);

        List<? extends DramaProto.DramaBeanOrBuilder> getVodListOrBuilderList();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", SectionProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rSection.proto\u0012\u0014com.base.model.proto\u001a\u000bDrama.proto\"\u0099\u0001\n\u000bSectionBean\u0012\u0014\n\fsection_name\u0018\u0001 \u0001(\t\u0012\u0012\n\ncard_style\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007max_row\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004from\u0018\u0004 \u0001(\t\u00120\n\u0007vodList\u0018\u0005 \u0003(\u000b2\u001f.com.base.model.proto.DramaBean\u0012\u000f\n\u0007type_id\u0018\u0006 \u0001(\u0005B\u000eB\fSectionProtob\u0006proto3"}, new Descriptors.FileDescriptor[]{DramaProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_SectionBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_SectionBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"SectionName", "CardStyle", "MaxRow", "From", "VodList", "TypeId"});
        descriptor.resolveAllFeaturesImmutable();
        DramaProto.getDescriptor();
    }

    private SectionProto() {
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
