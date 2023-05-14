package com.pratham

import com.pratham.plugins.configureRouting
import com.pratham.plugins.configureSerialization
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0"){
        install(ContentNegotiation){
            json()
        }
        configureRouting()

    }.start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}
