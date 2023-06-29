package com.asyncan.sharps.model.datatypes

data class EditPrivateMessage(
    val private_message_id: PrivateMessageId,
    val content: String,
    val auth: String,
)
