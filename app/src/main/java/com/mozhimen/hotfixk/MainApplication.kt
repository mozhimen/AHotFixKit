package com.mozhimen.hotfixk

import com.mozhimen.basick.basek.BaseKApplication

class MainApplication : BaseKApplication() {
    override fun onCreate() {
        super.onCreate()

        //hotfixk
        HotFixKMgr.instance.init()//注释此条查看热修复前的弹框提示
    }
}