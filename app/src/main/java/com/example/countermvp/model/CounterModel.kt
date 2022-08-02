package com.example.countermvp.model

class CounterModel {
   private var count = 0

    fun increment() {
        ++count
    }

    fun decrement() {
        --count
    }

    fun getCount(): Int {
        return count
    }
}