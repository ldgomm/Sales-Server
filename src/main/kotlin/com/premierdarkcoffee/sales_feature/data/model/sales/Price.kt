package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var affiliate: Double? = null, var creditCard: com.premierdarkcoffee.sales_feature.data.model.sales.CreditCard? = null)

