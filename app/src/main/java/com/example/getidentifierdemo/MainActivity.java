package com.example.getidentifierdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name = StrManager.getInstance().getString("name");
        String sex = StrManager.getInstance().getString("sex");
        String hobby = StrManager.getInstance().getString("hobby");
        Log.d(TAG, "默认模式：male");
        Log.d(TAG, "名字name = " + name);
        Log.d(TAG, "性别sex = " + sex);
        Log.d(TAG, "爱好hobby = " + hobby);

        String hobbys = this.getString(R.string.hobby_male);
        Log.d(TAG, "hobbys = " + hobbys);
    }
}
