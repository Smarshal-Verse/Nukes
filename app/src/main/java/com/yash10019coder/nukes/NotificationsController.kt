package com.yash10019coder.nukes

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class NotificationsController(private val context: Context) {
    private val CHANNELID = "channel_id_example_01"
    private val notificationId = "101"
    fun createnotificationchannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Notification Table"
            val descriptionText = "Notification Description"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(CHANNELID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    fun sendnotification() {
        val builder = NotificationCompat.Builder(context, CHANNELID)
            .setSmallIcon(R.drawable.ic_launcher_background).setContentTitle("title")
            .setContentText("notification successful").setPriority(NotificationCompat.PRIORITY_HIGH)
            .setCategory(NotificationCompat.CATEGORY_ALARM)
        with(NotificationManagerCompat.from(context)) {
            notify(101, builder.build())
        }
    }
}
