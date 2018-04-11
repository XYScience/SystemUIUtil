package com.sscience.systemuiutil;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;

/**
 * @author SScience
 * @description
 * @email chentushen.science@gmail.com
 * @data 2018/4/12
 */

public class SystemUIUtil {

    /**
     * 设置导航栏样式：白底灰色图标 & 黑底白色图标
     * @param activity
     * @param isLight
     */
    public static void setNavigationStyle(Activity activity, boolean isLight) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            return;
        }
        activity.getWindow().setNavigationBarColor(isLight ? Color.WHITE : Color.BLACK);
        View decorView = activity.getWindow().getDecorView();
        int vis = decorView.getSystemUiVisibility();
        if (isLight) {
            vis |= View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
        } else {
            vis &= ~View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
        }
        decorView.setSystemUiVisibility(vis);
    }

    /**
     * 设置状态栏样式：白色文字图标 & 灰色文字图标
     * @param activity
     * @param isLight
     */
    public static void setStatusBarStyle(Activity activity, boolean isLight) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int vis = decorView.getSystemUiVisibility();
        if (isLight) {
            vis |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        } else {
            vis &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        }
        decorView.setSystemUiVisibility(vis);
    }
}
