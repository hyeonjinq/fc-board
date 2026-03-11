package com.fastcampus.fcboard.controller.dto

data class PostSummaryResponse(
    val id: Long,
    val title: String,
    val createBy: String,
    val createAt: String,
)
