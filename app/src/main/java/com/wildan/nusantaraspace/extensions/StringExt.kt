package com.wildan.nusantaraspace.extensions

import android.text.TextUtils
import android.util.Patterns

fun String.isValidEmail(): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String?.isNotEmpty(): Boolean {
    return !TextUtils.isEmpty(this)
}