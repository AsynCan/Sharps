package com.asyncan.sharps.model.datatypes

data class ResolvePostReport(
    val report_id: PostReportId,
    val resolved: Boolean,
    val auth: String,
)
