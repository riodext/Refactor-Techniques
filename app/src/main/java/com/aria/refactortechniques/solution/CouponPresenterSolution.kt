package com.aria.refactortechniques.solution

class CouponPresenterSolution(
    private val couponUtilsSolution: CouponUtilsSolution
) {

    private var couponsList = listOf("Coupon 1", "Coupon 2")

    fun setup() {
        couponUtilsSolution.formatCoupons(couponsList)
    }
}