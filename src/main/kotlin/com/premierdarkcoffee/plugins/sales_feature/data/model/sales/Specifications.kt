package com.premierdarkcoffee.plugins.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Specifications(val models: List<String>? = null,
                          val colours: List<String>? = null,
                          val capacity: Int? = null,
                          val finished: String? = null,
                          val inBox: List<String>? = null,
                          val kind: String? = null,
                          val size: Size? = null)