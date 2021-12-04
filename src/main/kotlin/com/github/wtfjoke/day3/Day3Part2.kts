import java.nio.file.Paths

val inputs = Paths.get("inputs.txt").toFile()
    .useLines { it.toList() }
val bitLength = inputs.first().length

fun determineOxygen(): Int {
    var oxygens = inputs
    for (i in 0 until bitLength) {
        val oxygensCount = oxygens
            .groupingBy { it[i] }
            .eachCount()
        val maxEntries = oxygensCount.filterValues { it == oxygensCount.values.maxOrNull() }
        val bitCriteria = if (maxEntries.size > 1) '1' else maxEntries.keys.first()

        oxygens = oxygens.filter { bit ->
            bit[i] == bitCriteria
        }
    }
    return oxygens.first().toInt(2)
}

fun determineCo2(): Int {
    var co2 = inputs
    for (i in 0 until bitLength) {
        val co2Count = co2
            .groupingBy { it[i] }
            .eachCount()
        val minEntries = co2Count.filterValues { it == co2Count.values.minOrNull() }
        val bitCriteria = if (minEntries.size > 1) '0' else minEntries.keys.first()

        co2 = co2.filter { bit ->
            bit[i] == bitCriteria
        }
    }
    return co2.first().toInt(2)
}

determineOxygen() * determineCo2()




