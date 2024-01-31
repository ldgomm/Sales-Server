package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class ComputerFeature(var accessibility: List<String>? = null,
                           var authentication: List<String>? = null,
                           var builtInApps: List<String>? = null,
                           var calling: com.premierdarkcoffee.sales_feature.data.model.sales.Calling? = null,
                           var carriers: List<String>? = null,
                           var chip: com.premierdarkcoffee.sales_feature.data.model.sales.Chip? = null,
                           var connectivity: com.premierdarkcoffee.sales_feature.data.model.sales.Connectivity? = null,
                           var location: List<String>? = null,
                           var os: String? = null,
                           var paymentMethod: String? = null,
                           var ram: List<String>? = null,
                           var safety: List<String>? = null,
                           var simCard: List<String>? = null)