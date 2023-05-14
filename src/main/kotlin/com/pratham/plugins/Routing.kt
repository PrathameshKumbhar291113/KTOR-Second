package com.pratham.plugins

import com.pratham.UserInfo
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        post("/login"){
            val userInfo = call.receive<UserInfo>()
            println(userInfo)

            call.respondText("User info posted successfully : $userInfo")
        }
    }
}
