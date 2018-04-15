package com.qiangxi.outlinedemo.outline

import android.graphics.Outline
import android.view.View
import android.view.ViewOutlineProvider


/**
 * Created by qiangxi(任强强) on 2018/4/14.
 */
/**
 * 左侧阴影
 */
class RectangleOutlineLeft : ViewOutlineProvider() {
    override fun getOutline(view: View, outline: Outline) {
        outline.setRoundRect(0, 0, view.width, view.height, 45 * 3F)
//        outline.setRect(0, 0, view.width, view.height)
    }
}

/**
 * 上侧阴影
 */
class RectangleOutlineTop : ViewOutlineProvider() {
    override fun getOutline(view: View, outline: Outline) {
        view.background.getOutline(outline)
    }
}

/**
 * 右侧阴影
 */
class RectangleOutlineRight : ViewOutlineProvider() {
    override fun getOutline(view: View, outline: Outline) {
        outline.setRect(0+3, 0+3, view.width-3, view.height-10)
    }
}

/**
 * 下侧阴影
 */
class RectangleOutlineBottom : ViewOutlineProvider() {
    override fun getOutline(view: View, outline: Outline) {
        outline.alpha = 0.7F
        outline.setRect(0, view.height, view.width, view.height + 1)
    }
}