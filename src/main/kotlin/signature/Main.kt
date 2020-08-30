package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter name and surname:")
    val fullName = scanner.nextLine()
    println()
    print("Enter person's status:")
    val status = scanner.nextLine()
    println()
    val text = Text(Letter.convert(fullName), " ");
    val textWithStatus = WithStatus(text, status)
    val padding = arrayOf(0, 2, 0, 2)
    val withBorder = Border('*', padding, textWithStatus)
    withBorder.renderElement()
}

