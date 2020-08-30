package signature

class WithStatus(val text: Element, val status: String) : Element {
    override val width: Int = arrayOf(text.width, status.length).asIterable().max() ?: 0

    override val height: Int = text.height + status.let {
        if (it.isNotBlank()) {
            return@let 1
        } else return@let 0
    }

    override fun printLine(curRow: Int) {
        when {
            curRow == height - 1 -> printStatus()
            curRow < height -> doPrintLine(curRow)
        }
    }

    private fun doPrintLine(curRow: Int) {
        when {
            text.width == width -> text.printLine(curRow)
            text.width < width -> {
                val times = textPaddingLeft()
                repeat(times) {
                    print(' ')
                }
                text.printLine(curRow)
                repeat(width - times - text.width) {
                    print(' ')
                }
            }
        }
    }

    private fun textPaddingLeft(): Int {
        return (width - text.width) / 2
    }

    private fun printStatus() {
        when {
            status.length == width -> print(status)
            status.length < width -> {
                val times = statusPaddingLeft()
                repeat(times) {
                    print(' ')
                }
                print(status)
                repeat(width - times - status.length) {
                    print(' ')
                }
            }
        }
    }

    private fun statusPaddingLeft(): Int {
        return (width - status.length) / 2
    }
}