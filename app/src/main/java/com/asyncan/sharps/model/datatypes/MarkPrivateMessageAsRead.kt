package com.asyncan.sharps.model.datatypes

data class MarkPrivateMessageAsRead(
    val private_message_id: PrivateMessageId,
    val read: Boolean,
    val auth: String,
)
