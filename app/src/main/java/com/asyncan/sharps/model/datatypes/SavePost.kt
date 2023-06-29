package com.asyncan.sharps.model.datatypes

data class SavePost(
    val post_id: PostId,
    val save: Boolean,
    val auth: String,
)
