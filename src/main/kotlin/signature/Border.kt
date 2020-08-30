package signature

/**
 * @param symbol - symbol of border
 * @param padding - padding array.
 *              Padding means the distance (count of characters) between
 *              the border symbol and an inner text
 *
 *  padding array element index - meaning
 *  -----------------------------
 *              padding[0] - padding top
 *              padding[1] - padding right
 *              padding[2] - padding bottom
 *              padding[3] - left
 */
class Border(val symbol: Char, val padding: Array<Int>, val element: Element) : Element {
    // magic num 2 = left symbol of the border + right symbol of the border
    override val width: Int
        get() = padding[1] + padding[3] + element.width + 2

    override val height: Int
        get() = padding[0] + padding[2] + element.height + 2


    override fun printLine(curRow: Int) {
        when {
            curRow == 0 -> printTop()
            curRow in 1..padding[0] -> printPaddingVertical()
            curRow in (padding[0] + 1).rangeTo(padding[0] + element.height) -> {
                printElementLine(curRow - padding[0] - 1)
            }
            curRow < height - 1 -> printPaddingVertical()
            curRow == height - 1 -> printBottom()
        }
    }

    private fun printElementLine(curRow: Int) {
        print(symbol)
        repeat(padding[3]) {
            print(' ')
        }
        element.printLine(curRow)
        repeat(padding[1]) {
            print(' ')
        }
        print(symbol)
    }

    private fun printBottom() {
        printTop()
    }

    private fun printTop() {
        repeat(width) {
            print(symbol)
        }
    }

    private fun printPaddingVertical() {
        print(symbol)
        repeat(width - 2) {
            print(' ')
        }
        print(symbol)
    }
}