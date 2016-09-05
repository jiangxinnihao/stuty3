package com.example.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings.System;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotificationManager notificationmanager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = new Notification(R.drawable.ic_launcher, "this is tictor", java.lang.System.currentTimeMillis());
        Intent intent = new Intent("com.example.notification.pading");
        PendingIntent pendingintent = PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        notification.setLatestEventInfo(this, "this is title", "this is content", pendingintent);
        notificationmanager.notify(2, notification);
        
        
    }
}
