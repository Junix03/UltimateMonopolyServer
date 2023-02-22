package property

import java.awt.Color

val Station = Property(name = "Error: Not defined", price = 200, rent = listOf(25, 50, 100, 200), mortgage = 100)
val CabCo = Property(name = "Error: Not defined", price = 300, rent = listOf(30, 60, 120, 240), mortgage = 150)
val Utility = Property(name = "Error: Not defined", price = 150, rent = listOf(4, 10, 20, 40, 80, 100, 120, 150), mortgage = 75)

data class Property(val name: String, val price: Int, val rent: List<Int>, val upgrade: Int = -1, val mortgage: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Property

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}

enum class PropertyColor(private val color: Color) {
    // Miscellaneous
    ColorAFE7CC(Color(175, 231, 204)),

    // Center Circle
    Color580C39(Color(88, 12, 57)), Color87A5D7(Color(135, 165, 215)),
    ColorEF3878(Color(239, 56, 120)), ColorF58023(Color(245, 128, 35)),
    ColorD40000(Color(212, 0, 0)), ColorFFCC00(Color(255, 204, 0)),
    Color098733(Color(9, 135, 51)), Color284EA1(Color(40, 78, 161)),

    // Inner Circle
    ColorAA4400(Color(170, 68, 0)), ColorFFFFFF(Color(255, 255, 255)),
    Color000000(Color(0, 0, 0)), Color808080(Color(128, 128, 128)),

    // Outer Circle
    ColorFFAAAA(Color(255, 170, 170)), Color80FF80(Color(128, 255, 128)),
    ColorFFE680(Color(255, 230, 128)), Color008066(Color(0, 128, 102)),
    Color800033(Color(128, 0, 51)), ColorAA8800(Color(170, 136, 0)),
    ColorFFB380(Color(255, 179, 128)), Color800000(Color(128, 0, 0));

    fun rgb() = color.rgb

    fun hex() = convertToHex(rgb())
    private fun convertToHex(int: Int) = int.toString(16).padStart(6, '0')
}

