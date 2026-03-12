package com.fastcampus.fcboard.controller

import com.fastcampus.fcboard.service.CommentService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class LikeController(
    private val commentService: CommentService,
) {

    @PostMapping("/posts/{postId}/likes")
    fun createComment(
        @PathVariable postId: Long,
        @RequestParam createdBy: String,
    ): Long {
        return 1L
    }
}
