package com.mozhimen.hotfixk

import android.os.Bundle
import com.mozhimen.basick.basek.BaseKActivityVB
import com.mozhimen.basick.extsk.showToast
import com.mozhimen.hotfixk.databinding.ActivityHotfixkBinding

class HotfixKActivity: BaseKActivityVB<ActivityHotfixkBinding>() {
    override fun initData(savedInstanceState: Bundle?) {
        vb.hotfixkBtnToast.setOnClickListener {
            HotFixKTest.test().showToast()
        }
    }

    /**
     * 示例:
     * dex打包命令: dx --dex --no-strict --output=hotfixk_2.dex F:\GitHub\HotfixKit\app\build\tmp\kotlin-classes\debug\com\mozhimen\hotfixk\HotFixKTest.class
     * dex远程推送方法: 后端接口
     * 这里模拟下文件的加载在下次打开修复
     */
}