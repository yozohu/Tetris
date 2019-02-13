public class TetrisBoard{
	Block[][] board;
	int[][] fallingPiecePos;
	boolean pieceFalling;
	enum Tetrimono{O,L,S,Z,J,T}
	int numOfRows, numOfCols;



	public TetrisBoard(){
		numOfCols = 20;
		numOfRows = 20;
		board = new Block[numOfRows][numOfCols];
		for(int i = 0 ; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				board[i][j] = new Block();
			}
		}

		fallingPiecePos = new int[4][2];
		pieceFalling = false;
	}

	public void dropNewPiece(Tetrimono type){
		int mid = numOfCols/2;
		switch(type){
			/*
			case O: 

			case L:

			case S:

			case Z:

			case L:

			case J:*/

			case T: 
			fallingPiecePos[0][0] = 0; //row 
			fallingPiecePos[0][1] = mid -1; //column

			fallingPiecePos[1][0] = 0;
			fallingPiecePos[1][1] = mid;

			fallingPiecePos[2][0] = 0;
			fallingPiecePos[2][1] = mid+1;

			fallingPiecePos[3][0] = 1;
			fallingPiecePos[3][1] = mid;
			
		}

		for(int i = 0 ; i < fallingPiecePos.length; i++){
			board[fallingPiecePos[i][0]][fallingPiecePos[i][1]].setColor(Block.Color.YELLOW);
		}

		pieceFalling = true;
	}

	public void displayBoard(){
		String res = "";
		for(int i =0; i< board.length; i++){
			for(int j = 0 ; j< board[0].length; j++){
				res +="[";
				if(board[i][j].color() != Block.Color.BLANK){
					res+="X";
				}else{
					res += " ";
				}
				res += "]";
			}
			res += "\n";
		}
		System.out.println(res);
	}

	public static void main(String[] args){
		TetrisBoard t = new TetrisBoard();
		t.dropNewPiece(Tetrimono.T);
		t.displayBoard();
	}
}