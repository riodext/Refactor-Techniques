package com.aria.refactortechniques.solution

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test

class CouponPresenterTest {

    private lateinit var couponPresenterSolution: CouponPresenterSolution
    private val couponUtilsSolution: CouponUtilsSolution = mock()

    @Before
    fun setup() {
        couponPresenterSolution = CouponPresenterSolution(couponUtilsSolution)
    }

    @Test
    fun `when app starts format coupons`() {
        //GIVEN

        //WHEN
        couponPresenterSolution.setup()

        //THEN
        verify(couponUtilsSolution).formatCoupons(any())
    }
}