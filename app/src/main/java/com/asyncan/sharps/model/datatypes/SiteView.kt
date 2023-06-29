package com.asyncan.sharps.model.datatypes

data class SiteView(
    val site: Site,
    val local_site: LocalSite,
    val local_site_rate_limit: LocalSiteRateLimit,
    val counts: SiteAggregates,
)
