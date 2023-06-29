package com.asyncan.sharps.model.datatypes

data class ModRemoveCommentView(
    val mod_remove_comment: ModRemoveComment,
    val moderator: Person? = null,
    val comment: Comment,
    val commenter: Person,
    val post: Post,
    val community: Community,
)
