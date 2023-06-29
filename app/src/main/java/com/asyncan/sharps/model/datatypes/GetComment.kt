package com.asyncan.sharps.model.datatypes

data class GetComment(
    val id: CommentId,
    val auth: String? = null,
)
