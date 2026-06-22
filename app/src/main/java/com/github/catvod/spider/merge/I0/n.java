package com.github.catvod.spider.merge.i0;

import com.github.catvod.crawler.SpiderDebug;
import java.io.File;
import java.io.FileWriter;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: /tmp/decompiler/3c5abd9eeb9c4becbc43dcd6f345eaa4/classes.dex */
public final class n {
    public static File a(File file) {
        File fileF = com.github.catvod.spider.merge.g.b.f("subtitles.srt");
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
            document.getDocumentElement().normalize();
            FileWriter fileWriter = new FileWriter(fileF);
            NodeList elementsByTagName = document.getElementsByTagName("text");
            int i = 0;
            while (i < elementsByTagName.getLength()) {
                Element element = (Element) elementsByTagName.item(i);
                double d = Double.parseDouble(element.getAttribute("start"));
                double d2 = Double.parseDouble(element.getAttribute("dur"));
                String strTrim = element.getTextContent().trim();
                String strB = b(d);
                String strB2 = b(d + d2);
                StringBuilder sb = new StringBuilder();
                i++;
                sb.append(i);
                sb.append("\n");
                fileWriter.write(sb.toString());
                fileWriter.write(strB + " --> " + strB2 + "\n");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strTrim);
                sb2.append("\n\n");
                fileWriter.write(sb2.toString());
            }
            fileWriter.close();
            SpiderDebug.log("转换完成，SRT 文件生成在：" + fileF.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileF;
    }

    private static String b(double d) {
        double d2 = (int) d;
        Double.isNaN(d2);
        return String.format("%02d:%02d:%02d,%03d", Integer.valueOf((int) (d / 3600.0d)), Integer.valueOf((int) ((d % 3600.0d) / 60.0d)), Integer.valueOf((int) (d % 60.0d)), Integer.valueOf((int) ((d - d2) * 1000.0d)));
    }
}
