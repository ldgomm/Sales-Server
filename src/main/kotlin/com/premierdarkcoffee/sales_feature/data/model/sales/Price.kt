package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var creditCard: CreditCard? = null, var offer: Offer)
