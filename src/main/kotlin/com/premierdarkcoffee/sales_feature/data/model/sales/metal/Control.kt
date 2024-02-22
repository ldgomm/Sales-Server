package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Control(var externalButtons: List<String>? = null)

