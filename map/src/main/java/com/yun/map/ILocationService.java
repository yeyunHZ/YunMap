package com.yun.map;

/**
 * 定位相关接口
 */
public interface ILocationService {
    /**
     * 开始定位
     */
    public void start();

    /**
     * 添加定位监听
     *
     * @param locationListener
     */
    public void registerLocationListener(LocationListener locationListener);

    /**
     * 监听解绑
     *
     * @param locationListener
     */
    public void unRegisterLocationListener(LocationListener locationListener);


    /**
     * 停止定位
     */
    public void stop();


    /**
     * 定位监听
     */
    public interface LocationListener {
        /**
         * 定位结果返回
         *
         * @param locationResult
         */
        public void onReceiveLocation(LocationResult locationResult);

    }

    /**
     * 定位结果
     */
    public interface LocationResult {
        /**
         * 位置
         *
         * @return
         */
        public Location getLocation();

        /**
         * 定位来源
         *
         * @return
         */
        public int getType();


        /**
         * 定位时间
         *
         * @return
         */
        public String getTime();


    }
}
