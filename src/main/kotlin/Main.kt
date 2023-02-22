import property.streetMap

fun main() {
    streetMap.entries.forEach { list -> list.value.forEach { property -> if (property.rent.size != 7) println(property.name) } }
}