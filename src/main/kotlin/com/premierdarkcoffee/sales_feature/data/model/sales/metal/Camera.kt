package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Camera(var extraFeatures: List<String>? = null,
                  var features: List<String>,
                  var system: String,
                  var videoRecording: List<String>? = null)

