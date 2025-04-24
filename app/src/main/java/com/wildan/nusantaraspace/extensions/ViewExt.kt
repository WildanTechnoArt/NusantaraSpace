package com.wildan.nusantaraspace.extensions

import android.view.View

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.setOnSingleClickListener(interval: Long = 600L, action: (View) -> Unit) {
    var lastClickTime = 0L
    setOnClickListener {
        if (System.currentTimeMillis() - lastClickTime < interval) return@setOnClickListener
        lastClickTime = System.currentTimeMillis()
        action(it)
    }
}