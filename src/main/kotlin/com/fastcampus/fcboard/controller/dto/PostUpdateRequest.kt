package com.fastcampus.fcboard.controller.dto

import com.fastcampus.fcboard.service.PostUpdateRequestDto

data class PostUpdateRequest(
    val title: String,
    val content: String,
    val updateBy: String,
)

fun PostUpdateRequest.toDto() = PostUpdateRequestDto(
    title = title,
    content = content,
    updateBy = updateBy
)
