package com.aria.refactortechniques.solution

class CouponUtilsSolution {

    fun formatCoupons(coupons: List<String>): List<String> {
        return formatCouponsLegacy(coupons)
    }

    companion object {
        fun formatCouponsLegacy(coupons: List<String>) = coupons.map { "$it Coupon" }
    }
}
