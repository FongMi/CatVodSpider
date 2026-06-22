package com.github.catvod.spider.merge.v;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.v.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public enum EnumC1397c {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static EnumC1397c b(d dVar) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 1) {
            return ON_CREATE;
        }
        if (iOrdinal == 2) {
            return ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return ON_RESUME;
    }

    public final d a() {
        switch (C1396b.b[ordinal()]) {
            case 1:
            case 2:
                return d.CREATED;
            case 3:
            case 4:
                return d.STARTED;
            case 5:
                return d.RESUMED;
            case 6:
                return d.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
