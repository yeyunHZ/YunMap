package com.yun.map;

import android.content.Context;

/**
 * 地图覆盖物
 */
public interface IOverlay {
    /**
     * 设置位置
     *
     * @param location
     */
    public void setPosition(Location location);

    /**
     * 清除
     */
    public void remove();


    /**
     * 设置在最上层
     */
    public void setToTop();

    /**
     * 设置Rotate
     *
     * @param rotate
     */
    public void setRotate(float rotate);

    /**
     * 获取定位
     *
     * @return
     */
    public Location getLocation();

    /**
     * 调整地图中心点
     *
     * @param context
     */
    public void zoomToSpan(Context context);

}
