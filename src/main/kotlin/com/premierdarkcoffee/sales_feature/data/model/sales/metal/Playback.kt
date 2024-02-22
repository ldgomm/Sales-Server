package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Playback(var audioPlayback: List<String>, var videoPlayback: List<String>? = null)

