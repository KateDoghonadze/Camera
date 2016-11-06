package com.example.qeto.camera;

import android.os.Build;

/**
 * Created by QETO on 11/6/2016.
 */

public class Tools {
    public static int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static boolean atLeastMarshmallow() {
        return getAndroidVersion() >= Build.VERSION_CODES.M;
    }

    public static boolean atLeastKitKat() {
        return getAndroidVersion() >= Build.VERSION_CODES.KITKAT;
    }

    public static boolean atLeastJellyBeanMR1() {
        return getAndroidVersion() >= Build.VERSION_CODES.JELLY_BEAN_MR1;
    }
}
