package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class CPU(var alias: String, var cores: Int? = null, var architecture: String? = null, var technology: String? = null)