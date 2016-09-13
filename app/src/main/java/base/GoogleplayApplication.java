package base;

import android.app.Application;

import utils.UiUtils;

/**
 * 创建者: hiboy
 * 创建时间: 2016/9/12.
 */
public class GoogleplayApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UiUtils.initapp(this);
    }
}
