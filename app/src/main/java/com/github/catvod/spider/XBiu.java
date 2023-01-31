package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.utils.Misc;
import com.github.catvod.utils.okhttp.OKCallBack;
import com.github.catvod.utils.okhttp.OkHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import okhttp3.Call;

public class XBiu extends Spider {

    protected String ext = null;
    public JSONObject rule = null;
    // 默认的视频类型
    private ArrayList<String> videoFormatList = new ArrayList<>(Arrays.asList(".m3u8", ".mp4", ".mpeg", ".flv", ".mkv"));


    protected final int base64Flag = Base64.DEFAULT | Base64.URL_SAFE | Base64.NO_WRAP;
    // 一定是正确的分类名称，用来帮助定位分类列表，猜cateManual
    protected final ArrayList<String> cateManuals = new ArrayList<>(Arrays.asList("电影", "剧集", "电视剧", "连续剧", "综艺", "动漫"));
    // 无效的分类名，彡来过滤cateManual
    protected final ArrayList<String> invalidCateNames = new ArrayList<>(Arrays.asList("更多","下载", "首页", "资讯", "留言", "导航", "专题", "短视频", "热榜", "排行", "追剧","更新","APP", "直播", "label", "Netflix"));
    // 详情页 影片信息相关字段，猜详情页信息时用
    protected final ArrayList<String> detailItemNames = new ArrayList<>(Arrays.asList("导演", "主演", "演员", "地区", "类型", "年份", "年代"));
    protected final ArrayList<String> detailItemKeys = new ArrayList<>(Arrays.asList("vod_director", "vod_actor", "vod_actor", "vod_area", "type_name", "vod_year", "vod_year"));
    protected String splitFlag = ""; // 分段标志,猜cateManual时用

    // html标签查找时用到的辅助类
    protected class HtmlMatchInfo {
        public String group0; // 正则表达式匹配到的字符串
        /**
         * 一般用来放href中的内容
         */
        public String group1; //
        public String group2; //
        public String diff;   // 两个匹配结果比较group1得到的不同部分
        public int startPos;    // 正则匹配到的起始位置
        public int endPos;      // 正则匹配到的结束位置
        public ArrayList<Integer> uploads;  // 祖先结节的索引
        public int matchedUpNodePos = -1;   // 与其他HtmlMatchInfo最匹配的祖先节点位置
        public int diffStartIndex;   // 不同那部分数据的开始位置
        public int diffEndIndex; // 不同那部分数据的结束位置

        public void init(Matcher m) {
            this.group0 = m.group(0);
            if (m.groupCount() > 0)
                this.group1 = m.group(1);
            if (m.groupCount() > 1)
                this.group2 = m.group(2);
            this.startPos = m.start(0);
            this.endPos = m.end(0);
        }

        // 通过比较两个group1的不同部分，不同部分的内容以splitFlag中的字符为开始或结束位置
        public boolean findDiffStr(HtmlMatchInfo rhs, String splitFlag) {
            int len = Math.min(group1.length(), rhs.group1.length());
            // 找不同字符的开始位置
            for (int i =0; i < len; ++i){
                char a = group1.charAt(i);
                char b = rhs.group1.charAt(i);
                if(a== b &&  splitFlag.indexOf (a) != -1) {
                    diffStartIndex = i+1;
                    rhs.diffStartIndex = i+1;
                }
                if(a != b) break;
            }

            // 找不同字符的结束位置
            diffEndIndex = group1.length();
            rhs.diffEndIndex = rhs.group1.length();
            for (int i =1; i < len; ++i){
                char a = group1.charAt(group1.length()-i);
                char b = rhs.group1.charAt(rhs.group1.length()-i);
                if(a== b && splitFlag.indexOf (a) != -1) {
                    diffEndIndex = group1.length()-i;
                    rhs.diffEndIndex = rhs.group1.length()-i;
                }
                if(a != b) break;
            }
            if(this.diff == null || this.diff.isEmpty() && diffStartIndex < diffEndIndex) {
                diff = group1.substring(diffStartIndex, diffEndIndex);
            }else{
                if( diffEndIndex < diffStartIndex || !diff.equals(group1.substring(diffStartIndex, diffEndIndex))){
                    return false;
                }
            }
            if(rhs.diffStartIndex < rhs.diffEndIndex) {
                rhs.diff = rhs.group1.substring(rhs.diffStartIndex, rhs.diffEndIndex);
            }
            return true;
        }

