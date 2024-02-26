package com.premierdarkcoffee.plugins.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Chip(var alias: String, var cpu: com.premierdarkcoffee.plugins.sales_feature.data.model.sales.CPU? = null, var gpu: com.premierdarkcoffee.plugins.sales_feature.data.model.sales.GPU? = null)