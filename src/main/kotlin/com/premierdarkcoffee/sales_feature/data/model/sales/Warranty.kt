package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Warranty(var hasWarranty: Boolean, var details: List<String>? = null, var months: Int? = null)