import java.nio.file.Paths

val inputs = Paths.get("inputs.txt").toFile()
    .useLines { it.toList() }

val bitRange = 0 until inputs.first().length

val gammaRate = bitRange
    .mapIndexed{ index, _ ->
        inputs
            .map { it.toCharArray() }
            .groupingBy { it[index] }
            .eachCount()
            .maxByOrNull { it.value }?.key
    }
        .joinToString("")
    .toInt(2)

val epsilon =  bitRange
    .mapIndexed{ index, _ ->
        inputs
            .map { it.toCharArray() }
            .groupingBy { it[index] }
            .eachCount()
            .minByOrNull { it.value }?.key
    }
    .joinToString("")
    .toInt(2)


val powerConsumption = epsilon * gammaRate
powerConsumption
