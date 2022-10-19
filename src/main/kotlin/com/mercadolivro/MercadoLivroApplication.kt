package com.mercadolivro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MercadoLivroApplication

fun main(args: Array<String>) {
	println("Hello World")
	runApplication<MercadoLivroApplication>(*args)
}
