package com.asyncan.sharps.model.datatypes

data class CommentReply(
    val id: CommentReplyId,
    val recipient_id: PersonId,
    val comment_id: CommentId,
    val read: Boolean,
    val published: String,
)
