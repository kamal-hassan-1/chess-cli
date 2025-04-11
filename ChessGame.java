import java.util.ArrayList;
public class ChessGame {
    public static void Run(){
        ChessBoard gameBoard = new ChessBoard();
        gameBoard.fillBoardDefault();
        char startingColor = 'w';
        while(true){
            ChessCLI.renderBoard(gameBoard);
            ChessCLI.getUserMove(gameBoard,startingColor);
            startingColor = Helpers.invertColor(startingColor);
            if(hasExactlyEightMembers(gameBoard.capturedByWhite)){
                System.out.println("\n\nHURRAH WHITE WINS\n\n");
                break;
            } else if (hasExactlyEightMembers(gameBoard.capturedByBlack)) {
                System.out.println("\n\nHURRAH BLACK WINS\n\n");
                break;
            }
        }
    }
    public static boolean hasExactlyEightMembers(ArrayList<ChessPiece> list) {
        return list != null && !list.isEmpty() && list.size() == 8;
    }
}