package com.cao.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    //主键
    private int cityId;

    //市名
    private String cityName;

    //市的代号
    private int cityCode;

    //记录当前市所属省的ID
    private int provinceId;


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
