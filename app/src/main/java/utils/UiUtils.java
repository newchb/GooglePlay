package utils;

import android.content.Context;
import android.os.Handler;

import base.GoogleplayApplication;

/**
 * 创建者: hiboy
 * 创建时间: 2016/9/12.
 */
public class UiUtils {
    private static Context context;
    private static Handler handler;

    public static void initapp(GoogleplayApplication googleplayApplication) {
        context = googleplayApplication;
        handler = new Handler();
    }

    public static Handler getHandler() {
        return handler;
    }
    public static void posttask(Runnable task){
        handler.post(task);
    };
    public static Context getContext() {
        return context;
    }
    public static String[] getarray(int resID){
        String[] stringArray = context.getResources().getStringArray(resID);
        return stringArray;
    }
}
