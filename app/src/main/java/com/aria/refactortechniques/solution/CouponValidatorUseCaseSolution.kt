package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.Coupon
import com.aria.refactortechniques.scenario.MAX_TITLE_LENGTH

class CouponValidatorUseCaseSolution {

    fun validate(coupon: Coupon): Boolean {
        return validateCoupon(coupon)
    }

    companion object {
        fun validateCoupon(coupon: Coupon) = coupon.title.length < MAX_TITLE_LENGTH
    }
}