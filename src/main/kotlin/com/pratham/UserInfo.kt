package com.pratham

import kotlinx.serialization.Serializable

@Serializable
data class UserInfo(
    var id: Int,
    var name: String,
    var email: String,
    var password: String
)