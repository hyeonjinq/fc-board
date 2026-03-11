package com.fastcampus.fcboard.domain

import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
abstract class BaseEntity(
    createBy: String,
) {
    val createBy: String = createBy
    val createAt: LocalDateTime = LocalDateTime.now()
    var updateBy: String? = null
        protected set
    var updateAt: LocalDateTime? = null
        protected set

    fun updatedBy(updateBy: String) {
        this.updateBy = updateBy
        this.updateAt = LocalDateTime.now()
    }
}
