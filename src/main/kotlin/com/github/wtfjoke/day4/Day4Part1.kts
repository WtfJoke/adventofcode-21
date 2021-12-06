import java.nio.file.Paths

typealias BingoBoard = List<List<Int>>

val inputs = Paths.get("inputs.txt").toFile().useLines { it.toList() }
val drawnNumbers = inputs.first().split(',').map { it.toInt() }
val boards: Set<BingoBoard> = inputs
    .asSequence()
    .drop(1)
    .filter { it.isNotEmpty() }
    .chunked(5)
    .map { parseBoard(it) }
    .toSet()

fun parseBoard(boards: List<String>): BingoBoard = boards.map { row ->
    row.split(' ')
        .filter { it.isNotEmpty() }
        .map { it.toInt() }
}

fun BingoBoard.isWinning(drawn: Collection<Int>): Boolean {
    val rowMatch = this.any { row -> row.all { it in drawn } }
    val columnMatch = (0..4).any { column -> this.all { row -> row[column] in drawn } }
    return rowMatch || columnMatch
}

fun BingoBoard.sumUnmarked(drawn: Collection<Int>): Int {
    return this.sumOf { row ->
        row.filterNot { it in drawn }
            .sum()
    }
}

fun part1() {
    val drawn = mutableListOf<Int>()
    val score = drawnNumbers.firstNotNullOf { draw ->
        drawn += draw
        boards.firstOrNull { it.isWinning(drawn) }
            ?.let { winningBoard ->
                winningBoard.sumUnmarked(drawn) * draw
            }
    }
    println(score)
}

part1()

