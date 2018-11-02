import frontend.app.AppState
import frontend.app.app
import kotlinext.js.requireAll
import react.dom.render

import kotlin.browser.*


fun main(args: Array<String>) {
    requireAll(kotlinext.js.require.context("/", true, js("/\\.css$/")))

    val state: dynamic = module.hot?.let {
        hot ->
        hot.accept()

    }

    appStart(state)




}

fun appStart(state : AppState) {

    render(document.getElementById("rootapp")) {
        app(state)
    }
}