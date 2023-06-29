package com.asyncan.sharps.model.datatypes

data class CommentResponse(
    val comment_view: CommentView,
    val recipient_ids: List<LocalUserId>,
    val form_id: String? = null,
)
