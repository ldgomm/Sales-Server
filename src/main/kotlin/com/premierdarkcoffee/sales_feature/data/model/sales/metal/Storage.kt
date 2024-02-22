package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Storage(var externalCapacity: List<Int>? = null, var hasExternalCapacity: Boolean, var internalCapacity: List<Int>)
