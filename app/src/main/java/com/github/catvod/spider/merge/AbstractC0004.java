package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ĭ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
abstract class AbstractC0004 extends AbstractC0040 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    final ArrayList<AbstractC0040> f147;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    int f148;

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ĭ$Ϳ, reason: contains not printable characters */
    static final class C0005 extends AbstractC0004 {
        C0005(Collection<AbstractC0040> collection) {
            super(collection);
        }

        public String toString() {
            return C0008.m144(this.f147, "");
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            for (int i = this.f148 - 1; i >= 0; i--) {
                if (!this.f147.get(i).mo132(c0011, c00112)) {
                    return false;
                }
            }
            return true;
        }

        C0005(AbstractC0040... abstractC0040Arr) {
            this(Arrays.asList(abstractC0040Arr));
        }
    }

    AbstractC0004() {
        this.f148 = 0;
        this.f147 = new ArrayList<>();
    }

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    void m129(AbstractC0040 abstractC0040) {
        this.f147.set(this.f148 - 1, abstractC0040);
    }

    @Nullable
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    AbstractC0040 m130() {
        int i = this.f148;
        if (i > 0) {
            return this.f147.get(i - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    void m131() {
        this.f148 = this.f147.size();
    }

    AbstractC0004(Collection<AbstractC0040> collection) {
        this();
        this.f147.addAll(collection);
        m131();
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.merge.ĭ$Ԩ, reason: contains not printable characters */
    static final class C0006 extends AbstractC0004 {
        C0006(Collection<AbstractC0040> collection) {
            if (this.f148 > 1) {
                this.f147.add(new C0005(collection));
            } else {
                this.f147.addAll(collection);
            }
            m131();
        }

        public String toString() {
            return C0008.m144(this.f147, SOY.d("5672"));
        }

        @Override // com.github.catvod.spider.merge.AbstractC0040
        /* JADX INFO: renamed from: Ϳ */
        public boolean mo132(C0011 c0011, C0011 c00112) {
            for (int i = 0; i < this.f148; i++) {
                if (this.f147.get(i).mo132(c0011, c00112)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
        public void m133(AbstractC0040 abstractC0040) {
            this.f147.add(abstractC0040);
            m131();
        }

        C0006(AbstractC0040... abstractC0040Arr) {
            this(Arrays.asList(abstractC0040Arr));
        }

        C0006() {
        }
    }
}
