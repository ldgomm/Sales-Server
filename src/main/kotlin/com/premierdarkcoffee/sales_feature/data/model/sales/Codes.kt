package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Codes(var bar: String? = null, var qr: String? = null, var store: String? = null)
