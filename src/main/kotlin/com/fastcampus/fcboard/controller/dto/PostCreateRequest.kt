package com.fastcampus.fcboard.controller.dto

import com.fastcampus.fcboard.service.PostCreateRequestDto

data class PostCreateRequest(
    val title: String,
    val content: String,
    val createBy: String,
)

fun PostCreateRequest.toDto() = PostCreateRequestDto(
    title = title,
    content = content,
    createBy = createBy
)
