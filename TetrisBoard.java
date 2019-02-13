public class TetrisBoard{
	
	/**
	* 2-D array of the blocks which make up the tetris board
	*/
	Block[][] board; 

	/**
	* 2-D array which holds the x & y coordinates of the 4 falling blocks
	*/
	int[][] fallingPiecePos;

	/**
	* flag for whether a piece is currently falling or not
	*/	
	boolean pieceFalling;

	/**
	* enum class for the Different types of Tetrimono pieces
	*/	
	enum Tetrimono{O,L,S,Z,J,T}

	/**
	* number of rows on the board
	*/
	int numOfRows;

	/**
	* number of columns on the board
	*/
	int numOfCols;


	/**
	* Constructor to initialize an empty board variables
	*
	*/
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


	/**
	* Drops a new tetrimono piece to the top - middle of the board.
	* Sets the fallingPiecePos array to respective values.
	* @param type the type of Tetrimono to drop
	*
	*/
	public void dropNewPiece(Tetrimono type){
		int mid = numOfCols/2; //index of the center column of board
		Block.Color c; //Color of the new piece

		switch(type){
			
			case O: 


			/*

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

			c = Block.Color.YELLOW;
			break;
			
		}

		for(int i = 0 ; i < fallingPiecePos.length; i++){
			board[fallingPiecePos[i][0]][fallingPiecePos[i][1]].setColor(c);
		}

		pieceFalling = true;
	}


	/**
	* Prints string representation of the board.
	*/
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


	/**
	* Rotates the falling piece clockwise.
	*
	*/
	public void rotateFallingPiece(){

	}

	/**
	* Rotates the falling piece 1 unit left if possible. 
	*
	*/
	public void shiftPieceLeft(){

	}

	/**
	* Shifts the falling piece 1 unit right if possible.
	*
	*/
	public void shiftPieceRight(){
		
	}

	/**
	* Clears the row specified by int row, then moves down all the blocks above.
	*
	*/
	public void clearRow(int row){

	}

	/**
	* main method; currently used for testing
	*/
	public static void main(String[] args){
		TetrisBoard t = new TetrisBoard();
		t.dropNewPiece(Tetrimono.T);
		t.displayBoard();
	}


}