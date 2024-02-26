package com.premierdarkcoffee.plugins.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Codes(var store: String? = null, var bar: String? = null, var qr: String? = null)

