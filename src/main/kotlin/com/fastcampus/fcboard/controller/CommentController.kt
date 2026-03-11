package com.fastcampus.fcboard.controller

import com.fastcampus.fcboard.controller.dto.CommentCreateRequest
import com.fastcampus.fcboard.controller.dto.CommentUpdateRequest
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CommentController {

    @PostMapping("/posts/{postId}/comments")
    fun createComment(
        @PathVariable postId: String,
        @RequestBody commentCreateRequest: CommentCreateRequest,
    ): Long {
        return 0L
    }

    @PutMapping("/comments/{commentId}")
    fun updateComment(
        @PathVariable commentId: String,
        @RequestBody commentUpdateRequest: CommentUpdateRequest,
    ): Long {
        return 0L
    }

    @DeleteMapping("comments/{commentId}")
    fun deleteComment(
        @PathVariable commentId: String,
        @RequestParam deletedBy: String,
    ): Long {
        return 0L
    }
}
