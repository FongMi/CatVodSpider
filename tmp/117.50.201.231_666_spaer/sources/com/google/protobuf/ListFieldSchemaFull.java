package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@CheckReturnValue
final class ListFieldSchemaFull implements ListFieldSchema {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();
    public static final /* synthetic */ int a = 0;

    public static <E> List<E> getList(Object obj, long j) {
        return (List) UnsafeUtil.getObject(obj, j);
    }

    private static <L> List<L> mutableListAt(Object obj, long j, int i) {
        Object obj2;
        List<L> list = getList(obj, j);
        if (list.isEmpty()) {
            List<L> lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i) : new ArrayList<>(i);
            UnsafeUtil.putObject(obj, j, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            UnsafeUtil.putObject(obj, j, arrayList);
            obj2 = arrayList;
        } else {
            if (!(list instanceof UnmodifiableLazyStringList)) {
                if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                    return list;
                }
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    return list;
                }
                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i);
                UnsafeUtil.putObject(obj, j, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
            LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i);
            lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
            UnsafeUtil.putObject(obj, j, lazyStringArrayList2);
            obj2 = lazyStringArrayList2;
        }
        return (List<L>) obj2;
    }

    @Override // com.google.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) UnsafeUtil.getObject(obj, j);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        UnsafeUtil.putObject(obj, j, objUnmodifiableList);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        List list = getList(obj2, j);
        List listMutableListAt = mutableListAt(obj, j, list.size());
        int size = listMutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listMutableListAt.addAll(list);
        }
        if (size > 0) {
            list = listMutableListAt;
        }
        UnsafeUtil.putObject(obj, j, list);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j) {
        return mutableListAt(obj, j, 10);
    }
}
