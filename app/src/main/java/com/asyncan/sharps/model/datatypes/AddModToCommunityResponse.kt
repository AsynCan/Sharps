package com.asyncan.sharps.model.datatypes

import com.jerboa.datatypes.types.CommunityModeratorView

data class AddModToCommunityResponse(
    val moderators: List<CommunityModeratorView>,
)
