package com.github.catvod.spider.merge.y;

import com.github.catvod.spider.merge.z.InterfaceC1448b;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.y.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class C1416e extends AbstractC1412a implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {
    private final Map<String, Object> j;

    public C1416e() {
        this(16, false);
    }

    public C1416e(int i, boolean z) {
        this.j = z ? new LinkedHashMap<>(i) : new HashMap<>(i);
    }

    public C1416e(Map<String, Object> map) {
        if (map == null) {
            throw new IllegalArgumentException("map is null.");
        }
        this.j = map;
    }

    public C1416e(boolean z) {
        this(16, z);
    }

    public final Object A(Class cls, com.github.catvod.spider.merge.B.o oVar) {
        return cls == Map.class ? this : (cls != Object.class || containsKey(AbstractC1412a.d)) ? com.github.catvod.spider.merge.H.A.p(this, cls, oVar) : this;
    }

    @Override // java.util.Map
    public final void clear() {
        this.j.clear();
    }

    public final Object clone() {
        return new C1416e((Map<String, Object>) (this.j instanceof LinkedHashMap ? new LinkedHashMap(this.j) : new HashMap(this.j)));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey = this.j.containsKey(obj);
        return !zContainsKey ? ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? this.j.containsKey(obj.toString()) : zContainsKey : zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.j.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.j.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        Map<String, Object> map;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1416e) {
            map = this.j;
            obj = ((C1416e) obj).j;
        } else {
            map = this.j;
        }
        return map.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.j.get(obj);
        return obj2 == null ? ((obj instanceof Number) || (obj instanceof Character) || (obj instanceof Boolean) || (obj instanceof UUID)) ? this.j.get(obj.toString()) : obj2 : obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String strSubstring;
        StringBuilder sb;
        Class<?>[] parameterTypes = method.getParameterTypes();
        String string = null;
        if (parameterTypes.length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() != Void.TYPE) {
                throw new C1415d("illegal setter");
            }
            InterfaceC1448b interfaceC1448b = (InterfaceC1448b) com.github.catvod.spider.merge.H.A.F(method, InterfaceC1448b.class);
            String strName = (interfaceC1448b == null || interfaceC1448b.name().length() == 0) ? null : interfaceC1448b.name();
            if (strName == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new C1415d("illegal setter");
                }
                String strSubstring2 = name.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new C1415d("illegal setter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            }
            this.j.put(strName, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == Void.TYPE) {
            throw new C1415d("illegal getter");
        }
        InterfaceC1448b interfaceC1448b2 = (InterfaceC1448b) com.github.catvod.spider.merge.H.A.F(method, InterfaceC1448b.class);
        if (interfaceC1448b2 != null && interfaceC1448b2.name().length() != 0) {
            string = interfaceC1448b2.name();
        }
        if (string == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                strSubstring = name2.substring(3);
                if (strSubstring.length() == 0) {
                    throw new C1415d("illegal getter");
                }
                sb = new StringBuilder();
            } else {
                if (!name2.startsWith("is")) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name2.startsWith("toString")) {
                        return a();
                    }
                    throw new C1415d("illegal getter");
                }
                strSubstring = name2.substring(2);
                if (strSubstring.length() == 0) {
                    throw new C1415d("illegal getter");
                }
                sb = new StringBuilder();
            }
            sb.append(Character.toLowerCase(strSubstring.charAt(0)));
            sb.append(strSubstring.substring(1));
            string = sb.toString();
        }
        return com.github.catvod.spider.merge.H.A.f(this.j.get(string), method.getGenericReturnType(), com.github.catvod.spider.merge.B.o.v);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.j.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.j.keySet();
    }

    public final C1416e n(String str, Object obj) {
        this.j.put(str, obj);
        return this;
    }

    public final boolean o(String str) {
        Boolean boolI = com.github.catvod.spider.merge.H.A.i(get(str));
        if (boolI == null) {
            return false;
        }
        return boolI.booleanValue();
    }

    public final Map<String, Object> p() {
        return this.j;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        this.j.putAll(map);
    }

    public final int q(String str) {
        Integer numO = com.github.catvod.spider.merge.H.A.o(get(str));
        if (numO == null) {
            return 0;
        }
        return numO.intValue();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.j.remove(obj);
    }

    public final Integer s(String str) {
        return com.github.catvod.spider.merge.H.A.o(get(str));
    }

    @Override // java.util.Map
    public final int size() {
        return this.j.size();
    }

    public final C1413b t(String str) {
        Object obj = this.j.get(str);
        if (obj instanceof C1413b) {
            return (C1413b) obj;
        }
        if (obj instanceof List) {
            return new C1413b((List<Object>) obj);
        }
        return (C1413b) (obj instanceof String ? AbstractC1412a.d((String) obj) : AbstractC1412a.j(obj));
    }

    public final C1416e u(String str) {
        Object obj = this.j.get(str);
        return obj instanceof C1416e ? (C1416e) obj : obj instanceof Map ? new C1416e((Map<String, Object>) obj) : obj instanceof String ? AbstractC1412a.g((String) obj) : (C1416e) AbstractC1412a.j(obj);
    }

    public final Long v(String str) {
        return com.github.catvod.spider.merge.H.A.q(get(str));
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.j.values();
    }

    public final long w(String str) {
        Long lQ = com.github.catvod.spider.merge.H.A.q(get(str));
        if (lQ == null) {
            return 0L;
        }
        return lQ.longValue();
    }

    public final String x(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final Object put(String str, Object obj) {
        return this.j.put(str, obj);
    }
}
