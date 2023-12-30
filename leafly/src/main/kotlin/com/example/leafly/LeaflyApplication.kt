package com.example.leafly

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LeaflyApplication

fun main(args: Array<String>) {
	runApplication<LeaflyApplication>(*args)
	Banner.Mode.OFF // FIXME: Remove banner upon running. Currently doesn't work.
}
