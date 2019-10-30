package com.aria.refactortechniques.scenario

import org.junit.Before
import org.junit.Test

class PageLayoutTest {

    private lateinit var pageLayout: PageLayout

    @Before
    fun setUp() {
        pageLayout = PageLayout()
    }

    @Test
    fun `when PageLayout rebindStyles style are created`() {
        pageLayout.rebindStyles()
    }
}