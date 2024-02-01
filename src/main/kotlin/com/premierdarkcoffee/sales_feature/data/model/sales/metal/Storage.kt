package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Storage(var internalCapacity: List<Int>, var hasExternalCapacity: Boolean? = null, var externalCapacity: List<Int>? = null)