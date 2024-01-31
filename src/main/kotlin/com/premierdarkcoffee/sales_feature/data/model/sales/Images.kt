package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Images(var product: com.premierdarkcoffee.sales_feature.data.model.sales.Photo, var box: com.premierdarkcoffee.sales_feature.data.model.sales.Photo? = null)