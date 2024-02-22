package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Size(var width: Double, var height: Double, var deep: Double? = null, var unit: String)