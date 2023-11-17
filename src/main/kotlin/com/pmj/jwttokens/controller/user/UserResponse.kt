package com.pmj.jwttokens.controller.user

import java.util.UUID

data class UserResponse(
    val uuid: UUID,
    val email:String,
)
