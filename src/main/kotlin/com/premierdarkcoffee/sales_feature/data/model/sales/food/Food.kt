package com.premierdarkcoffee.sales_feature.data.model.sales.food

import com.premierdarkcoffee.sales_feature.data.model.sales.food.Minerals
import com.premierdarkcoffee.sales_feature.data.model.sales.food.Nutrients
import com.premierdarkcoffee.sales_feature.data.model.sales.food.Vitamins
import kotlinx.serialization.Serializable

@Serializable
data class Food(
        var flavors: List<String>? = null,
        var instructions: List<String>? = null,
        var minerals: Minerals? = null,
        var nutrients: Nutrients? = null,
        var precautions: List<String>? = null,
        var vitamins: Vitamins? = null
)

