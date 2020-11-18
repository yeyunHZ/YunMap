package com.yun.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.View;

import java.util.List;

/**
 * 地图抽象接口
 */
public interface IMap {
    /**
     * 创建地图view
     *
     * @param context
     * @param location
     * @param zoom
     * @return
     */
    public View createMapView(Context context, Location location, int zoom);

    /**
     * 创建地图
     *
     * @param context
     * @param iOnMapLoadedCallback
     * @param location
     * @param zoom
     * @return
     */
    public View createMapView(Context context, IOnMapLoadedCallback iOnMapLoadedCallback, Location location, int zoom);

    /**
     * 生命周期
     */
    public void onResume();

    /**
     * 生命周期
     */
    public void onPause();

    /**
     * 生命周期
     */
    public void onDestroy();


    /**
     * 增加覆盖物
     *
     * @param location
     * @param icon
     */
    public IOverlay addOverlay(Location location, Bitmap icon);

    /**
     * 增加覆盖物
     *
     * @param location
     * @param resId
     * @return
     */
    public IOverlay addOverlay(Location location, int resId);


    /**
     * 增加覆盖物
     *
     * @param location
     * @param view
     * @return
     */
    public IOverlay addOverlay(Location location, View view);

    /**
     * 设置地图上选中的位置
     *
     * @param location
     */
    public void setLocationData(Location location);

    /**
     * 设置地图上选中的位置
     *
     * @param location
     */
    public void setLocationData(Location location, int zoom);

    /**
     * 设置地图上选中的位置
     * 并刷新地图
     *
     * @param location
     * @param zoom
     */
    public void setLocationDataAndMapStatus(Location location, int zoom);


    /**
     * 设置地图状态监听
     *
     * @param iMapStatusChangeListener
     */
    public void setOnMapStatusChangeListener(IMapStatusChangeListener iMapStatusChangeListener);


    /**
     * 获取路线搜索
     *
     * @return
     */
    public IRoutePlanSearch getRoutePlanSearch(IRoutePlanSearch.IRouteLineStyle iRouteLineStyle);


    /**
     * 获取定位服务
     *
     * @return
     */
    public ILocationService getLocationService();


    /**
     * 绘制路线
     *
     * @param locations
     */
    public void drawRoute(List<Location> locations, IRoutePlanSearch.IRouteLineStyle iRouteLineStyle);


    /**
     * 添加覆盖物
     *
     * @param showInfoWindowDataList
     */
    public void showInfoWindow(List<ShowInfoWindowData> showInfoWindowDataList);

    /**
     * 添加覆盖物
     *
     * @param showInfoWindowData
     */
    public void showInfoWindow(ShowInfoWindowData showInfoWindowData);

    /**
     * 地图动画
     *
     * @param locations
     * @param time
     * @param width
     * @param height
     */
    public void animateMapStatus(List<Location> locations, int time, int width, int height);


    /**
     * 地图动画
     *
     * @param locations
     * @param time
     * @param var1
     * @param var2
     * @param var3
     * @param var4
     */
    public void animateMapStatus(List<Location> locations, int time, int var1, int var2, int var3, int var4);

    /**
     * 隐藏所有添加的window
     */
    public void hideAllInfoWidow();


    /**
     * 获取屏幕上点的位置
     *
     * @param point
     * @return
     */
    public Location getFromScreenLocation(Point point);


    /**
     * 获取反地理编码
     *
     * @return
     */
    public IGeoCoder getGeoCoder();


    /**
     * 清除所有数据
     */
    public void clearAllData();


    /**
     * 从坐标获取位置
     *
     * @param location
     * @return
     */
    public Point toScreenLocation(Location location);


    /**
     * 绘制路线
     *
     * @param locations
     */
    public void drawTask(List<Location> locations, IRoutePlanSearch.IRouteLineStyle iRouteLineStyle);


    /**
     * 获取两点间的距离
     *
     * @param startLocation
     * @param endLocation
     */
    public double getDistance(Location startLocation, Location endLocation);


    /**
     * 是否显示当前位置
     */
    public void setMyLocationEnabled(boolean isEnable);


    /**
     * 创建view layoutparams
     *
     * @param height
     * @param width
     * @param yOffset
     * @param location
     * @param view
     * @return
     */
    public void addView(int height, int width, int yOffset, Location location, View view);


    /**
     * 获取位置搜索
     *
     * @return
     */
    public ISuggestionSearch getSuggestionSearch();


    /**
     * 获取行政区划搜索
     *
     * @return
     */
    public IDistrictSearch getDistrictSearch();

    /**
     * 获取离线地图服务
     *
     * @return
     */
    public IOfflineMapService getOfflineMapService();


    /**
     * 设置是否显示个性化地图
     *
     * @param isMapCustomEnable
     */
    public void setMapCustomEnable(boolean isMapCustomEnable);


    /**
     * 获取导航
     *
     * @return
     */
    public IRoutePlanManager getRoutePlanManager();

    /**
     * 是否显示坐标点
     *
     * @param isShow
     */
    public void setShowLocation(boolean isShow);


    /**
     * 设置离线地图路径
     *
     * @param path
     */
    public void setCustomMapStylePath(String path);


    /**
     * 加载必要资源
     * 初始化sdk
     */
    public void initMapSdk();


    /**
     * 是否能滑动
     *
     * @param canGesture
     */
    public void setGesturesEnabled(boolean canGesture);


    /**
     * 绘制附近上车点
     *
     * @param showInfoWindowDataList
     */
    public void drawNearPoint(List<ShowInfoWindowData> showInfoWindowDataList);

    /**
     * 清空附近上车点
     *
     * @param showInfoWindowDataList
     */
    public void clearNearPoint(List<ShowInfoWindowData> showInfoWindowDataList);
}
