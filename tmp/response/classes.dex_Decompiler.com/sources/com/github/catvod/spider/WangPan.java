package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.a.C0098a;
import com.github.catvod.spider.merge.b.C0099A;
import com.github.catvod.spider.merge.b.C0104F;
import com.github.catvod.spider.merge.b.C0110L;
import com.github.catvod.spider.merge.b.U;
import com.github.catvod.spider.merge.b.x;
import com.github.catvod.spider.merge.b.y;
import com.github.catvod.spider.merge.c.h;
import com.github.catvod.spider.merge.c.k;
import com.github.catvod.spider.merge.n.C0197c;
import com.github.catvod.spider.merge.p.C0207D;
import com.github.catvod.spider.merge.p.C0219l;
import com.github.catvod.spider.merge.p.C0221n;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: /tmp/decompiler/446907477a41490d9e71cfdd71d695e7/classes.dex */
public class WangPan extends Spider {
    public static final Pattern a = Pattern.compile(C0098a.a(new byte[]{58, 48, 23, -103, -7, -82, -78, -115, 107, 50, 14, -118, -91, -90, -88, -127, 60, 36, 15, -125, -85, -72, -87, -109, 60, 38, 12, -121, -89, -82, -80, -54, 113, 40, 13, -57, -8, -68, -15, -52, 73, 25, 79, -77, -4, -26, -10, -53, 116, 40, 12, -118, -78, -67, -15, -52, 73, 25, 79, -77, -4, -26, -9, -37}, new byte[]{18, 71, 96, -18, -41, -49, -34, -28}));
    public static final Pattern b = Pattern.compile(C0098a.a(new byte[]{-1, -42, -1, -28, 22, -67, 93, -62, -28, -103, -14, -92, 72, -69, 19, -104, -44, -23, -66, -105, 76, -31, 3}, new byte[]{-113, -73, -111, -54, 103, -56, 60, -80}));
    public static final Pattern c = Pattern.compile(C0098a.a(new byte[]{31, 112, -18, 120, 114, -99, -51, -109, 85, 97, -23, 33, 100, -100, -112, -85, 37, 45, -72, 83, 60, -102, -112, -84, 68, 44, -83, 39, 40}, new byte[]{123, 2, -121, 14, 23, -77, -72, -16}));
    public static final Pattern d = Pattern.compile(C0098a.a(new byte[]{-18, 66, 77, 73, -57, -63, 112, 74, -73, 31, 5, 58, -102, -33, 106, 34, -57, 26, 103, 62, -64}, new byte[]{-103, 53, 58, 21, -23, -16, 66, 121}));
    public static final Pattern e = Pattern.compile(C0098a.a(new byte[]{-50, 39, 17, -73, 127, 121, 20, 73, -38, 51, 35, -59, 50, 116, 24, 15, -51, 105, 78, -61, 10, 69, 74, 125, -107, 111, 35, -44, 33, 108, 17, 29, -106, 29, 33, -51, 12, 48, 92, 4}, new byte[]{-66, 70, 127, -21, 81, 27, 117, 32}));

