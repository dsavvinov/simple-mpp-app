package io.ktor.samples.fullstack.frontend

import io.ktor.samples.fullstack.common.Person
import io.ktor.samples.fullstack.common.getCommonWorldString
import kotlinx.serialization.json.Json

@Suppress("unused")
@JsName("helloWorld")
fun helloWorld(salutation: String): String {
    return "$salutation from Kotlin.JS ${getCommonWorldString()}"
}
