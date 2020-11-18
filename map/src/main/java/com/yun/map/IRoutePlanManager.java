package com.yun.map;

import android.app.Application;
import android.os.Handler;
import android.widget.RelativeLayout;

import java.util.List;

/**
 * 导航
 */
public interface IRoutePlanManager {
    public static int MSG_NAVI_ROUTE_PLAN_START = 1;
    public static int MSG_NAVI_ROUTE_PLAN_SUCCESS = 2;
    public static int MSG_NAVI_ROUTE_PLAN_FAILED = 3;
    public static int MSG_NAVI_ROUTE_PLAN_TO_NAVI = 4;

    /**
     * 开始导航
     *
     * @param locations
     * @param handler
     */
    public void routeplanToNavi(List<Location> locations, Handler handler, int tactics);

    /**
     * 初始化
     *
     * @param context
     * @param loadCallBack
     */
    public void init(Application context, LoadCallBack loadCallBack);


    /**
     * 改变路线规划
     *
     * @param locations
     */
    public void changeRoutePlan(List<Location> locations, int tactics);


    /**
     * 加载监听
     */
    public interface LoadCallBack {
        public void onLoad(RelativeLayout rootView);
    }

}
