package com.coolweather.app.util;

/**
 * Created by WRan on 2016/11/2.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
