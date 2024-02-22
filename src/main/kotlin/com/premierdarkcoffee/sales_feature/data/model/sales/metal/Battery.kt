package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Battery(var capacity: Int? = null, var duration: Int? = null, var type: String, var isFastCharging: Boolean? = null)

