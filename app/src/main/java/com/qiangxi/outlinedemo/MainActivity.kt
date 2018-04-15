package com.qiangxi.outlinedemo

import android.animation.ValueAnimator
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.qiangxi.outlinedemo.databinding.ActivityMainBinding
import com.qiangxi.outlinedemo.outline.RectangleOutlineBottom
import com.qiangxi.outlinedemo.outline.RectangleOutlineLeft
import com.qiangxi.outlinedemo.outline.RectangleOutlineRight
import com.qiangxi.outlinedemo.outline.RectangleOutlineTop

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    private lateinit var mAnimator: ValueAnimator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.presenter = this
        mBinding.tv1.outlineProvider = RectangleOutlineLeft()
        mBinding.tv2.outlineProvider = RectangleOutlineTop()
        mBinding.tv3.outlineProvider = RectangleOutlineRight()
        mBinding.tv4.outlineProvider = RectangleOutlineBottom()

        mAnimator = ValueAnimator.ofFloat(0F, 20F)
        mAnimator.duration = 3000
        mAnimator.addUpdateListener { animation ->
            val value = animation.animatedValue as Float
//            mBinding.tv1.translationZ = value
        }
    }

    /**
     * 增加tv1的TranslationZ的值
     */
    fun addTranslationZ(view: View) {
//        mAnimator.start()
    }
}
