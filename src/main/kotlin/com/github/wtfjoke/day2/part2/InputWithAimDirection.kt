package com.github.wtfjoke.day2.part2

import com.github.wtfjoke.day2.part1.Direction

data class InputWithAimDirection(val direction: Direction, val amount: Int) {
    fun move(withAim: PositionWithAim): PositionWithAim {
        val (depth, horizontalPosition, aim) = withAim
        return when (direction) {
            Direction.UP -> PositionWithAim(depth, horizontalPosition, aim - amount)
            Direction.DOWN -> PositionWithAim(depth, horizontalPosition, aim + amount)
            Direction.FORWARD -> PositionWithAim(depth + aim * amount, horizontalPosition + amount, aim)
        }
    }
}
