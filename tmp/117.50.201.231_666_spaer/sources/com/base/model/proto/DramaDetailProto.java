package com.base.model.proto;

import com.base.model.proto.DramaCoverImageProto;
import com.base.model.proto.DramaVideoProto;
import com.base.model.proto.FavoriteProto;
import com.base.model.proto.UserLikeProto;
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
public final class DramaDetailProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_DramaDetailBeanPage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_DramaDetailBeanPage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_DramaDetailBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_DramaDetailBean_fieldAccessorTable;

    public final class DramaDetailBean extends GeneratedMessage implements DramaDetailBeanOrBuilder {
        public static final int ACTOR_FIELD_NUMBER = 25;
        public static final int AREA_FIELD_NUMBER = 1;
        public static final int BRIEF_FIELD_NUMBER = 7;
        public static final int CATE_TYPE1_FIELD_NUMBER = 16;
        public static final int CATE_TYPE2_FIELD_NUMBER = 15;
        public static final int CONFIG_FIELD_NUMBER = 24;
        public static final int COVER_IMAGE_FIELD_NUMBER = 2;
        public static final int CREATE_TIME_FIELD_NUMBER = 3;
        private static final DramaDetailBean DEFAULT_INSTANCE;
        public static final int DIRECTOR_FIELD_NUMBER = 12;
        public static final int DOWNLOADS_FIELD_NUMBER = 30;
        public static final int FAVORITE_FIELD_NUMBER = 32;
        public static final int FAVORITE_ID_FIELD_NUMBER = 5;
        public static final int HITS_DAY_FIELD_NUMBER = 20;
        public static final int HITS_FIELD_NUMBER = 19;
        public static final int HITS_MONTH_FIELD_NUMBER = 22;
        public static final int HITS_WEEK_FIELD_NUMBER = 21;
        public static final int HOT_FIELD_NUMBER = 36;
        public static final int ID_FIELD_NUMBER = 4;
        public static final int INTRO_FIELD_NUMBER = 6;
        public static final int IS_END_FIELD_NUMBER = 27;
        public static final int KEYWORD_FIELD_NUMBER = 23;
        public static final int LIKE_FIELD_NUMBER = 8;
        public static final int NAME_FIELD_NUMBER = 9;
        private static final Parser<DramaDetailBean> PARSER;
        public static final int REMARK_FIELD_NUMBER = 26;
        public static final int SEASON_FIELD_NUMBER = 33;
        public static final int SERIAL_FIELD_NUMBER = 34;
        public static final int STARS_COUNT_FIELD_NUMBER = 11;
        public static final int STARS_FIELD_NUMBER = 10;
        public static final int TAG_FIELD_NUMBER = 13;
        public static final int TYPE_FIELD_NUMBER = 14;
        public static final int UPDATE_TIME_FIELD_NUMBER = 17;
        public static final int USER_LIKES_FIELD_NUMBER = 31;
        public static final int VIDEOS_FIELD_NUMBER = 29;
        public static final int VIP_FIELD_NUMBER = 35;
        public static final int VOD_PUBDATE_FIELD_NUMBER = 28;
        public static final int YEAR_FIELD_NUMBER = 18;
        private static final long serialVersionUID = 0;
        private volatile Object actor_;
        private volatile Object area_;
        private int bitField0_;
        private volatile Object brief_;
        private int cateType1_;
        private int cateType2_;
        private volatile Object config_;
        private DramaCoverImageProto.DramaCoverImageBean coverImage_;
        private long createTime_;
        private volatile Object director_;
        private List<DramaVideoProto.DramaVideoBean> downloads_;
        private int favoriteId_;
        private List<FavoriteProto.FavoriteBean> favorite_;
        private int hitsDay_;
        private int hitsMonth_;
        private int hitsWeek_;
        private int hits_;
        private boolean hot_;
        private int id_;
        private volatile Object intro_;
        private boolean isEnd_;
        private volatile Object keyword_;
        private int like_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object remark_;
        private boolean season_;
        private boolean serial_;
        private int starsCount_;
        private float stars_;
        private volatile Object tag_;
        private int type_;
        private long updateTime_;
        private List<UserLikeProto.UserLikeBean> userLikes_;
        private List<DramaVideoProto.DramaVideoBean> videos_;
        private boolean vip_;
        private volatile Object vodPubdate_;
        private int year_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements DramaDetailBeanOrBuilder {
            private Object actor_;
            private Object area_;
            private int bitField0_;
            private int bitField1_;
            private Object brief_;
            private int cateType1_;
            private int cateType2_;
            private Object config_;
            private SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> coverImageBuilder_;
            private DramaCoverImageProto.DramaCoverImageBean coverImage_;
            private long createTime_;
            private Object director_;
            private RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> downloadsBuilder_;
            private List<DramaVideoProto.DramaVideoBean> downloads_;
            private RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> favoriteBuilder_;
            private int favoriteId_;
            private List<FavoriteProto.FavoriteBean> favorite_;
            private int hitsDay_;
            private int hitsMonth_;
            private int hitsWeek_;
            private int hits_;
            private boolean hot_;
            private int id_;
            private Object intro_;
            private boolean isEnd_;
            private Object keyword_;
            private int like_;
            private Object name_;
            private Object remark_;
            private boolean season_;
            private boolean serial_;
            private int starsCount_;
            private float stars_;
            private Object tag_;
            private int type_;
            private long updateTime_;
            private RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> userLikesBuilder_;
            private List<UserLikeProto.UserLikeBean> userLikes_;
            private RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> videosBuilder_;
            private List<DramaVideoProto.DramaVideoBean> videos_;
            private boolean vip_;
            private Object vodPubdate_;
            private int year_;

            private Builder() {
                this.area_ = "";
                this.intro_ = "";
                this.brief_ = "";
                this.name_ = "";
                this.director_ = "";
                this.tag_ = "";
                this.keyword_ = "";
                this.config_ = "";
                this.actor_ = "";
                this.remark_ = "";
                this.vodPubdate_ = "";
                this.videos_ = Collections.emptyList();
                this.downloads_ = Collections.emptyList();
                this.userLikes_ = Collections.emptyList();
                this.favorite_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.area_ = "";
                this.intro_ = "";
                this.brief_ = "";
                this.name_ = "";
                this.director_ = "";
                this.tag_ = "";
                this.keyword_ = "";
                this.config_ = "";
                this.actor_ = "";
                this.remark_ = "";
                this.vodPubdate_ = "";
                this.videos_ = Collections.emptyList();
                this.downloads_ = Collections.emptyList();
                this.userLikes_ = Collections.emptyList();
                this.favorite_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(DramaDetailBean dramaDetailBean) {
                int i;
                int i2 = this.bitField0_;
                if ((i2 & 1) != 0) {
                    dramaDetailBean.area_ = this.area_;
                }
                if ((i2 & 2) != 0) {
                    SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                    dramaDetailBean.coverImage_ = singleFieldBuilder == null ? this.coverImage_ : (DramaCoverImageProto.DramaCoverImageBean) singleFieldBuilder.build();
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 4) != 0) {
                    dramaDetailBean.createTime_ = this.createTime_;
                }
                if ((i2 & 8) != 0) {
                    dramaDetailBean.id_ = this.id_;
                }
                if ((i2 & 16) != 0) {
                    dramaDetailBean.favoriteId_ = this.favoriteId_;
                }
                if ((i2 & 32) != 0) {
                    dramaDetailBean.intro_ = this.intro_;
                }
                if ((i2 & 64) != 0) {
                    dramaDetailBean.brief_ = this.brief_;
                }
                if ((i2 & 128) != 0) {
                    dramaDetailBean.like_ = this.like_;
                }
                if ((i2 & 256) != 0) {
                    dramaDetailBean.name_ = this.name_;
                }
                if ((i2 & 512) != 0) {
                    dramaDetailBean.stars_ = this.stars_;
                }
                if ((i2 & 1024) != 0) {
                    dramaDetailBean.starsCount_ = this.starsCount_;
                }
                if ((i2 & 2048) != 0) {
                    dramaDetailBean.director_ = this.director_;
                }
                if ((i2 & 4096) != 0) {
                    dramaDetailBean.tag_ = this.tag_;
                }
                if ((i2 & 8192) != 0) {
                    dramaDetailBean.type_ = this.type_;
                }
                if ((i2 & 16384) != 0) {
                    dramaDetailBean.cateType2_ = this.cateType2_;
                }
                if ((32768 & i2) != 0) {
                    dramaDetailBean.cateType1_ = this.cateType1_;
                }
                if ((65536 & i2) != 0) {
                    dramaDetailBean.updateTime_ = this.updateTime_;
                }
                if ((131072 & i2) != 0) {
                    dramaDetailBean.year_ = this.year_;
                }
                if ((262144 & i2) != 0) {
                    dramaDetailBean.hits_ = this.hits_;
                }
                if ((524288 & i2) != 0) {
                    dramaDetailBean.hitsDay_ = this.hitsDay_;
                }
                if ((1048576 & i2) != 0) {
                    dramaDetailBean.hitsWeek_ = this.hitsWeek_;
                }
                if ((2097152 & i2) != 0) {
                    dramaDetailBean.hitsMonth_ = this.hitsMonth_;
                }
                if ((4194304 & i2) != 0) {
                    dramaDetailBean.keyword_ = this.keyword_;
                }
                if ((8388608 & i2) != 0) {
                    dramaDetailBean.config_ = this.config_;
                }
                if ((16777216 & i2) != 0) {
                    dramaDetailBean.actor_ = this.actor_;
                }
                if ((33554432 & i2) != 0) {
                    dramaDetailBean.remark_ = this.remark_;
                }
                if ((67108864 & i2) != 0) {
                    dramaDetailBean.isEnd_ = this.isEnd_;
                }
                if ((i2 & 134217728) != 0) {
                    dramaDetailBean.vodPubdate_ = this.vodPubdate_;
                }
                dramaDetailBean.bitField0_ |= i;
            }

            private void buildPartial1(DramaDetailBean dramaDetailBean) {
                int i = this.bitField1_;
                if ((i & 1) != 0) {
                    dramaDetailBean.season_ = this.season_;
                }
                if ((i & 2) != 0) {
                    dramaDetailBean.serial_ = this.serial_;
                }
                if ((i & 4) != 0) {
                    dramaDetailBean.vip_ = this.vip_;
                }
                if ((i & 8) != 0) {
                    dramaDetailBean.hot_ = this.hot_;
                }
            }

            private void buildPartialRepeatedFields(DramaDetailBean dramaDetailBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    if ((this.bitField0_ & 268435456) != 0) {
                        this.videos_ = Collections.unmodifiableList(this.videos_);
                        this.bitField0_ &= -268435457;
                    }
                    dramaDetailBean.videos_ = this.videos_;
                } else {
                    dramaDetailBean.videos_ = repeatedFieldBuilder.build();
                }
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder2 = this.downloadsBuilder_;
                if (repeatedFieldBuilder2 == null) {
                    if ((this.bitField0_ & 536870912) != 0) {
                        this.downloads_ = Collections.unmodifiableList(this.downloads_);
                        this.bitField0_ &= -536870913;
                    }
                    dramaDetailBean.downloads_ = this.downloads_;
                } else {
                    dramaDetailBean.downloads_ = repeatedFieldBuilder2.build();
                }
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder3 = this.userLikesBuilder_;
                if (repeatedFieldBuilder3 == null) {
                    if ((this.bitField0_ & 1073741824) != 0) {
                        this.userLikes_ = Collections.unmodifiableList(this.userLikes_);
                        this.bitField0_ &= -1073741825;
                    }
                    dramaDetailBean.userLikes_ = this.userLikes_;
                } else {
                    dramaDetailBean.userLikes_ = repeatedFieldBuilder3.build();
                }
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder4 = this.favoriteBuilder_;
                if (repeatedFieldBuilder4 != null) {
                    dramaDetailBean.favorite_ = repeatedFieldBuilder4.build();
                    return;
                }
                if ((this.bitField0_ & Integer.MIN_VALUE) != 0) {
                    this.favorite_ = Collections.unmodifiableList(this.favorite_);
                    this.bitField0_ &= Integer.MAX_VALUE;
                }
                dramaDetailBean.favorite_ = this.favorite_;
            }

            private void ensureDownloadsIsMutable() {
                if ((this.bitField0_ & 536870912) == 0) {
                    this.downloads_ = new ArrayList(this.downloads_);
                    this.bitField0_ |= 536870912;
                }
            }

            private void ensureFavoriteIsMutable() {
                if ((this.bitField0_ & Integer.MIN_VALUE) == 0) {
                    this.favorite_ = new ArrayList(this.favorite_);
                    this.bitField0_ |= Integer.MIN_VALUE;
                }
            }

            private void ensureUserLikesIsMutable() {
                if ((this.bitField0_ & 1073741824) == 0) {
                    this.userLikes_ = new ArrayList(this.userLikes_);
                    this.bitField0_ |= 1073741824;
                }
            }

            private void ensureVideosIsMutable() {
                if ((this.bitField0_ & 268435456) == 0) {
                    this.videos_ = new ArrayList(this.videos_);
                    this.bitField0_ |= 268435456;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBean_descriptor;
            }

            private SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> internalGetCoverImageFieldBuilder() {
                if (this.coverImageBuilder_ == null) {
                    this.coverImageBuilder_ = new SingleFieldBuilder<>(getCoverImage(), getParentForChildren(), isClean());
                    this.coverImage_ = null;
                }
                return this.coverImageBuilder_;
            }

            private RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> internalGetDownloadsFieldBuilder() {
                if (this.downloadsBuilder_ == null) {
                    this.downloadsBuilder_ = new RepeatedFieldBuilder<>(this.downloads_, (this.bitField0_ & 536870912) != 0, getParentForChildren(), isClean());
                    this.downloads_ = null;
                }
                return this.downloadsBuilder_;
            }

            private RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> internalGetFavoriteFieldBuilder() {
                if (this.favoriteBuilder_ == null) {
                    this.favoriteBuilder_ = new RepeatedFieldBuilder<>(this.favorite_, (this.bitField0_ & Integer.MIN_VALUE) != 0, getParentForChildren(), isClean());
                    this.favorite_ = null;
                }
                return this.favoriteBuilder_;
            }

            private RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> internalGetUserLikesFieldBuilder() {
                if (this.userLikesBuilder_ == null) {
                    this.userLikesBuilder_ = new RepeatedFieldBuilder<>(this.userLikes_, (this.bitField0_ & 1073741824) != 0, getParentForChildren(), isClean());
                    this.userLikes_ = null;
                }
                return this.userLikesBuilder_;
            }

            private RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> internalGetVideosFieldBuilder() {
                if (this.videosBuilder_ == null) {
                    this.videosBuilder_ = new RepeatedFieldBuilder<>(this.videos_, (this.bitField0_ & 268435456) != 0, getParentForChildren(), isClean());
                    this.videos_ = null;
                }
                return this.videosBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessage.alwaysUseFieldBuilders) {
                    internalGetCoverImageFieldBuilder();
                    internalGetVideosFieldBuilder();
                    internalGetDownloadsFieldBuilder();
                    internalGetUserLikesFieldBuilder();
                    internalGetFavoriteFieldBuilder();
                }
            }

            public Builder addAllDownloads(Iterable<? extends DramaVideoProto.DramaVideoBean> iterable) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDownloadsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.downloads_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllFavorite(Iterable<? extends FavoriteProto.FavoriteBean> iterable) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.favorite_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllUserLikes(Iterable<? extends UserLikeProto.UserLikeBean> iterable) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.userLikes_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllVideos(Iterable<? extends DramaVideoProto.DramaVideoBean> iterable) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVideosIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.videos_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addDownloads(int i, DramaVideoProto.DramaVideoBean.Builder builder) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDownloadsIsMutable();
                    this.downloads_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addDownloads(int i, DramaVideoProto.DramaVideoBean dramaVideoBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaVideoBean.getClass();
                    ensureDownloadsIsMutable();
                    this.downloads_.add(i, dramaVideoBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, dramaVideoBean);
                }
                return this;
            }

            public Builder addDownloads(DramaVideoProto.DramaVideoBean.Builder builder) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDownloadsIsMutable();
                    this.downloads_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDownloads(DramaVideoProto.DramaVideoBean dramaVideoBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaVideoBean.getClass();
                    ensureDownloadsIsMutable();
                    this.downloads_.add(dramaVideoBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(dramaVideoBean);
                }
                return this;
            }

            public DramaVideoProto.DramaVideoBean.Builder addDownloadsBuilder() {
                return (DramaVideoProto.DramaVideoBean.Builder) internalGetDownloadsFieldBuilder().addBuilder(DramaVideoProto.DramaVideoBean.getDefaultInstance());
            }

            public DramaVideoProto.DramaVideoBean.Builder addDownloadsBuilder(int i) {
                return (DramaVideoProto.DramaVideoBean.Builder) internalGetDownloadsFieldBuilder().addBuilder(i, DramaVideoProto.DramaVideoBean.getDefaultInstance());
            }

            public Builder addFavorite(int i, FavoriteProto.FavoriteBean.Builder builder) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteIsMutable();
                    this.favorite_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addFavorite(int i, FavoriteProto.FavoriteBean favoriteBean) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    favoriteBean.getClass();
                    ensureFavoriteIsMutable();
                    this.favorite_.add(i, favoriteBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, favoriteBean);
                }
                return this;
            }

            public Builder addFavorite(FavoriteProto.FavoriteBean.Builder builder) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteIsMutable();
                    this.favorite_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFavorite(FavoriteProto.FavoriteBean favoriteBean) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    favoriteBean.getClass();
                    ensureFavoriteIsMutable();
                    this.favorite_.add(favoriteBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(favoriteBean);
                }
                return this;
            }

            public FavoriteProto.FavoriteBean.Builder addFavoriteBuilder() {
                return (FavoriteProto.FavoriteBean.Builder) internalGetFavoriteFieldBuilder().addBuilder(FavoriteProto.FavoriteBean.getDefaultInstance());
            }

            public FavoriteProto.FavoriteBean.Builder addFavoriteBuilder(int i) {
                return (FavoriteProto.FavoriteBean.Builder) internalGetFavoriteFieldBuilder().addBuilder(i, FavoriteProto.FavoriteBean.getDefaultInstance());
            }

            public Builder addUserLikes(int i, UserLikeProto.UserLikeBean.Builder builder) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikesIsMutable();
                    this.userLikes_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addUserLikes(int i, UserLikeProto.UserLikeBean userLikeBean) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    userLikeBean.getClass();
                    ensureUserLikesIsMutable();
                    this.userLikes_.add(i, userLikeBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, userLikeBean);
                }
                return this;
            }

            public Builder addUserLikes(UserLikeProto.UserLikeBean.Builder builder) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikesIsMutable();
                    this.userLikes_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUserLikes(UserLikeProto.UserLikeBean userLikeBean) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    userLikeBean.getClass();
                    ensureUserLikesIsMutable();
                    this.userLikes_.add(userLikeBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(userLikeBean);
                }
                return this;
            }

            public UserLikeProto.UserLikeBean.Builder addUserLikesBuilder() {
                return (UserLikeProto.UserLikeBean.Builder) internalGetUserLikesFieldBuilder().addBuilder(UserLikeProto.UserLikeBean.getDefaultInstance());
            }

            public UserLikeProto.UserLikeBean.Builder addUserLikesBuilder(int i) {
                return (UserLikeProto.UserLikeBean.Builder) internalGetUserLikesFieldBuilder().addBuilder(i, UserLikeProto.UserLikeBean.getDefaultInstance());
            }

            public Builder addVideos(int i, DramaVideoProto.DramaVideoBean.Builder builder) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVideosIsMutable();
                    this.videos_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addVideos(int i, DramaVideoProto.DramaVideoBean dramaVideoBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaVideoBean.getClass();
                    ensureVideosIsMutable();
                    this.videos_.add(i, dramaVideoBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, dramaVideoBean);
                }
                return this;
            }

            public Builder addVideos(DramaVideoProto.DramaVideoBean.Builder builder) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVideosIsMutable();
                    this.videos_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addVideos(DramaVideoProto.DramaVideoBean dramaVideoBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaVideoBean.getClass();
                    ensureVideosIsMutable();
                    this.videos_.add(dramaVideoBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(dramaVideoBean);
                }
                return this;
            }

            public DramaVideoProto.DramaVideoBean.Builder addVideosBuilder() {
                return (DramaVideoProto.DramaVideoBean.Builder) internalGetVideosFieldBuilder().addBuilder(DramaVideoProto.DramaVideoBean.getDefaultInstance());
            }

            public DramaVideoProto.DramaVideoBean.Builder addVideosBuilder(int i) {
                return (DramaVideoProto.DramaVideoBean.Builder) internalGetVideosFieldBuilder().addBuilder(i, DramaVideoProto.DramaVideoBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaDetailBean build() {
                DramaDetailBean dramaDetailBeanBuildPartial = buildPartial();
                if (dramaDetailBeanBuildPartial.isInitialized()) {
                    return dramaDetailBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dramaDetailBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaDetailBean buildPartial() {
                DramaDetailBean dramaDetailBean = new DramaDetailBean(this);
                buildPartialRepeatedFields(dramaDetailBean);
                if (this.bitField0_ != 0) {
                    buildPartial0(dramaDetailBean);
                }
                if (this.bitField1_ != 0) {
                    buildPartial1(dramaDetailBean);
                }
                onBuilt();
                return dramaDetailBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.bitField1_ = 0;
                this.area_ = "";
                this.coverImage_ = null;
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    singleFieldBuilder.dispose();
                    this.coverImageBuilder_ = null;
                }
                this.createTime_ = 0L;
                this.id_ = 0;
                this.favoriteId_ = 0;
                this.intro_ = "";
                this.brief_ = "";
                this.like_ = 0;
                this.name_ = "";
                this.stars_ = 0.0f;
                this.starsCount_ = 0;
                this.director_ = "";
                this.tag_ = "";
                this.type_ = 0;
                this.cateType2_ = 0;
                this.cateType1_ = 0;
                this.updateTime_ = 0L;
                this.year_ = 0;
                this.hits_ = 0;
                this.hitsDay_ = 0;
                this.hitsWeek_ = 0;
                this.hitsMonth_ = 0;
                this.keyword_ = "";
                this.config_ = "";
                this.actor_ = "";
                this.remark_ = "";
                this.isEnd_ = false;
                this.vodPubdate_ = "";
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.videos_ = Collections.emptyList();
                } else {
                    this.videos_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -268435457;
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder2 = this.downloadsBuilder_;
                if (repeatedFieldBuilder2 == null) {
                    this.downloads_ = Collections.emptyList();
                } else {
                    this.downloads_ = null;
                    repeatedFieldBuilder2.clear();
                }
                this.bitField0_ &= -536870913;
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder3 = this.userLikesBuilder_;
                if (repeatedFieldBuilder3 == null) {
                    this.userLikes_ = Collections.emptyList();
                } else {
                    this.userLikes_ = null;
                    repeatedFieldBuilder3.clear();
                }
                this.bitField0_ &= -1073741825;
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder4 = this.favoriteBuilder_;
                if (repeatedFieldBuilder4 == null) {
                    this.favorite_ = Collections.emptyList();
                } else {
                    this.favorite_ = null;
                    repeatedFieldBuilder4.clear();
                }
                this.bitField0_ &= Integer.MAX_VALUE;
                this.season_ = false;
                this.serial_ = false;
                this.vip_ = false;
                this.hot_ = false;
                return this;
            }

            public Builder clearActor() {
                this.actor_ = DramaDetailBean.getDefaultInstance().getActor();
                this.bitField0_ &= -16777217;
                onChanged();
                return this;
            }

            public Builder clearArea() {
                this.area_ = DramaDetailBean.getDefaultInstance().getArea();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearBrief() {
                this.brief_ = DramaDetailBean.getDefaultInstance().getBrief();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearCateType1() {
                this.bitField0_ &= -32769;
                this.cateType1_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCateType2() {
                this.bitField0_ &= -16385;
                this.cateType2_ = 0;
                onChanged();
                return this;
            }

            public Builder clearConfig() {
                this.config_ = DramaDetailBean.getDefaultInstance().getConfig();
                this.bitField0_ &= -8388609;
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

            public Builder clearCreateTime() {
                this.bitField0_ &= -5;
                this.createTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDirector() {
                this.director_ = DramaDetailBean.getDefaultInstance().getDirector();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearDownloads() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.downloads_ = Collections.emptyList();
                    this.bitField0_ &= -536870913;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearFavorite() {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.favorite_ = Collections.emptyList();
                    this.bitField0_ &= Integer.MAX_VALUE;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearFavoriteId() {
                this.bitField0_ &= -17;
                this.favoriteId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHits() {
                this.bitField0_ &= -262145;
                this.hits_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHitsDay() {
                this.bitField0_ &= -524289;
                this.hitsDay_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHitsMonth() {
                this.bitField0_ &= -2097153;
                this.hitsMonth_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHitsWeek() {
                this.bitField0_ &= -1048577;
                this.hitsWeek_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHot() {
                this.bitField1_ &= -9;
                this.hot_ = false;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -9;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIntro() {
                this.intro_ = DramaDetailBean.getDefaultInstance().getIntro();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearIsEnd() {
                this.bitField0_ &= -67108865;
                this.isEnd_ = false;
                onChanged();
                return this;
            }

            public Builder clearKeyword() {
                this.keyword_ = DramaDetailBean.getDefaultInstance().getKeyword();
                this.bitField0_ &= -4194305;
                onChanged();
                return this;
            }

            public Builder clearLike() {
                this.bitField0_ &= -129;
                this.like_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = DramaDetailBean.getDefaultInstance().getName();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearRemark() {
                this.remark_ = DramaDetailBean.getDefaultInstance().getRemark();
                this.bitField0_ &= -33554433;
                onChanged();
                return this;
            }

            public Builder clearSeason() {
                this.bitField1_ &= -2;
                this.season_ = false;
                onChanged();
                return this;
            }

            public Builder clearSerial() {
                this.bitField1_ &= -3;
                this.serial_ = false;
                onChanged();
                return this;
            }

            public Builder clearStars() {
                this.bitField0_ &= -513;
                this.stars_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStarsCount() {
                this.bitField0_ &= -1025;
                this.starsCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTag() {
                this.tag_ = DramaDetailBean.getDefaultInstance().getTag();
                this.bitField0_ &= -4097;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -8193;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUpdateTime() {
                this.bitField0_ &= -65537;
                this.updateTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserLikes() {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.userLikes_ = Collections.emptyList();
                    this.bitField0_ &= -1073741825;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearVideos() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.videos_ = Collections.emptyList();
                    this.bitField0_ &= -268435457;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearVip() {
                this.bitField1_ &= -5;
                this.vip_ = false;
                onChanged();
                return this;
            }

            public Builder clearVodPubdate() {
                this.vodPubdate_ = DramaDetailBean.getDefaultInstance().getVodPubdate();
                this.bitField0_ &= -134217729;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -131073;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getActor() {
                Object obj = this.actor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.actor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getActorBytes() {
                Object obj = this.actor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.actor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getArea() {
                Object obj = this.area_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.area_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getAreaBytes() {
                Object obj = this.area_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.area_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getBrief() {
                Object obj = this.brief_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.brief_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getBriefBytes() {
                Object obj = this.brief_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.brief_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getCateType1() {
                return this.cateType1_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getCateType2() {
                return this.cateType2_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getConfig() {
                Object obj = this.config_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.config_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getConfigBytes() {
                Object obj = this.config_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.config_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
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

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public DramaCoverImageProto.DramaCoverImageBeanOrBuilder getCoverImageOrBuilder() {
                SingleFieldBuilder<DramaCoverImageProto.DramaCoverImageBean, DramaCoverImageProto.DramaCoverImageBean.Builder, DramaCoverImageProto.DramaCoverImageBeanOrBuilder> singleFieldBuilder = this.coverImageBuilder_;
                if (singleFieldBuilder != null) {
                    return (DramaCoverImageProto.DramaCoverImageBeanOrBuilder) singleFieldBuilder.getMessageOrBuilder();
                }
                DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
                return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public long getCreateTime() {
                return this.createTime_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DramaDetailBean getDefaultInstanceForType() {
                return DramaDetailBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBean_descriptor;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getDirector() {
                Object obj = this.director_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.director_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getDirectorBytes() {
                Object obj = this.director_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.director_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public DramaVideoProto.DramaVideoBean getDownloads(int i) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                return repeatedFieldBuilder == null ? this.downloads_.get(i) : (DramaVideoProto.DramaVideoBean) repeatedFieldBuilder.getMessage(i);
            }

            public DramaVideoProto.DramaVideoBean.Builder getDownloadsBuilder(int i) {
                return (DramaVideoProto.DramaVideoBean.Builder) internalGetDownloadsFieldBuilder().getBuilder(i);
            }

            public List<DramaVideoProto.DramaVideoBean.Builder> getDownloadsBuilderList() {
                return internalGetDownloadsFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getDownloadsCount() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                return repeatedFieldBuilder == null ? this.downloads_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<DramaVideoProto.DramaVideoBean> getDownloadsList() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.downloads_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public DramaVideoProto.DramaVideoBeanOrBuilder getDownloadsOrBuilder(int i) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                return repeatedFieldBuilder == null ? this.downloads_.get(i) : (DramaVideoProto.DramaVideoBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<? extends DramaVideoProto.DramaVideoBeanOrBuilder> getDownloadsOrBuilderList() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.downloads_);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public FavoriteProto.FavoriteBean getFavorite(int i) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                return repeatedFieldBuilder == null ? this.favorite_.get(i) : (FavoriteProto.FavoriteBean) repeatedFieldBuilder.getMessage(i);
            }

            public FavoriteProto.FavoriteBean.Builder getFavoriteBuilder(int i) {
                return (FavoriteProto.FavoriteBean.Builder) internalGetFavoriteFieldBuilder().getBuilder(i);
            }

            public List<FavoriteProto.FavoriteBean.Builder> getFavoriteBuilderList() {
                return internalGetFavoriteFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getFavoriteCount() {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                return repeatedFieldBuilder == null ? this.favorite_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getFavoriteId() {
                return this.favoriteId_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<FavoriteProto.FavoriteBean> getFavoriteList() {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.favorite_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public FavoriteProto.FavoriteBeanOrBuilder getFavoriteOrBuilder(int i) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                return repeatedFieldBuilder == null ? this.favorite_.get(i) : (FavoriteProto.FavoriteBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<? extends FavoriteProto.FavoriteBeanOrBuilder> getFavoriteOrBuilderList() {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.favorite_);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getHits() {
                return this.hits_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getHitsDay() {
                return this.hitsDay_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getHitsMonth() {
                return this.hitsMonth_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getHitsWeek() {
                return this.hitsWeek_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public boolean getHot() {
                return this.hot_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getIntro() {
                Object obj = this.intro_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.intro_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getIntroBytes() {
                Object obj = this.intro_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.intro_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public boolean getIsEnd() {
                return this.isEnd_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getKeyword() {
                Object obj = this.keyword_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.keyword_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getKeywordBytes() {
                Object obj = this.keyword_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.keyword_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getLike() {
                return this.like_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getRemark() {
                Object obj = this.remark_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.remark_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getRemarkBytes() {
                Object obj = this.remark_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.remark_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public boolean getSeason() {
                return this.season_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public boolean getSerial() {
                return this.serial_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public float getStars() {
                return this.stars_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getStarsCount() {
                return this.starsCount_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getTag() {
                Object obj = this.tag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tag_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getTagBytes() {
                Object obj = this.tag_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tag_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public long getUpdateTime() {
                return this.updateTime_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public UserLikeProto.UserLikeBean getUserLikes(int i) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                return repeatedFieldBuilder == null ? this.userLikes_.get(i) : (UserLikeProto.UserLikeBean) repeatedFieldBuilder.getMessage(i);
            }

            public UserLikeProto.UserLikeBean.Builder getUserLikesBuilder(int i) {
                return (UserLikeProto.UserLikeBean.Builder) internalGetUserLikesFieldBuilder().getBuilder(i);
            }

            public List<UserLikeProto.UserLikeBean.Builder> getUserLikesBuilderList() {
                return internalGetUserLikesFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getUserLikesCount() {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                return repeatedFieldBuilder == null ? this.userLikes_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<UserLikeProto.UserLikeBean> getUserLikesList() {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.userLikes_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public UserLikeProto.UserLikeBeanOrBuilder getUserLikesOrBuilder(int i) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                return repeatedFieldBuilder == null ? this.userLikes_.get(i) : (UserLikeProto.UserLikeBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<? extends UserLikeProto.UserLikeBeanOrBuilder> getUserLikesOrBuilderList() {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.userLikes_);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public DramaVideoProto.DramaVideoBean getVideos(int i) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                return repeatedFieldBuilder == null ? this.videos_.get(i) : (DramaVideoProto.DramaVideoBean) repeatedFieldBuilder.getMessage(i);
            }

            public DramaVideoProto.DramaVideoBean.Builder getVideosBuilder(int i) {
                return (DramaVideoProto.DramaVideoBean.Builder) internalGetVideosFieldBuilder().getBuilder(i);
            }

            public List<DramaVideoProto.DramaVideoBean.Builder> getVideosBuilderList() {
                return internalGetVideosFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getVideosCount() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                return repeatedFieldBuilder == null ? this.videos_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<DramaVideoProto.DramaVideoBean> getVideosList() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.videos_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public DramaVideoProto.DramaVideoBeanOrBuilder getVideosOrBuilder(int i) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                return repeatedFieldBuilder == null ? this.videos_.get(i) : (DramaVideoProto.DramaVideoBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public List<? extends DramaVideoProto.DramaVideoBeanOrBuilder> getVideosOrBuilderList() {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.videos_);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public boolean getVip() {
                return this.vip_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public String getVodPubdate() {
                Object obj = this.vodPubdate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vodPubdate_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public ByteString getVodPubdateBytes() {
                Object obj = this.vodPubdate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vodPubdate_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
            public boolean hasCoverImage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaDetailBean.class, Builder.class);
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

            public Builder mergeFrom(DramaDetailBean dramaDetailBean) {
                if (dramaDetailBean == DramaDetailBean.getDefaultInstance()) {
                    return this;
                }
                if (!dramaDetailBean.getArea().isEmpty()) {
                    this.area_ = dramaDetailBean.area_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (dramaDetailBean.hasCoverImage()) {
                    mergeCoverImage(dramaDetailBean.getCoverImage());
                }
                if (dramaDetailBean.getCreateTime() != 0) {
                    setCreateTime(dramaDetailBean.getCreateTime());
                }
                if (dramaDetailBean.getId() != 0) {
                    setId(dramaDetailBean.getId());
                }
                if (dramaDetailBean.getFavoriteId() != 0) {
                    setFavoriteId(dramaDetailBean.getFavoriteId());
                }
                if (!dramaDetailBean.getIntro().isEmpty()) {
                    this.intro_ = dramaDetailBean.intro_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (!dramaDetailBean.getBrief().isEmpty()) {
                    this.brief_ = dramaDetailBean.brief_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (dramaDetailBean.getLike() != 0) {
                    setLike(dramaDetailBean.getLike());
                }
                if (!dramaDetailBean.getName().isEmpty()) {
                    this.name_ = dramaDetailBean.name_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                if (Float.floatToRawIntBits(dramaDetailBean.getStars()) != 0) {
                    setStars(dramaDetailBean.getStars());
                }
                if (dramaDetailBean.getStarsCount() != 0) {
                    setStarsCount(dramaDetailBean.getStarsCount());
                }
                if (!dramaDetailBean.getDirector().isEmpty()) {
                    this.director_ = dramaDetailBean.director_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                if (!dramaDetailBean.getTag().isEmpty()) {
                    this.tag_ = dramaDetailBean.tag_;
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                if (dramaDetailBean.getType() != 0) {
                    setType(dramaDetailBean.getType());
                }
                if (dramaDetailBean.getCateType2() != 0) {
                    setCateType2(dramaDetailBean.getCateType2());
                }
                if (dramaDetailBean.getCateType1() != 0) {
                    setCateType1(dramaDetailBean.getCateType1());
                }
                if (dramaDetailBean.getUpdateTime() != 0) {
                    setUpdateTime(dramaDetailBean.getUpdateTime());
                }
                if (dramaDetailBean.getYear() != 0) {
                    setYear(dramaDetailBean.getYear());
                }
                if (dramaDetailBean.getHits() != 0) {
                    setHits(dramaDetailBean.getHits());
                }
                if (dramaDetailBean.getHitsDay() != 0) {
                    setHitsDay(dramaDetailBean.getHitsDay());
                }
                if (dramaDetailBean.getHitsWeek() != 0) {
                    setHitsWeek(dramaDetailBean.getHitsWeek());
                }
                if (dramaDetailBean.getHitsMonth() != 0) {
                    setHitsMonth(dramaDetailBean.getHitsMonth());
                }
                if (!dramaDetailBean.getKeyword().isEmpty()) {
                    this.keyword_ = dramaDetailBean.keyword_;
                    this.bitField0_ |= 4194304;
                    onChanged();
                }
                if (!dramaDetailBean.getConfig().isEmpty()) {
                    this.config_ = dramaDetailBean.config_;
                    this.bitField0_ |= 8388608;
                    onChanged();
                }
                if (!dramaDetailBean.getActor().isEmpty()) {
                    this.actor_ = dramaDetailBean.actor_;
                    this.bitField0_ |= 16777216;
                    onChanged();
                }
                if (!dramaDetailBean.getRemark().isEmpty()) {
                    this.remark_ = dramaDetailBean.remark_;
                    this.bitField0_ |= 33554432;
                    onChanged();
                }
                if (dramaDetailBean.getIsEnd()) {
                    setIsEnd(dramaDetailBean.getIsEnd());
                }
                if (!dramaDetailBean.getVodPubdate().isEmpty()) {
                    this.vodPubdate_ = dramaDetailBean.vodPubdate_;
                    this.bitField0_ |= 134217728;
                    onChanged();
                }
                if (this.videosBuilder_ == null) {
                    if (!dramaDetailBean.videos_.isEmpty()) {
                        if (this.videos_.isEmpty()) {
                            this.videos_ = dramaDetailBean.videos_;
                            this.bitField0_ &= -268435457;
                        } else {
                            ensureVideosIsMutable();
                            this.videos_.addAll(dramaDetailBean.videos_);
                        }
                        onChanged();
                    }
                } else if (!dramaDetailBean.videos_.isEmpty()) {
                    if (this.videosBuilder_.isEmpty()) {
                        this.videosBuilder_.dispose();
                        this.videosBuilder_ = null;
                        this.videos_ = dramaDetailBean.videos_;
                        this.bitField0_ &= -268435457;
                        this.videosBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetVideosFieldBuilder() : null;
                    } else {
                        this.videosBuilder_.addAllMessages(dramaDetailBean.videos_);
                    }
                }
                if (this.downloadsBuilder_ == null) {
                    if (!dramaDetailBean.downloads_.isEmpty()) {
                        if (this.downloads_.isEmpty()) {
                            this.downloads_ = dramaDetailBean.downloads_;
                            this.bitField0_ &= -536870913;
                        } else {
                            ensureDownloadsIsMutable();
                            this.downloads_.addAll(dramaDetailBean.downloads_);
                        }
                        onChanged();
                    }
                } else if (!dramaDetailBean.downloads_.isEmpty()) {
                    if (this.downloadsBuilder_.isEmpty()) {
                        this.downloadsBuilder_.dispose();
                        this.downloadsBuilder_ = null;
                        this.downloads_ = dramaDetailBean.downloads_;
                        this.bitField0_ &= -536870913;
                        this.downloadsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDownloadsFieldBuilder() : null;
                    } else {
                        this.downloadsBuilder_.addAllMessages(dramaDetailBean.downloads_);
                    }
                }
                if (this.userLikesBuilder_ == null) {
                    if (!dramaDetailBean.userLikes_.isEmpty()) {
                        if (this.userLikes_.isEmpty()) {
                            this.userLikes_ = dramaDetailBean.userLikes_;
                            this.bitField0_ &= -1073741825;
                        } else {
                            ensureUserLikesIsMutable();
                            this.userLikes_.addAll(dramaDetailBean.userLikes_);
                        }
                        onChanged();
                    }
                } else if (!dramaDetailBean.userLikes_.isEmpty()) {
                    if (this.userLikesBuilder_.isEmpty()) {
                        this.userLikesBuilder_.dispose();
                        this.userLikesBuilder_ = null;
                        this.userLikes_ = dramaDetailBean.userLikes_;
                        this.bitField0_ &= -1073741825;
                        this.userLikesBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUserLikesFieldBuilder() : null;
                    } else {
                        this.userLikesBuilder_.addAllMessages(dramaDetailBean.userLikes_);
                    }
                }
                if (this.favoriteBuilder_ == null) {
                    if (!dramaDetailBean.favorite_.isEmpty()) {
                        if (this.favorite_.isEmpty()) {
                            this.favorite_ = dramaDetailBean.favorite_;
                            this.bitField0_ &= Integer.MAX_VALUE;
                        } else {
                            ensureFavoriteIsMutable();
                            this.favorite_.addAll(dramaDetailBean.favorite_);
                        }
                        onChanged();
                    }
                } else if (!dramaDetailBean.favorite_.isEmpty()) {
                    if (this.favoriteBuilder_.isEmpty()) {
                        this.favoriteBuilder_.dispose();
                        this.favoriteBuilder_ = null;
                        this.favorite_ = dramaDetailBean.favorite_;
                        this.bitField0_ &= Integer.MAX_VALUE;
                        this.favoriteBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFavoriteFieldBuilder() : null;
                    } else {
                        this.favoriteBuilder_.addAllMessages(dramaDetailBean.favorite_);
                    }
                }
                if (dramaDetailBean.getSeason()) {
                    setSeason(dramaDetailBean.getSeason());
                }
                if (dramaDetailBean.getSerial()) {
                    setSerial(dramaDetailBean.getSerial());
                }
                if (dramaDetailBean.getVip()) {
                    setVip(dramaDetailBean.getVip());
                }
                if (dramaDetailBean.getHot()) {
                    setHot(dramaDetailBean.getHot());
                }
                mergeUnknownFields(dramaDetailBean.getUnknownFields());
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
                                    this.createTime_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 4;
                                    break;
                                case DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                                    this.id_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8;
                                    break;
                                case 40:
                                    this.favoriteId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 16;
                                    break;
                                case 50:
                                    this.intro_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.brief_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.like_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 256;
                                    break;
                                case 85:
                                    this.stars_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 512;
                                    break;
                                case 88:
                                    this.starsCount_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 98:
                                    this.director_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 106:
                                    this.tag_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.type_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 120:
                                    this.cateType2_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 128:
                                    this.cateType1_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 136:
                                    this.updateTime_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 65536;
                                    break;
                                case 144:
                                    this.year_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 131072;
                                    break;
                                case 152:
                                    this.hits_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 262144;
                                    break;
                                case 160:
                                    this.hitsDay_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 524288;
                                    break;
                                case 168:
                                    this.hitsWeek_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1048576;
                                    break;
                                case 176:
                                    this.hitsMonth_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2097152;
                                    break;
                                case 186:
                                    this.keyword_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4194304;
                                    break;
                                case 194:
                                    this.config_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8388608;
                                    break;
                                case 202:
                                    this.actor_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16777216;
                                    break;
                                case 210:
                                    this.remark_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 33554432;
                                    break;
                                case 216:
                                    this.isEnd_ = codedInputStream.readBool();
                                    this.bitField0_ |= 67108864;
                                    break;
                                case 226:
                                    this.vodPubdate_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 134217728;
                                    break;
                                case 234:
                                    DramaVideoProto.DramaVideoBean dramaVideoBean = (DramaVideoProto.DramaVideoBean) codedInputStream.readMessage(DramaVideoProto.DramaVideoBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureVideosIsMutable();
                                        this.videos_.add(dramaVideoBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(dramaVideoBean);
                                    }
                                    break;
                                case 242:
                                    DramaVideoProto.DramaVideoBean dramaVideoBean2 = (DramaVideoProto.DramaVideoBean) codedInputStream.readMessage(DramaVideoProto.DramaVideoBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder2 = this.downloadsBuilder_;
                                    if (repeatedFieldBuilder2 == null) {
                                        ensureDownloadsIsMutable();
                                        this.downloads_.add(dramaVideoBean2);
                                    } else {
                                        repeatedFieldBuilder2.addMessage(dramaVideoBean2);
                                    }
                                    break;
                                case 250:
                                    UserLikeProto.UserLikeBean userLikeBean = (UserLikeProto.UserLikeBean) codedInputStream.readMessage(UserLikeProto.UserLikeBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder3 = this.userLikesBuilder_;
                                    if (repeatedFieldBuilder3 == null) {
                                        ensureUserLikesIsMutable();
                                        this.userLikes_.add(userLikeBean);
                                    } else {
                                        repeatedFieldBuilder3.addMessage(userLikeBean);
                                    }
                                    break;
                                case 258:
                                    FavoriteProto.FavoriteBean favoriteBean = (FavoriteProto.FavoriteBean) codedInputStream.readMessage(FavoriteProto.FavoriteBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder4 = this.favoriteBuilder_;
                                    if (repeatedFieldBuilder4 == null) {
                                        ensureFavoriteIsMutable();
                                        this.favorite_.add(favoriteBean);
                                    } else {
                                        repeatedFieldBuilder4.addMessage(favoriteBean);
                                    }
                                    break;
                                case 264:
                                    this.season_ = codedInputStream.readBool();
                                    this.bitField1_ |= 1;
                                    break;
                                case 272:
                                    this.serial_ = codedInputStream.readBool();
                                    this.bitField1_ |= 2;
                                    break;
                                case 280:
                                    this.vip_ = codedInputStream.readBool();
                                    this.bitField1_ |= 4;
                                    break;
                                case 288:
                                    this.hot_ = codedInputStream.readBool();
                                    this.bitField1_ |= 8;
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
                if (message instanceof DramaDetailBean) {
                    return mergeFrom((DramaDetailBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeDownloads(int i) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDownloadsIsMutable();
                    this.downloads_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder removeFavorite(int i) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteIsMutable();
                    this.favorite_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder removeUserLikes(int i) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikesIsMutable();
                    this.userLikes_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder removeVideos(int i) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVideosIsMutable();
                    this.videos_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setActor(String str) {
                str.getClass();
                this.actor_ = str;
                this.bitField0_ |= 16777216;
                onChanged();
                return this;
            }

            public Builder setActorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.actor_ = byteString;
                this.bitField0_ |= 16777216;
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
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setBriefBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.brief_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCateType1(int i) {
                this.cateType1_ = i;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setCateType2(int i) {
                this.cateType2_ = i;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setConfig(String str) {
                str.getClass();
                this.config_ = str;
                this.bitField0_ |= 8388608;
                onChanged();
                return this;
            }

            public Builder setConfigBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.config_ = byteString;
                this.bitField0_ |= 8388608;
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

            public Builder setCreateTime(long j) {
                this.createTime_ = j;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDirector(String str) {
                str.getClass();
                this.director_ = str;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDirectorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.director_ = byteString;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setDownloads(int i, DramaVideoProto.DramaVideoBean.Builder builder) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDownloadsIsMutable();
                    this.downloads_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setDownloads(int i, DramaVideoProto.DramaVideoBean dramaVideoBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.downloadsBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaVideoBean.getClass();
                    ensureDownloadsIsMutable();
                    this.downloads_.set(i, dramaVideoBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, dramaVideoBean);
                }
                return this;
            }

            public Builder setFavorite(int i, FavoriteProto.FavoriteBean.Builder builder) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteIsMutable();
                    this.favorite_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setFavorite(int i, FavoriteProto.FavoriteBean favoriteBean) {
                RepeatedFieldBuilder<FavoriteProto.FavoriteBean, FavoriteProto.FavoriteBean.Builder, FavoriteProto.FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBuilder_;
                if (repeatedFieldBuilder == null) {
                    favoriteBean.getClass();
                    ensureFavoriteIsMutable();
                    this.favorite_.set(i, favoriteBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, favoriteBean);
                }
                return this;
            }

            public Builder setFavoriteId(int i) {
                this.favoriteId_ = i;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setHits(int i) {
                this.hits_ = i;
                this.bitField0_ |= 262144;
                onChanged();
                return this;
            }

            public Builder setHitsDay(int i) {
                this.hitsDay_ = i;
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setHitsMonth(int i) {
                this.hitsMonth_ = i;
                this.bitField0_ |= 2097152;
                onChanged();
                return this;
            }

            public Builder setHitsWeek(int i) {
                this.hitsWeek_ = i;
                this.bitField0_ |= 1048576;
                onChanged();
                return this;
            }

            public Builder setHot(boolean z) {
                this.hot_ = z;
                this.bitField1_ |= 8;
                onChanged();
                return this;
            }

            public Builder setId(int i) {
                this.id_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setIntro(String str) {
                str.getClass();
                this.intro_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIntroBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.intro_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIsEnd(boolean z) {
                this.isEnd_ = z;
                this.bitField0_ |= 67108864;
                onChanged();
                return this;
            }

            public Builder setKeyword(String str) {
                str.getClass();
                this.keyword_ = str;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setKeywordBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.keyword_ = byteString;
                this.bitField0_ |= 4194304;
                onChanged();
                return this;
            }

            public Builder setLike(int i) {
                this.like_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setRemark(String str) {
                str.getClass();
                this.remark_ = str;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setRemarkBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.remark_ = byteString;
                this.bitField0_ |= 33554432;
                onChanged();
                return this;
            }

            public Builder setSeason(boolean z) {
                this.season_ = z;
                this.bitField1_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSerial(boolean z) {
                this.serial_ = z;
                this.bitField1_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStars(float f) {
                this.stars_ = f;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setStarsCount(int i) {
                this.starsCount_ = i;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setTag(String str) {
                str.getClass();
                this.tag_ = str;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.tag_ = byteString;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setType(int i) {
                this.type_ = i;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setUpdateTime(long j) {
                this.updateTime_ = j;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setUserLikes(int i, UserLikeProto.UserLikeBean.Builder builder) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikesIsMutable();
                    this.userLikes_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setUserLikes(int i, UserLikeProto.UserLikeBean userLikeBean) {
                RepeatedFieldBuilder<UserLikeProto.UserLikeBean, UserLikeProto.UserLikeBean.Builder, UserLikeProto.UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikesBuilder_;
                if (repeatedFieldBuilder == null) {
                    userLikeBean.getClass();
                    ensureUserLikesIsMutable();
                    this.userLikes_.set(i, userLikeBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, userLikeBean);
                }
                return this;
            }

            public Builder setVideos(int i, DramaVideoProto.DramaVideoBean.Builder builder) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureVideosIsMutable();
                    this.videos_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setVideos(int i, DramaVideoProto.DramaVideoBean dramaVideoBean) {
                RepeatedFieldBuilder<DramaVideoProto.DramaVideoBean, DramaVideoProto.DramaVideoBean.Builder, DramaVideoProto.DramaVideoBeanOrBuilder> repeatedFieldBuilder = this.videosBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaVideoBean.getClass();
                    ensureVideosIsMutable();
                    this.videos_.set(i, dramaVideoBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, dramaVideoBean);
                }
                return this;
            }

            public Builder setVip(boolean z) {
                this.vip_ = z;
                this.bitField1_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVodPubdate(String str) {
                str.getClass();
                this.vodPubdate_ = str;
                this.bitField0_ |= 134217728;
                onChanged();
                return this;
            }

            public Builder setVodPubdateBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.vodPubdate_ = byteString;
                this.bitField0_ |= 134217728;
                onChanged();
                return this;
            }

            public Builder setYear(int i) {
                this.year_ = i;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaDetailBean.class.getName());
            DEFAULT_INSTANCE = new DramaDetailBean();
            PARSER = new AbstractParser<DramaDetailBean>() { // from class: com.base.model.proto.DramaDetailProto.DramaDetailBean.1
                @Override // com.google.protobuf.Parser
                public DramaDetailBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = DramaDetailBean.newBuilder();
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

        private DramaDetailBean() {
            this.area_ = "";
            this.createTime_ = 0L;
            this.id_ = 0;
            this.favoriteId_ = 0;
            this.intro_ = "";
            this.brief_ = "";
            this.like_ = 0;
            this.name_ = "";
            this.stars_ = 0.0f;
            this.starsCount_ = 0;
            this.director_ = "";
            this.tag_ = "";
            this.type_ = 0;
            this.cateType2_ = 0;
            this.cateType1_ = 0;
            this.updateTime_ = 0L;
            this.year_ = 0;
            this.hits_ = 0;
            this.hitsDay_ = 0;
            this.hitsWeek_ = 0;
            this.hitsMonth_ = 0;
            this.keyword_ = "";
            this.config_ = "";
            this.actor_ = "";
            this.remark_ = "";
            this.isEnd_ = false;
            this.vodPubdate_ = "";
            this.season_ = false;
            this.serial_ = false;
            this.vip_ = false;
            this.hot_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.area_ = "";
            this.intro_ = "";
            this.brief_ = "";
            this.name_ = "";
            this.director_ = "";
            this.tag_ = "";
            this.keyword_ = "";
            this.config_ = "";
            this.actor_ = "";
            this.remark_ = "";
            this.vodPubdate_ = "";
            this.videos_ = Collections.emptyList();
            this.downloads_ = Collections.emptyList();
            this.userLikes_ = Collections.emptyList();
            this.favorite_ = Collections.emptyList();
        }

        public /* synthetic */ DramaDetailBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private DramaDetailBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.area_ = "";
            this.createTime_ = 0L;
            this.id_ = 0;
            this.favoriteId_ = 0;
            this.intro_ = "";
            this.brief_ = "";
            this.like_ = 0;
            this.name_ = "";
            this.stars_ = 0.0f;
            this.starsCount_ = 0;
            this.director_ = "";
            this.tag_ = "";
            this.type_ = 0;
            this.cateType2_ = 0;
            this.cateType1_ = 0;
            this.updateTime_ = 0L;
            this.year_ = 0;
            this.hits_ = 0;
            this.hitsDay_ = 0;
            this.hitsWeek_ = 0;
            this.hitsMonth_ = 0;
            this.keyword_ = "";
            this.config_ = "";
            this.actor_ = "";
            this.remark_ = "";
            this.isEnd_ = false;
            this.vodPubdate_ = "";
            this.season_ = false;
            this.serial_ = false;
            this.vip_ = false;
            this.hot_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DramaDetailBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DramaDetailBean dramaDetailBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dramaDetailBean);
        }

        public static DramaDetailBean parseDelimitedFrom(InputStream inputStream) {
            return (DramaDetailBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DramaDetailBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaDetailBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaDetailBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static DramaDetailBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DramaDetailBean parseFrom(CodedInputStream codedInputStream) {
            return (DramaDetailBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DramaDetailBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaDetailBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DramaDetailBean parseFrom(InputStream inputStream) {
            return (DramaDetailBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static DramaDetailBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaDetailBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaDetailBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DramaDetailBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DramaDetailBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DramaDetailBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<DramaDetailBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DramaDetailBean)) {
                return super.equals(obj);
            }
            DramaDetailBean dramaDetailBean = (DramaDetailBean) obj;
            if (getArea().equals(dramaDetailBean.getArea()) && hasCoverImage() == dramaDetailBean.hasCoverImage()) {
                return (!hasCoverImage() || getCoverImage().equals(dramaDetailBean.getCoverImage())) && getCreateTime() == dramaDetailBean.getCreateTime() && getId() == dramaDetailBean.getId() && getFavoriteId() == dramaDetailBean.getFavoriteId() && getIntro().equals(dramaDetailBean.getIntro()) && getBrief().equals(dramaDetailBean.getBrief()) && getLike() == dramaDetailBean.getLike() && getName().equals(dramaDetailBean.getName()) && Float.floatToIntBits(getStars()) == Float.floatToIntBits(dramaDetailBean.getStars()) && getStarsCount() == dramaDetailBean.getStarsCount() && getDirector().equals(dramaDetailBean.getDirector()) && getTag().equals(dramaDetailBean.getTag()) && getType() == dramaDetailBean.getType() && getCateType2() == dramaDetailBean.getCateType2() && getCateType1() == dramaDetailBean.getCateType1() && getUpdateTime() == dramaDetailBean.getUpdateTime() && getYear() == dramaDetailBean.getYear() && getHits() == dramaDetailBean.getHits() && getHitsDay() == dramaDetailBean.getHitsDay() && getHitsWeek() == dramaDetailBean.getHitsWeek() && getHitsMonth() == dramaDetailBean.getHitsMonth() && getKeyword().equals(dramaDetailBean.getKeyword()) && getConfig().equals(dramaDetailBean.getConfig()) && getActor().equals(dramaDetailBean.getActor()) && getRemark().equals(dramaDetailBean.getRemark()) && getIsEnd() == dramaDetailBean.getIsEnd() && getVodPubdate().equals(dramaDetailBean.getVodPubdate()) && getVideosList().equals(dramaDetailBean.getVideosList()) && getDownloadsList().equals(dramaDetailBean.getDownloadsList()) && getUserLikesList().equals(dramaDetailBean.getUserLikesList()) && getFavoriteList().equals(dramaDetailBean.getFavoriteList()) && getSeason() == dramaDetailBean.getSeason() && getSerial() == dramaDetailBean.getSerial() && getVip() == dramaDetailBean.getVip() && getHot() == dramaDetailBean.getHot() && getUnknownFields().equals(dramaDetailBean.getUnknownFields());
            }
            return false;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getActor() {
            Object obj = this.actor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.actor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getActorBytes() {
            Object obj = this.actor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.actor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getArea() {
            Object obj = this.area_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.area_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getAreaBytes() {
            Object obj = this.area_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.area_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getBrief() {
            Object obj = this.brief_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.brief_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getBriefBytes() {
            Object obj = this.brief_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.brief_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getCateType1() {
            return this.cateType1_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getCateType2() {
            return this.cateType2_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getConfig() {
            Object obj = this.config_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.config_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getConfigBytes() {
            Object obj = this.config_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.config_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public DramaCoverImageProto.DramaCoverImageBean getCoverImage() {
            DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
            return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public DramaCoverImageProto.DramaCoverImageBeanOrBuilder getCoverImageOrBuilder() {
            DramaCoverImageProto.DramaCoverImageBean dramaCoverImageBean = this.coverImage_;
            return dramaCoverImageBean == null ? DramaCoverImageProto.DramaCoverImageBean.getDefaultInstance() : dramaCoverImageBean;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public long getCreateTime() {
            return this.createTime_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DramaDetailBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getDirector() {
            Object obj = this.director_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.director_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getDirectorBytes() {
            Object obj = this.director_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.director_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public DramaVideoProto.DramaVideoBean getDownloads(int i) {
            return this.downloads_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getDownloadsCount() {
            return this.downloads_.size();
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<DramaVideoProto.DramaVideoBean> getDownloadsList() {
            return this.downloads_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public DramaVideoProto.DramaVideoBeanOrBuilder getDownloadsOrBuilder(int i) {
            return this.downloads_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<? extends DramaVideoProto.DramaVideoBeanOrBuilder> getDownloadsOrBuilderList() {
            return this.downloads_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public FavoriteProto.FavoriteBean getFavorite(int i) {
            return this.favorite_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getFavoriteCount() {
            return this.favorite_.size();
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getFavoriteId() {
            return this.favoriteId_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<FavoriteProto.FavoriteBean> getFavoriteList() {
            return this.favorite_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public FavoriteProto.FavoriteBeanOrBuilder getFavoriteOrBuilder(int i) {
            return this.favorite_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<? extends FavoriteProto.FavoriteBeanOrBuilder> getFavoriteOrBuilderList() {
            return this.favorite_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getHits() {
            return this.hits_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getHitsDay() {
            return this.hitsDay_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getHitsMonth() {
            return this.hitsMonth_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getHitsWeek() {
            return this.hitsWeek_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public boolean getHot() {
            return this.hot_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getIntro() {
            Object obj = this.intro_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.intro_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getIntroBytes() {
            Object obj = this.intro_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.intro_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public boolean getIsEnd() {
            return this.isEnd_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getKeyword() {
            Object obj = this.keyword_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.keyword_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getKeywordBytes() {
            Object obj = this.keyword_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.keyword_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getLike() {
            return this.like_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
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
        public Parser<DramaDetailBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getRemark() {
            Object obj = this.remark_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.remark_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getRemarkBytes() {
            Object obj = this.remark_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.remark_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public boolean getSeason() {
            return this.season_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public boolean getSerial() {
            return this.serial_;
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
            long j = this.createTime_;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(3, j);
            }
            int i2 = this.id_;
            if (i2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(4, i2);
            }
            int i3 = this.favoriteId_;
            if (i3 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(5, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.intro_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(6, this.intro_);
            }
            if (!GeneratedMessage.isStringEmpty(this.brief_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.brief_);
            }
            int i4 = this.like_;
            if (i4 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(8, i4);
            }
            if (!GeneratedMessage.isStringEmpty(this.name_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(9, this.name_);
            }
            if (Float.floatToRawIntBits(this.stars_) != 0) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(10, this.stars_);
            }
            int i5 = this.starsCount_;
            if (i5 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(11, i5);
            }
            if (!GeneratedMessage.isStringEmpty(this.director_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(12, this.director_);
            }
            if (!GeneratedMessage.isStringEmpty(this.tag_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(13, this.tag_);
            }
            int i6 = this.type_;
            if (i6 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(14, i6);
            }
            int i7 = this.cateType2_;
            if (i7 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(15, i7);
            }
            int i8 = this.cateType1_;
            if (i8 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(16, i8);
            }
            long j2 = this.updateTime_;
            if (j2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(17, j2);
            }
            int i9 = this.year_;
            if (i9 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(18, i9);
            }
            int i10 = this.hits_;
            if (i10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(19, i10);
            }
            int i11 = this.hitsDay_;
            if (i11 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(20, i11);
            }
            int i12 = this.hitsWeek_;
            if (i12 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(21, i12);
            }
            int i13 = this.hitsMonth_;
            if (i13 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(22, i13);
            }
            if (!GeneratedMessage.isStringEmpty(this.keyword_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(23, this.keyword_);
            }
            if (!GeneratedMessage.isStringEmpty(this.config_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(24, this.config_);
            }
            if (!GeneratedMessage.isStringEmpty(this.actor_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(25, this.actor_);
            }
            if (!GeneratedMessage.isStringEmpty(this.remark_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(26, this.remark_);
            }
            boolean z = this.isEnd_;
            if (z) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(27, z);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodPubdate_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(28, this.vodPubdate_);
            }
            for (int i14 = 0; i14 < this.videos_.size(); i14++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(29, this.videos_.get(i14));
            }
            for (int i15 = 0; i15 < this.downloads_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(30, this.downloads_.get(i15));
            }
            for (int i16 = 0; i16 < this.userLikes_.size(); i16++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(31, this.userLikes_.get(i16));
            }
            for (int i17 = 0; i17 < this.favorite_.size(); i17++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(32, this.favorite_.get(i17));
            }
            boolean z2 = this.season_;
            if (z2) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(33, z2);
            }
            boolean z3 = this.serial_;
            if (z3) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(34, z3);
            }
            boolean z4 = this.vip_;
            if (z4) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(35, z4);
            }
            boolean z5 = this.hot_;
            if (z5) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(36, z5);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public float getStars() {
            return this.stars_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getStarsCount() {
            return this.starsCount_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getTag() {
            Object obj = this.tag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tag_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getTagBytes() {
            Object obj = this.tag_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tag_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public long getUpdateTime() {
            return this.updateTime_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public UserLikeProto.UserLikeBean getUserLikes(int i) {
            return this.userLikes_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getUserLikesCount() {
            return this.userLikes_.size();
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<UserLikeProto.UserLikeBean> getUserLikesList() {
            return this.userLikes_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public UserLikeProto.UserLikeBeanOrBuilder getUserLikesOrBuilder(int i) {
            return this.userLikes_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<? extends UserLikeProto.UserLikeBeanOrBuilder> getUserLikesOrBuilderList() {
            return this.userLikes_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public DramaVideoProto.DramaVideoBean getVideos(int i) {
            return this.videos_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getVideosCount() {
            return this.videos_.size();
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<DramaVideoProto.DramaVideoBean> getVideosList() {
            return this.videos_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public DramaVideoProto.DramaVideoBeanOrBuilder getVideosOrBuilder(int i) {
            return this.videos_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public List<? extends DramaVideoProto.DramaVideoBeanOrBuilder> getVideosOrBuilderList() {
            return this.videos_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public boolean getVip() {
            return this.vip_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public String getVodPubdate() {
            Object obj = this.vodPubdate_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.vodPubdate_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public ByteString getVodPubdateBytes() {
            Object obj = this.vodPubdate_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.vodPubdate_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanOrBuilder
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
            int iHashCode2 = getVodPubdate().hashCode() + ((((Internal.hashBoolean(getIsEnd()) + ((((getRemark().hashCode() + ((((getActor().hashCode() + ((((getConfig().hashCode() + ((((getKeyword().hashCode() + ((((getHitsMonth() + ((((getHitsWeek() + ((((getHitsDay() + ((((getHits() + ((((getYear() + ((((Internal.hashLong(getUpdateTime()) + ((((getCateType1() + ((((getCateType2() + ((((getType() + ((((getTag().hashCode() + ((((getDirector().hashCode() + ((((getStarsCount() + ((((Float.floatToIntBits(getStars()) + ((((getName().hashCode() + ((((getLike() + ((((getBrief().hashCode() + ((((getIntro().hashCode() + ((((getFavoriteId() + ((((getId() + ((((Internal.hashLong(getCreateTime()) + a.a(iHashCode, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 37) + 19) * 53)) * 37) + 20) * 53)) * 37) + 21) * 53)) * 37) + 22) * 53)) * 37) + 23) * 53)) * 37) + 24) * 53)) * 37) + 25) * 53)) * 37) + 26) * 53)) * 37) + 27) * 53)) * 37) + 28) * 53);
            if (getVideosCount() > 0) {
                iHashCode2 = a.a(iHashCode2, 37, 29, 53) + getVideosList().hashCode();
            }
            if (getDownloadsCount() > 0) {
                iHashCode2 = a.a(iHashCode2, 37, 30, 53) + getDownloadsList().hashCode();
            }
            if (getUserLikesCount() > 0) {
                iHashCode2 = a.a(iHashCode2, 37, 31, 53) + getUserLikesList().hashCode();
            }
            if (getFavoriteCount() > 0) {
                iHashCode2 = a.a(iHashCode2, 37, 32, 53) + getFavoriteList().hashCode();
            }
            int iHashCode3 = getUnknownFields().hashCode() + ((Internal.hashBoolean(getHot()) + ((((Internal.hashBoolean(getVip()) + ((((Internal.hashBoolean(getSerial()) + ((((Internal.hashBoolean(getSeason()) + a.a(iHashCode2, 37, 33, 53)) * 37) + 34) * 53)) * 37) + 35) * 53)) * 37) + 36) * 53)) * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaDetailBean.class, Builder.class);
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
            long j = this.createTime_;
            if (j != 0) {
                codedOutputStream.writeInt64(3, j);
            }
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.writeInt32(4, i);
            }
            int i2 = this.favoriteId_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(5, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.intro_)) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.intro_);
            }
            if (!GeneratedMessage.isStringEmpty(this.brief_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.brief_);
            }
            int i3 = this.like_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(8, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.name_)) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.name_);
            }
            if (Float.floatToRawIntBits(this.stars_) != 0) {
                codedOutputStream.writeFloat(10, this.stars_);
            }
            int i4 = this.starsCount_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(11, i4);
            }
            if (!GeneratedMessage.isStringEmpty(this.director_)) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.director_);
            }
            if (!GeneratedMessage.isStringEmpty(this.tag_)) {
                GeneratedMessage.writeString(codedOutputStream, 13, this.tag_);
            }
            int i5 = this.type_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(14, i5);
            }
            int i6 = this.cateType2_;
            if (i6 != 0) {
                codedOutputStream.writeInt32(15, i6);
            }
            int i7 = this.cateType1_;
            if (i7 != 0) {
                codedOutputStream.writeInt32(16, i7);
            }
            long j2 = this.updateTime_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(17, j2);
            }
            int i8 = this.year_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(18, i8);
            }
            int i9 = this.hits_;
            if (i9 != 0) {
                codedOutputStream.writeInt32(19, i9);
            }
            int i10 = this.hitsDay_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(20, i10);
            }
            int i11 = this.hitsWeek_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(21, i11);
            }
            int i12 = this.hitsMonth_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(22, i12);
            }
            if (!GeneratedMessage.isStringEmpty(this.keyword_)) {
                GeneratedMessage.writeString(codedOutputStream, 23, this.keyword_);
            }
            if (!GeneratedMessage.isStringEmpty(this.config_)) {
                GeneratedMessage.writeString(codedOutputStream, 24, this.config_);
            }
            if (!GeneratedMessage.isStringEmpty(this.actor_)) {
                GeneratedMessage.writeString(codedOutputStream, 25, this.actor_);
            }
            if (!GeneratedMessage.isStringEmpty(this.remark_)) {
                GeneratedMessage.writeString(codedOutputStream, 26, this.remark_);
            }
            boolean z = this.isEnd_;
            if (z) {
                codedOutputStream.writeBool(27, z);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodPubdate_)) {
                GeneratedMessage.writeString(codedOutputStream, 28, this.vodPubdate_);
            }
            for (int i13 = 0; i13 < this.videos_.size(); i13++) {
                codedOutputStream.writeMessage(29, this.videos_.get(i13));
            }
            for (int i14 = 0; i14 < this.downloads_.size(); i14++) {
                codedOutputStream.writeMessage(30, this.downloads_.get(i14));
            }
            for (int i15 = 0; i15 < this.userLikes_.size(); i15++) {
                codedOutputStream.writeMessage(31, this.userLikes_.get(i15));
            }
            for (int i16 = 0; i16 < this.favorite_.size(); i16++) {
                codedOutputStream.writeMessage(32, this.favorite_.get(i16));
            }
            boolean z2 = this.season_;
            if (z2) {
                codedOutputStream.writeBool(33, z2);
            }
            boolean z3 = this.serial_;
            if (z3) {
                codedOutputStream.writeBool(34, z3);
            }
            boolean z4 = this.vip_;
            if (z4) {
                codedOutputStream.writeBool(35, z4);
            }
            boolean z5 = this.hot_;
            if (z5) {
                codedOutputStream.writeBool(36, z5);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface DramaDetailBeanOrBuilder extends MessageOrBuilder {
        String getActor();

        ByteString getActorBytes();

        String getArea();

        ByteString getAreaBytes();

        String getBrief();

        ByteString getBriefBytes();

        int getCateType1();

        int getCateType2();

        String getConfig();

        ByteString getConfigBytes();

        DramaCoverImageProto.DramaCoverImageBean getCoverImage();

        DramaCoverImageProto.DramaCoverImageBeanOrBuilder getCoverImageOrBuilder();

        long getCreateTime();

        String getDirector();

        ByteString getDirectorBytes();

        DramaVideoProto.DramaVideoBean getDownloads(int i);

        int getDownloadsCount();

        List<DramaVideoProto.DramaVideoBean> getDownloadsList();

        DramaVideoProto.DramaVideoBeanOrBuilder getDownloadsOrBuilder(int i);

        List<? extends DramaVideoProto.DramaVideoBeanOrBuilder> getDownloadsOrBuilderList();

        FavoriteProto.FavoriteBean getFavorite(int i);

        int getFavoriteCount();

        int getFavoriteId();

        List<FavoriteProto.FavoriteBean> getFavoriteList();

        FavoriteProto.FavoriteBeanOrBuilder getFavoriteOrBuilder(int i);

        List<? extends FavoriteProto.FavoriteBeanOrBuilder> getFavoriteOrBuilderList();

        int getHits();

        int getHitsDay();

        int getHitsMonth();

        int getHitsWeek();

        boolean getHot();

        int getId();

        String getIntro();

        ByteString getIntroBytes();

        boolean getIsEnd();

        String getKeyword();

        ByteString getKeywordBytes();

        int getLike();

        String getName();

        ByteString getNameBytes();

        String getRemark();

        ByteString getRemarkBytes();

        boolean getSeason();

        boolean getSerial();

        float getStars();

        int getStarsCount();

        String getTag();

        ByteString getTagBytes();

        int getType();

        long getUpdateTime();

        UserLikeProto.UserLikeBean getUserLikes(int i);

        int getUserLikesCount();

        List<UserLikeProto.UserLikeBean> getUserLikesList();

        UserLikeProto.UserLikeBeanOrBuilder getUserLikesOrBuilder(int i);

        List<? extends UserLikeProto.UserLikeBeanOrBuilder> getUserLikesOrBuilderList();

        DramaVideoProto.DramaVideoBean getVideos(int i);

        int getVideosCount();

        List<DramaVideoProto.DramaVideoBean> getVideosList();

        DramaVideoProto.DramaVideoBeanOrBuilder getVideosOrBuilder(int i);

        List<? extends DramaVideoProto.DramaVideoBeanOrBuilder> getVideosOrBuilderList();

        boolean getVip();

        String getVodPubdate();

        ByteString getVodPubdateBytes();

        int getYear();

        boolean hasCoverImage();
    }

    public final class DramaDetailBeanPage extends GeneratedMessage implements DramaDetailBeanPageOrBuilder {
        private static final DramaDetailBeanPage DEFAULT_INSTANCE;
        public static final int DRAMADETAILBEAN_FIELD_NUMBER = 1;
        private static final Parser<DramaDetailBeanPage> PARSER;
        private static final long serialVersionUID = 0;
        private List<DramaDetailBean> dramaDetailBean_;
        private byte memoizedIsInitialized;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements DramaDetailBeanPageOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> dramaDetailBeanBuilder_;
            private List<DramaDetailBean> dramaDetailBean_;

            private Builder() {
                this.dramaDetailBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.dramaDetailBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(DramaDetailBeanPage dramaDetailBeanPage) {
            }

            private void buildPartialRepeatedFields(DramaDetailBeanPage dramaDetailBeanPage) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder != null) {
                    dramaDetailBeanPage.dramaDetailBean_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.dramaDetailBean_ = Collections.unmodifiableList(this.dramaDetailBean_);
                    this.bitField0_ &= -2;
                }
                dramaDetailBeanPage.dramaDetailBean_ = this.dramaDetailBean_;
            }

            private void ensureDramaDetailBeanIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.dramaDetailBean_ = new ArrayList(this.dramaDetailBean_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBeanPage_descriptor;
            }

            private RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> internalGetDramaDetailBeanFieldBuilder() {
                if (this.dramaDetailBeanBuilder_ == null) {
                    this.dramaDetailBeanBuilder_ = new RepeatedFieldBuilder<>(this.dramaDetailBean_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.dramaDetailBean_ = null;
                }
                return this.dramaDetailBeanBuilder_;
            }

            public Builder addAllDramaDetailBean(Iterable<? extends DramaDetailBean> iterable) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaDetailBeanIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.dramaDetailBean_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addDramaDetailBean(int i, DramaDetailBean.Builder builder) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addDramaDetailBean(int i, DramaDetailBean dramaDetailBean) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaDetailBean.getClass();
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.add(i, dramaDetailBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, dramaDetailBean);
                }
                return this;
            }

            public Builder addDramaDetailBean(DramaDetailBean.Builder builder) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDramaDetailBean(DramaDetailBean dramaDetailBean) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaDetailBean.getClass();
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.add(dramaDetailBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(dramaDetailBean);
                }
                return this;
            }

            public DramaDetailBean.Builder addDramaDetailBeanBuilder() {
                return (DramaDetailBean.Builder) internalGetDramaDetailBeanFieldBuilder().addBuilder(DramaDetailBean.getDefaultInstance());
            }

            public DramaDetailBean.Builder addDramaDetailBeanBuilder(int i) {
                return (DramaDetailBean.Builder) internalGetDramaDetailBeanFieldBuilder().addBuilder(i, DramaDetailBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaDetailBeanPage build() {
                DramaDetailBeanPage dramaDetailBeanPageBuildPartial = buildPartial();
                if (dramaDetailBeanPageBuildPartial.isInitialized()) {
                    return dramaDetailBeanPageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dramaDetailBeanPageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaDetailBeanPage buildPartial() {
                DramaDetailBeanPage dramaDetailBeanPage = new DramaDetailBeanPage(this);
                buildPartialRepeatedFields(dramaDetailBeanPage);
                if (this.bitField0_ != 0) {
                    buildPartial0(dramaDetailBeanPage);
                }
                onBuilt();
                return dramaDetailBeanPage;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.dramaDetailBean_ = Collections.emptyList();
                } else {
                    this.dramaDetailBean_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearDramaDetailBean() {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.dramaDetailBean_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DramaDetailBeanPage getDefaultInstanceForType() {
                return DramaDetailBeanPage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBeanPage_descriptor;
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
            public DramaDetailBean getDramaDetailBean(int i) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                return repeatedFieldBuilder == null ? this.dramaDetailBean_.get(i) : (DramaDetailBean) repeatedFieldBuilder.getMessage(i);
            }

            public DramaDetailBean.Builder getDramaDetailBeanBuilder(int i) {
                return (DramaDetailBean.Builder) internalGetDramaDetailBeanFieldBuilder().getBuilder(i);
            }

            public List<DramaDetailBean.Builder> getDramaDetailBeanBuilderList() {
                return internalGetDramaDetailBeanFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
            public int getDramaDetailBeanCount() {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                return repeatedFieldBuilder == null ? this.dramaDetailBean_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
            public List<DramaDetailBean> getDramaDetailBeanList() {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.dramaDetailBean_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
            public DramaDetailBeanOrBuilder getDramaDetailBeanOrBuilder(int i) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                return repeatedFieldBuilder == null ? this.dramaDetailBean_.get(i) : (DramaDetailBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
            public List<? extends DramaDetailBeanOrBuilder> getDramaDetailBeanOrBuilderList() {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.dramaDetailBean_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaDetailBeanPage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DramaDetailBeanPage dramaDetailBeanPage) {
                if (dramaDetailBeanPage == DramaDetailBeanPage.getDefaultInstance()) {
                    return this;
                }
                if (this.dramaDetailBeanBuilder_ == null) {
                    if (!dramaDetailBeanPage.dramaDetailBean_.isEmpty()) {
                        if (this.dramaDetailBean_.isEmpty()) {
                            this.dramaDetailBean_ = dramaDetailBeanPage.dramaDetailBean_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDramaDetailBeanIsMutable();
                            this.dramaDetailBean_.addAll(dramaDetailBeanPage.dramaDetailBean_);
                        }
                        onChanged();
                    }
                } else if (!dramaDetailBeanPage.dramaDetailBean_.isEmpty()) {
                    if (this.dramaDetailBeanBuilder_.isEmpty()) {
                        this.dramaDetailBeanBuilder_.dispose();
                        this.dramaDetailBeanBuilder_ = null;
                        this.dramaDetailBean_ = dramaDetailBeanPage.dramaDetailBean_;
                        this.bitField0_ &= -2;
                        this.dramaDetailBeanBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetDramaDetailBeanFieldBuilder() : null;
                    } else {
                        this.dramaDetailBeanBuilder_.addAllMessages(dramaDetailBeanPage.dramaDetailBean_);
                    }
                }
                mergeUnknownFields(dramaDetailBeanPage.getUnknownFields());
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
                                    DramaDetailBean dramaDetailBean = (DramaDetailBean) codedInputStream.readMessage(DramaDetailBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureDramaDetailBeanIsMutable();
                                        this.dramaDetailBean_.add(dramaDetailBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(dramaDetailBean);
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
                if (message instanceof DramaDetailBeanPage) {
                    return mergeFrom((DramaDetailBeanPage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeDramaDetailBean(int i) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setDramaDetailBean(int i, DramaDetailBean.Builder builder) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setDramaDetailBean(int i, DramaDetailBean dramaDetailBean) {
                RepeatedFieldBuilder<DramaDetailBean, DramaDetailBean.Builder, DramaDetailBeanOrBuilder> repeatedFieldBuilder = this.dramaDetailBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    dramaDetailBean.getClass();
                    ensureDramaDetailBeanIsMutable();
                    this.dramaDetailBean_.set(i, dramaDetailBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, dramaDetailBean);
                }
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaDetailBeanPage.class.getName());
            DEFAULT_INSTANCE = new DramaDetailBeanPage();
            PARSER = new AbstractParser<DramaDetailBeanPage>() { // from class: com.base.model.proto.DramaDetailProto.DramaDetailBeanPage.1
                @Override // com.google.protobuf.Parser
                public DramaDetailBeanPage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = DramaDetailBeanPage.newBuilder();
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

        private DramaDetailBeanPage() {
            this.memoizedIsInitialized = (byte) -1;
            this.dramaDetailBean_ = Collections.emptyList();
        }

        public /* synthetic */ DramaDetailBeanPage(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private DramaDetailBeanPage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DramaDetailBeanPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBeanPage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DramaDetailBeanPage dramaDetailBeanPage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dramaDetailBeanPage);
        }

        public static DramaDetailBeanPage parseDelimitedFrom(InputStream inputStream) {
            return (DramaDetailBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DramaDetailBeanPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaDetailBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaDetailBeanPage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static DramaDetailBeanPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DramaDetailBeanPage parseFrom(CodedInputStream codedInputStream) {
            return (DramaDetailBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DramaDetailBeanPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaDetailBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DramaDetailBeanPage parseFrom(InputStream inputStream) {
            return (DramaDetailBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static DramaDetailBeanPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaDetailBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaDetailBeanPage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DramaDetailBeanPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DramaDetailBeanPage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DramaDetailBeanPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<DramaDetailBeanPage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DramaDetailBeanPage)) {
                return super.equals(obj);
            }
            DramaDetailBeanPage dramaDetailBeanPage = (DramaDetailBeanPage) obj;
            return getDramaDetailBeanList().equals(dramaDetailBeanPage.getDramaDetailBeanList()) && getUnknownFields().equals(dramaDetailBeanPage.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DramaDetailBeanPage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
        public DramaDetailBean getDramaDetailBean(int i) {
            return this.dramaDetailBean_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
        public int getDramaDetailBeanCount() {
            return this.dramaDetailBean_.size();
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
        public List<DramaDetailBean> getDramaDetailBeanList() {
            return this.dramaDetailBean_;
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
        public DramaDetailBeanOrBuilder getDramaDetailBeanOrBuilder(int i) {
            return this.dramaDetailBean_.get(i);
        }

        @Override // com.base.model.proto.DramaDetailProto.DramaDetailBeanPageOrBuilder
        public List<? extends DramaDetailBeanOrBuilder> getDramaDetailBeanOrBuilderList() {
            return this.dramaDetailBean_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DramaDetailBeanPage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.dramaDetailBean_.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.dramaDetailBean_.get(i2));
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
            if (getDramaDetailBeanCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getDramaDetailBeanList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DramaDetailProto.internal_static_com_base_model_proto_DramaDetailBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaDetailBeanPage.class, Builder.class);
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
            for (int i = 0; i < this.dramaDetailBean_.size(); i++) {
                codedOutputStream.writeMessage(1, this.dramaDetailBean_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface DramaDetailBeanPageOrBuilder extends MessageOrBuilder {
        DramaDetailBean getDramaDetailBean(int i);

        int getDramaDetailBeanCount();

        List<DramaDetailBean> getDramaDetailBeanList();

        DramaDetailBeanOrBuilder getDramaDetailBeanOrBuilder(int i);

        List<? extends DramaDetailBeanOrBuilder> getDramaDetailBeanOrBuilderList();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaDetailProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011DramaDetail.proto\u0012\u0014com.base.model.proto\u001a\u0015DramaCoverImage.proto\u001a\u0010DramaVideo.proto\u001a\u000eUserLike.proto\u001a\u000eFavorite.proto\"®\u0006\n\u000fDramaDetailBean\u0012\f\n\u0004area\u0018\u0001 \u0001(\t\u0012>\n\u000bcover_image\u0018\u0002 \u0001(\u000b2).com.base.model.proto.DramaCoverImageBean\u0012\u0013\n\u000bcreate_time\u0018\u0003 \u0001(\u0003\u0012\n\n\u0002id\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000bfavorite_id\u0018\u0005 \u0001(\u0005\u0012\r\n\u0005intro\u0018\u0006 \u0001(\t\u0012\r\n\u0005brief\u0018\u0007 \u0001(\t\u0012\f\n\u0004like\u0018\b \u0001(\u0005\u0012\f\n\u0004name\u0018\t \u0001(\t\u0012\r\n\u0005stars\u0018\n \u0001(\u0002\u0012\u0013\n\u000bstars_count\u0018\u000b \u0001(\u0005\u0012\u0010\n\bdirector\u0018\f \u0001(\t\u0012\u000b\n\u0003tag\u0018\r \u0001(\t\u0012\f\n\u0004type\u0018\u000e \u0001(\u0005\u0012\u0012\n\ncate_type2\u0018\u000f \u0001(\u0005\u0012\u0012\n\ncate_type1\u0018\u0010 \u0001(\u0005\u0012\u0013\n\u000bupdate_time\u0018\u0011 \u0001(\u0003\u0012\f\n\u0004year\u0018\u0012 \u0001(\u0005\u0012\f\n\u0004hits\u0018\u0013 \u0001(\u0005\u0012\u0010\n\bhits_day\u0018\u0014 \u0001(\u0005\u0012\u0011\n\thits_week\u0018\u0015 \u0001(\u0005\u0012\u0012\n\nhits_month\u0018\u0016 \u0001(\u0005\u0012\u000f\n\u0007keyword\u0018\u0017 \u0001(\t\u0012\u000e\n\u0006config\u0018\u0018 \u0001(\t\u0012\r\n\u0005actor\u0018\u0019 \u0001(\t\u0012\u000e\n\u0006remark\u0018\u001a \u0001(\t\u0012\u000e\n\u0006is_end\u0018\u001b \u0001(\b\u0012\u0013\n\u000bvod_pubdate\u0018\u001c \u0001(\t\u00124\n\u0006videos\u0018\u001d \u0003(\u000b2$.com.base.model.proto.DramaVideoBean\u00127\n\tdownloads\u0018\u001e \u0003(\u000b2$.com.base.model.proto.DramaVideoBean\u00126\n\nuser_likes\u0018\u001f \u0003(\u000b2\".com.base.model.proto.UserLikeBean\u00124\n\bfavorite\u0018  \u0003(\u000b2\".com.base.model.proto.FavoriteBean\u0012\u000e\n\u0006season\u0018! \u0001(\b\u0012\u000e\n\u0006serial\u0018\" \u0001(\b\u0012\u000b\n\u0003vip\u0018# \u0001(\b\u0012\u000b\n\u0003hot\u0018$ \u0001(\b\"U\n\u0013DramaDetailBeanPage\u0012>\n\u000fdramaDetailBean\u0018\u0001 \u0003(\u000b2%.com.base.model.proto.DramaDetailBeanB\u0012B\u0010DramaDetailProtob\u0006proto3"}, new Descriptors.FileDescriptor[]{DramaCoverImageProto.getDescriptor(), DramaVideoProto.getDescriptor(), UserLikeProto.getDescriptor(), FavoriteProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_DramaDetailBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_DramaDetailBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Area", "CoverImage", "CreateTime", "Id", "FavoriteId", "Intro", "Brief", "Like", "Name", "Stars", "StarsCount", "Director", "Tag", "Type", "CateType2", "CateType1", "UpdateTime", "Year", "Hits", "HitsDay", "HitsWeek", "HitsMonth", "Keyword", "Config", "Actor", "Remark", "IsEnd", "VodPubdate", "Videos", "Downloads", "UserLikes", "Favorite", "Season", "Serial", "Vip", "Hot"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_DramaDetailBeanPage_descriptor = descriptor3;
        internal_static_com_base_model_proto_DramaDetailBeanPage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"DramaDetailBean"});
        descriptor.resolveAllFeaturesImmutable();
        DramaCoverImageProto.getDescriptor();
        DramaVideoProto.getDescriptor();
        UserLikeProto.getDescriptor();
        FavoriteProto.getDescriptor();
    }

    private DramaDetailProto() {
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
