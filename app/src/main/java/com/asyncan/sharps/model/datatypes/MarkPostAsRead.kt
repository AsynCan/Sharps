package com.asyncan.sharps.model.datatypes

data class MarkPostAsRead(
    val post_id: PostId,
    val read: Boolean,
    val auth: String,
)
