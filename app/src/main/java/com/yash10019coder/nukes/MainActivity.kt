package com.yash10019coder.nukes


import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.yash10019coder.nukes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val notificationsController: NotificationsController by lazy {
        NotificationsController(this)
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var alarmManager: AlarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        binding.alarmplay.setOnClickListener(object : OnClickListener {
            override fun onClick(v: View?) {
                var time: Int = (binding.edittime as EditText).text.toString().toInt()
                var trigger: Long = System.currentTimeMillis() + (time * 1000)
                val Ibroadcast: Intent = Intent(this@MainActivity, receiver::class.java)
                val pi: PendingIntent = PendingIntent.getBroadcast(
                    this@MainActivity, 100, Ibroadcast, PendingIntent.FLAG_IMMUTABLE
                )
                alarmManager.set(AlarmManager.RTC_WAKEUP, trigger, pi)
            }

        })

        notificationsController.createnotificationchannel()
        binding.notify.setOnClickListener() {
            notificationsController.sendnotification()
        }
    }


}
