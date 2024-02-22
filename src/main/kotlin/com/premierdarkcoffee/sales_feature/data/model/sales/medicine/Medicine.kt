package com.premierdarkcoffee.sales_feature.data.model.sales.medicine

import kotlinx.serialization.Serializable

@Serializable
data class Medicine(var activeIngredientContent: String? = null,
                    var administration: String,
                    var contraindications: String? = null,
                    var dosage: String? = null,
                    var laboratory: String,
                    var sideEffects: String? = null)

