package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Specifications(var models: List<String>,
                          var colours: List<String>,
                          var capacity: Int? = null,
                          var finished: String? = null,
                          var inBox: List<String>? = null,
                          var kind: String? = null,
                          var size: Size? = null)