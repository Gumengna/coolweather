package com.example.administrator.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/6/18.
 */

public class City extends DataSupport{
    private  int id;
    private String cityName;
    private int cityCode;

    public int getId() {
        return id;
    }

    public int getCityCode() {
        return cityCode;
    }
    public String getCityName() {
        return cityName;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public void setProvinceId(int provinceId) {
    }
}
