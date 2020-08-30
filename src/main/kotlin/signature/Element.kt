package signature

interface Element {

    val width: Int

    val height: Int

    fun printLine(curRow: Int)

    fun renderElement() {
        var curRow = 0
        repeat(height) {
            printLine(curRow)
            println()
            curRow++
        }
    }

    fun with(block: (Element) -> Element): Element {
        return block(this)
    }
}