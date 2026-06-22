package com.github.catvod.spider.merge;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.ޞ, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public class C0316 implements InterfaceC0401 {

    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    protected InterfaceC0400 f830;

    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    protected List<InterfaceC0398> f831 = new ArrayList(100);

    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    protected int f832 = -1;

    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    protected boolean f833;

    public C0316(InterfaceC0400 interfaceC0400) {
        if (interfaceC0400 == null) {
            throw new NullPointerException(SOY.d("0E3D3A131A2415272315115719333F181B035A3034561A02163E"));
        }
        this.f830 = interfaceC0400;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0401
    public InterfaceC0398 get(int i) {
        if (i >= 0 && i < this.f831.size()) {
            return this.f831.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(SOY.d("0E3D3A131A57133C35130C57"));
        sb.append(i);
        sb.append(SOY.d("5A3D240254181C7223171A101F7261585A"));
        sb.append(this.f831.size() - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    public int size() {
        return this.f831.size();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: Ϳ, reason: contains not printable characters */
    public int mo1209() {
        return 0;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0401
    /* JADX INFO: renamed from: Ԩ, reason: contains not printable characters */
    public String mo1210(InterfaceC0398 interfaceC0398, InterfaceC0398 interfaceC03982) {
        return (interfaceC0398 == null || interfaceC03982 == null) ? "" : m1216(C0125.m418(interfaceC0398.mo1255(), interfaceC03982.mo1255()));
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ԩ, reason: contains not printable characters */
    public void mo1211(int i) {
        m1222();
        this.f832 = mo1219(i);
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0401
    /* JADX INFO: renamed from: Ԫ, reason: contains not printable characters */
    public InterfaceC0400 mo1212() {
        return this.f830;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0401
    /* JADX INFO: renamed from: ԫ, reason: contains not printable characters */
    public InterfaceC0398 mo1213(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: Ԭ, reason: contains not printable characters */
    public int mo1214(int i) {
        return mo1213(i).getType();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ԭ, reason: contains not printable characters */
    public int mo1215() {
        return this.f832;
    }

    /* JADX INFO: renamed from: Ԯ, reason: contains not printable characters */
    public String m1216(C0125 c0125) {
        int i = c0125.f317;
        int size = c0125.f318;
        if (i < 0 || size < 0) {
            return "";
        }
        m1221();
        if (size >= this.f831.size()) {
            size = this.f831.size() - 1;
        }
        StringBuilder sb = new StringBuilder();
        while (i <= size) {
            InterfaceC0398 interfaceC0398 = this.f831.get(i);
            if (interfaceC0398.getType() == -1) {
                break;
            }
            sb.append(interfaceC0398.mo1252());
            i++;
        }
        return sb.toString();
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ԯ, reason: contains not printable characters */
    public void mo1217() {
        int i = this.f832;
        boolean z = false;
        if (i >= 0 && (!this.f833 ? i < this.f831.size() : i < this.f831.size() - 1)) {
            z = true;
        }
        if (!z && mo1214(1) == -1) {
            throw new IllegalStateException(SOY.d("19333F181B035A313E180702173771333B31"));
        }
        if (m1226(this.f832 + 1)) {
            this.f832 = mo1219(this.f832 + 1);
        }
    }

    @Override // com.github.catvod.spider.merge.InterfaceC0385
    /* JADX INFO: renamed from: ֏, reason: contains not printable characters */
    public void mo1218(int i) {
    }

    /* JADX INFO: renamed from: ؠ, reason: contains not printable characters */
    protected int mo1219(int i) {
        throw null;
    }

    /* JADX INFO: renamed from: ހ, reason: contains not printable characters */
    protected int m1220(int i) {
        if (this.f833) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0398 interfaceC0398Mo1469 = this.f830.mo1469();
            if (interfaceC0398Mo1469 instanceof InterfaceC0404) {
                ((InterfaceC0404) interfaceC0398Mo1469).mo1256(this.f831.size());
            }
            this.f831.add(interfaceC0398Mo1469);
            if (interfaceC0398Mo1469.getType() == -1) {
                this.f833 = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ށ, reason: contains not printable characters */
    public void m1221() {
        m1222();
        while (m1220(1000) >= 1000) {
        }
    }

    /* JADX INFO: renamed from: ނ, reason: contains not printable characters */
    protected final void m1222() {
        if (this.f832 == -1) {
            m1225();
        }
    }

    /* JADX INFO: renamed from: ރ, reason: contains not printable characters */
    protected int m1223(int i, int i2) {
        m1226(i);
        if (i >= size()) {
            return size() - 1;
        }
        InterfaceC0398 interfaceC0398 = this.f831.get(i);
        while (true) {
            InterfaceC0398 interfaceC03982 = interfaceC0398;
            if (interfaceC03982.getChannel() == i2 || interfaceC03982.getType() == -1) {
                return i;
            }
            i++;
            m1226(i);
            interfaceC0398 = this.f831.get(i);
        }
    }

    /* JADX INFO: renamed from: ބ, reason: contains not printable characters */
    protected int m1224(int i, int i2) {
        m1226(i);
        if (i >= size()) {
            return size() - 1;
        }
        while (i >= 0) {
            InterfaceC0398 interfaceC0398 = this.f831.get(i);
            if (interfaceC0398.getType() == -1 || interfaceC0398.getChannel() == i2) {
                break;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: ޅ, reason: contains not printable characters */
    protected void m1225() {
        m1226(0);
        this.f832 = mo1219(0);
    }

    /* JADX INFO: renamed from: ކ, reason: contains not printable characters */
    protected boolean m1226(int i) {
        int size = (i - this.f831.size()) + 1;
        return size <= 0 || m1220(size) >= size;
    }
}
