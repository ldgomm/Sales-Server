package com.premierdarkcoffee.plugins.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Warranty(var hasWarranty: Boolean, var months: Int? = null)