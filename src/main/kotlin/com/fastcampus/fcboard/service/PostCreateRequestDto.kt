package com.fastcampus.fcboard.service

import com.fastcampus.fcboard.domain.Post


data class PostCreateRequestDto(
    val title : String,
    val content : String,
    val createBy : String
)

fun PostCreateRequestDto.toEntity() = Post(
    title = title,
    content = content,
    createBy = createBy
)
