package com.premierdarkcoffee.sales_feature.data.model.sales.medicine

import com.premierdarkcoffee.sales_feature.data.model.sales.Product
import kotlinx.serialization.Serializable

@Serializable
data class Medicine(val product: Product,
                    var administration: String? = null,
                    var dosage: String? = null,
                    var sideEffects: String? = null,
                    var contraindications: String? = null,
                    var activeIngredientContent: String? = null,
                    var laboratory: String? = null)
