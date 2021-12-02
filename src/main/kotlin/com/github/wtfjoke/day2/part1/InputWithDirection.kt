package com.github.wtfjoke.day2.part1

data class InputWithDirection(val direction: Direction, val amount: Int){
    fun move(position: Position): Position {
        return when (direction){
            Direction.UP -> Position(position.depth - amount, position.horizontalPosition)
            Direction.DOWN -> Position(position.depth + amount, position.horizontalPosition)
            Direction.FORWARD -> Position(position.depth, position.horizontalPosition + amount)
        }
    }
}
