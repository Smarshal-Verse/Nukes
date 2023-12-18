package com.yash10019coder.nukes.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NuclearResponse(
    @SerialName("is_nuke_active")
    val nukes: Boolean
)