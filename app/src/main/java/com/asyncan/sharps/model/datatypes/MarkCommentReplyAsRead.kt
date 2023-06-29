package com.asyncan.sharps.model.datatypes

data class MarkCommentReplyAsRead(
    val comment_reply_id: CommentReplyId,
    val read: Boolean,
    val auth: String,
)
