package com.yun.map;

/**
 * 路线搜索接口
 */
public interface IRoutePlanSearch {

    /**
     * 添加监听
     *
     * @param iRoutePlanSearchListener
     */
    public void addListener(IRoutePlanSearchListener iRoutePlanSearchListener);


    /**
     * 路线搜索
     *
     * @param fromLocation
     * @param toLocation
     */
    public void drivingSearch(Location fromLocation
            , Location toLocation, int tactics, boolean needDraw);

    /**
     * 路线搜索
     *
     * @param from
     * @param to
     */
    public void drivingSearch(String from
            , String to, int tactics);

    /**
     * 回到路线的中心
     */
    public void zoomToSpan();


    /**
     * 清除路线
     */
    public void clearRoute();

    /**
     * 回收资源
     */
    public void destory();


    /**
     * 手动绘制路线
     *
     * @param startLocation
     */
    public void drawRoute(Location startLocation);

    /**
     * 路线搜索监听
     */
    public interface IRoutePlanSearchListener {
        /**
         * 路线搜索接口返回结果
         */
        public void onGetDrivingRouteResult(int distance, int duration, int direction, IOverlay iOverlay, Location firstLocation);

        /**
         * 路线搜索失败
         */
        public void onGetDrivingFail();

    }


    /**
     * 路线规划中路线的样式
     */
    public interface IRouteLineStyle {
        /**
         * 线的颜色
         *
         * @return
         */
        public int getLineColor();

        /**
         * 起点图片
         *
         * @return
         */
        public int getStartMarkerResoucre();


        /**
         * 终点图片
         *
         * @return
         */
        public int getTerminalMarkerResource();

        /**
         * 节点图片
         *
         * @return
         */
        public int getNodeMarkerResource();

        /**
         * 线的宽度
         *
         * @return
         */
        public int getLineWidth();
    }
}
