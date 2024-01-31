package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Information(var title: String, var subtitle: String, var body: String, var photo: com.premierdarkcoffee.sales_feature.data.model.sales.Photo)
