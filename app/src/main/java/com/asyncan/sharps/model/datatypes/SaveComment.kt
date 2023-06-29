package com.asyncan.sharps.model.datatypes

data class SaveComment(
    val comment_id: CommentId,
    val save: Boolean,
    val auth: String,
)
