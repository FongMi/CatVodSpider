package com.github.catvod.utils.merge;

import com.google.gson.annotations.SerializedName;

public final class Yun189Response {

    @SerializedName("res_message")
    public String message;

    @SerializedName("fileListAO")
    public Yun189Data data;

    @SerializedName("res_code")
    public String code;

    @SerializedName("success")
    public boolean success;
}
