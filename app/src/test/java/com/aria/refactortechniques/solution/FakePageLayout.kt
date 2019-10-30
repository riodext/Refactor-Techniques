package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.StyleTemplate

class FakePageLayout : PageLayout_solution() {

    override fun formStyless(
        template: StyleTemplate,
        id: Int
    ): List<String> {
        return listOf(
            "Testing Style 1", "Testing Style 2"
        )
    }
}