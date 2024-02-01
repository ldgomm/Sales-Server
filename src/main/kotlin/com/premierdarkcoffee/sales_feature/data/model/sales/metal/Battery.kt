package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Battery(var type: String, var capacity: Int? = null, var approximateDuration: Int? = null, var isFastCharging: Boolean? = null)