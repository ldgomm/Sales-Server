package com.premierdarkcoffee.sales_feature.data.model.sales

import com.premierdarkcoffee.sales_feature.data.model.sales.Photo
import kotlinx.serialization.Serializable

@Serializable
data class Images(var product: List<Photo>, var box: List<Photo>? = null)