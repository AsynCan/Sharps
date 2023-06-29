package com.asyncan.sharps.model.datatypes

data class DeletePrivateMessage(
    val private_message_id: PrivateMessageId,
    val deleted: Boolean,
    val auth: String,
)
