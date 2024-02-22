package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class SmartFeatures(var aiAssistant: String? = null, var extraFeatures: List<String>? = null, var features: List<String>)

