package com.asyncan.sharps.model.datatypes

data class GetPersonMentions(
    val sort: CommentSortType? /* "Hot" | "Top" | "New" | "Old" */ = null,
    val page: Int? = null,
    val limit: Int? = null,
    val unread_only: Boolean? = null,
    val auth: String,
)
