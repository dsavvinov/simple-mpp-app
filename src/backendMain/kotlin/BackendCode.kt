package io.ktor.samples.fullstack.backend

import io.ktor.application.*
import io.ktor.html.*
import io.ktor.http.content.*
import io.ktor.routing.*
import io.ktor.samples.fullstack.common.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.html.*
import java.io.*

fun Application.main() {
    val currentDir = File(".").absoluteFile
    environment.log.info("Current directory: $currentDir")

    routing {
        static {
            defaultResource("index.html")
        }

        static("/static") {
            file("fullstack-mpp-unspecified.js", "build/processedResources/backend/main/fullstack-mpp-unspecified.js")
        }

        static("/static") {
            file("JavaScriptCode.js", "build/processedResources/frontend/main/JavaScriptCode.js")
        }
    }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080) { main() }.start(wait = true)
}