package com.example.month5

class CounterModel {
    private var count = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun getCount() = count.toString()
}