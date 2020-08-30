package signature

enum class Letter(private val letter: Char) : Element {

    A('A') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|__|",
                    "|  |"
            )
    },
    B('B') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "___ ",
                    "|__]",
                    "|__]"
            )
    },
    C('C') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|   ",
                    "|___"
            )
    },
    D('D') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "___ ",
                    "|  \\",
                    "|__/"
            )
    },
    E('E') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|___",
                    "|___"
            )
    },
    F('F') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|___",
                    "|   "
            )

    },
    G('G') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "| __",
                    "|__]"
            )
    },
    H('H') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    "|__|",
                    "|  |"
            )
    },
    I('I') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_",
                    "|",
                    "|"
            )
    },
    J('J') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    " _",
                    " |",
                    "_|"
            )
    },
    K('K') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    "|_/ ",
                    "| \\_"
            )
    },
    L('L') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_   ",
                    "|   ",
                    "|___"
            )
    },
    M('M') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    "|\\/|",
                    "|  |"
            )
    },
    N('N') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    "|\\ |",
                    "| \\|"
            )
    },
    O('O') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|  |",
                    "|__|"
            )
    },
    P('P') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "___ ",
                    "|__]",
                    "|   "
            )
    },
    Q('Q') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|  |",
                    "|_\\|"
            )
    },
    R('R') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "|__/",
                    "|  \\"
            )
    },
    S('S') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "____",
                    "[__ ",
                    "___]"
            )
    },
    T('T') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "___",
                    " | ",
                    " | "
            )
    },
    U('U') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    "|  |",
                    "|__|"
            )
    },
    V('V') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    "|  |",
                    " \\/ "
            )
    },
    W('W') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_ _ _",
                    "| | |",
                    "|_|_|"
            )
    },
    X('X') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_  _",
                    " \\/ ",
                    "_/\\_"
            )
    },
    Y('Y') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "_   _",
                    " \\_/ ",
                    "  |  "
            )
    },
    Z('Z') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "___ ",
                    "  / ",
                    " /__"
            )
    },
    SPACE(' ') {
        override val letterMatrix: Array<String>
            get() = arrayOf(
                    "    ",
                    "    ",
                    "    "
            )
    };

    abstract val letterMatrix: Array<String>

    override val width: Int
        get() = letterMatrix[0].length;

    override val height: Int
        get() = letterMatrix.size

    override fun printLine(curRow: Int) {
        if (curRow >= letterMatrix.size) {
            return
        }
        letterMatrix[curRow].asIterable()
                .forEach { print(it) }
    }

    companion object {

        private val map = values().associateBy(Letter::letter)

        fun convert(text: String): Array<Letter> {
            return text.map { getBy(it) }
                    .toTypedArray()
        }

        private fun getBy(char: Char): Letter {
            require(char.isLetter() || char == ' ') {
                println("char $char must be a letter or space")
            }
            return map[char.toUpperCase()] ?: error("Couldn't find letter for char $char")
        }
    }
}