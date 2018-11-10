package com.coolwheather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
