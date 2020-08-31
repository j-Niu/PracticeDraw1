package com.hencoder.hencoderpracticedraw1.practice;

import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Author:Josse
 * Time:2020/8/27
 */
public class Utils {

    public static float dp2px(float dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().getDisplayMetrics());
    }
}
