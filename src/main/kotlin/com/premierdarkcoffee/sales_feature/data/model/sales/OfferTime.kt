package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class OfferTime(var timeInterval: Interval? = null, var day: Int? = null)
