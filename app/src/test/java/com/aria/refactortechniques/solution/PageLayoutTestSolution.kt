package com.aria.refactortechniques.solution

import org.junit.Before

class PageLayoutTestSolution {

    private lateinit var pageLayout: FakePageLayout

    @Before
    fun setUp() {
        pageLayout = FakePageLayout()
    }
}