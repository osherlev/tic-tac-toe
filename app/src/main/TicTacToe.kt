import main.java.com.ticTacToe.utils.GameUtils.checkGameState

// Example usage
fun main() {
    val board = arrayOf(
            charArrayOf('X', 'O', 'X'),
            charArrayOf('X', 'O', 'O'),
            charArrayOf('O', 'X', 'X')
    )

    println(checkGameState(board)) // Example: It's a tie

    val board2 = arrayOf(
            charArrayOf('X', 'X', ' '),
            charArrayOf('O', 'O', 'O'),
            charArrayOf('X', ' ', ' ')
    )

    println(checkGameState(board2)) // Example: O wins

    val board3 = arrayOf(
            charArrayOf('X', 'X', 'X'),
            charArrayOf('O', 'O', ' '),
            charArrayOf('X', 'O', ' ')
    )

    println(checkGameState(board3)) // Example: X wins
}