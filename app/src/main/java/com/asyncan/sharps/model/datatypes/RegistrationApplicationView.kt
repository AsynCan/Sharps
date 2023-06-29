package com.asyncan.sharps.model.datatypes

data class RegistrationApplicationView(
    val registration_application: RegistrationApplication,
    val creator_local_user: LocalUser,
    val creator: Person,
    val admin: Person? = null,
)
