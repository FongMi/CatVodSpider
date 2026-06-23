package com.github.catvod.spider.merge.m;

import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.m.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /tmp/decompiler/61445fe823f54055bb8486d86e79a950/classes.dex */
public final class C0594c {
    public static String a(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic;
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        try {
            publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str2.getBytes(), 0)));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            publicKeyGeneratePublic = null;
        }
        cipher.init(1, publicKeyGeneratePublic);
        byte[] bArrDoFinal = cipher.doFinal(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDoFinal) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static String b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement("i");
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement("chatserver");
            elementCreateElement2.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement("chatid");
            elementCreateElement3.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement("mission");
            elementCreateElement4.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement("maxlimit");
            elementCreateElement5.setTextContent("1500");
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement("state");
            elementCreateElement6.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement("real_name");
            elementCreateElement7.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement("source");
            elementCreateElement8.setTextContent("k-v");
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement("d");
            elementCreateElement9.setAttribute("p", "30,1,25,16711680");
            elementCreateElement9.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("danmuku");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                jSONArrayOptJSONArray2.optString(2);
                String str2 = String.format("%s,1,25,%s", jSONArrayOptJSONArray2.optString(0), generateCombinedRGB());
                Element elementCreateElement10 = documentNewDocument.createElement("d");
                elementCreateElement10.setAttribute("p", str2);
                elementCreateElement10.setTextContent(strOptString);
                elementCreateElement.appendChild(elementCreateElement10);
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            transformerNewTransformer.setOutputProperty("indent", "yes");
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e) {
            SpiderDebug.log("生成弹幕出错:" + e);
            return "";
        }
    }

    private static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            documentNewDocument.setXmlStandalone(true);
            Element elementCreateElement = documentNewDocument.createElement("i");
            documentNewDocument.appendChild(elementCreateElement);
            Element elementCreateElement2 = documentNewDocument.createElement("chatserver");
            elementCreateElement2.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement2);
            Element elementCreateElement3 = documentNewDocument.createElement("chatid");
            elementCreateElement3.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement3);
            Element elementCreateElement4 = documentNewDocument.createElement("mission");
            elementCreateElement4.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement4);
            Element elementCreateElement5 = documentNewDocument.createElement("maxlimit");
            elementCreateElement5.setTextContent("1500");
            elementCreateElement.appendChild(elementCreateElement5);
            Element elementCreateElement6 = documentNewDocument.createElement("state");
            elementCreateElement6.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement("real_name");
            elementCreateElement7.setTextContent("0");
            elementCreateElement.appendChild(elementCreateElement7);
            Element elementCreateElement8 = documentNewDocument.createElement("source");
            elementCreateElement8.setTextContent("k-v");
            elementCreateElement.appendChild(elementCreateElement8);
            Element elementCreateElement9 = documentNewDocument.createElement("d");
            elementCreateElement9.setAttribute("p", "30,1,25,16711680");
            elementCreateElement9.setTextContent("");
            elementCreateElement.appendChild(elementCreateElement9);
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("danmuku");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
                String strOptString = jSONArrayOptJSONArray2.optString(4);
                jSONArrayOptJSONArray2.optString(2);
                String str2 = String.format("%s,1,25,%s", jSONArrayOptJSONArray2.optString(0), generateCombinedWhite());
                Element elementCreateElement10 = documentNewDocument.createElement("d");
                elementCreateElement10.setAttribute("p", str2);
                elementCreateElement10.setTextContent(strOptString);
                elementCreateElement.appendChild(elementCreateElement10);
            }
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("encoding", "UTF-8");
            transformerNewTransformer.setOutputProperty("indent", "yes");
            DOMSource dOMSource = new DOMSource(documentNewDocument);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            transformerNewTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
            return byteArrayOutputStream.toString();
        } catch (Exception e) {
            SpiderDebug.log("生成弹幕出错:" + e);
            return "";
        }
    }

    public static String generateCombinedRGB() {
        String[] strArr = {"16776951", "16752723", "7372800", "16645625", "10000639", "5729279", "16625919", "16777215", "16772810", "11053224", "16185078", "16209488", "15441662", "16772863", "16777046", "16766740", "16766719", "10251342", "8294399", "11835903", "5271600", "16766445", "13882321", "16766758", "16761087", "16744447", "16773119", "16759917", "12334518", "10223615", "5723135", "9997823", "14410239", "16777014", "16772362", "8423620", "6529791", "4686724", "9957375", "16643061", "10000536", "11140194", "16777210", "16646143", "16646141", "16711678", "16777212", "16711674", "16383999"};
        return strArr[new Random().nextInt(strArr.length)];
    }

    public static String generateCombinedWhite() {
        return "16777215";
    }
}
