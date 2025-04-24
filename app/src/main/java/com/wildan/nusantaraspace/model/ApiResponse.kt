package com.wildan.nusantaraspace.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("message") var message: String? = null
)