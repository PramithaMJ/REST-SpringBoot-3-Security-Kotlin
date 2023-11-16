package com.pmj.jwttokens.model

import java.util.UUID

data class Article(
    val id:UUID,
    val title:String,
    val content:String,
)
