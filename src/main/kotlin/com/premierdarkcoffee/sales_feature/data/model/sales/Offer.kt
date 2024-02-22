package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Offer(var isActive: Boolean, var discountPercentage: Int? = null)