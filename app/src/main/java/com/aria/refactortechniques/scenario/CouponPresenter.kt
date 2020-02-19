package com.aria.refactortechniques.scenario

class CouponPresenter(val couponValidatorUseCase: CouponValidatorUseCase) {

    fun setup(coupon: Coupon) {
        couponValidatorUseCase.validate(coupon)
    }
}