package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class SmartFeatures(var features: List<String>, var aiAssistant: String? = null, var extraFeatures: List<String>? = null)