package com.yash10019coder.nukes

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.provider.Settings

class receiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        var mp: MediaPlayer = MediaPlayer.create(context, Settings.System.DEFAULT_RINGTONE_URI)
        mp.start()
    }
}
