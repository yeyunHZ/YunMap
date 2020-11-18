package com.yun.map;

import java.util.List;

/**
 * 行政区域查询
 */
public interface IDistrictSearch {

    /**
     * 设置监听
     *
     * @param iOnGetDistrictSearchResultListener
     */
    public void setOnDistrictSearchListener(IOnGetDistrictSearchResultListener iOnGetDistrictSearchResultListener);


    /**
     * 搜索行政区划
     *
     * @param city
     */
    public void searchDistrict(String city);

    /**
     * 监听
     */
    public interface IOnGetDistrictSearchResultListener {
        /**
         * 获取到搜索结果
         *
         * @param iDistrictResult
         */
        public void onGetDistrictResult(IDistrictResult iDistrictResult);
    }

    /**
     * 行政区划结果
     */
    public interface IDistrictResult {
        public Location getCenterPt();

        public List<List<Location>> getPolylines();

        public String getCityCode();

        public String getCityName();

        public String getAdCode();
    }

}
