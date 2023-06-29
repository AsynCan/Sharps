package com.asyncan.sharps.model.datatypes

data class AdminPurgeCommunityView(
    val admin_purge_community: AdminPurgeCommunity,
    val admin: Person? = null,
)
