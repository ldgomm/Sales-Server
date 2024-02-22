package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Connectivity(var cellular: List<String>? = null, var ports: List<String>, var wireless: List<String>? = null)
