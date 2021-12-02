import com.github.wtfjoke.day2.part1.Direction
import com.github.wtfjoke.day2.part2.InputWithAimDirection
import com.github.wtfjoke.day2.part2.PositionWithAim
import java.nio.file.Paths

/***
 * https://adventofcode.com/2021/day/2#part2
 */
fun move(inputs: List<InputWithAimDirection>): PositionWithAim {
    var position = PositionWithAim()
    inputs.forEach {
        position = it.move(position)
    }
    return position
}

val inputs = Paths.get("..", "inputs.txt").toFile()
    .useLines { it.toList() }
    .map { it.substringBefore(' ') to it.substringAfter(' ') }
    .map { Direction.valueOf(it.first.uppercase()) to it.second.toInt()}
    .map { InputWithAimDirection(it.first, it.second) }

move(inputs).multiply()