package com.base.model.proto;

import com.base.model.proto.CarouselProto;
import com.base.model.proto.DramaDetailProto;
import com.base.model.proto.SectionProto;
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
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class NormalTagsProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_NormalTagsBeanPage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_NormalTagsBeanPage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_NormalTagsBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_NormalTagsBean_fieldAccessorTable;

    public final class NormalTagsBean extends GeneratedMessage implements NormalTagsBeanOrBuilder {
        public static final int AUTO_PLAY_FIELD_NUMBER = 28;
        public static final int BORDER_RADIUS_FIELD_NUMBER = 27;
        public static final int CAROUSELS_FIELD_NUMBER = 30;
        public static final int COLUMN_COUNT_FIELD_NUMBER = 6;
        public static final int COVER_ALIGNMENT_FIELD_NUMBER = 7;
        public static final int DEFAULT_DECADE_DISPLAY_FIELD_NUMBER = 15;
        private static final NormalTagsBean DEFAULT_INSTANCE;
        public static final int DISPLAY_ORDER_FIELD_NUMBER = 3;
        public static final int FOOTER_LIST_TEXT_FIELD_NUMBER = 24;
        public static final int HEIGHT_FIELD_NUMBER = 26;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MODE_FIELD_NUMBER = 22;
        public static final int MORE_TEXT_FIELD_NUMBER = 23;
        public static final int NAME_FIELD_NUMBER = 2;
        private static final Parser<NormalTagsBean> PARSER;
        public static final int PLAY_INTERVAL_FIELD_NUMBER = 29;
        public static final int SECTIONS_FIELD_NUMBER = 31;
        public static final int SHOW_CATEGORY_FIELD_NUMBER = 12;
        public static final int SHOW_DECADE_FIELD_NUMBER = 14;
        public static final int SHOW_DIRECTOR_FIELD_NUMBER = 20;
        public static final int SHOW_LANGUAGE_FIELD_NUMBER = 13;
        public static final int SHOW_RATING_FIELD_NUMBER = 11;
        public static final int SHOW_REGION_FIELD_NUMBER = 16;
        public static final int SHOW_REMARKS_FIELD_NUMBER = 8;
        public static final int SHOW_STAR_FIELD_NUMBER = 19;
        public static final int SHOW_STATE_FIELD_NUMBER = 18;
        public static final int SHOW_SUBTITLE_FIELD_NUMBER = 9;
        public static final int SHOW_VERSION_FIELD_NUMBER = 17;
        public static final int SHOW_YEAR_FIELD_NUMBER = 10;
        public static final int STATE_FIELD_NUMBER = 21;
        public static final int TYPEID_FIELD_NUMBER = 4;
        public static final int TYPE_NAME_FIELD_NUMBER = 5;
        public static final int WIDTH_FIELD_NUMBER = 25;
        private static final long serialVersionUID = 0;
        private int autoPlay_;
        private volatile Object borderRadius_;
        private List<CarouselProto.CarouselBean> carousels_;
        private int columnCount_;
        private volatile Object coverAlignment_;
        private int defaultDecadeDisplay_;
        private int displayOrder_;
        private volatile Object footerListText_;
        private volatile Object height_;
        private long id_;
        private byte memoizedIsInitialized;
        private int mode_;
        private volatile Object moreText_;
        private volatile Object name_;
        private int playInterval_;
        private List<SectionProto.SectionBean> sections_;
        private int showCategory_;
        private int showDecade_;
        private int showDirector_;
        private int showLanguage_;
        private int showRating_;
        private int showRegion_;
        private int showRemarks_;
        private int showStar_;
        private int showState_;
        private int showSubtitle_;
        private int showVersion_;
        private int showYear_;
        private int state_;
        private int typeId_;
        private volatile Object typeName_;
        private volatile Object width_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements NormalTagsBeanOrBuilder {
            private int autoPlay_;
            private int bitField0_;
            private Object borderRadius_;
            private RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> carouselsBuilder_;
            private List<CarouselProto.CarouselBean> carousels_;
            private int columnCount_;
            private Object coverAlignment_;
            private int defaultDecadeDisplay_;
            private int displayOrder_;
            private Object footerListText_;
            private Object height_;
            private long id_;
            private int mode_;
            private Object moreText_;
            private Object name_;
            private int playInterval_;
            private RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> sectionsBuilder_;
            private List<SectionProto.SectionBean> sections_;
            private int showCategory_;
            private int showDecade_;
            private int showDirector_;
            private int showLanguage_;
            private int showRating_;
            private int showRegion_;
            private int showRemarks_;
            private int showStar_;
            private int showState_;
            private int showSubtitle_;
            private int showVersion_;
            private int showYear_;
            private int state_;
            private int typeId_;
            private Object typeName_;
            private Object width_;

            private Builder() {
                this.name_ = "";
                this.typeName_ = "";
                this.coverAlignment_ = "";
                this.moreText_ = "";
                this.footerListText_ = "";
                this.width_ = "";
                this.height_ = "";
                this.borderRadius_ = "";
                this.carousels_ = Collections.emptyList();
                this.sections_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.typeName_ = "";
                this.coverAlignment_ = "";
                this.moreText_ = "";
                this.footerListText_ = "";
                this.width_ = "";
                this.height_ = "";
                this.borderRadius_ = "";
                this.carousels_ = Collections.emptyList();
                this.sections_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(NormalTagsBean normalTagsBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    normalTagsBean.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    normalTagsBean.name_ = this.name_;
                }
                if ((i & 4) != 0) {
                    normalTagsBean.displayOrder_ = this.displayOrder_;
                }
                if ((i & 8) != 0) {
                    normalTagsBean.typeId_ = this.typeId_;
                }
                if ((i & 16) != 0) {
                    normalTagsBean.typeName_ = this.typeName_;
                }
                if ((i & 32) != 0) {
                    normalTagsBean.columnCount_ = this.columnCount_;
                }
                if ((i & 64) != 0) {
                    normalTagsBean.coverAlignment_ = this.coverAlignment_;
                }
                if ((i & 128) != 0) {
                    normalTagsBean.showRemarks_ = this.showRemarks_;
                }
                if ((i & 256) != 0) {
                    normalTagsBean.showSubtitle_ = this.showSubtitle_;
                }
                if ((i & 512) != 0) {
                    normalTagsBean.showYear_ = this.showYear_;
                }
                if ((i & 1024) != 0) {
                    normalTagsBean.showRating_ = this.showRating_;
                }
                if ((i & 2048) != 0) {
                    normalTagsBean.showCategory_ = this.showCategory_;
                }
                if ((i & 4096) != 0) {
                    normalTagsBean.showLanguage_ = this.showLanguage_;
                }
                if ((i & 8192) != 0) {
                    normalTagsBean.showDecade_ = this.showDecade_;
                }
                if ((i & 16384) != 0) {
                    normalTagsBean.defaultDecadeDisplay_ = this.defaultDecadeDisplay_;
                }
                if ((32768 & i) != 0) {
                    normalTagsBean.showRegion_ = this.showRegion_;
                }
                if ((65536 & i) != 0) {
                    normalTagsBean.showVersion_ = this.showVersion_;
                }
                if ((131072 & i) != 0) {
                    normalTagsBean.showState_ = this.showState_;
                }
                if ((262144 & i) != 0) {
                    normalTagsBean.showStar_ = this.showStar_;
                }
                if ((524288 & i) != 0) {
                    normalTagsBean.showDirector_ = this.showDirector_;
                }
                if ((1048576 & i) != 0) {
                    normalTagsBean.state_ = this.state_;
                }
                if ((2097152 & i) != 0) {
                    normalTagsBean.mode_ = this.mode_;
                }
                if ((4194304 & i) != 0) {
                    normalTagsBean.moreText_ = this.moreText_;
                }
                if ((8388608 & i) != 0) {
                    normalTagsBean.footerListText_ = this.footerListText_;
                }
                if ((16777216 & i) != 0) {
                    normalTagsBean.width_ = this.width_;
                }
                if ((33554432 & i) != 0) {
                    normalTagsBean.height_ = this.height_;
                }
                if ((67108864 & i) != 0) {
                    normalTagsBean.borderRadius_ = this.borderRadius_;
                }
                if ((134217728 & i) != 0) {
                    normalTagsBean.autoPlay_ = this.autoPlay_;
                }
                if ((i & 268435456) != 0) {
                    normalTagsBean.playInterval_ = this.playInterval_;
                }
            }

            private void buildPartialRepeatedFields(NormalTagsBean normalTagsBean) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    if ((this.bitField0_ & 536870912) != 0) {
                        this.carousels_ = Collections.unmodifiableList(this.carousels_);
                        this.bitField0_ &= -536870913;
                    }
                    normalTagsBean.carousels_ = this.carousels_;
                } else {
                    normalTagsBean.carousels_ = repeatedFieldBuilder.build();
                }
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder2 = this.sectionsBuilder_;
                if (repeatedFieldBuilder2 != null) {
                    normalTagsBean.sections_ = repeatedFieldBuilder2.build();
                    return;
                }
                if ((this.bitField0_ & 1073741824) != 0) {
                    this.sections_ = Collections.unmodifiableList(this.sections_);
                    this.bitField0_ &= -1073741825;
                }
                normalTagsBean.sections_ = this.sections_;
            }

            private void ensureCarouselsIsMutable() {
                if ((this.bitField0_ & 536870912) == 0) {
                    this.carousels_ = new ArrayList(this.carousels_);
                    this.bitField0_ |= 536870912;
                }
            }

            private void ensureSectionsIsMutable() {
                if ((this.bitField0_ & 1073741824) == 0) {
                    this.sections_ = new ArrayList(this.sections_);
                    this.bitField0_ |= 1073741824;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBean_descriptor;
            }

            private RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> internalGetCarouselsFieldBuilder() {
                if (this.carouselsBuilder_ == null) {
                    this.carouselsBuilder_ = new RepeatedFieldBuilder<>(this.carousels_, (this.bitField0_ & 536870912) != 0, getParentForChildren(), isClean());
                    this.carousels_ = null;
                }
                return this.carouselsBuilder_;
            }

            private RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> internalGetSectionsFieldBuilder() {
                if (this.sectionsBuilder_ == null) {
                    this.sectionsBuilder_ = new RepeatedFieldBuilder<>(this.sections_, (this.bitField0_ & 1073741824) != 0, getParentForChildren(), isClean());
                    this.sections_ = null;
                }
                return this.sectionsBuilder_;
            }

            public Builder addAllCarousels(Iterable<? extends CarouselProto.CarouselBean> iterable) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureCarouselsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.carousels_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllSections(Iterable<? extends SectionProto.SectionBean> iterable) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSectionsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sections_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addCarousels(int i, CarouselProto.CarouselBean.Builder builder) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureCarouselsIsMutable();
                    this.carousels_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addCarousels(int i, CarouselProto.CarouselBean carouselBean) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    carouselBean.getClass();
                    ensureCarouselsIsMutable();
                    this.carousels_.add(i, carouselBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, carouselBean);
                }
                return this;
            }

            public Builder addCarousels(CarouselProto.CarouselBean.Builder builder) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureCarouselsIsMutable();
                    this.carousels_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addCarousels(CarouselProto.CarouselBean carouselBean) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    carouselBean.getClass();
                    ensureCarouselsIsMutable();
                    this.carousels_.add(carouselBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(carouselBean);
                }
                return this;
            }

            public CarouselProto.CarouselBean.Builder addCarouselsBuilder() {
                return (CarouselProto.CarouselBean.Builder) internalGetCarouselsFieldBuilder().addBuilder(CarouselProto.CarouselBean.getDefaultInstance());
            }

            public CarouselProto.CarouselBean.Builder addCarouselsBuilder(int i) {
                return (CarouselProto.CarouselBean.Builder) internalGetCarouselsFieldBuilder().addBuilder(i, CarouselProto.CarouselBean.getDefaultInstance());
            }

            public Builder addSections(int i, SectionProto.SectionBean.Builder builder) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSectionsIsMutable();
                    this.sections_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addSections(int i, SectionProto.SectionBean sectionBean) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    sectionBean.getClass();
                    ensureSectionsIsMutable();
                    this.sections_.add(i, sectionBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, sectionBean);
                }
                return this;
            }

            public Builder addSections(SectionProto.SectionBean.Builder builder) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSectionsIsMutable();
                    this.sections_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addSections(SectionProto.SectionBean sectionBean) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    sectionBean.getClass();
                    ensureSectionsIsMutable();
                    this.sections_.add(sectionBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(sectionBean);
                }
                return this;
            }

            public SectionProto.SectionBean.Builder addSectionsBuilder() {
                return (SectionProto.SectionBean.Builder) internalGetSectionsFieldBuilder().addBuilder(SectionProto.SectionBean.getDefaultInstance());
            }

            public SectionProto.SectionBean.Builder addSectionsBuilder(int i) {
                return (SectionProto.SectionBean.Builder) internalGetSectionsFieldBuilder().addBuilder(i, SectionProto.SectionBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NormalTagsBean build() {
                NormalTagsBean normalTagsBeanBuildPartial = buildPartial();
                if (normalTagsBeanBuildPartial.isInitialized()) {
                    return normalTagsBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) normalTagsBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NormalTagsBean buildPartial() {
                NormalTagsBean normalTagsBean = new NormalTagsBean(this);
                buildPartialRepeatedFields(normalTagsBean);
                if (this.bitField0_ != 0) {
                    buildPartial0(normalTagsBean);
                }
                onBuilt();
                return normalTagsBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0L;
                this.name_ = "";
                this.displayOrder_ = 0;
                this.typeId_ = 0;
                this.typeName_ = "";
                this.columnCount_ = 0;
                this.coverAlignment_ = "";
                this.showRemarks_ = 0;
                this.showSubtitle_ = 0;
                this.showYear_ = 0;
                this.showRating_ = 0;
                this.showCategory_ = 0;
                this.showLanguage_ = 0;
                this.showDecade_ = 0;
                this.defaultDecadeDisplay_ = 0;
                this.showRegion_ = 0;
                this.showVersion_ = 0;
                this.showState_ = 0;
                this.showStar_ = 0;
                this.showDirector_ = 0;
                this.state_ = 0;
                this.mode_ = 0;
                this.moreText_ = "";
                this.footerListText_ = "";
                this.width_ = "";
                this.height_ = "";
                this.borderRadius_ = "";
                this.autoPlay_ = 0;
                this.playInterval_ = 0;
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.carousels_ = Collections.emptyList();
                } else {
                    this.carousels_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -536870913;
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder2 = this.sectionsBuilder_;
                if (repeatedFieldBuilder2 == null) {
                    this.sections_ = Collections.emptyList();
                } else {
                    this.sections_ = null;
                    repeatedFieldBuilder2.clear();
                }
                this.bitField0_ &= -1073741825;
                return this;
            }

            public Builder clearAutoPlay() {
                this.bitField0_ &= -134217729;
                this.autoPlay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearBorderRadius() {
                this.borderRadius_ = NormalTagsBean.getDefaultInstance().getBorderRadius();
                this.bitField0_ &= -67108865;
                onChanged();
                return this;
            }

            public Builder clearCarousels() {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.carousels_ = Collections.emptyList();
                    this.bitField0_ &= -536870913;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearColumnCount() {
                this.bitField0_ &= -33;
                this.columnCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCoverAlignment() {
                this.coverAlignment_ = NormalTagsBean.getDefaultInstance().getCoverAlignment();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearDefaultDecadeDisplay() {
                this.bitField0_ &= -16385;
                this.defaultDecadeDisplay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDisplayOrder() {
                this.bitField0_ &= -5;
                this.displayOrder_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFooterListText() {
                this.footerListText_ = NormalTagsBean.getDefaultInstance().getFooterListText();
                this.bitField0_ &= -8388609;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = NormalTagsBean.getDefaultInstance().getHeight();
                this.bitField0_ &= -33554433;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMode() {
                this.bitField0_ &= -2097153;
                this.mode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMoreText() {
                this.moreText_ = NormalTagsBean.getDefaultInstance().getMoreText();
                this.bitField0_ &= -4194305;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = NormalTagsBean.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearPlayInterval() {
                this.bitField0_ &= -268435457;
                this.playInterval_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSections() {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.sections_ = Collections.emptyList();
                    this.bitField0_ &= -1073741825;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearShowCategory() {
                this.bitField0_ &= -2049;
                this.showCategory_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowDecade() {
                this.bitField0_ &= -8193;
                this.showDecade_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowDirector() {
                this.bitField0_ &= -524289;
                this.showDirector_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowLanguage() {
                this.bitField0_ &= -4097;
                this.showLanguage_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowRating() {
                this.bitField0_ &= -1025;
                this.showRating_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowRegion() {
                this.bitField0_ &= -32769;
                this.showRegion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowRemarks() {
                this.bitField0_ &= -129;
                this.showRemarks_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowStar() {
                this.bitField0_ &= -262145;
                this.showStar_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowState() {
                this.bitField0_ &= -131073;
                this.showState_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowSubtitle() {
                this.bitField0_ &= -257;
                this.showSubtitle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowVersion() {
                this.bitField0_ &= -65537;
                this.showVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearShowYear() {
                this.bitField0_ &= -513;
                this.showYear_ = 0;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -1048577;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTypeId() {
                this.bitField0_ &= -9;
                this.typeId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTypeName() {
                this.typeName_ = NormalTagsBean.getDefaultInstance().getTypeName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = NormalTagsBean.getDefaultInstance().getWidth();
                this.bitField0_ &= -16777217;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getAutoPlay() {
                return this.autoPlay_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getBorderRadius() {
                Object obj = this.borderRadius_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.borderRadius_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getBorderRadiusBytes() {
                Object obj = this.borderRadius_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.borderRadius_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public CarouselProto.CarouselBean getCarousels(int i) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                return repeatedFieldBuilder == null ? this.carousels_.get(i) : (CarouselProto.CarouselBean) repeatedFieldBuilder.getMessage(i);
            }

            public CarouselProto.CarouselBean.Builder getCarouselsBuilder(int i) {
                return (CarouselProto.CarouselBean.Builder) internalGetCarouselsFieldBuilder().getBuilder(i);
            }

            public List<CarouselProto.CarouselBean.Builder> getCarouselsBuilderList() {
                return internalGetCarouselsFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getCarouselsCount() {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                return repeatedFieldBuilder == null ? this.carousels_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public List<CarouselProto.CarouselBean> getCarouselsList() {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.carousels_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public CarouselProto.CarouselBeanOrBuilder getCarouselsOrBuilder(int i) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                return repeatedFieldBuilder == null ? this.carousels_.get(i) : (CarouselProto.CarouselBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public List<? extends CarouselProto.CarouselBeanOrBuilder> getCarouselsOrBuilderList() {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.carousels_);
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getColumnCount() {
                return this.columnCount_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getCoverAlignment() {
                Object obj = this.coverAlignment_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.coverAlignment_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getCoverAlignmentBytes() {
                Object obj = this.coverAlignment_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.coverAlignment_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getDefaultDecadeDisplay() {
                return this.defaultDecadeDisplay_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NormalTagsBean getDefaultInstanceForType() {
                return NormalTagsBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBean_descriptor;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getDisplayOrder() {
                return this.displayOrder_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getFooterListText() {
                Object obj = this.footerListText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.footerListText_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getFooterListTextBytes() {
                Object obj = this.footerListText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.footerListText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getHeight() {
                Object obj = this.height_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.height_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getHeightBytes() {
                Object obj = this.height_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.height_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public long getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getMode() {
                return this.mode_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getMoreText() {
                Object obj = this.moreText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.moreText_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getMoreTextBytes() {
                Object obj = this.moreText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.moreText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getPlayInterval() {
                return this.playInterval_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public SectionProto.SectionBean getSections(int i) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                return repeatedFieldBuilder == null ? this.sections_.get(i) : (SectionProto.SectionBean) repeatedFieldBuilder.getMessage(i);
            }

            public SectionProto.SectionBean.Builder getSectionsBuilder(int i) {
                return (SectionProto.SectionBean.Builder) internalGetSectionsFieldBuilder().getBuilder(i);
            }

            public List<SectionProto.SectionBean.Builder> getSectionsBuilderList() {
                return internalGetSectionsFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getSectionsCount() {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                return repeatedFieldBuilder == null ? this.sections_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public List<SectionProto.SectionBean> getSectionsList() {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.sections_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public SectionProto.SectionBeanOrBuilder getSectionsOrBuilder(int i) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                return repeatedFieldBuilder == null ? this.sections_.get(i) : (SectionProto.SectionBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public List<? extends SectionProto.SectionBeanOrBuilder> getSectionsOrBuilderList() {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.sections_);
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowCategory() {
                return this.showCategory_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowDecade() {
                return this.showDecade_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowDirector() {
                return this.showDirector_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowLanguage() {
                return this.showLanguage_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowRating() {
                return this.showRating_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowRegion() {
                return this.showRegion_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowRemarks() {
                return this.showRemarks_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowStar() {
                return this.showStar_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowState() {
                return this.showState_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowSubtitle() {
                return this.showSubtitle_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowVersion() {
                return this.showVersion_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getShowYear() {
                return this.showYear_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getState() {
                return this.state_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public int getTypeId() {
                return this.typeId_;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getTypeName() {
                Object obj = this.typeName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.typeName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getTypeNameBytes() {
                Object obj = this.typeName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.typeName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public String getWidth() {
                Object obj = this.width_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.width_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
            public ByteString getWidthBytes() {
                Object obj = this.width_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.width_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBean_fieldAccessorTable.ensureFieldAccessorsInitialized(NormalTagsBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(NormalTagsBean normalTagsBean) {
                if (normalTagsBean == NormalTagsBean.getDefaultInstance()) {
                    return this;
                }
                if (normalTagsBean.getId() != 0) {
                    setId(normalTagsBean.getId());
                }
                if (!normalTagsBean.getName().isEmpty()) {
                    this.name_ = normalTagsBean.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (normalTagsBean.getDisplayOrder() != 0) {
                    setDisplayOrder(normalTagsBean.getDisplayOrder());
                }
                if (normalTagsBean.getTypeId() != 0) {
                    setTypeId(normalTagsBean.getTypeId());
                }
                if (!normalTagsBean.getTypeName().isEmpty()) {
                    this.typeName_ = normalTagsBean.typeName_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (normalTagsBean.getColumnCount() != 0) {
                    setColumnCount(normalTagsBean.getColumnCount());
                }
                if (!normalTagsBean.getCoverAlignment().isEmpty()) {
                    this.coverAlignment_ = normalTagsBean.coverAlignment_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (normalTagsBean.getShowRemarks() != 0) {
                    setShowRemarks(normalTagsBean.getShowRemarks());
                }
                if (normalTagsBean.getShowSubtitle() != 0) {
                    setShowSubtitle(normalTagsBean.getShowSubtitle());
                }
                if (normalTagsBean.getShowYear() != 0) {
                    setShowYear(normalTagsBean.getShowYear());
                }
                if (normalTagsBean.getShowRating() != 0) {
                    setShowRating(normalTagsBean.getShowRating());
                }
                if (normalTagsBean.getShowCategory() != 0) {
                    setShowCategory(normalTagsBean.getShowCategory());
                }
                if (normalTagsBean.getShowLanguage() != 0) {
                    setShowLanguage(normalTagsBean.getShowLanguage());
                }
                if (normalTagsBean.getShowDecade() != 0) {
                    setShowDecade(normalTagsBean.getShowDecade());
                }
                if (normalTagsBean.getDefaultDecadeDisplay() != 0) {
                    setDefaultDecadeDisplay(normalTagsBean.getDefaultDecadeDisplay());
                }
                if (normalTagsBean.getShowRegion() != 0) {
                    setShowRegion(normalTagsBean.getShowRegion());
                }
                if (normalTagsBean.getShowVersion() != 0) {
                    setShowVersion(normalTagsBean.getShowVersion());
                }
                if (normalTagsBean.getShowState() != 0) {
                    setShowState(normalTagsBean.getShowState());
                }
                if (normalTagsBean.getShowStar() != 0) {
                    setShowStar(normalTagsBean.getShowStar());
                }
                if (normalTagsBean.getShowDirector() != 0) {
                    setShowDirector(normalTagsBean.getShowDirector());
                }
                if (normalTagsBean.getState() != 0) {
                    setState(normalTagsBean.getState());
                }
                if (normalTagsBean.getMode() != 0) {
                    setMode(normalTagsBean.getMode());
                }
                if (!normalTagsBean.getMoreText().isEmpty()) {
                    this.moreText_ = normalTagsBean.moreText_;
                    this.bitField0_ |= 4194304;
                    onChanged();
                }
                if (!normalTagsBean.getFooterListText().isEmpty()) {
                    this.footerListText_ = normalTagsBean.footerListText_;
                    this.bitField0_ |= 8388608;
                    onChanged();
                }
                if (!normalTagsBean.getWidth().isEmpty()) {
                    this.width_ = normalTagsBean.width_;
                    this.bitField0_ |= 16777216;
                    onChanged();
                }
                if (!normalTagsBean.getHeight().isEmpty()) {
                    this.height_ = normalTagsBean.height_;
                    this.bitField0_ |= 33554432;
                    onChanged();
                }
                if (!normalTagsBean.getBorderRadius().isEmpty()) {
                    this.borderRadius_ = normalTagsBean.borderRadius_;
                    this.bitField0_ |= 67108864;
                    onChanged();
                }
                if (normalTagsBean.getAutoPlay() != 0) {
                    setAutoPlay(normalTagsBean.getAutoPlay());
                }
                if (normalTagsBean.getPlayInterval() != 0) {
                    setPlayInterval(normalTagsBean.getPlayInterval());
                }
                if (this.carouselsBuilder_ == null) {
                    if (!normalTagsBean.carousels_.isEmpty()) {
                        if (this.carousels_.isEmpty()) {
                            this.carousels_ = normalTagsBean.carousels_;
                            this.bitField0_ &= -536870913;
                        } else {
                            ensureCarouselsIsMutable();
                            this.carousels_.addAll(normalTagsBean.carousels_);
                        }
                        onChanged();
                    }
                } else if (!normalTagsBean.carousels_.isEmpty()) {
                    if (this.carouselsBuilder_.isEmpty()) {
                        this.carouselsBuilder_.dispose();
                        this.carouselsBuilder_ = null;
                        this.carousels_ = normalTagsBean.carousels_;
                        this.bitField0_ &= -536870913;
                        this.carouselsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetCarouselsFieldBuilder() : null;
                    } else {
                        this.carouselsBuilder_.addAllMessages(normalTagsBean.carousels_);
                    }
                }
                if (this.sectionsBuilder_ == null) {
                    if (!normalTagsBean.sections_.isEmpty()) {
                        if (this.sections_.isEmpty()) {
                            this.sections_ = normalTagsBean.sections_;
                            this.bitField0_ &= -1073741825;
                        } else {
                            ensureSectionsIsMutable();
                            this.sections_.addAll(normalTagsBean.sections_);
                        }
                        onChanged();
                    }
                } else if (!normalTagsBean.sections_.isEmpty()) {
                    if (this.sectionsBuilder_.isEmpty()) {
                        this.sectionsBuilder_.dispose();
                        this.sectionsBuilder_ = null;
                        this.sections_ = normalTagsBean.sections_;
                        this.bitField0_ &= -1073741825;
                        this.sectionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetSectionsFieldBuilder() : null;
                    } else {
                        this.sectionsBuilder_.addAllMessages(normalTagsBean.sections_);
                    }
                }
                mergeUnknownFields(normalTagsBean.getUnknownFields());
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
                                case 8:
                                    this.id_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.displayOrder_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 4;
                                    break;
                                case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                                    this.typeId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.typeName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.columnCount_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.coverAlignment_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.showRemarks_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.showSubtitle_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.showYear_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 512;
                                    break;
                                case 88:
                                    this.showRating_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 96:
                                    this.showCategory_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 104:
                                    this.showLanguage_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.showDecade_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 120:
                                    this.defaultDecadeDisplay_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 128:
                                    this.showRegion_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 136:
                                    this.showVersion_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 65536;
                                    break;
                                case 144:
                                    this.showState_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 131072;
                                    break;
                                case 152:
                                    this.showStar_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 262144;
                                    break;
                                case 160:
                                    this.showDirector_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 524288;
                                    break;
                                case 168:
                                    this.state_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1048576;
                                    break;
                                case 176:
                                    this.mode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2097152;
                                    break;
                                case 186:
                                    this.moreText_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4194304;
                                    break;
                                case 194:
                                    this.footerListText_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8388608;
                                    break;
                                case 202:
                                    this.width_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16777216;
                                    break;
                                case 210:
                                    this.height_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 33554432;
                                    break;
                                case 218:
                                    this.borderRadius_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 67108864;
                                    break;
                                case 224:
                                    this.autoPlay_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 134217728;
                                    break;
                                case 232:
                                    this.playInterval_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 268435456;
                                    break;
                                case 242:
                                    CarouselProto.CarouselBean carouselBean = (CarouselProto.CarouselBean) codedInputStream.readMessage(CarouselProto.CarouselBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureCarouselsIsMutable();
                                        this.carousels_.add(carouselBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(carouselBean);
                                    }
                                    break;
                                case 250:
                                    SectionProto.SectionBean sectionBean = (SectionProto.SectionBean) codedInputStream.readMessage(SectionProto.SectionBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder2 = this.sectionsBuilder_;
                                    if (repeatedFieldBuilder2 == null) {
                                        ensureSectionsIsMutable();
                                        this.sections_.add(sectionBean);
                                    } else {
                                        repeatedFieldBuilder2.addMessage(sectionBean);
                                    }
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
                if (message instanceof NormalTagsBean) {
                    return mergeFrom((NormalTagsBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeCarousels(int i) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureCarouselsIsMutable();
                    this.carousels_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder removeSections(int i) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSectionsIsMutable();
                    this.sections_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setAutoPlay(int i) {
                this.autoPlay_ = i;
                this.bitField0_ |= 134217728;
                onChanged();
                return this;
            }

            public Builder setBorderRadius(String str) {
                str.getClass();
                this.borderRadius_ = str;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setBorderRadiusBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.borderRadius_ = byteString;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setCarousels(int i, CarouselProto.CarouselBean.Builder builder) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureCarouselsIsMutable();
                    this.carousels_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setCarousels(int i, CarouselProto.CarouselBean carouselBean) {
                RepeatedFieldBuilder<CarouselProto.CarouselBean, CarouselProto.CarouselBean.Builder, CarouselProto.CarouselBeanOrBuilder> repeatedFieldBuilder = this.carouselsBuilder_;
                if (repeatedFieldBuilder == null) {
                    carouselBean.getClass();
                    ensureCarouselsIsMutable();
                    this.carousels_.set(i, carouselBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, carouselBean);
                }
                return this;
            }

            public Builder setColumnCount(int i) {
                this.columnCount_ = i;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCoverAlignment(String str) {
                str.getClass();
                this.coverAlignment_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCoverAlignmentBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.coverAlignment_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDefaultDecadeDisplay(int i) {
                this.defaultDecadeDisplay_ = i;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setDisplayOrder(int i) {
                this.displayOrder_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFooterListText(String str) {
                str.getClass();
                this.footerListText_ = str;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setFooterListTextBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.footerListText_ = byteString;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setHeight(String str) {
                str.getClass();
                this.height_ = str;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setHeightBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.height_ = byteString;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setId(long j) {
                this.id_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMode(int i) {
                this.mode_ = i;
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setMoreText(String str) {
                str.getClass();
                this.moreText_ = str;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setMoreTextBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.moreText_ = byteString;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPlayInterval(int i) {
                this.playInterval_ = i;
                this.bitField0_ |= 268435456;
                onChanged();
                return this;
            }

            public Builder setSections(int i, SectionProto.SectionBean.Builder builder) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureSectionsIsMutable();
                    this.sections_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setSections(int i, SectionProto.SectionBean sectionBean) {
                RepeatedFieldBuilder<SectionProto.SectionBean, SectionProto.SectionBean.Builder, SectionProto.SectionBeanOrBuilder> repeatedFieldBuilder = this.sectionsBuilder_;
                if (repeatedFieldBuilder == null) {
                    sectionBean.getClass();
                    ensureSectionsIsMutable();
                    this.sections_.set(i, sectionBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, sectionBean);
                }
                return this;
            }

            public Builder setShowCategory(int i) {
                this.showCategory_ = i;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setShowDecade(int i) {
                this.showDecade_ = i;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setShowDirector(int i) {
                this.showDirector_ = i;
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setShowLanguage(int i) {
                this.showLanguage_ = i;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setShowRating(int i) {
                this.showRating_ = i;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setShowRegion(int i) {
                this.showRegion_ = i;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setShowRemarks(int i) {
                this.showRemarks_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setShowStar(int i) {
                this.showStar_ = i;
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            public Builder setShowState(int i) {
                this.showState_ = i;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setShowSubtitle(int i) {
                this.showSubtitle_ = i;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setShowVersion(int i) {
                this.showVersion_ = i;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setShowYear(int i) {
                this.showYear_ = i;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setState(int i) {
                this.state_ = i;
                this.bitField0_ |= 1048576;
                onChanged();
                return this;
            }

            public Builder setTypeId(int i) {
                this.typeId_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTypeName(String str) {
                str.getClass();
                this.typeName_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTypeNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.typeName_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setWidth(String str) {
                str.getClass();
                this.width_ = str;
                this.bitField0_ |= 16777216;
                onChanged();
                return this;
            }

            public Builder setWidthBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.width_ = byteString;
                this.bitField0_ |= 16777216;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", NormalTagsBean.class.getName());
            DEFAULT_INSTANCE = new NormalTagsBean();
            PARSER = new AbstractParser<NormalTagsBean>() { // from class: com.base.model.proto.NormalTagsProto.NormalTagsBean.1
                @Override // com.google.protobuf.Parser
                public NormalTagsBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = NormalTagsBean.newBuilder();
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

        private NormalTagsBean() {
            this.id_ = 0L;
            this.name_ = "";
            this.displayOrder_ = 0;
            this.typeId_ = 0;
            this.typeName_ = "";
            this.columnCount_ = 0;
            this.coverAlignment_ = "";
            this.showRemarks_ = 0;
            this.showSubtitle_ = 0;
            this.showYear_ = 0;
            this.showRating_ = 0;
            this.showCategory_ = 0;
            this.showLanguage_ = 0;
            this.showDecade_ = 0;
            this.defaultDecadeDisplay_ = 0;
            this.showRegion_ = 0;
            this.showVersion_ = 0;
            this.showState_ = 0;
            this.showStar_ = 0;
            this.showDirector_ = 0;
            this.state_ = 0;
            this.mode_ = 0;
            this.moreText_ = "";
            this.footerListText_ = "";
            this.width_ = "";
            this.height_ = "";
            this.borderRadius_ = "";
            this.autoPlay_ = 0;
            this.playInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.typeName_ = "";
            this.coverAlignment_ = "";
            this.moreText_ = "";
            this.footerListText_ = "";
            this.width_ = "";
            this.height_ = "";
            this.borderRadius_ = "";
            this.carousels_ = Collections.emptyList();
            this.sections_ = Collections.emptyList();
        }

        public /* synthetic */ NormalTagsBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private NormalTagsBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0L;
            this.name_ = "";
            this.displayOrder_ = 0;
            this.typeId_ = 0;
            this.typeName_ = "";
            this.columnCount_ = 0;
            this.coverAlignment_ = "";
            this.showRemarks_ = 0;
            this.showSubtitle_ = 0;
            this.showYear_ = 0;
            this.showRating_ = 0;
            this.showCategory_ = 0;
            this.showLanguage_ = 0;
            this.showDecade_ = 0;
            this.defaultDecadeDisplay_ = 0;
            this.showRegion_ = 0;
            this.showVersion_ = 0;
            this.showState_ = 0;
            this.showStar_ = 0;
            this.showDirector_ = 0;
            this.state_ = 0;
            this.mode_ = 0;
            this.moreText_ = "";
            this.footerListText_ = "";
            this.width_ = "";
            this.height_ = "";
            this.borderRadius_ = "";
            this.autoPlay_ = 0;
            this.playInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NormalTagsBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(NormalTagsBean normalTagsBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(normalTagsBean);
        }

        public static NormalTagsBean parseDelimitedFrom(InputStream inputStream) {
            return (NormalTagsBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NormalTagsBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalTagsBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NormalTagsBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static NormalTagsBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NormalTagsBean parseFrom(CodedInputStream codedInputStream) {
            return (NormalTagsBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static NormalTagsBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalTagsBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static NormalTagsBean parseFrom(InputStream inputStream) {
            return (NormalTagsBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static NormalTagsBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalTagsBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NormalTagsBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static NormalTagsBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static NormalTagsBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NormalTagsBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<NormalTagsBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NormalTagsBean)) {
                return super.equals(obj);
            }
            NormalTagsBean normalTagsBean = (NormalTagsBean) obj;
            return getId() == normalTagsBean.getId() && getName().equals(normalTagsBean.getName()) && getDisplayOrder() == normalTagsBean.getDisplayOrder() && getTypeId() == normalTagsBean.getTypeId() && getTypeName().equals(normalTagsBean.getTypeName()) && getColumnCount() == normalTagsBean.getColumnCount() && getCoverAlignment().equals(normalTagsBean.getCoverAlignment()) && getShowRemarks() == normalTagsBean.getShowRemarks() && getShowSubtitle() == normalTagsBean.getShowSubtitle() && getShowYear() == normalTagsBean.getShowYear() && getShowRating() == normalTagsBean.getShowRating() && getShowCategory() == normalTagsBean.getShowCategory() && getShowLanguage() == normalTagsBean.getShowLanguage() && getShowDecade() == normalTagsBean.getShowDecade() && getDefaultDecadeDisplay() == normalTagsBean.getDefaultDecadeDisplay() && getShowRegion() == normalTagsBean.getShowRegion() && getShowVersion() == normalTagsBean.getShowVersion() && getShowState() == normalTagsBean.getShowState() && getShowStar() == normalTagsBean.getShowStar() && getShowDirector() == normalTagsBean.getShowDirector() && getState() == normalTagsBean.getState() && getMode() == normalTagsBean.getMode() && getMoreText().equals(normalTagsBean.getMoreText()) && getFooterListText().equals(normalTagsBean.getFooterListText()) && getWidth().equals(normalTagsBean.getWidth()) && getHeight().equals(normalTagsBean.getHeight()) && getBorderRadius().equals(normalTagsBean.getBorderRadius()) && getAutoPlay() == normalTagsBean.getAutoPlay() && getPlayInterval() == normalTagsBean.getPlayInterval() && getCarouselsList().equals(normalTagsBean.getCarouselsList()) && getSectionsList().equals(normalTagsBean.getSectionsList()) && getUnknownFields().equals(normalTagsBean.getUnknownFields());
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getAutoPlay() {
            return this.autoPlay_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getBorderRadius() {
            Object obj = this.borderRadius_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.borderRadius_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getBorderRadiusBytes() {
            Object obj = this.borderRadius_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.borderRadius_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public CarouselProto.CarouselBean getCarousels(int i) {
            return this.carousels_.get(i);
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getCarouselsCount() {
            return this.carousels_.size();
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public List<CarouselProto.CarouselBean> getCarouselsList() {
            return this.carousels_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public CarouselProto.CarouselBeanOrBuilder getCarouselsOrBuilder(int i) {
            return this.carousels_.get(i);
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public List<? extends CarouselProto.CarouselBeanOrBuilder> getCarouselsOrBuilderList() {
            return this.carousels_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getColumnCount() {
            return this.columnCount_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getCoverAlignment() {
            Object obj = this.coverAlignment_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.coverAlignment_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getCoverAlignmentBytes() {
            Object obj = this.coverAlignment_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.coverAlignment_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getDefaultDecadeDisplay() {
            return this.defaultDecadeDisplay_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NormalTagsBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getDisplayOrder() {
            return this.displayOrder_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getFooterListText() {
            Object obj = this.footerListText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.footerListText_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getFooterListTextBytes() {
            Object obj = this.footerListText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.footerListText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getHeight() {
            Object obj = this.height_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.height_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getHeightBytes() {
            Object obj = this.height_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.height_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getMode() {
            return this.mode_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getMoreText() {
            Object obj = this.moreText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.moreText_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getMoreTextBytes() {
            Object obj = this.moreText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.moreText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
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
        public Parser<NormalTagsBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getPlayInterval() {
            return this.playInterval_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public SectionProto.SectionBean getSections(int i) {
            return this.sections_.get(i);
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getSectionsCount() {
            return this.sections_.size();
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public List<SectionProto.SectionBean> getSectionsList() {
            return this.sections_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public SectionProto.SectionBeanOrBuilder getSectionsOrBuilder(int i) {
            return this.sections_.get(i);
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public List<? extends SectionProto.SectionBeanOrBuilder> getSectionsOrBuilderList() {
            return this.sections_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.id_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessage.isStringEmpty(this.name_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.name_);
            }
            int i2 = this.displayOrder_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeSInt32Size(3, i2);
            }
            int i3 = this.typeId_;
            if (i3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(4, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.typeName_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(5, this.typeName_);
            }
            int i4 = this.columnCount_;
            if (i4 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(6, i4);
            }
            if (!GeneratedMessage.isStringEmpty(this.coverAlignment_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(7, this.coverAlignment_);
            }
            int i5 = this.showRemarks_;
            if (i5 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(8, i5);
            }
            int i6 = this.showSubtitle_;
            if (i6 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(9, i6);
            }
            int i7 = this.showYear_;
            if (i7 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(10, i7);
            }
            int i8 = this.showRating_;
            if (i8 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(11, i8);
            }
            int i9 = this.showCategory_;
            if (i9 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(12, i9);
            }
            int i10 = this.showLanguage_;
            if (i10 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(13, i10);
            }
            int i11 = this.showDecade_;
            if (i11 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(14, i11);
            }
            int i12 = this.defaultDecadeDisplay_;
            if (i12 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(15, i12);
            }
            int i13 = this.showRegion_;
            if (i13 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(16, i13);
            }
            int i14 = this.showVersion_;
            if (i14 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(17, i14);
            }
            int i15 = this.showState_;
            if (i15 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(18, i15);
            }
            int i16 = this.showStar_;
            if (i16 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(19, i16);
            }
            int i17 = this.showDirector_;
            if (i17 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(20, i17);
            }
            int i18 = this.state_;
            if (i18 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(21, i18);
            }
            int i19 = this.mode_;
            if (i19 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(22, i19);
            }
            if (!GeneratedMessage.isStringEmpty(this.moreText_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(23, this.moreText_);
            }
            if (!GeneratedMessage.isStringEmpty(this.footerListText_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(24, this.footerListText_);
            }
            if (!GeneratedMessage.isStringEmpty(this.width_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(25, this.width_);
            }
            if (!GeneratedMessage.isStringEmpty(this.height_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(26, this.height_);
            }
            if (!GeneratedMessage.isStringEmpty(this.borderRadius_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(27, this.borderRadius_);
            }
            int i20 = this.autoPlay_;
            if (i20 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(28, i20);
            }
            int i21 = this.playInterval_;
            if (i21 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(29, i21);
            }
            for (int i22 = 0; i22 < this.carousels_.size(); i22++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(30, this.carousels_.get(i22));
            }
            for (int i23 = 0; i23 < this.sections_.size(); i23++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(31, this.sections_.get(i23));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowCategory() {
            return this.showCategory_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowDecade() {
            return this.showDecade_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowDirector() {
            return this.showDirector_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowLanguage() {
            return this.showLanguage_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowRating() {
            return this.showRating_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowRegion() {
            return this.showRegion_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowRemarks() {
            return this.showRemarks_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowStar() {
            return this.showStar_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowState() {
            return this.showState_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowSubtitle() {
            return this.showSubtitle_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowVersion() {
            return this.showVersion_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getShowYear() {
            return this.showYear_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getState() {
            return this.state_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public int getTypeId() {
            return this.typeId_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getTypeName() {
            Object obj = this.typeName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.typeName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getTypeNameBytes() {
            Object obj = this.typeName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.typeName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public String getWidth() {
            Object obj = this.width_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.width_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanOrBuilder
        public ByteString getWidthBytes() {
            Object obj = this.width_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.width_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int playInterval = getPlayInterval() + ((((getAutoPlay() + ((((getBorderRadius().hashCode() + ((((getHeight().hashCode() + ((((getWidth().hashCode() + ((((getFooterListText().hashCode() + ((((getMoreText().hashCode() + ((((getMode() + ((((getState() + ((((getShowDirector() + ((((getShowStar() + ((((getShowState() + ((((getShowVersion() + ((((getShowRegion() + ((((getDefaultDecadeDisplay() + ((((getShowDecade() + ((((getShowLanguage() + ((((getShowCategory() + ((((getShowRating() + ((((getShowYear() + ((((getShowSubtitle() + ((((getShowRemarks() + ((((getCoverAlignment().hashCode() + ((((getColumnCount() + ((((getTypeName().hashCode() + ((((getTypeId() + ((((getDisplayOrder() + ((((getName().hashCode() + ((((Internal.hashLong(getId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 23) * 53)) * 37) + 24) * 53)) * 37) + 25) * 53)) * 37) + 26) * 53)) * 37) + 27) * 53)) * 37) + 28) * 53)) * 37) + 29) * 53);
            if (getCarouselsCount() > 0) {
                playInterval = getCarouselsList().hashCode() + a.a(playInterval, 37, 30, 53);
            }
            if (getSectionsCount() > 0) {
                playInterval = getSectionsList().hashCode() + a.a(playInterval, 37, 31, 53);
            }
            int iHashCode = getUnknownFields().hashCode() + (playInterval * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBean_fieldAccessorTable.ensureFieldAccessorsInitialized(NormalTagsBean.class, Builder.class);
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
            long j = this.id_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.name_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.name_);
            }
            int i = this.displayOrder_;
            if (i != 0) {
                codedOutputStream.writeSInt32(3, i);
            }
            int i2 = this.typeId_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(4, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.typeName_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.typeName_);
            }
            int i3 = this.columnCount_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(6, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.coverAlignment_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.coverAlignment_);
            }
            int i4 = this.showRemarks_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(8, i4);
            }
            int i5 = this.showSubtitle_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(9, i5);
            }
            int i6 = this.showYear_;
            if (i6 != 0) {
                codedOutputStream.writeInt32(10, i6);
            }
            int i7 = this.showRating_;
            if (i7 != 0) {
                codedOutputStream.writeInt32(11, i7);
            }
            int i8 = this.showCategory_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(12, i8);
            }
            int i9 = this.showLanguage_;
            if (i9 != 0) {
                codedOutputStream.writeInt32(13, i9);
            }
            int i10 = this.showDecade_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(14, i10);
            }
            int i11 = this.defaultDecadeDisplay_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(15, i11);
            }
            int i12 = this.showRegion_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(16, i12);
            }
            int i13 = this.showVersion_;
            if (i13 != 0) {
                codedOutputStream.writeInt32(17, i13);
            }
            int i14 = this.showState_;
            if (i14 != 0) {
                codedOutputStream.writeInt32(18, i14);
            }
            int i15 = this.showStar_;
            if (i15 != 0) {
                codedOutputStream.writeInt32(19, i15);
            }
            int i16 = this.showDirector_;
            if (i16 != 0) {
                codedOutputStream.writeInt32(20, i16);
            }
            int i17 = this.state_;
            if (i17 != 0) {
                codedOutputStream.writeInt32(21, i17);
            }
            int i18 = this.mode_;
            if (i18 != 0) {
                codedOutputStream.writeInt32(22, i18);
            }
            if (!GeneratedMessage.isStringEmpty(this.moreText_)) {
                GeneratedMessage.writeString(codedOutputStream, 23, this.moreText_);
            }
            if (!GeneratedMessage.isStringEmpty(this.footerListText_)) {
                GeneratedMessage.writeString(codedOutputStream, 24, this.footerListText_);
            }
            if (!GeneratedMessage.isStringEmpty(this.width_)) {
                GeneratedMessage.writeString(codedOutputStream, 25, this.width_);
            }
            if (!GeneratedMessage.isStringEmpty(this.height_)) {
                GeneratedMessage.writeString(codedOutputStream, 26, this.height_);
            }
            if (!GeneratedMessage.isStringEmpty(this.borderRadius_)) {
                GeneratedMessage.writeString(codedOutputStream, 27, this.borderRadius_);
            }
            int i19 = this.autoPlay_;
            if (i19 != 0) {
                codedOutputStream.writeInt32(28, i19);
            }
            int i20 = this.playInterval_;
            if (i20 != 0) {
                codedOutputStream.writeInt32(29, i20);
            }
            for (int i21 = 0; i21 < this.carousels_.size(); i21++) {
                codedOutputStream.writeMessage(30, this.carousels_.get(i21));
            }
            for (int i22 = 0; i22 < this.sections_.size(); i22++) {
                codedOutputStream.writeMessage(31, this.sections_.get(i22));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface NormalTagsBeanOrBuilder extends MessageOrBuilder {
        int getAutoPlay();

        String getBorderRadius();

        ByteString getBorderRadiusBytes();

        CarouselProto.CarouselBean getCarousels(int i);

        int getCarouselsCount();

        List<CarouselProto.CarouselBean> getCarouselsList();

        CarouselProto.CarouselBeanOrBuilder getCarouselsOrBuilder(int i);

        List<? extends CarouselProto.CarouselBeanOrBuilder> getCarouselsOrBuilderList();

        int getColumnCount();

        String getCoverAlignment();

        ByteString getCoverAlignmentBytes();

        int getDefaultDecadeDisplay();

        int getDisplayOrder();

        String getFooterListText();

        ByteString getFooterListTextBytes();

        String getHeight();

        ByteString getHeightBytes();

        long getId();

        int getMode();

        String getMoreText();

        ByteString getMoreTextBytes();

        String getName();

        ByteString getNameBytes();

        int getPlayInterval();

        SectionProto.SectionBean getSections(int i);

        int getSectionsCount();

        List<SectionProto.SectionBean> getSectionsList();

        SectionProto.SectionBeanOrBuilder getSectionsOrBuilder(int i);

        List<? extends SectionProto.SectionBeanOrBuilder> getSectionsOrBuilderList();

        int getShowCategory();

        int getShowDecade();

        int getShowDirector();

        int getShowLanguage();

        int getShowRating();

        int getShowRegion();

        int getShowRemarks();

        int getShowStar();

        int getShowState();

        int getShowSubtitle();

        int getShowVersion();

        int getShowYear();

        int getState();

        int getTypeId();

        String getTypeName();

        ByteString getTypeNameBytes();

        String getWidth();

        ByteString getWidthBytes();
    }

    public final class NormalTagsBeanPage extends GeneratedMessage implements NormalTagsBeanPageOrBuilder {
        private static final NormalTagsBeanPage DEFAULT_INSTANCE;
        public static final int NORMALTAGSBEAN_FIELD_NUMBER = 1;
        private static final Parser<NormalTagsBeanPage> PARSER;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<NormalTagsBean> normalTagsBean_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements NormalTagsBeanPageOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> normalTagsBeanBuilder_;
            private List<NormalTagsBean> normalTagsBean_;

            private Builder() {
                this.normalTagsBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.normalTagsBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(NormalTagsBeanPage normalTagsBeanPage) {
            }

            private void buildPartialRepeatedFields(NormalTagsBeanPage normalTagsBeanPage) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder != null) {
                    normalTagsBeanPage.normalTagsBean_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.normalTagsBean_ = Collections.unmodifiableList(this.normalTagsBean_);
                    this.bitField0_ &= -2;
                }
                normalTagsBeanPage.normalTagsBean_ = this.normalTagsBean_;
            }

            private void ensureNormalTagsBeanIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.normalTagsBean_ = new ArrayList(this.normalTagsBean_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBeanPage_descriptor;
            }

            private RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> internalGetNormalTagsBeanFieldBuilder() {
                if (this.normalTagsBeanBuilder_ == null) {
                    this.normalTagsBeanBuilder_ = new RepeatedFieldBuilder<>(this.normalTagsBean_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.normalTagsBean_ = null;
                }
                return this.normalTagsBeanBuilder_;
            }

            public Builder addAllNormalTagsBean(Iterable<? extends NormalTagsBean> iterable) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureNormalTagsBeanIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.normalTagsBean_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addNormalTagsBean(int i, NormalTagsBean.Builder builder) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addNormalTagsBean(int i, NormalTagsBean normalTagsBean) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    normalTagsBean.getClass();
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.add(i, normalTagsBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, normalTagsBean);
                }
                return this;
            }

            public Builder addNormalTagsBean(NormalTagsBean.Builder builder) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addNormalTagsBean(NormalTagsBean normalTagsBean) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    normalTagsBean.getClass();
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.add(normalTagsBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(normalTagsBean);
                }
                return this;
            }

            public NormalTagsBean.Builder addNormalTagsBeanBuilder() {
                return (NormalTagsBean.Builder) internalGetNormalTagsBeanFieldBuilder().addBuilder(NormalTagsBean.getDefaultInstance());
            }

            public NormalTagsBean.Builder addNormalTagsBeanBuilder(int i) {
                return (NormalTagsBean.Builder) internalGetNormalTagsBeanFieldBuilder().addBuilder(i, NormalTagsBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NormalTagsBeanPage build() {
                NormalTagsBeanPage normalTagsBeanPageBuildPartial = buildPartial();
                if (normalTagsBeanPageBuildPartial.isInitialized()) {
                    return normalTagsBeanPageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) normalTagsBeanPageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public NormalTagsBeanPage buildPartial() {
                NormalTagsBeanPage normalTagsBeanPage = new NormalTagsBeanPage(this);
                buildPartialRepeatedFields(normalTagsBeanPage);
                if (this.bitField0_ != 0) {
                    buildPartial0(normalTagsBeanPage);
                }
                onBuilt();
                return normalTagsBeanPage;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.normalTagsBean_ = Collections.emptyList();
                } else {
                    this.normalTagsBean_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearNormalTagsBean() {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.normalTagsBean_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public NormalTagsBeanPage getDefaultInstanceForType() {
                return NormalTagsBeanPage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBeanPage_descriptor;
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
            public NormalTagsBean getNormalTagsBean(int i) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                return repeatedFieldBuilder == null ? this.normalTagsBean_.get(i) : (NormalTagsBean) repeatedFieldBuilder.getMessage(i);
            }

            public NormalTagsBean.Builder getNormalTagsBeanBuilder(int i) {
                return (NormalTagsBean.Builder) internalGetNormalTagsBeanFieldBuilder().getBuilder(i);
            }

            public List<NormalTagsBean.Builder> getNormalTagsBeanBuilderList() {
                return internalGetNormalTagsBeanFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
            public int getNormalTagsBeanCount() {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                return repeatedFieldBuilder == null ? this.normalTagsBean_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
            public List<NormalTagsBean> getNormalTagsBeanList() {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.normalTagsBean_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
            public NormalTagsBeanOrBuilder getNormalTagsBeanOrBuilder(int i) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                return repeatedFieldBuilder == null ? this.normalTagsBean_.get(i) : (NormalTagsBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
            public List<? extends NormalTagsBeanOrBuilder> getNormalTagsBeanOrBuilderList() {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.normalTagsBean_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(NormalTagsBeanPage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(NormalTagsBeanPage normalTagsBeanPage) {
                if (normalTagsBeanPage == NormalTagsBeanPage.getDefaultInstance()) {
                    return this;
                }
                if (this.normalTagsBeanBuilder_ == null) {
                    if (!normalTagsBeanPage.normalTagsBean_.isEmpty()) {
                        if (this.normalTagsBean_.isEmpty()) {
                            this.normalTagsBean_ = normalTagsBeanPage.normalTagsBean_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureNormalTagsBeanIsMutable();
                            this.normalTagsBean_.addAll(normalTagsBeanPage.normalTagsBean_);
                        }
                        onChanged();
                    }
                } else if (!normalTagsBeanPage.normalTagsBean_.isEmpty()) {
                    if (this.normalTagsBeanBuilder_.isEmpty()) {
                        this.normalTagsBeanBuilder_.dispose();
                        this.normalTagsBeanBuilder_ = null;
                        this.normalTagsBean_ = normalTagsBeanPage.normalTagsBean_;
                        this.bitField0_ &= -2;
                        this.normalTagsBeanBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetNormalTagsBeanFieldBuilder() : null;
                    } else {
                        this.normalTagsBeanBuilder_.addAllMessages(normalTagsBeanPage.normalTagsBean_);
                    }
                }
                mergeUnknownFields(normalTagsBeanPage.getUnknownFields());
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
                                    NormalTagsBean normalTagsBean = (NormalTagsBean) codedInputStream.readMessage(NormalTagsBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureNormalTagsBeanIsMutable();
                                        this.normalTagsBean_.add(normalTagsBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(normalTagsBean);
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

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof NormalTagsBeanPage) {
                    return mergeFrom((NormalTagsBeanPage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeNormalTagsBean(int i) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setNormalTagsBean(int i, NormalTagsBean.Builder builder) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setNormalTagsBean(int i, NormalTagsBean normalTagsBean) {
                RepeatedFieldBuilder<NormalTagsBean, NormalTagsBean.Builder, NormalTagsBeanOrBuilder> repeatedFieldBuilder = this.normalTagsBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    normalTagsBean.getClass();
                    ensureNormalTagsBeanIsMutable();
                    this.normalTagsBean_.set(i, normalTagsBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, normalTagsBean);
                }
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", NormalTagsBeanPage.class.getName());
            DEFAULT_INSTANCE = new NormalTagsBeanPage();
            PARSER = new AbstractParser<NormalTagsBeanPage>() { // from class: com.base.model.proto.NormalTagsProto.NormalTagsBeanPage.1
                @Override // com.google.protobuf.Parser
                public NormalTagsBeanPage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = NormalTagsBeanPage.newBuilder();
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

        private NormalTagsBeanPage() {
            this.memoizedIsInitialized = (byte) -1;
            this.normalTagsBean_ = Collections.emptyList();
        }

        public /* synthetic */ NormalTagsBeanPage(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private NormalTagsBeanPage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static NormalTagsBeanPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBeanPage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(NormalTagsBeanPage normalTagsBeanPage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(normalTagsBeanPage);
        }

        public static NormalTagsBeanPage parseDelimitedFrom(InputStream inputStream) {
            return (NormalTagsBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static NormalTagsBeanPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalTagsBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NormalTagsBeanPage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static NormalTagsBeanPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static NormalTagsBeanPage parseFrom(CodedInputStream codedInputStream) {
            return (NormalTagsBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static NormalTagsBeanPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalTagsBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static NormalTagsBeanPage parseFrom(InputStream inputStream) {
            return (NormalTagsBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static NormalTagsBeanPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NormalTagsBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static NormalTagsBeanPage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static NormalTagsBeanPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static NormalTagsBeanPage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static NormalTagsBeanPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<NormalTagsBeanPage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NormalTagsBeanPage)) {
                return super.equals(obj);
            }
            NormalTagsBeanPage normalTagsBeanPage = (NormalTagsBeanPage) obj;
            return getNormalTagsBeanList().equals(normalTagsBeanPage.getNormalTagsBeanList()) && getUnknownFields().equals(normalTagsBeanPage.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public NormalTagsBeanPage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
        public NormalTagsBean getNormalTagsBean(int i) {
            return this.normalTagsBean_.get(i);
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
        public int getNormalTagsBeanCount() {
            return this.normalTagsBean_.size();
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
        public List<NormalTagsBean> getNormalTagsBeanList() {
            return this.normalTagsBean_;
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
        public NormalTagsBeanOrBuilder getNormalTagsBeanOrBuilder(int i) {
            return this.normalTagsBean_.get(i);
        }

        @Override // com.base.model.proto.NormalTagsProto.NormalTagsBeanPageOrBuilder
        public List<? extends NormalTagsBeanOrBuilder> getNormalTagsBeanOrBuilderList() {
            return this.normalTagsBean_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<NormalTagsBeanPage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.normalTagsBean_.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.normalTagsBean_.get(i2));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getNormalTagsBeanCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getNormalTagsBeanList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return NormalTagsProto.internal_static_com_base_model_proto_NormalTagsBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(NormalTagsBeanPage.class, Builder.class);
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
            for (int i = 0; i < this.normalTagsBean_.size(); i++) {
                codedOutputStream.writeMessage(1, this.normalTagsBean_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface NormalTagsBeanPageOrBuilder extends MessageOrBuilder {
        NormalTagsBean getNormalTagsBean(int i);

        int getNormalTagsBeanCount();

        List<NormalTagsBean> getNormalTagsBeanList();

        NormalTagsBeanOrBuilder getNormalTagsBeanOrBuilder(int i);

        List<? extends NormalTagsBeanOrBuilder> getNormalTagsBeanOrBuilderList();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", NormalTagsProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010NormalTags.proto\u0012\u0014com.base.model.proto\u001a\u000eCarousel.proto\u001a\rSection.proto\"Ê\u0005\n\u000eNormalTagsBean\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0003\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u0015\n\rdisplay_order\u0018\u0003 \u0001(\u0011\u0012\u000e\n\u0006typeId\u0018\u0004 \u0001(\u0005\u0012\u0011\n\ttype_name\u0018\u0005 \u0001(\t\u0012\u0014\n\fcolumn_count\u0018\u0006 \u0001(\u0005\u0012\u0017\n\u000fcover_alignment\u0018\u0007 \u0001(\t\u0012\u0014\n\fshow_remarks\u0018\b \u0001(\u0005\u0012\u0015\n\rshow_subtitle\u0018\t \u0001(\u0005\u0012\u0011\n\tshow_year\u0018\n \u0001(\u0005\u0012\u0013\n\u000bshow_rating\u0018\u000b \u0001(\u0005\u0012\u0015\n\rshow_category\u0018\f \u0001(\u0005\u0012\u0015\n\rshow_language\u0018\r \u0001(\u0005\u0012\u0013\n\u000bshow_decade\u0018\u000e \u0001(\u0005\u0012\u001e\n\u0016default_decade_display\u0018\u000f \u0001(\u0005\u0012\u0013\n\u000bshow_region\u0018\u0010 \u0001(\u0005\u0012\u0014\n\fshow_version\u0018\u0011 \u0001(\u0005\u0012\u0012\n\nshow_state\u0018\u0012 \u0001(\u0005\u0012\u0011\n\tshow_star\u0018\u0013 \u0001(\u0005\u0012\u0015\n\rshow_director\u0018\u0014 \u0001(\u0005\u0012\r\n\u0005state\u0018\u0015 \u0001(\u0005\u0012\f\n\u0004mode\u0018\u0016 \u0001(\u0005\u0012\u0011\n\tmore_text\u0018\u0017 \u0001(\t\u0012\u0018\n\u0010footer_list_text\u0018\u0018 \u0001(\t\u0012\r\n\u0005width\u0018\u0019 \u0001(\t\u0012\u000e\n\u0006height\u0018\u001a \u0001(\t\u0012\u0015\n\rborder_radius\u0018\u001b \u0001(\t\u0012\u0011\n\tauto_play\u0018\u001c \u0001(\u0005\u0012\u0015\n\rplay_interval\u0018\u001d \u0001(\u0005\u00125\n\tcarousels\u0018\u001e \u0003(\u000b2\".com.base.model.proto.CarouselBean\u00123\n\bsections\u0018\u001f \u0003(\u000b2!.com.base.model.proto.SectionBean\"R\n\u0012NormalTagsBeanPage\u0012<\n\u000enormalTagsBean\u0018\u0001 \u0003(\u000b2$.com.base.model.proto.NormalTagsBeanB\u0011B\u000fNormalTagsProtob\u0006proto3"}, new Descriptors.FileDescriptor[]{CarouselProto.getDescriptor(), SectionProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_NormalTagsBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_NormalTagsBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Id", "Name", "DisplayOrder", "TypeId", "TypeName", "ColumnCount", "CoverAlignment", "ShowRemarks", "ShowSubtitle", "ShowYear", "ShowRating", "ShowCategory", "ShowLanguage", "ShowDecade", "DefaultDecadeDisplay", "ShowRegion", "ShowVersion", "ShowState", "ShowStar", "ShowDirector", "State", "Mode", "MoreText", "FooterListText", "Width", "Height", "BorderRadius", "AutoPlay", "PlayInterval", "Carousels", "Sections"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_NormalTagsBeanPage_descriptor = descriptor3;
        internal_static_com_base_model_proto_NormalTagsBeanPage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"NormalTagsBean"});
        descriptor.resolveAllFeaturesImmutable();
        CarouselProto.getDescriptor();
        SectionProto.getDescriptor();
    }

    private NormalTagsProto() {
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
