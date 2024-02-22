package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Calling(var audioCalling: List<String>, var videoCalling: List<String>? = null)
