package com.yun.map;

import java.util.ArrayList;
import java.util.List;

/**
 * 位置搜索返回的结果
 */
public class SuggestionResult {
    private String key;
    private String city;
    private String district;
    private Location pt;
    private String uid;
    private String tag;
    private String address;
    private ArrayList<SuggestionResult> iSuggestionInfos;

    public SuggestionResult(String key, String city, String district, Location pt, String uid,
                            String tag, String address, ArrayList<SuggestionResult> iSuggestionInfos) {
        this.key = key;
        this.city = city;
        this.district = district;
        this.pt = pt;
        this.uid = uid;
        this.tag = tag;
        this.address = address;
        this.iSuggestionInfos = iSuggestionInfos;
    }

    public String getKey() {
        return key;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public Location getPt() {
        return pt;
    }

    public String getUid() {
        return uid;
    }

    public String getTag() {
        return tag;
    }

    public String getAddress() {
        return address;
    }

    public List<SuggestionResult> poiChildrenInfoList() {
        return iSuggestionInfos;
    }
}
