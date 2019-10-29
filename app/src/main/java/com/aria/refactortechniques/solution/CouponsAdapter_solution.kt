package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.CouponDateUtils

class CouponsAdapter_solution(
) {

    fun addItems(
        newItems: List<String>,
        currentDay: String,
        couponDateUtils: CouponDateUtils
    ) {
        val couponAdder = CouponsAdder(newItems, currentDay, couponDateUtils)
    }
}