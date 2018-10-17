package com.pepaproch.kiggi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KiggyApplication

fun main(args: Array<String>) {
    runApplication<KiggyApplication>(*args)
}
