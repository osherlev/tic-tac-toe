package main.java.com.ticTacToe.utils

enum class StateEnum(val value: Char) {
    X('X'),
    O('O'),
    TIE('T'),
    CONTINUE('C');

    companion object {
        fun fromValue(value: Char): StateEnum? {
            return entries.find { it.value == value }
        }
    }
}