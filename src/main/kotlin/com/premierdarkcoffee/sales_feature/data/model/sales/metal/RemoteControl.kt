package com.premierdarkcoffee.sales_feature.data.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class RemoteControl(var type: List<String>, var voiceControl: Boolean? = null)

