package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Power(var voltage: Int, var isRechargeable: Boolean, var charging: List<String>? = null, var battery: Battery? = null)