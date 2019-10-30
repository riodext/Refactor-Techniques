package com.aria.refactortechniques.solution

import com.aria.refactortechniques.scenario.StyleMaster
import com.aria.refactortechniques.scenario.StyleTemplate

open class PageLayout_solution {

    private val id = 0
    private var styles = listOf<String>()
    private val template = StyleTemplate()

    fun rebindStyles() {
        styles = formStyless(template, id)
    }

    protected open fun formStyless(
        template: StyleTemplate,
        id: Int
    ): List<String> {
        return StyleMaster.formStyles(template, id)
    }
}