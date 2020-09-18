package com.aria.refactortechniques

import com.aria.refactortechniques.scenario.Coupon
import com.aria.refactortechniques.solution.CouponPresenterSolution
import com.aria.refactortechniques.solution.CouponValidatorUseCaseSolution
import com.nhaarman.mockitokotlin2.given
import org.junit.Before
import org.junit.Test

class CouponValidatorUseCaseSolutionTest {

    private lateinit var sut: CouponPresenterSolution
    private lateinit var couponValidatorUseCaseSolution: CouponValidatorUseCaseSolution

    @Before
    fun setup() {
        sut = CouponPresenterSolution(couponValidatorUseCaseSolution)
    }

    @Test
    fun `given valid coupon should validate it properly`() {
        couponValidatorUseCaseSolution.validate(givenAnyCoupon())
    }

    @Test
    fun `given Valid Coupon`() {
        given(CouponValidatorUseCaseSolution.validateCoupon(givenAnyCoupon()))
            .willReturn(true)
    }

    fun givenAnyCoupon(): Coupon {
        return Coupon("Any", 100)
    }
}