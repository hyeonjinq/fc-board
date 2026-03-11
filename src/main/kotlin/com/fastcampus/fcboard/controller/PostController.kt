package com.fastcampus.fcboard.controller

import com.fastcampus.fcboard.controller.dto.*
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.awt.print.Pageable
import java.time.LocalDateTime

@RestController
class PostController {

    @PostMapping("/posts")
    fun createPosts(
        @RequestBody postCreateRequest: PostCreateRequest,
    ): Long {
        return 1L
    }

    @PutMapping("/posts/{id}")
    fun updatePosts(
        @PathVariable id: Long,
        @RequestBody postUpdateRequest: PostUpdateRequest,
    ): Long {
        return 1L
    }

    @DeleteMapping("/posts/{id}")
    fun deletePosts(
        @PathVariable id: Long,
        @RequestParam createBy: String,
    ): Long {
        println(createBy)
        return 1L
    }

    @GetMapping("/posts/{id}")
    fun getPosts(
        @PathVariable id: Long,
    ): PostDetailResponse {
        return PostDetailResponse(1L, "title", "content", "hyeonjin", LocalDateTime.now().toString())
    }

    @GetMapping("/posts")
    fun getPosts(
        pageable: Pageable,
        postSearchRequest: PostSearchRequest,
    ): Page<PostSummaryResponse> {
        return Page.empty()
    }
}
