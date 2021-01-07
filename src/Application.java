public class Application {

    final static byte CHESS_WIDTH = -2;
    final static byte CHESS_HEIGHT = 9;

    public static void main(String[] args) {
        Chess chessBoard = new Chess();
        chessBoard.buildChessBoard(CHESS_WIDTH,CHESS_HEIGHT);

    }
}
