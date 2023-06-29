package com.asyncan.sharps.model.datatypes

data class ModLockPostView(
    val mod_lock_post: ModLockPost,
    val moderator: Person? = null,
    val post: Post,
    val community: Community,
)
