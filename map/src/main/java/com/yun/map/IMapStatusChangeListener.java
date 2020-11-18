package com.yun.map;

/**
 * 地图监听接口
 */
public interface IMapStatusChangeListener {

    /**
     * 地图开始变动
     */
    public void onMapStatusChangeStart();


    /**
     * 地图结束变动
     */
    public void onMapStatusChangeFinish(Location center);


}
