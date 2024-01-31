package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Calling(var videoCalling: List<String>? = null, var audioCalling: List<String>)