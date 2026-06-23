package com.base.model.proto;

import com.base.model.proto.DramaDetailProto;
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
public final class FavoriteProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_FavoriteBeanPage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_FavoriteBeanPage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_FavoriteBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_FavoriteBean_fieldAccessorTable;

    public final class FavoriteBean extends GeneratedMessage implements FavoriteBeanOrBuilder {
        public static final int ACTOR_FIELD_NUMBER = 11;
        public static final int AREA_FIELD_NUMBER = 10;
        public static final int CATE_TYPE2_FIELD_NUMBER = 13;
        public static final int CLAZZ_FIELD_NUMBER = 17;
        public static final int COVER_URL_FIELD_NUMBER = 6;
        public static final int CREATE_TIME_FIELD_NUMBER = 4;
        private static final FavoriteBean DEFAULT_INSTANCE;
        public static final int DIRECTOR_FIELD_NUMBER = 15;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<FavoriteBean> PARSER;
        public static final int STARS_COUNT_FIELD_NUMBER = 8;
        public static final int STARS_FIELD_NUMBER = 7;
        public static final int TAG_FIELD_NUMBER = 16;
        public static final int TYPE_FIELD_NUMBER = 12;
        public static final int USER_ID_FIELD_NUMBER = 2;
        public static final int VOD_ID_FIELD_NUMBER = 3;
        public static final int VOD_NAME_FIELD_NUMBER = 5;
        public static final int YEAR_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private volatile Object actor_;
        private volatile Object area_;
        private int cateType2_;
        private volatile Object clazz_;
        private volatile Object coverUrl_;
        private long createTime_;
        private volatile Object director_;
        private int ext_;
        private int id_;
        private byte memoizedIsInitialized;
        private int starsCount_;
        private long stars_;
        private volatile Object tag_;
        private int type_;
        private int userId_;
        private int vodId_;
        private volatile Object vodName_;
        private int year_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements FavoriteBeanOrBuilder {
            private Object actor_;
            private Object area_;
            private int bitField0_;
            private int cateType2_;
            private Object clazz_;
            private Object coverUrl_;
            private long createTime_;
            private Object director_;
            private int ext_;
            private int id_;
            private int starsCount_;
            private long stars_;
            private Object tag_;
            private int type_;
            private int userId_;
            private int vodId_;
            private Object vodName_;
            private int year_;

            private Builder() {
                this.vodName_ = "";
                this.coverUrl_ = "";
                this.area_ = "";
                this.actor_ = "";
                this.director_ = "";
                this.tag_ = "";
                this.clazz_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.vodName_ = "";
                this.coverUrl_ = "";
                this.area_ = "";
                this.actor_ = "";
                this.director_ = "";
                this.tag_ = "";
                this.clazz_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(FavoriteBean favoriteBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    favoriteBean.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    favoriteBean.userId_ = this.userId_;
                }
                if ((i & 4) != 0) {
                    favoriteBean.vodId_ = this.vodId_;
                }
                if ((i & 8) != 0) {
                    favoriteBean.createTime_ = this.createTime_;
                }
                if ((i & 16) != 0) {
                    favoriteBean.vodName_ = this.vodName_;
                }
                if ((i & 32) != 0) {
                    favoriteBean.coverUrl_ = this.coverUrl_;
                }
                if ((i & 64) != 0) {
                    favoriteBean.stars_ = this.stars_;
                }
                if ((i & 128) != 0) {
                    favoriteBean.starsCount_ = this.starsCount_;
                }
                if ((i & 256) != 0) {
                    favoriteBean.year_ = this.year_;
                }
                if ((i & 512) != 0) {
                    favoriteBean.area_ = this.area_;
                }
                if ((i & 1024) != 0) {
                    favoriteBean.actor_ = this.actor_;
                }
                if ((i & 2048) != 0) {
                    favoriteBean.type_ = this.type_;
                }
                if ((i & 4096) != 0) {
                    favoriteBean.cateType2_ = this.cateType2_;
                }
                if ((i & 8192) != 0) {
                    favoriteBean.ext_ = this.ext_;
                }
                if ((i & 16384) != 0) {
                    favoriteBean.director_ = this.director_;
                }
                if ((32768 & i) != 0) {
                    favoriteBean.tag_ = this.tag_;
                }
                if ((i & 65536) != 0) {
                    favoriteBean.clazz_ = this.clazz_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FavoriteProto.internal_static_com_base_model_proto_FavoriteBean_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteBean build() {
                FavoriteBean favoriteBeanBuildPartial = buildPartial();
                if (favoriteBeanBuildPartial.isInitialized()) {
                    return favoriteBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteBean buildPartial() {
                FavoriteBean favoriteBean = new FavoriteBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(favoriteBean);
                }
                onBuilt();
                return favoriteBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.userId_ = 0;
                this.vodId_ = 0;
                this.createTime_ = 0L;
                this.vodName_ = "";
                this.coverUrl_ = "";
                this.stars_ = 0L;
                this.starsCount_ = 0;
                this.year_ = 0;
                this.area_ = "";
                this.actor_ = "";
                this.type_ = 0;
                this.cateType2_ = 0;
                this.ext_ = 0;
                this.director_ = "";
                this.tag_ = "";
                this.clazz_ = "";
                return this;
            }

            public Builder clearActor() {
                this.actor_ = FavoriteBean.getDefaultInstance().getActor();
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearArea() {
                this.area_ = FavoriteBean.getDefaultInstance().getArea();
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder clearCateType2() {
                this.bitField0_ &= -4097;
                this.cateType2_ = 0;
                onChanged();
                return this;
            }

            public Builder clearClazz() {
                this.clazz_ = FavoriteBean.getDefaultInstance().getClazz();
                this.bitField0_ &= -65537;
                onChanged();
                return this;
            }

            public Builder clearCoverUrl() {
                this.coverUrl_ = FavoriteBean.getDefaultInstance().getCoverUrl();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearCreateTime() {
                this.bitField0_ &= -9;
                this.createTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDirector() {
                this.director_ = FavoriteBean.getDefaultInstance().getDirector();
                this.bitField0_ &= -16385;
                onChanged();
                return this;
            }

            public Builder clearExt() {
                this.bitField0_ &= -8193;
                this.ext_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStars() {
                this.bitField0_ &= -65;
                this.stars_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearStarsCount() {
                this.bitField0_ &= -129;
                this.starsCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTag() {
                this.tag_ = FavoriteBean.getDefaultInstance().getTag();
                this.bitField0_ &= -32769;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2049;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -3;
                this.userId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVodId() {
                this.bitField0_ &= -5;
                this.vodId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVodName() {
                this.vodName_ = FavoriteBean.getDefaultInstance().getVodName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearYear() {
                this.bitField0_ &= -257;
                this.year_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getActor() {
                Object obj = this.actor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.actor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getActorBytes() {
                Object obj = this.actor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.actor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getArea() {
                Object obj = this.area_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.area_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getAreaBytes() {
                Object obj = this.area_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.area_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getCateType2() {
                return this.cateType2_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getClazz() {
                Object obj = this.clazz_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.clazz_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getClazzBytes() {
                Object obj = this.clazz_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clazz_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getCoverUrl() {
                Object obj = this.coverUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.coverUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getCoverUrlBytes() {
                Object obj = this.coverUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.coverUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public long getCreateTime() {
                return this.createTime_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FavoriteBean getDefaultInstanceForType() {
                return FavoriteBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FavoriteProto.internal_static_com_base_model_proto_FavoriteBean_descriptor;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getDirector() {
                Object obj = this.director_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.director_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getDirectorBytes() {
                Object obj = this.director_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.director_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getExt() {
                return this.ext_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public long getStars() {
                return this.stars_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getStarsCount() {
                return this.starsCount_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getTag() {
                Object obj = this.tag_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tag_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getTagBytes() {
                Object obj = this.tag_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tag_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getUserId() {
                return this.userId_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getVodId() {
                return this.vodId_;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public String getVodName() {
                Object obj = this.vodName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vodName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public ByteString getVodNameBytes() {
                Object obj = this.vodName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vodName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
            public int getYear() {
                return this.year_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FavoriteProto.internal_static_com_base_model_proto_FavoriteBean_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(FavoriteBean favoriteBean) {
                if (favoriteBean == FavoriteBean.getDefaultInstance()) {
                    return this;
                }
                if (favoriteBean.getId() != 0) {
                    setId(favoriteBean.getId());
                }
                if (favoriteBean.getUserId() != 0) {
                    setUserId(favoriteBean.getUserId());
                }
                if (favoriteBean.getVodId() != 0) {
                    setVodId(favoriteBean.getVodId());
                }
                if (favoriteBean.getCreateTime() != 0) {
                    setCreateTime(favoriteBean.getCreateTime());
                }
                if (!favoriteBean.getVodName().isEmpty()) {
                    this.vodName_ = favoriteBean.vodName_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (!favoriteBean.getCoverUrl().isEmpty()) {
                    this.coverUrl_ = favoriteBean.coverUrl_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (favoriteBean.getStars() != 0) {
                    setStars(favoriteBean.getStars());
                }
                if (favoriteBean.getStarsCount() != 0) {
                    setStarsCount(favoriteBean.getStarsCount());
                }
                if (favoriteBean.getYear() != 0) {
                    setYear(favoriteBean.getYear());
                }
                if (!favoriteBean.getArea().isEmpty()) {
                    this.area_ = favoriteBean.area_;
                    this.bitField0_ |= 512;
                    onChanged();
                }
                if (!favoriteBean.getActor().isEmpty()) {
                    this.actor_ = favoriteBean.actor_;
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                if (favoriteBean.getType() != 0) {
                    setType(favoriteBean.getType());
                }
                if (favoriteBean.getCateType2() != 0) {
                    setCateType2(favoriteBean.getCateType2());
                }
                if (favoriteBean.getExt() != 0) {
                    setExt(favoriteBean.getExt());
                }
                if (!favoriteBean.getDirector().isEmpty()) {
                    this.director_ = favoriteBean.director_;
                    this.bitField0_ |= 16384;
                    onChanged();
                }
                if (!favoriteBean.getTag().isEmpty()) {
                    this.tag_ = favoriteBean.tag_;
                    this.bitField0_ |= 32768;
                    onChanged();
                }
                if (!favoriteBean.getClazz().isEmpty()) {
                    this.clazz_ = favoriteBean.clazz_;
                    this.bitField0_ |= 65536;
                    onChanged();
                }
                mergeUnknownFields(favoriteBean.getUnknownFields());
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
                                    this.id_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                    break;
                                case 16:
                                    this.userId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                    break;
                                case 24:
                                    this.vodId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                    break;
                                case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                                    this.createTime_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.vodName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 50:
                                    this.coverUrl_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 32;
                                    break;
                                case 56:
                                    this.stars_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.starsCount_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.year_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 82:
                                    this.area_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 512;
                                    break;
                                case 90:
                                    this.actor_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 96:
                                    this.type_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 104:
                                    this.cateType2_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.ext_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 122:
                                    this.director_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 130:
                                    this.tag_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 138:
                                    this.clazz_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 65536;
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
                if (message instanceof FavoriteBean) {
                    return mergeFrom((FavoriteBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setActor(String str) {
                str.getClass();
                this.actor_ = str;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setActorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.actor_ = byteString;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setArea(String str) {
                str.getClass();
                this.area_ = str;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setAreaBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.area_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setCateType2(int i) {
                this.cateType2_ = i;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setClazz(String str) {
                str.getClass();
                this.clazz_ = str;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setClazzBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.clazz_ = byteString;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setCoverUrl(String str) {
                str.getClass();
                this.coverUrl_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCoverUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.coverUrl_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCreateTime(long j) {
                this.createTime_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDirector(String str) {
                str.getClass();
                this.director_ = str;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setDirectorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.director_ = byteString;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setExt(int i) {
                this.ext_ = i;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setId(int i) {
                this.id_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStars(long j) {
                this.stars_ = j;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setStarsCount(int i) {
                this.starsCount_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setTag(String str) {
                str.getClass();
                this.tag_ = str;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setTagBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.tag_ = byteString;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setType(int i) {
                this.type_ = i;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setUserId(int i) {
                this.userId_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setVodId(int i) {
                this.vodId_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setVodName(String str) {
                str.getClass();
                this.vodName_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVodNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.vodName_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setYear(int i) {
                this.year_ = i;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", FavoriteBean.class.getName());
            DEFAULT_INSTANCE = new FavoriteBean();
            PARSER = new AbstractParser<FavoriteBean>() { // from class: com.base.model.proto.FavoriteProto.FavoriteBean.1
                @Override // com.google.protobuf.Parser
                public FavoriteBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = FavoriteBean.newBuilder();
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

        private FavoriteBean() {
            this.id_ = 0;
            this.userId_ = 0;
            this.vodId_ = 0;
            this.createTime_ = 0L;
            this.vodName_ = "";
            this.coverUrl_ = "";
            this.stars_ = 0L;
            this.starsCount_ = 0;
            this.year_ = 0;
            this.area_ = "";
            this.actor_ = "";
            this.type_ = 0;
            this.cateType2_ = 0;
            this.ext_ = 0;
            this.director_ = "";
            this.tag_ = "";
            this.clazz_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.vodName_ = "";
            this.coverUrl_ = "";
            this.area_ = "";
            this.actor_ = "";
            this.director_ = "";
            this.tag_ = "";
            this.clazz_ = "";
        }

        public /* synthetic */ FavoriteBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private FavoriteBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.userId_ = 0;
            this.vodId_ = 0;
            this.createTime_ = 0L;
            this.vodName_ = "";
            this.coverUrl_ = "";
            this.stars_ = 0L;
            this.starsCount_ = 0;
            this.year_ = 0;
            this.area_ = "";
            this.actor_ = "";
            this.type_ = 0;
            this.cateType2_ = 0;
            this.ext_ = 0;
            this.director_ = "";
            this.tag_ = "";
            this.clazz_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FavoriteBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FavoriteProto.internal_static_com_base_model_proto_FavoriteBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(FavoriteBean favoriteBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteBean);
        }

        public static FavoriteBean parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static FavoriteBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteBean parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static FavoriteBean parseFrom(InputStream inputStream) {
            return (FavoriteBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static FavoriteBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static FavoriteBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FavoriteBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<FavoriteBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FavoriteBean)) {
                return super.equals(obj);
            }
            FavoriteBean favoriteBean = (FavoriteBean) obj;
            return getId() == favoriteBean.getId() && getUserId() == favoriteBean.getUserId() && getVodId() == favoriteBean.getVodId() && getCreateTime() == favoriteBean.getCreateTime() && getVodName().equals(favoriteBean.getVodName()) && getCoverUrl().equals(favoriteBean.getCoverUrl()) && getStars() == favoriteBean.getStars() && getStarsCount() == favoriteBean.getStarsCount() && getYear() == favoriteBean.getYear() && getArea().equals(favoriteBean.getArea()) && getActor().equals(favoriteBean.getActor()) && getType() == favoriteBean.getType() && getCateType2() == favoriteBean.getCateType2() && getExt() == favoriteBean.getExt() && getDirector().equals(favoriteBean.getDirector()) && getTag().equals(favoriteBean.getTag()) && getClazz().equals(favoriteBean.getClazz()) && getUnknownFields().equals(favoriteBean.getUnknownFields());
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getActor() {
            Object obj = this.actor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.actor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getActorBytes() {
            Object obj = this.actor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.actor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getArea() {
            Object obj = this.area_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.area_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getAreaBytes() {
            Object obj = this.area_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.area_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getCateType2() {
            return this.cateType2_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getClazz() {
            Object obj = this.clazz_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.clazz_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getClazzBytes() {
            Object obj = this.clazz_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clazz_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getCoverUrl() {
            Object obj = this.coverUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.coverUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getCoverUrlBytes() {
            Object obj = this.coverUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.coverUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public long getCreateTime() {
            return this.createTime_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FavoriteBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getDirector() {
            Object obj = this.director_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.director_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getDirectorBytes() {
            Object obj = this.director_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.director_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getExt() {
            return this.ext_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteBean> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
            int i3 = this.userId_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
            }
            int i4 = this.vodId_;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i4);
            }
            long j = this.createTime_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodName_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(5, this.vodName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.coverUrl_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(6, this.coverUrl_);
            }
            long j2 = this.stars_;
            if (j2 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(7, j2);
            }
            int i5 = this.starsCount_;
            if (i5 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, i5);
            }
            int i6 = this.year_;
            if (i6 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, i6);
            }
            if (!GeneratedMessage.isStringEmpty(this.area_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(10, this.area_);
            }
            if (!GeneratedMessage.isStringEmpty(this.actor_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(11, this.actor_);
            }
            int i7 = this.type_;
            if (i7 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, i7);
            }
            int i8 = this.cateType2_;
            if (i8 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(13, i8);
            }
            int i9 = this.ext_;
            if (i9 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, i9);
            }
            if (!GeneratedMessage.isStringEmpty(this.director_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(15, this.director_);
            }
            if (!GeneratedMessage.isStringEmpty(this.tag_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(16, this.tag_);
            }
            if (!GeneratedMessage.isStringEmpty(this.clazz_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(17, this.clazz_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public long getStars() {
            return this.stars_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getStarsCount() {
            return this.starsCount_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getTag() {
            Object obj = this.tag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tag_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getTagBytes() {
            Object obj = this.tag_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tag_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getUserId() {
            return this.userId_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getVodId() {
            return this.vodId_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public String getVodName() {
            Object obj = this.vodName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.vodName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public ByteString getVodNameBytes() {
            Object obj = this.vodName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.vodName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanOrBuilder
        public int getYear() {
            return this.year_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getClazz().hashCode() + ((((getTag().hashCode() + ((((getDirector().hashCode() + ((((getExt() + ((((getCateType2() + ((((getType() + ((((getActor().hashCode() + ((((getArea().hashCode() + ((((getYear() + ((((getStarsCount() + ((((Internal.hashLong(getStars()) + ((((getCoverUrl().hashCode() + ((((getVodName().hashCode() + ((((Internal.hashLong(getCreateTime()) + ((((getVodId() + ((((getUserId() + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FavoriteProto.internal_static_com_base_model_proto_FavoriteBean_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteBean.class, Builder.class);
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
            int i = this.id_;
            if (i != 0) {
                codedOutputStream.writeInt32(1, i);
            }
            int i2 = this.userId_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            int i3 = this.vodId_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(3, i3);
            }
            long j = this.createTime_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.vodName_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.vodName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.coverUrl_)) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.coverUrl_);
            }
            long j2 = this.stars_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(7, j2);
            }
            int i4 = this.starsCount_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(8, i4);
            }
            int i5 = this.year_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(9, i5);
            }
            if (!GeneratedMessage.isStringEmpty(this.area_)) {
                GeneratedMessage.writeString(codedOutputStream, 10, this.area_);
            }
            if (!GeneratedMessage.isStringEmpty(this.actor_)) {
                GeneratedMessage.writeString(codedOutputStream, 11, this.actor_);
            }
            int i6 = this.type_;
            if (i6 != 0) {
                codedOutputStream.writeInt32(12, i6);
            }
            int i7 = this.cateType2_;
            if (i7 != 0) {
                codedOutputStream.writeInt32(13, i7);
            }
            int i8 = this.ext_;
            if (i8 != 0) {
                codedOutputStream.writeInt32(14, i8);
            }
            if (!GeneratedMessage.isStringEmpty(this.director_)) {
                GeneratedMessage.writeString(codedOutputStream, 15, this.director_);
            }
            if (!GeneratedMessage.isStringEmpty(this.tag_)) {
                GeneratedMessage.writeString(codedOutputStream, 16, this.tag_);
            }
            if (!GeneratedMessage.isStringEmpty(this.clazz_)) {
                GeneratedMessage.writeString(codedOutputStream, 17, this.clazz_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface FavoriteBeanOrBuilder extends MessageOrBuilder {
        String getActor();

        ByteString getActorBytes();

        String getArea();

        ByteString getAreaBytes();

        int getCateType2();

        String getClazz();

        ByteString getClazzBytes();

        String getCoverUrl();

        ByteString getCoverUrlBytes();

        long getCreateTime();

        String getDirector();

        ByteString getDirectorBytes();

        int getExt();

        int getId();

        long getStars();

        int getStarsCount();

        String getTag();

        ByteString getTagBytes();

        int getType();

        int getUserId();

        int getVodId();

        String getVodName();

        ByteString getVodNameBytes();

        int getYear();
    }

    public final class FavoriteBeanPage extends GeneratedMessage implements FavoriteBeanPageOrBuilder {
        private static final FavoriteBeanPage DEFAULT_INSTANCE;
        public static final int FAVORITEBEAN_FIELD_NUMBER = 1;
        private static final Parser<FavoriteBeanPage> PARSER;
        private static final long serialVersionUID = 0;
        private List<FavoriteBean> favoriteBean_;
        private byte memoizedIsInitialized;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements FavoriteBeanPageOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> favoriteBeanBuilder_;
            private List<FavoriteBean> favoriteBean_;

            private Builder() {
                this.favoriteBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.favoriteBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(FavoriteBeanPage favoriteBeanPage) {
            }

            private void buildPartialRepeatedFields(FavoriteBeanPage favoriteBeanPage) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder != null) {
                    favoriteBeanPage.favoriteBean_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.favoriteBean_ = Collections.unmodifiableList(this.favoriteBean_);
                    this.bitField0_ &= -2;
                }
                favoriteBeanPage.favoriteBean_ = this.favoriteBean_;
            }

            private void ensureFavoriteBeanIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.favoriteBean_ = new ArrayList(this.favoriteBean_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return FavoriteProto.internal_static_com_base_model_proto_FavoriteBeanPage_descriptor;
            }

            private RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> internalGetFavoriteBeanFieldBuilder() {
                if (this.favoriteBeanBuilder_ == null) {
                    this.favoriteBeanBuilder_ = new RepeatedFieldBuilder<>(this.favoriteBean_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.favoriteBean_ = null;
                }
                return this.favoriteBeanBuilder_;
            }

            public Builder addAllFavoriteBean(Iterable<? extends FavoriteBean> iterable) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteBeanIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.favoriteBean_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addFavoriteBean(int i, FavoriteBean.Builder builder) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addFavoriteBean(int i, FavoriteBean favoriteBean) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    favoriteBean.getClass();
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.add(i, favoriteBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, favoriteBean);
                }
                return this;
            }

            public Builder addFavoriteBean(FavoriteBean.Builder builder) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFavoriteBean(FavoriteBean favoriteBean) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    favoriteBean.getClass();
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.add(favoriteBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(favoriteBean);
                }
                return this;
            }

            public FavoriteBean.Builder addFavoriteBeanBuilder() {
                return (FavoriteBean.Builder) internalGetFavoriteBeanFieldBuilder().addBuilder(FavoriteBean.getDefaultInstance());
            }

            public FavoriteBean.Builder addFavoriteBeanBuilder(int i) {
                return (FavoriteBean.Builder) internalGetFavoriteBeanFieldBuilder().addBuilder(i, FavoriteBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteBeanPage build() {
                FavoriteBeanPage favoriteBeanPageBuildPartial = buildPartial();
                if (favoriteBeanPageBuildPartial.isInitialized()) {
                    return favoriteBeanPageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) favoriteBeanPageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FavoriteBeanPage buildPartial() {
                FavoriteBeanPage favoriteBeanPage = new FavoriteBeanPage(this);
                buildPartialRepeatedFields(favoriteBeanPage);
                if (this.bitField0_ != 0) {
                    buildPartial0(favoriteBeanPage);
                }
                onBuilt();
                return favoriteBeanPage;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.favoriteBean_ = Collections.emptyList();
                } else {
                    this.favoriteBean_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearFavoriteBean() {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.favoriteBean_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FavoriteBeanPage getDefaultInstanceForType() {
                return FavoriteBeanPage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return FavoriteProto.internal_static_com_base_model_proto_FavoriteBeanPage_descriptor;
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
            public FavoriteBean getFavoriteBean(int i) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                return repeatedFieldBuilder == null ? this.favoriteBean_.get(i) : (FavoriteBean) repeatedFieldBuilder.getMessage(i);
            }

            public FavoriteBean.Builder getFavoriteBeanBuilder(int i) {
                return (FavoriteBean.Builder) internalGetFavoriteBeanFieldBuilder().getBuilder(i);
            }

            public List<FavoriteBean.Builder> getFavoriteBeanBuilderList() {
                return internalGetFavoriteBeanFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
            public int getFavoriteBeanCount() {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                return repeatedFieldBuilder == null ? this.favoriteBean_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
            public List<FavoriteBean> getFavoriteBeanList() {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.favoriteBean_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
            public FavoriteBeanOrBuilder getFavoriteBeanOrBuilder(int i) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                return repeatedFieldBuilder == null ? this.favoriteBean_.get(i) : (FavoriteBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
            public List<? extends FavoriteBeanOrBuilder> getFavoriteBeanOrBuilderList() {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.favoriteBean_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return FavoriteProto.internal_static_com_base_model_proto_FavoriteBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteBeanPage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(FavoriteBeanPage favoriteBeanPage) {
                if (favoriteBeanPage == FavoriteBeanPage.getDefaultInstance()) {
                    return this;
                }
                if (this.favoriteBeanBuilder_ == null) {
                    if (!favoriteBeanPage.favoriteBean_.isEmpty()) {
                        if (this.favoriteBean_.isEmpty()) {
                            this.favoriteBean_ = favoriteBeanPage.favoriteBean_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFavoriteBeanIsMutable();
                            this.favoriteBean_.addAll(favoriteBeanPage.favoriteBean_);
                        }
                        onChanged();
                    }
                } else if (!favoriteBeanPage.favoriteBean_.isEmpty()) {
                    if (this.favoriteBeanBuilder_.isEmpty()) {
                        this.favoriteBeanBuilder_.dispose();
                        this.favoriteBeanBuilder_ = null;
                        this.favoriteBean_ = favoriteBeanPage.favoriteBean_;
                        this.bitField0_ &= -2;
                        this.favoriteBeanBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetFavoriteBeanFieldBuilder() : null;
                    } else {
                        this.favoriteBeanBuilder_.addAllMessages(favoriteBeanPage.favoriteBean_);
                    }
                }
                mergeUnknownFields(favoriteBeanPage.getUnknownFields());
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
                                    FavoriteBean favoriteBean = (FavoriteBean) codedInputStream.readMessage(FavoriteBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureFavoriteBeanIsMutable();
                                        this.favoriteBean_.add(favoriteBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(favoriteBean);
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
                if (message instanceof FavoriteBeanPage) {
                    return mergeFrom((FavoriteBeanPage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeFavoriteBean(int i) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setFavoriteBean(int i, FavoriteBean.Builder builder) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setFavoriteBean(int i, FavoriteBean favoriteBean) {
                RepeatedFieldBuilder<FavoriteBean, FavoriteBean.Builder, FavoriteBeanOrBuilder> repeatedFieldBuilder = this.favoriteBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    favoriteBean.getClass();
                    ensureFavoriteBeanIsMutable();
                    this.favoriteBean_.set(i, favoriteBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, favoriteBean);
                }
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", FavoriteBeanPage.class.getName());
            DEFAULT_INSTANCE = new FavoriteBeanPage();
            PARSER = new AbstractParser<FavoriteBeanPage>() { // from class: com.base.model.proto.FavoriteProto.FavoriteBeanPage.1
                @Override // com.google.protobuf.Parser
                public FavoriteBeanPage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = FavoriteBeanPage.newBuilder();
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

        private FavoriteBeanPage() {
            this.memoizedIsInitialized = (byte) -1;
            this.favoriteBean_ = Collections.emptyList();
        }

        public /* synthetic */ FavoriteBeanPage(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private FavoriteBeanPage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FavoriteBeanPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return FavoriteProto.internal_static_com_base_model_proto_FavoriteBeanPage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(FavoriteBeanPage favoriteBeanPage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(favoriteBeanPage);
        }

        public static FavoriteBeanPage parseDelimitedFrom(InputStream inputStream) {
            return (FavoriteBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FavoriteBeanPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteBeanPage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static FavoriteBeanPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FavoriteBeanPage parseFrom(CodedInputStream codedInputStream) {
            return (FavoriteBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static FavoriteBeanPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static FavoriteBeanPage parseFrom(InputStream inputStream) {
            return (FavoriteBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static FavoriteBeanPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FavoriteBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FavoriteBeanPage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static FavoriteBeanPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static FavoriteBeanPage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FavoriteBeanPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<FavoriteBeanPage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FavoriteBeanPage)) {
                return super.equals(obj);
            }
            FavoriteBeanPage favoriteBeanPage = (FavoriteBeanPage) obj;
            return getFavoriteBeanList().equals(favoriteBeanPage.getFavoriteBeanList()) && getUnknownFields().equals(favoriteBeanPage.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FavoriteBeanPage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
        public FavoriteBean getFavoriteBean(int i) {
            return this.favoriteBean_.get(i);
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
        public int getFavoriteBeanCount() {
            return this.favoriteBean_.size();
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
        public List<FavoriteBean> getFavoriteBeanList() {
            return this.favoriteBean_;
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
        public FavoriteBeanOrBuilder getFavoriteBeanOrBuilder(int i) {
            return this.favoriteBean_.get(i);
        }

        @Override // com.base.model.proto.FavoriteProto.FavoriteBeanPageOrBuilder
        public List<? extends FavoriteBeanOrBuilder> getFavoriteBeanOrBuilderList() {
            return this.favoriteBean_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FavoriteBeanPage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.favoriteBean_.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.favoriteBean_.get(i2));
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
            if (getFavoriteBeanCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getFavoriteBeanList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return FavoriteProto.internal_static_com_base_model_proto_FavoriteBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(FavoriteBeanPage.class, Builder.class);
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
            for (int i = 0; i < this.favoriteBean_.size(); i++) {
                codedOutputStream.writeMessage(1, this.favoriteBean_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface FavoriteBeanPageOrBuilder extends MessageOrBuilder {
        FavoriteBean getFavoriteBean(int i);

        int getFavoriteBeanCount();

        List<FavoriteBean> getFavoriteBeanList();

        FavoriteBeanOrBuilder getFavoriteBeanOrBuilder(int i);

        List<? extends FavoriteBeanOrBuilder> getFavoriteBeanOrBuilderList();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", FavoriteProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eFavorite.proto\u0012\u0014com.base.model.proto\"¡\u0002\n\fFavoriteBean\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007user_id\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006vod_id\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bcreate_time\u0018\u0004 \u0001(\u0003\u0012\u0010\n\bvod_name\u0018\u0005 \u0001(\t\u0012\u0011\n\tcover_url\u0018\u0006 \u0001(\t\u0012\r\n\u0005stars\u0018\u0007 \u0001(\u0003\u0012\u0013\n\u000bstars_count\u0018\b \u0001(\u0005\u0012\f\n\u0004year\u0018\t \u0001(\u0005\u0012\f\n\u0004area\u0018\n \u0001(\t\u0012\r\n\u0005actor\u0018\u000b \u0001(\t\u0012\f\n\u0004type\u0018\f \u0001(\u0005\u0012\u0012\n\ncate_type2\u0018\r \u0001(\u0005\u0012\u000b\n\u0003ext\u0018\u000e \u0001(\u0005\u0012\u0010\n\bdirector\u0018\u000f \u0001(\t\u0012\u000b\n\u0003tag\u0018\u0010 \u0001(\t\u0012\r\n\u0005clazz\u0018\u0011 \u0001(\t\"L\n\u0010FavoriteBeanPage\u00128\n\ffavoriteBean\u0018\u0001 \u0003(\u000b2\".com.base.model.proto.FavoriteBeanB\u000fB\rFavoriteProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_FavoriteBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_FavoriteBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Id", "UserId", "VodId", "CreateTime", "VodName", "CoverUrl", "Stars", "StarsCount", "Year", "Area", "Actor", "Type", "CateType2", "Ext", "Director", "Tag", "Clazz"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_FavoriteBeanPage_descriptor = descriptor3;
        internal_static_com_base_model_proto_FavoriteBeanPage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"FavoriteBean"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private FavoriteProto() {
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
