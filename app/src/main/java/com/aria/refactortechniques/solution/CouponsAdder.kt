package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.CouponDateUtils

class CouponsAdder(
    private val items: MutableList<String>,
    private val currentDay: String,
    private val couponDateUtils: CouponDateUtils
) {

    fun addItems() {
        if (couponDateUtils.isCurrentDay(currentDay)) {
            items.addAll(items)
        }
        /*
        *
        * More boilerplate code ...
        *
        **/
    }
}