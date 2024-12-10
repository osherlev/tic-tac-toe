import main.ticTacToe.util.GameUtils.checkGameState

// Example usage
fun main() {
    val board = arrayOf(
            charArrayOf('X', 'O', 'O'),
            charArrayOf('X', 'O', 'X'),
            charArrayOf('O', 'X', 'X')
    )

    println(checkGameState(board)) // Example: It's a tie

    val board2 = arrayOf(
            charArrayOf('X', 'X', ' '),
            charArrayOf('O', 'O', 'O'),
            charArrayOf('X', ' ', ' ')
    )

    println(checkGameState(board2)) // Example: O wins
}