package com.aria.refactortechniques.scenario

class CouponDateUtils {

    fun isCurrentDay(currentDay: String): Boolean {
        return currentDay == "today"
    }
}