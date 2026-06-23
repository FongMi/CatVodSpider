package np.protect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: np.protect.⁣⁣⁣⁣⁣⁠⁣⁣⁣⁣⁤⁤⁠⁤⁣⁠⁤⁤, reason: contains not printable characters */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class C0075 {

    /* JADX INFO: renamed from: ⁣⁤⁠⁠⁠⁤⁠⁤⁠⁣⁤⁤⁣⁤⁤⁤, reason: not valid java name and contains not printable characters */
    public static boolean f55 = true;

    /* JADX INFO: renamed from: ⁠⁠⁠⁣⁣⁠⁣⁤⁤⁣⁤⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m213() {
        int iM222 = C0076.m222();
        int i = 1596876;
        while (true) {
            i ^= 1596893;
            switch (i) {
                case 17:
                    i = iM222 >= 0 ? 1596938 : 1596969;
                    break;
                case 54:
                    break;
                case 983:
                    int i2 = 1597000;
                    while (true) {
                        i2 ^= 1597017;
                        switch (i2) {
                            case 17:
                                i2 = 1597031;
                                break;
                            case 62:
                                return null;
                        }
                    }
                    break;
                case 1012:
                    return "ۨ۬ۗ";
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000a. Please report as an issue. */
    /* JADX INFO: renamed from: ⁠⁠⁠⁣⁣⁤⁣⁤⁣⁠⁣⁤⁤, reason: not valid java name and contains not printable characters */
    public static String m214(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        int i4 = 0;
        while (true) {
            int i5 = 1597124;
            while (true) {
                i5 ^= 1597141;
                switch (i5) {
                    case 17:
                        i5 = i4 >= i2 ? 1597837 : 1597868;
                        break;
                    case 16216:
                        break;
                    case 16249:
                        short s = sArr[((i + 8) + i4) - 8];
                        cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
                        i4 = 0 - ((0 - i4) - 1);
                        int i6 = 1597899;
                        while (true) {
                            i6 ^= 1597916;
                            switch (i6) {
                                case 23:
                                    i6 = 1597930;
                                    break;
                                case 54:
                                    break;
                            }
                        }
                        break;
                    case 16315:
                        break;
                }
                return new String(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁠⁠⁤⁠⁣⁤⁠⁤⁠, reason: not valid java name and contains not printable characters */
    public static Object m215(Object obj, Object obj2, Object obj3, Object obj4) {
        int iM221 = m221();
        int i = 1598023;
        while (true) {
            i ^= 1598040;
            switch (i) {
                case 31:
                    i = iM221 < 0 ? 1598085 : 1598767;
                    break;
                case 62:
                    break;
                case 221:
                    int i2 = 1598798;
                    while (true) {
                        i2 ^= 1598815;
                        switch (i2) {
                            case 17:
                                i2 = 1598829;
                                break;
                            case 50:
                                return null;
                        }
                    }
                    break;
                case 1911:
                    return C0067.m178((Class) obj, (String) obj2, (String) obj3, (String[]) obj4);
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁣⁣⁣⁠⁠⁤⁣⁠⁤⁣⁠⁠⁠⁣⁣⁣, reason: not valid java name and contains not printable characters */
    public static String m216(Object obj) {
        int iM238 = C0078.m238();
        int i = 1598922;
        while (true) {
            i ^= 1598939;
            switch (i) {
                case 17:
                    i = iM238 > 0 ? 1598984 : 1599015;
                    break;
                case 50:
                    break;
                case 979:
                    int i2 = 1599046;
                    while (true) {
                        i2 ^= 1599063;
                        switch (i2) {
                            case 17:
                                i2 = 1599728;
                                break;
                            case 3751:
                                return null;
                        }
                    }
                    break;
                case 1020:
                    return ((Field) obj).getName();
            }
        }
    }

    /* JADX INFO: renamed from: ⁣⁣⁤⁤⁣⁠⁣⁣⁤⁤⁣⁠, reason: not valid java name and contains not printable characters */
    public static Throwable m217(Object obj) {
        int iM238 = C0078.m238();
        int i = 1599821;
        while (true) {
            i ^= 1599838;
            switch (i) {
                case 19:
                    i = iM238 >= 0 ? 1599883 : 1599914;
                    break;
                case 50:
                    break;
                case 213:
                    int i2 = 1599945;
                    while (true) {
                        i2 ^= 1599962;
                        switch (i2) {
                            case 19:
                                i2 = 1599976;
                                break;
                            case 50:
                                return null;
                        }
                    }
                    break;
                case 244:
                    return ((InvocationTargetException) obj).getTargetException();
            }
        }
    }

    /* JADX INFO: renamed from: ⁤⁠⁤⁤⁣⁤⁤⁣⁤⁤⁤⁣⁤⁠⁠⁤, reason: not valid java name and contains not printable characters */
    public static String m218() {
        int iM238 = C0078.m238();
        int i = 1600720;
        while (true) {
            i ^= 1600737;
            switch (i) {
                case 14:
                    break;
                case 49:
                    i = iM238 > 0 ? 1600782 : 1600813;
                    break;
                case 460:
                    return "ۡ۫ۘ";
                case 495:
                    int i2 = 1600844;
                    while (true) {
                        i2 ^= 1600861;
                        switch (i2) {
                            case 17:
                                i2 = 1600875;
                                break;
                            case 54:
                                return null;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁣⁠⁠⁣, reason: not valid java name and contains not printable characters */
    public static Class m219(Object obj) {
        int iM209 = C0067.m209();
        int i = 1600968;
        while (true) {
            i ^= 1600985;
            switch (i) {
                case 17:
                    i = iM209 >= 0 ? 1601681 : 1601712;
                    break;
                case 7496:
                    int i2 = 1601743;
                    while (true) {
                        i2 ^= 1601760;
                        switch (i2) {
                            case 14:
                                return null;
                            case 47:
                                i2 = 1601774;
                                break;
                        }
                    }
                    break;
                case 7529:
                    return ((Field) obj).getDeclaringClass();
                case 7595:
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁠⁤⁣⁠⁤⁤⁣⁤⁣⁠⁣⁤⁣, reason: not valid java name and contains not printable characters */
    public static String m220() {
        int iM209 = C0067.m209();
        int i = 1601867;
        while (true) {
            i ^= 1601884;
            switch (i) {
                case 23:
                    i = iM209 > 0 ? 1601929 : 1602611;
                    break;
                case 54:
                    break;
                case 213:
                    int i2 = 1602642;
                    while (true) {
                        i2 ^= 1602659;
                        switch (i2) {
                            case 18:
                                return null;
                            case 49:
                                i2 = 1602673;
                                break;
                        }
                    }
                    break;
                case 1391:
                    return "ۖۧۨ";
            }
        }
    }

    /* JADX INFO: renamed from: ⁤⁤⁠⁤⁤⁤⁠⁤⁠, reason: not valid java name and contains not printable characters */
    public static int m221() {
        int i = 0;
        String str = "ۙۥ۬";
        int i2 = 0;
        int i3 = 0;
        int iM202 = 0;
        while (true) {
            switch (C0067.m202((Object) str)) {
                case 1741103:
                    i3 = -1737911;
                    str = "ۧ۟ۨ";
                    break;
                case 1741120:
                    iM202 = C0067.m202((Object) "ۖۜۦ");
                    str = "ۜ۠ۡ";
                    break;
                case 1743837:
                    i3 = iM202 ^ (-1);
                    str = "ۜ۫ۥ";
                    break;
                case 1744182:
                    i2 = i3 & 1737910;
                    str = "ۙۥۛ";
                    break;
                case 1749359:
                    i3 = i | i2;
                    str = "ۢ۬ۚ";
                    break;
                case 1749968:
                    return i3;
                default:
                    i = i3 & iM202;
                    str = "ۢۘۥ";
                    break;
            }
        }
    }
}
