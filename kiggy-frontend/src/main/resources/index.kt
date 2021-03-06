package index

import frontend.app.*
import kotlinext.js.*
import react.dom.*
import kotlin.browser.*

fun main(args: Array<String>) {
    requireAll(require.context("src/main/kotlin", true, js("/\\.css$/")))

    render(document.getElementById("root")) {
        app()
    }
}
