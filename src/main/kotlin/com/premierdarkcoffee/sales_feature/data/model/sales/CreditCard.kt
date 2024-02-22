package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class CreditCard(var withinterest: Int? = null, var withoutinterest: Int? = null)