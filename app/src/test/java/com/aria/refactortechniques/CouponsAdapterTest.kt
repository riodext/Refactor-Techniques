package com.aria.refactortechniques

import com.aria.refactortechniques.scenario.CouponsAdapter
import org.junit.Before
import org.junit.Test

class CouponsAdapterTest {

    private lateinit var couponsAdapter: CouponsAdapter

    @Before
    fun setUp() {
        couponsAdapter = CouponsAdapter()
    }

    @Test
    fun `given today is valid items are added`() {
        couponsAdapter.addItems()
    }
}