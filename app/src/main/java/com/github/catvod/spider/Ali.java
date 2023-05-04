package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.ali.API;
import com.github.catvod.bean.Result;
import com.github.catvod.crawler.Spider;
import com.github.catvod.utils.ReflectUtil;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ColaMint & Adam & FongMi
 */
public class Ali extends Spider {

    public static final Pattern pattern = Pattern.compile("www.aliyundrive.com/s/([^/]+)(/folder/([^/]+))?");

    @Override
    public void init(Context context, String extend) {
        //适配其他tvbox或者老版本tvbox，要先判断有没有getToken方法，调用setToken也是一样的
        Method method = ReflectUtil.getMethod(this, "getToken");
        String token = "";
        if (method != null) {
            token = getToken();
        }
        API.get().setRefreshToken(TextUtils.isEmpty(token) ? extend : token);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = ids.get(0).trim();
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find()) return "";
        String shareId = matcher.group(1);
        String fileId = matcher.groupCount() == 3 ? matcher.group(3) : "";
        API.get().setShareId(shareId);
        return Result.string(API.get().getVod(url, fileId));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String[] ids = id.split("\\+");
        String url = flag.equals("原畫") ? API.get().getDownloadUrl(ids[0]) : API.get().getPreviewUrl(ids[0], flag);
        return Result.get().url(url).subs(API.get().getSub(ids)).header(API.get().getHeader()).parse(0).string();
    }

    public static Object[] proxy(Map<String, String> params) {
        String type = params.get("type");
        if (type.equals("sub")) return API.get().proxySub(params);
        if (type.equals("token")) return API.get().getToken();
        return null;
    }
}