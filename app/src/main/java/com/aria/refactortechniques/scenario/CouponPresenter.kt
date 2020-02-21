package com.aria.refactortechniques.scenario

class CouponPresenter {

    private var couponsList = listOf("Coupon 1", "Coupon 2")

    fun setup() {
        CouponUtils.formatCoupons(couponsList)
    }
}