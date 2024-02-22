package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import com.premierdarkcoffee.sales_feature.data.model.sales.metal.CPU
import com.premierdarkcoffee.sales_feature.data.model.sales.metal.GPU
import kotlinx.serialization.Serializable

@Serializable
data class Chip(var alias: String, var cpu: CPU? = null, var gpu: GPU? = null)