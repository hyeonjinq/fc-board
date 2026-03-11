package com.fastcampus.fcboard.service

data class PostUpdateRequestDto(
    val title: String,
    val content: String,
    val updateBy: String,
)
