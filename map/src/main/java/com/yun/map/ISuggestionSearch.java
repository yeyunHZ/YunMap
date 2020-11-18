package com.yun.map;

import java.util.List;

/**
 * 地点搜索
 */
public interface ISuggestionSearch {

    /**
     * 设置监听
     *
     * @param iOnGetSuggestionResultListener
     */
    public void setOnGetSuggestionResultListener(IOnGetSuggestionResultListener iOnGetSuggestionResultListener);


    /**
     * 搜索地点
     *
     * @param city
     * @param key
     */
    public void requestSuggestion(String city, String key);

    /**
     * 通过uid 搜索
     *
     * @param uid
     */
    public void searchByUid(String uid);


    /**
     * 地点搜索监听
     */
    public interface IOnGetSuggestionResultListener {
        public void onGetSuggestionResult(List<SuggestionResult> iSuggestionInfos);

        public void onGetUIdResult(SuggestionResult iSuggestionInfo);
    }

}
