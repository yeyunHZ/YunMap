简介
===

Android开发中我们经常需要使用到地图sdk，当前市场主流的地图sdk有三家，百度、高德、谷歌。<br/>
当我们面对不同应用场景的时候可能需要使用不同的sdk，比如在网约车行业，由于百度和高德地图在不同城市精准度不同，可能需要我们在不同城市使用不同的地图sdk，或者根据司机的使用习惯，来提供不同的地图服务。又或者需要在谷歌应用市场上架，提供海外服务的话，就需要使用谷歌地图。<br/>
但是不同地图sdk，虽然提供的功能大同小异，但是一一去集成不仅集成成本很大，而且地图切换的成本也很大，也会造成业务代码的臃肿。<br/><br/><br/>
**YunMap**  就是为了解决这个现实的业务场景而生，并且已经在一家网约车公司线上使用。<br/>
YunMap实现了对地图sdk基本功能的抽象，在上层屏蔽了不同地图厂商提供的sdk的差异，让用户可以通过简单的代码就实现几乎所有的地图服务，而且避免了不同厂商提供的sdk代码对业务代码的污染，让用户可以通过
一行代码就实现不同地图sdk的切换。


使用
===
1、IMap是地图类的抽象接口，提供了包括创建地图、定位、地图覆盖物、动画、导航等功能
```Java
implementation 'com.yun:map:1.5.4'
```
```Java
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
```


2、使用不同的地图实现类
```Java
高德地图 implementation 'com.yun:gaodemap:2.3.8'

百度地图 implementation 'com.yun:baidumap:1.9.1'

谷歌地图 implementation 'com.yun:gmap:1.1.7'

注意：使用地图时，仍需配置各个地图所需配置项
```
例:通过提供不同的实现类，就相当于切换了地图sdk
```Java
 /**
     * 获取地图服务
     *
     * @param context
     * @return
     */
    public IMap getMap(Context context) {
        return new BaiduMap(context);
    }
```

```Java
启动定位服务
ILocationService iLocationService = iMap.getLocationService();
iLocationService.registerLocationListener(locationListener); 
iLocationService.start();

 private ILocationService.LocationListener locationListener = new ILocationService.LocationListener() {
        @Override
        public void onReceiveLocation(ILocationService.LocationResult locationResult) {
            if (locationResult != null) {
                Location location = locationResult.getLocation();
            }
        }
    };
```

```Java
创建地图View
View mapView = iMap.createMapView(this, CurrentLocation.getLocation(), ConstantCache.MAP_ZOOM);
iMap.setShowLocation(false);
```







