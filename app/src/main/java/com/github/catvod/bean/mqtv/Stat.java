package com.github.catvod.bean.mqtv;

import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.List;

public class Stat {

    @SerializedName("UserIpList")
    private List<String> userIpList;

    public List<String> getUserIpList() {
        return userIpList == null ? Collections.emptyList() : userIpList;
    }
}
