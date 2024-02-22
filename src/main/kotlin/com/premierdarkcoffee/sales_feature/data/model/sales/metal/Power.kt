package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Power(var battery: Battery? = null, var charging: List<String>? = null, var isRechargeable: Boolean, var voltage: Int)

