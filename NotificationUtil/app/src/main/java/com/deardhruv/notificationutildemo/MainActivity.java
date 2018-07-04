package com.deardhruv.notificationutildemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.deardhruv.notificationutils.NotificationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationUtils notificationUtils = new NotificationUtils(this);
        notificationUtils.sendNotification("title", "body");
    }
}
