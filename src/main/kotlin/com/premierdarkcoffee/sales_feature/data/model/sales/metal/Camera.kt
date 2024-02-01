package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Camera(var system: String, var features: List<String>, var extraFeatures: List<String>? = null, var videoRecording: List<String>? = null)
