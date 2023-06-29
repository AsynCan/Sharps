package com.asyncan.sharps.model.datatypes

data class MarkPersonMentionAsRead(
    val person_mention_id: PersonMentionId,
    val read: Boolean,
    val auth: String,
)
