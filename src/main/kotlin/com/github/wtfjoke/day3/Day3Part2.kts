import java.nio.file.Paths

val inputs = Paths.get("sample.txt").toFile()
    .useLines { it.toList() }

val bitLength = inputs.first().length

fun something(): List<String> {
    var oxygens = inputs
    for (i in 0 until bitLength) {

        oxygens = oxygens.filter { bit ->
            bit[i] == oxygens
                .groupingBy { it[i] }
                .eachCount()
//            .toSortedMap().lastKey()
                .maxByOrNull { it.value }?.key
        }
    }
    return oxygens
}

println(something().first())
fun bla(){
    val something = listOf("10110", "10111")
    val eachCount = something.groupingBy { it[4] }.eachCount()
    val sorted = eachCount.toSortedMap().lastKey()
    println(sorted)
}

bla()
//println(eachCount.toSortedMap().maxByOrNull { it.value })

//var co2 = inputs
//for (i in 0 until bitLength) {
//    co2 = co2.filter { bit ->
//        bit[i] == co2
//            .groupingBy { it[i] }
//            .eachCount()
//            .minByOrNull { it.value }?.key
//    }
//}



//println(co2.first())

//val count = inputs
//    .groupingBy { it.first() }
//    .eachCount()
//val oxygen = count
//    .maxByOrNull { it.value }
//
//val co2Scrubber = count.minByOrNull { it.value }
//
//val oxygenNo = inputs.filter { it.first() == oxygen?.key }





//val secondOxyGenCombined = oxygenNo.filter { bit ->
//    bit[1] == oxygenNo
//        .groupingBy { it[1] }
//        .eachCount()
//        .maxByOrNull { it.value }?.key
//}
//
//val thirdOxyGenCombined = secondOxyGenCombined.filter { bit ->
//    bit[2] == secondOxyGenCombined
//        .groupingBy { it[2] }
//        .eachCount()
//        .maxByOrNull { it.value }?.key
//}
//
//val fourthOxyGenCombined = thirdOxyGenCombined.filter { bit ->
//    bit[3] == thirdOxyGenCombined
//        .groupingBy { it[3] }
//        .eachCount()
//        .maxByOrNull { it.value }?.key
//}
//
//val fifth = fourthOxyGenCombined.filter { bit ->
//    bit[4] == fourthOxyGenCombined
//        .groupingBy { it[4] }
//        .eachCount()
//        .maxByOrNull { it.value }?.key
//}





