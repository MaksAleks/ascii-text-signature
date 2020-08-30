package signature

class Text(private val letters: Array<Letter>, private val delimiter: String) : Element {

    override val width: Int = letters.asIterable()
            .map { it.width }
            .reduce { acc, i -> acc + i }
            .let {
                if (it == 1) {
                    it
                } else {
                    it + letters.size - 1
                }
            }

    // The height of all letters has the same value
    // Therefore the height of entire text equals the height of any letter
    override val height: Int = letters[0].height

    override fun printLine(curRow: Int) {
        if (curRow >= height) return
        letters.asIterable().forEachIndexed() { i, letter ->
            letter.printLine(curRow)
            if (i < letters.size - 1) {
                print(delimiter)
            }
        }
    }
}