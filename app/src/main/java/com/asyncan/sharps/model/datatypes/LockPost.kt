package com.asyncan.sharps.model.datatypes

data class LockPost(
    val post_id: PostId,
    val locked: Boolean,
    val auth: String,
)
