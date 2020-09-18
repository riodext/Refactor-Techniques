package com.aria.refactortechniques.scenario

const val MAX_TITLE_LENGTH = 100

class CouponValidatorUseCase {

    fun validate(coupon: Coupon) = coupon.title.length < MAX_TITLE_LENGTH
}