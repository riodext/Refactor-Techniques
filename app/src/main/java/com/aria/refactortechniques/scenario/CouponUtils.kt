package com.aria.refactortechniques.scenario

class CouponUtils {

    companion object {
        fun formatCoupons(coupons: List<String>): List<String> {
            return coupons.map { "$it Coupon" }
        }
    }
}
