package com.asyncan.sharps.model.datatypes

data class ModBanView(
    val mod_ban: ModBan,
    val moderator: Person? = null,
    val banned_person: Person,
)
