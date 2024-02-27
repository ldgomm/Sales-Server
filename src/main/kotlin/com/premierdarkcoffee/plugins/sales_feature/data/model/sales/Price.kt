package com.premierdarkcoffee.plugins.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var affiliate: Double? = null, var creditCard: CreditCard? = null)