    private static String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement(C0098a.a(new byte[]{-3}, new byte[]{-108, -50, -36, -75, 73, 126, 114, -28}));
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement(C0098a.a(new byte[]{115, -45, -54, 124, 108, -16, -30, 118, 117, -55}, new byte[]{16, -69, -85, 8, 31, -107, -112, 0}));
            elementCreateElement2.setTextContent(C0098a.a(new byte[]{-115, 75, 95, -57, -73, -96, -51, -48, -63, 59, 119, -88, -23, -66, -120, -110, -3, 83}, new byte[]{104, -33, -49, 35, 15, 41, 40, 116}));
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement(C0098a.a(new byte[]{124, 63, 45, 71, 7, 37}, new byte[]{31, 87, 76, 51, 110, 65, 11, -33}));
            elementCreateElement3.setTextContent(C0098a.a(new byte[]{-61}, new byte[]{-13, 117, -55, -23, 60, 46, -85, 5}));
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement(C0098a.a(new byte[]{-4, -126, -56, 32, 22, 91, -120}, new byte[]{-111, -21, -69, 83, 127, 52, -26, -41}));
            elementCreateElement4.setTextContent(C0098a.a(new byte[]{4}, new byte[]{52, -36, 51, -39, 3, 12, 61, 50}));
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement(C0098a.a(new byte[]{-61, -104, 89, -48, 38, 38, -70, -119}, new byte[]{-82, -7, 33, -68, 79, 75, -45, -3}));
            elementCreateElement5.setTextContent(C0098a.a(new byte[]{-30, 47, 46, -33}, new byte[]{-45, 26, 30, -17, -2, 97, -26, -83}));
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement(C0098a.a(new byte[]{33, 110, -50, -45, -67}, new byte[]{82, 26, -81, -89, -40, -127, 6, 12}));
            elementCreateElement6.setTextContent(C0098a.a(new byte[]{79}, new byte[]{127, -124, -20, -101, 126, 54, 127, 92}));
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement(C0098a.a(new byte[]{18, 104, 23, -81, 44, -112, -23, -38, 5}, new byte[]{96, 13, 118, -61, 115, -2, -120, -73}));
            elementCreateElement7.setTextContent(C0098a.a(new byte[]{-43}, new byte[]{-27, 120, 76, -103, 35, -55, 6, -86}));
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement(C0098a.a(new byte[]{-111, 71, 50, 99, -50, 114}, new byte[]{-30, 40, 71, 17, -83, 23, 61, -55}));
            elementCreateElement8.setTextContent(C0098a.a(new byte[]{-46, 17, -50}, new byte[]{-71, 60, -72, -1, 33, -122, 61, -26}));
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement(C0098a.a(new byte[]{-15}, new byte[]{-107, -41, -85, -78, -115, -100, -86, 5}));
            elementCreateElement9.setAttribute(C0098a.a(new byte[]{11}, new byte[]{123, -76, -117, -109, 80, -128, -16, -19}), C0098a.a(new byte[]{-3, 82, -93, 55, 104, 38, -109, 92, -1, 84, -72, 55, 117, 34, -98, 64}, new byte[]{-50, 98, -113, 6, 68, 20, -90, 112}));
            elementCreateElement9.setTextContent(C0098a.a(new byte[]{122, 57, 73, -47, 101, 106, 41, 27, 15, 96, 123, -96, 44, 97, 92, -101, -67, 109, 110, -92, 47, 100, 68, 68, 57, 33, 30, -116, 64, 58, 90, 1, 123, 29, 118}, new byte[]{-99, -120, -6, 52, -53, -36, -51, -95}));
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(C0098a.a(new byte[]{21, 47, -49, 126, -59, 23, -115}, new byte[]{113, 78, -95, 19, -80, 124, -8, -108}));
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                String str2 = String.format(C0098a.a(new byte[]{114, 47, -15, 111, -54, -25, 51, -73, 114, 47}, new byte[]{87, 92, -35, 94, -26, -43, 6, -101}), jSONArrayOptJSONArray2.optString(0), Integer.valueOf(Integer.parseInt((jSONArrayOptJSONArray2.optString(2).contains(C0098a.a(new byte[]{-98, -68, 44}, new byte[]{-20, -37, 78, -118, 116, -31, 118, 55})) ? C0098a.a(new byte[]{-90, 58, 13, -58, -90, 98, 39, 98}, new byte[]{-123, 124, 75, -128, -32, 36, 97, 36}) : jSONArrayOptJSONArray2.optString(2)).replace(C0098a.a(new byte[]{124}, new byte[]{95, 37, 59, -44, 35, 43, -84, -82}), ""), 16)));
                Element elementCreateElement10 = documentNewDocument.createElement(C0098a.a(new byte[]{-5}, new byte[]{-97, -102, -24, -24, 3, 73, 105, 126}));
                elementCreateElement10.setAttribute(C0098a.a(new byte[]{2}, new byte[]{114, -128, 68, 28, 56, -55, -65, -87}), str2);
                elementCreateElement10.setTextContent(strOptString);
                elementCreateElement.appendChild(elementCreateElement10);
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty(C0098a.a(new byte[]{106, -14, 14, -26, -97, -117, -27, -54}, new byte[]{15, -100, 109, -119, -5, -30, -117, -83}), C0098a.a(new byte[]{-58, -51, 10, -50, -119}, new byte[]{-109, -103, 76, -29, -79, 11, -50, 55}));
            transformerNewTransformer.setOutputProperty(C0098a.a(new byte[]{62, -60, 127, 115, 122, -58}, new byte[]{87, -86, 27, 22, 20, -78, 43, -85}), C0098a.a(new byte[]{-7, -9, -113}, new byte[]{-128, -110, -4, 14, -42, -78, -52, -14}));
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e2) {
            y.c(new byte[]{-35, 66, 10, 15, -120, 84, 52, -56, -125, 51, 44, 124, -27, 67, 107, -99, -82, 79, -81}, new byte[]{58, -42, -107, -23, 0, -60, -47, 116}, new StringBuilder(), e2);
            return "";
        }
    }

    private k b(Matcher matcher, String str) {
        return C0110L.p().z(matcher.group(1), matcher.groupCount() == 4 ? matcher.group(4) : "", str);
    }

    private k c(Matcher matcher, String str) {
        return U.t().F(matcher.group(1), matcher.groupCount() == 4 ? matcher.group(4) : "", str);
    }

    public static Object[] getDanMu(Map<String, String> map) {
        SpiderDebug.log(C0098a.a(new byte[]{92, 74, -35, -11, -112, 30, -11, 109, 27, 92, -35, -48, -125, 4}, new byte[]{59, 47, -87, -79, -15, 112, -72, 24}));
        Object[] objArr = {200, C0098a.a(new byte[]{55, -66, 16, -58, 60, 103, 64, 23, 120, -5, 11, -38, 114, 109, 94, 30, 55, -26, 29, -58, 117, 50, 21}, new byte[]{67, -37, 104, -78, 19, 31, 45, 123}), new ByteArrayInputStream("".getBytes())};
        try {
            String str = map.get(C0098a.a(new byte[]{93, 103, -37, 122, -43, 113, 64}, new byte[]{43, 8, -65, 52, -76, 28, 37, 59}));
            if (TextUtils.isEmpty(str)) {
                return objArr;
            }
            String vodUrlByNameAndIndex = getVodUrlByNameAndIndex(getRealName(str), getVodIndex(map.get(C0098a.a(new byte[]{105, 7, 13, 11, 45, -25, 41, 89}, new byte[]{31, 104, 105, 66, 67, -125, 76, 33}))));
            if (vodUrlByNameAndIndex.isEmpty()) {
                return objArr;
            }
            String strL = C0197c.l(String.format(C0098a.a(new byte[]{-49, -73, 73, 71, -98, 28, -55, -87, -127, -79, 89, 86, -115, 30, -103, -7, -103}, new byte[]{-22, -60, 102, 35, -1, 114, -92, -36}), C0221n.c(), vodUrlByNameAndIndex), null);
            if (TextUtils.isEmpty(strL)) {
                strL = a(C0197c.l(String.format(C0098a.a(new byte[]{-15, 77, -85, -74, 95, 28, -56, 20, -3, 84, -76, -77, 2, 82, -113, 94, -1, 80, -77, -93, 68, 73, -108, 79, -16, 87, -72, -24, 79, 73, -118, 20, -90, 88, -68, -5, 72, 75, -63, 78, -21, 85, -30, -29, 95}, new byte[]{-103, 57, -33, -58, 44, 38, -25, 59}), vodUrlByNameAndIndex), null));
            }
            objArr[2] = new ByteArrayInputStream(strL.getBytes());
            C0219l.b(C0098a.a(new byte[]{-94, 101, -5, 43, -23, -69, -71, 20, -24, 60, -56, 102}, new byte[]{71, -39, 66, -50, 80, 46, 92, -124}));
            return objArr;
        } catch (Exception e2) {
            SpiderDebug.log(C0098a.a(new byte[]{28, -31, 33, -61, -58, 45, -113, -66}, new byte[]{120, -128, 79, -82, -77, 13, -22, -124}) + e2.getMessage());
            return objArr;
        }
    }

    public static String getRealName(String str) {
        int length;
        String strA;
        String strSubstring;
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.endsWith(C0098a.a(new byte[]{-128, 64, -89, 76, 86, 88, 9, 33}, new byte[]{-88, -88, 32, -9, -77, -27, -96, 8}))) {
            strSubstring = strTrim.substring(0, strTrim.length() - C0098a.a(new byte[]{-44, 9, -44, -104, -74, 57, 121, -97}, new byte[]{-4, -31, 83, 35, 83, -124, -48, -74}).length());
        } else {
            if (strTrim.endsWith(C0098a.a(new byte[]{-128, 123, -47, -85, 80, 86}, new byte[]{103, -55, 117, 67, -1, -5, 97, 82}))) {
                length = strTrim.length();
                strA = C0098a.a(new byte[]{-66, 9, -6, 65, 9, 52}, new byte[]{89, -69, 94, -87, -90, -103, -16, -65});
            } else {
                if (!strTrim.endsWith(C0098a.a(new byte[]{-82, 88, -56, 26, -80, -100}, new byte[]{75, -61, 117, -14, 31, 49, -40, -122}))) {
                    return strTrim;
                }
                length = strTrim.length();
                strA = C0098a.a(new byte[]{-49, -2, 44, -17, -21, -85}, new byte[]{42, 101, -111, 7, 68, 6, 64, 126});
            }
            strSubstring = strTrim.substring(0, length - strA.length());
        }
        return strSubstring.trim();
    }

    public static int getVodIndex(String str) {
        String strGroup;
        if (str != null && !str.isEmpty()) {
            if (str.contains(C0098a.a(new byte[]{25}, new byte[]{74, -85, -73, 101, 62, -112, 48, -82})) && str.contains(C0098a.a(new byte[]{-36}, new byte[]{-103, 81, 44, -52, -56, 79, -48, -57}))) {
                Matcher matcher = Pattern.compile(C0098a.a(new byte[]{-120, -53, 92, -120, -79, -10, -56, 41, -28, -39, 80, -59, -91, -9, -47, 101, -96, -46, 44, -34, -25, -10}, new byte[]{-37, -29, 0, -20, -102, -33, -115, 1}), 2).matcher(str);
                if (matcher.find()) {
                    strGroup = matcher.group(2);
                    return Integer.parseInt(strGroup);
                }
            } else {
                Matcher matcher2 = Pattern.compile(C0098a.a(new byte[]{1, -57, -5, -36, 106, -99, 8, 90, 4, -31, -34, -38, 25, -24, 121, 71, 1, -92, -91, -85, 48, -98, 125, 17, 0, -92, -74}, new byte[]{41, -101, -97, -9, 67, -75, 83, 59})).matcher(str.split(C0098a.a(new byte[]{20, -109}, new byte[]{72, -67, -78, -102, -81, 47, -125, -73}))[0]);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                    return Integer.parseInt(strGroup);
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0b28 A[Catch: Exception -> 0x0c08, TryCatch #1 {Exception -> 0x0c08, blocks: (B:17:0x05b6, B:19:0x07e0, B:21:0x0941, B:23:0x0995, B:25:0x0a46, B:28:0x0a54, B:29:0x0a57, B:31:0x0a5d, B:33:0x0a67, B:34:0x0a6d, B:36:0x0b22, B:38:0x0b28, B:40:0x0b5e, B:41:0x0bb3, B:35:0x0a73, B:42:0x0bb4, B:43:0x0c07), top: B:49:0x05b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0b5e A[Catch: Exception -> 0x0c08, TryCatch #1 {Exception -> 0x0c08, blocks: (B:17:0x05b6, B:19:0x07e0, B:21:0x0941, B:23:0x0995, B:25:0x0a46, B:28:0x0a54, B:29:0x0a57, B:31:0x0a5d, B:33:0x0a67, B:34:0x0a6d, B:36:0x0b22, B:38:0x0b28, B:40:0x0b5e, B:41:0x0bb3, B:35:0x0a73, B:42:0x0bb4, B:43:0x0c07), top: B:49:0x05b6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getVodUrlByNameAndIndex(java.lang.String r30, int r31) {
        /*
            Method dump skipped, instruction units count: 3212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.WangPan.getVodUrlByNameAndIndex(java.lang.String, int):java.lang.String");
    }

    public static Object[] proxy(Map<String, String> map) {
        String str = map.get(C0098a.a(new byte[]{32, 70, -11, -128}, new byte[]{84, 63, -123, -27, 124, -78, 48, 111}));
        String str2 = map.get(C0098a.a(new byte[]{-95, 3, -5, -104}, new byte[]{-46, 106, -113, -3, -71, 118, 107, 6}));
        if (C0098a.a(new byte[]{-17, -35, 107, 64, -27}, new byte[]{-103, -76, 15, 37, -118, -80, -64, 34}).equals(str)) {
            return C0098a.a(new byte[]{-113, 35, -112, -67, 95}, new byte[]{-2, 86, -15, -49, 52, 23, 115, 96}).equals(str2) ? C0110L.p().H(map) : C0098a.a(new byte[]{105, -90}, new byte[]{28, -59, -128, -9, -55, 122, 32, 52}).equals(str2) ? U.t().M(map) : x.p().H(map);
        }
        if (C0098a.a(new byte[]{-94, -119, -103}, new byte[]{-47, -4, -5, -54, 26, 65, -78, 54}).equals(str)) {
            return x.p().G(map);
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String strTrim = list.get(0).trim();
        Matcher matcher = a.matcher(strTrim);
        if (matcher.find()) {
            return h.p(x.p().z(strTrim, matcher.group(2), matcher.groupCount() == 4 ? matcher.group(4) : ""));
        }
        Matcher matcher2 = b.matcher(strTrim);
        if (matcher2.find()) {
            return h.p(b(matcher2, strTrim));
        }
        Matcher matcher3 = d.matcher(strTrim);
        if (matcher3.find()) {
            return h.p(C0104F.j().n(matcher3.group(1), strTrim));
        }
        Matcher matcher4 = e.matcher(strTrim);
        if (matcher4.find()) {
            return h.p(C0099A.e().o(matcher4.group(1), matcher4.group(2), strTrim));
        }
        Matcher matcher5 = c.matcher(strTrim);
        return matcher5.find() ? h.p(c(matcher5, strTrim)) : "";
    }

    public String detailContentVodPlayFrom(List<String> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= list.size(); i++) {
            int i2 = i - 1;
            if (list.get(i2).contains(C0098a.a(new byte[]{111, -45, 75, -72, 51}, new byte[]{30, -90, 42, -54, 88, -70, 62, 23}))) {
                arrayList.add(String.format(Locale.getDefault(), C0098a.a(new byte[]{77, 15, 19, 20, 73, 68, -57, 94, 55, 76, 63, 74, -17, -22, 18, -30, -52}, new byte[]{-88, -85, -85, -15, -52, -49, 34, -48}), Integer.valueOf(i)));
                str = String.format(Locale.getDefault(), C0098a.a(new byte[]{64, -49, 29, 48, 31, -73, -106, 25, 33, -125, 2, 93, -71, 25, 79, -119, -63}, new byte[]{-91, 107, -91, -43, -102, 60, 127, -69}), Integer.valueOf(i));
            } else if (list.get(i2).contains(C0098a.a(new byte[]{-98, 4}, new byte[]{-21, 103, 1, -16, -79, -52, 73, 108}))) {
                arrayList.add(String.format(Locale.getDefault(), C0098a.a(new byte[]{71, 121, -47, -6, 124, 116, 110, -89, 49, 31, 4, 70, -121}, new byte[]{18, 58, 52, 116, -29, -109, -6, 28}), Integer.valueOf(i)));
                str = String.format(Locale.getDefault(), C0098a.a(new byte[]{-128, 53, 112, 39, -20, -124, 70, 28, -10, 83, -87, -73, 12}, new byte[]{-43, 118, -103, -123, 104, 108, -31, -108}), Integer.valueOf(i));
            } else if (list.get(i2).contains(C0098a.a(new byte[]{-3, 99, -26}, new byte[]{-52, 81, -43, -99, -21, 90, 127, 99}))) {
                str = String.format(Locale.getDefault(), C0098a.a(new byte[]{-93, 62, -33, 123, 16, -40, 67, 32, 41, 47, -55, -82, -84, 35}, new byte[]{-110, 12, -20, -98, -98, 71, -92, -76}), Integer.valueOf(i));
            } else if (list.get(i2).contains(C0098a.a(new byte[]{-95, -51, -59, 100, 19}, new byte[]{-61, -84, -84, 0, 102, -35, 102, 40}))) {
                str = String.format(Locale.getDefault(), C0098a.a(new byte[]{-60, -48, -29, -6, -122, 73, -58, -9, 18, -114, 122, 121, 83, -11, 61}, new byte[]{-122, 53, 89, 92, 99, -57, 89, 16}), Integer.valueOf(i));
            } else {
                arrayList.add(String.format(Locale.getDefault(), C0098a.a(new byte[]{-76, 47, 100, -97, 39, 27, 40, -90, -62, 80, 79, -51, -125, -78, -3, 26, 57}, new byte[]{93, -73, -37, 118, -96, -105, -51, 40}), Integer.valueOf(i)));
                str = String.format(Locale.getDefault(), C0098a.a(new byte[]{36, -99, -96, 120, 75, -97, -21, -72, 99, -30, -117, 42, -17, 54, 61, 19, -87}, new byte[]{-51, 5, 31, -111, -52, 19, 13, 33}), Integer.valueOf(i));
            }
            arrayList.add(str);
        }
        return TextUtils.join(C0098a.a(new byte[]{124, -122, 14}, new byte[]{88, -94, 42, 75, 126, -97, 69, 6}), arrayList);
    }

    public String detailContentVodPlayUrlWithVodName(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            Matcher matcher = b.matcher(str2);
            if (matcher.find()) {
                arrayList.add(b(matcher, str).a());
            }
            Matcher matcher2 = c.matcher(str2);
            if (matcher2.find()) {
                arrayList.add(c(matcher2, str).a());
            }
            Matcher matcher3 = d.matcher(str2);
            if (matcher3.find()) {
                arrayList.add(C0104F.j().n(matcher3.group(1), str).a());
            }
            Matcher matcher4 = e.matcher(str2);
            if (matcher4.find()) {
                arrayList.add(C0099A.e().o(matcher4.group(1), matcher4.group(2), str).a());
            }
        }
        return TextUtils.join(C0098a.a(new byte[]{-32, -117, -9}, new byte[]{-60, -81, -45, 127, 30, 47, -101, 89}), arrayList);
    }

    public void init(Context context, String str) {
        try {
            if (str.isEmpty()) {
                return;
            }
            context.getFilesDir();
            C0207D.w(str);
        } catch (Exception unused) {
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        return str.contains(C0098a.a(new byte[]{51, -43, 121, 74, 40, 69}, new byte[]{-38, 77, -58, -93, -81, -55, -3, 44})) ? x.p().E(str2.split(C0098a.a(new byte[]{52, -36}, new byte[]{104, -9, 16, -47, 68, -49, -96, -72})), str) : str.contains(C0098a.a(new byte[]{65, 102, 68, 1, 42, 93}, new byte[]{-92, -62, -4, -28, -81, -42, -108, 70})) ? C0110L.p().F(str2.split(C0098a.a(new byte[]{-40, -91}, new byte[]{-124, -114, -91, -24, 11, 99, -46, 77})), str) : str.contains(C0098a.a(new byte[]{100, -95, 48}, new byte[]{85, -109, 3, 112, 90, 97, 64, 110})) ? C0104F.j().r(str2.split(C0098a.a(new byte[]{-127, 105}, new byte[]{-35, 66, -113, -7, 66, -40, -25, -33}))) : str.contains(C0098a.a(new byte[]{-80, 81, -89, 59}, new byte[]{-14, -76, 29, -99, 118, -118, -39, 25})) ? C0099A.e().q(str2.split(C0098a.a(new byte[]{-11, -96}, new byte[]{-87, -117, -105, -100, 65, -17, 114, -71}))) : U.t().K(str2.split(C0098a.a(new byte[]{-123, 32}, new byte[]{-39, 11, -31, 54, 44, -49, 124, -16})), str);
    }
}
