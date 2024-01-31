package com.premierdarkcoffee.sales_feature.data.model.sales.food

import kotlinx.serialization.Serializable

@Serializable
data class Tuple(var amount: Int? = null, var value: Int? = null)