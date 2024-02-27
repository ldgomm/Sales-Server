package com.premierdarkcoffee.plugins.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
class Storage(var internalCapacity: List<Int>, var hasExternalCapacity: Boolean? = null, var externalCapacity: List<Int>? = null)
