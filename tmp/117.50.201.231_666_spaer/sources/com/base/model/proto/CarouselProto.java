package com.base.model.proto;

import com.base.model.proto.DramaDetailProto;
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
public final class CarouselProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_CarouselBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_CarouselBean_fieldAccessorTable;

    public final class CarouselBean extends GeneratedMessage implements CarouselBeanOrBuilder {
        public static final int COVER_FIELD_NUMBER = 6;
        public static final int CREATE_TIME_FIELD_NUMBER = 10;
        private static final CarouselBean DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 5;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LINK_FIELD_NUMBER = 7;
        public static final int LIVE_TYPE_FIELD_NUMBER = 4;
        public static final int LIVE_URL_FIELD_NUMBER = 3;
        private static final Parser<CarouselBean> PARSER;
        public static final int PIC_LINK_FIELD_NUMBER = 12;
        public static final int SORT_FIELD_NUMBER = 9;
        public static final int STATE_FIELD_NUMBER = 8;
        public static final int THEME_COLOR_FIELD_NUMBER = 13;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int UPDATE_TIME_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private volatile Object cover_;
        private int createTime_;
        private volatile Object description_;
        private int id_;
        private volatile Object link_;
        private int liveType_;
        private volatile Object liveUrl_;
        private byte memoizedIsInitialized;
        private volatile Object picLink_;
        private int sort_;
        private int state_;
        private volatile Object themeColor_;
        private volatile Object title_;
        private int updateTime_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements CarouselBeanOrBuilder {
            private int bitField0_;
            private Object cover_;
            private int createTime_;
            private Object description_;
            private int id_;
            private Object link_;
            private int liveType_;
            private Object liveUrl_;
            private Object picLink_;
            private int sort_;
            private int state_;
            private Object themeColor_;
            private Object title_;
            private int updateTime_;

            private Builder() {
                this.title_ = "";
                this.liveUrl_ = "";
                this.description_ = "";
                this.cover_ = "";
                this.link_ = "";
                this.picLink_ = "";
                this.themeColor_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
                this.liveUrl_ = "";
                this.description_ = "";
                this.cover_ = "";
                this.link_ = "";
                this.picLink_ = "";
                this.themeColor_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(CarouselBean carouselBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    carouselBean.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    carouselBean.title_ = this.title_;
                }
                if ((i & 4) != 0) {
                    carouselBean.liveUrl_ = this.liveUrl_;
                }
                if ((i & 8) != 0) {
                    carouselBean.liveType_ = this.liveType_;
                }
                if ((i & 16) != 0) {
                    carouselBean.description_ = this.description_;
                }
                if ((i & 32) != 0) {
                    carouselBean.cover_ = this.cover_;
                }
                if ((i & 64) != 0) {
                    carouselBean.link_ = this.link_;
                }
                if ((i & 128) != 0) {
                    carouselBean.state_ = this.state_;
                }
                if ((i & 256) != 0) {
                    carouselBean.sort_ = this.sort_;
                }
                if ((i & 512) != 0) {
                    carouselBean.createTime_ = this.createTime_;
                }
                if ((i & 1024) != 0) {
                    carouselBean.updateTime_ = this.updateTime_;
                }
                if ((i & 2048) != 0) {
                    carouselBean.picLink_ = this.picLink_;
                }
                if ((i & 4096) != 0) {
                    carouselBean.themeColor_ = this.themeColor_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return CarouselProto.internal_static_com_base_model_proto_CarouselBean_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CarouselBean build() {
                CarouselBean carouselBeanBuildPartial = buildPartial();
                if (carouselBeanBuildPartial.isInitialized()) {
                    return carouselBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) carouselBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CarouselBean buildPartial() {
                CarouselBean carouselBean = new CarouselBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(carouselBean);
                }
                onBuilt();
                return carouselBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.title_ = "";
                this.liveUrl_ = "";
                this.liveType_ = 0;
                this.description_ = "";
                this.cover_ = "";
                this.link_ = "";
                this.state_ = 0;
                this.sort_ = 0;
                this.createTime_ = 0;
                this.updateTime_ = 0;
                this.picLink_ = "";
                this.themeColor_ = "";
                return this;
            }

            public Builder clearCover() {
                this.cover_ = CarouselBean.getDefaultInstance().getCover();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearCreateTime() {
                this.bitField0_ &= -513;
                this.createTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = CarouselBean.getDefaultInstance().getDescription();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLink() {
                this.link_ = CarouselBean.getDefaultInstance().getLink();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearLiveType() {
                this.bitField0_ &= -9;
                this.liveType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLiveUrl() {
                this.liveUrl_ = CarouselBean.getDefaultInstance().getLiveUrl();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPicLink() {
                this.picLink_ = CarouselBean.getDefaultInstance().getPicLink();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearSort() {
                this.bitField0_ &= -257;
                this.sort_ = 0;
                onChanged();
                return this;
            }

            public Builder clearState() {
                this.bitField0_ &= -129;
                this.state_ = 0;
                onChanged();
                return this;
            }

            public Builder clearThemeColor() {
                this.themeColor_ = CarouselBean.getDefaultInstance().getThemeColor();
                this.bitField0_ &= -4097;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = CarouselBean.getDefaultInstance().getTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUpdateTime() {
                this.bitField0_ &= -1025;
                this.updateTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getCover() {
                Object obj = this.cover_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cover_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getCoverBytes() {
                Object obj = this.cover_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cover_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public int getCreateTime() {
                return this.createTime_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CarouselBean getDefaultInstanceForType() {
                return CarouselBean.getDefaultInstance();
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.description_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return CarouselProto.internal_static_com_base_model_proto_CarouselBean_descriptor;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getLink() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.link_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getLinkBytes() {
                Object obj = this.link_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.link_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public int getLiveType() {
                return this.liveType_;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getLiveUrl() {
                Object obj = this.liveUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.liveUrl_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getLiveUrlBytes() {
                Object obj = this.liveUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.liveUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getPicLink() {
                Object obj = this.picLink_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.picLink_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getPicLinkBytes() {
                Object obj = this.picLink_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.picLink_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public int getSort() {
                return this.sort_;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public int getState() {
                return this.state_;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getThemeColor() {
                Object obj = this.themeColor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.themeColor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getThemeColorBytes() {
                Object obj = this.themeColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.themeColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
            public int getUpdateTime() {
                return this.updateTime_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return CarouselProto.internal_static_com_base_model_proto_CarouselBean_fieldAccessorTable.ensureFieldAccessorsInitialized(CarouselBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CarouselBean carouselBean) {
                if (carouselBean == CarouselBean.getDefaultInstance()) {
                    return this;
                }
                if (carouselBean.getId() != 0) {
                    setId(carouselBean.getId());
                }
                if (!carouselBean.getTitle().isEmpty()) {
                    this.title_ = carouselBean.title_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!carouselBean.getLiveUrl().isEmpty()) {
                    this.liveUrl_ = carouselBean.liveUrl_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (carouselBean.getLiveType() != 0) {
                    setLiveType(carouselBean.getLiveType());
                }
                if (!carouselBean.getDescription().isEmpty()) {
                    this.description_ = carouselBean.description_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (!carouselBean.getCover().isEmpty()) {
                    this.cover_ = carouselBean.cover_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (!carouselBean.getLink().isEmpty()) {
                    this.link_ = carouselBean.link_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (carouselBean.getState() != 0) {
                    setState(carouselBean.getState());
                }
                if (carouselBean.getSort() != 0) {
                    setSort(carouselBean.getSort());
                }
                if (carouselBean.getCreateTime() != 0) {
                    setCreateTime(carouselBean.getCreateTime());
                }
                if (carouselBean.getUpdateTime() != 0) {
                    setUpdateTime(carouselBean.getUpdateTime());
                }
                if (!carouselBean.getPicLink().isEmpty()) {
                    this.picLink_ = carouselBean.picLink_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                if (!carouselBean.getThemeColor().isEmpty()) {
                    this.themeColor_ = carouselBean.themeColor_;
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                mergeUnknownFields(carouselBean.getUnknownFields());
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
                                case 18:
                                    this.title_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.liveUrl_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                    break;
                                case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                                    this.liveType_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.description_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 50:
                                    this.cover_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.link_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.state_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.sort_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.createTime_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 512;
                                    break;
                                case 88:
                                    this.updateTime_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 98:
                                    this.picLink_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 106:
                                    this.themeColor_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4096;
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
                if (message instanceof CarouselBean) {
                    return mergeFrom((CarouselBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCover(String str) {
                str.getClass();
                this.cover_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCoverBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.cover_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCreateTime(int i) {
                this.createTime_ = i;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.description_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setId(int i) {
                this.id_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLink(String str) {
                str.getClass();
                this.link_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLinkBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.link_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLiveType(int i) {
                this.liveType_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLiveUrl(String str) {
                str.getClass();
                this.liveUrl_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLiveUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.liveUrl_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPicLink(String str) {
                str.getClass();
                this.picLink_ = str;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setPicLinkBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.picLink_ = byteString;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSort(int i) {
                this.sort_ = i;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setState(int i) {
                this.state_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setThemeColor(String str) {
                str.getClass();
                this.themeColor_ = str;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setThemeColorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.themeColor_ = byteString;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.title_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUpdateTime(int i) {
                this.updateTime_ = i;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", CarouselBean.class.getName());
            DEFAULT_INSTANCE = new CarouselBean();
            PARSER = new AbstractParser<CarouselBean>() { // from class: com.base.model.proto.CarouselProto.CarouselBean.1
                @Override // com.google.protobuf.Parser
                public CarouselBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = CarouselBean.newBuilder();
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

        private CarouselBean() {
            this.id_ = 0;
            this.title_ = "";
            this.liveUrl_ = "";
            this.liveType_ = 0;
            this.description_ = "";
            this.cover_ = "";
            this.link_ = "";
            this.state_ = 0;
            this.sort_ = 0;
            this.createTime_ = 0;
            this.updateTime_ = 0;
            this.picLink_ = "";
            this.themeColor_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.liveUrl_ = "";
            this.description_ = "";
            this.cover_ = "";
            this.link_ = "";
            this.picLink_ = "";
            this.themeColor_ = "";
        }

        public /* synthetic */ CarouselBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private CarouselBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.title_ = "";
            this.liveUrl_ = "";
            this.liveType_ = 0;
            this.description_ = "";
            this.cover_ = "";
            this.link_ = "";
            this.state_ = 0;
            this.sort_ = 0;
            this.createTime_ = 0;
            this.updateTime_ = 0;
            this.picLink_ = "";
            this.themeColor_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CarouselBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return CarouselProto.internal_static_com_base_model_proto_CarouselBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CarouselBean carouselBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(carouselBean);
        }

        public static CarouselBean parseDelimitedFrom(InputStream inputStream) {
            return (CarouselBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CarouselBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CarouselBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CarouselBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static CarouselBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CarouselBean parseFrom(CodedInputStream codedInputStream) {
            return (CarouselBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static CarouselBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CarouselBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static CarouselBean parseFrom(InputStream inputStream) {
            return (CarouselBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static CarouselBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CarouselBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CarouselBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static CarouselBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static CarouselBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CarouselBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<CarouselBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CarouselBean)) {
                return super.equals(obj);
            }
            CarouselBean carouselBean = (CarouselBean) obj;
            return getId() == carouselBean.getId() && getTitle().equals(carouselBean.getTitle()) && getLiveUrl().equals(carouselBean.getLiveUrl()) && getLiveType() == carouselBean.getLiveType() && getDescription().equals(carouselBean.getDescription()) && getCover().equals(carouselBean.getCover()) && getLink().equals(carouselBean.getLink()) && getState() == carouselBean.getState() && getSort() == carouselBean.getSort() && getCreateTime() == carouselBean.getCreateTime() && getUpdateTime() == carouselBean.getUpdateTime() && getPicLink().equals(carouselBean.getPicLink()) && getThemeColor().equals(carouselBean.getThemeColor()) && getUnknownFields().equals(carouselBean.getUnknownFields());
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getCover() {
            Object obj = this.cover_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cover_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getCoverBytes() {
            Object obj = this.cover_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cover_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public int getCreateTime() {
            return this.createTime_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CarouselBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.description_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getLink() {
            Object obj = this.link_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.link_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getLinkBytes() {
            Object obj = this.link_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.link_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public int getLiveType() {
            return this.liveType_;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getLiveUrl() {
            Object obj = this.liveUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.liveUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getLiveUrlBytes() {
            Object obj = this.liveUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.liveUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CarouselBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getPicLink() {
            Object obj = this.picLink_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.picLink_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getPicLinkBytes() {
            Object obj = this.picLink_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.picLink_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = this.id_;
            int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
            if (!GeneratedMessage.isStringEmpty(this.title_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(2, this.title_);
            }
            if (!GeneratedMessage.isStringEmpty(this.liveUrl_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(3, this.liveUrl_);
            }
            int i3 = this.liveType_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.description_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(5, this.description_);
            }
            if (!GeneratedMessage.isStringEmpty(this.cover_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(6, this.cover_);
            }
            if (!GeneratedMessage.isStringEmpty(this.link_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(7, this.link_);
            }
            int i4 = this.state_;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, i4);
            }
            int i5 = this.sort_;
            if (i5 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, i5);
            }
            int i6 = this.createTime_;
            if (i6 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, i6);
            }
            int i7 = this.updateTime_;
            if (i7 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, i7);
            }
            if (!GeneratedMessage.isStringEmpty(this.picLink_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(12, this.picLink_);
            }
            if (!GeneratedMessage.isStringEmpty(this.themeColor_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(13, this.themeColor_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public int getSort() {
            return this.sort_;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public int getState() {
            return this.state_;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getThemeColor() {
            Object obj = this.themeColor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.themeColor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getThemeColorBytes() {
            Object obj = this.themeColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.themeColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.CarouselProto.CarouselBeanOrBuilder
        public int getUpdateTime() {
            return this.updateTime_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getThemeColor().hashCode() + ((((getPicLink().hashCode() + ((((getUpdateTime() + ((((getCreateTime() + ((((getSort() + ((((getState() + ((((getLink().hashCode() + ((((getCover().hashCode() + ((((getDescription().hashCode() + ((((getLiveType() + ((((getLiveUrl().hashCode() + ((((getTitle().hashCode() + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return CarouselProto.internal_static_com_base_model_proto_CarouselBean_fieldAccessorTable.ensureFieldAccessorsInitialized(CarouselBean.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.title_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.title_);
            }
            if (!GeneratedMessage.isStringEmpty(this.liveUrl_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.liveUrl_);
            }
            int i2 = this.liveType_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(4, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.description_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.description_);
            }
            if (!GeneratedMessage.isStringEmpty(this.cover_)) {
                GeneratedMessage.writeString(codedOutputStream, 6, this.cover_);
            }
            if (!GeneratedMessage.isStringEmpty(this.link_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.link_);
            }
            int i3 = this.state_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(8, i3);
            }
            int i4 = this.sort_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(9, i4);
            }
            int i5 = this.createTime_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(10, i5);
            }
            int i6 = this.updateTime_;
            if (i6 != 0) {
                codedOutputStream.writeInt32(11, i6);
            }
            if (!GeneratedMessage.isStringEmpty(this.picLink_)) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.picLink_);
            }
            if (!GeneratedMessage.isStringEmpty(this.themeColor_)) {
                GeneratedMessage.writeString(codedOutputStream, 13, this.themeColor_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface CarouselBeanOrBuilder extends MessageOrBuilder {
        String getCover();

        ByteString getCoverBytes();

        int getCreateTime();

        String getDescription();

        ByteString getDescriptionBytes();

        int getId();

        String getLink();

        ByteString getLinkBytes();

        int getLiveType();

        String getLiveUrl();

        ByteString getLiveUrlBytes();

        String getPicLink();

        ByteString getPicLinkBytes();

        int getSort();

        int getState();

        String getThemeColor();

        ByteString getThemeColorBytes();

        String getTitle();

        ByteString getTitleBytes();

        int getUpdateTime();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", CarouselProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eCarousel.proto\u0012\u0014com.base.model.proto\"î\u0001\n\fCarouselBean\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u0010\n\blive_url\u0018\u0003 \u0001(\t\u0012\u0011\n\tlive_type\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000bdescription\u0018\u0005 \u0001(\t\u0012\r\n\u0005cover\u0018\u0006 \u0001(\t\u0012\f\n\u0004link\u0018\u0007 \u0001(\t\u0012\r\n\u0005state\u0018\b \u0001(\u0005\u0012\f\n\u0004sort\u0018\t \u0001(\u0005\u0012\u0013\n\u000bcreate_time\u0018\n \u0001(\u0005\u0012\u0013\n\u000bupdate_time\u0018\u000b \u0001(\u0005\u0012\u0010\n\bpic_link\u0018\f \u0001(\t\u0012\u0013\n\u000btheme_color\u0018\r \u0001(\tB\u000fB\rCarouselProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_CarouselBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_CarouselBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Id", "Title", "LiveUrl", "LiveType", "Description", "Cover", "Link", "State", "Sort", "CreateTime", "UpdateTime", "PicLink", "ThemeColor"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private CarouselProto() {
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
