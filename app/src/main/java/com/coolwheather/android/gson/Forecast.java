package com.coolwheather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String data;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    class Temperature {

        public String max;

        public String min;

    }

    class More {

        @SerializedName("txt_d")
        public String info;
    }

}