        // 判断 rhs 与当前对象是有相同的祖先节点
        boolean hasSameUpNode(HtmlMatchInfo rhs) {
            if (rhs.uploads.size() != this.uploads.size()) return false;
            for (int i = 0; i < uploads.size(); ++i) {
                if (uploads.get(i).intValue() != rhs.uploads.get(i).intValue()) continue;
                if (matchedUpNodePos == -1 || uploads.get(i).intValue() == matchedUpNodePos) {
                    matchedUpNodePos = uploads.get(i).intValue();
                    rhs.matchedUpNodePos = uploads.get(i).intValue();
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public void init(Context context, String extend) {
        super.init(context, extend);
        this.ext = extend;
    }

    // 初始化抓虫规则
    protected void fetchRule() {
        if (rule == null) {
            if (ext != null) {
                try {

                    if (ext.startsWith("http")) {
                        if(ext.indexOf("{cateId}") != -1 || ext.indexOf("{catePg}") !=-1){
                            rule = new JSONObject();
                            rule.put("homeUrl", ext);
                        }else{
                            String json = OkHttpUtil.string(ext, null);
                            rule = new JSONObject(json);
                        }

                    } else {
                        rule = new JSONObject(ext);
                    }

                    if (!rule.has("list")) {
                        rule.put("list", new JSONObject());
                    }
                    JSONObject list = rule.getJSONObject("list");
                    // 初始化homeUrl,list.url
                    String homeUrl= rule.getString("homeUrl");
                    if(homeUrl.indexOf("{cateId}") != -1){
                        URL r = new URL(homeUrl);
                        String path =  r.getPath();
                        // 更新解析出来的homeUrl
                        rule.put("homeUrl", homeUrl.substring(0, homeUrl.indexOf(path)));
                        if(!list.has("url")){
                            list.put("url", homeUrl);
                        }
                    }
                    // 初始化截断标志
                    String listUrl = list.getString("url");
                    if(listUrl.indexOf("/") !=-1) splitFlag+='/';
                    if(listUrl.indexOf(".") !=-1) splitFlag+='.';
                    if(listUrl.indexOf("-") !=-1) splitFlag+='-';

                    if (!rule.has("detail")) {
                        rule.put("detail", new JSONObject());
                    }

                    if (!rule.has("playlist")) {
                        rule.put("playlist", new JSONObject());
                    }

                    // 如果没有search，则生成一个默认的search规则，大部分网站的search规则都一样
                    // 省掉一个search json
                    if (!rule.has("search")) {
                       String url = addHttpPrefix("index.php/ajax/suggest?mid=1&wd=阿凡达");
                        try {
                            // 尝试访问这个json接口，如果返回了正确的json格式，就认为支持json搜索
                            JSONObject result = new JSONObject( OkHttpUtil.string(url, getHeaders(url)));
                            JSONObject search = new JSONObject();
                            search.put("vod_id", "id");
                            search.put("vod_name", "name");
                            search.put("vod_pic", "pic");
                            search.put("url", addHttpPrefix("index.php/ajax/suggest?mid=1&wd={wd}"));
                            rule.put("search", search);
                        }
                        catch (Exception e){

                        }
                    }

                    // 部分网站的播放页上直接就有 播放地址，基本上就是一样的格式，可以尝试在playerContent中直接拿直链
                    if (!rule.has("play")) {
                        JSONObject play = new JSONObject();
                        JSONArray region = new JSONArray();
                        region.put("var player_aaaa=");
                        region.put(0);

                        JSONArray vod_url = new JSONArray();
                        vod_url.put("\"url\":\"");
                        vod_url.put("\"");
                        play.put("region", region);
                        play.put("vod_url", vod_url);
                        rule.put("play", play);
                    }

                    // play字段中可以填写播放连接的关键字用来帮助识别嗅探结果，
                    // 一般奇葩的网站会用到
                    if (rule.has("play")) { // 自定义嗅探关键字
                        JSONObject play = rule.getJSONObject("play");
                        JSONArray keywords = play.optJSONArray("keywords");
                        if (keywords != null) {
                            videoFormatList.clear();
                            for (int i = 0; i < keywords.length(); ++i) {
                                videoFormatList.add(keywords.getString(i));
                            }
                        }
                    }

                    // 猜cateManaul
                    JSONObject cateManual = rule.optJSONObject("cateManual");
                    String body = "";
                    if (cateManual == null) {
                        // 重建 cateManaul规则
                        body = this.fetchUrl(rule.getString("homeUrl"), rule.optJSONObject("header"));
                        if(body.length() > 32*1024) { body = body.substring(0, 32 * 1024); }
                        cateManual = this.guess_rule_cateManual(body);
                        if(cateManual != null){
                            rule.put("cateManual", cateManual);
                        }
                    }

                    // 猜list.vod_id
                    if (!list.has("vod_id")) {
                        if(body.isEmpty()){
                            body = this.fetchUrl(rule.getString("homeUrl"), rule.optJSONObject("header"));
                            if(body.length() > 32*1024) { body = body.substring(0, 32 * 1024); }
                        }
                        JSONArray listvodid = this.guess_rule_vod_id(body);
                        list.put("vod_id", listvodid);
                    }

                    // 如果没有json搜索接口，那么尝试在主页上找search 的接口 url
                    if (!rule.has("search")) {
                        if(body.isEmpty()){
                            body = this.fetchUrl(rule.getString("homeUrl"), rule.optJSONObject("header"));
                            if(body.length() > 32*1024) { body = body.substring(0, 32 * 1024); }
                        }
                        String url =  this.guess_rule_search_url(body);
                        if(!url.isEmpty()){
                            JSONObject search = new JSONObject();
                            search.put("url", url);
                            rule.put("search", search);
                        }
                    }

                    SpiderDebug.log(String.format("默认rule: %s", rule.toString()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String addHttpPrefix(String url) {
        try {
            if (url.isEmpty()) return "";
            if (url.startsWith("http")) return url;
            String result = rule.getString("homeUrl");
            if (result.endsWith("/")) {
                result = result.substring(0, result.length() - 1);
            }
            if (url.startsWith("/")) {
                result += url;
            } else {
                result += "/" + url;
            }
            return result;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return url;
    }

    protected HashMap<String, String> getHeaders(String url) {
        HashMap<String, String> headers = new HashMap<>();
        try {
            if (rule.has("header")) {
                JSONObject header = rule.getJSONObject("header");
                Iterator<String> iter = header.keys();
                while (iter.hasNext()) {
                    String key = iter.next();
                    headers.put(key, header.getString(key));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (!headers.containsKey("User-Agent")) {
            headers.put("User-Agent", Misc.CHROME);
        }
        return headers;
    }

    public static class HtmlNodeHlper{
        // 非正常配对的html标签，进行html层级查找时要用到
        protected static ArrayList<String> notPairedTag = new ArrayList<>(Arrays.asList("img", "br", "meta", "!--")); // <!---->为注释
        // 判断当前html标签是否为正常的标签
        public static boolean isPairedHtmlTag(String str, int startPos) {
            String tmp = str.substring(startPos, Math.min(str.length(), startPos + 10));
            for (String p : notPairedTag) {
                if (tmp.indexOf(p) != -1) {  // 找到了
                    // 找 > 如果匹配了 />  则认为是配对的
                    for (int i = startPos + 1; i < str.length(); ++i) {
                        String sm = str.substring(i);
                        if (str.charAt(i) == '>') {
                            if (str.charAt(i - 1) == '/') {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }

        // 查找当前标签的html代码 pos必须是标签的开始位置 <
        public static String nodeString(String str, int pos) {
            if (pos < 0 || pos >= str.length() || str.charAt(pos) != '<') return str;
            int isRightNode = 0;
            for (int i = pos; i < str.length() - 1; ++i) {
//            String sm = str.substring(i, i + 400);
                switch (str.charAt(i)) {
                    // 遇到 / 那么这个位置有可能是xml的结束标识,这种情况下再遇到<则不是当前节点的上级节点
                    case '/': {
                        if (str.charAt(i + 1) == '>') { // "/>" 认为是标签的结束位置
                            isRightNode--;
                        } else if (str.charAt(i - 1) == '<') { // "</" 认为是标签的结束位置
                            isRightNode--;
                        }
                        break;
                    }
                    case '>': {
                        if (isRightNode == 0) {
                            return str.substring(pos, i + 1);
                        }
                        break;
                    }
                    case '<': {
                        if (str.charAt(i + 1) != '/' && isPairedHtmlTag(str, i)) { // 不是 "</" 则认为是html标签的开始位置
                            ++isRightNode;
                        }
                        break;
                    }
                    default:
                        break;
                }

            }
            return str.substring(pos);
        }

        // lookback 回溯层级， 一般能找到共同的祖先结节就可以了
        public static ArrayList<Integer> findUpNodes(String str, int pos, int lookback) {
            ArrayList<Integer> nodes = new ArrayList<>();
            ArrayList<String> urls = new ArrayList<>();
            if (pos == -1) return nodes;
            int isUpNode = 0;
            for (int i = pos; i >= 0; --i) {
                switch (str.charAt(i)) {
                    // 遇到 / 那么这个位置有可能是xml的结束标识,这种情况下再遇到<则不是当前节点的上级节点
                    case '/': {
                        if (str.charAt(i + 1) == '>') {
                            isUpNode++;
//                        SpiderDebug.log(String.format("not xml %s", str.substring(i, i + 20)));
                        } else if (str.charAt(i - 1) == '<') {
                            isUpNode++;
                            --i;
//                        SpiderDebug.log(String.format("not xml %s", str.substring(i, i + 20)));
                        }
                        break;
                    }
                    case '<': {
                        if (isUpNode == 0) {
//                        SpiderDebug.log(String.format("find up node %d %s", i, str.substring(i, i + 30)));
                            urls.add(String.format("%5d", i));
                            nodes.add(i);
                        } else if (isPairedHtmlTag(str, i)) {
                            isUpNode--;
                            if (isUpNode < 0) isUpNode = 0;
//                        SpiderDebug.log(String.format("%s", str.substring(i, i + 30)));
                        }

                        break;
                    }
                    default:
                        break;
                }
                if (nodes.size() >= lookback) {
                    break;
                }
            }
            return nodes;
        }
        // 获取当前节点的所有子节点
        public static ArrayList<String> getChildNodes(String str) {
            ArrayList<String> arr = new ArrayList<>();
            int pos = 0;
            if (pos < 0 || pos >= str.length() || str.charAt(pos) != '<') return arr;
            ++pos;
            while (pos > -1 && pos < str.length()) {
                pos = str.indexOf('<', pos);
                String p = nodeString(str, pos);
                if (p.isEmpty()) {
                    break;
                }
                arr.add(p);
                pos += p.length();
            }
            return arr;
        }

        // 移除字符串的html标签
        public static String trimHtmlString(String str, String r) {
            String ret = str.replace("\r\n", "")
                    .replace("\n", "")
                    .replaceAll("<.+?>", r)
                    // .replace(" ", "")
                    .replaceAll("\\s+", " ")
                    .replace("&nbsp;", "")
                    .replace("&emsp;", "")
                    .trim();
            return ret;
        }

        public static String trimHtmlString(String str) {
            return trimHtmlString(str, "");
        }

    }

    public static class Utils{
        // 查找列表块的起始位置，取最靠近共同祖先节点的位置
        public static int findBlockPos(ArrayList<Integer> a, ArrayList<Integer> b) {
            int len = a.size() > b.size() ? b.size() : a.size();
            if(len ==1 ) return b.get(0);
            for (int i = 0; i < len; ++i) {
                if (a.get(i).intValue() == b.get(i).intValue()) {
                    return b.get(i - 1);
                }
            }
            return b.get(len - 1);
        }

        // 查找两个字符串之间的子串
        // keys 字段说明
        // 0 prefix 1 suffix 2 找到子串后左边index的偏移量 3 找到子串后右边index的偏移量
        public static String findSubString(String str, int startPos, JSONArray keys, String defaultVal) {
            try {
                if (keys == null) return defaultVal;
                String prefix = keys.getString(0);
                String suffix = keys.getString(1);
                int offsetl = 0;    // 左边的偏移量
                int offsetr = 0;    // 右边的偏移量
                if (keys.length() > 2) {
                    offsetl = keys.getInt(2);
                }
                if (keys.length() > 3) {
                    offsetr = keys.getInt(3);
                }
                int a = str.indexOf(prefix, startPos) + prefix.length();
                if (a < prefix.length()) return defaultVal;
                int b = str.indexOf(suffix, a);
                if (b < a) return defaultVal;
                return HtmlNodeHlper.trimHtmlString(str.substring(a + offsetl, b + offsetr));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return defaultVal;
        }

        public static String findSubString(String str, int startPos, JSONArray keys) {
            return findSubString(str, startPos, keys, "");
        }

        // 获取回看层数
        public static int getLookbackCount(JSONArray keys) {
            try {
                if (keys != null && keys.length() > 4) return keys.getInt(4);
            } catch (Exception e) {
                //e.printStackTrace();
            }
            return 0;
        }

        // 遍历JSONObect中的JSONArray查找回看的层数可用的规则
        public static JSONArray getLookbackArray(JSONObject obj) {
            try {
                Iterator iter = obj.keys();
                while (iter.hasNext()) {
                    String key = (String) iter.next();
                    Object val = obj.get(key);
                    if (val.getClass().getSimpleName().equals("JSONArray")) {
                        int c = getLookbackCount((JSONArray) val);
                        if (c > 0) return (JSONArray) val;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        // 统计子串个数
        public static int getSubStringCount(String str, String sub){
            int pos =0;
            int count =0;
            while (pos < str.length()){
                pos = str.indexOf(sub, pos);
                if(pos == -1) break;
                pos += sub.length();
                ++count;
            }
            return  count;
        }

        // 获取指定区间的字符串
        public static String getRegion(String str, JSONObject obj) {
            try {
                if (obj == null) return str;
                JSONArray region = obj.optJSONArray("region");
                if (region == null) return str;
                String prefix = region.getString(0);
                int a = str.indexOf(prefix);
                if (a == -1) return str;
                int b = str.length();
                if (region.length() > 1) {
                    b = str.indexOf(region.getString(1), a + prefix.length());
                    if (b == -1) b = str.length();
                }
                return str.substring(a, b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

    // 猜测分类列表的html区间代码
    protected String guessCateManualHtmlString(String body) {
        String regx = String.format("<a.+?href=\"(.+?)\".*?<", TextUtils.join("|", cateManuals));
        Pattern pattern = Pattern.compile(regx);
        Matcher m = pattern.matcher(body);
        ArrayList<HtmlMatchInfo> list = new ArrayList<>();
        int mcount = 0;
        while (m.find()   ) {
            ++mcount;
            if(mcount >30 && !list.isEmpty()){
                break;
            }
            HtmlMatchInfo cate = new HtmlMatchInfo();
            cate.init(m);
            cate.group2 = HtmlNodeHlper.trimHtmlString(HtmlNodeHlper.nodeString(body, cate.startPos));
            if (cate.group2.isEmpty()) continue;
            boolean bOk = false;
            for (String v : cateManuals){
                if(cate.group2.indexOf(v) !=-1) {
                    bOk = true;
                    break;
                }
            }
            if(!bOk) continue;
            cate.uploads = HtmlNodeHlper.findUpNodes(body, cate.startPos, 3);
            if (!list.isEmpty()) {
                boolean b = list.get(0).hasSameUpNode(cate);
                if (!b) { // 当前找到的info和list中的匹配
                    if (list.size() > 1) { // 如果list中的数据大于1 则认为找到了类型列表
                        return HtmlNodeHlper.nodeString(body, list.get(0).matchedUpNodePos);
                    }
                    list.clear();
                }
            }
            list.add(cate);
        }
        if (list.size() > 1) { // 如果list中的数据大于1 则认为找到了类型列表
            return HtmlNodeHlper.nodeString(body, list.get(0).matchedUpNodePos);
        } else {
            return "";
        }
    }

    // 从html代码中猜测分类名和分类ID cateManual规则
    protected JSONObject guess_rule_cateManual(String body) {
        try {
            String str = this.guessCateManualHtmlString(body);
            if (str.isEmpty()) return new JSONObject();

            String regx = String.format("<a.+?href=\"(.+?)\".*?[\"|>](\\s*?\\S+?\\s*?)(\"|<)", TextUtils.join("|", cateManuals));
            Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
            Matcher m = pattern.matcher(str);
            ArrayList<HtmlMatchInfo> list = new ArrayList<>();
            while (m.find()) {
                // HtmlMatchInfo 字段映射
                // HtmlMatchInfo.group1 -> href
                // HtmlMatchInfo.group2 -> name
                // HtmlMatchInfo.diff  -> id  分类ID
                HtmlMatchInfo cate = new HtmlMatchInfo();
                cate.init(m);
                if (cate.group1.length() < 5) continue;
                cate.group2 = HtmlNodeHlper.trimHtmlString(HtmlNodeHlper.nodeString(str, cate.startPos));
                if(cate.group2.isEmpty()) continue;
                // 判断是否为正常的分类名
                boolean validCateName = true;
                for (int j = 0; j < invalidCateNames.size(); ++j) {
                    if (cate.group2.indexOf(invalidCateNames.get(j)) != -1) {
                        SpiderDebug.log(String.format("排除无效分类：%s --> %s", cate.group1, cate.group2));
                        validCateName = false;
                        break;
                    }
                }
                if(!validCateName) continue;

                if (!list.isEmpty()) {
                    if (!list.get(0).findDiffStr(cate, splitFlag)) {
                        SpiderDebug.log(String.format("排除可能无效的分类 %s <--> %s", cate.group1, cate.group2));
                        continue;
                    }
                }
                list.add(cate);
            }

            ArrayList<Integer> baseInfoIndexs = new ArrayList<>();
            // 找到最可能是正确的导航item
            for (int i =0; i < list.size(); ++i){
                list.get(i).diff = null;
                for (String v : cateManuals){
                    if(list.get(i).group2.indexOf(v) !=-1) {
                        baseInfoIndexs.add(i);
                        break;
                    }
                }
            }

            // 以找到的导航item为基准重建分类ID
            int baseInfoIndex=0;
            for (int i =1; i < baseInfoIndexs.size(); ++i){
                baseInfoIndex=baseInfoIndexs.get(0).intValue();
                list.get(baseInfoIndex).findDiffStr(list.get(baseInfoIndexs.get(i).intValue()), splitFlag);
            }

            JSONObject cateManual = new JSONObject();
            for (int i = 0; i < list.size(); ++i) {
                if(list.get(i).diff == null || list.get(i).diff.isEmpty()) {
                    if(!list.get(baseInfoIndex).findDiffStr(list.get(i), splitFlag)){
                        SpiderDebug.log(String.format("排除可能无效的分类 : %s", list.get(i).group0));
                        continue;
                    }
                }

                boolean validCateName = true;
                String name = list.get(i).group2;
                String id = list.get(i).diff;
                if (id == null || id.isEmpty()) continue;
                if (name == null || name.isEmpty()) continue;
                for (int k =0; k <id.length(); ++k){
                    if(splitFlag.indexOf(id.charAt(k)) != -1){
                        SpiderDebug.log(String.format("跳过无效的分类ID :%s", id));
                        continue;
                    }
                }
                for (int j = 0; j < invalidCateNames.size(); ++j) {
                    if (name.indexOf(invalidCateNames.get(j)) != -1) {
                        validCateName = false;
                        break;
                    }
                }
                if (validCateName && !cateManual.has(name)) {
                    cateManual.put(name, id);
                }
            }
            rule.put("cateManual", cateManual);
            return cateManual;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }

    // 猜测搜索页的url规则
    protected String guess_rule_search_url(String body){
        // 找搜索页url的逻辑，不处理其他情情况
        // 1. 找包含 name input标签
        // 2. 找到后往上找三层，找action="" 如果有的话就找到了
        String regex = "<input.+?name=\"(.+?)\"";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(body);
        if(m.find()){
            String str = m.group(0);
            String wd = m.group(1);
            for (int i =1; i < 4; ++i){
                ArrayList<Integer> arr =  HtmlNodeHlper.findUpNodes(body,m.start(0), i);
                String r = HtmlNodeHlper.nodeString(body, arr.get(arr.size()-1));
                String regex2 = "action=\"(.+?)\"";
                Pattern pattern2 = Pattern.compile(regex2, Pattern.CASE_INSENSITIVE);
                Matcher m2 = pattern2.matcher(r);
                if(m2.find()){
                    String url = m2.group(1);
                    char ch = url.indexOf('?') ==-1 ? '?' : '&';
                    url = addHttpPrefix(url +   ch + wd + "={wd}");
                    return url;
                }

            }
        }
        return "";
    }
    // 猜测列表数据的 vod_id 规则
    public JSONArray guess_rule_vod_id(String body) {
        try {
            String regx = "<a.+?href=\"(.+?)\"";
            Pattern pattern = Pattern.compile(regx);
            Matcher m = pattern.matcher(body);
            HashMap<String, JSONArray> founds = new HashMap<>();
            ArrayList<HtmlMatchInfo> list = new ArrayList<>();
            while (m.find()) {
                HtmlMatchInfo cate = new HtmlMatchInfo();
                cate.init(m);
                cate.uploads = HtmlNodeHlper.findUpNodes(body, cate.startPos, 4);
//                String ms = this.findNodeString(body, cate.uploads.get(cate.uploads.size()-1));
                if (!list.isEmpty()) {

                    if(cate.group1.equals( list.get(list.size()-1).group1)) continue;
                    boolean b = list.get(list.size()-1).hasSameUpNode(cate);
                    if (!b) { // 当前找到的info和list中的匹配
                        if (list.size() > 1) {
                            HtmlMatchInfo info = list.get(0);
                            info.findDiffStr(list.get(1), splitFlag);
                            int id = 0;
                            boolean isNumberID = false;
                            try { id = Integer.valueOf(info.diff).intValue(); isNumberID = true; }catch (Exception e){}

                            if(id > 100 ){ // cateID一般都是小于100的
                                String url = (info.group1.replace(list.get(0).diff, "{vid}"));
                                JSONArray arr = new JSONArray();
                                String prefix = url.substring(0, url.indexOf("{vid}"));
                                String suffix = url.substring(prefix.length() + "{vid}".length());
                                int lookback = info.uploads.indexOf(info.matchedUpNodePos) - 1;
                                if (lookback < 1) lookback = 1;
                                arr.put(prefix);
                                arr.put(suffix);
                                arr.put(0);
                                arr.put(0);
                                arr.put(lookback);
                                arr.put(list.size());

                                if (!founds.containsKey(url)) {
                                    founds.put(url, arr);
                                } else {
                                    int nlen = founds.get(url).getInt(5) + list.size();
                                    arr.put(5, nlen);
                                    founds.put(url, arr);
                                    if(nlen >= 30){
                                        list.clear();
                                        break;
                                    }
                                }
                            }

                        }
                        list.clear();
                    }
                }
                list.add(cate);
                if(list.size()>30){
                    break;
                }
            }


            if (list.size() > 5 || (list.size()>1 && founds.isEmpty())) { // 如果list中的数据大于1 则认为找到了类型列表
                HtmlMatchInfo info = list.get(0);
                info.findDiffStr(list.get(1), splitFlag);
                int id = 0;
                boolean isNumberID = false;
                try { id = Integer.valueOf(info.diff).intValue(); isNumberID = true; }catch (Exception e){}

                if(id > 100 ){ // cateID一般都是小于100的

                    String url = (info.group1.replace(list.get(0).diff, "{vid}"));
                    JSONArray arr = new JSONArray();
                    String prefix = url.substring(0, url.indexOf("{vid}"));
                    String suffix = url.substring(prefix.length() + "{vid}".length());
                    int lookback = info.uploads.indexOf(info.matchedUpNodePos) - 1;
                    if (lookback < 1) lookback = 1;
                    arr.put(prefix);
                    arr.put(suffix);
                    arr.put(0);
                    arr.put(0);
                    arr.put(lookback);
                    arr.put(list.size());

                    if (!founds.containsKey(url)) {
                        founds.put(url, arr);
                    } else {
                        int nlen = founds.get(url).getInt(5) + list.size();
                        arr.put(5, nlen);
                        founds.put(url, arr);
                    }
                }
            }


            JSONArray c = null;
            for (String key : founds.keySet()) {
                JSONArray v = founds.get(key);
                if(c == null || c.getInt(5) < v.getInt(5)) c = v;
            }
            return  c;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // 猜播放列表
    public JSONArray guess_rule_vod_play_url(String str, String vid) {
        String regex = "href=\"(/.+?)\"";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(str);
        HtmlMatchInfo info = new HtmlMatchInfo();
        ArrayList<String> vec = new ArrayList<>();
        boolean p0__ = false;
        while (m.find()){
            String sb = m.group(1);
            // 太长的url认为是错误的播放地址
            if(sb.length() > 100) continue;
            if(sb.indexOf(vid) == -1) continue;
            // 如果当前url的长度比上一个url的长度短也认为是无效的播放地址（带上了vod_id一般短一点的可能是详情页的地址）
            // 一般来讲 999-1-1.html 这种格式是播放页的地址，不排除这种地址
            boolean is__html = (sb.indexOf(vid+"-") != -1);
            if(!is__html  && vec.size() > 0 && vec.get(vec.size()-1).length() > sb.length()) continue;
            if(is__html && !p0__ ){ // 找到了准确度最高的播放连接格式，如果检查到列表头不是这种格式的话，清空列表从头开始
                vec.clear();
            }
            // 如果列表里面装了标准的连接格式，不标准的就不要了
            if(p0__ && !is__html) continue;

            info.init(m);
            if(vec.isEmpty()) p0__ = is__html;
            vec.add(m.group(1));
            if(vec.size() > 10  && vec.get(vec.size()-2).length() == sb.length()) {
                break;
            }
        }
        if(info.group0 != null){
            for (int i =1;i < 4; ++i){
                ArrayList<Integer> nodes = HtmlNodeHlper.findUpNodes(str, info.startPos, i);
                int startPos = nodes.get(nodes.size()-1).intValue();
                //String smd =  str.substring(startPos, startPos+10);
                String smd =  HtmlNodeHlper.nodeString(str, startPos);

                if(smd.indexOf("<ul") ==0 || smd.indexOf("<div") ==0  || i == 3){ // 最多退三层，找不到就算了
                    // found 播放列表的 根节节点
                    String prefix = info.group1.substring(0, info.group1.indexOf(vid));
                    String suffix = "\"";
                    JSONArray arr = new JSONArray();
                    arr.put(prefix);
                    arr.put(suffix);
                    arr.put(0 - prefix.length());
                    arr.put(0);
                    arr.put(i);
                    return arr;
                }
            }
        }
        return null;
    }

    //
    public String guess_value_vod_name(String nd, int startPos) {
        try {
            JSONArray vec = new JSONArray();
            vec.put("alt=\"");
            vec.put("\"");
            String val = Utils.findSubString(nd, startPos, vec);

            if (val.isEmpty()) {
                vec.put(0, "\" title=\"");
                val = Utils.findSubString(nd, startPos, vec);
            }
            if (val.isEmpty()) { // 如果没有通过title找到视频名，则取整个node的文本内容,取出现次数最多的项

                String all = HtmlNodeHlper.trimHtmlString(nd, "!!!!");
                String[] words = all.split("!!!!");
                HashMap<String, Integer> map = new HashMap<String, Integer>();

                for (int i = 0; i < words.length; ++i) {
                    words[i] =words[i].trim();
                    if (!words[i].isEmpty() && words[i].indexOf("更新") ==-1) {

                        int c = 1;
                        if (map.containsKey(words[i])) {
                            c = 1 + map.get(words[i]).intValue();
                            ;//[words[i]]
                        }
                        map.put(words[i], Integer.valueOf(c));
                    }
                }
                String s = "";
                int c = 0;
                for (String key : map.keySet()) {
                    int v = map.get(key).intValue();
                    if (v > c) {
                        c = v;
                        s = key;
                    }
                }
                val = s;
            }
            return val.replace("在线", "")
                    .replace("立即", "")
                    .replace("观看", "")
                    .replace("点播", "")
                    .replace("影片", "")
                    .replace("信息", "")
                    .replace("播放", "")
                    .trim();
            //return  val;
        } catch (Exception e) {

        }
        return "";
    }

    public String guess_value_vod_remarks(String nd, int startPos, String vod_name) {
        try {
            String all = HtmlNodeHlper.trimHtmlString(nd, "!!!!");
            String[] words = all.split("!!!!");
            String val = "";
            for (int i = 0; i < words.length; ++i) {
                String wd = words[i].trim();
                if (!wd.isEmpty() && wd.indexOf(vod_name) == -1) {
                    String dot = (!val.isEmpty()) ? "," : "";// val += ",";
                    String tmp = val + dot + wd;
                    if (tmp.length() > 20) {
                        break;
                    }
                    val = tmp;
                }
            }
            return val;
        } catch (Exception e) {

        }
        return "";

    }

    public String guess_value_vod_pic(String nd, int startPos) {
        try {
            JSONArray vec = new JSONArray();
            vec.put("data-original=\"");
            vec.put("\"");
            String val = Utils.findSubString(nd, startPos, vec);
            if (val.isEmpty()) {
                vec.put(0, "data-src=\"");
                val = Utils.findSubString(nd, startPos, vec);
            }
            if (val.isEmpty()) {
                vec.put(0, "src=\"");
                val = Utils.findSubString(nd, startPos, vec);
            }
            if (val.isEmpty()) {
                vec.put(0, "data-bg=\"");
                val = Utils.findSubString(nd, startPos, vec);
            }
            if (val.isEmpty()) {
                //TODO: 直接在nd中找个.jpg .png 之类的当图片
            }
            return addHttpPrefix(val);
        } catch (Exception e) {

        }
        return "";
    }

    @Override
    public boolean isVideoFormat(String url) {
        url = url.toLowerCase();
        if (url.contains("=http") || url.contains("=https") || url.contains("=https%3a%2f") || url.contains("=http%3a%2f")) {
            return false;
        }
        for (String format : videoFormatList) {
            if (url.contains(format)) {
                return true;
            }
        }
        return false;
    }

    // 让当前爬虫自己判断是否为可播放的地址
    @Override
    public boolean manualVideoCheck() {
        return true;
    }


    @Override
    public String homeContent(boolean z) {
        try {
            fetchRule();

            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            JSONObject cateManual = rule.optJSONObject("cateManual");

            Iterator<String> keys = cateManual.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type_name", key);
                jsonObject.put("type_id", cateManual.getString(key));
                classes.put(jsonObject);
            }

            result.put("class", classes);
            if (z && rule.has("filter")) {
                result.put("filters", rule.getJSONObject("filter"));
            }
            return result.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
        }
        return "";
    }

    // from xpath 加入过滤条件
    protected String categoryUrl(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject list = this.rule.getJSONObject("list");
            String cateUrl = list.optString(pg, "");
            if(cateUrl.isEmpty())
                cateUrl = list.getString("url");
            if (filter && extend != null && extend.size() > 0) {
                for (Iterator<String> it = extend.keySet().iterator(); it.hasNext(); ) {
                    String key = it.next();
                    String value = extend.get(key);
                    if (value.length() > 0) {
                        cateUrl = cateUrl.replace("{" + key + "}", URLEncoder.encode(value));
                    }
                }
            }
            cateUrl = cateUrl.replace("{cateId}", tid).replace("{catePg}", pg);
            Matcher m = Pattern.compile("\\{(.*?)\\}").matcher(cateUrl);
            while (m.find()) {
                String n = m.group(0).replace("{", "").replace("}", "");
                cateUrl = cateUrl.replace(m.group(0), "").replace("/" + n + "/", "");
            }
            return cateUrl;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject list = this.rule.getJSONObject("list");
            String url = categoryUrl(tid, pg, filter, extend);
            String body = fetchUrl(url, list.optJSONObject("header"));
            String str = Utils.getRegion(body, list);
            JSONArray videos = new JSONArray();
            JSONArray lookback = Utils.getLookbackArray(list);
            Set<String> set = new HashSet<String>();
            int pos = 0;
            ArrayList<Integer> urlnodes = null;
            int lookup = -1;
            while (lookback != null) {
                pos = str.indexOf(lookback.getString(0), pos);
                if (pos == -1) break;

                ArrayList<Integer> arr = null;
                int blockPos = 0;
                String nd ="";
                do {
                    arr = HtmlNodeHlper.findUpNodes(str, pos - 1, lookback.getInt(4));
                    if (urlnodes == null) {
                        urlnodes = arr;
                        blockPos = arr.get(arr.size() - 1);
                    } else {
                        blockPos = Utils.findBlockPos(urlnodes, arr);
                    }
                    nd = HtmlNodeHlper.nodeString(str, blockPos);

                    // 检查是否回看层数过多，如果回看导数过多会导致加载不出来数据或一页只加载一条数据，需要进行修正
                    if(lookup < 0){
                        int count = Utils.getSubStringCount(nd, lookback.getString(0));
                        if(count > 3 && lookback.getInt(4)>1){
                            lookback.put(4, lookback.getInt(4)-1);
                            urlnodes = null;
                            blockPos=0;
                            nd="";
                            SpiderDebug.log(String.format("找到过多的url匹配项(%d)，降低匹配层级为%d", count, lookback.getInt(4)));
                        }else if(lookup == -1){
                            String pic = guess_value_vod_pic(nd,0); //尝试找一下图片，如果没找到的话增加一级
                            String vName = guess_value_vod_name(nd,0);
                            if(pic.isEmpty()||vName.isEmpty()){
                                lookback.put(4, lookback.getInt(4)+1);
                                urlnodes = null;
                                blockPos=0;
                                nd="";
                                lookup = -2; // 只退一次
                                SpiderDebug.log(String.format("当前层级未找到(%s)，增加匹配层级为%d",  pic.isEmpty()? "图片": "标题",  lookback.getInt(4)));
                            }else{
                                lookup = lookback.getInt(4);
                            }
                        }else{
                            lookup = lookback.getInt(4);
                        }
                    }
                }while (lookup < 0 );


                pos += nd.length();
                blockPos = 0;
                String vod_id = Utils.findSubString(nd, blockPos, list.getJSONArray("vod_id"));
                if (!set.contains(vod_id)) { // 排除重复数据
                    set.add(vod_id);
                    JSONObject v = new JSONObject();
                    v.put("vod_id", vod_id);
                    v.put("vod_name", Utils.findSubString(nd, blockPos, list.optJSONArray("vod_name")));
                    v.put("vod_pic", addHttpPrefix(Utils.findSubString(nd, blockPos, list.optJSONArray("vod_pic"))));
                    v.put("vod_remarks", Utils.findSubString(nd, blockPos, list.optJSONArray("vod_remarks")));

                    if (v.getString("vod_name").isEmpty()) {
                        v.put("vod_name", guess_value_vod_name(nd, 0));
                    }

                    if (v.getString("vod_pic").isEmpty()) {
                        v.put("vod_pic", guess_value_vod_pic(nd, 0));
                    }

                    // 随便整点remark
                    if (v.getString("vod_remarks").isEmpty()) {
                        String vod_name = v.getString("vod_name");
                        v.put("vod_remarks", guess_value_vod_remarks(nd, 0, vod_name));
                    }
                    v.put("vod_id", Base64.encodeToString(v.toString().getBytes(Misc.CharsetUTF8), base64Flag));
                    videos.put(v);
                }
//                pos += vod_id.length();
            }

            JSONObject result = new JSONObject();
            result.put("page", pg);
            result.put("pagecount", Integer.MAX_VALUE);
            result.put("limit", 90);
            result.put("total", Integer.MAX_VALUE);
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    // 生成播放的名称
    public ArrayList<String> makeVodPlayFrom(int sz) {
        ArrayList<String> vec = new ArrayList<String>();
        for (int i = 1; i <= sz; ++i) {
            vec.add("播放列表" + i);
        }
        return vec;
    }

    // 查找播放列表名
    public ArrayList<String> findVodPlayFrom(String str, int sz) {
        try {
            ArrayList<Integer> urlnodes = null;
            JSONObject playlist = this.rule.getJSONObject("playlist");
            if (!playlist.has("vod_play_from")) {
                return makeVodPlayFrom(sz);
            }
            ArrayList<Pair<Integer, String>> vod_play_from = new ArrayList<Pair<Integer, String>>();
            JSONArray rule_vod_play_from = playlist.getJSONArray("vod_play_from");
            for (int i = 0; i < rule_vod_play_from.length(); ++i) {
                String s = rule_vod_play_from.get(i).getClass().getSimpleName();
                String key = "";
                String alias = "";
                if (s.equals("String")) {
                    key = alias = rule_vod_play_from.getString(i);
                } else if (s.equals("JSONArray")) {
                    JSONArray item = rule_vod_play_from.getJSONArray(i);
                    key = alias = item.getString(0);
                    if (item.length() > 1) {
                        alias = item.getString(1);
                    }
                } else {
                    return makeVodPlayFrom(sz);
                }

                int pos = str.indexOf(key);
                if (pos == -1) continue;
                vod_play_from.add(new Pair<>(pos, alias));
            }
            // 找到的名称与实际需要的数量不匹配，返回默认的名称
            if (vod_play_from.size() != sz) {
                return makeVodPlayFrom(sz);
            }
            // 排序
            Collections.sort(vod_play_from, new Comparator<Pair<Integer, String>>() {
                @Override
                public int compare(Pair<Integer, String> a, Pair<Integer, String> b) {
                    return a.first.intValue() - b.first.intValue();
                }
            });

            ArrayList<String> vec = new ArrayList<String>();
            for (int i = 0; i < vod_play_from.size(); ++i) {
                vec.add(vod_play_from.get(i).second);
            }
            return vec;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return makeVodPlayFrom(sz);
    }

    // 查找播放列表
    public ArrayList<String> findVodPlayUrl(String str) {
        ArrayList<String> tmp_vod_play_url = new ArrayList<String>();
        ArrayList<String> vod_play_url = new ArrayList<String>();
        try {
            int pos = 0;
            ArrayList<Integer> urlnodes = null;
            JSONObject playlist = this.rule.getJSONObject("playlist");
            int sort = playlist.optInt("sort", 0);  // 如果这个值是0。表示要倒序播放列表
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            Set<Integer> rmset = new HashSet<Integer>();
//            String tmp = "";
            ArrayList<String> tmp = new ArrayList<String>();
            JSONArray lookback = Utils.getLookbackArray(playlist);
            while (lookback != null) {
                JSONArray rule_vod_play_url = playlist.getJSONArray("vod_play_url");
                pos = str.indexOf(rule_vod_play_url.getString(0), pos);
                if (pos == -1) break;
                ArrayList<Integer> arr = HtmlNodeHlper.findUpNodes(str, pos - 1, lookback.getInt(4));

                int blockPos = 0;
                if (urlnodes == null || arr.size() != urlnodes.size() || arr.get(arr.size() - 1).intValue() != urlnodes.get(urlnodes.size() - 1).intValue()) {
                    urlnodes = arr;
                    blockPos = arr.get(Math.max(0, arr.size() - 2));
                    // 如果上级节点不同，说明当前播放列表已经结束，可以
                    if (!tmp.isEmpty()) {
                        SpiderDebug.log("change play list ");
                        if (sort != 0) {
                            Collections.reverse(tmp);
                        }
                        tmp_vod_play_url.add(TextUtils.join("#", tmp));
                        tmp = new ArrayList<String>();
                    }
                } else {
                    blockPos = Utils.findBlockPos(urlnodes, arr);
                }
//                String bs = str.substring(blockPos, blockPos + 1000);
//                String b = this.findNodeString(str, blockPos);
                // 处理play_url 为空的情况
                String play_url = addHttpPrefix(Utils.findSubString(str, blockPos, playlist.getJSONArray("vod_play_url")));

                if (map.containsKey(play_url)) { // 如果以经找过当前播放的url,那么认为之前找到的都是垃圾数据，清空之间的成果
                    SpiderDebug.log("发现重复播放连接，清空已解析到的播放列表");
                    rmset.add(map.get(play_url)); // 添加移除标志
                }
                map.put(play_url, tmp_vod_play_url.size());
                String play_url_title = Utils.findSubString(str, blockPos, playlist.optJSONArray("vod_play_url_title"));
                if (play_url_title.isEmpty()) {
                    play_url_title = HtmlNodeHlper.trimHtmlString(HtmlNodeHlper.nodeString(str, blockPos));
                    int dd = 3;
                }
                tmp.add(play_url_title + "$" + play_url);
//                SpiderDebug.log(String.format("%s$%s", play_url_title, play_url));
                pos += play_url.length();
            }

            if (!tmp.isEmpty()) {
                if (sort != 0) {
                    Collections.reverse(tmp);
                }
                tmp_vod_play_url.add(TextUtils.join("#", tmp));
            }

            for (int i = 0; i < tmp_vod_play_url.size(); ++i) {
                if (!rmset.contains(i)) {
                    vod_play_url.add(tmp_vod_play_url.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vod_play_url;
    }

    // 猜测详情数据的html区间
    protected String guessDetailContentRegion(String body) {
        String regx = String.format(">\\s*?(%s)|(%s)", TextUtils.join("|", detailItemNames), TextUtils.join("：|", detailItemNames));
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(body);
        ArrayList<HtmlMatchInfo> list = new ArrayList<>();
        while (m.find()) {
            HtmlMatchInfo cate = new HtmlMatchInfo();
            cate.init(m);
            cate.uploads = HtmlNodeHlper.findUpNodes(body, cate.startPos, 5);
            if (!list.isEmpty()) {
                boolean b = list.get(0).hasSameUpNode(cate);
                if (!b) { // 当前找到的info和list中的匹配
                    if (list.size() > 1) {
                        boolean found = false;
                        for (int i = 0; i < list.size(); ++i) {
                            if (list.get(i).group0.indexOf("导演") != -1) {
                                found = true;
                            }
                        }
                        if (found) {
                            return HtmlNodeHlper.nodeString(body, list.get(0).matchedUpNodePos);
                        } else {
                            list.clear();
                        }
                    }
                    list.clear();
                }
            }
            list.add(cate);
        }
        if (list.size() > 1) { // 如果list中的数据大于1 则认为找到了类型列表
            return HtmlNodeHlper.nodeString(body, list.get(0).matchedUpNodePos);
        } else {
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            fetchRule();
            JSONObject vinfo = new JSONObject(new String(Base64.decode(ids.get(0), base64Flag), "UTF-8"));

            JSONObject detail = rule.optJSONObject("detail");
            if (detail == null) return "";
            // 如果不存在url,则使用list中的vod_id来生成url
            if (!detail.has("url")) {
                JSONObject list = rule.getJSONObject("list");
                JSONArray tmp = list.getJSONArray("vod_id");
                String u = addHttpPrefix(tmp.getString(0) + "{vid}" + tmp.getString(1));
                detail.put("url", u);
            }
            String url = detail.getString("url").replace("{vid}", vinfo.getString("vod_id"));
            String body = fetchUrl(url, detail.optJSONObject("header"));
            String str = Utils.getRegion(body, detail);
            int startPos = 0;

            String nodeString = "";
            // 圈定 详情数据的范围
            JSONArray lookback = Utils.getLookbackArray(detail);
            if (lookback != null) {
                int pos = str.indexOf(lookback.getString(0), 0);
                if (pos != -1) {
                    ArrayList<Integer> arr = HtmlNodeHlper.findUpNodes(str, pos - 1, lookback.getInt(4));
                    if (arr.size() > 0) {
                        startPos = arr.get(arr.size() - 1);
                        nodeString = HtmlNodeHlper.nodeString(str, startPos); // 精确详情数据的范围
                    }
                }
            }
            // 没有指定详情数据范围则猜一个出来
            if (nodeString.isEmpty()) {
                nodeString = this.guessDetailContentRegion(body);
            }

            if (nodeString.length() != str.length()) {
                str = nodeString;
                startPos = 0;
            }
            ///////////////////////////////////////////////////////////////////////////////////////

            JSONObject vod = new JSONObject();
            vod.put("vod_id", ids.get(0));
            vod.put("vod_name", Utils.findSubString(str, startPos, detail.optJSONArray("vod_name")));
            vod.put("vod_pic", addHttpPrefix(Utils.findSubString(str, startPos, detail.optJSONArray("vod_pic"))));
            vod.put("type_name", Utils.findSubString(str, startPos, detail.optJSONArray("type_name")));
            vod.put("vod_year", Utils.findSubString(str, startPos, detail.optJSONArray("vod_year")));
            vod.put("vod_area", Utils.findSubString(str, startPos, detail.optJSONArray("vod_area")));
            vod.put("vod_remarks", Utils.findSubString(str, startPos, detail.optJSONArray("vod_remarks")));
            vod.put("vod_actor", Utils.findSubString(str, startPos, detail.optJSONArray("vod_actor")));
            vod.put("vod_director", Utils.findSubString(str, startPos, detail.optJSONArray("vod_director")));
            vod.put("vod_content", Utils.findSubString(str, startPos, detail.optJSONArray("vod_content")));


            ////////////////////////////////////////////////////////////////////////////////////////
            if (vod.getString("vod_name").isEmpty()) {
                vod.put("vod_name", vinfo.optString("vod_name", ""));
            }
            // 从页面中猜个视频名称出来
            if (vod.getString("vod_name").isEmpty()) {
                vod.put("vod_name", guess_value_vod_name(str, startPos));
            }

            ////////////////////////////////////////////////////////////////////////////////////////
            if (vod.getString("vod_pic").isEmpty()) {
                vod.put("vod_pic", vinfo.optString("vod_pic", ""));
            }
            if (vod.getString("vod_pic").isEmpty()) {
                vod.put("vod_pic", guess_value_vod_pic(str, startPos));
            }

            ////////////////////////////////////////////////////////////////////////////////////////
            if (lookback != null && lookback.length() > 1) {
                JSONArray key = new JSONArray();
                String name = lookback.getString(0);
                String skey = lookback.getString(0);

                ArrayList<String> detailItems = new ArrayList<>(Arrays.asList("导演", "演员", "类型", "年份"));
                for (String p : detailItems) {
                    if (name.indexOf(p) != -1) {
                        skey = p;
                        break;
                    }
                }
                key.put(name);
                key.put(lookback.getString(1));
                if (vod.getString("vod_director").isEmpty()) {
                    key.put(0, name.replace(skey, "导演"));
                    vod.put("vod_director", Utils.findSubString(str, startPos, key));
                }
                if (vod.getString("vod_actor").isEmpty()) {
                    key.put(0, name.replace(skey, "主演"));
                    vod.put("vod_actor", Utils.findSubString(str, startPos, key));
                }

                if (vod.getString("vod_content").isEmpty()) {
                    String all = HtmlNodeHlper.trimHtmlString(str, "!!!!");
                    String[] words = all.split("!!!!");
                    String v = "";
                    for (int i = 0; i < words.length; ++i) {
                        if (words[i].length() > v.length()) {
                            v = words[i];
                        }
                    }
                    vod.put("vod_content", HtmlNodeHlper.trimHtmlString(v));
                }

            } else { // 猜一下详情数据
                if (vod.getString("vod_director").isEmpty()) {
                    ArrayList<String> arr = HtmlNodeHlper.getChildNodes(nodeString);
                    String content = "";
                    String f = TextUtils.join("|", detailItemNames);
                    String regex = String.format("%s",f);
                    Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
                    for (int i = 0; i < arr.size(); ++i) {
                        String p = HtmlNodeHlper.trimHtmlString(arr.get(i), " ").replace("：", "");
                        if (p.length() > content.length()) { content = p; }
                        String[] all = p.split(regex);
                        // split出来的可能存在空字符串，去除掉
                        ArrayList<String> items = new ArrayList<>();
                        for(String c: all){
                            if(c.isEmpty()) continue;
                            items.add(c);
                        }
                        Matcher m = pattern.matcher(p);
                        int index = 0;
                        while (m.find() && index < items.size()){
                            String s = m.group(0);
                            for (int j = 0; j < detailItemNames.size(); ++j) {
                                String name = detailItemNames.get(j);
                                String key = detailItemKeys.get(j);
                                if (s.indexOf(name) != -1) {
                                    if (vod.getString(key).isEmpty()) {
                                        vod.put(key, items.get(index).trim());
                                    }
                                    break;
                                }
                            }
                            ++index;
                        }
                    }

                    if (vod.getString("vod_content").isEmpty()) {
                        vod.put("vod_content", content);
                    }
                }
            }


            playlistContent(ids, vod, body);// 获取播放列表


            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(vod);
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }

    // 播放页 str 为 detailContent 函数中http返回值
    protected void playlistContent(List<String> ids, JSONObject vod, String body) {
        try {
            fetchRule();
            JSONObject vinfo = new JSONObject(new String(Base64.decode(ids.get(0), base64Flag), "UTF-8"));

            JSONObject playlist = rule.optJSONObject("playlist");
            if (playlist == null) return;
            if (playlist.has("url")) {
                String detailUrl = rule.getJSONObject("detail").optString("url");
                String playListUrl = playlist.getString("url");
                if(!detailUrl.equals(playListUrl)){
                    String url = playlist.getString("url").replace("{vid}", vinfo.getString("vod_id"));
                    body = fetchUrl(url, playlist.optJSONObject("header"));
                }
            }
            String str = Utils.getRegion(body, playlist);

            ArrayList<String> vod_play_url = null;
            if (!playlist.has("vod_play_url")) {
                // 猜vod_play_url的查找规则
                JSONArray vod_play_url_rule = this.guess_rule_vod_play_url(str, vinfo.getString("vod_id"));
                if(vod_play_url_rule != null){
                    playlist.put("vod_play_url", vod_play_url_rule);
                }
            }
            vod_play_url = this.findVodPlayUrl(str);
            ArrayList<String> vod_play_from = this.findVodPlayFrom(str, vod_play_url.size());

            // 如果有说明播放源的名称，那么对播放源进行排序
            String f1 = TextUtils.join("$$$", vod_play_from);
            String f2 = TextUtils.join("$$$", makeVodPlayFrom(vod_play_url.size()));

            if (!f1.equals(f2)) {
                ArrayList<String> urls = new ArrayList<>();
                ArrayList<String> froms = new ArrayList<>();

                JSONArray rule_vod_play_from = playlist.getJSONArray("vod_play_from");
                for (int i = 0; i < rule_vod_play_from.length(); ++i) {
                    String s = rule_vod_play_from.get(i).getClass().getSimpleName();
                    String alias = "";
                    if (s.equals("String")) {
                        alias = rule_vod_play_from.getString(i);
                    } else if (s.equals("JSONArray")) {
                        JSONArray item = rule_vod_play_from.getJSONArray(i);
                        alias = item.getString(0);
                        if (item.length() > 1) {
                            alias = item.getString(1);
                        }
                    }

                    for (int j = 0; j < vod_play_from.size(); ++j) {
                        if (vod_play_from.get(j).equals(alias)) {
                            urls.add(vod_play_url.get(j));
                            froms.add(vod_play_from.get(j));
                        }
                    }

                }
                vod_play_url = urls;
                vod_play_from = froms;
            }
            vod.put("vod_play_url", TextUtils.join("$$$", vod_play_url));
            vod.put("vod_play_from", TextUtils.join("$$$", vod_play_from));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 尝试从播放页中找播放url
    protected String parsePlayUrl(String str, String str2, List<String> list) {
        try {
            JSONObject play = rule.optJSONObject("play");
            if (play == null) {
                return "";
            }
            String tmp = fetchUrl(str2, play.optJSONObject("header"));
            String body = Utils.getRegion(tmp, play);
            int startPos = 0;
            JSONArray lookback = Utils.getLookbackArray(play);
            if (lookback != null) {
                int pos = body.indexOf(lookback.getString(0), 0);
                if (pos != -1) {
                    ArrayList<Integer> arr = HtmlNodeHlper.findUpNodes(body, pos - 1, lookback.getInt(4));
                    if (arr.size() > 0) {
                        startPos = arr.get(arr.size() - 1);
                    } else {
                        startPos = pos;
                    }
                }
            }

            String vod_url = Utils.findSubString(body, startPos, play.optJSONArray("vod_url"));
            vod_url = vod_url.replace("\\/", "/");
            if (vod_url.isEmpty() || !isVideoFormat(vod_url)) return "";
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", vod_url);
            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

    @Override
    public String playerContent(String str, String str2, List<String> list) {
        try {
            fetchRule();
            // 先判断是否可以拿到直链
            String ret = parsePlayUrl(str, str2, list);
            if (!ret.isEmpty()) return ret;
            // 直接将网页地址返回回去进行嗅探
            JSONObject result = new JSONObject();
            result.put("parse", 1);
            result.put("playUrl", "");
            result.put("url", str2);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    protected Object parseJsonSearchResult(Object obj) {
        try {
            if (obj == null) return null;
            JSONObject search = rule.optJSONObject("search");
            if (search == null) return null;
            String key_vod_id = search.getString("vod_id");
            String key_vod_name = search.getString("vod_name");
            String type = obj.getClass().getSimpleName();
            if (type.equals("JSONObject")) {
                JSONObject object = (JSONObject) obj;
                if (object.has(key_vod_id) && object.has(key_vod_name)) return object;
                for (Iterator<String> iter = object.keys(); iter.hasNext(); ) {
                    String k = iter.next();
                    Object r = parseJsonSearchResult(object.get(k));
                    if (r != null) {
                        return r;
                    }
                }
            } else if (type.equals("JSONArray")) {
                JSONArray array = (JSONArray) obj;
                for (int i = 0; i < array.length(); ++i) {
                    if (parseJsonSearchResult(array.get(i)) != null) {
                        return array;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    protected String parseSearchResult(String body) {
        try {
            JSONObject obj = new JSONObject(body);
            Object info = parseJsonSearchResult(obj);
            if (info == null) return "";
            JSONArray arr = new JSONArray();
            if (info.getClass().getSimpleName().equals("JSONObject")) {
                arr.put(info);
            } else {
                arr = (JSONArray) info;
            }
            JSONObject search = rule.optJSONObject("search");
            JSONArray videos = new JSONArray();
            for (int i = 0; i < arr.length(); ++i) {
                JSONObject v = new JSONObject();
                JSONObject o = arr.getJSONObject(i);
                if (search.has("vod_id") && o.has(search.getString("vod_id"))) {
                    v.put("vod_id", o.get(search.getString("vod_id")).toString());
                } else {
                    continue;
                }
                if (search.has("vod_name") && o.has(search.getString("vod_name"))) {
                    v.put("vod_name", o.get(search.getString("vod_name")).toString());
                } else {
                    v.put("vod_name", "未知");
                }

                if (search.has("vod_pic") && o.has(search.getString("vod_pic"))) {
                    v.put("vod_pic", o.get(search.getString("vod_pic")).toString());
                } else {
                    v.put("vod_pic", "");
                }

                if (search.has("vod_remarks") && o.has(search.getString("vod_remarks"))) {
                    v.put("vod_remarks", o.get(search.getString("vod_remarks")).toString());
                } else {
                    v.put("vod_remarks", "");
                }
                v.put("vod_id", Base64.encodeToString(v.toString().getBytes(Misc.CharsetUTF8), base64Flag));
                videos.put(v);
            }
            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();

        } catch (Exception e) {
//            e.printStackTrace();
        }
        return "";
    }

    // post 搜索，只做了简单的支持
    protected String postSearch(String wd, boolean z) {
        try {
            JSONObject search = rule.optJSONObject("search");
            if (search == null) return "";
            String url = search.getString("url");
            JSONObject params = search.getJSONObject("post"); // 查询参数
            HashMap<String, String> reqpayload = new HashMap<>();
            Iterator<String> iter = params.keys();
            while (iter.hasNext()) {
                String key = iter.next();
                String value = params.getString(key).replace("{wd}", wd);
                reqpayload.put(key, value);
            }
            final String[] retval = {""};
            HashMap<String, String> header = getHeaders(url);
            header.put("content-type", "application/x-www-form-urlencoded");
            OkHttpUtil.post(OkHttpUtil.defaultClient(), url, reqpayload, header, new OKCallBack.OKCallBackString() {
                @Override
                protected void onFailure(Call call, Exception e) {

                }

                @Override
                protected void onResponse(String response) {
                    retval[0] = response;
                }
            });
            return retval[0];
        } catch (Exception e) {

        }
        return "";
    }

    @Override
    public String searchContent(String wd, boolean z) {
        try {
            fetchRule();
            JSONObject search = rule.optJSONObject("search");
            if (search == null) return "";
            String str = "";
            if (search.has("post")) {
                str = postSearch(wd, z);
            } else {
                String url = search.getString("url").replace("{wd}", wd);
                str = fetchUrl(url, search.optJSONObject("header"));
            }
            str = Utils.getRegion(str, search);
            // 先当JSON解析试试
            String r = parseSearchResult(str);
            if (r != null && !r.isEmpty()) {
                return r;
            }

            if (!search.has("vod_id")) {
                JSONObject list = rule.getJSONObject("list");
                search.put("vod_id", list.getJSONArray("vod_id"));
            }

            JSONArray videos = new JSONArray();
            Set<String> set = new HashSet<String>();
            int pos = 0;
            ArrayList<Integer> urlnodes = null;

            JSONArray lookback = Utils.getLookbackArray(search);

            int lookup = -1;
            while (lookback != null) {
                pos = str.indexOf(lookback.getString(0), pos);
                if (pos == -1) break;

                ArrayList<Integer> arr = null;
                int blockPos = 0;
                String nd ="";
                do {
                    arr = HtmlNodeHlper.findUpNodes(str, pos - 1, lookback.getInt(4));
                    if (urlnodes == null) {
                        urlnodes = arr;
                        blockPos = arr.get(arr.size() - 1);
                    } else {
                        blockPos = Utils.findBlockPos(urlnodes, arr);
                    }
                    nd = HtmlNodeHlper.nodeString(str, blockPos);
                    // 检查是否回看层数过多，如果回看导数过多会导致加载不出来数据或一页只加载一条数据，需要进行修正
                    if(lookup < 0){
                        int count = Utils.getSubStringCount(nd, lookback.getString(0));
                        if(count > 3 && lookback.getInt(4)>1){
                            lookback.put(4, lookback.getInt(4)-1);
                            urlnodes = null;
                            blockPos=0;
                            nd="";
                            SpiderDebug.log(String.format("找到过多的url匹配项(%d)，降低匹配层级为%d", count, lookback.get(4)));
                        }
                        else if(lookup == -1){
                            String pic = guess_value_vod_pic(nd,0); //尝试找一下图片，如果没找到的话增加一级
                            String vName = guess_value_vod_name(nd,0);
                            if(pic.isEmpty()||vName.isEmpty()){
                                lookback.put(4, lookback.getInt(4)+1);
                                urlnodes = null;
                                blockPos=0;
                                nd="";
                                lookup = -2; // 只退一次
                                SpiderDebug.log(String.format("当前层级未找到(%s)，增加匹配层级为%d",  pic.isEmpty()? "图片": "标题",  lookback.getInt(4)));
                            }else{
                                lookup = lookback.getInt(4);
                            }
                        }else{
                            lookup = lookback.getInt(4);
                        }
                    }
                }while (lookup < 0);

                pos += nd.length();
                blockPos = 0;
                String vod_id = Utils.findSubString(nd, blockPos, search.getJSONArray("vod_id"));
                if (!set.contains(vod_id)) {
                    set.add(vod_id);
                    JSONObject v = new JSONObject();
                    v.put("vod_id", vod_id);
                    v.put("vod_name", Utils.findSubString(nd, blockPos, search.optJSONArray("vod_name")));
                    v.put("vod_pic", addHttpPrefix(Utils.findSubString(nd, blockPos, search.optJSONArray("vod_pic"))));
                    v.put("vod_remarks", Utils.findSubString(nd, blockPos, search.optJSONArray("vod_remarks")));

                    if (v.getString("vod_name").isEmpty()) {
                        v.put("vod_name", guess_value_vod_name(nd, 0));
                    }

                    if (v.getString("vod_pic").isEmpty()) {
                        v.put("vod_pic", guess_value_vod_pic(nd, 0));
                    }
                    // 随便整点remark
                    if (v.getString("vod_remarks").isEmpty()) {
                        String vod_name = v.getString("vod_name");
                        v.put("vod_remarks", guess_value_vod_remarks(nd, 0, vod_name));
                    }
                    v.put("vod_id", Base64.encodeToString(v.toString().getBytes(Misc.CharsetUTF8), base64Flag));
                    videos.put(v);
                }
            }

            JSONObject result = new JSONObject();
            result.put("list", videos);
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    protected String fetchUrl(String url, JSONObject h) {
        String html = OkHttpUtil.string(url, getHeaders(url));
        html = this.jumpbtwaf(url, html, h);
        return html.replaceAll("<!--.+?-->", "").replace("\r\n","").replace("\n","");  // 移除注释
    }

    protected String jumpbtwaf(String webUrl, String html, JSONObject h) {

        try {
            // 没有配置btwaf不执行下面的代码
            if (!rule.optBoolean("btwaf", false)) {
                return html;
            }

            if (html.contains("检测中") && html.contains("跳转中") && html.contains("btwaf")) {
                JSONArray keys = new JSONArray();
                keys.put("btwaf=");
                keys.put("\"");
                String btwaf = Utils.findSubString(html, 0, keys);
                String bturl = webUrl + "?btwaf=" + btwaf;

                Map<String, List<String>> cookies = new HashMap<>();
                OkHttpUtil.string(bturl, getHeaders(webUrl), cookies);
                for (Map.Entry<String, List<String>> entry : cookies.entrySet()) {
                    if (entry.getKey().equals("set-cookie") || entry.getKey().equals("Set-Cookie")) {
                        String btcookie = TextUtils.join(";", entry.getValue());
                        if (!rule.has("header")) {
                            rule.put("header", new JSONObject());
                        }
                        rule.getJSONObject("header").put("cookie", btcookie);
                        break;
                    }
                }
                html = fetchUrl(webUrl, h);
            }
            if (!html.contains("检测中") && !html.contains("btwaf")) {
                return html;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return html;
    }

}
