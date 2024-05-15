package com.example.kopringdemo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KopringTest {
    @Test
    fun let_test() {
        val name: String? = "John"
        val result =
            name?.let {
                "Hello, $it"
            } ?: "Name is null"
    }

    @Test
    fun run_test() {
        val user = User("John", 30)
        val message =
            user.run {
                println("User name: $name, age: $age")
                "Hello, $name! You are $age years old."
            }
        println(message)
    }

    @Test
    fun apply_test() {
        val user =
            UserSecond().apply {
                name = "John"
                age = 30
            }
        println("User name: ${user.name}, age: ${user.age}")
    }

    @Test
    fun with_test() {
        val user = User("John", 30)
        val message =
            with(user) {
                println("User name: $name, age: $age")
            }
        println(message)
    }

    @Test
    fun also_test() {
        val user = User("John", 30)
        val message =
            user.also {
                println("User name: ${it.name}, age: ${it.age}")
            }.also {
                it.greet()
            }
        println(message)
    }
}

class User(val name: String, val age: Int) {
    fun greet() {
        println("Hello, $name")
    }
}

class UserSecond(var name: String, var age: Int) {
    constructor() : this("", 0)
}
