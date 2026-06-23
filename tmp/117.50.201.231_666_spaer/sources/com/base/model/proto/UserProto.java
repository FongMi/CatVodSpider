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
public final class UserProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_UserList_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_UserList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_com_base_model_proto_UserVO_descriptor;
    private static final GeneratedMessage.FieldAccessorTable internal_static_com_base_model_proto_UserVO_fieldAccessorTable;

    public final class UserList extends GeneratedMessage implements UserListOrBuilder {
        private static final UserList DEFAULT_INSTANCE;
        private static final Parser<UserList> PARSER;
        public static final int USER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<UserVO> user_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements UserListOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> userBuilder_;
            private List<UserVO> user_;

            private Builder() {
                this.user_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.user_ = Collections.emptyList();
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(UserList userList) {
            }

            private void buildPartialRepeatedFields(UserList userList) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder != null) {
                    userList.user_ = repeatedFieldBuilder.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.user_ = Collections.unmodifiableList(this.user_);
                    this.bitField0_ &= -2;
                }
                userList.user_ = this.user_;
            }

            private void ensureUserIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.user_ = new ArrayList(this.user_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProto.internal_static_com_base_model_proto_UserList_descriptor;
            }

            private RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> internalGetUserFieldBuilder() {
                if (this.userBuilder_ == null) {
                    this.userBuilder_ = new RepeatedFieldBuilder<>(this.user_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.user_ = null;
                }
                return this.userBuilder_;
            }

            public Builder addAllUser(Iterable<? extends UserVO> iterable) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.user_);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addUser(int i, UserVO.Builder builder) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserIsMutable();
                    this.user_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addUser(int i, UserVO userVO) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    userVO.getClass();
                    ensureUserIsMutable();
                    this.user_.add(i, userVO);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(i, userVO);
                }
                return this;
            }

            public Builder addUser(UserVO.Builder builder) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserIsMutable();
                    this.user_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(builder.build());
                }
                return this;
            }

            public Builder addUser(UserVO userVO) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    userVO.getClass();
                    ensureUserIsMutable();
                    this.user_.add(userVO);
                    onChanged();
                } else {
                    repeatedFieldBuilder.addMessage(userVO);
                }
                return this;
            }

            public UserVO.Builder addUserBuilder() {
                return (UserVO.Builder) internalGetUserFieldBuilder().addBuilder(UserVO.getDefaultInstance());
            }

            public UserVO.Builder addUserBuilder(int i) {
                return (UserVO.Builder) internalGetUserFieldBuilder().addBuilder(i, UserVO.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserList build() {
                UserList userListBuildPartial = buildPartial();
                if (userListBuildPartial.isInitialized()) {
                    return userListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserList buildPartial() {
                UserList userList = new UserList(this);
                buildPartialRepeatedFields(userList);
                if (this.bitField0_ != 0) {
                    buildPartial0(userList);
                }
                onBuilt();
                return userList;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.user_ = Collections.emptyList();
                } else {
                    this.user_ = null;
                    repeatedFieldBuilder.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearUser() {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    this.user_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilder.clear();
                }
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UserList getDefaultInstanceForType() {
                return UserList.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProto.internal_static_com_base_model_proto_UserList_descriptor;
            }

            @Override // com.base.model.proto.UserProto.UserListOrBuilder
            public UserVO getUser(int i) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                return repeatedFieldBuilder == null ? this.user_.get(i) : (UserVO) repeatedFieldBuilder.getMessage(i);
            }

            public UserVO.Builder getUserBuilder(int i) {
                return (UserVO.Builder) internalGetUserFieldBuilder().getBuilder(i);
            }

            public List<UserVO.Builder> getUserBuilderList() {
                return internalGetUserFieldBuilder().getBuilderList();
            }

            @Override // com.base.model.proto.UserProto.UserListOrBuilder
            public int getUserCount() {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                return repeatedFieldBuilder == null ? this.user_.size() : repeatedFieldBuilder.getCount();
            }

            @Override // com.base.model.proto.UserProto.UserListOrBuilder
            public List<UserVO> getUserList() {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.user_) : repeatedFieldBuilder.getMessageList();
            }

            @Override // com.base.model.proto.UserProto.UserListOrBuilder
            public UserVOOrBuilder getUserOrBuilder(int i) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                return repeatedFieldBuilder == null ? this.user_.get(i) : (UserVOOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i);
            }

            @Override // com.base.model.proto.UserProto.UserListOrBuilder
            public List<? extends UserVOOrBuilder> getUserOrBuilderList() {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.user_);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProto.internal_static_com_base_model_proto_UserList_fieldAccessorTable.ensureFieldAccessorsInitialized(UserList.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(UserList userList) {
                if (userList == UserList.getDefaultInstance()) {
                    return this;
                }
                if (this.userBuilder_ == null) {
                    if (!userList.user_.isEmpty()) {
                        if (this.user_.isEmpty()) {
                            this.user_ = userList.user_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureUserIsMutable();
                            this.user_.addAll(userList.user_);
                        }
                        onChanged();
                    }
                } else if (!userList.user_.isEmpty()) {
                    if (this.userBuilder_.isEmpty()) {
                        this.userBuilder_.dispose();
                        this.userBuilder_ = null;
                        this.user_ = userList.user_;
                        this.bitField0_ &= -2;
                        this.userBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetUserFieldBuilder() : null;
                    } else {
                        this.userBuilder_.addAllMessages(userList.user_);
                    }
                }
                mergeUnknownFields(userList.getUnknownFields());
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
                                    UserVO userVO = (UserVO) codedInputStream.readMessage(UserVO.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                                    if (repeatedFieldBuilder == null) {
                                        ensureUserIsMutable();
                                        this.user_.add(userVO);
                                    } else {
                                        repeatedFieldBuilder.addMessage(userVO);
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
                if (message instanceof UserList) {
                    return mergeFrom((UserList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder removeUser(int i) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserIsMutable();
                    this.user_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilder.remove(i);
                }
                return this;
            }

            public Builder setUser(int i, UserVO.Builder builder) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    ensureUserIsMutable();
                    this.user_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder setUser(int i, UserVO userVO) {
                RepeatedFieldBuilder<UserVO, UserVO.Builder, UserVOOrBuilder> repeatedFieldBuilder = this.userBuilder_;
                if (repeatedFieldBuilder == null) {
                    userVO.getClass();
                    ensureUserIsMutable();
                    this.user_.set(i, userVO);
                    onChanged();
                } else {
                    repeatedFieldBuilder.setMessage(i, userVO);
                }
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", UserList.class.getName());
            DEFAULT_INSTANCE = new UserList();
            PARSER = new AbstractParser<UserList>() { // from class: com.base.model.proto.UserProto.UserList.1
                @Override // com.google.protobuf.Parser
                public UserList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = UserList.newBuilder();
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

        private UserList() {
            this.memoizedIsInitialized = (byte) -1;
            this.user_ = Collections.emptyList();
        }

        public /* synthetic */ UserList(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private UserList(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProto.internal_static_com_base_model_proto_UserList_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(UserList userList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userList);
        }

        public static UserList parseDelimitedFrom(InputStream inputStream) {
            return (UserList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserList) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserList parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static UserList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserList parseFrom(CodedInputStream codedInputStream) {
            return (UserList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserList) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static UserList parseFrom(InputStream inputStream) {
            return (UserList) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static UserList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserList) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserList parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static UserList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static UserList parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UserList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<UserList> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserList)) {
                return super.equals(obj);
            }
            UserList userList = (UserList) obj;
            return getUserList().equals(userList.getUserList()) && getUnknownFields().equals(userList.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserList> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = 0;
            for (int i2 = 0; i2 < this.user_.size(); i2++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.user_.get(i2));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.UserProto.UserListOrBuilder
        public UserVO getUser(int i) {
            return this.user_.get(i);
        }

        @Override // com.base.model.proto.UserProto.UserListOrBuilder
        public int getUserCount() {
            return this.user_.size();
        }

        @Override // com.base.model.proto.UserProto.UserListOrBuilder
        public List<UserVO> getUserList() {
            return this.user_;
        }

        @Override // com.base.model.proto.UserProto.UserListOrBuilder
        public UserVOOrBuilder getUserOrBuilder(int i) {
            return this.user_.get(i);
        }

        @Override // com.base.model.proto.UserProto.UserListOrBuilder
        public List<? extends UserVOOrBuilder> getUserOrBuilderList() {
            return this.user_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getUserCount() > 0) {
                iHashCode = a.a(iHashCode, 37, 1, 53) + getUserList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProto.internal_static_com_base_model_proto_UserList_fieldAccessorTable.ensureFieldAccessorsInitialized(UserList.class, Builder.class);
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
            for (int i = 0; i < this.user_.size(); i++) {
                codedOutputStream.writeMessage(1, this.user_.get(i));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface UserListOrBuilder extends MessageOrBuilder {
        UserVO getUser(int i);

        int getUserCount();

        List<UserVO> getUserList();

        UserVOOrBuilder getUserOrBuilder(int i);

        List<? extends UserVOOrBuilder> getUserOrBuilderList();
    }

    public final class UserVO extends GeneratedMessage implements UserVOOrBuilder {
        private static final UserVO DEFAULT_INSTANCE;
        private static final Parser<UserVO> PARSER;
        public static final int USERHEADIMG_FIELD_NUMBER = 3;
        public static final int USERID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object userHeadImg_;
        private long userId_;
        private volatile Object userName_;

        public final class Builder extends GeneratedMessage.Builder<Builder> implements UserVOOrBuilder {
            private int bitField0_;
            private Object userHeadImg_;
            private long userId_;
            private Object userName_;

            private Builder() {
                this.userName_ = "";
                this.userHeadImg_ = "";
            }

            public /* synthetic */ Builder(int i) {
                this();
            }

            private Builder(AbstractMessage.BuilderParent builderParent) {
                super(builderParent);
                this.userName_ = "";
                this.userHeadImg_ = "";
            }

            public /* synthetic */ Builder(AbstractMessage.BuilderParent builderParent, int i) {
                this(builderParent);
            }

            private void buildPartial0(UserVO userVO) {
                int i = this.bitField0_;
                if ((i & 1) != 0) {
                    userVO.userId_ = this.userId_;
                }
                if ((i & 2) != 0) {
                    userVO.userName_ = this.userName_;
                }
                if ((i & 4) != 0) {
                    userVO.userHeadImg_ = this.userHeadImg_;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return UserProto.internal_static_com_base_model_proto_UserVO_descriptor;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserVO build() {
                UserVO userVOBuildPartial = buildPartial();
                if (userVOBuildPartial.isInitialized()) {
                    return userVOBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userVOBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserVO buildPartial() {
                UserVO userVO = new UserVO(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userVO);
                }
                onBuilt();
                return userVO;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.userId_ = 0L;
                this.userName_ = "";
                this.userHeadImg_ = "";
                return this;
            }

            public Builder clearUserHeadImg() {
                this.userHeadImg_ = UserVO.getDefaultInstance().getUserHeadImg();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearUserId() {
                this.bitField0_ &= -2;
                this.userId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserName() {
                this.userName_ = UserVO.getDefaultInstance().getUserName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UserVO getDefaultInstanceForType() {
                return UserVO.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return UserProto.internal_static_com_base_model_proto_UserVO_descriptor;
            }

            @Override // com.base.model.proto.UserProto.UserVOOrBuilder
            public String getUserHeadImg() {
                Object obj = this.userHeadImg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userHeadImg_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.UserProto.UserVOOrBuilder
            public ByteString getUserHeadImgBytes() {
                Object obj = this.userHeadImg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userHeadImg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.base.model.proto.UserProto.UserVOOrBuilder
            public long getUserId() {
                return this.userId_;
            }

            @Override // com.base.model.proto.UserProto.UserVOOrBuilder
            public String getUserName() {
                Object obj = this.userName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userName_ = stringUtf8;
                return stringUtf8;
            }

            @Override // com.base.model.proto.UserProto.UserVOOrBuilder
            public ByteString getUserNameBytes() {
                Object obj = this.userName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return UserProto.internal_static_com_base_model_proto_UserVO_fieldAccessorTable.ensureFieldAccessorsInitialized(UserVO.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(UserVO userVO) {
                if (userVO == UserVO.getDefaultInstance()) {
                    return this;
                }
                if (userVO.getUserId() != 0) {
                    setUserId(userVO.getUserId());
                }
                if (!userVO.getUserName().isEmpty()) {
                    this.userName_ = userVO.userName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!userVO.getUserHeadImg().isEmpty()) {
                    this.userHeadImg_ = userVO.userHeadImg_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(userVO.getUnknownFields());
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
                                    this.userId_ = codedInputStream.readInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.userName_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.userHeadImg_ = codedInputStream.readStringRequireUtf8();
                                    this.bitField0_ |= 4;
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
                if (message instanceof UserVO) {
                    return mergeFrom((UserVO) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setUserHeadImg(String str) {
                str.getClass();
                this.userHeadImg_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUserHeadImgBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userHeadImg_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUserId(long j) {
                this.userId_ = j;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUserName(String str) {
                str.getClass();
                this.userName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUserNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }
        }

        static {
            RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", UserVO.class.getName());
            DEFAULT_INSTANCE = new UserVO();
            PARSER = new AbstractParser<UserVO>() { // from class: com.base.model.proto.UserProto.UserVO.1
                @Override // com.google.protobuf.Parser
                public UserVO parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = UserVO.newBuilder();
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

        private UserVO() {
            this.userId_ = 0L;
            this.userName_ = "";
            this.userHeadImg_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.userName_ = "";
            this.userHeadImg_ = "";
        }

        public /* synthetic */ UserVO(Builder builder) {
            this((GeneratedMessage.Builder<?>) builder);
        }

        private UserVO(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.userId_ = 0L;
            this.userName_ = "";
            this.userHeadImg_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserVO getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return UserProto.internal_static_com_base_model_proto_UserVO_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(UserVO userVO) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userVO);
        }

        public static UserVO parseDelimitedFrom(InputStream inputStream) {
            return (UserVO) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserVO parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVO) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserVO parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static UserVO parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserVO parseFrom(CodedInputStream codedInputStream) {
            return (UserVO) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserVO parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVO) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public static UserVO parseFrom(InputStream inputStream) {
            return (UserVO) GeneratedMessage.parseWithIOException(PARSER, inputStream);
        }

        public static UserVO parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserVO) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserVO parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static UserVO parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static UserVO parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UserVO parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Parser<UserVO> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserVO)) {
                return super.equals(obj);
            }
            UserVO userVO = (UserVO) obj;
            return getUserId() == userVO.getUserId() && getUserName().equals(userVO.getUserName()) && getUserHeadImg().equals(userVO.getUserHeadImg()) && getUnknownFields().equals(userVO.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserVO getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserVO> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            long j = this.userId_;
            int iComputeInt64Size = j != 0 ? CodedOutputStream.computeInt64Size(1, j) : 0;
            if (!GeneratedMessage.isStringEmpty(this.userName_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(2, this.userName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.userHeadImg_)) {
                iComputeInt64Size += GeneratedMessage.computeStringSize(3, this.userHeadImg_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.base.model.proto.UserProto.UserVOOrBuilder
        public String getUserHeadImg() {
            Object obj = this.userHeadImg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userHeadImg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.UserProto.UserVOOrBuilder
        public ByteString getUserHeadImgBytes() {
            Object obj = this.userHeadImg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userHeadImg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.base.model.proto.UserProto.UserVOOrBuilder
        public long getUserId() {
            return this.userId_;
        }

        @Override // com.base.model.proto.UserProto.UserVOOrBuilder
        public String getUserName() {
            Object obj = this.userName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.base.model.proto.UserProto.UserVOOrBuilder
        public ByteString getUserNameBytes() {
            Object obj = this.userName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getUserHeadImg().hashCode() + ((((getUserName().hashCode() + ((((Internal.hashLong(getUserId()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessage
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return UserProto.internal_static_com_base_model_proto_UserVO_fieldAccessorTable.ensureFieldAccessorsInitialized(UserVO.class, Builder.class);
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
            long j = this.userId_;
            if (j != 0) {
                codedOutputStream.writeInt64(1, j);
            }
            if (!GeneratedMessage.isStringEmpty(this.userName_)) {
                GeneratedMessage.writeString(codedOutputStream, 2, this.userName_);
            }
            if (!GeneratedMessage.isStringEmpty(this.userHeadImg_)) {
                GeneratedMessage.writeString(codedOutputStream, 3, this.userHeadImg_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }
    }

    public interface UserVOOrBuilder extends MessageOrBuilder {
        String getUserHeadImg();

        ByteString getUserHeadImgBytes();

        long getUserId();

        String getUserName();

        ByteString getUserNameBytes();
    }

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 0, "", UserProto.class.getName());
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\nUser.proto\u0012\u0014com.base.model.proto\"?\n\u0006UserVO\u0012\u000e\n\u0006userId\u0018\u0001 \u0001(\u0003\u0012\u0010\n\buserName\u0018\u0002 \u0001(\t\u0012\u0013\n\u000buserHeadImg\u0018\u0003 \u0001(\t\"6\n\bUserList\u0012*\n\u0004user\u0018\u0001 \u0003(\u000b2\u001c.com.base.model.proto.UserVOB\u000bB\tUserProtob\u0006proto3"}, new Descriptors.FileDescriptor[0]);
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_base_model_proto_UserVO_descriptor = descriptor2;
        internal_static_com_base_model_proto_UserVO_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor2, new String[]{"UserId", "UserName", "UserHeadImg"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_base_model_proto_UserList_descriptor = descriptor3;
        internal_static_com_base_model_proto_UserList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(descriptor3, new String[]{"User"});
        descriptor.resolveAllFeaturesImmutable();
    }

    private UserProto() {
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
