package property

import property.PropertyColor.*

// Center Circle / Bottom Right
val MediterraneanAve = Property("Mediterranean Ave", 60, listOf(2, 10, 30, 90, 160, 250, 750), 50, 30)
val BalticAve = Property("Baltic Ave", 60, listOf(4, 20, 60, 180, 320, 450, 90), 50, 30) // TODO Check SKYSCRAPER

// Center Circle / Bottom Left
val OrientalAve = Property("Oriental Ave", 100, listOf(6, 30, 90, 270, 400, 550, 1050), 50, 50)
val VermontAve = OrientalAve.copy(name = "Vermont Ave")
val ConnecticutAve = Property("Connecticut Ave", 120, listOf(8, 40, 100, 300, 450, 600, 1100), 50, 60)

// Center Circle / Left Bottom
val StCharlesPlace = Property("St Charles Place", 140, listOf(10, 50, 150, 450, 625, 750, 1250), 100, 70)
val StatesAve = StCharlesPlace.copy(name = "States Ave")
val VirginiaAve = Property("Virginia Ave", 160, listOf(12, 60, 180, 500, 700, 900, 1400), 100, 80)

// Center Circle / Left Top
val StJamesPlace = Property("St James Place", 180, listOf(14, 70, 200, 550, 750, 950, 1450), 100, 90)
val TennesseeAve = StJamesPlace.copy(name = "Tennessee Ave")
val NewYorkAve = Property("New York Ave", 200, listOf(16, 80, 220, 600, 800, 1000, 1500), 100, 100)

// Center Circle / Top Left
val KentuckyAve = Property("Kentucky Ave", 220, listOf(18, 90, 250, 700, 875, 1050, 2050), 150, 100)
val IndianaAve = KentuckyAve.copy(name = "Indiana Ave")
val IllinoisAve = Property("Illinois Ave", 240, listOf(20, 100, 300, 750, 925, 1100, 2100), 150, 120)

// Center Circle / Top Right
val AtlanticAve = Property("Atlantic Ave", 260, listOf(22, 110, 330,800, 975, 1150, 2150), 150, 130)
val VentnorAve = AtlanticAve.copy(name = "Ventnor Ave")
val MarvinGardens = Property("Marvin Gardens", 280, listOf(24, 120, 350, 850, 1025, 1200, 2200), 150, 140)

// Center Circle / Right Top
val PacificAve = Property("Pacific Ave", 300, listOf(26, 130, 390, 900, 1100, 1275, 2275), 200, 150)
val NoCarolinaAve = PacificAve.copy(name = "No Carolina Ave")
val PennsylvaniaAve = Property("Pennsylvania Ave", 320, listOf(28, 150, 450, 1000, 1200, 1400, 2400), 200, 160)

// Center Circle / Right Bottom
val ParkPlace = Property("Park Place", 350, listOf(35, 175, 500, 1100, 1300, 1500, 2500), 200, 200)
val Boardwalk = Property("Boardwalk", 400, listOf(50, 200, 600, 1400, 1700, 2000, 3000), 200, 200)

// Inner Circle / Top Right
val FloridaAve = Property("Florida Ave", 130, listOf(9, 45, 120, 350, 500, 700, 1200), 50, 65)
val MiamiAve = FloridaAve.copy(name = "Miami Ave")
val BiscayneAve = Property("Biscayne Ave", 150, listOf(11, 55, 160, 475, 650, 800, 1300), 50, 75)

// Inner Circle / Right Bottom
val LombardSt = Property("Lombard St", 210, listOf(17, 85, 240, 475, 670, 1025, 1525), 100, 105)
val TheEmbarcadero = LombardSt.copy(name = "The Embarcadero")
val FishermansWharf = Property("Fisherman's Wharf", 250, listOf(21, 105, 320, 750, 950, 1125, 1625), 100, 125)

// Inner Circle / Bottom Left
val BeaconSt = Property("Beacon St", 330, listOf(30, 160, 470, 1050, 1250, 1500, 2500), 200, 165)
val BoylstonSt = BeaconSt.copy(name = "Boylston St")
val NewburySt = Property("Newbury St", 380, listOf(40, 185, 550, 1200, 150, 1700, 2700), 200, 190)

// Inner Circle / Left Top
val FifthAve = Property("Fifth Ave", 430, listOf(60, 220, 650, 1500, 1800, 2100, 3600), 300, 215)
val MadisonAve = FifthAve.copy(name = "Madison Ave")
val WallSt = Property("Wall St", 500, listOf(80, 300, 800, 1800, 2200, 2700, 4200), 300, 250)

// Outer Circle / Bottom Right
val LakeSt = Property("Lake St", 30, listOf(1, 5, 15, 45, 125, 625), 50, 15)
val NicolletAve = LakeSt.copy(name = "Nicollet Ave")
val HennepinAve = Property("Hennepin Ave", 60, listOf(3, 15, 45, 120, 240, 350, 850), 50, 30)

// Outer Circle / Bottom Left
val TheEsplanade = Property("The Esplanade", 90, listOf(5, 25, 80, 225, 360, 600, 1000), 50, 50)
val CanalSt = TheEsplanade.copy(name = "Canal St")
val MagazineSt = Property("Magazine St", 120, listOf(8, 40, 100, 300, 450, 600, 1100), 50, 60)
val BourbonSt = MagazineSt.copy(name = "Bourbon St")

// Outer Circle / Left Bottom
val KatyFreeway = Property("Katy Freeway", 150, listOf(11, 55, 160, 475, 650, 800, 1300), 100, 70)
val WestheimerRd = KatyFreeway.copy(name = "Westheimer Rd")
val KirbyDr = Property("Kirby Dr", 180, listOf(14, 70, 200, 550, 750, 950, 1450), 100, 80)
val CullenBlvd = KirbyDr.copy(name = "Cullen Blvd")

val streetMap = mapOf(
    // Center Circle
    Pair(Color580C39, listOf(MediterraneanAve, BalticAve)),
    Pair(Color87A5D7, listOf(OrientalAve, VermontAve, ConnecticutAve)),
    Pair(ColorEF3878, listOf(StCharlesPlace, StatesAve, VirginiaAve)),
    Pair(ColorF58023, listOf(StJamesPlace, TennesseeAve, NewYorkAve)),
    Pair(ColorD40000, listOf(KentuckyAve, IndianaAve, IllinoisAve)),
    Pair(ColorFFCC00, listOf(AtlanticAve, VentnorAve, MarvinGardens)),
    Pair(Color098733, listOf(PacificAve, NoCarolinaAve, PennsylvaniaAve)),
    Pair(Color284EA1, listOf(ParkPlace, Boardwalk)),

    // Inner Circle
    Pair(ColorAA4400, listOf(FloridaAve, MiamiAve, BiscayneAve)),
    Pair(ColorFFFFFF, listOf(LombardSt, TheEmbarcadero, FishermansWharf)),
    Pair(Color000000, listOf(BeaconSt, BoylstonSt, NewburySt)),
    Pair(Color808080, listOf(FifthAve, MadisonAve, WallSt)),

    // Outer Circle
    Pair(ColorFFAAAA, listOf(LakeSt, NicolletAve, HennepinAve)),
    Pair(Color80FF80, listOf(TheEsplanade, CanalSt, MagazineSt, BourbonSt)),
    Pair(ColorFFE680, listOf(KatyFreeway, WestheimerRd, KirbyDr, CullenBlvd)),
)

fun Map<PropertyColor, List<Property>>.getColor(property: Property): PropertyColor? {
    entries.forEach { if (it.value.contains(property)) return it.key }
    return null
}