package com.base.model.proto;

import com.base.model.proto.DramaDetailProto;
import com.base.model.proto.UserProto;
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
public final class ChatRoomProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ChatRoomAdd_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ChatRoomAdd_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ChatRoomPage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ChatRoomPage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ChatRoomReq_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ChatRoomReq_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ChatRoomUpdate_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ChatRoomUpdate_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_ChatRoomVO_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_ChatRoomVO_fieldAccessorTable;

    public final class ChatRoomAdd extends GeneratedMessage implements ChatRoomAddOrBuilder {
        public static final int CREATORID_FIELD_NUMBER = 6;
        private static final ChatRoomAdd DEFAULT_INSTANCE;
        private static final Parser<ChatRoomAdd> PARSER;
        public static final int PLAYSOURCE_FIELD_NUMBER = 7;
        public static final int ROOMDESC_FIELD_NUMBER = 2;
        public static final int ROOMNAME_FIELD_NUMBER = 1;
        public static final int ROOMPWD_FIELD_NUMBER = 3;
        public static final int USERHEADIMG_FIELD_NUMBER = 10;
        public static final int USERNAME_FIELD_NUMBER = 9;
        public static final int VIDEOCOVER_FIELD_NUMBER = 5;
        public static final int VIDEOID_FIELD_NUMBER = 4;
        public static final int VIDEONUM_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private long creatorId_;
        private byte memoizedIsInitialized;
        private volatile Object playSource_;
        private volatile Object roomDesc_;
        private volatile Object roomName_;
        private volatile Object roomPwd_;
        private volatile Object userHeadImg_;
        private volatile Object userName_;
        private volatile Object videoCover_;
        private long videoId_;
        private int videoNum_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ChatRoomAddOrBuilder {
            private int bitField0_;
            private long creatorId_;
            private Object playSource_;
            private Object roomDesc_;
            private Object roomName_;
            private Object roomPwd_;
            private Object userHeadImg_;
            private Object userName_;
            private Object videoCover_;
            private long videoId_;
            private int videoNum_;

            private Builder() {
                this.roomName_ = "";
                this.roomDesc_ = "";
                this.roomPwd_ = "";
                this.videoCover_ = "";
                this.playSource_ = "";
                this.userName_ = "";
                this.userHeadImg_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.roomName_ = "";
                this.roomDesc_ = "";
                this.roomPwd_ = "";
                this.videoCover_ = "";
                this.playSource_ = "";
                this.userName_ = "";
                this.userHeadImg_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ChatRoomAdd chatRoomAdd) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    chatRoomAdd.roomName_ = this.roomName_;
                }
                if ((i & 2) != 0) {
                    chatRoomAdd.roomDesc_ = this.roomDesc_;
                }
                if ((i & 4) != 0) {
                    chatRoomAdd.roomPwd_ = this.roomPwd_;
                }
                if ((i & 8) != 0) {
                    chatRoomAdd.videoId_ = this.videoId_;
                }
                if ((i & 16) != 0) {
                    chatRoomAdd.videoCover_ = this.videoCover_;
                }
                if ((i & 32) != 0) {
                    chatRoomAdd.creatorId_ = this.creatorId_;
                }
                if ((i & 64) != 0) {
                    chatRoomAdd.playSource_ = this.playSource_;
                }
                if ((i & 128) != 0) {
                    chatRoomAdd.videoNum_ = this.videoNum_;
                }
                if ((i & 256) != 0) {
                    chatRoomAdd.userName_ = this.userName_;
                }
                if ((i & 512) != 0) {
                    chatRoomAdd.userHeadImg_ = this.userHeadImg_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomAdd_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomAdd build() {
                ChatRoomAdd chatRoomAddBuildPartial = buildPartial();
                if (chatRoomAddBuildPartial.isInitialized()) {
                    return chatRoomAddBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatRoomAddBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomAdd buildPartial() {
                ChatRoomAdd chatRoomAdd = new ChatRoomAdd(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatRoomAdd);
                }
                onBuilt();
                return chatRoomAdd;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.roomName_ = "";
                this.roomDesc_ = "";
                this.roomPwd_ = "";
                this.videoId_ = 0L;
                this.videoCover_ = "";
                this.creatorId_ = 0L;
                this.playSource_ = "";
                this.videoNum_ = 0;
                this.userName_ = "";
                this.userHeadImg_ = "";
                return this;
            }

            public Builder clearCreatorId() {
                this.bitField0_ &= -33;
                this.creatorId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearPlaySource() {
                this.playSource_ = ChatRoomAdd.getDefaultInstance().getPlaySource();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearRoomDesc() {
                this.roomDesc_ = ChatRoomAdd.getDefaultInstance().getRoomDesc();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearRoomName() {
                this.roomName_ = ChatRoomAdd.getDefaultInstance().getRoomName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearRoomPwd() {
                this.roomPwd_ = ChatRoomAdd.getDefaultInstance().getRoomPwd();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearUserHeadImg() {
                this.userHeadImg_ = ChatRoomAdd.getDefaultInstance().getUserHeadImg();
                this.bitField0_ &= -513;
                onChanged();
                return this;
            }

            public Builder clearUserName() {
                this.userName_ = ChatRoomAdd.getDefaultInstance().getUserName();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearVideoCover() {
                this.videoCover_ = ChatRoomAdd.getDefaultInstance().getVideoCover();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearVideoId() {
                this.bitField0_ &= -9;
                this.videoId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVideoNum() {
                this.bitField0_ &= -129;
                this.videoNum_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public long getCreatorId() {
                return this.creatorId_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChatRoomAdd getDefaultInstanceForType() {
                return ChatRoomAdd.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomAdd_descriptor;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getPlaySource() {
                Object obj = this.playSource_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.playSource_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getPlaySourceBytes() {
                Object obj = this.playSource_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.playSource_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getRoomDesc() {
                Object obj = this.roomDesc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomDesc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getRoomDescBytes() {
                Object obj = this.roomDesc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomDesc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getRoomName() {
                Object obj = this.roomName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getRoomNameBytes() {
                Object obj = this.roomName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getRoomPwd() {
                Object obj = this.roomPwd_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomPwd_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getRoomPwdBytes() {
                Object obj = this.roomPwd_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomPwd_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getUserHeadImg() {
                Object obj = this.userHeadImg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userHeadImg_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getUserHeadImgBytes() {
                Object obj = this.userHeadImg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userHeadImg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getUserName() {
                Object obj = this.userName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getUserNameBytes() {
                Object obj = this.userName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public String getVideoCover() {
                Object obj = this.videoCover_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.videoCover_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public ByteString getVideoCoverBytes() {
                Object obj = this.videoCover_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.videoCover_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public long getVideoId() {
                return this.videoId_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
            public int getVideoNum() {
                return this.videoNum_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomAdd_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomAdd.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ChatRoomAdd chatRoomAdd) {
                if (chatRoomAdd == ChatRoomAdd.getDefaultInstance()) {
                    return this;
                }
                if (!chatRoomAdd.getRoomName().isEmpty()) {
                    this.roomName_ = chatRoomAdd.roomName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!chatRoomAdd.getRoomDesc().isEmpty()) {
                    this.roomDesc_ = chatRoomAdd.roomDesc_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!chatRoomAdd.getRoomPwd().isEmpty()) {
                    this.roomPwd_ = chatRoomAdd.roomPwd_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (chatRoomAdd.getVideoId() != 0) {
                    setVideoId(chatRoomAdd.getVideoId());
                }
                if (!chatRoomAdd.getVideoCover().isEmpty()) {
                    this.videoCover_ = chatRoomAdd.videoCover_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (chatRoomAdd.getCreatorId() != 0) {
                    setCreatorId(chatRoomAdd.getCreatorId());
                }
                if (!chatRoomAdd.getPlaySource().isEmpty()) {
                    this.playSource_ = chatRoomAdd.playSource_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (chatRoomAdd.getVideoNum() != 0) {
                    setVideoNum(chatRoomAdd.getVideoNum());
                }
                if (!chatRoomAdd.getUserName().isEmpty()) {
                    this.userName_ = chatRoomAdd.userName_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                if (!chatRoomAdd.getUserHeadImg().isEmpty()) {
                    this.userHeadImg_ = chatRoomAdd.userHeadImg_;
                    this.bitField0_ |= 512;
                    onChanged();
                }
                mergeUnknownFields(chatRoomAdd.getUnknownFields());
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
                                    this.roomName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 1;
                                    break;
                                case 18:
                                    this.roomDesc_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.roomPwd_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                    break;
                                case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                                    this.videoId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.videoCover_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.creatorId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.playSource_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.videoNum_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 74:
                                    this.userName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 256;
                                    break;
                                case 82:
                                    this.userHeadImg_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 512;
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
                if (message instanceof ChatRoomAdd) {
                    return mergeFrom((ChatRoomAdd) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCreatorId(long j) {
                this.creatorId_ = j;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPlaySource(String str) {
                str.getClass();
                this.playSource_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPlaySourceBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.playSource_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRoomDesc(String str) {
                str.getClass();
                this.roomDesc_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRoomDescBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.roomDesc_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRoomName(String str) {
                str.getClass();
                this.roomName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRoomNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.roomName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRoomPwd(String str) {
                str.getClass();
                this.roomPwd_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRoomPwdBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.roomPwd_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUserHeadImg(String str) {
                str.getClass();
                this.userHeadImg_ = str;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setUserHeadImgBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userHeadImg_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setUserName(String str) {
                str.getClass();
                this.userName_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userName_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setVideoCover(String str) {
                str.getClass();
                this.videoCover_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVideoCoverBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.videoCover_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVideoId(long j) {
                this.videoId_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setVideoNum(int i) {
                this.videoNum_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ChatRoomAdd.class.getName());
            DEFAULT_INSTANCE = new ChatRoomAdd();
            PARSER = new AbstractParser<ChatRoomAdd>() { // from class: com.base.model.proto.ChatRoomProto.ChatRoomAdd.1
                @Override // com.google.protobuf.Parser
                public ChatRoomAdd parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChatRoomAdd.newBuilder();
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

        private ChatRoomAdd() {
            this.roomName_ = "";
            this.roomDesc_ = "";
            this.roomPwd_ = "";
            this.videoId_ = 0L;
            this.videoCover_ = "";
            this.creatorId_ = 0L;
            this.playSource_ = "";
            this.videoNum_ = 0;
            this.userName_ = "";
            this.userHeadImg_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.roomName_ = "";
            this.roomDesc_ = "";
            this.roomPwd_ = "";
            this.videoCover_ = "";
            this.playSource_ = "";
            this.userName_ = "";
            this.userHeadImg_ = "";
        }

        public /* synthetic */ ChatRoomAdd(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ChatRoomAdd(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.roomName_ = "";
            this.roomDesc_ = "";
            this.roomPwd_ = "";
            this.videoId_ = 0L;
            this.videoCover_ = "";
            this.creatorId_ = 0L;
            this.playSource_ = "";
            this.videoNum_ = 0;
            this.userName_ = "";
            this.userHeadImg_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatRoomAdd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomAdd_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ChatRoomAdd chatRoomAdd) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatRoomAdd);
        }

        public static ChatRoomAdd parseDelimitedFrom(InputStream inputStream) {
            return (ChatRoomAdd) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatRoomAdd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomAdd) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomAdd parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ChatRoomAdd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChatRoomAdd parseFrom(CodedInputStream codedInputStream) {
            return (ChatRoomAdd) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChatRoomAdd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomAdd) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ChatRoomAdd parseFrom(InputStream inputStream) {
            return (ChatRoomAdd) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ChatRoomAdd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomAdd) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomAdd parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ChatRoomAdd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ChatRoomAdd parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatRoomAdd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ChatRoomAdd> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatRoomAdd)) {
                return super.equals(obj);
            }
            ChatRoomAdd chatRoomAdd = (ChatRoomAdd) obj;
            return getRoomName().equals(chatRoomAdd.getRoomName()) && getRoomDesc().equals(chatRoomAdd.getRoomDesc()) && getRoomPwd().equals(chatRoomAdd.getRoomPwd()) && getVideoId() == chatRoomAdd.getVideoId() && getVideoCover().equals(chatRoomAdd.getVideoCover()) && getCreatorId() == chatRoomAdd.getCreatorId() && getPlaySource().equals(chatRoomAdd.getPlaySource()) && getVideoNum() == chatRoomAdd.getVideoNum() && getUserName().equals(chatRoomAdd.getUserName()) && getUserHeadImg().equals(chatRoomAdd.getUserHeadImg()) && getUnknownFields().equals(chatRoomAdd.getUnknownFields());
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public long getCreatorId() {
            return this.creatorId_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatRoomAdd getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatRoomAdd> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getPlaySource() {
            Object obj = this.playSource_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.playSource_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getPlaySourceBytes() {
            Object obj = this.playSource_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.playSource_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getRoomDesc() {
            Object obj = this.roomDesc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomDesc_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getRoomDescBytes() {
            Object obj = this.roomDesc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomDesc_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getRoomName() {
            Object obj = this.roomName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getRoomNameBytes() {
            Object obj = this.roomName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getRoomPwd() {
            Object obj = this.roomPwd_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomPwd_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getRoomPwdBytes() {
            Object obj = this.roomPwd_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomPwd_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.roomName_) ? GeneratedMessage.computeStringSize(1, this.roomName_) : 0;
            if (!GeneratedMessage.isStringEmpty(this.roomDesc_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(2, this.roomDesc_);
            }
            if (!GeneratedMessage.isStringEmpty(this.roomPwd_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(3, this.roomPwd_);
            }
            long j = this.videoId_;
            if (j != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(4, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.videoCover_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(5, this.videoCover_);
            }
            long j2 = this.creatorId_;
            if (j2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(6, j2);
            }
            if (!GeneratedMessage.isStringEmpty(this.playSource_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(7, this.playSource_);
            }
            int i2 = this.videoNum_;
            if (i2 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(8, i2);
            }
            if (!GeneratedMessage.isStringEmpty(this.userName_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(9, this.userName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.userHeadImg_)) {
                iComputeStringSize += GeneratedMessage.computeStringSize(10, this.userHeadImg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getUserHeadImg() {
            Object obj = this.userHeadImg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userHeadImg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getUserHeadImgBytes() {
            Object obj = this.userHeadImg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userHeadImg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getUserName() {
            Object obj = this.userName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getUserNameBytes() {
            Object obj = this.userName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public String getVideoCover() {
            Object obj = this.videoCover_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.videoCover_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public ByteString getVideoCoverBytes() {
            Object obj = this.videoCover_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.videoCover_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public long getVideoId() {
            return this.videoId_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomAddOrBuilder
        public int getVideoNum() {
            return this.videoNum_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getUserHeadImg().hashCode() + ((((getUserName().hashCode() + ((((getVideoNum() + ((((getPlaySource().hashCode() + ((((Internal.hashLong(getCreatorId()) + ((((getVideoCover().hashCode() + ((((Internal.hashLong(getVideoId()) + ((((getRoomPwd().hashCode() + ((((getRoomDesc().hashCode() + ((((getRoomName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomAdd_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomAdd.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.roomName_)) {
                GeneratedMessage.writeString(codedOutputStream, 1, this.roomName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.roomDesc_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.roomDesc_);
            }
            if (!GeneratedMessage.isStringEmpty(this.roomPwd_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.roomPwd_);
            }
            long j = this.videoId_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.videoCover_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.videoCover_);
            }
            long j2 = this.creatorId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(6, j2);
            }
            if (!GeneratedMessage.isStringEmpty(this.playSource_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.playSource_);
            }
            int i = this.videoNum_;
            if (i != 0) {
                codedOutputStream.writeInt32(8, i);
            }
            if (!GeneratedMessage.isStringEmpty(this.userName_)) {
                GeneratedMessage.writeString(codedOutputStream, 9, this.userName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.userHeadImg_)) {
                GeneratedMessage.writeString(codedOutputStream, 10, this.userHeadImg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ChatRoomAddOrBuilder extends MessageOrBuilder {
        long getCreatorId();

        String getPlaySource();

        ByteString getPlaySourceBytes();

        String getRoomDesc();

        ByteString getRoomDescBytes();

        String getRoomName();

        ByteString getRoomNameBytes();

        String getRoomPwd();

        ByteString getRoomPwdBytes();

        String getUserHeadImg();

        ByteString getUserHeadImgBytes();

        String getUserName();

        ByteString getUserNameBytes();

        String getVideoCover();

        ByteString getVideoCoverBytes();

        long getVideoId();

        int getVideoNum();
    }

    public final class ChatRoomPage extends GeneratedMessage implements ChatRoomPageOrBuilder {
        public static final int CHATROOM_FIELD_NUMBER = 1;
        private static final ChatRoomPage DEFAULT_INSTANCE;
        public static final int PAGENUM_FIELD_NUMBER = 2;
        public static final int PAGESIZE_FIELD_NUMBER = 3;
        private static final Parser<ChatRoomPage> PARSER;
        public static final int TOTAL_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private List<ChatRoomVO> chatRoom_;
        private byte memoizedIsInitialized;
        private int pageNum_;
        private int pageSize_;
        private long total_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ChatRoomPageOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> chatRoomBuilder_;
            private List<ChatRoomVO> chatRoom_;
            private int pageNum_;
            private int pageSize_;
            private long total_;

            private Builder() {
                this.chatRoom_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.chatRoom_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ChatRoomPage chatRoomPage) {
                int i = this.bitField0_;
                if ((i & 2) != 0) {
                    chatRoomPage.pageNum_ = this.pageNum_;
                }
                if ((i & 4) != 0) {
                    chatRoomPage.pageSize_ = this.pageSize_;
                }
                if ((i & 8) != 0) {
                    chatRoomPage.total_ = this.total_;
                }
            }

            private void buildPartialRepeatedFields(ChatRoomPage chatRoomPage) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder != null) {
                    chatRoomPage.chatRoom_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.chatRoom_ = Collections.unmodifiableList(this.chatRoom_);
                    this.bitField0_ &= -2;
                }
                chatRoomPage.chatRoom_ = this.chatRoom_;
            }

            private void ensureChatRoomIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.chatRoom_ = new ArrayList(this.chatRoom_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomPage_descriptor;
            }

            private RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> internalGetChatRoomFieldBuilder() {
                if (this.chatRoomBuilder_ == null) {
                    this.chatRoomBuilder_ = new RepeatedFieldBuilder<>(this.chatRoom_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.chatRoom_ = null;
                }
                return this.chatRoomBuilder_;
            }

            public Builder addAllChatRoom(Iterable<? extends ChatRoomVO> iterable) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureChatRoomIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.chatRoom_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addChatRoom(int i, ChatRoomVO.Builder builder) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureChatRoomIsMutable();
                    this.chatRoom_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addChatRoom(int i, ChatRoomVO chatRoomVO) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    chatRoomVO.getClass();
                    ensureChatRoomIsMutable();
                    this.chatRoom_.add(i, chatRoomVO);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, chatRoomVO);
                }
                return this;
            }

            public Builder addChatRoom(ChatRoomVO.Builder builder) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureChatRoomIsMutable();
                    this.chatRoom_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addChatRoom(ChatRoomVO chatRoomVO) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    chatRoomVO.getClass();
                    ensureChatRoomIsMutable();
                    this.chatRoom_.add(chatRoomVO);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(chatRoomVO);
                }
                return this;
            }

            public ChatRoomVO.Builder addChatRoomBuilder() {
                return (ChatRoomVO.Builder) internalGetChatRoomFieldBuilder().addBuilder(ChatRoomVO.getDefaultInstance());
            }

            public ChatRoomVO.Builder addChatRoomBuilder(int i) {
                return (ChatRoomVO.Builder) internalGetChatRoomFieldBuilder().addBuilder(i, ChatRoomVO.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomPage build() {
                ChatRoomPage chatRoomPageBuildPartial = buildPartial();
                if (chatRoomPageBuildPartial.isInitialized()) {
                    return chatRoomPageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatRoomPageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomPage buildPartial() {
                ChatRoomPage chatRoomPage = new ChatRoomPage(this);
                buildPartialRepeatedFields(chatRoomPage);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatRoomPage);
                }
                onBuilt();
                return chatRoomPage;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.chatRoom_ = Collections.emptyList();
                } else {
                    this.chatRoom_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                this.pageNum_ = 0;
                this.pageSize_ = 0;
                this.total_ = 0L;
                return this;
            }

            public Builder clearChatRoom() {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.chatRoom_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearPageNum() {
                this.bitField0_ &= -3;
                this.pageNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPageSize() {
                this.bitField0_ &= -5;
                this.pageSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTotal() {
                this.bitField0_ &= -9;
                this.total_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public ChatRoomVO getChatRoom(int i) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                return repeatedFieldBuilder == null ? this.chatRoom_.get(i) : (ChatRoomVO) repeatedFieldBuilder.getMessage(i);
            }

            public ChatRoomVO.Builder getChatRoomBuilder(int i) {
                return (ChatRoomVO.Builder) internalGetChatRoomFieldBuilder().getBuilder(i);
            }

            public List<ChatRoomVO.Builder> getChatRoomBuilderList() {
                return internalGetChatRoomFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public int getChatRoomCount() {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                return repeatedFieldBuilder == null ? this.chatRoom_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public List<ChatRoomVO> getChatRoomList() {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.chatRoom_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public ChatRoomVOOrBuilder getChatRoomOrBuilder(int i) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                return repeatedFieldBuilder == null ? this.chatRoom_.get(i) : (ChatRoomVOOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public List<? extends ChatRoomVOOrBuilder> getChatRoomOrBuilderList() {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.chatRoom_);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChatRoomPage getDefaultInstanceForType() {
                return ChatRoomPage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomPage_descriptor;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public int getPageNum() {
                return this.pageNum_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public int getPageSize() {
                return this.pageSize_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
            public long getTotal() {
                return this.total_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomPage_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomPage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ChatRoomPage chatRoomPage) {
                if (chatRoomPage == ChatRoomPage.getDefaultInstance()) {
                    return this;
                }
                if (this.chatRoomBuilder_ == null) {
                    if (!chatRoomPage.chatRoom_.isEmpty()) {
                        if (this.chatRoom_.isEmpty()) {
                            this.chatRoom_ = chatRoomPage.chatRoom_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureChatRoomIsMutable();
                            this.chatRoom_.addAll(chatRoomPage.chatRoom_);
                        }
                        onChanged();
                    }
                } else if (!chatRoomPage.chatRoom_.isEmpty()) {
                    if (this.chatRoomBuilder_.isEmpty()) {
                        this.chatRoomBuilder_.dispose();
                        this.chatRoomBuilder_ = null;
                        this.chatRoom_ = chatRoomPage.chatRoom_;
                        this.bitField0_ &= -2;
                        this.chatRoomBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetChatRoomFieldBuilder() : null;
                    } else {
                        this.chatRoomBuilder_.addAllMessages(chatRoomPage.chatRoom_);
                    }
                }
                if (chatRoomPage.getPageNum() != 0) {
                    setPageNum(chatRoomPage.getPageNum());
                }
                if (chatRoomPage.getPageSize() != 0) {
                    setPageSize(chatRoomPage.getPageSize());
                }
                if (chatRoomPage.getTotal() != 0) {
                    setTotal(chatRoomPage.getTotal());
                }
                mergeUnknownFields(chatRoomPage.getUnknownFields());
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
                                    ChatRoomVO chatRoomVO = (ChatRoomVO) codedInputStream.readMessage(ChatRoomVO.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureChatRoomIsMutable();
                                        this.chatRoom_.add(chatRoomVO);
                                    } else {
                                        repeatedFieldBuilder.addMessage(chatRoomVO);
                                    }
                                } else if (tag == 16) {
                                    this.pageNum_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.pageSize_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.total_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8;
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
                if (message instanceof ChatRoomPage) {
                    return mergeFrom((ChatRoomPage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeChatRoom(int i) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureChatRoomIsMutable();
                    this.chatRoom_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setChatRoom(int i, ChatRoomVO.Builder builder) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureChatRoomIsMutable();
                    this.chatRoom_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setChatRoom(int i, ChatRoomVO chatRoomVO) {
                RepeatedFieldBuilder<ChatRoomVO, ChatRoomVO.Builder, ChatRoomVOOrBuilder> repeatedFieldBuilder = this.chatRoomBuilder_;
                if (repeatedFieldBuilder == null) {
                    chatRoomVO.getClass();
                    ensureChatRoomIsMutable();
                    this.chatRoom_.set(i, chatRoomVO);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, chatRoomVO);
                }
                return this;
            }

            public Builder setPageNum(int i) {
                this.pageNum_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPageSize(int i) {
                this.pageSize_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTotal(long j) {
                this.total_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ChatRoomPage.class.getName());
            DEFAULT_INSTANCE = new ChatRoomPage();
            PARSER = new AbstractParser<ChatRoomPage>() { // from class: com.base.model.proto.ChatRoomProto.ChatRoomPage.1
                @Override // com.google.protobuf.Parser
                public ChatRoomPage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChatRoomPage.newBuilder();
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

        private ChatRoomPage() {
            this.pageNum_ = 0;
            this.pageSize_ = 0;
            this.total_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.chatRoom_ = Collections.emptyList();
        }

        public /* synthetic */ ChatRoomPage(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ChatRoomPage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.pageNum_ = 0;
            this.pageSize_ = 0;
            this.total_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatRoomPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomPage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ChatRoomPage chatRoomPage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatRoomPage);
        }

        public static ChatRoomPage parseDelimitedFrom(InputStream inputStream) {
            return (ChatRoomPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatRoomPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomPage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ChatRoomPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChatRoomPage parseFrom(CodedInputStream codedInputStream) {
            return (ChatRoomPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChatRoomPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ChatRoomPage parseFrom(InputStream inputStream) {
            return (ChatRoomPage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ChatRoomPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomPage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomPage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ChatRoomPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ChatRoomPage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatRoomPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ChatRoomPage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatRoomPage)) {
                return super.equals(obj);
            }
            ChatRoomPage chatRoomPage = (ChatRoomPage) obj;
            return getChatRoomList().equals(chatRoomPage.getChatRoomList()) && getPageNum() == chatRoomPage.getPageNum() && getPageSize() == chatRoomPage.getPageSize() && getTotal() == chatRoomPage.getTotal() && getUnknownFields().equals(chatRoomPage.getUnknownFields());
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public ChatRoomVO getChatRoom(int i) {
            return this.chatRoom_.get(i);
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public int getChatRoomCount() {
            return this.chatRoom_.size();
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public List<ChatRoomVO> getChatRoomList() {
            return this.chatRoom_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public ChatRoomVOOrBuilder getChatRoomOrBuilder(int i) {
            return this.chatRoom_.get(i);
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public List<? extends ChatRoomVOOrBuilder> getChatRoomOrBuilderList() {
            return this.chatRoom_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatRoomPage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public int getPageNum() {
            return this.pageNum_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public int getPageSize() {
            return this.pageSize_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatRoomPage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt64Size = 0;
            for (int i2 = 0; i2 < this.chatRoom_.size(); i2++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(1, this.chatRoom_.get(i2));
            }
            int i3 = this.pageNum_;
            if (i3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i3);
            }
            int i4 = this.pageSize_;
            if (i4 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(3, i4);
            }
            long j = this.total_;
            if (j != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(4, j);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomPageOrBuilder
        public long getTotal() {
            return this.total_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getChatRoomCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getChatRoomList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + ((Internal.hashLong(getTotal()) + ((((getPageSize() + ((((getPageNum() + a.a(iHashCode, 37, 2, 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomPage_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomPage.class, Builder.class);
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
            for (int i = 0; i < this.chatRoom_.size(); i++) {
                codedOutputStream.writeMessage(1, this.chatRoom_.get(i));
            }
            int i2 = this.pageNum_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(2, i2);
            }
            int i3 = this.pageSize_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(3, i3);
            }
            long j = this.total_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ChatRoomPageOrBuilder extends MessageOrBuilder {
        ChatRoomVO getChatRoom(int i);

        int getChatRoomCount();

        List<ChatRoomVO> getChatRoomList();

        ChatRoomVOOrBuilder getChatRoomOrBuilder(int i);

        List<? extends ChatRoomVOOrBuilder> getChatRoomOrBuilderList();

        int getPageNum();

        int getPageSize();

        long getTotal();
    }

    public final class ChatRoomReq extends GeneratedMessage implements ChatRoomReqOrBuilder {
        public static final int CREATORID_FIELD_NUMBER = 2;
        private static final ChatRoomReq DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int PAGENUM_FIELD_NUMBER = 4;
        public static final int PAGESIZE_FIELD_NUMBER = 5;
        private static final Parser<ChatRoomReq> PARSER;
        public static final int VIDEOID_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private long creatorId_;
        private long id_;
        private byte memoizedIsInitialized;
        private int pageNum_;
        private int pageSize_;
        private long videoId_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ChatRoomReqOrBuilder {
            private int bitField0_;
            private long creatorId_;
            private long id_;
            private int pageNum_;
            private int pageSize_;
            private long videoId_;

            private Builder() {
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ChatRoomReq chatRoomReq) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    chatRoomReq.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    chatRoomReq.creatorId_ = this.creatorId_;
                }
                if ((i & 4) != 0) {
                    chatRoomReq.videoId_ = this.videoId_;
                }
                if ((i & 8) != 0) {
                    chatRoomReq.pageNum_ = this.pageNum_;
                }
                if ((i & 16) != 0) {
                    chatRoomReq.pageSize_ = this.pageSize_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomReq_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomReq build() {
                ChatRoomReq chatRoomReqBuildPartial = buildPartial();
                if (chatRoomReqBuildPartial.isInitialized()) {
                    return chatRoomReqBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatRoomReqBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomReq buildPartial() {
                ChatRoomReq chatRoomReq = new ChatRoomReq(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatRoomReq);
                }
                onBuilt();
                return chatRoomReq;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0L;
                this.creatorId_ = 0L;
                this.videoId_ = 0L;
                this.pageNum_ = 0;
                this.pageSize_ = 0;
                return this;
            }

            public Builder clearCreatorId() {
                this.bitField0_ &= -3;
                this.creatorId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearPageNum() {
                this.bitField0_ &= -9;
                this.pageNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPageSize() {
                this.bitField0_ &= -17;
                this.pageSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVideoId() {
                this.bitField0_ &= -5;
                this.videoId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
            public long getCreatorId() {
                return this.creatorId_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChatRoomReq getDefaultInstanceForType() {
                return ChatRoomReq.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomReq_descriptor;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
            public long getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
            public int getPageNum() {
                return this.pageNum_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
            public int getPageSize() {
                return this.pageSize_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
            public long getVideoId() {
                return this.videoId_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomReq.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ChatRoomReq chatRoomReq) {
                if (chatRoomReq == ChatRoomReq.getDefaultInstance()) {
                    return this;
                }
                if (chatRoomReq.getId() != 0) {
                    setId(chatRoomReq.getId());
                }
                if (chatRoomReq.getCreatorId() != 0) {
                    setCreatorId(chatRoomReq.getCreatorId());
                }
                if (chatRoomReq.getVideoId() != 0) {
                    setVideoId(chatRoomReq.getVideoId());
                }
                if (chatRoomReq.getPageNum() != 0) {
                    setPageNum(chatRoomReq.getPageNum());
                }
                if (chatRoomReq.getPageSize() != 0) {
                    setPageSize(chatRoomReq.getPageSize());
                }
                mergeUnknownFields(chatRoomReq.getUnknownFields());
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
                                if (tag == 8) {
                                    this.id_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.creatorId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.videoId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.pageNum_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.pageSize_ = codedInputStream.readInt32();
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
                if (message instanceof ChatRoomReq) {
                    return mergeFrom((ChatRoomReq) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCreatorId(long j) {
                this.creatorId_ = j;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setId(long j) {
                this.id_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPageNum(int i) {
                this.pageNum_ = i;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPageSize(int i) {
                this.pageSize_ = i;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVideoId(long j) {
                this.videoId_ = j;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ChatRoomReq.class.getName());
            DEFAULT_INSTANCE = new ChatRoomReq();
            PARSER = new AbstractParser<ChatRoomReq>() { // from class: com.base.model.proto.ChatRoomProto.ChatRoomReq.1
                @Override // com.google.protobuf.Parser
                public ChatRoomReq parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChatRoomReq.newBuilder();
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

        private ChatRoomReq() {
            this.id_ = 0L;
            this.creatorId_ = 0L;
            this.videoId_ = 0L;
            this.pageNum_ = 0;
            this.pageSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ChatRoomReq(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ChatRoomReq(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0L;
            this.creatorId_ = 0L;
            this.videoId_ = 0L;
            this.pageNum_ = 0;
            this.pageSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatRoomReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomReq_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ChatRoomReq chatRoomReq) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatRoomReq);
        }

        public static ChatRoomReq parseDelimitedFrom(InputStream inputStream) {
            return (ChatRoomReq) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatRoomReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomReq) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomReq parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ChatRoomReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChatRoomReq parseFrom(CodedInputStream codedInputStream) {
            return (ChatRoomReq) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChatRoomReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomReq) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ChatRoomReq parseFrom(InputStream inputStream) {
            return (ChatRoomReq) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ChatRoomReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomReq) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomReq parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ChatRoomReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ChatRoomReq parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatRoomReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ChatRoomReq> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatRoomReq)) {
                return super.equals(obj);
            }
            ChatRoomReq chatRoomReq = (ChatRoomReq) obj;
            return getId() == chatRoomReq.getId() && getCreatorId() == chatRoomReq.getCreatorId() && getVideoId() == chatRoomReq.getVideoId() && getPageNum() == chatRoomReq.getPageNum() && getPageSize() == chatRoomReq.getPageSize() && getUnknownFields().equals(chatRoomReq.getUnknownFields());
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
        public long getCreatorId() {
            return this.creatorId_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatRoomReq getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
        public int getPageNum() {
            return this.pageNum_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
        public int getPageSize() {
            return this.pageSize_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatRoomReq> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.id_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            long j2 = this.creatorId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j2);
            }
            long j3 = this.videoId_;
            if (j3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(3, j3);
            }
            int i2 = this.pageNum_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(4, i2);
            }
            int i3 = this.pageSize_;
            if (i3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(5, i3);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomReqOrBuilder
        public long getVideoId() {
            return this.videoId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getPageSize() + ((((getPageNum() + ((((Internal.hashLong(getVideoId()) + ((((Internal.hashLong(getCreatorId()) + ((((Internal.hashLong(getId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomReq_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomReq.class, Builder.class);
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
            long j2 = this.creatorId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(2, j2);
            }
            long j3 = this.videoId_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(3, j3);
            }
            int i = this.pageNum_;
            if (i != 0) {
                codedOutputStream.writeInt32(4, i);
            }
            int i2 = this.pageSize_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(5, i2);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ChatRoomReqOrBuilder extends MessageOrBuilder {
        long getCreatorId();

        long getId();

        int getPageNum();

        int getPageSize();

        long getVideoId();
    }

    public final class ChatRoomUpdate extends GeneratedMessage implements ChatRoomUpdateOrBuilder {
        private static final ChatRoomUpdate DEFAULT_INSTANCE;
        private static final Parser<ChatRoomUpdate> PARSER;
        public static final int ROOMID_FIELD_NUMBER = 1;
        public static final int ROOMNAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long roomId_;
        private volatile Object roomName_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ChatRoomUpdateOrBuilder {
            private int bitField0_;
            private long roomId_;
            private Object roomName_;

            private Builder() {
                this.roomName_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.roomName_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ChatRoomUpdate chatRoomUpdate) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    chatRoomUpdate.roomId_ = this.roomId_;
                }
                if ((i & 2) != 0) {
                    chatRoomUpdate.roomName_ = this.roomName_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomUpdate_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomUpdate build() {
                ChatRoomUpdate chatRoomUpdateBuildPartial = buildPartial();
                if (chatRoomUpdateBuildPartial.isInitialized()) {
                    return chatRoomUpdateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatRoomUpdateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomUpdate buildPartial() {
                ChatRoomUpdate chatRoomUpdate = new ChatRoomUpdate(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatRoomUpdate);
                }
                onBuilt();
                return chatRoomUpdate;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.roomId_ = 0L;
                this.roomName_ = "";
                return this;
            }

            public Builder clearRoomId() {
                this.bitField0_ &= -2;
                this.roomId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearRoomName() {
                this.roomName_ = ChatRoomUpdate.getDefaultInstance().getRoomName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChatRoomUpdate getDefaultInstanceForType() {
                return ChatRoomUpdate.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomUpdate_descriptor;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomUpdateOrBuilder
            public long getRoomId() {
                return this.roomId_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomUpdateOrBuilder
            public String getRoomName() {
                Object obj = this.roomName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomUpdateOrBuilder
            public ByteString getRoomNameBytes() {
                Object obj = this.roomName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomUpdate_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomUpdate.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ChatRoomUpdate chatRoomUpdate) {
                if (chatRoomUpdate == ChatRoomUpdate.getDefaultInstance()) {
                    return this;
                }
                if (chatRoomUpdate.getRoomId() != 0) {
                    setRoomId(chatRoomUpdate.getRoomId());
                }
                if (!chatRoomUpdate.getRoomName().isEmpty()) {
                    this.roomName_ = chatRoomUpdate.roomName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(chatRoomUpdate.getUnknownFields());
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
                                if (tag == 8) {
                                    this.roomId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.roomName_ = codedInputStream.readStringRequireUtf8();
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
                if (message instanceof ChatRoomUpdate) {
                    return mergeFrom((ChatRoomUpdate) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setRoomId(long j) {
                this.roomId_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRoomName(String str) {
                str.getClass();
                this.roomName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRoomNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.roomName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ChatRoomUpdate.class.getName());
            DEFAULT_INSTANCE = new ChatRoomUpdate();
            PARSER = new AbstractParser<ChatRoomUpdate>() { // from class: com.base.model.proto.ChatRoomProto.ChatRoomUpdate.1
                @Override // com.google.protobuf.Parser
                public ChatRoomUpdate parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChatRoomUpdate.newBuilder();
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

        private ChatRoomUpdate() {
            this.roomId_ = 0L;
            this.roomName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.roomName_ = "";
        }

        public /* synthetic */ ChatRoomUpdate(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ChatRoomUpdate(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.roomId_ = 0L;
            this.roomName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatRoomUpdate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomUpdate_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ChatRoomUpdate chatRoomUpdate) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatRoomUpdate);
        }

        public static ChatRoomUpdate parseDelimitedFrom(InputStream inputStream) {
            return (ChatRoomUpdate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatRoomUpdate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomUpdate) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomUpdate parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ChatRoomUpdate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChatRoomUpdate parseFrom(CodedInputStream codedInputStream) {
            return (ChatRoomUpdate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChatRoomUpdate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomUpdate) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ChatRoomUpdate parseFrom(InputStream inputStream) {
            return (ChatRoomUpdate) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ChatRoomUpdate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomUpdate) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomUpdate parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ChatRoomUpdate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ChatRoomUpdate parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatRoomUpdate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ChatRoomUpdate> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatRoomUpdate)) {
                return super.equals(obj);
            }
            ChatRoomUpdate chatRoomUpdate = (ChatRoomUpdate) obj;
            return getRoomId() == chatRoomUpdate.getRoomId() && getRoomName().equals(chatRoomUpdate.getRoomName()) && getUnknownFields().equals(chatRoomUpdate.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatRoomUpdate getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatRoomUpdate> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomUpdateOrBuilder
        public long getRoomId() {
            return this.roomId_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomUpdateOrBuilder
        public String getRoomName() {
            Object obj = this.roomName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomUpdateOrBuilder
        public ByteString getRoomNameBytes() {
            Object obj = this.roomName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.roomId_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessage.isStringEmpty(this.roomName_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.roomName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getRoomName().hashCode() + ((((Internal.hashLong(getRoomId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomUpdate_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomUpdate.class, Builder.class);
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
            long j = this.roomId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.roomName_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.roomName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ChatRoomUpdateOrBuilder extends MessageOrBuilder {
        long getRoomId();

        String getRoomName();

        ByteString getRoomNameBytes();
    }

    public final class ChatRoomVO extends GeneratedMessage implements ChatRoomVOOrBuilder {
        public static final int CREATORID_FIELD_NUMBER = 6;
        private static final ChatRoomVO DEFAULT_INSTANCE;
        public static final int HAVEPWD_FIELD_NUMBER = 10;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int ONLINENUMBER_FIELD_NUMBER = 9;
        private static final Parser<ChatRoomVO> PARSER;
        public static final int PLAYSOURCE_FIELD_NUMBER = 7;
        public static final int ROOMDESC_FIELD_NUMBER = 3;
        public static final int ROOMNAME_FIELD_NUMBER = 2;
        public static final int TOTALNUMBER_FIELD_NUMBER = 16;
        public static final int USERHEADIMG_FIELD_NUMBER = 13;
        public static final int USERLIST_FIELD_NUMBER = 11;
        public static final int USERNAME_FIELD_NUMBER = 12;
        public static final int VIDEOADJUSTTIME_FIELD_NUMBER = 15;
        public static final int VIDEOCOVER_FIELD_NUMBER = 5;
        public static final int VIDEOID_FIELD_NUMBER = 4;
        public static final int VIDEONUM_FIELD_NUMBER = 8;
        public static final int VIDEOPROGRESS_FIELD_NUMBER = 14;
        private static final long serialVersionUID = 0;
        private long creatorId_;
        private boolean havePwd_;
        private long id_;
        private byte memoizedIsInitialized;
        private int onlineNumber_;
        private volatile Object playSource_;
        private volatile Object roomDesc_;
        private volatile Object roomName_;
        private int totalNumber_;
        private volatile Object userHeadImg_;
        private List<UserProto.UserList> userList_;
        private volatile Object userName_;
        private long videoAdjustTime_;
        private volatile Object videoCover_;
        private long videoId_;
        private int videoNum_;
        private long videoProgress_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements ChatRoomVOOrBuilder {
            private int bitField0_;
            private long creatorId_;
            private boolean havePwd_;
            private long id_;
            private int onlineNumber_;
            private Object playSource_;
            private Object roomDesc_;
            private Object roomName_;
            private int totalNumber_;
            private Object userHeadImg_;
            private RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> userListBuilder_;
            private List<UserProto.UserList> userList_;
            private Object userName_;
            private long videoAdjustTime_;
            private Object videoCover_;
            private long videoId_;
            private int videoNum_;
            private long videoProgress_;

            private Builder() {
                this.roomName_ = "";
                this.roomDesc_ = "";
                this.videoCover_ = "";
                this.playSource_ = "";
                this.userList_ = Collections.emptyList();
                this.userName_ = "";
                this.userHeadImg_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.roomName_ = "";
                this.roomDesc_ = "";
                this.videoCover_ = "";
                this.playSource_ = "";
                this.userList_ = Collections.emptyList();
                this.userName_ = "";
                this.userHeadImg_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(ChatRoomVO chatRoomVO) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    chatRoomVO.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    chatRoomVO.roomName_ = this.roomName_;
                }
                if ((i & 4) != 0) {
                    chatRoomVO.roomDesc_ = this.roomDesc_;
                }
                if ((i & 8) != 0) {
                    chatRoomVO.videoId_ = this.videoId_;
                }
                if ((i & 16) != 0) {
                    chatRoomVO.videoCover_ = this.videoCover_;
                }
                if ((i & 32) != 0) {
                    chatRoomVO.creatorId_ = this.creatorId_;
                }
                if ((i & 64) != 0) {
                    chatRoomVO.playSource_ = this.playSource_;
                }
                if ((i & 128) != 0) {
                    chatRoomVO.videoNum_ = this.videoNum_;
                }
                if ((i & 256) != 0) {
                    chatRoomVO.onlineNumber_ = this.onlineNumber_;
                }
                if ((i & 512) != 0) {
                    chatRoomVO.havePwd_ = this.havePwd_;
                }
                if ((i & 2048) != 0) {
                    chatRoomVO.userName_ = this.userName_;
                }
                if ((i & 4096) != 0) {
                    chatRoomVO.userHeadImg_ = this.userHeadImg_;
                }
                if ((i & 8192) != 0) {
                    chatRoomVO.videoProgress_ = this.videoProgress_;
                }
                if ((i & 16384) != 0) {
                    chatRoomVO.videoAdjustTime_ = this.videoAdjustTime_;
                }
                if ((i & 32768) != 0) {
                    chatRoomVO.totalNumber_ = this.totalNumber_;
                }
            }

            private void buildPartialRepeatedFields(ChatRoomVO chatRoomVO) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder != null) {
                    chatRoomVO.userList_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1024) != 0) {
                    this.userList_ = Collections.unmodifiableList(this.userList_);
                    this.bitField0_ &= -1025;
                }
                chatRoomVO.userList_ = this.userList_;
            }

            private void ensureUserListIsMutable() {
                if ((this.bitField0_ & 1024) == 0) {
                    this.userList_ = new ArrayList(this.userList_);
                    this.bitField0_ |= 1024;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomVO_descriptor;
            }

            private RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> internalGetUserListFieldBuilder() {
                if (this.userListBuilder_ == null) {
                    this.userListBuilder_ = new RepeatedFieldBuilder<>(this.userList_, (this.bitField0_ & 1024) != 0, getParentForChildren(), isClean());
                    this.userList_ = null;
                }
                return this.userListBuilder_;
            }

            public Builder addAllUserList(Iterable<? extends UserProto.UserList> iterable) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserListIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.userList_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addUserList(int i, UserProto.UserList.Builder builder) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserListIsMutable();
                    this.userList_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addUserList(int i, UserProto.UserList userList) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    userList.getClass();
                    ensureUserListIsMutable();
                    this.userList_.add(i, userList);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, userList);
                }
                return this;
            }

            public Builder addUserList(UserProto.UserList.Builder builder) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserListIsMutable();
                    this.userList_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUserList(UserProto.UserList userList) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    userList.getClass();
                    ensureUserListIsMutable();
                    this.userList_.add(userList);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(userList);
                }
                return this;
            }

            public UserProto.UserList.Builder addUserListBuilder() {
                return (UserProto.UserList.Builder) internalGetUserListFieldBuilder().addBuilder(UserProto.UserList.getDefaultInstance());
            }

            public UserProto.UserList.Builder addUserListBuilder(int i) {
                return (UserProto.UserList.Builder) internalGetUserListFieldBuilder().addBuilder(i, UserProto.UserList.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomVO build() {
                ChatRoomVO chatRoomVOBuildPartial = buildPartial();
                if (chatRoomVOBuildPartial.isInitialized()) {
                    return chatRoomVOBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) chatRoomVOBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChatRoomVO buildPartial() {
                ChatRoomVO chatRoomVO = new ChatRoomVO(this);
                buildPartialRepeatedFields(chatRoomVO);
                if (this.bitField0_ != 0) {
                    buildPartial0(chatRoomVO);
                }
                onBuilt();
                return chatRoomVO;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0L;
                this.roomName_ = "";
                this.roomDesc_ = "";
                this.videoId_ = 0L;
                this.videoCover_ = "";
                this.creatorId_ = 0L;
                this.playSource_ = "";
                this.videoNum_ = 0;
                this.onlineNumber_ = 0;
                this.havePwd_ = false;
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.userList_ = Collections.emptyList();
                } else {
                    this.userList_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -1025;
                this.userName_ = "";
                this.userHeadImg_ = "";
                this.videoProgress_ = 0L;
                this.videoAdjustTime_ = 0L;
                this.totalNumber_ = 0;
                return this;
            }

            public Builder clearCreatorId() {
                this.bitField0_ &= -33;
                this.creatorId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearHavePwd() {
                this.bitField0_ &= -513;
                this.havePwd_ = false;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearOnlineNumber() {
                this.bitField0_ &= -257;
                this.onlineNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPlaySource() {
                this.playSource_ = ChatRoomVO.getDefaultInstance().getPlaySource();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearRoomDesc() {
                this.roomDesc_ = ChatRoomVO.getDefaultInstance().getRoomDesc();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRoomName() {
                this.roomName_ = ChatRoomVO.getDefaultInstance().getRoomName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTotalNumber() {
                this.bitField0_ &= -32769;
                this.totalNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserHeadImg() {
                this.userHeadImg_ = ChatRoomVO.getDefaultInstance().getUserHeadImg();
                this.bitField0_ &= -4097;
                onChanged();
                return this;
            }

            public Builder clearUserList() {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.userList_ = Collections.emptyList();
                    this.bitField0_ &= -1025;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            public Builder clearUserName() {
                this.userName_ = ChatRoomVO.getDefaultInstance().getUserName();
                this.bitField0_ &= -2049;
                onChanged();
                return this;
            }

            public Builder clearVideoAdjustTime() {
                this.bitField0_ &= -16385;
                this.videoAdjustTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVideoCover() {
                this.videoCover_ = ChatRoomVO.getDefaultInstance().getVideoCover();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearVideoId() {
                this.bitField0_ &= -9;
                this.videoId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearVideoNum() {
                this.bitField0_ &= -129;
                this.videoNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVideoProgress() {
                this.bitField0_ &= -8193;
                this.videoProgress_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public long getCreatorId() {
                return this.creatorId_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChatRoomVO getDefaultInstanceForType() {
                return ChatRoomVO.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomVO_descriptor;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public boolean getHavePwd() {
                return this.havePwd_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public long getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public int getOnlineNumber() {
                return this.onlineNumber_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public String getPlaySource() {
                Object obj = this.playSource_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.playSource_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public ByteString getPlaySourceBytes() {
                Object obj = this.playSource_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.playSource_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public String getRoomDesc() {
                Object obj = this.roomDesc_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomDesc_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public ByteString getRoomDescBytes() {
                Object obj = this.roomDesc_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomDesc_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public String getRoomName() {
                Object obj = this.roomName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.roomName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public ByteString getRoomNameBytes() {
                Object obj = this.roomName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.roomName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public int getTotalNumber() {
                return this.totalNumber_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public String getUserHeadImg() {
                Object obj = this.userHeadImg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userHeadImg_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public ByteString getUserHeadImgBytes() {
                Object obj = this.userHeadImg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userHeadImg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public UserProto.UserList getUserList(int i) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                return repeatedFieldBuilder == null ? this.userList_.get(i) : (UserProto.UserList) repeatedFieldBuilder.getMessage(i);
            }

            public UserProto.UserList.Builder getUserListBuilder(int i) {
                return (UserProto.UserList.Builder) internalGetUserListFieldBuilder().getBuilder(i);
            }

            public List<UserProto.UserList.Builder> getUserListBuilderList() {
                return internalGetUserListFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public int getUserListCount() {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                return repeatedFieldBuilder == null ? this.userList_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public List<UserProto.UserList> getUserListList() {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.userList_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public UserProto.UserListOrBuilder getUserListOrBuilder(int i) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                return repeatedFieldBuilder == null ? this.userList_.get(i) : (UserProto.UserListOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public List<? extends UserProto.UserListOrBuilder> getUserListOrBuilderList() {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.userList_);
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public String getUserName() {
                Object obj = this.userName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public ByteString getUserNameBytes() {
                Object obj = this.userName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public long getVideoAdjustTime() {
                return this.videoAdjustTime_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public String getVideoCover() {
                Object obj = this.videoCover_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.videoCover_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public ByteString getVideoCoverBytes() {
                Object obj = this.videoCover_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.videoCover_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public long getVideoId() {
                return this.videoId_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public int getVideoNum() {
                return this.videoNum_;
            }

            @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
            public long getVideoProgress() {
                return this.videoProgress_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomVO_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomVO.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ChatRoomVO chatRoomVO) {
                if (chatRoomVO == ChatRoomVO.getDefaultInstance()) {
                    return this;
                }
                if (chatRoomVO.getId() != 0) {
                    setId(chatRoomVO.getId());
                }
                if (!chatRoomVO.getRoomName().isEmpty()) {
                    this.roomName_ = chatRoomVO.roomName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!chatRoomVO.getRoomDesc().isEmpty()) {
                    this.roomDesc_ = chatRoomVO.roomDesc_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (chatRoomVO.getVideoId() != 0) {
                    setVideoId(chatRoomVO.getVideoId());
                }
                if (!chatRoomVO.getVideoCover().isEmpty()) {
                    this.videoCover_ = chatRoomVO.videoCover_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (chatRoomVO.getCreatorId() != 0) {
                    setCreatorId(chatRoomVO.getCreatorId());
                }
                if (!chatRoomVO.getPlaySource().isEmpty()) {
                    this.playSource_ = chatRoomVO.playSource_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (chatRoomVO.getVideoNum() != 0) {
                    setVideoNum(chatRoomVO.getVideoNum());
                }
                if (chatRoomVO.getOnlineNumber() != 0) {
                    setOnlineNumber(chatRoomVO.getOnlineNumber());
                }
                if (chatRoomVO.getHavePwd()) {
                    setHavePwd(chatRoomVO.getHavePwd());
                }
                if (this.userListBuilder_ == null) {
                    if (!chatRoomVO.userList_.isEmpty()) {
                        if (this.userList_.isEmpty()) {
                            this.userList_ = chatRoomVO.userList_;
                            this.bitField0_ &= -1025;
                        } else {
                            ensureUserListIsMutable();
                            this.userList_.addAll(chatRoomVO.userList_);
                        }
                        onChanged();
                    }
                } else if (!chatRoomVO.userList_.isEmpty()) {
                    if (this.userListBuilder_.isEmpty()) {
                        this.userListBuilder_.dispose();
                        this.userListBuilder_ = null;
                        this.userList_ = chatRoomVO.userList_;
                        this.bitField0_ &= -1025;
                        this.userListBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUserListFieldBuilder() : null;
                    } else {
                        this.userListBuilder_.addAllMessages(chatRoomVO.userList_);
                    }
                }
                if (!chatRoomVO.getUserName().isEmpty()) {
                    this.userName_ = chatRoomVO.userName_;
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                if (!chatRoomVO.getUserHeadImg().isEmpty()) {
                    this.userHeadImg_ = chatRoomVO.userHeadImg_;
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                if (chatRoomVO.getVideoProgress() != 0) {
                    setVideoProgress(chatRoomVO.getVideoProgress());
                }
                if (chatRoomVO.getVideoAdjustTime() != 0) {
                    setVideoAdjustTime(chatRoomVO.getVideoAdjustTime());
                }
                if (chatRoomVO.getTotalNumber() != 0) {
                    setTotalNumber(chatRoomVO.getTotalNumber());
                }
                mergeUnknownFields(chatRoomVO.getUnknownFields());
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
                                    this.roomName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                    break;
                                case 26:
                                    this.roomDesc_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
                                    break;
                                case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                                    this.videoId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8;
                                    break;
                                case 42:
                                    this.videoCover_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 16;
                                    break;
                                case 48:
                                    this.creatorId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 32;
                                    break;
                                case 58:
                                    this.playSource_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 64;
                                    break;
                                case 64:
                                    this.videoNum_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 128;
                                    break;
                                case 72:
                                    this.onlineNumber_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 256;
                                    break;
                                case 80:
                                    this.havePwd_ = codedInputStream.readBool();
                                    this.bitField0_ |= 512;
                                    break;
                                case 90:
                                    UserProto.UserList userList = (UserProto.UserList) codedInputStream.readMessage(UserProto.UserList.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureUserListIsMutable();
                                        this.userList_.add(userList);
                                    } else {
                                        repeatedFieldBuilder.addMessage(userList);
                                    }
                                    break;
                                case 98:
                                    this.userName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2048;
                                    break;
                                case 106:
                                    this.userHeadImg_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4096;
                                    break;
                                case 112:
                                    this.videoProgress_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 8192;
                                    break;
                                case 120:
                                    this.videoAdjustTime_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 16384;
                                    break;
                                case 128:
                                    this.totalNumber_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 32768;
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
                if (message instanceof ChatRoomVO) {
                    return mergeFrom((ChatRoomVO) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeUserList(int i) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserListIsMutable();
                    this.userList_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setCreatorId(long j) {
                this.creatorId_ = j;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setHavePwd(boolean z) {
                this.havePwd_ = z;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setId(long j) {
                this.id_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOnlineNumber(int i) {
                this.onlineNumber_ = i;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPlaySource(String str) {
                str.getClass();
                this.playSource_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPlaySourceBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.playSource_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRoomDesc(String str) {
                str.getClass();
                this.roomDesc_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRoomDescBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.roomDesc_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRoomName(String str) {
                str.getClass();
                this.roomName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRoomNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.roomName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTotalNumber(int i) {
                this.totalNumber_ = i;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setUserHeadImg(String str) {
                str.getClass();
                this.userHeadImg_ = str;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setUserHeadImgBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userHeadImg_ = byteString;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setUserList(int i, UserProto.UserList.Builder builder) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserListIsMutable();
                    this.userList_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setUserList(int i, UserProto.UserList userList) {
                RepeatedFieldBuilder<UserProto.UserList, UserProto.UserList.Builder, UserProto.UserListOrBuilder> repeatedFieldBuilder = this.userListBuilder_;
                if (repeatedFieldBuilder == null) {
                    userList.getClass();
                    ensureUserListIsMutable();
                    this.userList_.set(i, userList);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, userList);
                }
                return this;
            }

            public Builder setUserName(String str) {
                str.getClass();
                this.userName_ = str;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userName_ = byteString;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setVideoAdjustTime(long j) {
                this.videoAdjustTime_ = j;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setVideoCover(String str) {
                str.getClass();
                this.videoCover_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVideoCoverBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.videoCover_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setVideoId(long j) {
                this.videoId_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setVideoNum(int i) {
                this.videoNum_ = i;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setVideoProgress(long j) {
                this.videoProgress_ = j;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ChatRoomVO.class.getName());
            DEFAULT_INSTANCE = new ChatRoomVO();
            PARSER = new AbstractParser<ChatRoomVO>() { // from class: com.base.model.proto.ChatRoomProto.ChatRoomVO.1
                @Override // com.google.protobuf.Parser
                public ChatRoomVO parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ChatRoomVO.newBuilder();
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

        private ChatRoomVO() {
            this.id_ = 0L;
            this.roomName_ = "";
            this.roomDesc_ = "";
            this.videoId_ = 0L;
            this.videoCover_ = "";
            this.creatorId_ = 0L;
            this.playSource_ = "";
            this.videoNum_ = 0;
            this.onlineNumber_ = 0;
            this.havePwd_ = false;
            this.userName_ = "";
            this.userHeadImg_ = "";
            this.videoProgress_ = 0L;
            this.videoAdjustTime_ = 0L;
            this.totalNumber_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.roomName_ = "";
            this.roomDesc_ = "";
            this.videoCover_ = "";
            this.playSource_ = "";
            this.userList_ = Collections.emptyList();
            this.userName_ = "";
            this.userHeadImg_ = "";
        }

        public /* synthetic */ ChatRoomVO(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private ChatRoomVO(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0L;
            this.roomName_ = "";
            this.roomDesc_ = "";
            this.videoId_ = 0L;
            this.videoCover_ = "";
            this.creatorId_ = 0L;
            this.playSource_ = "";
            this.videoNum_ = 0;
            this.onlineNumber_ = 0;
            this.havePwd_ = false;
            this.userName_ = "";
            this.userHeadImg_ = "";
            this.videoProgress_ = 0L;
            this.videoAdjustTime_ = 0L;
            this.totalNumber_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChatRoomVO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomVO_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ChatRoomVO chatRoomVO) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(chatRoomVO);
        }

        public static ChatRoomVO parseDelimitedFrom(InputStream inputStream) {
            return (ChatRoomVO) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChatRoomVO parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomVO) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomVO parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static ChatRoomVO parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChatRoomVO parseFrom(CodedInputStream codedInputStream) {
            return (ChatRoomVO) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChatRoomVO parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomVO) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static ChatRoomVO parseFrom(InputStream inputStream) {
            return (ChatRoomVO) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static ChatRoomVO parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChatRoomVO) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChatRoomVO parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static ChatRoomVO parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static ChatRoomVO parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChatRoomVO parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<ChatRoomVO> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChatRoomVO)) {
                return super.equals(obj);
            }
            ChatRoomVO chatRoomVO = (ChatRoomVO) obj;
            return getId() == chatRoomVO.getId() && getRoomName().equals(chatRoomVO.getRoomName()) && getRoomDesc().equals(chatRoomVO.getRoomDesc()) && getVideoId() == chatRoomVO.getVideoId() && getVideoCover().equals(chatRoomVO.getVideoCover()) && getCreatorId() == chatRoomVO.getCreatorId() && getPlaySource().equals(chatRoomVO.getPlaySource()) && getVideoNum() == chatRoomVO.getVideoNum() && getOnlineNumber() == chatRoomVO.getOnlineNumber() && getHavePwd() == chatRoomVO.getHavePwd() && getUserListList().equals(chatRoomVO.getUserListList()) && getUserName().equals(chatRoomVO.getUserName()) && getUserHeadImg().equals(chatRoomVO.getUserHeadImg()) && getVideoProgress() == chatRoomVO.getVideoProgress() && getVideoAdjustTime() == chatRoomVO.getVideoAdjustTime() && getTotalNumber() == chatRoomVO.getTotalNumber() && getUnknownFields().equals(chatRoomVO.getUnknownFields());
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public long getCreatorId() {
            return this.creatorId_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChatRoomVO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public boolean getHavePwd() {
            return this.havePwd_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public long getId() {
            return this.id_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public int getOnlineNumber() {
            return this.onlineNumber_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChatRoomVO> getParserForType() {
            return PARSER;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public String getPlaySource() {
            Object obj = this.playSource_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.playSource_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public ByteString getPlaySourceBytes() {
            Object obj = this.playSource_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.playSource_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public String getRoomDesc() {
            Object obj = this.roomDesc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomDesc_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public ByteString getRoomDescBytes() {
            Object obj = this.roomDesc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomDesc_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public String getRoomName() {
            Object obj = this.roomName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.roomName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public ByteString getRoomNameBytes() {
            Object obj = this.roomName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.roomName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.id_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessage.isStringEmpty(this.roomName_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.roomName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.roomDesc_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(3, this.roomDesc_);
            }
            long j2 = this.videoId_;
            if (j2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(4, j2);
            }
            if (!GeneratedMessage.isStringEmpty(this.videoCover_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(5, this.videoCover_);
            }
            long j3 = this.creatorId_;
            if (j3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(6, j3);
            }
            if (!GeneratedMessage.isStringEmpty(this.playSource_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(7, this.playSource_);
            }
            int i2 = this.videoNum_;
            if (i2 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(8, i2);
            }
            int i3 = this.onlineNumber_;
            if (i3 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(9, i3);
            }
            boolean z = this.havePwd_;
            if (z) {
                iComputeInt64Size += CodedOutputStream.computeBoolSize(10, z);
            }
            for (int i4 = 0; i4 < this.userList_.size(); i4++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(11, this.userList_.get(i4));
            }
            if (!GeneratedMessage.isStringEmpty(this.userName_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(12, this.userName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.userHeadImg_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(13, this.userHeadImg_);
            }
            long j4 = this.videoProgress_;
            if (j4 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(14, j4);
            }
            long j5 = this.videoAdjustTime_;
            if (j5 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(15, j5);
            }
            int i5 = this.totalNumber_;
            if (i5 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt32Size(16, i5);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public int getTotalNumber() {
            return this.totalNumber_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public String getUserHeadImg() {
            Object obj = this.userHeadImg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userHeadImg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public ByteString getUserHeadImgBytes() {
            Object obj = this.userHeadImg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userHeadImg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public UserProto.UserList getUserList(int i) {
            return this.userList_.get(i);
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public int getUserListCount() {
            return this.userList_.size();
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public List<UserProto.UserList> getUserListList() {
            return this.userList_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public UserProto.UserListOrBuilder getUserListOrBuilder(int i) {
            return this.userList_.get(i);
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public List<? extends UserProto.UserListOrBuilder> getUserListOrBuilderList() {
            return this.userList_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public String getUserName() {
            Object obj = this.userName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public ByteString getUserNameBytes() {
            Object obj = this.userName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public long getVideoAdjustTime() {
            return this.videoAdjustTime_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public String getVideoCover() {
            Object obj = this.videoCover_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.videoCover_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public ByteString getVideoCoverBytes() {
            Object obj = this.videoCover_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.videoCover_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public long getVideoId() {
            return this.videoId_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public int getVideoNum() {
            return this.videoNum_;
        }

        @Override // com.base.model.proto.ChatRoomProto.ChatRoomVOOrBuilder
        public long getVideoProgress() {
            return this.videoProgress_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashBoolean = Internal.hashBoolean(getHavePwd()) + ((((getOnlineNumber() + ((((getVideoNum() + ((((getPlaySource().hashCode() + ((((Internal.hashLong(getCreatorId()) + ((((getVideoCover().hashCode() + ((((Internal.hashLong(getVideoId()) + ((((getRoomDesc().hashCode() + ((((getRoomName().hashCode() + ((((Internal.hashLong(getId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53);
            if (getUserListCount() > 0) {
                iHashBoolean = a.a(iHashBoolean, 37, 11, 53) + getUserListList().hashCode();
            }
            int iHashCode = getUnknownFields().hashCode() + ((getTotalNumber() + ((((Internal.hashLong(getVideoAdjustTime()) + ((((Internal.hashLong(getVideoProgress()) + ((((getUserHeadImg().hashCode() + ((((getUserName().hashCode() + a.a(iHashBoolean, 37, 12, 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 37) + 15) * 53)) * 37) + 16) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ChatRoomProto.internal_static_com_base_model_proto_ChatRoomVO_fieldAccessorTable.ensureFieldAccessorsInitialized(ChatRoomVO.class, Builder.class);
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
            if (!GeneratedMessage.isStringEmpty(this.roomName_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.roomName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.roomDesc_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.roomDesc_);
            }
            long j2 = this.videoId_;
            if (j2 != 0) {
                codedOutputStream.writeInt64(4, j2);
            }
            if (!GeneratedMessage.isStringEmpty(this.videoCover_)) {
                GeneratedMessage.writeString(codedOutputStream, 5, this.videoCover_);
            }
            long j3 = this.creatorId_;
            if (j3 != 0) {
                codedOutputStream.writeInt64(6, j3);
            }
            if (!GeneratedMessage.isStringEmpty(this.playSource_)) {
                GeneratedMessage.writeString(codedOutputStream, 7, this.playSource_);
            }
            int i = this.videoNum_;
            if (i != 0) {
                codedOutputStream.writeInt32(8, i);
            }
            int i2 = this.onlineNumber_;
            if (i2 != 0) {
                codedOutputStream.writeInt32(9, i2);
            }
            boolean z = this.havePwd_;
            if (z) {
                codedOutputStream.writeBool(10, z);
            }
            for (int i3 = 0; i3 < this.userList_.size(); i3++) {
                codedOutputStream.writeMessage(11, this.userList_.get(i3));
            }
            if (!GeneratedMessage.isStringEmpty(this.userName_)) {
                GeneratedMessage.writeString(codedOutputStream, 12, this.userName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.userHeadImg_)) {
                GeneratedMessage.writeString(codedOutputStream, 13, this.userHeadImg_);
            }
            long j4 = this.videoProgress_;
            if (j4 != 0) {
                codedOutputStream.writeInt64(14, j4);
            }
            long j5 = this.videoAdjustTime_;
            if (j5 != 0) {
                codedOutputStream.writeInt64(15, j5);
            }
            int i4 = this.totalNumber_;
            if (i4 != 0) {
                codedOutputStream.writeInt32(16, i4);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface ChatRoomVOOrBuilder extends MessageOrBuilder {
        long getCreatorId();

        boolean getHavePwd();

        long getId();

        int getOnlineNumber();

        String getPlaySource();

        ByteString getPlaySourceBytes();

        String getRoomDesc();

        ByteString getRoomDescBytes();

        String getRoomName();

        ByteString getRoomNameBytes();

        int getTotalNumber();

        String getUserHeadImg();

        ByteString getUserHeadImgBytes();

        UserProto.UserList getUserList(int i);

        int getUserListCount();

        List<UserProto.UserList> getUserListList();

        UserProto.UserListOrBuilder getUserListOrBuilder(int i);

        List<? extends UserProto.UserListOrBuilder> getUserListOrBuilderList();

        String getUserName();

        ByteString getUserNameBytes();

        long getVideoAdjustTime();

        String getVideoCover();

        ByteString getVideoCoverBytes();

        long getVideoId();

        int getVideoNum();

        long getVideoProgress();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", ChatRoomProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eChatRoom.proto\u0012\u0014com.base.model.proto\u001a\nUser.proto\"Ç\u0001\n\u000bChatRoomAdd\u0012\u0010\n\broomName\u0018\u0001 \u0001(\t\u0012\u0010\n\broomDesc\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007roomPwd\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007videoId\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nvideoCover\u0018\u0005 \u0001(\t\u0012\u0011\n\tcreatorId\u0018\u0006 \u0001(\u0003\u0012\u0012\n\nplaySource\u0018\u0007 \u0001(\t\u0012\u0010\n\bvideoNum\u0018\b \u0001(\u0005\u0012\u0010\n\buserName\u0018\t \u0001(\t\u0012\u0013\n\u000buserHeadImg\u0018\n \u0001(\t\"2\n\u000eChatRoomUpdate\u0012\u000e\n\u0006roomId\u0018\u0001 \u0001(\u0003\u0012\u0010\n\broomName\u0018\u0002 \u0001(\t\"t\n\fChatRoomPage\u00122\n\bchatRoom\u0018\u0001 \u0003(\u000b2 .com.base.model.proto.ChatRoomVO\u0012\u000f\n\u0007pageNum\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bpageSize\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005total\u0018\u0004 \u0001(\u0003\"ß\u0002\n\nChatRoomVO\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0003\u0012\u0010\n\broomName\u0018\u0002 \u0001(\t\u0012\u0010\n\broomDesc\u0018\u0003 \u0001(\t\u0012\u000f\n\u0007videoId\u0018\u0004 \u0001(\u0003\u0012\u0012\n\nvideoCover\u0018\u0005 \u0001(\t\u0012\u0011\n\tcreatorId\u0018\u0006 \u0001(\u0003\u0012\u0012\n\nplaySource\u0018\u0007 \u0001(\t\u0012\u0010\n\bvideoNum\u0018\b \u0001(\u0005\u0012\u0014\n\fonlineNumber\u0018\t \u0001(\u0005\u0012\u000f\n\u0007havePwd\u0018\n \u0001(\b\u00120\n\buserList\u0018\u000b \u0003(\u000b2\u001e.com.base.model.proto.UserList\u0012\u0010\n\buserName\u0018\f \u0001(\t\u0012\u0013\n\u000buserHeadImg\u0018\r \u0001(\t\u0012\u0015\n\rvideoProgress\u0018\u000e \u0001(\u0003\u0012\u0017\n\u000fvideoAdjustTime\u0018\u000f \u0001(\u0003\u0012\u0013\n\u000btotalNumber\u0018\u0010 \u0001(\u0005\"`\n\u000bChatRoomReq\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0003\u0012\u0011\n\tcreatorId\u0018\u0002 \u0001(\u0003\u0012\u000f\n\u0007videoId\u0018\u0003 \u0001(\u0003\u0012\u000f\n\u0007pageNum\u0018\u0004 \u0001(\u0005\u0012\u0010\n\bpageSize\u0018\u0005 \u0001(\u0005B\u000fB\rChatRoomProtob\u0006proto3"}, new Descriptors.FileDescriptor[]{UserProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_ChatRoomAdd_descriptor = descriptor2;
        internal_static_com_base_model_proto_ChatRoomAdd_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"RoomName", "RoomDesc", "RoomPwd", "VideoId", "VideoCover", "CreatorId", "PlaySource", "VideoNum", "UserName", "UserHeadImg"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_ChatRoomUpdate_descriptor = descriptor3;
        internal_static_com_base_model_proto_ChatRoomUpdate_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"RoomId", "RoomName"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_com_base_model_proto_ChatRoomPage_descriptor = descriptor4;
        internal_static_com_base_model_proto_ChatRoomPage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor4, new String[]{"ChatRoom", "PageNum", "PageSize", "Total"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_com_base_model_proto_ChatRoomVO_descriptor = descriptor5;
        internal_static_com_base_model_proto_ChatRoomVO_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor5, new String[]{"Id", "RoomName", "RoomDesc", "VideoId", "VideoCover", "CreatorId", "PlaySource", "VideoNum", "OnlineNumber", "HavePwd", "UserList", "UserName", "UserHeadImg", "VideoProgress", "VideoAdjustTime", "TotalNumber"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_com_base_model_proto_ChatRoomReq_descriptor = descriptor6;
        internal_static_com_base_model_proto_ChatRoomReq_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor6, new String[]{"Id", "CreatorId", "VideoId", "PageNum", "PageSize"});
        descriptor.resolveAllFeaturesImmutable();
        UserProto.getDescriptor();
    }

    private ChatRoomProto() {
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
