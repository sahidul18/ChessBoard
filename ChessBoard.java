
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessBoard extends Application{
    final GridPane board = new GridPane();

    @Override
    public void start(Stage primaryStage){

        colorBoard();
        setupBoard();

        Scene scene = new Scene(board, 320, 320);
        scene.setFill(Color.BLUE);
        primaryStage.setTitle("Chess Board");
        primaryStage.setScene(scene);
        primaryStage.minWidthProperty().bind(scene.heightProperty().divide(1));
        primaryStage.minHeightProperty().bind(scene.widthProperty().divide(1));
        primaryStage.show();
    }

    public void colorBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                StackPane sPane = new StackPane();
                Rectangle rec = new Rectangle(40, 40);
                rec.widthProperty().bind(board.widthProperty().divide(8));
                rec.heightProperty().bind(board.heightProperty().divide(8));

                if( (i + j) % 2 == 0)
                    rec.setFill(Color.WHITE);
                else
                    rec.setFill(Color.GRAY);

                sPane.getChildren().add(rec);
                board.add(sPane, i, j);
            } // end of inner loop
        } // end of outer loop
    }

    public void setupBoard()
    {
        Image bRook = new Image("images/BlackRook.png");
        Image bKnight = new Image("images/BlackKnight.png");
        Image bBishop = new Image("images/BlackBishop.png");
        Image bKing = new Image("images/BlackKing.png");
        Image bQueen = new Image("images/BlackQueen.png");
        Image bPawn = new Image("images/BlackPawn.png");

        Image wRook = new Image("images/WhiteRook.png");
        Image wKnight = new Image("images/WhiteKnight.png");
        Image wBishop = new Image("images/WhiteBishop.png");
        Image wKing = new Image("images/WhiteKing.png");
        Image wQueen = new Image("images/WhiteQueen.png");
        Image wPawn = new Image("images/WhitePawn.png");

        ObservableList list =  board.getChildren();
        int random = ((int)(Math.random() * 20) + 1) % 2;// to randomize the board setup

        for(int i = 0; i < 64; i++){
            StackPane p = (StackPane)list.get(i);
            if(random == 0){ // if random == 0, black pieces on top of the board
                switch (i) {
                    case 0: case 56:
                        ImageView bRookView = new ImageView(bRook);
                        bRookView.setFitHeight(40); bRookView.setFitWidth(40);
                        bRookView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bRookView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bRookView);
                        break;
                    case 8: case 48:
                        ImageView bKnightView = new ImageView(bKnight);
                        bKnightView.setFitHeight(40); bKnightView.setFitWidth(40);
                        bKnightView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bKnightView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bKnightView);
                        break;
                    case 16: case 40:
                        ImageView bBishopView = new ImageView(bBishop);
                        bBishopView.setFitHeight(40); bBishopView.setFitWidth(40);
                        bBishopView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bBishopView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bBishopView);
                        break;
                    case 32:
                        ImageView bKingView = new ImageView(bKing);
                        bKingView.setFitHeight(40); bKingView.setFitWidth(40);
                        bKingView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bKingView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bKingView);
                        break;
                    case 24:
                        ImageView bQueenView = new ImageView(bQueen);
                        bQueenView.setFitHeight(40); bQueenView.setFitWidth(40);
                        bQueenView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bQueenView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bQueenView);
                        break;
                    case 1: case 9: case 17: case 25: case 33:
                    case 41: case 49: case 57:
                        ImageView bPawnView = new ImageView(bPawn);
                        bPawnView.setFitHeight(40); bPawnView.setFitWidth(40);
                        bPawnView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bPawnView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bPawnView);
                        break;
                    // === white images == \\
                    case 7: case 63:
                        ImageView wRookView = new ImageView(wRook);
                        wRookView.setFitHeight(40); wRookView.setFitWidth(40);
                        wRookView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wRookView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wRookView);
                        break;
                    case 15: case 55:
                        ImageView wKnightView = new ImageView(wKnight);
                        wKnightView.setFitHeight(40); wKnightView.setFitWidth(40);
                        wKnightView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wKnightView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wKnightView);
                        break;
                    case 23: case 47:
                        ImageView wBishopView = new ImageView(wBishop);
                        wBishopView.setFitHeight(40); wBishopView.setFitWidth(40);
                        wBishopView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wBishopView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wBishopView);
                        break;
                    case 39:
                        ImageView wKingView = new ImageView(wKing);
                        wKingView.setFitHeight(40); wKingView.setFitWidth(40);
                        wKingView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wKingView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wKingView);
                        break;
                    case 31:
                        ImageView wQueenView = new ImageView(wQueen);
                        wQueenView.setFitHeight(40); wQueenView.setFitWidth(40);
                        wQueenView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wQueenView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wQueenView);
                        break;
                    case 6: case 14: case 22: case 30: case 38:
                    case 46: case 54: case 62:
                        ImageView wPawnView = new ImageView(wPawn);
                        wPawnView.setFitHeight(40); wPawnView.setFitWidth(40);
                        wPawnView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wPawnView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wPawnView);
                        break;
                    default:
                        break;
                }
            }
            else{
                switch (i) {
                    case 0: case 56:
                        ImageView wRookView = new ImageView(wRook);
                        wRookView.setFitHeight(40); wRookView.setFitWidth(40);
                        wRookView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wRookView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wRookView);
                        break;
                    case 8: case 48:
                        ImageView wKnightView = new ImageView(wKnight);
                        wKnightView.setFitHeight(40); wKnightView.setFitWidth(40);
                        wKnightView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wKnightView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wKnightView);
                        break;
                    case 16: case 40:
                        ImageView wBishopView = new ImageView(wBishop);
                        wBishopView.setFitHeight(40); wBishopView.setFitWidth(40);
                        wBishopView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wBishopView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wBishopView);
                        break;
                    case 24:
                        ImageView wKingView = new ImageView(wKing);
                        wKingView.setFitHeight(40); wKingView.setFitWidth(40);
                        wKingView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wKingView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wKingView);
                        break;
                    case 32:
                        ImageView wQueenView = new ImageView(wQueen);
                        wQueenView.setFitHeight(40); wQueenView.setFitWidth(40);
                        wQueenView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wQueenView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wQueenView);
                        break;
                    case 1: case 9: case 17: case 25: case 33:
                    case 41: case 49: case 57:
                        ImageView wPawnView = new ImageView(wPawn);
                        wPawnView.setFitHeight(40); wPawnView.setFitWidth(40);
                        wPawnView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        wPawnView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(wPawnView);
                        break;
                    // === black images == \\
                    case 7: case 63:
                        ImageView bRookView = new ImageView(bRook);
                        bRookView.setFitHeight(40); bRookView.setFitWidth(40);
                        bRookView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bRookView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bRookView);
                        break;
                    case 15: case 55:
                        ImageView bKnightView = new ImageView(bKnight);
                        bKnightView.setFitHeight(40); bKnightView.setFitWidth(40);
                        bKnightView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bKnightView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bKnightView);
                        break;
                    case 23: case 47:
                        ImageView bBishopView = new ImageView(bBishop);
                        bBishopView.setFitHeight(40); bBishopView.setFitWidth(40);
                        bBishopView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bBishopView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bBishopView);
                        break;
                    case 31:
                        ImageView bKingView = new ImageView(bKing);
                        bKingView.setFitHeight(40); bKingView.setFitWidth(40);
                        bKingView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bKingView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bKingView);
                        break;
                    case 39:
                        ImageView bQueenView = new ImageView(bQueen);
                        bQueenView.setFitHeight(40); bQueenView.setFitWidth(40);
                        bQueenView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bQueenView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bQueenView);
                        break;
                    case 6: case 14: case 22: case 30: case 38:
                    case 46: case 54: case 62:
                        ImageView bPawnView = new ImageView(bPawn);
                        bPawnView.setFitHeight(40); bPawnView.setFitWidth(40);
                        bPawnView.fitWidthProperty().bind(board.widthProperty().divide(8));
                        bPawnView.fitHeightProperty().bind(board.heightProperty().divide(8));
                        p.getChildren().add(bPawnView);
                        break;
                    default:
                        break;
                }
            }
        } // end of big for loop, it sets up the pieces on the board randomly
    } // end of setupBoard()

    public static void main(String[] args){
        Application.launch(args);
    }
}
