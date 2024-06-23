//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val fruits = arrayOf("яблоко", "арбуз", "груша", "гранат", "дыня", "виноград")
   println(fruits.groupBy { it.first() })


//2
    println(fruits.groupBy { it.length})
//3
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    println(phoneToYear.groupBy {it.second})

}