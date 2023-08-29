package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Utils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.*;

/**
 * XiaoZhiTiao
 *
 * @author Oiltea
 */
public class XiaoZhiTiao extends Ali {
	
	private String token;
	private Date tokenExpiredAt = new Date();
	
	private static final String siteUrl = "https://gitcafe.net/tool/alipaper/";
	private static final String aliUrl = "https://www.aliyundrive.com/s/";
	
	private Map<String, String> getHeaders() {
		Map<String, String> params = new HashMap<>();
		params.put("Host", "gitcafe.net");
		params.put("User-Agent", Utils.CHROME);
		return params;
	}
	
	@Override
	public String searchContent(String key, boolean quick) throws JSONException {
		Map<String, String> params = new HashMap<>();
		params.put("action", "search");
		params.put("from", "web");
		params.put("token", this.getToken());
		params.put("keyword", key);
		
		JSONObject jsonObject = new JSONObject(OkHttp.post(siteUrl, params, getHeaders()));
		if (jsonObject.getBoolean("success")) {
			List<Vod> list = new ArrayList<>();
			JSONArray jsonArray = jsonObject.getJSONArray("data");
			for (int i = 0, len = jsonArray.length(); i < len; i++) {
				JSONObject o = jsonArray.getJSONObject(i);
				String alikey = o.getString("alikey");
				String title = o.getString("title");
				String creatime = o.getString("creatime");
				list.add(new Vod(aliUrl + alikey, title, "", TextUtils.isEmpty(creatime) ? "" : creatime.substring(0, 10)));
			}
			return Result.string(list);
		}
		return Result.get().string();
	}
	
	private String getToken() throws JSONException {
		if (TextUtils.isEmpty(token) || new Date().compareTo(tokenExpiredAt) > 0) {
			Map<String, String> params = new HashMap<>();
			params.put("action", "get_token");
			params.put("from", "web");
			
			JSONObject jsonObject = new JSONObject(OkHttp.post(siteUrl, params, getHeaders()));
			if (jsonObject.getBoolean("success")) {
				token = jsonObject.getString("data");
				tokenExpiredAt = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000);
			}
		}
		return token;
	}
}