package com.github.mkulak

import react.dom.render
import kotlin.browser.document
import kotlin.browser.window

fun main(args: Array<String>) {
//    require("narrow-jumbotron.css")

    window.onload = {
        render(document.getElementById("content")) {
            keynotedexApp {}
        }
    }
}
