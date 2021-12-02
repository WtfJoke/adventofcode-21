package com.github.wtfjoke.day2.part1

data class Position(val depth: Int = 0, val horizontalPosition: Int = 0){
    fun multiply(): Int {
        return depth * horizontalPosition
    }
}
