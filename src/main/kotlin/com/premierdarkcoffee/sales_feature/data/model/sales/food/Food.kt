package com.premierdarkcoffee.sales_feature.data.model.sales.food

import com.premierdarkcoffee.sales_feature.data.model.sales.Product
import kotlinx.serialization.Serializable

@Serializable
data class Food(val product: Product,
                var flavors: List<String>? = null,
                var instructions: List<String>? = null,
                var precautions: List<String>? = null,
                var nutrients: Nutrients? = null,
                var vitamins: Vitamins? = null,
                var minerals: Minerals? = null)