package io.ktor.samples.fullstack.common

import kotlinx.serialization.Serializable

fun getCommonWorldString() = "common-world"

@Serializable
data class Person(val age: Int)