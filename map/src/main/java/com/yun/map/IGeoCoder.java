package com.yun.map;

import java.util.List;

/**
 * 地理位置编码接口
 */
public interface IGeoCoder {
    /**
     * 添加监听
     *
     * @param onGetGeoCodeResultListener
     */
    public void setOnGetGeoCodeResultListener(OnGetGeoCoderResultListener onGetGeoCodeResultListener);

    /**
     * 发起地理位置编码
     *
     * @param location
     */
    public void reverseGeoCode(Location location);


    /**
     * 销毁
     */
    public void destroy();

    /**
     * 地理编码监听
     */
    public interface OnGetGeoCoderResultListener {
        /**
         * 编码成功
         *
         * @param iGeoCoderResult
         * @param locations
         */
        public void onGetReverseGeoCodeResult(IGeoCoderResult iGeoCoderResult, List<Location> locations);
    }


    /**
     * 地理位置编码结果
     */
    public interface IGeoCoderResult {
        /**
         * 地址
         *
         * @return
         */
        public String getAddress();

        /**
         * 获取位置信息
         *
         * @return
         */
        public Location getLocation();


        /**
         * 城市
         *
         * @return
         */
        public String getCity();


        /**
         * 城市编码
         *
         * @return
         */
        public String getCityCode();


        /**
         * 区域编码
         *
         * @return
         */
        public String getPostalCode();

    }
}
