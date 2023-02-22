package property

import property.PropertyColor.*
import property.PropertyType.*

// Center Circle / Bottom Right
val MediterraneanAve = Property("Mediterranean Ave", 60, listOf(2, 10, 30, 90, 160, 250, 750), 50, 30)
val BalticAve = Property("Baltic Ave", 60, listOf(4, 20, 60, 180, 320, 450, 900), 50, 30)

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
val LakeSt = Property("Lake St", 30, listOf(1, 5, 15, 45, 80, 125, 625), 50, 15)
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

// Outer Circle / Left Top
val DekalbAve = Property("Dekalb Ave", 210, listOf(17, 85, 240, 670, 840, 1025, 1525), 100, 90)
val YoungIntlBlvd = DekalbAve.copy(name = "Young Int'l Blvd")
val DecaturSt = Property("Decatur St", 240, listOf(20, 100, 300, 750, 925, 1100, 1600), 100, 100)
val PeachtreeSt = DecaturSt.copy(name = "Peachtree St")

// Outer Circle / Top Left
val RandolphSt = Property("Randolph St", 270, listOf(23, 115, 345, 825, 1010, 1180, 2180), 150, 110)
val LakeShoreDr = RandolphSt.copy(name = "Lake Shore Dr")
val WackerDr = Property("Wacker Dr", 300, listOf(26, 130, 390, 900, 1100, 1275, 2275), 150, 120)
val MichiganAve = WackerDr.copy(name = "Michigan Ave")

// Outer Circle / Top Right
val SouthTemple = Property("South Temple", 330, listOf(32, 160, 470, 1050, 1250, 1500, 2500), 200, 130)
val WestTemple = SouthTemple.copy(name = "West Temple")
val NorthTemple = Property("North Temple", 360, listOf(38, 170, 520, 1125, 1425, 2275, 2650), 200, 140)
val TempleSquare = NorthTemple.copy(name = "Temple Square")

// Outer Circle / Right Top
val SouthSt = Property("South St", 390, listOf(45, 210, 575, 1300, 1600, 1800, 3300), 250, 150)
val BroadSt = SouthSt.copy(name = "Broad St")
val WalnutSt = Property("Walnut St", 420, listOf(55, 225, 630, 1450, 1750, 2050, 3550), 250, 160)
val MarketSt = WalnutSt.copy(name = "Market St")

// Outer Circle / Right Bottom
val MulhollandBlvd = Property("Mulholland Blvd", 450, listOf(70, 350, 750, 1600, 1850, 2100, 3600), 300, 175)
val VenturaBlvd = Property("Ventura Blvd", 480, listOf(80, 400, 825, 1800, 2175, 2550, 4050), 300, 200)
val RodeoDr = Property("Rodeo Dr", 510, listOf(90, 450, 900, 2000, 2500, 3000, 4500), 300, 250)

// Station
val PennsylvaniaRR = Station.copy(name = "Pennsylvania R.R.")
val ReadingRailroad = Station.copy(name = "Reading Railroad")
val BORailroad = Station.copy(name = "B&O Railroad")
val ShortLine = Station.copy(name = "Short Line")

// CabCo
val CheckerCabCo = CabCo.copy(name = "Checker Cab Co.")
val BlackWhiteCabCo = CabCo.copy(name = "Black & White Cab Co.")
val YellowCabCo = CabCo.copy(name = "Yellow Cab Co.")
val UteCabCo = CabCo.copy(name = "Ute Cab Co.")

// Utility
val WaterWorks = Utility.copy(name = "Water Works")
val CableCompany = Utility.copy(name = "Cable Company")
val ElectricCompany = Utility.copy(name = "Electric Company")
val InternetServiceProvider = Utility.copy(name = "Internet Service Provider")
val GasCompany = Utility.copy(name = "Gas Company")
val TelephoneCompany = Utility.copy(name = "Telephone Company")
val TrashCollector = Utility.copy(name = "Trash Collector")
val SewageSystem = Utility.copy(name = "Sewage System")

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
    Pair(Color008066, listOf(DekalbAve, YoungIntlBlvd, DecaturSt, PeachtreeSt)),
    Pair(Color800033, listOf(RandolphSt, LakeShoreDr, WackerDr, MichiganAve)),
    Pair(ColorAA8800, listOf(SouthTemple, WestTemple, NorthTemple, TempleSquare)),
    Pair(ColorFFB380, listOf(SouthSt, BroadSt, WalnutSt, MarketSt)),
    Pair(Color800000, listOf(MulhollandBlvd, VenturaBlvd, RodeoDr))
)

val stationList = listOf(PennsylvaniaRR, ReadingRailroad, BORailroad, ShortLine)
val cabCoList = listOf(CheckerCabCo, BlackWhiteCabCo, YellowCabCo, UteCabCo)
val utilityList = listOf(WaterWorks, CableCompany, ElectricCompany, InternetServiceProvider, GasCompany, TelephoneCompany, TrashCollector, SewageSystem)

fun Map<PropertyColor, List<Property>>.getColor(property: Property): PropertyColor? {
    entries.forEach { if (it.value.contains(property)) return it.key }
    return null
}

fun getPropertyType(property: Property): PropertyType {
    return if (stationList.contains(property))
        STATION
    else if (cabCoList.contains(property))
        CABCO
    else if (utilityList.contains(property))
        UTILITY
    else
        STREET
}
