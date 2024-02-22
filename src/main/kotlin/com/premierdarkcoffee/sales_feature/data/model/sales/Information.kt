package com.premierdarkcoffee.sales_feature.data.model.sales

import com.premierdarkcoffee.sales_feature.data.model.sales.Photo
import kotlinx.serialization.Serializable

@Serializable
data class Information(var title: String, var subtitle: String, var body: String, var photo: Photo)