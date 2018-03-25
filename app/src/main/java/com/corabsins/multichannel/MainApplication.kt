package com.corabsins.multichannel

import android.app.Application
import com.umeng.analytics.MobclickAgent
import com.umeng.commonsdk.UMConfigure

/**
 * Created by corab on 2018/3/25.
 */
class MainApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    fun  init(){
        UMConfigure.init(this, UMConfigure.DEVICE_TYPE_PHONE, null)
    }
}