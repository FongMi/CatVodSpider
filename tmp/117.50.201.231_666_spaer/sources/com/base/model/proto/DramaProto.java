package com.base.model.proto;

import com.base.model.proto.DramaCoverImageProto;
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class DramaProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_DramaBeanPage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_DramaBeanPage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_DramaBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_DramaBean_fieldAccessorTable;

    public final class DramaBean extends GeneratedMessage implements DramaBeanOrBuilder {
        public static final int ACTOR_FIELD_NUMBER = 12;
        public static final int AREA_FIELD_NUMBER = 1;
        public static final int BRIEF_FIELD_NUMBER = 4;
        public static final int CATE_TYPE2_FIELD_NUMBER = 9;
        public static final int CLAZZ_FIELD_NUMBER = 15;
        public static final int COVER_IMAGE_FIELD_NUMBER = 2;
        private static final DramaBean DEFAULT_INSTANCE;
        public static final int DIRECTOR_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 5;
        private static final Parser<DramaBean> PARSER;
        public static final int REMARK_FIELD_NUMBER = 13;
        public static final int STARS_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 8;
        public static final int UPDATE_TIME_FIELD_NUMBER = 10;
        public static final int VOD_PUBDATE_FIELD_NUMBER = 11;
        public static final int YEAR_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private volatile Object actor_;
        private volatile Object area_;
        private int bitField0_;
        private volatile Object brief_;
        private int cateType2_;
        private volatile Object clazz_;
        private DramaCoverImageProto.DramaCoverImageBean coverImage_;
        private volatile Object director_;
        private int id_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object remark_;
        private float stars_;
        private int type_;
        private long updateTime_;
        private volatile Object vodPubdate_;
        private int year_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements DramaBeanOrBuilder {
            private Object actor_;
            private Object area_;
            private int bitField0_;
            private Object brief_;
            private int cateType2_;
            private Object clazz_;
            private SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> coverImageBuilder_;
            private DramaCoverImageProto.DramaCoverImageBean coverImage_;
            private Object director_;
            private int id_;
            private Object name_;
            private Object remark_;
            private float stars_;
            private int type_;
            private long updateTime_;
            private Object vodPubdate_;
            private int year_;

            private Builder() {
                this.area_ = "";
                this.brief_ = "";
                this.name_ = "";
                this.director_ = "";
                this.vodPubdate_ = "";
                this.actor_ = "";
                this.remark_ = "";
                this.clazz_ = "";
                maybeForceBuilderInitialization();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.area_ = "";
                this.brief_ = "";
                this.name_ = "";
                this.director_ = "";
                this.vodPubdate_ = "";
                this.actor_ = "";
                this.remark_ = "";
                this.clazz_ = "";
                maybeForceBuilderInitialization();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(DramaBean dramaBean) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    dramaBean.area_ = this.area_;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                    dramaBean.coverImage_ = singleFieldBuilder == null ? this.coverImage_ : (DramaCoverImageProto.DramaCoverImageBean) singleFieldBuilder.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    dramaBean.id_ = this.id_;
                }
                if ((i2 & 8) != 0) {
                    dramaBean.brief_ = this.brief_;
                }
                if ((i2 & 16) != 0) {
                    dramaBean.name_ = this.name_;
                }
                if ((i2 & 32) != 0) {
                    dramaBean.stars_ = this.stars_;
                }
                if ((i2 & 64) != 0) {
                    dramaBean.director_ = this.director_;
                }
                if ((i2 & 128) != 0) {
                    dramaBean.type_ = this.type_;
                }
                if ((i2 & 256) != 0) {
                    dramaBean.cateType2_ = this.cateType2_;
                }
                if ((i2 & 512) != 0) {
                    dramaBean.updateTime_ = this.updateTime_;
                }
                if ((i2 & 1024) != 0) {
                    dramaBean.vodPubdate_ = this.vodPubdate_;
                }
                if ((i2 & 2048) != 0) {
                    dramaBean.actor_ = this.actor_;
                }
                if ((i2 & 4096) != 0) {
                    dramaBean.remark_ = this.remark_;
                }
                if ((i2 & 8192) != 0) {
                    dramaBean.year_ = this.year_;
                }
                if ((i2 & 16384) != 0) {
                    dramaBean.clazz_ = this.clazz_;
                }
                dramaBean.bitField0_ |= i;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DramaProto.internal_static_com_base_model_proto_DramaBean_descriptor;
            }

            private SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> internalGetCoverImageFieldBuilder() {
                if (this.coverImageBuilder_ == null) {
                    this.coverImageBuilder_ = new SingleFieldBuilder<>(getCoverImage(), getParentForChildren(), isClean());
                    this.coverImage_ = null;
                }
                return this.coverImageBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetCoverImageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaBean build() {
                DramaBean dramaBeanBuildPartial = buildPartial();
                if (dramaBeanBuildPartial.isInitialized()) {
                    return dramaBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dramaBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaBean buildPartial() {
                DramaBean dramaBean = new DramaBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dramaBean);
                }
                onBuilt();
                return dramaBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.area_ = "";
                this.coverImage_ = null;
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.coverImageBuilder_ = null;
                }
                this.id_ = 0;
                this.brief_ = "";
                this.name_ = "";
                this.stars_ = 0.0f;
                this.director_ = "";
                this.type_ = 0;
                this.cateType2_ = 0;
                this.updateTime_ = 0L;
                this.vodPubdate_ = "";
                this.actor_ = "";
                this.remark_ = "";
                this.year_ = 0;
                this.clazz_ = "";
                return this;
            }

            public Builder clearActor() {
                this.actor_ = DramaBean.getDefaultInstance().getActor();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearArea() {
                this.area_ = DramaBean.getDefaultInstance().getArea();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearBrief() {
                this.brief_ = DramaBean.getDefaultInstance().getBrief();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearCateType2() {
                this.bitField0_ &= -257;
                this.cateType2_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClazz() {
                this.clazz_ = DramaBean.getDefaultInstance().getClazz();
                this.bitField0_ &= -16385;
                onChanged();
                return this;
            }

            public Builder clearCoverImage() {
                this.bitField0_ &= -3;
                this.coverImage_ = null;
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.coverImageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDirector() {
                this.director_ = DramaBean.getDefaultInstance().getDirector();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -5;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = DramaBean.getDefaultInstance().getName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearRemark() {
                this.remark_ = DramaBean.getDefaultInstance().getRemark();
                this.bitField0_ &= -4097;
                onChanged();
                return this;
            }

            public Builder clearStars() {
                this.bitField0_ &= -33;
                this.stars_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -129;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdateTime() {
                this.bitField0_ &= -513;
                this.updateTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVodPubdate() {
                this.vodPubdate_ = DramaBean.getDefaultInstance().getVodPubdate();
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -8193;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getActor() {
                Object obj = this.actor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.actor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getActorBytes() {
                Object obj = this.actor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.actor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getArea() {
                Object obj = this.area_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.area_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getAreaBytes() {
                Object obj = this.area_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.area_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getBrief() {
                Object obj = this.brief_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.brief_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getBriefBytes() {
                Object obj = this.brief_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.brief_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public int getCateType2() {
                return this.cateType2_;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getClazz() {
                Object obj = this.clazz_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.clazz_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getClazzBytes() {
                Object obj = this.clazz_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clazz_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public DramaCoverImageProto.DramaCoverImageBean getCoverImage() {
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    return (DramaCoverImageProto.DramaCoverImageBean) singleFieldBuilder.getMessage();
                }
                DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
                return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
            }

            public DramaCoverImageProto.DramaCoverImageBean.Builder getCoverImageBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DramaCoverImageProto.DramaCoverImageBean.Builder) internalGetCoverImageFieldBuilder().getBuilder();
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public DramaCoverImageProto.DramaCoverImageBeanOrBuilder getCoverImageOrBuilder() {
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    return (DramaCoverImageProto.DramaCoverImageBeanOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
                return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DramaBean getDefaultInstanceForType() {
                return DramaBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DramaProto.internal_static_com_base_model_proto_DramaBean_descriptor;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getDirector() {
                Object obj = this.director_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.director_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getDirectorBytes() {
                Object obj = this.director_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.director_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getRemark() {
                Object obj = this.remark_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.remark_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getRemarkBytes() {
                Object obj = this.remark_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.remark_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public float getStars() {
                return this.stars_;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public long getUpdateTime() {
                return this.updateTime_;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public String getVodPubdate() {
                Object obj = this.vodPubdate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vodPubdate_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public ByteString getVodPubdateBytes() {
                Object obj = this.vodPubdate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vodPubdate_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
            public boolean hasCoverImage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DramaProto.internal_static_com_base_model_proto_DramaBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCoverImage(DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean) {
                DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean2;
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.mergeFrom(dramaCoverImageBean);
                } else if ((this.bitField0_ & 2) == 0 || (dramaCoverImageBean2 = this.coverImage_) == null || dramaCoverImageBean2 == DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance()) {
                    this.coverImage_ = dramaCoverImageBean;
                } else {
                    getCoverImageBuilder().mergeFrom(dramaCoverImageBean);
                }
                if (this.coverImage_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(DramaBean dramaBean) {
                if (dramaBean == DramaBean.getDefaultInstance()) {
                    return this;
                }
                if (!dramaBean.getArea().isEmpty()) {
                    this.area_ = dramaBean.area_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (dramaBean.hasCoverImage()) {
                    mergeCoverImage(dramaBean.getCoverImage());
                }
                if (dramaBean.getId() != 0) {
                    setId(dramaBean.getId());
                }
                if (!dramaBean.getBrief().isEmpty()) {
                    this.brief_ = dramaBean.brief_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (!dramaBean.getName().isEmpty()) {
                    this.name_ = dramaBean.name_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (Float.floatToRawIntBits(dramaBean.getStars()) != 0) {
                    setStars(dramaBean.getStars());
                }
                if (!dramaBean.getDirector().isEmpty()) {
                    this.director_ = dramaBean.director_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (dramaBean.getType() != 0) {
                    setType(dramaBean.getType());
                }
                if (dramaBean.getCateType2() != 0) {
                    setCateType2(dramaBean.getCateType2());
                }
                if (dramaBean.getUpdateTime() != 0) {
                    setUpdateTime(dramaBean.getUpdateTime());
                }
                if (!dramaBean.getVodPubdate().isEmpty()) {
                    this.vodPubdate_ = dramaBean.vodPubdate_;
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                if (!dramaBean.getActor().isEmpty()) {
                    this.actor_ = dramaBean.actor_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                if (!dramaBean.getRemark().isEmpty()) {
                    this.remark_ = dramaBean.remark_;
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                if (dramaBean.getYear() != 0) {
                    setYear(dramaBean.getYear());
                }
                if (!dramaBean.getClazz().isEmpty()) {
                    this.clazz_ = dramaBean.clazz_;
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                mergeUnknownFields(dramaBean.getUnknownFields());
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
                            switch (tag) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    this.area_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    codedInputStream.readMessage(internalGetCoverImageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.id_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    this.brief_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 53:
                                    this.stars_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.director_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.type_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.cateType2_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.updateTime_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 512;
                                    break;
                                case 90:
                                    this.vodPubdate_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 98:
                                    this.actor_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 106:
                                    this.remark_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.year_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 122:
                                    this.clazz_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16384;
                                    break;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        z = true;
                                    }
                                    break;
                            }
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
                if (message instanceof DramaBean) {
                    return mergeFrom((DramaBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActor(String str) {
                str.getClass();
                this.actor_ = str;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setActorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.actor_ = byteString;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setArea(String str) {
                str.getClass();
                this.area_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAreaBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.area_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setBrief(String str) {
                str.getClass();
                this.brief_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBriefBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.brief_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCateType2(int i) {
                this.cateType2_ = i;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setClazz(String str) {
                str.getClass();
                this.clazz_ = str;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setClazzBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.clazz_ = byteString;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setCoverImage(DramaCoverImageProto.DramaCoverImageBean.Builder builder) {
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder == null) {
                    this.coverImage_ = builder.build();
                } else {
                    singleFieldBuilder.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCoverImage(DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean) {
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder == null) {
                    dramaCoverImageBean.getClass();
                    this.coverImage_ = dramaCoverImageBean;
                } else {
                    singleFieldBuilder.setMessage(dramaCoverImageBean);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDirector(String str) {
                str.getClass();
                this.director_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDirectorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.director_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setId(int i) {
                this.id_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRemark(String str) {
                str.getClass();
                this.remark_ = str;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.remark_ = byteString;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setStars(float f) {
                this.stars_ = f;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setType(int i) {
                this.type_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setUpdateTime(long j) {
                this.updateTime_ = j;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setVodPubdate(String str) {
                str.getClass();
                this.vodPubdate_ = str;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setVodPubdateBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.vodPubdate_ = byteString;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setYear(int i) {
                this.year_ = i;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaBean.class.getName());
            DEFAULT_INSTANCE = new DramaBean();
            PARSER = new AbstractParser<DramaBean>() { // from class: com.base.model.proto.DramaProto.DramaBean.1
                @Override // com.google.protobuf.Parser
                public DramaBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = DramaBean.newBuilder();
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

        private DramaBean() {
            this.area_ = "";
            this.id_ = 0;
            this.brief_ = "";
            this.name_ = "";
            this.stars_ = 0.0f;
            this.director_ = "";
            this.type_ = 0;
            this.cateType2_ = 0;
            this.updateTime_ = 0L;
            this.vodPubdate_ = "";
            this.actor_ = "";
            this.remark_ = "";
            this.year_ = 0;
            this.clazz_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.area_ = "";
            this.brief_ = "";
            this.name_ = "";
            this.director_ = "";
            this.vodPubdate_ = "";
            this.actor_ = "";
            this.remark_ = "";
            this.clazz_ = "";
        }

        public /* synthetic */ DramaBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private DramaBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.area_ = "";
            this.id_ = 0;
            this.brief_ = "";
            this.name_ = "";
            this.stars_ = 0.0f;
            this.director_ = "";
            this.type_ = 0;
            this.cateType2_ = 0;
            this.updateTime_ = 0L;
            this.vodPubdate_ = "";
            this.actor_ = "";
            this.remark_ = "";
            this.year_ = 0;
            this.clazz_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DramaBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DramaProto.internal_static_com_base_model_proto_DramaBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DramaBean dramaBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dramaBean);
        }

        public static DramaBean parseDelimitedFrom(InputStream inputStream) {
            return (DramaBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DramaBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static DramaBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DramaBean parseFrom(CodedInputStream codedInputStream) {
            return (DramaBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DramaBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DramaBean parseFrom(InputStream inputStream) {
            return (DramaBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static DramaBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DramaBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DramaBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DramaBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<DramaBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DramaBean)) {
                return super.equals(obj);
            }
            DramaBean dramaBean = (DramaBean) obj;
            if (getArea().equals(dramaBean.getArea()) && hasCoverImage() == dramaBean.hasCoverImage()) {
                return (!hasCoverImage() || getCoverImage().equals(dramaBean.getCoverImage())) && getId() == dramaBean.getId() && getBrief().equals(dramaBean.getBrief()) && getName().equals(dramaBean.getName()) && Float.floatToIntBits(getStars()) == Float.floatToIntBits(dramaBean.getStars()) && getDirector().equals(dramaBean.getDirector()) && getType() == dramaBean.getType() && getCateType2() == dramaBean.getCateType2() && getUpdateTime() == dramaBean.getUpdateTime() && getVodPubdate().equals(dramaBean.getVodPubdate()) && getActor().equals(dramaBean.getActor()) && getRemark().equals(dramaBean.getRemark()) && getYear() == dramaBean.getYear() && getClazz().equals(dramaBean.getClazz()) && getUnknownFields().equals(dramaBean.getUnknownFields());
            }
            return false;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getActor() {
            Object obj = this.actor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.actor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getActorBytes() {
            Object obj = this.actor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.actor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getArea() {
            Object obj = this.area_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.area_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getAreaBytes() {
            Object obj = this.area_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.area_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getBrief() {
            Object obj = this.brief_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.brief_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getBriefBytes() {
            Object obj = this.brief_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.brief_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public int getCateType2() {
            return this.cateType2_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getClazz() {
            Object obj = this.clazz_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.clazz_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getClazzBytes() {
            Object obj = this.clazz_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clazz_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public DramaCoverImageProto.DramaCoverImageBean getCoverImage() {
            DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
            return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public DramaCoverImageProto.DramaCoverImageBeanOrBuilder getCoverImageOrBuilder() {
            DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
            return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DramaBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getDirector() {
            Object obj = this.director_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.director_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getDirectorBytes() {
            Object obj = this.director_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.director_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DramaBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getRemark() {
            Object obj = this.remark_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.remark_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getRemarkBytes() {
            Object obj = this.remark_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.remark_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.area_) ? GeneratedMessage.computeStringSize(1, this.area_) : 0;
            if ((1 & this.bitField0_) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getCoverImage());
            }
            int i2 = this.id_;
            if (i2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(3, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.brief_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(4, this.brief_);
            }
            if (!GeneratedMessage.isStringEmpty(this.name_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.name_);
            }
            if (Float.floatToRawIntBits(this.stars_) != 0) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(6, this.stars_);
            }
            if (!GeneratedMessage.isStringEmpty(this.director_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.director_);
            }
            int i3 = this.type_;
            if (i3 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(8, i3);
            }
            int i4 = this.cateType2_;
            if (i4 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(9, i4);
            }
            long j = this.updateTime_;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(10, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodPubdate_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(11, this.vodPubdate_);
            }
            if (!GeneratedMessage.isStringEmpty(this.actor_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(12, this.actor_);
            }
            if (!GeneratedMessage.isStringEmpty(this.remark_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(13, this.remark_);
            }
            int i5 = this.year_;
            if (i5 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(14, i5);
            }
            if (!GeneratedMessage.isStringEmpty(this.clazz_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(15, this.clazz_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public float getStars() {
            return this.stars_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public long getUpdateTime() {
            return this.updateTime_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public String getVodPubdate() {
            Object obj = this.vodPubdate_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.vodPubdate_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public ByteString getVodPubdateBytes() {
            Object obj = this.vodPubdate_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.vodPubdate_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanOrBuilder
        public boolean hasCoverImage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getArea().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53);
            if (hasCoverImage()) {
                iHashCode = getCoverImage().hashCode() + a.a(iHashCode, 37, 2, 53);
            }
            int iHashCode2 = getUnknownFields().hashCode() + ((getClazz().hashCode() + ((((getYear() + ((((getRemark().hashCode() + ((((getActor().hashCode() + ((((getVodPubdate().hashCode() + ((((Internal.hashLong(getUpdateTime()) + ((((getCateType2() + ((((getType() + ((((getDirector().hashCode() + ((((Float.floatToIntBits(getStars()) + ((((getName().hashCode() + ((((getBrief().hashCode() + ((((getId() + a.a(iHashCode, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DramaProto.internal_static_com_base_model_proto_DramaBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaBean.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.area_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.area_);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getCoverImage());
            }
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.writeInt32(3, i);
            }
            if (!GeneratedMessage.isStringEmpty(this.brief_)) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.brief_);
            }
            if (!GeneratedMessage.isStringEmpty(this.name_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.name_);
            }
            if (Float.floatToRawIntBits(this.stars_) != 0) {
                codedOutputStream.writeFloat(6, this.stars_);
            }
            if (!GeneratedMessage.isStringEmpty(this.director_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.director_);
            }
            int i2 = this.type_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(8, i2);
            }
            int i3 = this.cateType2_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(9, i3);
            }
            long j = this.updateTime_;
            if (j != 0) {
                codedOutputStream.writeInt64(10, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodPubdate_)) {
                GeneratedMessage.writeString(codedOutputStream, 11, this.vodPubdate_);
            }
            if (!GeneratedMessage.isStringEmpty(this.actor_)) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.actor_);
            }
            if (!GeneratedMessage.isStringEmpty(this.remark_)) {
                GeneratedMessage.writeString(codedOutputStream, 13, this.remark_);
            }
            int i4 = this.year_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(14, i4);
            }
            if (!GeneratedMessage.isStringEmpty(this.clazz_)) {
                GeneratedMessage.writeString(codedOutputStream, 15, this.clazz_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface DramaBeanOrBuilder extends MessageOrBuilder {
        String getActor();

        ByteString getActorBytes();

        String getArea();

        ByteString getAreaBytes();

        String getBrief();

        ByteString getBriefBytes();

        int getCateType2();

        String getClazz();

        ByteString getClazzBytes();

        DramaCoverImageProto.DramaCoverImageBean getCoverImage();

        DramaCoverImageProto.DramaCoverImageBeanOrBuilder getCoverImageOrBuilder();

        String getDirector();

        ByteString getDirectorBytes();

        int getId();

        String getName();

        ByteString getNameBytes();

        String getRemark();

        ByteString getRemarkBytes();

        float getStars();

        int getType();

        long getUpdateTime();

        String getVodPubdate();

        ByteString getVodPubdateBytes();

        int getYear();

        boolean hasCoverImage();
    }

    public final class DramaBeanPage extends GeneratedMessage implements DramaBeanPageOrBuilder {
        private static final DramaBeanPage DEFAULT_INSTANCE;
        public static final int DRAMABEAN_FIELD_NUMBER = 1;
        private static final Parser<DramaBeanPage> PARSER;
        public static final int TOTAL_FIELD_NUMBER = 16;
        private static final long serialVersionUID = 0;
        private List<DramaBean> dramaBean_;
        private byte memoizedIsInitialized;
        private int total_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements DramaBeanPageOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> dramaBeanBuilder_;
            private List<DramaBean> dramaBean_;
            private int total_;

            private Builder() {
                this.dramaBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.dramaBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(DramaBeanPage dramaBeanPage) {
                if ((this.bitField0_ & 2) != 0) {
                    dramaBeanPage.total_ = this.total_;
                }
            }

            private void buildPartialRepeatedFields(DramaBeanPage dramaBeanPage) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder != null) {
                    dramaBeanPage.dramaBean_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.dramaBean_ = Collections.unmodifiableList(this.dramaBean_);
                    this.bitField0_ &= -2;
                }
                dramaBeanPage.dramaBean_ = this.dramaBean_;
            }

            private void ensureDramaBeanIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.dramaBean_ = new ArrayList(this.dramaBean_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DramaProto.internal_static_com_base_model_proto_DramaBeanPage_descriptor;
            }

            private RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> internalGetDramaBeanFieldBuilder() {
                if (this.dramaBeanBuilder_ == null) {
                    this.dramaBeanBuilder_ = new RepeatedFieldBuilder<>(this.dramaBean_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.dramaBean_ = null;
                }
                return this.dramaBeanBuilder_;
            }

            public Builder addAllDramaBean(Iterable<? extends DramaBean> iterable) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaBeanIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.dramaBean_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addDramaBean(int i, DramaBean.Builder builder) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addDramaBean(int i, DramaBean dramaBean) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaBean.getClass();
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.add(i, dramaBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, dramaBean);
                }
                return this;
            }

            public Builder addDramaBean(DramaBean.Builder builder) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDramaBean(DramaBean dramaBean) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaBean.getClass();
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.add(dramaBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(dramaBean);
                }
                return this;
            }

            public DramaBean.Builder addDramaBeanBuilder() {
                return (DramaBean.Builder) internalGetDramaBeanFieldBuilder().addBuilder(DramaBean.getDefaultInstance());
            }

            public DramaBean.Builder addDramaBeanBuilder(int i) {
                return (DramaBean.Builder) internalGetDramaBeanFieldBuilder().addBuilder(i, DramaBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaBeanPage build() {
                DramaBeanPage dramaBeanPageBuildPartial = buildPartial();
                if (dramaBeanPageBuildPartial.isInitialized()) {
                    return dramaBeanPageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dramaBeanPageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaBeanPage buildPartial() {
                DramaBeanPage dramaBeanPage = new DramaBeanPage(this);
                buildPartialRepeatedFields(dramaBeanPage);
                if (this.bitField0_ != 0) {
                    buildPartial0(dramaBeanPage);
                }
                onBuilt();
                return dramaBeanPage;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.dramaBean_ = Collections.emptyList();
                } else {
                    this.dramaBean_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                this.total_ = 0;
                return this;
            }

            public Builder clearDramaBean() {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.dramaBean_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearTotal() {
                this.bitField0_ &= -3;
                this.total_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DramaBeanPage getDefaultInstanceForType() {
                return DramaBeanPage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DramaProto.internal_static_com_base_model_proto_DramaBeanPage_descriptor;
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
            public DramaBean getDramaBean(int i) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                return repeatedFieldBuilder == null ? this.dramaBean_.get(i) : (DramaBean) repeatedFieldBuilder.getMessage(i);
            }

            public DramaBean.Builder getDramaBeanBuilder(int i) {
                return (DramaBean.Builder) internalGetDramaBeanFieldBuilder().getBuilder(i);
            }

            public List<DramaBean.Builder> getDramaBeanBuilderList() {
                return internalGetDramaBeanFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
            public int getDramaBeanCount() {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                return repeatedFieldBuilder == null ? this.dramaBean_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
            public List<DramaBean> getDramaBeanList() {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.dramaBean_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
            public DramaBeanOrBuilder getDramaBeanOrBuilder(int i) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                return repeatedFieldBuilder == null ? this.dramaBean_.get(i) : (DramaBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
            public List<? extends DramaBeanOrBuilder> getDramaBeanOrBuilderList() {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.dramaBean_);
            }

            @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
            public int getTotal() {
                return this.total_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DramaProto.internal_static_com_base_model_proto_DramaBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaBeanPage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DramaBeanPage dramaBeanPage) {
                if (dramaBeanPage == DramaBeanPage.getDefaultInstance()) {
                    return this;
                }
                if (this.dramaBeanBuilder_ == null) {
                    if (!dramaBeanPage.dramaBean_.isEmpty()) {
                        if (this.dramaBean_.isEmpty()) {
                            this.dramaBean_ = dramaBeanPage.dramaBean_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDramaBeanIsMutable();
                            this.dramaBean_.addAll(dramaBeanPage.dramaBean_);
                        }
                        onChanged();
                    }
                } else if (!dramaBeanPage.dramaBean_.isEmpty()) {
                    if (this.dramaBeanBuilder_.isEmpty()) {
                        this.dramaBeanBuilder_.dispose();
                        this.dramaBeanBuilder_ = null;
                        this.dramaBean_ = dramaBeanPage.dramaBean_;
                        this.bitField0_ &= -2;
                        this.dramaBeanBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDramaBeanFieldBuilder() : null;
                    } else {
                        this.dramaBeanBuilder_.addAllMessages(dramaBeanPage.dramaBean_);
                    }
                }
                if (dramaBeanPage.getTotal() != 0) {
                    setTotal(dramaBeanPage.getTotal());
                }
                mergeUnknownFields(dramaBeanPage.getUnknownFields());
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
                                    DramaBean dramaBean = (DramaBean) codedInputStream.readMessage(DramaBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureDramaBeanIsMutable();
                                        this.dramaBean_.add(dramaBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(dramaBean);
                                    }
                                } else if (tag == 128) {
                                    this.total_ = codedInputStream.readInt32();
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
                if (message instanceof DramaBeanPage) {
                    return mergeFrom((DramaBeanPage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeDramaBean(int i) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setDramaBean(int i, DramaBean.Builder builder) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setDramaBean(int i, DramaBean dramaBean) {
                RepeatedFieldBuilder<DramaBean, DramaBean.Builder, DramaBeanOrBuilder> repeatedFieldBuilder = this.dramaBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaBean.getClass();
                    ensureDramaBeanIsMutable();
                    this.dramaBean_.set(i, dramaBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, dramaBean);
                }
                return this;
            }

            public Builder setTotal(int i) {
                this.total_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaBeanPage.class.getName());
            DEFAULT_INSTANCE = new DramaBeanPage();
            PARSER = new AbstractParser<DramaBeanPage>() { // from class: com.base.model.proto.DramaProto.DramaBeanPage.1
                @Override // com.google.protobuf.Parser
                public DramaBeanPage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = DramaBeanPage.newBuilder();
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

        private DramaBeanPage() {
            this.total_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.dramaBean_ = Collections.emptyList();
        }

        public /* synthetic */ DramaBeanPage(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private DramaBeanPage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.total_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DramaBeanPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DramaProto.internal_static_com_base_model_proto_DramaBeanPage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DramaBeanPage dramaBeanPage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dramaBeanPage);
        }

        public static DramaBeanPage parseDelimitedFrom(InputStream inputStream) {
            return (DramaBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DramaBeanPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaBeanPage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static DramaBeanPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DramaBeanPage parseFrom(CodedInputStream codedInputStream) {
            return (DramaBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DramaBeanPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DramaBeanPage parseFrom(InputStream inputStream) {
            return (DramaBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static DramaBeanPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaBeanPage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DramaBeanPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DramaBeanPage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DramaBeanPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<DramaBeanPage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DramaBeanPage)) {
                return super.equals(obj);
            }
            DramaBeanPage dramaBeanPage = (DramaBeanPage) obj;
            return getDramaBeanList().equals(dramaBeanPage.getDramaBeanList()) && getTotal() == dramaBeanPage.getTotal() && getUnknownFields().equals(dramaBeanPage.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DramaBeanPage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
        public DramaBean getDramaBean(int i) {
            return this.dramaBean_.get(i);
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
        public int getDramaBeanCount() {
            return this.dramaBean_.size();
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
        public List<DramaBean> getDramaBeanList() {
            return this.dramaBean_;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
        public DramaBeanOrBuilder getDramaBeanOrBuilder(int i) {
            return this.dramaBean_.get(i);
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
        public List<? extends DramaBeanOrBuilder> getDramaBeanOrBuilderList() {
            return this.dramaBean_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DramaBeanPage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = 0;
            for (int i2 = 0; i2 < this.dramaBean_.size(); i2++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.dramaBean_.get(i2));
            }
            int i3 = this.total_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(16, i3);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.DramaProto.DramaBeanPageOrBuilder
        public int getTotal() {
            return this.total_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getDramaBeanCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getDramaBeanList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + ((getTotal() + a.a(iHashCode, 37, 16, 53)) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DramaProto.internal_static_com_base_model_proto_DramaBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaBeanPage.class, Builder.class);
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
            for (int i = 0; i < this.dramaBean_.size(); i++) {
                codedOutputStream.writeMessage(1, this.dramaBean_.get(i));
            }
            int i2 = this.total_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(16, i2);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface DramaBeanPageOrBuilder extends MessageOrBuilder {
        DramaBean getDramaBean(int i);

        int getDramaBeanCount();

        List<DramaBean> getDramaBeanList();

        DramaBeanOrBuilder getDramaBeanOrBuilder(int i);

        List<? extends DramaBeanOrBuilder> getDramaBeanOrBuilderList();

        int getTotal();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000bDrama.proto\u0012\u0014com.base.model.proto\u001a\u0015DramaCoverImage.proto\"«\u0002\n\tDramaBean\u0012\f\n\u0004area\u0018\u0001 \u0001(\t\u0012>\n\u000bcover_image\u0018\u0002 \u0001(\u000b2).com.base.model.proto.DramaCoverImageBean\u0012\n\n\u0002id\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005brief\u0018\u0004 \u0001(\t\u0012\f\n\u0004name\u0018\u0005 \u0001(\t\u0012\r\n\u0005stars\u0018\u0006 \u0001(\u0002\u0012\u0010\n\bdirector\u0018\u0007 \u0001(\t\u0012\f\n\u0004type\u0018\b \u0001(\u0005\u0012\u0012\n\ncate_type2\u0018\t \u0001(\u0005\u0012\u0013\n\u000bupdate_time\u0018\n \u0001(\u0003\u0012\u0013\n\u000bvod_pubdate\u0018\u000b \u0001(\t\u0012\r\n\u0005actor\u0018\f \u0001(\t\u0012\u000e\n\u0006remark\u0018\r \u0001(\t\u0012\f\n\u0004year\u0018\u000e \u0001(\u0005\u0012\r\n\u0005clazz\u0018\u000f \u0001(\t\"R\n\rDramaBeanPage\u00122\n\tdramaBean\u0018\u0001 \u0003(\u000b2\u001f.com.base.model.proto.DramaBean\u0012\r\n\u0005total\u0018\u0010 \u0001(\u0005B\fB\nDramaProtob\u0006proto3"}, new Descriptors.FileDescriptor[]{DramaCoverImageProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_DramaBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_DramaBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Area", "CoverImage", "Id", "Brief", "Name", "Stars", "Director", "Type", "CateType2", "UpdateTime", "VodPubdate", "Actor", "Remark", "Year", "Clazz"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_DramaBeanPage_descriptor = descriptor3;
        internal_static_com_base_model_proto_DramaBeanPage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"DramaBean", "Total"});
        descriptor.resolveAllFeaturesImmutable();
        DramaCoverImageProto.getDescriptor();
    }

    private DramaProto() {
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
