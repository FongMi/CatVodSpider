package com.github.catvod.spider;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderApi;
import com.github.catvod.spider.merge.C0.b.n;
import com.github.catvod.spider.merge.C0.j.j;
import com.github.catvod.spider.merge.C0.j.k;
import com.github.catvod.spider.merge.C0.j.m;
import com.github.catvod.spider.merge.C0.k.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public class XBPQ extends Spider {
    public static String K = "";
    private static HashMap<String, String> L;
    private Context C;
    private XBPQPlay D;
    private String G;
    private String b;
    private int e;
    private String o;
    private boolean a = false;
    private String c = "";
    private boolean d = false;
    private String f = "";
    private String g = null;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private List<String> k = null;
    private JSONObject l = null;
    private boolean m = false;
    private String n = "";
    private int p = 0;
    private boolean q = false;
    private String r = "";
    private String s = "";
    private boolean t = false;
    private int u = 0;
    private int v = 3;
    private String w = "";
    private String x = "";
    private boolean y = false;
    private String z = "";
    private String A = "";
    protected JSONObject B = null;
    private boolean E = true;
    private HashMap<String, String> F = null;
    private int H = 0;
    private SpiderApi I = null;
    private String J = "9978";

    /* JADX WARN: Can't wrap try/catch for region: R(16:(3:1209|437|(8:1050|439|1056|440|(3:1060|442|443)(1:1025)|1064|444|(5:1183|446|1066|447|(5:1068|449|1072|450|(26:1197|452|1076|453|(3:1078|455|456)|457|1112|458|1116|459|(3:1118|461|462)(1:1027)|1157|463|(3:1201|465|466)(1:744)|467|(1:469)(1:745)|470|471|(1:475)(1:746)|476|1161|477|(2:748|(18:1199|750|751|(2:753|(1:757))|758|1120|759|(3:1227|761|(3:1124|763|(2:1195|765)))|1163|766|767|(3:1179|769|(13:771|1181|772|1185|773|1189|774|1191|775|1193|776|1040|777)(1:813))(2:1092|817)|778|(2:780|(1:782))|(12:1114|784|1169|785|1171|786|1173|787|1175|788|1177|789)|1165|790|(5:1126|792|1131|793|(1:(5:1133|796|1167|797|(1:1276)))(1:1275))(0))(16:751|(0)|758|1120|759|(0)|1163|766|767|(0)(0)|778|(0)|(0)|1165|790|(0)(0)))|479|435|1278)(17:1076|453|(0)(0)|457|1112|458|1116|459|(0)(0)|1157|463|(0)(0)|467|(0)(0)|470|471|(9:473|475|476|1161|477|(0)|479|435|1278)(0)))(3:1072|450|(0)(0)))(3:1066|447|(0)(0)))(6:1056|440|(0)(0)|1064|444|(0)(0)))(1:486)|487|457|1112|458|1116|459|(0)(0)|1157|463|(0)(0)|467|(0)(0)|470|471|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0b65, code lost:
    
        if (r13.indexOf(r40) < 0) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x186a, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x186d, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x189a, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x1937  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x1943  */
    /* JADX WARN: Removed duplicated region for block: B:1027:0x194b  */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x194e  */
    /* JADX WARN: Removed duplicated region for block: B:1029:0x1952  */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x0f9b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1034:0x0a5d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1060:0x0d8c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1066:0x0da6 A[EXC_TOP_SPLITTER, PHI: r9
      0x0da6: PHI (r9v18 java.lang.String) = (r9v8 java.lang.String), (r9v17 java.lang.String) binds: [B:445:0x0d9a, B:446:0x0d9c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x0dac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x0db6 A[EXC_TOP_SPLITTER, PHI: r20
      0x0db6: PHI (r20v10 java.lang.String) = (r20v2 java.lang.String), (r20v12 java.lang.String) binds: [B:448:0x0daa, B:449:0x0dac] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1076:0x0dc6 A[EXC_TOP_SPLITTER, PHI: r6
      0x0dc6: PHI (r6v57 java.lang.String) = (r6v42 java.lang.String), (r6v55 java.lang.String) binds: [B:451:0x0dba, B:452:0x0dbc] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1078:0x0dcc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1086:0x1178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x1054 A[EXC_TOP_SPLITTER, PHI: r27
      0x1054: PHI (r27v19 java.lang.String) = 
      (r27v17 java.lang.String)
      (r27v17 java.lang.String)
      (r27v17 java.lang.String)
      (r27v17 java.lang.String)
      (r27v18 java.lang.String)
     binds: [B:530:0x1025, B:533:0x1034, B:535:0x103e, B:537:0x1048, B:538:0x104a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1092:0x1731 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1098:0x10d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1104:0x128d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1114:0x164a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1118:0x0df8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1126:0x167f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1128:0x11a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1145:0x1008 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1147:0x1221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x108c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1151:0x10f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1153:0x1245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1159:0x1269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1179:0x15c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1183:0x0d9c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1187:0x11da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1197:0x0dbc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1201:0x0e17 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1227:0x158e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1233:0x11a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1245:0x12b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1249:0x105a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1257:0x1027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1263:0x0fbc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1274:0x169f A[EDGE_INSN: B:1274:0x169f->B:802:0x169f BREAK  A[LOOP:2: B:332:0x0a57->B:377:0x0b69], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x073b A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09cb A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x09da A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x09f8 A[Catch: Exception -> 0x03a5, TRY_ENTER, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0aef A[Catch: all -> 0x192b, TRY_ENTER, TryCatch #8 {all -> 0x192b, blocks: (B:348:0x0a9d, B:354:0x0af9, B:360:0x0b17, B:359:0x0b0d, B:353:0x0aef), top: B:1048:0x0a9d }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0c96 A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0c9f A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0d2d A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0d52 A[Catch: Exception -> 0x03a5, TRY_LEAVE, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0d76  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0e54 A[Catch: all -> 0x18d0, TRY_ENTER, TRY_LEAVE, TryCatch #85 {all -> 0x18d0, blocks: (B:465:0x0e17, B:469:0x0e54, B:473:0x0e80, B:746:0x1519), top: B:1201:0x0e17 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0e80 A[Catch: all -> 0x18d0, TRY_ENTER, TRY_LEAVE, TryCatch #85 {all -> 0x18d0, blocks: (B:465:0x0e17, B:469:0x0e54, B:473:0x0e80, B:746:0x1519), top: B:1201:0x0e17 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0e8a A[Catch: all -> 0x189a, TRY_ENTER, TryCatch #63 {all -> 0x189a, blocks: (B:463:0x0e01, B:467:0x0e3e, B:470:0x0e79, B:476:0x0e9b, B:475:0x0e8a), top: B:1157:0x0e01 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f A[Catch: Exception -> 0x03a5, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0fd0 A[Catch: all -> 0x188b, PHI: r30
      0x0fd0: PHI (r30v18 java.lang.String) = (r30v16 java.lang.String), (r30v16 java.lang.String), (r30v16 java.lang.String), (r30v17 java.lang.String) binds: [B:513:0x0fba, B:515:0x0fc0, B:517:0x0fcc, B:518:0x0fce] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #55 {all -> 0x188b, blocks: (B:512:0x0fb4, B:519:0x0fd0), top: B:1141:0x0fb4 }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x11d8  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x123f A[Catch: all -> 0x18ea, PHI: r9
      0x123f: PHI (r9v31 java.lang.String) = (r9v8 java.lang.String), (r9v30 java.lang.String) binds: [B:622:0x121f, B:625:0x122d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #95 {all -> 0x18ea, blocks: (B:616:0x11f9, B:620:0x1209, B:621:0x121b, B:625:0x122d, B:626:0x123f, B:630:0x1251, B:631:0x1263, B:635:0x1275, B:636:0x1287, B:640:0x1297), top: B:1221:0x11f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:636:0x1287 A[Catch: all -> 0x18ea, PHI: r6
      0x1287: PHI (r6v85 java.lang.String) = (r6v42 java.lang.String), (r6v83 java.lang.String) binds: [B:632:0x1267, B:635:0x1275] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #95 {all -> 0x18ea, blocks: (B:616:0x11f9, B:620:0x1209, B:621:0x121b, B:625:0x122d, B:626:0x123f, B:630:0x1251, B:631:0x1263, B:635:0x1275, B:636:0x1287, B:640:0x1297), top: B:1221:0x11f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:693:0x13f9 A[Catch: all -> 0x18e2, TryCatch #92 {all -> 0x18e2, blocks: (B:667:0x136d, B:669:0x1385, B:671:0x138d, B:673:0x1397, B:675:0x13a1, B:677:0x13ab, B:679:0x13b5, B:681:0x13bf, B:683:0x13c9, B:685:0x13d3, B:687:0x13dd, B:689:0x13e7, B:691:0x13f1, B:693:0x13f9, B:694:0x1404, B:696:0x140c), top: B:1215:0x136d }] */
    /* JADX WARN: Removed duplicated region for block: B:696:0x140c A[Catch: all -> 0x18e2, TRY_LEAVE, TryCatch #92 {all -> 0x18e2, blocks: (B:667:0x136d, B:669:0x1385, B:671:0x138d, B:673:0x1397, B:675:0x13a1, B:677:0x13ab, B:679:0x13b5, B:681:0x13bf, B:683:0x13c9, B:685:0x13d3, B:687:0x13dd, B:689:0x13e7, B:691:0x13f1, B:693:0x13f9, B:694:0x1404, B:696:0x140c), top: B:1215:0x136d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x14c7  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x150b  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x1511  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x1515  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x1531 A[Catch: all -> 0x189d, TRY_ENTER, TRY_LEAVE, TryCatch #65 {all -> 0x189d, blocks: (B:477:0x0ea5, B:748:0x1531, B:751:0x1555, B:758:0x1582, B:767:0x15bd), top: B:1161:0x0ea5 }] */
    /* JADX WARN: Removed duplicated region for block: B:753:0x1561 A[Catch: all -> 0x18cd, TRY_ENTER, TryCatch #84 {all -> 0x18cd, blocks: (B:750:0x153f, B:753:0x1561, B:755:0x1571, B:757:0x1579), top: B:1199:0x153f }] */
    /* JADX WARN: Removed duplicated region for block: B:780:0x1631 A[Catch: all -> 0x1728, TRY_ENTER, TryCatch #4 {all -> 0x1728, blocks: (B:777:0x160a, B:780:0x1631, B:782:0x1641, B:813:0x16fc), top: B:1040:0x160a }] */
    /* JADX WARN: Removed duplicated region for block: B:795:0x1689  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0299 A[Catch: Exception -> 0x03a5, TRY_ENTER, TryCatch #49 {Exception -> 0x03a5, blocks: (B:32:0x00d4, B:34:0x00f0, B:36:0x00fa, B:38:0x0118, B:40:0x0124, B:42:0x014c, B:44:0x0152, B:45:0x0168, B:48:0x0178, B:115:0x0387, B:117:0x038d, B:118:0x039c, B:128:0x03dd, B:50:0x017f, B:52:0x0187, B:54:0x0193, B:56:0x019f, B:129:0x0404, B:131:0x040a, B:133:0x0416, B:134:0x0438, B:137:0x0458, B:139:0x0462, B:143:0x046d, B:145:0x048b, B:146:0x0493, B:150:0x04be, B:152:0x04da, B:154:0x04f4, B:156:0x0525, B:158:0x0536, B:160:0x0542, B:162:0x059c, B:164:0x05a2, B:165:0x05b6, B:167:0x05bc, B:168:0x05d0, B:170:0x05d6, B:171:0x05ea, B:173:0x05f0, B:174:0x0604, B:176:0x060a, B:177:0x0620, B:179:0x0626, B:181:0x063e, B:183:0x0645, B:185:0x064b, B:187:0x0657, B:195:0x067f, B:197:0x068d, B:198:0x0697, B:200:0x06a2, B:202:0x06a8, B:203:0x0702, B:205:0x0720, B:207:0x0730, B:209:0x073b, B:211:0x0741, B:212:0x0748, B:214:0x074e, B:215:0x0755, B:217:0x075b, B:218:0x0764, B:220:0x076a, B:221:0x0773, B:223:0x0779, B:224:0x0780, B:226:0x0786, B:227:0x078d, B:229:0x079a, B:232:0x07a5, B:234:0x07ab, B:236:0x07b1, B:238:0x07b7, B:239:0x07c0, B:240:0x07ff, B:242:0x0806, B:387:0x0bfa, B:389:0x0c00, B:391:0x0c07, B:829:0x1785, B:831:0x178b, B:832:0x17a3, B:833:0x17ad, B:835:0x17b8, B:837:0x17c2, B:839:0x17ce, B:840:0x17ee, B:841:0x17f5, B:842:0x1818, B:245:0x0812, B:247:0x0820, B:249:0x0848, B:251:0x0876, B:253:0x0880, B:257:0x0889, B:260:0x089b, B:263:0x08ad, B:266:0x08bf, B:270:0x08d3, B:272:0x08df, B:275:0x08e8, B:277:0x08f3, B:281:0x091f, B:285:0x093c, B:290:0x094d, B:292:0x0955, B:295:0x0963, B:298:0x096f, B:300:0x0979, B:302:0x0980, B:304:0x0988, B:306:0x0990, B:310:0x09a7, B:314:0x09b4, B:316:0x09ba, B:317:0x09c1, B:319:0x09cb, B:320:0x09ce, B:322:0x09da, B:323:0x09ec, B:326:0x09f8, B:328:0x0a33, B:330:0x0a39, B:420:0x0caf, B:422:0x0cb5, B:423:0x0cd0, B:429:0x0d27, B:431:0x0d2d, B:432:0x0d4c, B:434:0x0d52, B:802:0x169f, B:804:0x16a5, B:806:0x16ab, B:808:0x16b1, B:809:0x16ba, B:418:0x0c9f, B:417:0x0c96, B:308:0x0997, B:401:0x0c47, B:403:0x0c51, B:405:0x0c5b, B:407:0x0c62, B:409:0x0c6a, B:411:0x0c72, B:415:0x0c89, B:413:0x0c79, B:398:0x0c27, B:378:0x0b6f, B:380:0x0b91, B:381:0x0ba1, B:189:0x0661, B:192:0x066e, B:95:0x0299, B:97:0x02a3, B:103:0x02c8, B:105:0x02d2, B:107:0x02ed, B:109:0x0300, B:110:0x033c, B:112:0x034e, B:114:0x0360, B:99:0x02ad, B:101:0x02bb), top: B:1130:0x00d4 }] */
    /* JADX WARN: Type inference failed for: r4v107, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v115, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v583, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v142, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v74, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v104, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject A(java.lang.String r68, java.lang.String r69, boolean r70, java.util.HashMap<java.lang.String, java.lang.String> r71) {
        /*
            Method dump skipped, instruction units count: 6493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.A(java.lang.String, java.lang.String, boolean, java.util.HashMap):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject B(java.lang.String r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.B(java.lang.String, boolean):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x016f A[PHI: r3
      0x016f: PHI (r3v1 org.json.JSONObject) = (r3v0 org.json.JSONObject), (r3v0 org.json.JSONObject), (r3v9 org.json.JSONObject) binds: [B:4:0x0011, B:6:0x0019, B:8:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject D(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.D(java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    private String E(String str) {
        return F(str, "");
    }

    private String F(String str, String str2) {
        String strOptString;
        JSONObject jSONObject;
        String str3;
        String strOptString2 = this.B.optString(str);
        if (str.equals("主页url") && strOptString2.isEmpty()) {
            strOptString2 = this.B.optString("首页推荐链接");
            if (strOptString2.isEmpty()) {
                strOptString2 = this.B.optString("网站地址");
                if (strOptString2.isEmpty()) {
                    strOptString2 = this.B.optString("url");
                    if (strOptString2.isEmpty()) {
                        strOptString2 = this.B.optString("homeUrl");
                        if (strOptString2.isEmpty()) {
                            String strOptString3 = this.B.optString("分类url");
                            if (strOptString3.isEmpty()) {
                                strOptString3 = this.B.optString("分类链接");
                                if (strOptString3.isEmpty() || !strOptString3.startsWith("http")) {
                                    strOptString3 = this.B.optString("分类页");
                                    if (strOptString3.isEmpty()) {
                                        strOptString3 = this.B.optString("class_url");
                                        if (strOptString3.isEmpty()) {
                                            strOptString3 = this.B.optString("cateUrl");
                                            if (strOptString3.isEmpty()) {
                                                strOptString3 = this.B.optString("搜索url");
                                                if (!strOptString3.startsWith("http")) {
                                                    strOptString3 = "";
                                                }
                                                if (strOptString3.isEmpty()) {
                                                    strOptString3 = this.B.optString("搜索链接");
                                                    if (!strOptString3.startsWith("http")) {
                                                        strOptString3 = "";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            strOptString2 = strOptString3.replaceAll(strOptString3.indexOf("/webparse/") > 0 ? ".*/webparse/(https?\\://[^/]+)/.*" : ".*(https?\\://[^/]+)/.*", "$1");
                        }
                    }
                }
            }
        }
        if (str.equals("分类")) {
            if (strOptString2.isEmpty()) {
                strOptString = this.B.optString("分类名称");
                if (strOptString.isEmpty()) {
                    strOptString = this.B.optString("class_name");
                    if (strOptString.isEmpty()) {
                        strOptString2 = strOptString;
                    } else {
                        jSONObject = this.B;
                        str3 = "class_value";
                    }
                } else {
                    jSONObject = this.B;
                    str3 = "分类名称替换词";
                }
                strOptString2 = T(strOptString, jSONObject.optString(str3));
            } else if (strOptString2.indexOf("&") >= 0) {
                jSONObject = this.B;
                str3 = "分类值";
                strOptString = strOptString2;
                strOptString2 = T(strOptString, jSONObject.optString(str3));
            }
        }
        if (strOptString2.isEmpty() || strOptString2.equals("空")) {
            return (str.equals("搜索后缀") && strOptString2.equals("空")) ? "" : str2;
        }
        if (str.equals("剧情") || str.equals("地区") || str.equals("类型") || str.equals("年份") || str.equals("排序") || strOptString2.indexOf("||") < 0 || strOptString2.indexOf("--") < 0) {
            return strOptString2;
        }
        String[] strArrSplit = strOptString2.split("\\|\\|");
        for (String str4 : strArrSplit) {
            if (str4.indexOf(this.r) >= 0) {
                return str4.split("--")[1];
            }
        }
        if (strOptString2.indexOf("||") < 0) {
            return "";
        }
        String[] strArrSplit2 = strArrSplit[0].split("--");
        return strArrSplit2.length > 1 ? strArrSplit2[1] : strArrSplit2[0];
    }

    private String G(String str, String str2, String str3) {
        return F(str, F(str2, str3));
    }

    private String H(String str, String str2, String str3, String str4) {
        return F(str, F(str2, F(str3, str4)));
    }

    private String I(String str, String str2, String str3, String str4, String str5) {
        return F(str, F(str2, F(str3, F(str4, str5))));
    }

    private String J(String str, String str2, String str3, String str4, String str5, String str6) {
        return F(str, F(str2, F(str3, F(str4, F(str5, str6)))));
    }

    private String K(String str, String str2, String str3, String str4, String str5, String str6) {
        return F(str, F(str2, F(str3, F(str4, F(str5, F(str6, ""))))));
    }

    private String N(String str) {
        Charset charset;
        String strTrim = str.replace("://", "双斜杠").replace("//", "/").replace("双斜杠", "://").trim();
        if (strTrim.indexOf("时间戳") >= 0) {
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("");
            sbB.append(new Date().getTime());
            strTrim = strTrim.replace("时间戳", sbB.toString());
        }
        if (strTrim.indexOf(":9978/") > 0 && !"9978".equals(this.J)) {
            strTrim = strTrim.replace("9978", this.J);
        }
        if (strTrim.indexOf("md5(") > 0) {
            String strReplaceAll = strTrim.replaceAll("md5\\((.*?)\\)", "$1");
            if (strReplaceAll.indexOf(",iso") > 0) {
                strReplaceAll = strReplaceAll.split(",")[0];
                charset = m.c;
            } else {
                charset = m.b;
            }
            strTrim = strTrim.replaceAll("md5\\(.*?\\)", m.a(strReplaceAll, charset));
        }
        if (strTrim.indexOf("+url:") <= 0) {
            return strTrim;
        }
        String[] strArrSplit = strTrim.split("\\+url\\:");
        if (strArrSplit.length <= 1) {
            return strArrSplit[0];
        }
        if (strTrim.indexOf("$sub:") <= 0) {
            return strArrSplit[0] + k(strArrSplit[1]);
        }
        String[] strArrSplit2 = strArrSplit[1].split("\\$sub\\:");
        if (strArrSplit2.length > 1) {
            return strArrSplit[0] + e0(k(strArrSplit2[0]), strArrSplit2[1], "").get(0).trim();
        }
        return strArrSplit[0] + k(strArrSplit2[0]);
    }

    private void O() {
        String str;
        String strReplaceAll;
        boolean z = false;
        try {
            String strReplaceAll2 = (E("主页url") + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1");
            this.f = strReplaceAll2;
            this.G = strReplaceAll2;
            this.G = strReplaceAll2.split("://")[1].split("/")[0].replace(".", "_");
            String strJ = J("分类url", "分类链接", "分类页", "class_url", "cateUrl", "");
            this.b = strJ;
            if (strJ.indexOf(";;") >= 0) {
                if (this.b.split(";;").length > 1) {
                    this.s = this.b.split(";;")[1];
                }
                this.b = this.b.split(";;")[0];
            } else if (G("搜索url", "搜索链接", "").indexOf(";;") < 0) {
                this.s = "";
            } else if (G("搜索url", "搜索链接", "").split(";;").length > 1) {
                this.s = G("搜索url", "搜索链接", "").split(";;")[1];
            }
            if (E("域名跳转").indexOf("&&") > 0 || this.s.indexOf("域") >= 0) {
                String strG = G("发布页", "域名发布页", "");
                if (!strG.startsWith("http")) {
                    strG = this.f;
                }
                String strK = k(strG);
                if (E("域名跳转").indexOf("&&") > 0) {
                    strReplaceAll = a0(strK, E("域名跳转"), "").get(0).trim();
                } else {
                    ArrayList<String> arrayListA0 = a0(strK, "<a*href=\"&&\"[包含:http]", "");
                    ArrayList<String> arrayListA02 = arrayListA0.size() < 1 ? a0(strK, "<a*href='&&'[包含:http]", "") : arrayListA0;
                    int i = (this.s.matches(".*域\\d.*") ? this.s.replaceAll(".*域(\\d).*", "$1") : "").matches("\\d") ? Integer.parseInt(r1) - 1 : 0;
                    if (i <= 0 || arrayListA02.size() <= i) {
                        if (arrayListA02.size() > 0) {
                            str = arrayListA02.get(0);
                        }
                        strReplaceAll = (strK + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1");
                    } else {
                        str = arrayListA02.get(i);
                    }
                    strK = str.trim();
                    strReplaceAll = (strK + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1");
                }
                if (strReplaceAll != null && strReplaceAll.startsWith("http")) {
                    String str2 = this.f;
                    this.g = str2;
                    this.f = strReplaceAll;
                    this.b = this.b.replace(str2, strReplaceAll);
                }
            }
            try {
                if (this.s.indexOf("阿里") >= 0) {
                    this.B.put("跳转链接", "https://www.aliyundrive.com/s/+aliyundrive.com/s/&&\"");
                }
            } catch (JSONException e) {
            }
            this.h = H("图片代理", "图片是否需要代理", "PicNeedProxy", "0").equals("1") || H("图片代理", "图片是否需要代理", "PicNeedProxy", "0").equals("是") || this.s.indexOf("t") >= 0;
            String strG2 = this.s.indexOf("T") >= 0 ? "1" : G("调试", "debug", "");
            this.o = strG2;
            this.m = strG2.length() > 0 && !"0".equals(this.o);
            if (this.o.indexOf("$") >= 0) {
                this.p = Integer.parseInt(this.o.split("\\$")[1]);
                this.o = this.o.split("\\$")[0];
            }
            if (I("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("1") || I("倒序", "倒序播放", "是否反转选集序列", "epi_reverse", "0").equals("是") || (this.s.indexOf("d0") < 0 && this.s.indexOf("d") >= 0)) {
                z = true;
            }
            this.y = z;
            if (this.s.indexOf("o") >= 0) {
                String strReplaceAll3 = this.s.replaceAll(".*o(\\d+).*", "$1");
                if (strReplaceAll3.length() > 0) {
                    this.v = Integer.parseInt(strReplaceAll3);
                }
            }
        } catch (Exception e2) {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e2, com.github.catvod.spider.merge.C0.d.d.b("初始化全局变量错误！-->"), spiderApi);
            }
        }
    }

    private String P(String str) {
        return str.indexOf("转义井号") >= 0 ? str.replace("转义井号", "#") : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String Q(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.Q(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private String R(String str, String str2) {
        StringBuilder sb;
        String string;
        StringBuilder sb2;
        String string2;
        if (str2.length() < 1 || this.u >= this.v) {
            return str2;
        }
        if (str2.indexOf("检测中") >= 0 && str2.indexOf("跳转中") >= 0 && str2.indexOf("btwaf") >= 0) {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                spiderApi.log("过宝塔盾--> " + str2);
            }
            String str3 = a0(str2, "btwaf=&&\"", "").get(0);
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b(str);
            sbB.append(str.indexOf("?") >= 0 ? "&" : "?");
            sbB.append("btwaf=");
            sbB.append(str3);
            String string3 = sbB.toString();
            this.u++;
            String strK = k(string3);
            this.t = true;
            return strK;
        }
        if (str2.contains("正在进行人机识别")) {
            SpiderApi spiderApi2 = this.I;
            if (spiderApi2 != null) {
                spiderApi2.log("人机验证--> " + str2);
            }
            String strTrim = a0(str2, "src=\"&&\"", "").get(0).trim();
            if (strTrim.length() <= 0) {
                return str2;
            }
            HashMap map = new HashMap();
            if (strTrim.startsWith("http")) {
                string = strTrim;
            } else {
                if (strTrim.startsWith("/")) {
                    sb = new StringBuilder();
                    sb.append(this.f);
                } else {
                    sb = new StringBuilder();
                    sb.append(this.f);
                    sb.append("/");
                }
                sb.append(strTrim);
                string = sb.toString();
            }
            String strH = g.h(string, t(string), map);
            String strTrim2 = a0(strH, "var key=\"&&\"", "").get(0).trim();
            String strTrim3 = a0(strH, ",value=\"&&\"", "").get(0).trim();
            String string4 = "";
            for (int i = 0; i < strTrim3.length(); i++) {
                StringBuilder sbB2 = com.github.catvod.spider.merge.C0.d.d.b(string4);
                sbB2.append(Integer.toString(strTrim3.charAt(i)));
                string4 = sbB2.toString();
            }
            String strA = m.a(string4, m.b);
            String strTrim4 = a0(strH, "c.get(\"&&\\&", "").get(0).trim();
            if (strTrim4.startsWith("http")) {
                string2 = strTrim4;
            } else {
                if (strTrim4.startsWith("/")) {
                    sb2 = new StringBuilder();
                    sb2.append(this.f);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(this.f);
                    sb2.append("/");
                }
                sb2.append(strTrim4);
                string2 = sb2.toString();
            }
            String str4 = string2 + "&key=" + strTrim2 + "&value=" + strA;
            g.h(str4, t(str4), map);
            for (Map.Entry entry : map.entrySet()) {
                if (((String) entry.getKey()).equals("set-cookie") || ((String) entry.getKey()).equals("Set-Cookie")) {
                    this.z = this.z.length() < 1 ? TextUtils.join(";", (Iterable) entry.getValue()) : this.z + ";" + TextUtils.join(";", (Iterable) entry.getValue());
                    this.u++;
                    return k(str);
                }
            }
            this.u++;
            return k(str);
        }
        if (str2.indexOf("输入验证码") < 0 && str2.indexOf("滑动验证") < 0) {
            return str2;
        }
        try {
            SpiderApi spiderApi3 = this.I;
            if (spiderApi3 != null) {
                spiderApi3.log("OCR辅助验证--> " + str2);
            }
            boolean z = str2.indexOf("输入验证码") >= 0;
            JSONObject jSONObjectB = B(E("验证"), z);
            String str5 = this.z;
            String string5 = jSONObjectB.getString("str");
            String string6 = jSONObjectB.getString("codeUrl");
            String strH2 = H("ocr", "Ocr", "OCR", "");
            String str6 = "1";
            if (!z) {
                if (strH2.length() < 1 || !strH2.startsWith("http")) {
                    strH2 = "https://ocr1.wogg.link/";
                }
                str6 = "3";
            } else if (strH2.length() < 1 || !strH2.startsWith("http")) {
                strH2 = "https://ocr.wogg.link/";
            }
            M("");
            JSONObject jSONObjectP = p(string5, strH2, str6);
            String string7 = jSONObjectP.getString("code");
            this.z = jSONObjectP.getString("cookie");
            if (string7.length() <= 0 || this.z.length() <= 0) {
                this.z = str5;
                int i2 = this.u + 1;
                this.u = i2;
                if (i2 >= this.v) {
                    return str2;
                }
                R(str, str2);
            }
            HashMap<String, String> mapT = t(string5);
            if (z) {
                if (new JSONObject(com.github.catvod.spider.merge.C0.h.b.c(string6 + string7, new HashMap(), mapT)).optInt("code") != 1) {
                    this.z = str5;
                    int i3 = this.u + 1;
                    this.u = i3;
                    if (i3 >= this.v) {
                        return str2;
                    }
                    R(str, str2);
                }
            } else {
                if (!g.g(string6 + string7, mapT).contains("ok")) {
                    this.z = str5;
                    int i4 = this.u + 1;
                    this.u = i4;
                    if (i4 >= this.v) {
                        return str2;
                    }
                    R(str, str2);
                }
            }
            this.u++;
            str2 = k(str);
            return str2;
        } catch (Exception e) {
            SpiderApi spiderApi4 = this.I;
            if (spiderApi4 == null) {
                return str2;
            }
            com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("jumpbtwaf()错误-->"), spiderApi4);
            return str2;
        }
    }

    private String S(String str) {
        if (str.indexOf("转义左括号") >= 0) {
            str = str.replace("转义左括号", "[");
        }
        return str.indexOf("转义右括号") >= 0 ? str.replace("转义右括号", "]") : str;
    }

    private String T(String str, String str2) {
        if (str2.equals(Marker.ANY_MARKER) || str2.isEmpty()) {
            str2 = str;
        }
        String[] strArrSplit = str.split("\\&");
        String[] strArrSplit2 = str2.split("\\&");
        int i = 0;
        String strB = "";
        while (i < strArrSplit.length) {
            String str3 = i < strArrSplit.length + (-1) ? "#" : "";
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b(strB);
            sbB.append(strArrSplit[i]);
            sbB.append("$");
            strB = n.b(sbB, strArrSplit2[i], str3);
            i++;
        }
        return strB;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String U(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.U(java.lang.String):java.lang.String");
    }

    private String V(String str, String str2) {
        String strReplaceAll;
        String str3;
        if (str.length() > 1) {
            String[] strArrSplit = str.split("#");
            if (str.indexOf("$") < 1) {
                strReplaceAll = strArrSplit[0].replaceAll(".*(http.*)", "$1");
            } else {
                int length = strArrSplit.length;
                strReplaceAll = "";
                int i = 0;
                while (i < length) {
                    String strA = strArrSplit[i];
                    if (strA.endsWith("$")) {
                        strA = n.a(strA, "空");
                    }
                    String[] strArrSplit2 = strA.split("\\$")[0].split("、");
                    int length2 = strArrSplit2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            str3 = strReplaceAll;
                            break;
                        }
                        if (str2.equals(strArrSplit2[i2])) {
                            str3 = strA.split("\\$")[1];
                            break;
                        }
                        i2++;
                    }
                    i++;
                    strReplaceAll = str3;
                }
                if (strReplaceAll.length() < 1 && "默认".equals(strArrSplit[0].split("\\$")[0])) {
                    strReplaceAll = strArrSplit[0].split("\\$")[1];
                }
            }
            if (!"空".equals(strReplaceAll) && strReplaceAll.startsWith("http")) {
                return !strReplaceAll.endsWith("=") ? "" : strReplaceAll;
            }
        }
        return "";
    }

    private void W(Map<String, List<String>> map) {
        if (map.isEmpty()) {
            return;
        }
        SpiderApi spiderApi = this.I;
        if (spiderApi != null) {
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("响应--> ");
            sbB.append(map.toString());
            spiderApi.log(sbB.toString());
        }
        StringBuilder sb = new StringBuilder();
        if (map.get("set-cookie") != null && !map.get("set-cookie").isEmpty()) {
            Iterator<String> it = map.get("set-cookie").iterator();
            while (it.hasNext()) {
                sb.append(it.next().split(";")[0]);
                sb.append(";");
            }
        }
        if (map.get("Set-cookie") != null && !map.get("Set-cookie").isEmpty()) {
            for (String str : map.get("Set-cookie")) {
                if (sb.indexOf(str.split(";")[0]) < 0) {
                    sb.append(str.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (map.get("Set-Cookie") != null && !map.get("Set-Cookie").isEmpty()) {
            for (String str2 : map.get("Set-Cookie")) {
                if (sb.indexOf(str2.split(";")[0]) < 0) {
                    sb.append(str2.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (map.get("set-Cookie") != null && !map.get("set-Cookie").isEmpty()) {
            for (String str3 : map.get("set-Cookie")) {
                if (sb.indexOf(str3.split(";")[0]) < 0) {
                    sb.append(str3.split(";")[0]);
                    sb.append(";");
                }
            }
        }
        if (sb.toString().length() >= 3) {
            String[] strArrSplit = sb.toString().split(";");
            for (String strSubstring : strArrSplit) {
                if (this.z.indexOf(strSubstring.split("=")[0]) < 0) {
                    if (this.z.length() >= 1 && !"0".equals(this.z)) {
                        strSubstring = this.z + ";" + strSubstring;
                    }
                } else if (!strSubstring.endsWith("=") && !"0".equals(strSubstring.split("=")[1])) {
                    String strReplaceAll = n.b(new StringBuilder(), this.z, ";").replaceAll(n.b(new StringBuilder(), strSubstring.split("=")[0], "=.*?;"), strSubstring + ";");
                    this.z = strReplaceAll;
                    strSubstring = strReplaceAll.substring(0, strReplaceAll.length() + (-1));
                }
                this.z = strSubstring;
            }
        }
    }

    private static String Y(String str) {
        if (str.length() < 1) {
            return str;
        }
        Matcher matcher = Pattern.compile("(\\\\u(\\w{4}))").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(1), ((char) Integer.parseInt(matcher.group(2), 16)) + "");
        }
        return str.replaceAll("\\\\", "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:1168:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x0b56 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1070:0x09e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x0a03 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1084:0x0fe4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1114:0x10bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x0bd1 A[ADDED_TO_REGION, EDGE_INSN: B:1125:0x0bd1->B:421:0x0bd1 BREAK  A[LOOP:0: B:247:0x06ed->B:516:0x0ec5], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1128:0x0ead A[EDGE_INSN: B:1128:0x0ead->B:512:0x0ead BREAK  A[LOOP:1: B:305:0x08ea->B:342:0x099d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0953 A[Catch: all -> 0x18d7, TRY_ENTER, TryCatch #37 {all -> 0x18d7, blocks: (B:308:0x08f0, B:311:0x0908, B:314:0x0914, B:317:0x0920, B:320:0x092c, B:326:0x095b, B:332:0x0972, B:331:0x096a, B:325:0x0953), top: B:1039:0x08f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09ae A[Catch: Exception -> 0x0434, TRY_ENTER, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x09cc A[Catch: Exception -> 0x0434, TRY_LEAVE, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0b70  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0b77 A[Catch: Exception -> 0x0434, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0b9c A[Catch: Exception -> 0x0434, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0bbf A[Catch: Exception -> 0x0434, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0bd7 A[Catch: Exception -> 0x0434, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0c8b A[Catch: all -> 0x18d1, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x18d1, blocks: (B:440:0x0c5d, B:443:0x0c8b, B:446:0x0cc4, B:453:0x0d1e, B:455:0x0d2a, B:459:0x0d3e, B:492:0x0e30, B:494:0x0e4d, B:495:0x0e5e, B:497:0x0e64, B:464:0x0d67, B:466:0x0d6f, B:468:0x0d76), top: B:1029:0x0c5d }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0cc4 A[Catch: all -> 0x18d1, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x18d1, blocks: (B:440:0x0c5d, B:443:0x0c8b, B:446:0x0cc4, B:453:0x0d1e, B:455:0x0d2a, B:459:0x0d3e, B:492:0x0e30, B:494:0x0e4d, B:495:0x0e5e, B:497:0x0e64, B:464:0x0d67, B:466:0x0d6f, B:468:0x0d76), top: B:1029:0x0c5d }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0e82  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0eaa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0f79 A[Catch: Exception -> 0x0434, TRY_ENTER, TRY_LEAVE, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0fce A[Catch: Exception -> 0x1883, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x1883, blocks: (B:540:0x0fb7, B:543:0x0fce), top: B:1049:0x0fb7 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0fdb  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x106e  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x1104 A[Catch: Exception -> 0x0434, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x1129 A[Catch: Exception -> 0x0434, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:592:0x114a A[Catch: Exception -> 0x0434, TRY_LEAVE, TryCatch #50 {Exception -> 0x0434, blocks: (B:2:0x0000, B:5:0x000d, B:8:0x0021, B:9:0x003a, B:12:0x0045, B:14:0x0066, B:15:0x006e, B:17:0x0076, B:24:0x0090, B:26:0x00a3, B:28:0x00aa, B:29:0x00ca, B:31:0x00d1, B:33:0x00d9, B:19:0x007e, B:21:0x0086, B:35:0x00f0, B:37:0x00fa, B:39:0x0102, B:41:0x0116, B:43:0x0128, B:45:0x013c, B:47:0x0144, B:50:0x015a, B:53:0x0163, B:55:0x0169, B:56:0x017f, B:59:0x018f, B:150:0x0418, B:152:0x041e, B:153:0x042b, B:163:0x046b, B:61:0x0196, B:63:0x019e, B:65:0x01ba, B:67:0x01d5, B:69:0x01dd, B:71:0x01e7, B:73:0x01f6, B:74:0x021f, B:76:0x0227, B:78:0x022f, B:79:0x0240, B:81:0x0247, B:83:0x024f, B:87:0x0267, B:90:0x0270, B:92:0x0277, B:94:0x027f, B:95:0x028d, B:97:0x0297, B:99:0x02af, B:101:0x02b6, B:104:0x02c0, B:105:0x02de, B:107:0x02e5, B:109:0x02ed, B:110:0x0300, B:112:0x0306, B:115:0x031e, B:116:0x0328, B:118:0x0346, B:122:0x0375, B:124:0x037b, B:126:0x0383, B:128:0x038a, B:134:0x03a8, B:204:0x05b2, B:211:0x05f6, B:521:0x0f44, B:523:0x0f4e, B:529:0x0f79, B:584:0x10fe, B:586:0x1104, B:587:0x1123, B:589:0x1129, B:590:0x1143, B:592:0x114a, B:596:0x115f, B:598:0x117a, B:599:0x118e, B:603:0x11a7, B:786:0x16c3, B:788:0x16c9, B:789:0x16dc, B:605:0x11ac, B:607:0x11b4, B:608:0x11c8, B:610:0x11ce, B:612:0x11eb, B:614:0x11f2, B:790:0x1706, B:792:0x1723, B:794:0x172a, B:796:0x1747, B:799:0x1756, B:803:0x1760, B:805:0x176c, B:807:0x177c, B:808:0x1797, B:810:0x17d0, B:812:0x17e0, B:813:0x17e5, B:815:0x17ec, B:798:0x174e, B:817:0x17f2, B:819:0x17f9, B:820:0x1804, B:213:0x05fc, B:198:0x056f, B:200:0x0575, B:201:0x0594, B:203:0x059a, B:246:0x06d6, B:247:0x06ed, B:249:0x06ff, B:250:0x0715, B:252:0x071f, B:253:0x0727, B:256:0x072f, B:266:0x0769, B:268:0x076f, B:269:0x0786, B:258:0x0736, B:260:0x073e, B:262:0x0748, B:270:0x07b4, B:272:0x07c0, B:273:0x07da, B:275:0x07f0, B:278:0x0821, B:280:0x087f, B:282:0x0889, B:288:0x08a3, B:290:0x08b1, B:292:0x08b9, B:294:0x08c1, B:296:0x08c9, B:298:0x08d0, B:300:0x08da, B:302:0x08e0, B:405:0x0b60, B:408:0x0b71, B:410:0x0b77, B:411:0x0b96, B:413:0x0b9c, B:414:0x0bb5, B:416:0x0bbf, B:419:0x0bcb, B:513:0x0eb3, B:421:0x0bd1, B:423:0x0bd7, B:425:0x0bde, B:427:0x0be4, B:517:0x0ed1, B:519:0x0ed7, B:520:0x0efa, B:352:0x09cc, B:346:0x09ae, B:348:0x09b6, B:350:0x09be, B:284:0x0893, B:265:0x0757, B:192:0x053b, B:184:0x051b, B:186:0x0522, B:181:0x04f9, B:183:0x0503, B:164:0x0490, B:166:0x0498, B:168:0x04bd, B:170:0x04c5, B:172:0x04d1, B:174:0x04dd, B:176:0x04e3, B:148:0x040c, B:138:0x03c3, B:139:0x03dc, B:141:0x03e8, B:144:0x03fa, B:215:0x0609, B:217:0x0630, B:218:0x0637, B:220:0x063d, B:221:0x0645, B:224:0x0654, B:226:0x067d, B:227:0x0684, B:230:0x068b, B:232:0x0691, B:238:0x06b4, B:236:0x06ab, B:234:0x06a2, B:240:0x06ba, B:242:0x06c0, B:243:0x06cd, B:233:0x069b, B:195:0x0558), top: B:1065:0x0000, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:774:0x1655  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x18e6  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x18f6  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x18fa  */
    /* JADX WARN: Removed duplicated region for block: B:970:0x0b41 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:973:0x0a89 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:999:0x0a3b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject Z(java.lang.String r68, java.lang.String r69, boolean r70) {
        /*
            Method dump skipped, instruction units count: 6415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.Z(java.lang.String, java.lang.String, boolean):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> a0(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.a0(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0349 A[EDGE_INSN: B:125:0x0349->B:126:0x034a BREAK  A[LOOP:1: B:122:0x0337->B:141:0x03cf]] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034c A[Catch: all -> 0x04ca, TryCatch #0 {all -> 0x04ca, blocks: (B:12:0x002a, B:14:0x0034, B:15:0x003e, B:17:0x0048, B:18:0x0052, B:20:0x005c, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007c, B:29:0x0083, B:31:0x008b, B:32:0x008f, B:33:0x0094, B:35:0x009c, B:37:0x00ac, B:38:0x00ae, B:40:0x00b6, B:41:0x00be, B:43:0x00c6, B:44:0x00ce, B:46:0x00d6, B:47:0x00de, B:49:0x00e6, B:50:0x00ee, B:52:0x00f6, B:53:0x00fe, B:55:0x0106, B:57:0x010e, B:60:0x011e, B:62:0x0128, B:64:0x0130, B:65:0x014f, B:96:0x0245, B:98:0x024d, B:66:0x0153, B:68:0x0166, B:69:0x018a, B:70:0x0193, B:72:0x019b, B:73:0x01a3, B:75:0x01ad, B:76:0x01b7, B:78:0x01bf, B:79:0x01cf, B:81:0x01d7, B:82:0x01e9, B:84:0x01f1, B:86:0x01f9, B:88:0x0201, B:89:0x0214, B:91:0x021c, B:92:0x022f, B:94:0x023b, B:95:0x023f, B:110:0x02af, B:109:0x02a6, B:111:0x02b5, B:113:0x02cd, B:114:0x02d2, B:115:0x02f4, B:117:0x02fa, B:119:0x031d, B:121:0x032f, B:123:0x0339, B:141:0x03cf, B:127:0x034c, B:143:0x03d6, B:145:0x03de, B:147:0x03f0, B:149:0x03fa, B:169:0x0456, B:153:0x040d, B:155:0x0415, B:157:0x0423, B:161:0x0431, B:163:0x0439, B:164:0x0446, B:168:0x0452, B:171:0x045b, B:172:0x045e, B:176:0x0467, B:177:0x046f, B:179:0x0477, B:181:0x0485, B:185:0x0493, B:187:0x049b, B:188:0x04a8, B:192:0x04b4, B:193:0x04b8, B:194:0x04bb, B:198:0x04c4, B:129:0x0355, B:131:0x035d, B:132:0x036f, B:134:0x0372, B:135:0x0393, B:136:0x0396, B:137:0x03a8, B:139:0x03ab, B:140:0x03cc, B:59:0x0118, B:99:0x026e, B:101:0x0276, B:103:0x027e, B:106:0x028e, B:105:0x0288), top: B:217:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0467 A[Catch: all -> 0x04ca, TryCatch #0 {all -> 0x04ca, blocks: (B:12:0x002a, B:14:0x0034, B:15:0x003e, B:17:0x0048, B:18:0x0052, B:20:0x005c, B:21:0x0066, B:23:0x006e, B:25:0x0076, B:27:0x007c, B:29:0x0083, B:31:0x008b, B:32:0x008f, B:33:0x0094, B:35:0x009c, B:37:0x00ac, B:38:0x00ae, B:40:0x00b6, B:41:0x00be, B:43:0x00c6, B:44:0x00ce, B:46:0x00d6, B:47:0x00de, B:49:0x00e6, B:50:0x00ee, B:52:0x00f6, B:53:0x00fe, B:55:0x0106, B:57:0x010e, B:60:0x011e, B:62:0x0128, B:64:0x0130, B:65:0x014f, B:96:0x0245, B:98:0x024d, B:66:0x0153, B:68:0x0166, B:69:0x018a, B:70:0x0193, B:72:0x019b, B:73:0x01a3, B:75:0x01ad, B:76:0x01b7, B:78:0x01bf, B:79:0x01cf, B:81:0x01d7, B:82:0x01e9, B:84:0x01f1, B:86:0x01f9, B:88:0x0201, B:89:0x0214, B:91:0x021c, B:92:0x022f, B:94:0x023b, B:95:0x023f, B:110:0x02af, B:109:0x02a6, B:111:0x02b5, B:113:0x02cd, B:114:0x02d2, B:115:0x02f4, B:117:0x02fa, B:119:0x031d, B:121:0x032f, B:123:0x0339, B:141:0x03cf, B:127:0x034c, B:143:0x03d6, B:145:0x03de, B:147:0x03f0, B:149:0x03fa, B:169:0x0456, B:153:0x040d, B:155:0x0415, B:157:0x0423, B:161:0x0431, B:163:0x0439, B:164:0x0446, B:168:0x0452, B:171:0x045b, B:172:0x045e, B:176:0x0467, B:177:0x046f, B:179:0x0477, B:181:0x0485, B:185:0x0493, B:187:0x049b, B:188:0x04a8, B:192:0x04b4, B:193:0x04b8, B:194:0x04bb, B:198:0x04c4, B:129:0x0355, B:131:0x035d, B:132:0x036f, B:134:0x0372, B:135:0x0393, B:136:0x0396, B:137:0x03a8, B:139:0x03ab, B:140:0x03cc, B:59:0x0118, B:99:0x026e, B:101:0x0276, B:103:0x027e, B:106:0x028e, B:105:0x0288), top: B:217:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0512  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> b0(java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.b0(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    private String c0(String str, String str2) {
        String str3;
        String strReplaceAll;
        String strReplaceAll2;
        String str4;
        String str5;
        String strReplaceAll3;
        String strJ;
        StringBuilder sb;
        try {
            strReplaceAll = str2.replaceAll(".*<序号>(.*)", "$1");
            strReplaceAll2 = str2.replaceAll("<序号>.*", "");
        } catch (Exception e) {
            e = e;
            str3 = str2;
        }
        try {
            if (str.indexOf("替换") >= 0) {
                String strReplaceAll4 = str.replaceAll(".*\\[仅?替换[:：](.*?)\\].*", "$1");
                if (strReplaceAll4.indexOf("##") >= 0) {
                    return a0(strReplaceAll2, strReplaceAll4.replace("##", "&&"), "").get(0).trim();
                }
                String strReplace = S(strReplaceAll4).replace("<序号>", strReplaceAll);
                if (!strReplace.isEmpty()) {
                    String[] strArrSplit = strReplace.split("#");
                    int length = strArrSplit.length;
                    int i = 0;
                    while (i < length) {
                        String strP = P(strArrSplit[i]);
                        if (strP.endsWith(">>")) {
                            strP = strP + "空";
                        }
                        if (strP.indexOf(">>>") < 0) {
                            String str6 = strP.split(">>")[0];
                            str4 = strP.split(">>")[1];
                            str5 = str6;
                        } else {
                            String str7 = strP.split(">>>")[0] + ">";
                            str4 = strP.split(">>>")[1];
                            str5 = str7;
                        }
                        String strH0 = h0(str4);
                        if (str5.indexOf(Marker.ANY_MARKER) >= 0 && strH0.length() > 0) {
                            if (strH0.equals("空")) {
                                strH0 = "";
                            }
                            if (str5.startsWith(Marker.ANY_MARKER)) {
                                String strG0 = g0(str5.substring(1, str5.length()));
                                sb = new StringBuilder();
                                sb.append("[\\S\\s]*?");
                                sb.append(j(strG0));
                            } else if (str5.endsWith(Marker.ANY_MARKER)) {
                                String strG02 = g0(str5.substring(0, str5.length() - 1));
                                sb = new StringBuilder();
                                sb.append(j(strG02));
                                sb.append("[\\S\\s]*");
                            } else {
                                strJ = j(g0(str5.split("\\*")[0])) + "[\\S\\s]*?" + j(g0(str5.split("\\*")[1]));
                            }
                            strJ = sb.toString();
                        } else if (strH0.length() <= 0) {
                            strReplaceAll3 = strReplaceAll2;
                            i++;
                            strReplaceAll2 = strReplaceAll3;
                        } else {
                            if (str5.equals("空")) {
                                return strH0;
                            }
                            if (strH0.equals("空")) {
                                strH0 = "";
                            }
                            strJ = j(g0(str5));
                        }
                        strReplaceAll3 = strReplaceAll2.replaceAll(strJ, strH0);
                        i++;
                        strReplaceAll2 = strReplaceAll3;
                    }
                }
            }
            return strReplaceAll2;
        } catch (Exception e2) {
            e = e2;
            str3 = strReplaceAll2;
            if (this.m) {
                Init.show(this.G + "调试->替换出错，请检查：" + str + "->" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi == null) {
                return str3;
            }
            com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("替换tH()错误！-->"), spiderApi);
            return str3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb A[PHI: r0
      0x00bb: PHI (r0v15 java.lang.String) = (r0v13 java.lang.String), (r0v13 java.lang.String), (r0v41 java.lang.String), (r0v41 java.lang.String) binds: [B:46:0x0140, B:48:0x0148, B:23:0x00b1, B:25:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> d0(java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.d0(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    private JSONObject e(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            this.x = "";
            JSONObject jSONObjectA = this.w.length() < 1 ? A(str, str2, z, map) : null;
            JSONArray jSONArray = new JSONArray();
            if (jSONObjectA != null) {
                jSONArray = jSONObjectA.getJSONArray("list");
            }
            if (jSONArray.length() < 1 && !"<div&&</div>".equals(this.w)) {
                if (this.w.length() < 1) {
                    if ("搜索".equals(this.r) && this.s.indexOf("k0") >= 0) {
                        this.s = this.s.replace("k0", "");
                    }
                    if (this.s.indexOf("c") < 0) {
                        this.s += "c";
                    }
                    SpiderApi spiderApi = this.I;
                    if (spiderApi != null) {
                        spiderApi.log("自动模式<li>未截取到数据，尝试用<a>再截取一次");
                    }
                    this.w = "<a&&</a>";
                }
                jSONObjectA = A(str, str2, z, map);
            }
            if (jSONObjectA != null && jSONArray.length() < 1) {
                jSONArray = jSONObjectA.getJSONArray("list");
            }
            if (jSONArray.length() < 1) {
                if (!"<div&&</div>".equals(this.w)) {
                    SpiderApi spiderApi2 = this.I;
                    if (spiderApi2 != null) {
                        spiderApi2.log("自动模式<a>未截取到数据，尝试用<div>再截取一次");
                    }
                    this.w = "<div&&</div>";
                }
                jSONObjectA = A(str, str2, z, map);
                if ("搜索".equals(this.r)) {
                    this.w = "";
                }
            }
            if (jSONObjectA != null && jSONArray.length() < 1) {
                jSONArray = jSONObjectA.getJSONArray("list");
            }
            if (jSONArray.length() < 1 && this.w.length() > 0) {
                this.w = "";
            }
            final String strE = E("浏览器");
            if ((strE.length() < 1 && this.s.indexOf("L") >= 0) || "1".equals(strE)) {
                strE = this.f;
            }
            final String strO = o(strE);
            if (!"搜索".equals(this.r) && strE.startsWith("http") && !"0".equals(this.A)) {
                try {
                    Init.run(new Runnable(this, strE, strO) { // from class: com.github.catvod.spider.XBPQa
                        public final XBPQ c;
                        public final String d;
                        public final String e;

                        {
                            this.c = this;
                            this.d = strE;
                            this.e = strO;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            XBPQ xbpq = this.c;
                            String str3 = this.d;
                            String str4 = this.e;
                            String str5 = XBPQ.K;
                            xbpq.getClass();
                            k.A("内置网页浏览器", str3, str4, new j(xbpq) { // from class: com.github.catvod.spider.XBPQ.1
                                final XBPQ a;

                                {
                                    this.a = xbpq;
                                }

                                @Override // com.github.catvod.spider.merge.C0.j.j
                                public void vertifyCode(String str6) {
                                    if (str6.indexOf("$$$") > 1) {
                                        String[] strArrSplit = str6.split("\\$\\$\\$");
                                        XBPQ.K = strArrSplit[0].split("#")[0];
                                        this.a.z = strArrSplit[0].split("#")[1];
                                        SharedPreferences.Editor editorEdit = Init.d.edit();
                                        editorEdit.putString(n.b(new StringBuilder(), this.a.G, "_ua"), strArrSplit[0].split("#")[0]);
                                        editorEdit.putString(this.a.G, strArrSplit[0].split("#")[1]);
                                        editorEdit.apply();
                                    }
                                    this.a.A = "0";
                                }
                            });
                        }
                    }, 200);
                    if (!"0".equals(this.A)) {
                        this.A = "";
                    }
                } catch (Exception e) {
                    if (this.m) {
                        Init.show(this.G + "调试->内置浏览器运行出错：" + e.toString());
                    }
                    SpiderApi spiderApi3 = this.I;
                    if (spiderApi3 != null) {
                        spiderApi3.log("内置浏览器运行()错误！-->" + e.toString());
                    }
                }
            }
            this.x = "";
            return jSONObjectA;
        } catch (JSONException e2) {
            if (this.m) {
                Init.show(this.G + "调试->category出错：" + e2.toString());
            }
            SpiderApi spiderApi4 = this.I;
            if (spiderApi4 != null) {
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("category()错误！-->");
                sbB.append(e2.toString());
                spiderApi4.log(sbB.toString());
            }
            this.x = "";
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007f A[PHI: r0
      0x007f: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v7 java.lang.String), (r0v23 java.lang.String), (r0v23 java.lang.String) binds: [B:34:0x00c9, B:36:0x00d1, B:20:0x0075, B:22:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<java.lang.String> e0(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.e0(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    private String fixCover(String str, String str2) {
        try {
            return "proxy://do=xbpq&site=" + str2 + "&pic=" + str + "&sourcekey=" + E("指定代理");
        } catch (Exception e) {
            if (this.m) {
                Init.show(this.G + "调试->fixCover出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi == null) {
                return str;
            }
            com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("fixCover()错误-->"), spiderApi);
            return str;
        }
    }

    private String g(String str) {
        if (str != null) {
            if (str.length() < 1) {
                return "";
            }
            String strTrim = str.trim();
            if (strTrim.startsWith("：") || strTrim.startsWith(":")) {
                strTrim = strTrim.substring(1, strTrim.length());
            }
            while (strTrim.startsWith("/")) {
                strTrim = strTrim.substring(1, strTrim.length()).trim();
            }
            while (strTrim.endsWith("/")) {
                strTrim = strTrim.substring(0, strTrim.length() - 1).trim();
            }
            if (!"未知".equals(strTrim)) {
                return "内详".equals(strTrim) ? "" : strTrim;
            }
        }
        return "";
    }

    private String g0(String str) {
        return str.indexOf("转义星号") >= 0 ? str.replace("转义星号", Marker.ANY_MARKER) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b A[Catch: Exception -> 0x0119, TRY_ENTER, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[Catch: Exception -> 0x0119, TryCatch #0 {Exception -> 0x0119, blocks: (B:3:0x0002, B:5:0x000f, B:6:0x0019, B:7:0x001c, B:9:0x0024, B:10:0x002e, B:11:0x0031, B:13:0x0039, B:14:0x0043, B:15:0x0046, B:17:0x004e, B:18:0x0058, B:19:0x005b, B:21:0x0063, B:23:0x006b, B:26:0x0089, B:29:0x0092, B:30:0x0099, B:43:0x010c, B:54:0x014a, B:55:0x014e, B:57:0x015a, B:59:0x0162, B:60:0x016a, B:61:0x016d, B:63:0x0175, B:64:0x017f, B:66:0x0184, B:68:0x018c, B:77:0x01d1, B:79:0x01d9, B:74:0x01b6, B:76:0x01be, B:71:0x019b, B:73:0x01a3, B:40:0x00f0, B:42:0x00f8, B:37:0x00d4, B:39:0x00dc, B:34:0x00b8, B:36:0x00c0, B:31:0x009c, B:33:0x00a4), top: B:82:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray h(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.h(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):org.json.JSONArray");
    }

    private String h0(String str) {
        try {
            if (str.length() < 0) {
                return "";
            }
            if (str.indexOf(Marker.ANY_MARKER) < 0) {
                return g0(str);
            }
            Matcher matcher = Pattern.compile(j(g0(str.split("\\*")[0])) + "([\\S\\s]*?)" + j(g0(str.split("\\*")[1]))).matcher(this.x);
            if (matcher.find()) {
                return matcher.group(1).replaceAll("\\&#?[a-zA-Z0-9]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[><]", "").trim();
            }
            if (this.m) {
                Init.show("替换未获取到有效截取内容");
            }
            return "";
        } catch (Exception e) {
            if (this.m) {
                Init.show(this.G + "调试->替换截取出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("替换截取xhSubCut()错误！-->"), spiderApi);
            }
            return "";
        }
    }

    private String i(String str) {
        String str2;
        com.github.catvod.spider.merge.C0.k.a aVar = new com.github.catvod.spider.merge.C0.k.a() { // from class: com.github.catvod.spider.XBPQ.3
            @Override // com.github.catvod.spider.merge.C0.k.c
            protected final void onFailure(Call call, Exception exc) {
            }

            @Override // com.github.catvod.spider.merge.C0.k.c
            protected final /* bridge */ /* synthetic */ void onResponse(Response response) {
            }
        };
        String str3 = this.s;
        String strTrim = str.indexOf(";post") > 0 ? str.split(";post;")[1].trim() : "";
        String str4 = str.split(";")[0];
        if (this.s.indexOf("J") < 0 || str4.indexOf("outerHTML") >= 0 || str4.indexOf("innerHTML") >= 0 || this.I == null) {
            str2 = str4;
        } else {
            str2 = this.I.getAddress(true) + "webparse/" + str4 + "<<eval" + (str3.matches(".*Jb?\\d+.*") ? str3.replaceAll(".*Jb?(\\d+).*", "$1") : "") + (this.s.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML");
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                spiderApi.log("正在使用代理--> " + str2);
            }
        }
        HashMap<String, String> mapT = !"搜索".equals(this.r) ? t(str4) : L(str4);
        if (strTrim.length() > 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str5 : strTrim.split("\\&")) {
                if (!str5.endsWith("=")) {
                    int iIndexOf = str5.indexOf("=");
                    linkedHashMap.put(str5.substring(0, iIndexOf), str5.substring(iIndexOf + 1));
                }
            }
            if (strTrim.isEmpty()) {
                g.e(g.b(), str2, null, mapT, aVar);
            } else {
                g.e(g.b(), str2, linkedHashMap, mapT, aVar);
            }
        } else {
            g.c(g.b(), str2, mapT, aVar);
        }
        try {
            byte[] bArrBytes = aVar.getResult().body().bytes();
            return bArrBytes != null ? new String(bArrBytes, this.s.indexOf("g") >= 0 ? "GBK" : H("编码", "网页编码格式", "Coding_format", "UTF-8")) : "";
        } catch (IOException e) {
            if (this.m) {
                Init.show(this.G + "调试->deEnCode出错：" + e.toString());
            }
            SpiderApi spiderApi2 = this.I;
            if (spiderApi2 != null) {
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("deEnCode()错误-->");
                sbB.append(e.toString());
                spiderApi2.log(sbB.toString());
            }
            return "";
        }
    }

    public static Object[] loadPic(Map<String, String> map) {
        try {
            String str = map.get("site");
            String str2 = map.get("pic");
            if (L == null) {
                HashMap<String, String> map2 = new HashMap<>();
                L = map2;
                map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
                L.put("referer", str);
            }
            com.github.catvod.spider.merge.C0.k.a aVar = new com.github.catvod.spider.merge.C0.k.a() { // from class: com.github.catvod.spider.XBPQ.7
                @Override // com.github.catvod.spider.merge.C0.k.c
                protected final void onFailure(Call call, Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.C0.k.c
                protected final /* bridge */ /* synthetic */ void onResponse(Response response) {
                }
            };
            g.c(g.b(), str2, L, aVar);
            if (aVar.getResult().code() == 200) {
                String str3 = aVar.getResult().headers().get("Content-Type");
                String str4 = str3 == null ? "application/octet-stream" : str3;
                System.out.println(str2);
                System.out.println(str4);
                return new Object[]{200, str4, aVar.getResult().body().byteStream()};
            }
        } catch (Throwable th) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03c0 A[Catch: Exception -> 0x01bd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01bd, blocks: (B:24:0x00bc, B:26:0x00cc, B:28:0x00e0, B:29:0x00f7, B:31:0x00fd, B:32:0x0114, B:34:0x011a, B:36:0x0128, B:39:0x0130, B:41:0x019f, B:43:0x01a5, B:45:0x01ab, B:56:0x01f8, B:58:0x020f, B:60:0x0222, B:62:0x022e, B:63:0x0232, B:65:0x0238, B:66:0x025b, B:67:0x026f, B:69:0x027c, B:71:0x028c, B:73:0x0298, B:78:0x02a6, B:81:0x02af, B:82:0x02b6, B:84:0x02c0, B:118:0x03c0, B:107:0x034c, B:109:0x0354, B:111:0x035c, B:113:0x036d, B:114:0x03a2, B:115:0x03ae), top: B:213:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05e2 A[Catch: Exception -> 0x05ca, TRY_LEAVE, TryCatch #1 {Exception -> 0x05ca, blocks: (B:85:0x02d8, B:87:0x02e9, B:88:0x02fe, B:90:0x0306, B:92:0x030d, B:94:0x0317, B:96:0x031d, B:98:0x0323, B:100:0x032f, B:102:0x0337, B:104:0x033f, B:120:0x03f0, B:123:0x0403, B:125:0x041d, B:127:0x0429, B:133:0x044d, B:129:0x0435, B:131:0x0441, B:135:0x0461, B:137:0x046d, B:140:0x047b, B:142:0x0481, B:143:0x048b, B:145:0x0492, B:147:0x0498, B:149:0x04a0, B:151:0x04a8, B:153:0x04b0, B:155:0x04b8, B:157:0x04c0, B:159:0x04ca, B:196:0x05b8, B:161:0x04d2, B:163:0x04da, B:164:0x04f2, B:166:0x04fa, B:167:0x0505, B:169:0x050d, B:170:0x0518, B:172:0x0520, B:173:0x052b, B:175:0x0533, B:176:0x053e, B:178:0x0546, B:179:0x0551, B:181:0x0559, B:182:0x0564, B:184:0x056a, B:185:0x0578, B:187:0x0590, B:188:0x0599, B:190:0x05a0, B:192:0x05a8, B:194:0x05ae, B:201:0x05d4, B:204:0x05e2), top: B:214:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05d4 A[EDGE_INSN: B:219:0x05d4->B:201:0x05d4 BREAK  A[LOOP:1: B:82:0x02b6->B:106:0x0347], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020f A[Catch: Exception -> 0x01bd, TRY_ENTER, TryCatch #0 {Exception -> 0x01bd, blocks: (B:24:0x00bc, B:26:0x00cc, B:28:0x00e0, B:29:0x00f7, B:31:0x00fd, B:32:0x0114, B:34:0x011a, B:36:0x0128, B:39:0x0130, B:41:0x019f, B:43:0x01a5, B:45:0x01ab, B:56:0x01f8, B:58:0x020f, B:60:0x0222, B:62:0x022e, B:63:0x0232, B:65:0x0238, B:66:0x025b, B:67:0x026f, B:69:0x027c, B:71:0x028c, B:73:0x0298, B:78:0x02a6, B:81:0x02af, B:82:0x02b6, B:84:0x02c0, B:118:0x03c0, B:107:0x034c, B:109:0x0354, B:111:0x035c, B:113:0x036d, B:114:0x03a2, B:115:0x03ae), top: B:213:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c0 A[Catch: Exception -> 0x01bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x01bd, blocks: (B:24:0x00bc, B:26:0x00cc, B:28:0x00e0, B:29:0x00f7, B:31:0x00fd, B:32:0x0114, B:34:0x011a, B:36:0x0128, B:39:0x0130, B:41:0x019f, B:43:0x01a5, B:45:0x01ab, B:56:0x01f8, B:58:0x020f, B:60:0x0222, B:62:0x022e, B:63:0x0232, B:65:0x0238, B:66:0x025b, B:67:0x026f, B:69:0x027c, B:71:0x028c, B:73:0x0298, B:78:0x02a6, B:81:0x02af, B:82:0x02b6, B:84:0x02c0, B:118:0x03c0, B:107:0x034c, B:109:0x0354, B:111:0x035c, B:113:0x036d, B:114:0x03a2, B:115:0x03ae), top: B:213:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m() {
        /*
            Method dump skipped, instruction units count: 1547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.m():java.lang.String");
    }

    private JSONObject n(String str, String str2) {
        StringBuilder sb;
        String str3;
        StringBuilder sb2;
        String str4;
        String string;
        StringBuilder sb3;
        try {
            if (str2.equals("post") || str2.equals("空#post#空")) {
                str2 = "空#" + this.f + "/index.php/ajax/verify_check?type=show&verify={code};post;#空";
            }
            String[] strArrSplit = str2.split("#");
            if (str2.length() < 1) {
                if ("搜索".equals(this.r)) {
                    sb3 = new StringBuilder();
                    sb3.append(this.f);
                    sb3.append("/index.php/ajax/verify_check?type=search&verify=");
                } else {
                    sb3 = new StringBuilder();
                    sb3.append(this.f);
                    sb3.append("/index.php/ajax/verify_check?type=show&verify=");
                }
                String string2 = sb3.toString();
                if (this.s.indexOf("y") >= 0) {
                    str = this.f + "/index.php/verify/index.html?";
                    string = string2;
                } else {
                    string = string2;
                }
            } else {
                if (this.s.indexOf("y") >= 0) {
                    str = this.f + "/index.php/verify/index.html?";
                }
                if (!"空".equals(strArrSplit[0])) {
                    if (strArrSplit[0].startsWith("http")) {
                        str = strArrSplit[0];
                    } else {
                        if (strArrSplit[0].startsWith("/")) {
                            sb = new StringBuilder();
                            sb.append(this.f);
                            str3 = strArrSplit[0];
                        } else {
                            sb = new StringBuilder();
                            sb.append(this.f);
                            sb.append("/");
                            str3 = strArrSplit[0];
                        }
                        sb.append(str3);
                        str = sb.toString();
                    }
                }
                if ("搜索".equals(this.r)) {
                    String str5 = this.f + "/index.php/ajax/verify_check?type=search&verify=";
                    if ("空".equals(strArrSplit[2])) {
                        string = str5;
                    } else if (strArrSplit[2].startsWith("http")) {
                        string = strArrSplit[2];
                    } else {
                        if (strArrSplit[2].startsWith("/")) {
                            sb2 = new StringBuilder();
                            sb2.append(this.f);
                            str4 = strArrSplit[2];
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(this.f);
                            sb2.append("/");
                            str4 = strArrSplit[2];
                        }
                        sb2.append(str4);
                        string = sb2.toString();
                    }
                } else {
                    String str6 = this.f + "/index.php/ajax/verify_check?type=show&verify=";
                    if ("空".equals(strArrSplit[1])) {
                        string = str6;
                    } else if (strArrSplit[1].startsWith("http")) {
                        string = strArrSplit[1];
                    } else {
                        if (strArrSplit[1].startsWith("/")) {
                            sb2 = new StringBuilder();
                            sb2.append(this.f);
                            str4 = strArrSplit[1];
                        } else {
                            sb2 = new StringBuilder();
                            sb2.append(this.f);
                            sb2.append("/");
                            str4 = strArrSplit[1];
                        }
                        sb2.append(str4);
                        string = sb2.toString();
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("str", str);
            jSONObject.put("codeUrl", string);
            return jSONObject;
        } catch (Exception e) {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("getCodeUrl()错误-->"), spiderApi);
            }
            return null;
        }
    }

    private JSONObject p(String str, String str2, String str3) {
        String str4;
        String str5;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            Response responseExecute = g.b().newCall(new Request.Builder().url(str).addHeader("User-Agent", M("")).build()).execute();
            str4 = responseExecute.headers().get("Set-Cookie");
            InputStream inputStreamByteStream = responseExecute.body().byteStream();
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStreamByteStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            String strReplaceAll = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0).replaceAll("\\s", "");
            if (str3.equals("1")) {
                str5 = "{\"ocr_type\":1,\"img\":\"" + strReplaceAll + "\",\"backgroundlmg\":\"None\"}";
            } else {
                str5 = "";
            }
            if (str3.equals("3")) {
                str5 = "{\"ocr_type\":3,\"img\":\"" + strReplaceAll + "\"}";
            }
            jSONObject = new JSONObject(g.b().newCall(new Request.Builder().url(str2).post(RequestBody.create(MediaType.parse("application/json"), str5)).addHeader("User-Agent", M("")).build()).execute().body().string());
            jSONObject2 = new JSONObject();
        } catch (Exception e) {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("getDatas()错误-->"), spiderApi);
            }
        }
        if (str3.equals("1")) {
            jSONObject2.put("cookie", str4);
            jSONObject2.put("code", jSONObject.getString("result"));
            return jSONObject2;
        }
        if (str3.equals("3")) {
            jSONObject2.put("cookie", str4);
            jSONObject2.put("code", jSONObject.getJSONObject("result").getString("target").replaceAll("[\\[\\]]", ""));
            return jSONObject2;
        }
        return null;
    }

    private String q(String str, String str2) {
        if (str.indexOf(str2) < 0) {
            return "";
        }
        return ("#" + str + "#").replaceAll(".*" + str2 + "\\$([^#]+?)#.*", "$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0911  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject r(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 2333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.r(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0333 A[Catch: Exception -> 0x054c, TryCatch #0 {Exception -> 0x054c, blocks: (B:3:0x0006, B:8:0x002d, B:10:0x0048, B:11:0x0055, B:12:0x005b, B:14:0x006c, B:16:0x007b, B:18:0x008c, B:20:0x009b, B:22:0x00ac, B:23:0x00b9, B:25:0x00ca, B:26:0x00e1, B:28:0x00f2, B:29:0x0100, B:31:0x0111, B:33:0x0118, B:34:0x012f, B:36:0x0140, B:38:0x0147, B:39:0x015e, B:42:0x0188, B:47:0x0198, B:49:0x01a4, B:50:0x01be, B:52:0x01c6, B:53:0x01cc, B:55:0x01d4, B:56:0x01da, B:58:0x01e2, B:60:0x01fa, B:62:0x020e, B:67:0x021e, B:69:0x022a, B:70:0x0234, B:72:0x023c, B:73:0x0242, B:75:0x024a, B:76:0x0250, B:78:0x0258, B:81:0x0271, B:83:0x027f, B:85:0x0287, B:88:0x0291, B:90:0x02a5, B:93:0x02af, B:95:0x02c5, B:97:0x02cb, B:98:0x02ee, B:100:0x0302, B:103:0x030a, B:104:0x032d, B:106:0x0333, B:108:0x034e, B:110:0x0356, B:115:0x0368, B:117:0x036e, B:119:0x0378, B:121:0x0380, B:123:0x03b7, B:124:0x03c1, B:126:0x03c9, B:127:0x03d3, B:129:0x03db, B:130:0x03e3, B:132:0x03eb, B:133:0x03f5, B:135:0x03fd, B:136:0x0407, B:138:0x040f, B:139:0x041a, B:143:0x0427, B:182:0x0509, B:112:0x035e, B:151:0x045d, B:153:0x0465, B:156:0x0471, B:158:0x0479, B:160:0x0481, B:163:0x048d, B:165:0x0495, B:167:0x049d, B:169:0x04a5, B:171:0x04ad, B:174:0x04d9, B:173:0x04b5, B:64:0x0214, B:144:0x0438, B:146:0x0444, B:44:0x018e), top: B:199:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x058b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject s() {
        /*
            Method dump skipped, instruction units count: 1431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.s():org.json.JSONObject");
    }

    private String u(int i, String str, String str2) {
        String strReplaceAll;
        StringBuilder sb;
        String str3;
        String string;
        StringBuilder sb2;
        String str4;
        if (str.indexOf("$$$") < 0) {
            strReplaceAll = n.b(com.github.catvod.spider.merge.C0.d.d.b("#"), this.c, "#").replaceAll(".*#(.*?)\\$" + str + "#.*", "$1");
        } else {
            strReplaceAll = str.split("\\$\\$\\$")[1];
            str = str.split("\\$\\$\\$")[0];
        }
        if (str2.indexOf("||") < 0 && str2.indexOf("--") < 0) {
            return str2;
        }
        if (str2.indexOf("--") < 0) {
            return str + "--" + str2.split("\\|\\|")[i];
        }
        if (str2.indexOf("||") < 0) {
            if (strReplaceAll.equals(str2.split("--")[0])) {
                sb = new StringBuilder(str);
                sb.append("--");
                str3 = str2.split("--")[1];
                sb.append(str3);
                string = sb.toString();
                break;
            }
            string = "0";
        } else {
            for (String str5 : str2.split("\\|\\|")) {
                if (strReplaceAll.equals(str5.split("--")[0]) || (strReplaceAll.indexOf(str5.split("--")[0]) >= 0 && strReplaceAll.indexOf("电影") < 0 && strReplaceAll.indexOf("剧") < 0)) {
                    sb = new StringBuilder(str);
                    sb.append("--");
                    str3 = str5.split("--")[1];
                    sb.append(str3);
                    string = sb.toString();
                    break;
                }
            }
            string = "0";
        }
        if (string.equals("0")) {
            if (str2.indexOf("||") < 0) {
                String str6 = str2.split("--")[0];
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("");
                sbB.append(i + 1);
                if (str6.equals(sbB.toString())) {
                    sb2 = new StringBuilder(str);
                    sb2.append("--");
                    str4 = str2.split("--")[1];
                    sb2.append(str4);
                    return sb2.toString();
                }
            } else {
                for (String str7 : str2.split("\\|\\|")) {
                    String str8 = str7.split("--")[0];
                    StringBuilder sbB2 = com.github.catvod.spider.merge.C0.d.d.b("");
                    sbB2.append(i + 1);
                    if (str8.equals(sbB2.toString())) {
                        sb2 = new StringBuilder(str);
                        sb2.append("--");
                        str4 = str7.split("--")[1];
                        sb2.append(str4);
                        return sb2.toString();
                    }
                }
            }
        }
        return string;
    }

    private JSONArray v(String str, String str2) {
        String str3;
        int i = 0;
        try {
            if (str2.length() < 1) {
                return new JSONArray(str);
            }
            String strReplaceAll = str2.indexOf("&&") >= 0 ? "data" : str2;
            JSONArray jSONArray = new JSONArray();
            if (strReplaceAll.indexOf("[") >= 0) {
                String strReplaceAll2 = strReplaceAll.replaceAll(".*\\[(.*?)\\].*", "$1");
                strReplaceAll = strReplaceAll.replaceAll("\\[.*", "");
                str3 = strReplaceAll2;
            } else {
                str3 = "";
            }
            String[] strArrSplit = strReplaceAll.split("\\.");
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                JSONObject jSONObject = new JSONObject(str);
                if (i2 == strArrSplit.length - 1) {
                    if (jSONObject.get(strArrSplit[i2]) instanceof JSONObject) {
                        jSONArray.put(jSONObject.getJSONObject(strArrSplit[i2]));
                        return jSONArray;
                    }
                    JSONArray jSONArray2 = jSONObject.getJSONArray(strArrSplit[i2]);
                    int length = jSONArray2.length();
                    if (str3 == null || str3.length() <= 0) {
                        return jSONArray2;
                    }
                    if (str3.indexOf(",") >= 0 || !str3.matches("\\d+")) {
                        String strReplaceAll3 = str3.replaceAll("(.*),.*", "$1");
                        String strReplaceAll4 = str3.replaceAll(".*,(.*)", "$1");
                        if (strReplaceAll4 != null && strReplaceAll4.length() > 0 && strReplaceAll4.matches("\\d+") && Integer.parseInt(strReplaceAll4) < length) {
                            length = Integer.parseInt(strReplaceAll4);
                        }
                        if (strReplaceAll3 != null && strReplaceAll3.length() > 0 && strReplaceAll3.matches("\\d+") && Integer.parseInt(strReplaceAll3) <= length) {
                            i = Integer.parseInt(strReplaceAll3) - 1;
                        }
                    } else {
                        if (length > Integer.parseInt(str3)) {
                            length = Integer.parseInt(str3);
                        }
                        i = length - 1;
                    }
                    while (i < length) {
                        jSONArray.put(jSONArray2.getJSONObject(i));
                        i++;
                    }
                    return jSONArray;
                }
                str = jSONObject.getJSONObject(strArrSplit[i2]).toString();
            }
            return null;
        } catch (JSONException e) {
            if (this.m) {
                Init.show(this.G + "调试->getJsonArray出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("getJsonArray()错误！-->");
                sbB.append(e.toString());
                spiderApi.log(sbB.toString());
            }
            return null;
        }
    }

    private String w(String str, String str2) {
        String string;
        String strK;
        String strReplaceAll = "";
        if (str2.indexOf("替换") >= 0) {
            strReplaceAll = str2.replaceAll(".*(\\[仅?替换[:：][^\\]]+?\\]).*", "$1");
            str2 = str2.replaceAll("\\[仅?替换[:：]([^\\]]+?)\\]", "");
        }
        if (str2.indexOf(Marker.ANY_NON_NULL_MARKER) < 0) {
            string = x(str, str2);
        } else {
            String[] strArrSplit = str2.split("\\+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArrSplit.length; i++) {
                if (strArrSplit[i].startsWith("url:")) {
                    String strSubstring = strArrSplit[i].substring(4);
                    if (strSubstring.indexOf("$sub:") > 0) {
                        String[] strArrSplit2 = strSubstring.split("\\$sub\\:");
                        if (strArrSplit2.length > 1) {
                            strK = x(k(strArrSplit2[0]), strArrSplit2[1]);
                        } else {
                            strSubstring = strArrSplit2[0];
                            strK = k(strSubstring);
                        }
                    } else {
                        strK = k(strSubstring);
                    }
                } else {
                    strK = x(str, strArrSplit[i]);
                }
                if (strK.length() > 0) {
                    if (strK.startsWith("http") && !sb.toString().trim().endsWith("=") && !sb.toString().trim().endsWith("解析")) {
                        sb = new StringBuilder();
                    }
                    sb.append(strK);
                }
            }
            string = sb.toString();
        }
        return c0(strReplaceAll, string);
    }

    private String x(String str, String str2) {
        String strReplace;
        String string;
        String strReplaceAll;
        if (str2.endsWith("整页")) {
            strReplace = str2.replace("整页", "");
            string = this.x.length() > 0 ? this.x : str;
        } else {
            strReplace = str2;
            string = str;
        }
        try {
            if (strReplace.indexOf("'") >= 0) {
                return strReplace.replace("'", "");
            }
            if (strReplace.indexOf("&&") >= 0 || strReplace.length() < 1) {
                strReplace = "data";
            }
            if (strReplace.indexOf("].") < 0) {
                return z(string, strReplace);
            }
            String[] strArrSplit = strReplace.split("\\]\\.");
            if (strArrSplit.length > 2) {
                for (int i = 0; i < strArrSplit.length - 2; i++) {
                    string = v(string, strArrSplit[i] + "]").getJSONObject(0).toString();
                }
            }
            String str3 = string;
            String strReplaceAll2 = strArrSplit[strArrSplit.length - 1];
            String str4 = strArrSplit[strArrSplit.length - 2] + "]";
            if (strReplaceAll2.indexOf("(") >= 0) {
                strReplaceAll = strReplaceAll2.replaceAll(".*\\((.*?)\\).*", "$1");
                strReplaceAll2 = strReplaceAll2.replaceAll("\\(.*", "");
            } else {
                strReplaceAll = ",";
            }
            JSONArray jSONArrayV = v(str3, str4);
            StringBuilder sb = new StringBuilder();
            if (jSONArrayV == null || jSONArrayV.length() <= 0) {
                return "";
            }
            for (int i2 = 0; i2 < jSONArrayV.length(); i2++) {
                String string2 = jSONArrayV.getJSONObject(i2).toString();
                if (i2 == jSONArrayV.length() - 1) {
                    strReplaceAll = "";
                }
                sb.append(z(string2, strReplaceAll2));
                sb.append(strReplaceAll);
            }
            return sb.toString();
        } catch (JSONException e) {
            if (this.m) {
                Init.show(this.G + "调试->getJsonArrayStringAction出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("getJsonArrayStringAction()错误！-->");
                sbB.append(e.toString());
                spiderApi.log(sbB.toString());
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.gson.JsonObject y(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.y(java.lang.String):com.google.gson.JsonObject");
    }

    private String z(String str, String str2) {
        String strReplaceAll;
        JSONObject jSONObjectPut;
        boolean z = true;
        int i = 0;
        try {
            String strSubstring = (str2.indexOf("&&") >= 0 || str2.length() < 1) ? "data" : str2;
            if (strSubstring.endsWith(";json;")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 6);
            } else {
                z = false;
            }
            if (strSubstring.indexOf("[") < 0) {
                String[] strArrSplit = strSubstring.split("\\.");
                while (true) {
                    int i2 = i;
                    if (i2 >= strArrSplit.length) {
                        break;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (i2 == strArrSplit.length - 1) {
                        if (z) {
                            Object obj = jSONObject.get(strArrSplit[i2]);
                            if (obj instanceof JSONObject) {
                                jSONObjectPut = (JSONObject) obj;
                            } else if (obj instanceof JSONArray) {
                                jSONObjectPut = new JSONObject().put(strArrSplit[i2], (JSONArray) obj);
                            } else {
                                strReplaceAll = "";
                            }
                            strReplaceAll = jSONObjectPut.toString();
                        } else {
                            strReplaceAll = jSONObject.optString(strArrSplit[i2]).trim().replaceAll("\\]", "").replaceAll("\\[", "").replaceAll("\"", "");
                        }
                        return strReplaceAll != null ? strReplaceAll : "";
                    }
                    str = jSONObject.getJSONObject(strArrSplit[i2]).toString();
                    i = i2 + 1;
                }
            }
            return "";
        } catch (JSONException e) {
            if (this.m) {
                Init.show(this.G + "调试->getJsonString出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("getJsonString()错误！-->");
                sbB.append(e.toString());
                spiderApi.log(sbB.toString());
            }
            return "";
        }
    }

    protected final String C(String str) {
        try {
            String strTrim = H("播放请求头", "直接播放直链视频请求头", "play_header", "").trim();
            if (strTrim.length() > 1 && strTrim.indexOf("@") > 0) {
                strTrim = strTrim.replace("@", "$").replace("&&", "#").replace("；；", ";");
            }
            if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                return strTrim;
            }
            JSONObject jSONObject = new JSONObject();
            String strM = M(strTrim);
            jSONObject.put("User-Agent", strM);
            if (this.s.indexOf("C") >= 0 && o(str).length() > 1) {
                jSONObject.put("Cookie", o(str));
            }
            if (strTrim.indexOf("Referer") < 0 && this.s.indexOf("R1") >= 0) {
                jSONObject.put("Referer", str);
            } else if (strTrim.indexOf("Referer") < 0 && this.s.indexOf("R") >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append((str + "/").replaceAll(".*(https?\\://[^/]+)/.*", "$1"));
                sb.append("/");
                str = sb.toString();
                jSONObject.put("Referer", str);
            }
            String strReplaceAll = strTrim.replaceAll(".*电脑#", "").replaceAll(".*手机#", "").replaceAll(".*_UA#", "");
            if (strReplaceAll.indexOf("$") >= 0) {
                for (String str2 : strReplaceAll.split("#")) {
                    if ((!"User-Agent".equals(str2.split("\\$")[0]) || strM.length() <= 0) && !"Cookie".equals(str2.split("\\$")[0]) && !"cookie".equals(str2.split("\\$")[0])) {
                        jSONObject.put(str2.split("\\$")[0], str2.split("\\$")[1].equals("空") ? "" : str2.split("\\$")[1]);
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            if (this.m) {
                Init.show(this.G + "调试->getPlayHeaders出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("getPlayHeaders()错误！-->");
                sbB.append(e.toString());
                spiderApi.log(sbB.toString());
            }
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.HashMap<java.lang.String, java.lang.String> L(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.L(java.lang.String):java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.String M(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.M(java.lang.String):java.lang.String");
    }

    final String X(String str) {
        return com.github.catvod.spider.merge.C0.N.a.l(str).p0();
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        SpiderApi spiderApi = this.I;
        if (spiderApi != null) {
            spiderApi.log("categoryContent(tid=" + str + ", pg=" + str2 + ", filter=" + z + ", extend=" + map.toString() + ")");
        }
        JSONObject jSONObjectE = e(str, str2, z, map);
        String string = jSONObjectE != null ? jSONObjectE.toString() : "";
        return string.length() > 20 ? string : "";
    }

    public String decrypt(String str, String str2, String str3, String str4) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str4.getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 0)), str2);
        } catch (Exception e) {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("decrypt()错误-->"), spiderApi);
            }
            return null;
        }
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public java.lang.String detailContent(java.util.List<java.lang.String> r65) {
        /*
            Method dump skipped, instruction units count: 8852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.detailContent(java.util.List):java.lang.String");
    }

    public String encrypt(String str, String str2, String str3, String str4) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/PKCS5Padding");
            cipher.init(1, new SecretKeySpec(str3.getBytes(), "AES"), new IvParameterSpec(str4.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes(str2)), 0);
        } catch (Exception e) {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("encrypt()错误-->"), spiderApi);
            }
            return null;
        }
    }

    protected final String f(String str, String str2, boolean z, HashMap<String, String> map) {
        String strReplace;
        String strReplace2;
        if (str.startsWith("http")) {
            return str;
        }
        String str3 = this.b;
        String strH = H("特殊分类", "特殊分类url", "特殊分类链接", "");
        String strI = I("起始页", "分类起始页码", "qishiye", "firstpage", "1");
        if (this.r.length() <= 0 || strH.indexOf("$") < 0 || strH.indexOf(this.r) < 0) {
            strReplace = str3;
        } else {
            String strA = n.a(strH, "#");
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b(".*");
            sbB.append(this.r);
            sbB.append(".*?\\$(.*?)#.*");
            strReplace = strA.replaceAll(sbB.toString(), "$1");
        }
        if (strReplace.indexOf("[") >= 0 || strReplace.indexOf("|") >= 0) {
            strReplace = str2.equals(strI) ? strReplace.replaceAll(".*[\\[|\\|].*(http[^\\]]*)\\]?.*", "$1").replace("firstPage=", "") : strReplace.replaceAll("\\|\\|", "\\|").replaceAll("(.*)[\\[|\\|].*", "$1");
        }
        if (z && this.a && map != null && map.size() > 0) {
            String strReplace3 = strReplace;
            for (String str4 : map.keySet()) {
                String str5 = map.get(str4);
                if (str5.length() > 0) {
                    strReplace3 = strReplace3.replace("{" + str4 + "}", URLEncoder.encode(str5));
                }
            }
            strReplace = strReplace3;
        }
        if (strReplace.startsWith("/") && !strReplace.startsWith("//")) {
            strReplace = n.b(new StringBuilder(), this.f, strReplace);
        }
        if (strReplace.indexOf("{catePg}") >= 0) {
            int iIndexOf = str2.indexOf("-");
            String strReplace4 = strReplace.replace("{cateId}", str);
            if (iIndexOf >= 1) {
                strReplace2 = strReplace4.replace("{catePg}", str2.split("-")[0]);
                int i = Integer.parseInt(str2.split("-")[0]);
                while (true) {
                    i++;
                    if (i > Integer.parseInt(str2.split("-")[1])) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(strReplace2);
                    sb.append("$$$");
                    sb.append(strReplace4.replace("{catePg}", "" + i));
                    strReplace2 = sb.toString();
                }
            } else {
                strReplace2 = strReplace4.replace("{catePg}", str2);
            }
        } else {
            strReplace2 = strReplace.replace("{cateId}", str);
        }
        Matcher matcher = Pattern.compile("\\{(.*?)\\}").matcher(strReplace2);
        while (matcher.find()) {
            String strReplace5 = matcher.group(0).replace("{", "").replace("}", "");
            strReplace2 = strReplace2.replace(matcher.group(0), "").replace("/" + strReplace5 + "/", "");
        }
        return strReplace2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153 A[Catch: Exception -> 0x021d, TRY_LEAVE, TryCatch #2 {Exception -> 0x021d, blocks: (B:60:0x014b, B:62:0x0153, B:84:0x01db, B:88:0x01fe, B:89:0x0201, B:91:0x0205, B:93:0x0218), top: B:111:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01db A[Catch: Exception -> 0x021d, TRY_ENTER, TryCatch #2 {Exception -> 0x021d, blocks: (B:60:0x014b, B:62:0x0153, B:84:0x01db, B:88:0x01fe, B:89:0x0201, B:91:0x0205, B:93:0x0218), top: B:111:0x014b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.String f0(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.f0(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public String getToken(String str, String str2, String str3, String str4) {
        return encrypt(str, str2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024b A[Catch: Exception -> 0x0366, TRY_LEAVE, TryCatch #2 {Exception -> 0x0366, blocks: (B:93:0x0214, B:96:0x0227, B:98:0x022d, B:101:0x0235, B:104:0x023b, B:106:0x0243, B:137:0x02e2, B:120:0x0297, B:139:0x02ea, B:108:0x024b, B:110:0x026e, B:112:0x0276, B:115:0x0280, B:116:0x0288, B:118:0x0290), top: B:167:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0276 A[Catch: Exception -> 0x0366, TRY_LEAVE, TryCatch #2 {Exception -> 0x0366, blocks: (B:93:0x0214, B:96:0x0227, B:98:0x022d, B:101:0x0235, B:104:0x023b, B:106:0x0243, B:137:0x02e2, B:120:0x0297, B:139:0x02ea, B:108:0x024b, B:110:0x026e, B:112:0x0276, B:115:0x0280, B:116:0x0288, B:118:0x0290), top: B:167:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0290 A[Catch: Exception -> 0x0366, TryCatch #2 {Exception -> 0x0366, blocks: (B:93:0x0214, B:96:0x0227, B:98:0x022d, B:101:0x0235, B:104:0x023b, B:106:0x0243, B:137:0x02e2, B:120:0x0297, B:139:0x02ea, B:108:0x024b, B:110:0x026e, B:112:0x0276, B:115:0x0280, B:116:0x0288, B:118:0x0290), top: B:167:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0297 A[Catch: Exception -> 0x0366, TRY_LEAVE, TryCatch #2 {Exception -> 0x0366, blocks: (B:93:0x0214, B:96:0x0227, B:98:0x022d, B:101:0x0235, B:104:0x023b, B:106:0x0243, B:137:0x02e2, B:120:0x0297, B:139:0x02ea, B:108:0x024b, B:110:0x026e, B:112:0x0276, B:115:0x0280, B:116:0x0288, B:118:0x0290), top: B:167:0x0214 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String homeContent(boolean r14) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.homeContent(boolean):java.lang.String");
    }

    public String homeVideoContent() {
        String str;
        String str2;
        String strReplaceAll;
        try {
            String strI = I("首页", "热门", "homeContent", "shouye", "40");
            String str3 = (strI.equals("1") || strI.equals("首页")) ? "40" : strI;
            if (G("列表分类", "fenlei", "").length() < 3) {
                str = this.c + "#";
            } else {
                str = G("列表分类", "fenlei", "") + "#";
            }
            this.e = 40;
            if (str3.indexOf("$") >= 0) {
                this.e = Integer.parseInt(str3.split("\\$")[1]);
                String str4 = str3.split("\\$")[0];
                if (!str4.equals("首页")) {
                    str2 = ".*" + str4 + "\\$(.*?)#.*";
                    strReplaceAll = str.replaceAll(str2, "$1");
                }
                strReplaceAll = "";
            } else if (str3.matches("\\d+")) {
                this.e = Integer.parseInt(str3);
                strReplaceAll = "";
            } else {
                str2 = ".*" + str3 + "\\$(.*?)#.*";
                strReplaceAll = str.replaceAll(str2, "$1");
            }
            if (this.e > 0) {
                this.d = true;
                this.r = "首页";
                JSONObject jSONObjectE = e(strReplaceAll, "1", false, new HashMap<>());
                this.r = "";
                this.d = false;
                String string = jSONObjectE != null ? jSONObjectE.toString() : "";
                return string.length() > 20 ? string : "";
            }
        } catch (Exception e) {
            if (this.m) {
                Init.show(this.G + "调试->获取首页资源出错：" + e.toString());
            }
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e, com.github.catvod.spider.merge.C0.d.d.b("获取首页资源错误！-->"), spiderApi);
            }
        }
        return "";
    }

    protected final com.github.catvod.spider.merge.C0.f0.a i0(String str) {
        String strK;
        if (str.indexOf(";post") >= 0) {
            strK = l(n.a("xp", str));
        } else {
            StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("xp");
            sbB.append(str.split(";")[0]);
            strK = k(sbB.toString());
        }
        return new com.github.catvod.spider.merge.C0.f0.a(com.github.catvod.spider.merge.C0.N.a.l(strK).R());
    }

    public void init(Context context) {
        super.init(context);
    }

    public void init(Context context, String str) {
        this.C = context;
        super.init(context, str);
        if (str != null) {
            try {
                if (str.startsWith("http")) {
                    if (str.indexOf("{cateId}") < 0) {
                        this.B = new JSONObject(com.github.catvod.spider.merge.C0.h.b.h(str, null, null));
                    } else {
                        JSONObject jSONObject = new JSONObject();
                        this.B = jSONObject;
                        jSONObject.put("分类url", str);
                    }
                } else if (str.startsWith("{")) {
                    this.B = new JSONObject(str);
                } else {
                    this.B = new JSONObject();
                    String strReplace = str.replace("\\,", "逗号");
                    if (strReplace.indexOf(",") < 0) {
                        this.B.put(strReplace.substring(0, strReplace.indexOf(":")), strReplace.substring(strReplace.indexOf(":") + 1).replace("逗号", ","));
                    } else {
                        for (String str2 : strReplace.split(",")) {
                            this.B.put(str2.substring(0, str2.indexOf(":")), str2.substring(str2.indexOf(":") + 1).replace("逗号", ","));
                        }
                    }
                }
                O();
            } catch (JSONException e) {
                if (this.m) {
                    Init.show("请检配置ext");
                }
                SpiderApi spiderApi = this.I;
                if (spiderApi != null) {
                    StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("请检配置ext-->");
                    sbB.append(e.toString());
                    spiderApi.log(sbB.toString());
                }
            }
        }
    }

    public void initApi(SpiderApi spiderApi) {
        this.I = spiderApi;
        super.initApi(spiderApi);
        this.J = spiderApi.getPort();
        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("Id版端口：");
        sbB.append(this.J);
        spiderApi.log(sbB.toString());
    }

    public boolean isVideoFormat(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("http") && !lowerCase.startsWith("magnet")) {
            return false;
        }
        String[] strArrSplit = G("嗅探词", "VideoFormat", "m3u8#.mp4#.flv#.mp3#.m4a#magnet:#ed2k:#ftp:#thunder:#push:#tvbox-xg:").split("#");
        String[] strArrSplit2 = G("过滤词", "VideoFilter", "url=http#;post;#.js").split("#");
        for (String str2 : strArrSplit) {
            if (lowerCase.indexOf(str2) >= 0) {
                for (String str3 : strArrSplit2) {
                    if (lowerCase.indexOf(str3) >= 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    final String j(String str) {
        if (str.isEmpty()) {
            return str;
        }
        String strReplace = str;
        for (int i = 0; i < 14; i++) {
            String str2 = new String[]{"\\", "$", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ".", "[", "]", "?", "^", "{", "}", "|"}[i];
            if (strReplace.indexOf(str2) >= 0) {
                strReplace = strReplace.replace(str2, "\\" + str2);
            }
        }
        return strReplace;
    }

    protected final String k(String str) {
        String strH;
        String strTrim;
        String strA = n.a("###", str);
        String strN = N(str);
        if (strN.indexOf(";post") >= 0) {
            return l(strN);
        }
        boolean zStartsWith = strN.startsWith("xp");
        if (zStartsWith) {
            strN = strN.replaceAll("xp(http.*)", "$1");
        }
        String str2 = this.s;
        String strH2 = str2.indexOf("g") >= 0 ? "GBK" : H("编码", "网页编码格式", "Coding_format", "UTF-8");
        if ("UTF-8".equals(strH2)) {
            strH = "";
        } else {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                spiderApi.log("编码--> " + strH2);
            }
            strH = i(strN);
        }
        HashMap map = new HashMap();
        if (strH.length() < 1) {
            if (this.s.indexOf("J") < 0 || strN.indexOf("outerHTML") >= 0 || strN.indexOf("innerHTML") >= 0 || this.I == null) {
                strH = com.github.catvod.spider.merge.C0.h.b.h(strN, !"搜索".equals(this.r) ? t(strN) : L(strN), map);
            } else {
                String str3 = this.s.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML";
                String str4 = this.I.getAddress(true) + "webparse/" + strN + "<<eval" + (str2.matches(".*Jb?\\d+.*") ? str2.replaceAll(".*Jb?(\\d+).*", "$1") : "") + str3;
                SpiderApi spiderApi2 = this.I;
                if (spiderApi2 != null) {
                    spiderApi2.log("正在使用代理get--> " + str4);
                }
                strH = this.I.webParse(str4, "");
            }
            if (strH == null) {
                strH = "";
            }
        }
        W(map);
        String strY = Y(R(strN, strH));
        boolean z = !"0".equals(this.A) && (this.s.indexOf("y") >= 0 || this.s.indexOf("Y") >= 0 || E("验证").length() > 0) && (strY.indexOf("安全验证") >= 0 || strY.indexOf("输入验证码") >= 0 || strY.indexOf("滑动验证") >= 0 || strY.indexOf("人机验证") >= 0);
        if (z) {
            SpiderApi spiderApi3 = this.I;
            if (spiderApi3 != null) {
                spiderApi3.log("弹窗验证，源码为--> " + strY);
            }
            strTrim = f0("fetch", n.a(strN, strA), strY, E("验证"));
            if (strTrim.indexOf("安全验证") < 0 || strTrim.indexOf("输入验证码") < 0 || strTrim.indexOf("滑动验证") < 0 || strTrim.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.A = "0";
            }
        } else {
            strTrim = strY;
        }
        if (strTrim == null) {
            strTrim = "";
        } else if (!zStartsWith) {
            strTrim = strTrim.replace(" ", "空空空").replaceAll("\\s+", "").replace("空空空", " ").trim();
        }
        this.x = strTrim;
        return strTrim;
    }

    protected final String l(String str) {
        String result;
        String str2;
        String str3;
        OkHttpClient okHttpClientB;
        LinkedHashMap linkedHashMap;
        String strA = n.a("###", str);
        String strN = N(str);
        boolean zStartsWith = strN.startsWith("xp");
        if (zStartsWith) {
            strN = strN.replaceAll("xp(http.*)", "$1");
        }
        String strH = this.s.indexOf("g") >= 0 ? "GBK" : H("编码", "网页编码格式", "Coding_format", "UTF-8");
        if ("UTF-8".equals(strH)) {
            result = "";
        } else {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                spiderApi.log("编码--> " + strH);
            }
            result = i(strN);
        }
        if (result.length() < 1) {
            String strTrim = strN.split(";post;")[1].trim();
            str2 = strN.split(";")[0];
            String str4 = this.s;
            if (str4.indexOf("J") < 0 || str2.indexOf("outerHTML") >= 0 || str2.indexOf("innerHTML") >= 0 || this.I == null) {
                str3 = str2;
            } else {
                str3 = this.I.getAddress(true) + "webparse/" + str2 + "<<eval" + (str4.matches(".*Jb?\\d+.*") ? str4.replaceAll(".*Jb?(\\d+).*", "$1") : "") + (this.s.indexOf("Jb") >= 0 ? ":document.body.innerHTML" : ":document.documentElement.outerHTML");
                SpiderApi spiderApi2 = this.I;
                if (spiderApi2 != null) {
                    spiderApi2.log("正在post代理--> " + str3 + "\npostBody--> " + strTrim);
                }
            }
            HashMap<String, String> mapT = !"搜索".equals(this.r) ? t(str2) : L(str2);
            com.github.catvod.spider.merge.C0.k.b bVar = new com.github.catvod.spider.merge.C0.k.b() { // from class: com.github.catvod.spider.XBPQ.6
                @Override // com.github.catvod.spider.merge.C0.k.c
                protected final void onFailure(Call call, Exception exc) {
                }

                @Override // com.github.catvod.spider.merge.C0.k.c
                protected final /* bridge */ /* synthetic */ void onResponse(String str5) {
                }
            };
            SpiderApi spiderApi3 = this.I;
            if (spiderApi3 != null) {
                spiderApi3.log("发出post请求...");
            }
            if (strTrim.isEmpty()) {
                okHttpClientB = g.b();
                linkedHashMap = null;
            } else if (strTrim.startsWith("{") && strTrim.endsWith("}")) {
                try {
                    g.f(g.b(), str3, new JSONObject(strTrim).toString(), mapT, bVar);
                } catch (JSONException e) {
                    if (this.m) {
                        Init.show(this.G + "调试->fetchPost出错：" + e.toString());
                    }
                    SpiderApi spiderApi4 = this.I;
                    if (spiderApi4 != null) {
                        StringBuilder sbB = com.github.catvod.spider.merge.C0.d.d.b("fetchPost()错误-->");
                        sbB.append(e.toString());
                        spiderApi4.log(sbB.toString());
                    }
                }
                result = bVar.getResult();
            } else {
                linkedHashMap = new LinkedHashMap();
                String[] strArrSplit = strTrim.split("\\&");
                for (String str5 : strArrSplit) {
                    if (!str5.endsWith("=")) {
                        int iIndexOf = str5.indexOf("=");
                        linkedHashMap.put(str5.substring(0, iIndexOf), str5.substring(iIndexOf + 1));
                    }
                }
                okHttpClientB = g.b();
            }
            g.e(okHttpClientB, str3, linkedHashMap, mapT, bVar);
            result = bVar.getResult();
        } else {
            str2 = strN;
        }
        String strY = Y(R(str2, result != null ? result : ""));
        if (!"0".equals(this.A) && (this.s.indexOf("y") >= 0 || this.s.indexOf("Y") >= 0 || E("验证").length() > 0) && (strY.indexOf("安全验证") >= 0 || strY.indexOf("输入验证码") >= 0 || strY.indexOf("滑动验证") >= 0 || strY.indexOf("人机验证") >= 0)) {
            SpiderApi spiderApi5 = this.I;
            if (spiderApi5 != null) {
                spiderApi5.log("需要验证，源码为--> " + strY);
            }
            strY = f0("fetchPost", n.a(str2, strA), strY, E("验证"));
            if (strY.indexOf("安全验证") < 0 || strY.indexOf("输入验证码") < 0 || strY.indexOf("滑动验证") < 0 || strY.indexOf("人机验证") < 0) {
                Init.show("验证成功！");
                this.A = "0";
            }
        }
        if (strY == null) {
            strY = "";
        } else if (!zStartsWith) {
            strY = strY.replace(" ", "空空空").replaceAll("\\s+", "").replace("空空空", " ").trim();
        }
        this.x = strY;
        return strY;
    }

    public Object[] mProxy(Map<String, String> map) {
        return Proxy.proxy(map);
    }

    public boolean manualVideoCheck() {
        return !G("嗅探词", "过滤词", "").isEmpty() || F("手动嗅探", "ManualSniffer").equals("1") || this.s.indexOf("x") >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.String o(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.o(java.lang.String):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public java.lang.String playerContent(java.lang.String r24, java.lang.String r25, java.util.List<java.lang.String> r26) {
        /*
            Method dump skipped, instruction units count: 2543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        JSONObject jSONObjectZ;
        try {
            SpiderApi spiderApi = this.I;
            if (spiderApi != null) {
                spiderApi.log("searchContent(key=" + str + ", quick=" + z + ")");
            }
            this.r = "搜索";
            JSONObject jSONObjectZ2 = Z("", str, z);
            String strReplace = H("特殊分类", "特殊分类url", "特殊分类链接", "").replace(this.f, "");
            if ((G("搜索模式", "ssmoshi", "").equals("0") || (G("搜索后缀", "sousuohouzhui", "").length() > 0 && !G("搜索模式", "ssmoshi", "").equals("1")) || (K("搜索url", "搜索链接", "搜索前", "sousuoqian", "search_url", "searchUrl").indexOf("/ajax/") >= 0 && !G("搜索模式", "ssmoshi", "").equals("1"))) && (jSONObjectZ2 == null || jSONObjectZ2.getJSONArray("list") == null || jSONObjectZ2.getJSONArray("list").length() < 1)) {
                this.B.put("搜索模式", "1");
                this.B.put("搜索模式0", "0");
                jSONObjectZ = Z("", str, z);
                this.B.put("搜索模式0", "");
            } else {
                jSONObjectZ = jSONObjectZ2;
            }
            if (jSONObjectZ != null && jSONObjectZ.getJSONArray("list") != null && jSONObjectZ.getJSONArray("list").length() > 0 && strReplace.indexOf("#http") < 0) {
                return jSONObjectZ.toString();
            }
            JSONArray jSONArray = jSONObjectZ != null ? jSONObjectZ.getJSONArray("list") : new JSONArray();
            for (String str2 : strReplace.split("#h")) {
                if (str2.startsWith("ttp")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("h");
                    sb.append((str2 + "#").replaceAll(".*(ttp.*?)#.*", "$1"));
                    JSONObject jSONObjectZ3 = Z(sb.toString(), str, z);
                    JSONArray jSONArray2 = jSONObjectZ3 != null ? jSONObjectZ3.getJSONArray("list") : new JSONArray();
                    if (jSONArray2.length() > 0) {
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            jSONArray.put(jSONArray2.get(i));
                        }
                    }
                }
            }
            if (jSONArray.length() > 0) {
                return new JSONObject().put("list", jSONArray).toString();
            }
            if (this.s.indexOf("k0") >= 0) {
                this.s = this.s.replace("k0", "");
            }
            JSONObject jSONObjectZ4 = Z(this.f + "/;;搜首页", str, z);
            if (jSONObjectZ4 != null && jSONObjectZ4.getJSONArray("list") != null && jSONObjectZ4.getJSONArray("list").length() > 0) {
                return jSONObjectZ4.toString();
            }
            String[] strArrSplit = this.c.split("#");
            int length = strArrSplit.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                JSONObject jSONObjectZ5 = Z(f(strArrSplit[i2].split("\\$")[1], "1", false, null) + ";;搜首页", str, z);
                JSONArray jSONArray3 = jSONObjectZ5 != null ? jSONObjectZ5.getJSONArray("list") : new JSONArray();
                if (jSONArray3.length() > 0) {
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        jSONArray.put(jSONArray3.get(i3));
                    }
                } else {
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception e) {
                    }
                    i2++;
                }
            }
            this.r = "";
            return jSONArray.length() > 0 ? new JSONObject().put("list", jSONArray).toString() : "";
        } catch (Exception e2) {
            if (this.m) {
                Init.show(this.G + "调试->searchContent出错：" + e2.toString());
            }
            SpiderApi spiderApi2 = this.I;
            if (spiderApi2 != null) {
                com.github.catvod.spider.merge.C0.i.b.a(e2, com.github.catvod.spider.merge.C0.d.d.b("searchContent()错误-->"), spiderApi2);
            }
            this.r = "";
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.util.HashMap<java.lang.String, java.lang.String> t(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.t(java.lang.String):java.util.HashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03d0 A[Catch: Exception -> 0x02d8, TRY_LEAVE, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0222 A[EDGE_INSN: B:126:0x0222->B:52:0x0222 BREAK  A[LOOP:0: B:26:0x0177->B:29:0x01a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x032f A[EDGE_INSN: B:127:0x032f->B:84:0x032f BREAK  A[LOOP:1: B:53:0x025d->B:83:0x0321], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0181 A[Catch: Exception -> 0x02d8, TRY_LEAVE, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ba A[Catch: Exception -> 0x02d8, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01df A[Catch: Exception -> 0x02d8, TRY_LEAVE, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0267 A[Catch: Exception -> 0x02d8, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0338 A[Catch: Exception -> 0x02d8, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x035d A[Catch: Exception -> 0x02d8, TryCatch #6 {Exception -> 0x02d8, blocks: (B:3:0x0001, B:5:0x001a, B:7:0x0025, B:8:0x003c, B:10:0x0054, B:12:0x005a, B:13:0x0061, B:25:0x0122, B:26:0x0177, B:28:0x0181, B:52:0x0222, B:53:0x025d, B:55:0x0267, B:56:0x0278, B:58:0x0282, B:60:0x0288, B:61:0x0290, B:63:0x02b6, B:67:0x02c3, B:65:0x02bd, B:78:0x0310, B:80:0x0316, B:82:0x031c, B:83:0x0321, B:84:0x032f, B:86:0x0338, B:88:0x0344, B:89:0x0347, B:90:0x034b, B:92:0x035d, B:94:0x0364, B:96:0x0370, B:98:0x0376, B:99:0x0387, B:100:0x038e, B:101:0x03b0, B:102:0x03d0, B:34:0x01b4, B:36:0x01ba, B:37:0x01d9, B:39:0x01df), top: B:123:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String xpDetailContent(java.util.List<java.lang.String> r17) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XBPQ.xpDetailContent(java.util.List):java.lang.String");
    }
}
