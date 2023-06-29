package com.asyncan.sharps.model.datatypes

data class ResolvePrivateMessageReport(
    val report_id: PrivateMessageReportId,
    val resolved: Boolean,
    val auth: String,
)
