package com.base.model.proto;

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
public final class UserLikeProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_UserLikeBeanPage_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_UserLikeBeanPage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_UserLikeBean_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_UserLikeBean_fieldAccessorTable;

    public final class UserLikeBean extends GeneratedMessage implements UserLikeBeanOrBuilder {
        public static final int CREATE_TIME_FIELD_NUMBER = 4;
        private static final UserLikeBean DEFAULT_INSTANCE;
        public static final int DRAMA_ID_FIELD_NUMBER = 3;
        public static final int ID_FIELD_NUMBER = 1;
        private static final Parser<UserLikeBean> PARSER;
        public static final int USER_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private long createTime_;
        private int dramaId_;
        private int id_;
        private byte memoizedIsInitialized;
        private int userId_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements UserLikeBeanOrBuilder {
            private int bitField0_;
            private long createTime_;
            private int dramaId_;
            private int id_;
            private int userId_;

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

            private void buildPartial0(UserLikeBean userLikeBean) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    userLikeBean.id_ = this.id_;
                }
                if ((i & 2) != 0) {
                    userLikeBean.userId_ = this.userId_;
                }
                if ((i & 4) != 0) {
                    userLikeBean.dramaId_ = this.dramaId_;
                }
                if ((i & 8) != 0) {
                    userLikeBean.createTime_ = this.createTime_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserLikeProto.internal_static_com_base_model_proto_UserLikeBean_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserLikeBean build() {
                UserLikeBean userLikeBeanBuildPartial = buildPartial();
                if (userLikeBeanBuildPartial.isInitialized()) {
                    return userLikeBeanBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userLikeBeanBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserLikeBean buildPartial() {
                UserLikeBean userLikeBean = new UserLikeBean(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userLikeBean);
                }
                onBuilt();
                return userLikeBean;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.userId_ = 0;
                this.dramaId_ = 0;
                this.createTime_ = 0L;
                return this;
            }

            public Builder clearCreateTime() {
                this.bitField0_ &= -9;
                this.createTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDramaId() {
                this.bitField0_ &= -5;
                this.dramaId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -3;
                this.userId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
            public long getCreateTime() {
                return this.createTime_;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UserLikeBean getDefaultInstanceForType() {
                return UserLikeBean.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserLikeProto.internal_static_com_base_model_proto_UserLikeBean_descriptor;
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
            public int getDramaId() {
                return this.dramaId_;
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
            public int getUserId() {
                return this.userId_;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserLikeProto.internal_static_com_base_model_proto_UserLikeBean_fieldAccessorTable.ensureFieldAccessorsInitialized(UserLikeBean.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(UserLikeBean userLikeBean) {
                if (userLikeBean == UserLikeBean.getDefaultInstance()) {
                    return this;
                }
                if (userLikeBean.getId() != 0) {
                    setId(userLikeBean.getId());
                }
                if (userLikeBean.getUserId() != 0) {
                    setUserId(userLikeBean.getUserId());
                }
                if (userLikeBean.getDramaId() != 0) {
                    setDramaId(userLikeBean.getDramaId());
                }
                if (userLikeBean.getCreateTime() != 0) {
                    setCreateTime(userLikeBean.getCreateTime());
                }
                mergeUnknownFields(userLikeBean.getUnknownFields());
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
                                    this.id_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.userId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.dramaId_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.createTime_ = codedInputStream.readInt64();
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
                if (message instanceof UserLikeBean) {
                    return mergeFrom((UserLikeBean) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setCreateTime(long j) {
                this.createTime_ = j;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDramaId(int i) {
                this.dramaId_ = i;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setId(int i) {
                this.id_ = i;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserId(int i) {
                this.userId_ = i;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", UserLikeBean.class.getName());
            DEFAULT_INSTANCE = new UserLikeBean();
            PARSER = new AbstractParser<UserLikeBean>() { // from class: com.base.model.proto.UserLikeProto.UserLikeBean.1
                @Override // com.google.protobuf.Parser
                public UserLikeBean parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = UserLikeBean.newBuilder();
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

        private UserLikeBean() {
            this.id_ = 0;
            this.userId_ = 0;
            this.dramaId_ = 0;
            this.createTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ UserLikeBean(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private UserLikeBean(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.userId_ = 0;
            this.dramaId_ = 0;
            this.createTime_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserLikeBean getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserLikeProto.internal_static_com_base_model_proto_UserLikeBean_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(UserLikeBean userLikeBean) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userLikeBean);
        }

        public static UserLikeBean parseDelimitedFrom(InputStream inputStream) {
            return (UserLikeBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserLikeBean parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserLikeBean) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserLikeBean parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static UserLikeBean parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserLikeBean parseFrom(CodedInputStream codedInputStream) {
            return (UserLikeBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserLikeBean parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserLikeBean) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static UserLikeBean parseFrom(InputStream inputStream) {
            return (UserLikeBean) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static UserLikeBean parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserLikeBean) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserLikeBean parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static UserLikeBean parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static UserLikeBean parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UserLikeBean parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<UserLikeBean> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserLikeBean)) {
                return super.equals(obj);
            }
            UserLikeBean userLikeBean = (UserLikeBean) obj;
            return getId() == userLikeBean.getId() && getUserId() == userLikeBean.getUserId() && getDramaId() == userLikeBean.getDramaId() && getCreateTime() == userLikeBean.getCreateTime() && getUnknownFields().equals(userLikeBean.getUnknownFields());
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
        public long getCreateTime() {
            return this.createTime_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserLikeBean getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
        public int getDramaId() {
            return this.dramaId_;
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserLikeBean> getParserForType() {
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
            int i4 = this.dramaId_;
            if (i4 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i4);
            }
            long j = this.createTime_;
            if (j != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt64Size(4, j);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanOrBuilder
        public int getUserId() {
            return this.userId_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((Internal.hashLong(getCreateTime()) + ((((getDramaId() + ((((getUserId() + ((((getId() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserLikeProto.internal_static_com_base_model_proto_UserLikeBean_fieldAccessorTable.ensureFieldAccessorsInitialized(UserLikeBean.class, Builder.class);
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
            int i3 = this.dramaId_;
            if (i3 != 0) {
                codedOutputStream.writeInt32(3, i3);
            }
            long j = this.createTime_;
            if (j != 0) {
                codedOutputStream.writeInt64(4, j);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface UserLikeBeanOrBuilder extends MessageOrBuilder {
        long getCreateTime();

        int getDramaId();

        int getId();

        int getUserId();
    }

    public final class UserLikeBeanPage extends GeneratedMessage implements UserLikeBeanPageOrBuilder {
        private static final UserLikeBeanPage DEFAULT_INSTANCE;
        private static final Parser<UserLikeBeanPage> PARSER;
        public static final int USERLIKEBEAN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<UserLikeBean> userLikeBean_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements UserLikeBeanPageOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> userLikeBeanBuilder_;
            private List<UserLikeBean> userLikeBean_;

            private Builder() {
                this.userLikeBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.userLikeBean_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(UserLikeBeanPage userLikeBeanPage) {
            }

            private void buildPartialRepeatedFields(UserLikeBeanPage userLikeBeanPage) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder != null) {
                    userLikeBeanPage.userLikeBean_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.userLikeBean_ = Collections.unmodifiableList(this.userLikeBean_);
                    this.bitField0_ &= -2;
                }
                userLikeBeanPage.userLikeBean_ = this.userLikeBean_;
            }

            private void ensureUserLikeBeanIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.userLikeBean_ = new ArrayList(this.userLikeBean_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserLikeProto.internal_static_com_base_model_proto_UserLikeBeanPage_descriptor;
            }

            private RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> internalGetUserLikeBeanFieldBuilder() {
                if (this.userLikeBeanBuilder_ == null) {
                    this.userLikeBeanBuilder_ = new RepeatedFieldBuilder<>(this.userLikeBean_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.userLikeBean_ = null;
                }
                return this.userLikeBeanBuilder_;
            }

            public Builder addAllUserLikeBean(Iterable<? extends UserLikeBean> iterable) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikeBeanIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.userLikeBean_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addUserLikeBean(int i, UserLikeBean.Builder builder) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addUserLikeBean(int i, UserLikeBean userLikeBean) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    userLikeBean.getClass();
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.add(i, userLikeBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, userLikeBean);
                }
                return this;
            }

            public Builder addUserLikeBean(UserLikeBean.Builder builder) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUserLikeBean(UserLikeBean userLikeBean) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    userLikeBean.getClass();
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.add(userLikeBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(userLikeBean);
                }
                return this;
            }

            public UserLikeBean.Builder addUserLikeBeanBuilder() {
                return (UserLikeBean.Builder) internalGetUserLikeBeanFieldBuilder().addBuilder(UserLikeBean.getDefaultInstance());
            }

            public UserLikeBean.Builder addUserLikeBeanBuilder(int i) {
                return (UserLikeBean.Builder) internalGetUserLikeBeanFieldBuilder().addBuilder(i, UserLikeBean.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserLikeBeanPage build() {
                UserLikeBeanPage userLikeBeanPageBuildPartial = buildPartial();
                if (userLikeBeanPageBuildPartial.isInitialized()) {
                    return userLikeBeanPageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userLikeBeanPageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserLikeBeanPage buildPartial() {
                UserLikeBeanPage userLikeBeanPage = new UserLikeBeanPage(this);
                buildPartialRepeatedFields(userLikeBeanPage);
                if (this.bitField0_ != 0) {
                    buildPartial0(userLikeBeanPage);
                }
                onBuilt();
                return userLikeBeanPage;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.userLikeBean_ = Collections.emptyList();
                } else {
                    this.userLikeBean_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearUserLikeBean() {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.userLikeBean_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UserLikeBeanPage getDefaultInstanceForType() {
                return UserLikeBeanPage.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserLikeProto.internal_static_com_base_model_proto_UserLikeBeanPage_descriptor;
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
            public UserLikeBean getUserLikeBean(int i) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                return repeatedFieldBuilder == null ? this.userLikeBean_.get(i) : (UserLikeBean) repeatedFieldBuilder.getMessage(i);
            }

            public UserLikeBean.Builder getUserLikeBeanBuilder(int i) {
                return (UserLikeBean.Builder) internalGetUserLikeBeanFieldBuilder().getBuilder(i);
            }

            public List<UserLikeBean.Builder> getUserLikeBeanBuilderList() {
                return internalGetUserLikeBeanFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
            public int getUserLikeBeanCount() {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                return repeatedFieldBuilder == null ? this.userLikeBean_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
            public List<UserLikeBean> getUserLikeBeanList() {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.userLikeBean_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
            public UserLikeBeanOrBuilder getUserLikeBeanOrBuilder(int i) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                return repeatedFieldBuilder == null ? this.userLikeBean_.get(i) : (UserLikeBeanOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
            public List<? extends UserLikeBeanOrBuilder> getUserLikeBeanOrBuilderList() {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.userLikeBean_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserLikeProto.internal_static_com_base_model_proto_UserLikeBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(UserLikeBeanPage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(UserLikeBeanPage userLikeBeanPage) {
                if (userLikeBeanPage == UserLikeBeanPage.getDefaultInstance()) {
                    return this;
                }
                if (this.userLikeBeanBuilder_ == null) {
                    if (!userLikeBeanPage.userLikeBean_.isEmpty()) {
                        if (this.userLikeBean_.isEmpty()) {
                            this.userLikeBean_ = userLikeBeanPage.userLikeBean_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureUserLikeBeanIsMutable();
                            this.userLikeBean_.addAll(userLikeBeanPage.userLikeBean_);
                        }
                        onChanged();
                    }
                } else if (!userLikeBeanPage.userLikeBean_.isEmpty()) {
                    if (this.userLikeBeanBuilder_.isEmpty()) {
                        this.userLikeBeanBuilder_.dispose();
                        this.userLikeBeanBuilder_ = null;
                        this.userLikeBean_ = userLikeBeanPage.userLikeBean_;
                        this.bitField0_ &= -2;
                        this.userLikeBeanBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUserLikeBeanFieldBuilder() : null;
                    } else {
                        this.userLikeBeanBuilder_.addAllMessages(userLikeBeanPage.userLikeBean_);
                    }
                }
                mergeUnknownFields(userLikeBeanPage.getUnknownFields());
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
                                    UserLikeBean userLikeBean = (UserLikeBean) codedInputStream.readMessage(UserLikeBean.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureUserLikeBeanIsMutable();
                                        this.userLikeBean_.add(userLikeBean);
                                    } else {
                                        repeatedFieldBuilder.addMessage(userLikeBean);
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
                if (message instanceof UserLikeBeanPage) {
                    return mergeFrom((UserLikeBeanPage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeUserLikeBean(int i) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setUserLikeBean(int i, UserLikeBean.Builder builder) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setUserLikeBean(int i, UserLikeBean userLikeBean) {
                RepeatedFieldBuilder<UserLikeBean, UserLikeBean.Builder, UserLikeBeanOrBuilder> repeatedFieldBuilder = this.userLikeBeanBuilder_;
                if (repeatedFieldBuilder == null) {
                    userLikeBean.getClass();
                    ensureUserLikeBeanIsMutable();
                    this.userLikeBean_.set(i, userLikeBean);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, userLikeBean);
                }
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", UserLikeBeanPage.class.getName());
            DEFAULT_INSTANCE = new UserLikeBeanPage();
            PARSER = new AbstractParser<UserLikeBeanPage>() { // from class: com.base.model.proto.UserLikeProto.UserLikeBeanPage.1
                @Override // com.google.protobuf.Parser
                public UserLikeBeanPage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = UserLikeBeanPage.newBuilder();
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

        private UserLikeBeanPage() {
            this.memoizedIsInitialized = (byte) -1;
            this.userLikeBean_ = Collections.emptyList();
        }

        public /* synthetic */ UserLikeBeanPage(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private UserLikeBeanPage(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserLikeBeanPage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserLikeProto.internal_static_com_base_model_proto_UserLikeBeanPage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(UserLikeBeanPage userLikeBeanPage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userLikeBeanPage);
        }

        public static UserLikeBeanPage parseDelimitedFrom(InputStream inputStream) {
            return (UserLikeBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserLikeBeanPage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserLikeBeanPage) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserLikeBeanPage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static UserLikeBeanPage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserLikeBeanPage parseFrom(CodedInputStream codedInputStream) {
            return (UserLikeBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserLikeBeanPage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserLikeBeanPage) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static UserLikeBeanPage parseFrom(InputStream inputStream) {
            return (UserLikeBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static UserLikeBeanPage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserLikeBeanPage) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserLikeBeanPage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static UserLikeBeanPage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static UserLikeBeanPage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UserLikeBeanPage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<UserLikeBeanPage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserLikeBeanPage)) {
                return super.equals(obj);
            }
            UserLikeBeanPage userLikeBeanPage = (UserLikeBeanPage) obj;
            return getUserLikeBeanList().equals(userLikeBeanPage.getUserLikeBeanList()) && getUnknownFields().equals(userLikeBeanPage.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserLikeBeanPage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserLikeBeanPage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.userLikeBean_.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.userLikeBean_.get(i2));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
        public UserLikeBean getUserLikeBean(int i) {
            return this.userLikeBean_.get(i);
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
        public int getUserLikeBeanCount() {
            return this.userLikeBean_.size();
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
        public List<UserLikeBean> getUserLikeBeanList() {
            return this.userLikeBean_;
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
        public UserLikeBeanOrBuilder getUserLikeBeanOrBuilder(int i) {
            return this.userLikeBean_.get(i);
        }

        @Override // com.base.model.proto.UserLikeProto.UserLikeBeanPageOrBuilder
        public List<? extends UserLikeBeanOrBuilder> getUserLikeBeanOrBuilderList() {
            return this.userLikeBean_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getUserLikeBeanCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getUserLikeBeanList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserLikeProto.internal_static_com_base_model_proto_UserLikeBeanPage_fieldAccessorTable.ensureFieldAccessorsInitialized(UserLikeBeanPage.class, Builder.class);
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
            for (int i = 0; i < this.userLikeBean_.size(); i++) {
                codedOutputStream.writeMessage(1, this.userLikeBean_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface UserLikeBeanPageOrBuilder extends MessageOrBuilder {
        UserLikeBean getUserLikeBean(int i);

        int getUserLikeBeanCount();

        List<UserLikeBean> getUserLikeBeanList();

        UserLikeBeanOrBuilder getUserLikeBeanOrBuilder(int i);

        List<? extends UserLikeBeanOrBuilder> getUserLikeBeanOrBuilderList();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", UserLikeProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eUserLike.proto\u0012\u0014com.base.model.proto\"R\n\fUserLikeBean\u0012\n\n\u0002id\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007user_id\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bdrama_id\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bcreate_time\u0018\u0004 \u0001(\u0003\"L\n\u0010UserLikeBeanPage\u00128\n\fuserLikeBean\u0018\u0001 \u0003(\u000b2\".com.base.model.proto.UserLikeBeanB\u000fB\rUserLikeProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_UserLikeBean_descriptor = descriptor2;
        internal_static_com_base_model_proto_UserLikeBean_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"Id", "UserId", "DramaId", "CreateTime"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_UserLikeBeanPage_descriptor = descriptor3;
        internal_static_com_base_model_proto_UserLikeBeanPage_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"UserLikeBean"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private UserLikeProto() {
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
