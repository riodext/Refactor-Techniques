package com.aria.refactortechniques.scenario

class CouponsAdapter(
    private val items: MutableList<String>
) {

    fun addItems(
        newItems: List<String>,
        currentDay: String,
        couponDateUtils: CouponDateUtils
    ) {
        if (couponDateUtils.isCurrentDay(currentDay)) {
            items.addAll(newItems)
        }
        /*
        *
        * More boilerplate code ...
        *
        **/
    }
}