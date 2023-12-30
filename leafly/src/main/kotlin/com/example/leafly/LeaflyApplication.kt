package com.example.leafly

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LeaflyApplication

fun main(args: Array<String>) {
	runApplication<LeaflyApplication>(*args)
}
