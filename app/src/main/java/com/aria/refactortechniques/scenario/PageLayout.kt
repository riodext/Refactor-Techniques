package com.aria.refactortechniques.scenario

class PageLayout {

    private val id = 0
    private var styles = listOf<String>()
    private val template = StyleTemplate()

    fun rebindStyles() {
        styles = StyleMaster.formStyles(template, id)
    }
}