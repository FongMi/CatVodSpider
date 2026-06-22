package com.github.catvod.spider.merge.D;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public enum i0 {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    WriteEnumUsingName,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    /* JADX INFO: Fake field, exist only in values array */
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    BrowserCompatible,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    /* JADX INFO: Fake field, exist only in values array */
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue,
    BrowserSecure,
    IgnoreNonFieldGetter,
    WriteNonStringValueAsString,
    IgnoreErrorGetter,
    WriteBigDecimalAsPlain,
    MapSortField;

    public static final i0[] E;
    public static final int F;
    public final int b = 1 << ordinal();

    static {
        i0 i0Var = WriteMapNullValue;
        i0 i0Var2 = WriteNullListAsEmpty;
        i0 i0Var3 = WriteNullStringAsEmpty;
        i0 i0Var4 = WriteNullNumberAsZero;
        i0 i0Var5 = WriteNullBooleanAsFalse;
        E = new i0[0];
        F = i0Var.b | i0Var5.b | i0Var2.b | i0Var4.b | i0Var3.b;
    }

    i0() {
    }

    public static boolean a(int i, int i2, i0 i0Var) {
        int i3 = i0Var.b;
        return ((i & i3) == 0 && (i2 & i3) == 0) ? false : true;
    }

    public static boolean b(int i, i0 i0Var) {
        return (i & i0Var.b) != 0;
    }

    public static int c(i0[] i0VarArr) {
        if (i0VarArr == null) {
            return 0;
        }
        int i = 0;
        for (i0 i0Var : i0VarArr) {
            i |= i0Var.b;
        }
        return i;
    }
}
