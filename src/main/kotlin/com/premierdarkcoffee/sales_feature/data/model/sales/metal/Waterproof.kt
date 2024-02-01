package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Waterproof(var isWaterproof: Boolean, var specification: String? = null)
