package com.premierdarkcoffee.sales_feature.data.model.sales.food

import kotlinx.serialization.Serializable

@Serializable
data class Vitamins(var vitaminD: Int? = null,
                    var vitaminA: Int? = null,
                    var vitaminC: Int? = null,
                    var vitaminE: Int? = null,
                    var vitaminK: Int? = null,
                    var thiamin: Int? = null,
                    var riboflavin: Int? = null,
                    var niacin: Int? = null,
                    var vitaminB6: Int? = null,
                    var folate: Int? = null,
                    var folicAcid: Int? = null,
                    var vitaminB12: Int? = null,
                    var biotin: Int? = null,
                    var pantothenicAcid: Int? = null,
                    var choline: Int? = null)

