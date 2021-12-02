package com.github.wtfjoke.day2.part2

import com.github.wtfjoke.day2.part1.Position

data class PositionWithAim(val depth: Int = 0, val horizontalPosition: Int = 0, val aim: Int = 0){
    fun multiply(): Int {
        return Position(depth, horizontalPosition).multiply()
    }
}
