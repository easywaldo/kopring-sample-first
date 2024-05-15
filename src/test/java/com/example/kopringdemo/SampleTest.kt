package com.example.kopringdemo

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SampleTest : FunSpec({
    test("should return the length of the string") {
        val str = "Hello, World!"
        str.length shouldBe 13
    }
},)
