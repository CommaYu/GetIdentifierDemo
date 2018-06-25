package com.example.getidentifierdemo;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

public class StrManager {
    private String TAG = "StrManager";
    private static StrManager strInstance;
    // 用于访问资源
    private Resources mResources;
    private Context mContext;
    private String mPackageName = "";
    /** 后缀1 */
    private String suffix_1 = "_male";
    /** 后缀2 */
    private String suffix_2 = "_female";

    public StrManager() {

    }

    public void init(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        this.mPackageName = context.getPackageName();
    }

    public static StrManager getInstance() {
        if (strInstance == null) {
            strInstance = new StrManager();
        }
        return strInstance;
    }

    /**
     * 默认男性资料，没有的话就从女性的资料中搜索
     * @param baseString
     * @return
     */
    public String getString(String baseString) {
        String result = null;
        try {
            result = mResources.getString(mResources.getIdentifier(
                    baseString + "_male", "string", mPackageName));
        } catch (Exception e) {
            Log.d(TAG, "NotFoundException");
        }

        // 男性资料中没有的时候从女性中获取
        if (result == null) {
            try {
                result = mResources.getString(mResources.getIdentifier(
                        baseString + "_female", "string", mPackageName));
            } catch (Exception e) {
                Log.d(TAG, "NotFoundException  normal");
            }
        }

        return (result == null) ? "" : result;
    }

}
