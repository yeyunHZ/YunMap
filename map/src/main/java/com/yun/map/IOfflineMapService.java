package com.yun.map;

/**
 * 离线地图
 */
public interface IOfflineMapService {
    /**
     * 开始下载离线地图
     *
     * @param cityName
     */
    public void startDoawLoadCityMap(String cityName);


    /**
     * 销毁
     */
    public void destroy();

}
