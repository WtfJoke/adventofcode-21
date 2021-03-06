import com.github.wtfjoke.day2.part1.Direction.FORWARD
import com.github.wtfjoke.day2.part1.Direction.DOWN
import com.github.wtfjoke.day2.part1.Direction.UP
import com.github.wtfjoke.day2.part1.InputWithDirection
import com.github.wtfjoke.day2.part1.Position

/***
 * https://adventofcode.com/2021/day/2
 */
fun move(vararg inputWithDirections: InputWithDirection): Position {
    var position = Position()
    inputWithDirections.forEach { position = it.move(position) }
    return position
}

move(
    InputWithDirection(FORWARD, 5),
    InputWithDirection(DOWN, 5),
    InputWithDirection(FORWARD, 8),
    InputWithDirection(UP, 3),
    InputWithDirection(DOWN, 8),
    InputWithDirection(FORWARD, 2)
).multiply()

move(
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,8),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,5),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,8),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,3),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,2),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,1),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,8),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,4),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,2),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(UP,5),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,5),
    InputWithDirection(UP,8),
    InputWithDirection(UP,7),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,7),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,8),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,5),
    InputWithDirection(UP,7),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,1),
    InputWithDirection(UP,8),
    InputWithDirection(UP,4),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,1),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,5),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,3),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,7),
    InputWithDirection(UP,2),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,2),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,4),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,3),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,6),
    InputWithDirection(UP,7),
    InputWithDirection(UP,8),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,5),
    InputWithDirection(UP,1),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,2),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,1),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,2),
    InputWithDirection(UP,6),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,8),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,3),
    InputWithDirection(UP,3),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,6),
    InputWithDirection(UP,8),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,8),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,9),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,8),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,7),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,1),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,6),
    InputWithDirection(UP,8),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,3),
    InputWithDirection(UP,8),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,8),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,6),
    InputWithDirection(UP,8),
    InputWithDirection(UP,8),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,1),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,1),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,4),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,1),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,4),
    InputWithDirection(UP,3),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,5),
    InputWithDirection(UP,6),
    InputWithDirection(FORWARD,1),
    InputWithDirection(UP,5),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,4),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,6),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,4),
    InputWithDirection(UP,2),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,5),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,3),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,7),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,1),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,5),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(UP,5),
    InputWithDirection(UP,1),
    InputWithDirection(UP,2),
    InputWithDirection(UP,5),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,8),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,7),
    InputWithDirection(FORWARD,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,4),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,9),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(FORWARD,1),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,8),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,5),
    InputWithDirection(FORWARD,3),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,7),
    InputWithDirection(DOWN,2),
    InputWithDirection(UP,8),
    InputWithDirection(FORWARD,9),
    InputWithDirection(DOWN,8),
    InputWithDirection(UP,7),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,3),
    InputWithDirection(FORWARD,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,3),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,3),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,4),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,2),
    InputWithDirection(DOWN,6),
    InputWithDirection(DOWN,5),
    InputWithDirection(DOWN,9),
    InputWithDirection(DOWN,1),
    InputWithDirection(DOWN,7),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,4),
    InputWithDirection(UP,6),
    InputWithDirection(DOWN,6),
    InputWithDirection(FORWARD,9),
    InputWithDirection(FORWARD,2),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,3),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,8),
    InputWithDirection(DOWN,1),
    InputWithDirection(UP,4),
    InputWithDirection(FORWARD,9),
    InputWithDirection(UP,7),
    InputWithDirection(FORWARD,5),
    InputWithDirection(DOWN,5),
    InputWithDirection(UP,9),
    InputWithDirection(DOWN,2),
    InputWithDirection(DOWN,2),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,4),
    InputWithDirection(FORWARD,8),
).multiply()
