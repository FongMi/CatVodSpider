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
public final class DramaVideoProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_DramaVideoBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_DramaVideoBean_fieldAccessorTable;

    public final class DramaVideoBean extends GeneratedMessage implements DramaVideoBeanOrBuilder {
        public static final int CLASS_TYPE_FIELD_NUMBER = 17;
        private static final DramaVideoBean DEFAULT_INSTANCE;
        public static final int DRAMA_ID_FIELD_NUMBER = 15;
        public static final int EPISODE_FIELD_NUMBER = 13;
        public static final int FORMAT_FIELD_NUMBER = 7;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int IS_VIP_FIELD_NUMBER = 14;
        private static final Parser<DramaVideoBean> PARSER;
        public static final int PATH_FIELD_NUMBER = 4;
        public static final int PRIORITY_FIELD_NUMBER = 16;
        public static final int SEASON_FIELD_NUMBER = 12;
        public static final int SIZE_FIELD_NUMBER = 5;
        public static final int SORT_FIELD_NUMBER = 18;
        public static final int SOURCE_CN_FIELD_NUMBER = 10;
        public static final int SOURCE_FIELD_NUMBER = 9;
        public static final int SOURCE_OLD_FIELD_NUMBER = 11;
        public static final int TIME_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int TITLE_OLD_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int classType_;
        private int dramaId_;
        private int episode_;
        private volatile Object format_;
        private int id_;
        private boolean isVip_;
        private byte memoizedIsInitialized;
        private volatile Object path_;
        private int priority_;
        private int season_;
        private long size_;
        private long sort_;
        private volatile Object sourceCn_;
        private volatile Object sourceOld_;
        private volatile Object source_;
        private long time_;
        private volatile Object titleOld_;
        private volatile Object title_;
        private int type_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements DramaVideoBeanOrBuilder {
            private int bitField0_;
            private int classType_;
            private int dramaId_;
            private int episode_;
            private Object format_;
            private int id_;
            private boolean isVip_;
            private Object path_;
            private int priority_;
            private int season_;
            private long size_;
            private long sort_;
            private Object sourceCn_;
            private Object sourceOld_;
            private Object source_;
            private long time_;
            private Object titleOld_;
            private Object title_;
            private int type_;

            private Builder() {
                this.title_ = "";
                this.titleOld_ = "";
                this.path_ = "";
                this.format_ = "";
                this.source_ = "";
                this.sourceCn_ = "";
                this.sourceOld_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.title_ = "";
                this.titleOld_ = "";
                this.path_ = "";
                this.format_ = "";
                this.source_ = "";
                this.sourceCn_ = "";
                this.sourceOld_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(DramaVideoBean dramaVideoBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    dramaVideoBean.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    dramaVideoBean.title_ = this.title_;
                }
                if ((i & 4) != 0) {
                    dramaVideoBean.titleOld_ = this.titleOld_;
                }
                if ((i & 8) != 0) {
                    dramaVideoBean.path_ = this.path_;
                }
                if ((i & 16) != 0) {
                    dramaVideoBean.size_ = this.size_;
                }
                if ((i & 32) != 0) {
                    dramaVideoBean.time_ = this.time_;
                }
                if ((i & 64) != 0) {
                    dramaVideoBean.format_ = this.format_;
                }
                if ((i & 128) != 0) {
                    dramaVideoBean.type_ = this.type_;
                }
                if ((i & 256) != 0) {
                    dramaVideoBean.source_ = this.source_;
                }
                if ((i & 512) != 0) {
                    dramaVideoBean.sourceCn_ = this.sourceCn_;
                }
                if ((i & 1024) != 0) {
                    dramaVideoBean.sourceOld_ = this.sourceOld_;
                }
                if ((i & 2048) != 0) {
                    dramaVideoBean.season_ = this.season_;
                }
                if ((i & 4096) != 0) {
                    dramaVideoBean.episode_ = this.episode_;
                }
                if ((i & 8192) != 0) {
                    dramaVideoBean.isVip_ = this.isVip_;
                }
                if ((i & 16384) != 0) {
                    dramaVideoBean.dramaId_ = this.dramaId_;
                }
                if ((32768 & i) != 0) {
                    dramaVideoBean.priority_ = this.priority_;
                }
                if ((65536 & i) != 0) {
                    dramaVideoBean.classType_ = this.classType_;
                }
                if ((i & 131072) != 0) {
                    dramaVideoBean.sort_ = this.sort_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return DramaVideoProto.internal_static_com_base_model_proto_DramaVideoBean_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaVideoBean build() {
                DramaVideoBean dramaVideoBeanBuildPartial = buildPartial();
                if (dramaVideoBeanBuildPartial.isInitialized()) {
                    return dramaVideoBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dramaVideoBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DramaVideoBean buildPartial() {
                DramaVideoBean dramaVideoBean = new DramaVideoBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dramaVideoBean);
                }
                onBuilt();
                return dramaVideoBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.title_ = "";
                this.titleOld_ = "";
                this.path_ = "";
                this.size_ = 0L;
                this.time_ = 0L;
                this.format_ = "";
                this.type_ = 0;
                this.source_ = "";
                this.sourceCn_ = "";
                this.sourceOld_ = "";
                this.season_ = 0;
                this.episode_ = 0;
                this.isVip_ = false;
                this.dramaId_ = 0;
                this.priority_ = 0;
                this.classType_ = 0;
                this.sort_ = 0L;
                return this;
            }

            public Builder clearClassType() {
                this.bitField0_ &= -65537;
                this.classType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDramaId() {
                this.bitField0_ &= -16385;
                this.dramaId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEpisode() {
                this.bitField0_ &= -4097;
                this.episode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearFormat() {
                this.format_ = DramaVideoBean.getDefaultInstance().getFormat();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsVip() {
                this.bitField0_ &= -8193;
                this.isVip_ = false;
                onChanged();
                return this;
            }

            public Builder clearPath() {
                this.path_ = DramaVideoBean.getDefaultInstance().getPath();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearPriority() {
                this.bitField0_ &= -32769;
                this.priority_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSeason() {
                this.bitField0_ &= -2049;
                this.season_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSize() {
                this.bitField0_ &= -17;
                this.size_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSort() {
                this.bitField0_ &= -131073;
                this.sort_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.source_ = DramaVideoBean.getDefaultInstance().getSource();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearSourceCn() {
                this.sourceCn_ = DramaVideoBean.getDefaultInstance().getSourceCn();
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder clearSourceOld() {
                this.sourceOld_ = DramaVideoBean.getDefaultInstance().getSourceOld();
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearTime() {
                this.bitField0_ &= -33;
                this.time_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = DramaVideoBean.getDefaultInstance().getTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTitleOld() {
                this.titleOld_ = DramaVideoBean.getDefaultInstance().getTitleOld();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -129;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getClassType() {
                return this.classType_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DramaVideoBean getDefaultInstanceForType() {
                return DramaVideoBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DramaVideoProto.internal_static_com_base_model_proto_DramaVideoBean_descriptor;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getDramaId() {
                return this.dramaId_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getEpisode() {
                return this.episode_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getFormat() {
                Object obj = this.format_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.format_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getFormatBytes() {
                Object obj = this.format_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.format_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public boolean getIsVip() {
                return this.isVip_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getPath() {
                Object obj = this.path_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.path_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getPathBytes() {
                Object obj = this.path_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.path_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getPriority() {
                return this.priority_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getSeason() {
                return this.season_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public long getSize() {
                return this.size_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public long getSort() {
                return this.sort_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getSource() {
                Object obj = this.source_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.source_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getSourceBytes() {
                Object obj = this.source_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.source_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getSourceCn() {
                Object obj = this.sourceCn_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sourceCn_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getSourceCnBytes() {
                Object obj = this.sourceCn_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceCn_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getSourceOld() {
                Object obj = this.sourceOld_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.sourceOld_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getSourceOldBytes() {
                Object obj = this.sourceOld_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.sourceOld_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public long getTime() {
                return this.time_;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.title_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public String getTitleOld() {
                Object obj = this.titleOld_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.titleOld_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public ByteString getTitleOldBytes() {
                Object obj = this.titleOld_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.titleOld_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
            public int getType() {
                return this.type_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return DramaVideoProto.internal_static_com_base_model_proto_DramaVideoBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaVideoBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DramaVideoBean dramaVideoBean) {
                if (dramaVideoBean == DramaVideoBean.getDefaultInstance()) {
                    return this;
                }
                if (dramaVideoBean.getId() != 0) {
                    setId(dramaVideoBean.getId());
                }
                if (!dramaVideoBean.getTitle().isEmpty()) {
                    this.title_ = dramaVideoBean.title_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!dramaVideoBean.getTitleOld().isEmpty()) {
                    this.titleOld_ = dramaVideoBean.titleOld_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!dramaVideoBean.getPath().isEmpty()) {
                    this.path_ = dramaVideoBean.path_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (dramaVideoBean.getSize() != 0) {
                    setSize(dramaVideoBean.getSize());
                }
                if (dramaVideoBean.getTime() != 0) {
                    setTime(dramaVideoBean.getTime());
                }
                if (!dramaVideoBean.getFormat().isEmpty()) {
                    this.format_ = dramaVideoBean.format_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (dramaVideoBean.getType() != 0) {
                    setType(dramaVideoBean.getType());
                }
                if (!dramaVideoBean.getSource().isEmpty()) {
                    this.source_ = dramaVideoBean.source_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                if (!dramaVideoBean.getSourceCn().isEmpty()) {
                    this.sourceCn_ = dramaVideoBean.sourceCn_;
                    this.bitField0_ |= 512;
                    onChanged();
                }
                if (!dramaVideoBean.getSourceOld().isEmpty()) {
                    this.sourceOld_ = dramaVideoBean.sourceOld_;
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                if (dramaVideoBean.getSeason() != 0) {
                    setSeason(dramaVideoBean.getSeason());
                }
                if (dramaVideoBean.getEpisode() != 0) {
                    setEpisode(dramaVideoBean.getEpisode());
                }
                if (dramaVideoBean.getIsVip()) {
                    setIsVip(dramaVideoBean.getIsVip());
                }
                if (dramaVideoBean.getDramaId() != 0) {
                    setDramaId(dramaVideoBean.getDramaId());
                }
                if (dramaVideoBean.getPriority() != 0) {
                    setPriority(dramaVideoBean.getPriority());
                }
                if (dramaVideoBean.getClassType() != 0) {
                    setClassType(dramaVideoBean.getClassType());
                }
                if (dramaVideoBean.getSort() != 0) {
                    setSort(dramaVideoBean.getSort());
                }
                mergeUnknownFields(dramaVideoBean.getUnknownFields());
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
                                    this.titleOld_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                    break;
                                case 34:
                                    this.path_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 8;
                                    break;
                                case 40:
                                    this.size_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.time_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.format_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.type_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    this.source_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 256;
                                    break;
                                case 82:
                                    this.sourceCn_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 512;
                                    break;
                                case 90:
                                    this.sourceOld_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1024;
                                    break;
                                case 96:
                                    this.season_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 104:
                                    this.episode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.isVip_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 120:
                                    this.dramaId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 128:
                                    this.priority_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 32768;
                                    break;
                                case 136:
                                    this.classType_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 65536;
                                    break;
                                case 144:
                                    this.sort_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 131072;
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
                if (message instanceof DramaVideoBean) {
                    return mergeFrom((DramaVideoBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setClassType(int i) {
                this.classType_ = i;
                this.bitField0_ |= 65536;
                onChanged();
                return this;
            }

            public Builder setDramaId(int i) {
                this.dramaId_ = i;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setEpisode(int i) {
                this.episode_ = i;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setFormat(String str) {
                str.getClass();
                this.format_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFormatBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.format_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setId(int i) {
                this.id_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIsVip(boolean z) {
                this.isVip_ = z;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setPath(String str) {
                str.getClass();
                this.path_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPathBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.path_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPriority(int i) {
                this.priority_ = i;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setSeason(int i) {
                this.season_ = i;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSize(long j) {
                this.size_ = j;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSort(long j) {
                this.sort_ = j;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setSource(String str) {
                str.getClass();
                this.source_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.source_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSourceCn(String str) {
                str.getClass();
                this.sourceCn_ = str;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSourceCnBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.sourceCn_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSourceOld(String str) {
                str.getClass();
                this.sourceOld_ = str;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setSourceOldBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.sourceOld_ = byteString;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setTime(long j) {
                this.time_ = j;
                this.bitField0_ |= 32;
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

            public Builder setTitleOld(String str) {
                str.getClass();
                this.titleOld_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTitleOldBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.titleOld_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setType(int i) {
                this.type_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaVideoBean.class.getName());
            DEFAULT_INSTANCE = new DramaVideoBean();
            PARSER = new AbstractParser<DramaVideoBean>() { // from class: com.base.model.proto.DramaVideoProto.DramaVideoBean.1
                @Override // com.google.protobuf.Parser
                public DramaVideoBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = DramaVideoBean.newBuilder();
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

        private DramaVideoBean() {
            this.id_ = 0;
            this.title_ = "";
            this.titleOld_ = "";
            this.path_ = "";
            this.size_ = 0L;
            this.time_ = 0L;
            this.format_ = "";
            this.type_ = 0;
            this.source_ = "";
            this.sourceCn_ = "";
            this.sourceOld_ = "";
            this.season_ = 0;
            this.episode_ = 0;
            this.isVip_ = false;
            this.dramaId_ = 0;
            this.priority_ = 0;
            this.classType_ = 0;
            this.sort_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.title_ = "";
            this.titleOld_ = "";
            this.path_ = "";
            this.format_ = "";
            this.source_ = "";
            this.sourceCn_ = "";
            this.sourceOld_ = "";
        }

        public /* synthetic */ DramaVideoBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private DramaVideoBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.title_ = "";
            this.titleOld_ = "";
            this.path_ = "";
            this.size_ = 0L;
            this.time_ = 0L;
            this.format_ = "";
            this.type_ = 0;
            this.source_ = "";
            this.sourceCn_ = "";
            this.sourceOld_ = "";
            this.season_ = 0;
            this.episode_ = 0;
            this.isVip_ = false;
            this.dramaId_ = 0;
            this.priority_ = 0;
            this.classType_ = 0;
            this.sort_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DramaVideoBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DramaVideoProto.internal_static_com_base_model_proto_DramaVideoBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DramaVideoBean dramaVideoBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dramaVideoBean);
        }

        public static DramaVideoBean parseDelimitedFrom(InputStream inputStream) {
            return (DramaVideoBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DramaVideoBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaVideoBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaVideoBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static DramaVideoBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DramaVideoBean parseFrom(CodedInputStream codedInputStream) {
            return (DramaVideoBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static DramaVideoBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaVideoBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static DramaVideoBean parseFrom(InputStream inputStream) {
            return (DramaVideoBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static DramaVideoBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DramaVideoBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DramaVideoBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DramaVideoBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DramaVideoBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DramaVideoBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<DramaVideoBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DramaVideoBean)) {
                return super.equals(obj);
            }
            DramaVideoBean dramaVideoBean = (DramaVideoBean) obj;
            return getId() == dramaVideoBean.getId() && getTitle().equals(dramaVideoBean.getTitle()) && getTitleOld().equals(dramaVideoBean.getTitleOld()) && getPath().equals(dramaVideoBean.getPath()) && getSize() == dramaVideoBean.getSize() && getTime() == dramaVideoBean.getTime() && getFormat().equals(dramaVideoBean.getFormat()) && getType() == dramaVideoBean.getType() && getSource().equals(dramaVideoBean.getSource()) && getSourceCn().equals(dramaVideoBean.getSourceCn()) && getSourceOld().equals(dramaVideoBean.getSourceOld()) && getSeason() == dramaVideoBean.getSeason() && getEpisode() == dramaVideoBean.getEpisode() && getIsVip() == dramaVideoBean.getIsVip() && getDramaId() == dramaVideoBean.getDramaId() && getPriority() == dramaVideoBean.getPriority() && getClassType() == dramaVideoBean.getClassType() && getSort() == dramaVideoBean.getSort() && getUnknownFields().equals(dramaVideoBean.getUnknownFields());
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getClassType() {
            return this.classType_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DramaVideoBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getDramaId() {
            return this.dramaId_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getEpisode() {
            return this.episode_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getFormat() {
            Object obj = this.format_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.format_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getFormatBytes() {
            Object obj = this.format_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.format_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public boolean getIsVip() {
            return this.isVip_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DramaVideoBean> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getPath() {
            Object obj = this.path_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.path_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getPathBytes() {
            Object obj = this.path_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.path_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getSeason() {
            return this.season_;
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
            if (!GeneratedMessage.isStringEmpty(this.titleOld_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(3, this.titleOld_);
            }
            if (!GeneratedMessage.isStringEmpty(this.path_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(4, this.path_);
            }
            long j = this.size_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(5, j);
            }
            long j2 = this.time_;
            if (j2 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(6, j2);
            }
            if (!GeneratedMessage.isStringEmpty(this.format_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(7, this.format_);
            }
            int i3 = this.type_;
            if (i3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, i3);
            }
            if (!GeneratedMessage.isStringEmpty(this.source_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(9, this.source_);
            }
            if (!GeneratedMessage.isStringEmpty(this.sourceCn_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(10, this.sourceCn_);
            }
            if (!GeneratedMessage.isStringEmpty(this.sourceOld_)) {
                iComputeInt32Size += GeneratedMessage.computeStringSize(11, this.sourceOld_);
            }
            int i4 = this.season_;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, i4);
            }
            int i5 = this.episode_;
            if (i5 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(13, i5);
            }
            boolean z = this.isVip_;
            if (z) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(14, z);
            }
            int i6 = this.dramaId_;
            if (i6 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(15, i6);
            }
            int i7 = this.priority_;
            if (i7 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(16, i7);
            }
            int i8 = this.classType_;
            if (i8 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(17, i8);
            }
            long j3 = this.sort_;
            if (j3 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(18, j3);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public long getSize() {
            return this.size_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public long getSort() {
            return this.sort_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getSource() {
            Object obj = this.source_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.source_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getSourceCn() {
            Object obj = this.sourceCn_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sourceCn_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getSourceCnBytes() {
            Object obj = this.sourceCn_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceCn_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getSourceOld() {
            Object obj = this.sourceOld_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sourceOld_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getSourceOldBytes() {
            Object obj = this.sourceOld_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sourceOld_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public long getTime() {
            return this.time_;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.title_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public String getTitleOld() {
            Object obj = this.titleOld_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.titleOld_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public ByteString getTitleOldBytes() {
            Object obj = this.titleOld_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.titleOld_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.DramaVideoProto.DramaVideoBeanOrBuilder
        public int getType() {
            return this.type_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((Internal.hashLong(getSort()) + ((((getClassType() + ((((getPriority() + ((((getDramaId() + ((((Internal.hashBoolean(getIsVip()) + ((((getEpisode() + ((((getSeason() + ((((getSourceOld().hashCode() + ((((getSourceCn().hashCode() + ((((getSource().hashCode() + ((((getType() + ((((getFormat().hashCode() + ((((Internal.hashLong(getTime()) + ((((Internal.hashLong(getSize()) + ((((getPath().hashCode() + ((((getTitleOld().hashCode() + ((((getTitle().hashCode() + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 37) + 17) * 53)) * 37) + 18) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return DramaVideoProto.internal_static_com_base_model_proto_DramaVideoBean_fieldAccessorTable.ensureFieldAccessorsInitialized(DramaVideoBean.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.titleOld_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.titleOld_);
            }
            if (!GeneratedMessage.isStringEmpty(this.path_)) {
                GeneratedMessage.writeString(codedOutputStream, 4, this.path_);
            }
            long j = this.size_;
            if (j != 0) {
                codedOutputStream.writeInt64(5, j);
            }
            long j2 = this.time_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(6, j2);
            }
            if (!GeneratedMessage.isStringEmpty(this.format_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.format_);
            }
            int i2 = this.type_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(8, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.source_)) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.source_);
            }
            if (!GeneratedMessage.isStringEmpty(this.sourceCn_)) {
                GeneratedMessage.writeString(codedOutputStream, 10, this.sourceCn_);
            }
            if (!GeneratedMessage.isStringEmpty(this.sourceOld_)) {
                GeneratedMessage.writeString(codedOutputStream, 11, this.sourceOld_);
            }
            int i3 = this.season_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(12, i3);
            }
            int i4 = this.episode_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(13, i4);
            }
            boolean z = this.isVip_;
            if (z) {
                codedOutputStream.writeBool(14, z);
            }
            int i5 = this.dramaId_;
            if (i5 != 0) {
                codedOutputStream.writeInt32(15, i5);
            }
            int i6 = this.priority_;
            if (i6 != 0) {
                codedOutputStream.writeInt32(16, i6);
            }
            int i7 = this.classType_;
            if (i7 != 0) {
                codedOutputStream.writeInt32(17, i7);
            }
            long j3 = this.sort_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(18, j3);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface DramaVideoBeanOrBuilder extends MessageOrBuilder {
        int getClassType();

        int getDramaId();

        int getEpisode();

        String getFormat();

        ByteString getFormatBytes();

        int getId();

        boolean getIsVip();

        String getPath();

        ByteString getPathBytes();

        int getPriority();

        int getSeason();

        long getSize();

        long getSort();

        String getSource();

        ByteString getSourceBytes();

        String getSourceCn();

        ByteString getSourceCnBytes();

        String getSourceOld();

        ByteString getSourceOldBytes();

        long getTime();

        String getTitle();

        ByteString getTitleBytes();

        String getTitleOld();

        ByteString getTitleOldBytes();

        int getType();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", DramaVideoProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010DramaVideo.proto\u0012\u0014com.base.model.proto\"´\u0002\n\u000eDramaVideoBean\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u0011\n\ttitle_old\u0018\u0003 \u0001(\t\u0012\f\n\u0004path\u0018\u0004 \u0001(\t\u0012\f\n\u0004size\u0018\u0005 \u0001(\u0003\u0012\f\n\u0004time\u0018\u0006 \u0001(\u0003\u0012\u000e\n\u0006format\u0018\u0007 \u0001(\t\u0012\f\n\u0004type\u0018\b \u0001(\u0005\u0012\u000e\n\u0006source\u0018\t \u0001(\t\u0012\u0011\n\tsource_cn\u0018\n \u0001(\t\u0012\u0012\n\nsource_old\u0018\u000b \u0001(\t\u0012\u000e\n\u0006season\u0018\f \u0001(\u0005\u0012\u000f\n\u0007episode\u0018\r \u0001(\u0005\u0012\u000e\n\u0006is_vip\u0018\u000e \u0001(\b\u0012\u0010\n\bdrama_id\u0018\u000f \u0001(\u0005\u0012\u0010\n\bpriority\u0018\u0010 \u0001(\u0005\u0012\u0012\n\nclass_type\u0018\u0011 \u0001(\u0005\u0012\f\n\u0004sort\u0018\u0012 \u0001(\u0003B\u0011B\u000fDramaVideoProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_DramaVideoBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_DramaVideoBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Id", "Title", "TitleOld", "Path", "Size", "Time", "Format", "Type", "Source", "SourceCn", "SourceOld", "Season", "Episode", "IsVip", "DramaId", "Priority", "ClassType", "Sort"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private DramaVideoProto() {
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
