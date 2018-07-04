package com.deardhruv.notificationutil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotificationUtils notificationUtils = new NotificationUtils(this);
        notificationUtils.sendNotification("title", "body");
    }
}
