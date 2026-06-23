package com.google.protobuf;

import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@CheckReturnValue
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j);

    <L> void mergeListsAt(Object obj, Object obj2, long j);

    <L> List<L> mutableListAt(Object obj, long j);
}
