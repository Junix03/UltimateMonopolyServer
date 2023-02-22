package propertyImageCreation

import property.*
import property.PropertyColor.ColorAFE7CC
import java.awt.Color
import java.awt.Font
import java.awt.Image
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    streetMap.entries.forEach { list -> list.value.forEach { property ->  createStreetCard(property) } }
}

fun createStreetCard(property: Property) {
    val width = 1500; val height = 2000; val fontStyle = "Arial"

    val propertyCard = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = propertyCard.graphics
    graphics.color = Color.WHITE
    graphics.fillRect(0, 0, width, height)

    // Header
    val propertyColor = (streetMap.getColor(property) ?: ColorAFE7CC).color
    graphics.color = propertyColor
    graphics.fillRect(100, 100, 1300, 400)

    graphics.color = Color.BLACK
    for (i in 0 until 5)
        graphics.drawRect(100 + i, 100 + i, 1300 - 2 * i, 400 - 2 * i)

    var size = 75
    graphics.font = Font(fontStyle, Font.PLAIN, size)
    graphics.color = getStringColor(propertyColor)
    val title = getPropertyType(property).cardTitle + " Property Card"
    graphics.drawString(title, (width - graphics.fontMetrics.stringWidth(title)) / 2, 150 + size / 2)

    size = 130
    graphics.font = Font(fontStyle, Font.PLAIN, size)
    graphics.drawString(property.name, (width - graphics.fontMetrics.stringWidth(property.name)) / 2, 320 + size / 2)

    // Body
    graphics.font = Font(fontStyle, Font.PLAIN, 80)
    graphics.color = Color.BLACK
    val rent0 = "Rent: ${property.rent[0]}$"
    graphics.drawString(rent0, (width - graphics.fontMetrics.stringWidth(rent0)) / 2, 640)

    for (i in 1..6) {
        val house = if (i == 1) "With 1 House" else if (i in 2..4) "With $i Houses" else if (i == 5) "With HOTEL" else "With SKYSCRAPER"
        graphics.drawString(house, 120, 690 + i * 100)
        graphics.drawString("${property.rent[i]}", 1380 - graphics.fontMetrics.stringWidth("${property.rent[i]}"), 690 + i * 100)
        graphics.drawString("$", 1100, 690 + i * 100)
    }

    graphics.font = Font(fontStyle, Font.BOLD, 80)
    val mortgage = "Mortgage: $${property.mortgage}"
    graphics.drawString(mortgage, (width - graphics.fontMetrics.stringWidth(mortgage)) / 2, 1440)

    val targetHeight: Int = height
    ImageIO.write(resizeImage(propertyCard, 1500 * targetHeight / 2000, targetHeight), "png", File("resources/${property.name.replace(" ", "_")}.png"))
}

private fun resizeImage(original: BufferedImage, targetWidth: Int, targetHeight: Int): BufferedImage {
    val image = original.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT)
    val resize = BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB)
    resize.graphics.drawImage(image, 0, 0, null)
    return resize
}

private fun getStringColor(propertyColor: Color): Color =
    if ((propertyColor.red + propertyColor.green + propertyColor.blue) / 2 > 128)
        Color.BLACK
    else
        Color.WHITE
