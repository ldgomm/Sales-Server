package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class CPU(var alias: String, var architecture: String? = null, var cores: Int? = null, var technology: String? = null)