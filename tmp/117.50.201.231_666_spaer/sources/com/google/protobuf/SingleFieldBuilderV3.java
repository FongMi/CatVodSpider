package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessage.Builder;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@Deprecated
public class SingleFieldBuilderV3<MType extends AbstractMessage, BType extends AbstractMessage.Builder, IType extends MessageOrBuilder> implements AbstractMessage.BuilderParent {
    private BType builder;
    private boolean isClean;
    private MType message;
    private AbstractMessage.BuilderParent parent;

    @Deprecated
    public SingleFieldBuilderV3(MType mtype, AbstractMessage.BuilderParent builderParent, boolean z) {
        this.message = (MType) Internal.checkNotNull(mtype);
        this.parent = builderParent;
        this.isClean = z;
    }

    @Deprecated
    private void onChanged() {
        AbstractMessage.BuilderParent builderParent;
        if (this.builder != null) {
            this.message = null;
        }
        if (!this.isClean || (builderParent = this.parent) == null) {
            return;
        }
        builderParent.markDirty();
        this.isClean = false;
    }

    @Deprecated
    public MType build() {
        this.isClean = true;
        return (MType) getMessage();
    }

    @Deprecated
    public SingleFieldBuilderV3<MType, BType, IType> clear() {
        MType mtype = this.message;
        this.message = (MType) (mtype != null ? mtype.getDefaultInstanceForType() : this.builder.getDefaultInstanceForType());
        BType btype = this.builder;
        if (btype != null) {
            btype.dispose();
            this.builder = null;
        }
        onChanged();
        this.isClean = true;
        return this;
    }

    @Deprecated
    public void dispose() {
        this.parent = null;
    }

    @Deprecated
    public BType getBuilder() {
        if (this.builder == null) {
            BType btype = (BType) this.message.newBuilderForType(this);
            this.builder = btype;
            btype.mergeFrom(this.message);
            this.builder.markClean();
        }
        return this.builder;
    }

    @Deprecated
    public MType getMessage() {
        if (this.message == null) {
            this.message = (MType) this.builder.buildPartial();
        }
        return this.message;
    }

    @Deprecated
    public IType getMessageOrBuilder() {
        BType btype = this.builder;
        return btype != null ? btype : this.message;
    }

    @Override // com.google.protobuf.AbstractMessage.BuilderParent
    @Deprecated
    public void markDirty() {
        onChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.protobuf.SingleFieldBuilderV3<MType, BType, IType> mergeFrom(MType r3) {
        /*
            r2 = this;
            BType extends com.google.protobuf.AbstractMessage$Builder r0 = r2.builder
            if (r0 != 0) goto Lf
            MType extends com.google.protobuf.AbstractMessage r0 = r2.message
            com.google.protobuf.Message r1 = r0.getDefaultInstanceForType()
            if (r0 != r1) goto Lf
            r2.message = r3
            goto L16
        Lf:
            com.google.protobuf.AbstractMessage$Builder r0 = r2.getBuilder()
            r0.mergeFrom(r3)
        L16:
            r2.onChanged()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.SingleFieldBuilderV3.mergeFrom(com.google.protobuf.AbstractMessage):com.google.protobuf.SingleFieldBuilderV3");
    }

    @Deprecated
    public SingleFieldBuilderV3<MType, BType, IType> setMessage(MType mtype) {
        this.message = (MType) Internal.checkNotNull(mtype);
        BType btype = this.builder;
        if (btype != null) {
            btype.dispose();
            this.builder = null;
        }
        onChanged();
        return this;
    }
}
