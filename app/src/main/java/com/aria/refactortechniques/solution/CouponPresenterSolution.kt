package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.Coupon

class CouponPresenterSolution(
    private val couponValidatorUseCaseSolution: CouponValidatorUseCaseSolution
) {

    fun setup(coupon: Coupon) {
        couponValidatorUseCaseSolution.validate(coupon)
    }
}