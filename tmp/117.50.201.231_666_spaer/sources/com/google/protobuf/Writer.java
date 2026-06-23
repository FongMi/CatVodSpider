package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
@CheckReturnValue
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    FieldOrder fieldOrder();

    void writeBool(int i, boolean z);

    void writeBoolList(int i, List<Boolean> list, boolean z);

    void writeBytes(int i, ByteString byteString);

    void writeBytesList(int i, List<ByteString> list);

    void writeDouble(int i, double d);

    void writeDoubleList(int i, List<Double> list, boolean z);

    @Deprecated
    void writeEndGroup(int i);

    void writeEnum(int i, int i2);

    void writeEnumList(int i, List<Integer> list, boolean z);

    void writeFixed32(int i, int i2);

    void writeFixed32List(int i, List<Integer> list, boolean z);

    void writeFixed64(int i, long j);

    void writeFixed64List(int i, List<Long> list, boolean z);

    void writeFloat(int i, float f);

    void writeFloatList(int i, List<Float> list, boolean z);

    @Deprecated
    void writeGroup(int i, Object obj);

    @Deprecated
    void writeGroup(int i, Object obj, Schema schema);

    @Deprecated
    void writeGroupList(int i, List<?> list);

    @Deprecated
    void writeGroupList(int i, List<?> list, Schema schema);

    void writeInt32(int i, int i2);

    void writeInt32List(int i, List<Integer> list, boolean z);

    void writeInt64(int i, long j);

    void writeInt64List(int i, List<Long> list, boolean z);

    <K, V> void writeMap(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map);

    void writeMessage(int i, Object obj);

    void writeMessage(int i, Object obj, Schema schema);

    void writeMessageList(int i, List<?> list);

    void writeMessageList(int i, List<?> list, Schema schema);

    void writeMessageSetItem(int i, Object obj);

    void writeSFixed32(int i, int i2);

    void writeSFixed32List(int i, List<Integer> list, boolean z);

    void writeSFixed64(int i, long j);

    void writeSFixed64List(int i, List<Long> list, boolean z);

    void writeSInt32(int i, int i2);

    void writeSInt32List(int i, List<Integer> list, boolean z);

    void writeSInt64(int i, long j);

    void writeSInt64List(int i, List<Long> list, boolean z);

    @Deprecated
    void writeStartGroup(int i);

    void writeString(int i, String str);

    void writeStringList(int i, List<String> list);

    void writeUInt32(int i, int i2);

    void writeUInt32List(int i, List<Integer> list, boolean z);

    void writeUInt64(int i, long j);

    void writeUInt64List(int i, List<Long> list, boolean z);
}
