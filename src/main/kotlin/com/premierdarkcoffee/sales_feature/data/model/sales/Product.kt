package com.premierdarkcoffee.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Product(var id: String,
                   var codes: com.premierdarkcoffee.sales_feature.data.model.sales.Codes? = null,
                   var images: com.premierdarkcoffee.sales_feature.data.model.sales.Images,
                   var name: String,
                   var overview: List<com.premierdarkcoffee.sales_feature.data.model.sales.Information>,
                   var specifications: com.premierdarkcoffee.sales_feature.data.model.sales.Specifications? = null,
                   var offer: com.premierdarkcoffee.sales_feature.data.model.sales.Offer,
                   var origin: String,
                   var price: com.premierdarkcoffee.sales_feature.data.model.sales.Price,
                   var stock: Int,
                   var category: com.premierdarkcoffee.sales_feature.data.model.sales.Category,
                   var keywords: List<String>,
                   var warranty: com.premierdarkcoffee.sales_feature.data.model.sales.Warranty? = null,
                   var legal: String? = null,
                   var warning: String? = null)



