import java.util.*;

public class Sudoku_1
{
	//ooooh so SIZE was not working since I needed to put public static final int 
	
	static int size_of_board =9;
	public static int row =0;
	public static int col=0;
	public static Scanner uInput = new Scanner(System.in);
		
	/*
	//make 2D array an array of strings or integers? 
	//String[][] board = new String[size_of_board][size_of_board];
	//Okay so it works even if I make it a 2D array of strings using that commented out code
	*/

	public static int[][] board = new int[size_of_board][size_of_board];
	/*

	public void Sudoku(int[][] a_board)
	{
		this.a_board = new int[size][size];

		for (int x=0;x<size;x++)
		{
			for (int y=0;y<size;y++)
			{
				this.a_board[x][y]=board[x][y];
			}
		} 
	}
	*/ 
	/*public static FillBoard()
	{
		for (row=0;row<size_of_board;row++)
		{
			for (col=0;col<size_of_board;col++)
			{
				if (board[row][col]==0)
				{
					//so basically if there's an empty space try numbers 1-9 if 
					//and only if it respects the rules of sudoku
					for(int testNum=1;testNum<=size_of_board;testNum++)
					{
						//increment test num until it works
						if (isSpaceSafe(row, col, testNum)==true && ThreebyThreeOK(row, col, testNum)==true)
						{
							if (CanMoveBeMade(row, col, testNum)==true)
							{
								System.out.println("Move can be made ");
								board[row][col]=testNum;
							}

							else
							{
								//so if it was not solved set the number that we were trying out back to 0 
								//to represent the empty space again
								//so it backtracks in a way
								//not sure if this is the 'proper' way to do this, but this is what makes sense to me 
								board[row][col]=0;
							}
	}
	*/

	public static boolean WasSudokuSolved()
	{
		//idk why but it keeps going out of index at line 100 which does not make sense to me rn ughhhh
		//never seems to go to row 2
		for (row=0;row<size_of_board;row++)
		{
			if (row>size_of_board-1)
			{
				break;
			}
			System.out.print(" Row: "+row+"\n");

			for (col=0;col<size_of_board;col++)
			{
				if (col>size_of_board-1)
				{
					//yeah this is DEFINITELY not helping it stay in bounds
					break;
				}
				System.out.print(" Col: "+col+"\n");
				if (board[row][col]==0)
				{
					for (int testNum = 1;testNum<=size_of_board;testNum++)
					{
						if (CanMoveBeMade(row, col, testNum))
						{
							board[row][col]=testNum;
							//so if a move is safe set it to the test number

							if (WasSudokuSolved())
							{
								return true;
							}

							//else
							//{
							board[row][col]=0;
								//this is sort of backtracking by setting space back to 0
							//}
						}
					}
				  return false;
				}
			}
		}
		return true;
		//return false;
	}
		//okay so it works without someBoard as a parameter here too
		//recursion == calling function inside of itself
		/*
		size_of_board=9;

		for (row=0;row<size_of_board;row++)
		{
			if (row>size_of_board-1)
                {
                	break;
                	//this is kind of sloppy but it stops the outer loop from going over 8 rows
                }

			for (col=0;col<size_of_board-1;col++)
			{

                if (col>=size_of_board-1)
                {
                	break;
                }

				if (board[row][col]==0)
				{
						
						for(int testNum=1;testNum<=size_of_board;testNum++)
						{
							if (CanMoveBeMade(row,col,testNum))
							{
								System.out.println("Move can be made ");
								System.out.println("\n Test Num is: "+testNum);
								//doesn't seem to be setting values
								board[row][col]=testNum;

								if (WasSudokuSolved())
								{
									return true;
								}

								board[row][col]=0;
							}
						}
						*/
						//board[row][col]=0;
					//so basically if there's an empty space try numbers 1-9 if 
					//and only if it respects the rules of sudoku
					//for(int testNum=1;testNum<=size_of_board;testNum++)
					//{
						/*if (CanMoveBeMade(row,col,testNum))
							{
								System.out.println("Move can be made ");
								System.out.println("\n Test Num is: "+testNum);
								//doesn't seem to be setting values
								board[row][col]=testNum;
								*/
						//increment test num until it works
						//if (isSpaceSafe(row, col, testNum)==true && ThreebyThreeOK(row, col, testNum)==true)
						//{
							//if (CanMoveBeMade(row, col, testNum)==true)

							/*if (CanMoveBeMade(row,col,testNum))
							{
								System.out.println("Move can be made ");
								System.out.println("\n Test Num is: "+testNum);
								//doesn't seem to be setting values
								board[row][col]=testNum;

								if (WasSudokuSolved())
								{
									return true;
								}
								//return true;
							}

							//else
							//{
								//so if it was not solved set the number that we were trying out back to 0 
								//to represent the empty space again
								//so it backtracks in a way
								//not sure if this is the 'proper' way to do this, but this is what makes sense to me 
								board[row][col]=0;
							//}
							*/
						//}
						/*if (CanMoveBeMade(row, col, testNum)==true)
						{
							System.out.println("Move can be made ");
							return true;
						}

						else
						{
							//so if it was not solved set the number that we were trying out back to 0 
							//to represent the empty space again
							//so it backtracks in a way
							//not sure if this is the 'proper' way to do this, but this is what makes sense to me 
							board[row][col]=0;
						}*/
					//}
					//return false;
				//}
			  //so if it did not solve it will set it back to 0 exit that inner for loop and retrun false
			  //return false;
			//}
		//}
	   //if it made it through the inner and outer loop without returing something that means it worked (hopefully) and should return true
	  //return true;
	//}
	

	public static boolean isSpaceSafe(int row, int col, int testNum)
	{
		//I don't think I need someBoard actually since board is initialized outside of this function
		//come back and fix that later
		//size_of_board=9;
		for (int i=0;i<size_of_board;i++)
		{
			//checks to see if number is already in row
			if (board[row][i]==testNum)
			{
				//System.out.print("Row not safe \n");
				return false;
			}
		}

		for (int j=0;j<size_of_board;j++)
		{
			//checks to see if number is already in column
			if (board[j][col]==testNum)
			{
				//System.out.print("Column not safe \n");
				return false;
			}
		}
		//this basically means it is safe for the rows & columns but didn't check 3x3 yet
		//System.out.print("The row & column are safe \n");
		return true;
	}

	public static boolean ThreebyThreeOK(int row, int col, int testNum)
	{
		//checks 3x3 grid
		//Prof. Brizan said something about dividing by 3 then adding 3 to the variables
		//to offset that I think??
		int i=0;
		int j=0;
		int startOfrow=row/3;
		int startOfcol=col/3;

		//for (i=0;i<3;i++)
		for(i=startOfrow;i<startOfrow+3;i++)
		{
			//for (j=0,j<3,j++)
			for(j=startOfcol;j<startOfcol+3;j++)
			{
				if (board[i][j]==testNum)
				{
					//prof said I had true and false flipped so see if this works now
					//System.out.print("3x3 is not okay \n");
					return false;
				}
			}
		}
		//System.out.print("3x3 is okay \n");
		//these print statements help me to keep track of what is going on even if they are a little redundant
	  return true;
	}

	public static boolean CanMoveBeMade(int row, int col, int testNum)
	{
		//okay so this one basically checks to see that the rows, columns, and 3x3 
		//grid are all safe, all inside of this single boolean
		if (isSpaceSafe(row, col, testNum)==true && ThreebyThreeOK(row, col, testNum)==true)
		{
			//System.out.print("A move can be made. \n");
			return true;
		}
	  return false;
	}

	public static void MakeBoard(int[][] aBoard)
	//does make board need to return a board? I feel like it doesn't really need to
	//changed return type from int[][] to void
	{
		for(row = 0; row < size_of_board; row++)
		{	
			if (row>size_of_board-1)
                {
                	break;
                	//this is kind of sloppy but it stops the outer loop from going over 8 rows
                }
            System.out.println("Please enter a row of numbers with nine digits, each separated by a space. To enter empty spaces, please type 0.");

            for(col = 0; col < size_of_board; col++)
            {
                //board[row][col] = uInput.next();
                aBoard[row][col]=uInput.nextInt();
                //System.out.println("row: "+row);
                //System.out.println("col: "+col);

                if (col>=size_of_board-1)
                {
                	break;
                }
            }
        }
       //return aBoard;
	}

	public static void PrintBoard(int[][] aBoard)
	{
		//int size_of_board = 9;
		//this.size=sizeof;
		//sizeof = size_of_board;
		//static int[][] board = new int[size_of_board][size_of_board];
		//aBoard = new int[sizeof][] board;
		//this.board=aBoard;

		System.out.print("-----------------------------------\n");
		for (row=0; row<size_of_board; row++)
		{
			if (row==3)
			{
				System.out.print("-----------------------------------\n");
			}

			else if (row==6)
			{
				System.out.print("-----------------------------------\n");
			}

			for (col=0;col<size_of_board;col++)
			{
				if (col==0)
				{
					System.out.print("|");
				}

				System.out.print("["+aBoard[row][col]+"]");
				if (col==size_of_board-1)
				{
					System.out.print("|");
				}

				else if (col==2)
				{
					System.out.print(" | ");
				}

				else if (col==5)
				{
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
		System.out.print("-----------------------------------\n");
		System.out.println();

		//WOOO THIS WORKS 
		//IT ACTUALLY PRINTS THE BOARD CORRECTLY yaaay
	}



	public static void main(String[] args)
	{
		//int[][] board = new int[size_of_board][size_of_board];
		Sudoku sudoku = new Sudoku();

		System.out.println("Welcome to the Sudoku Solver!\n"); 

        //int[][]boardCreated=MakeBoard(board);

        MakeBoard(board);
        //creates the board using the user's input 
        PrintBoard(board);
        //prints the board based off of what values were saved to the board in 
        //the make board method

        //maybe go through each row & col, add up number of zeros and then
        //do a while loop that keeps trying to fill the board until it is solved/no more 0's
        //might not need this if just iterating through board though hmm... might delete that later then


        //code below this comment is basically just a mini little check to see
        //if the methods are working and if my logic makes sense

        //boolean resultBool = isSpaceSafe(0,3,2);
        //boolean resultBool2 = ThreebyThreeOK(0,3,2);
        //boolean resultBool3 = CanMoveBeMade(0,3,2);
        //I think the issue is that the three methods above aren't being called
        //-------------------------------------------------------------------------
        /*
        boolean resultBool4;
        int zeroRemaining = 0;
        */

        /*if (resultBool3 == true)
        {
        	if (resultBool2 == true)
        	{
        		if (resultBool3 == true)
        		{
        			*/
        			//if all bools return true set num then call was sudoku solved
        			//board[0][3]=2;
        			/*
        			resultBool4 = WasSudokuSolved();
        			if (resultBool4 == true)
        			{
        				for (row=0;row<size_of_board;row++)
        				{
        					for (col=0;col<size_of_board;col++)
        					{
        						if (board[row][col]==0)
        							{
        								zeroRemaining++;
        								if (zeroRemaining <1)
        								{
        									System.out.println("Sudoku board was solved!");
        									PrintBoard(board);
        								}
        							}
        					}
        				}
        				/*System.out.println("Sudoku board was solved!");
        				PrintBoard(board);*/
        			/*}

        			else
        			{
        				//I think printing a message if not solved was part of the requirements so add it just in case
        				System.out.println("Sudoku board could not be solved :( ");
        			}
        			*/

        		/*}
        	}
        }
        */
        /*else if (resultBool==false)
        {
        	if (board[0][3]==0)
        		//only set number if all three requirements are checked
        		{
        			//sets previously empty space back to 0
        			//might not need this however, this is more of a just in case the
        			//user tries to fill a spot that isn't empty
        			board[0][3]=0;
        		}
        }
        */
        WasSudokuSolved();

        for (row=0;row<size_of_board;row++)
        {
        	for (col=0;col<size_of_board;col++)
        	{
        		if (board[row][col]==0)
        		{
        			System.out.print("\n Board was not solved :( \n");
        			//prints this waay too many times since it prints everytime it encounters a 0
        		}
        	}
        }
        System.out.println();

        PrintBoard(board);

        //CHECK TO SEE IF CANMOVEBEMADE RETURNS TRUE BY CHECKING IF RESULTBOOL3
        //RETURNS TRUE. THEN BASED ON THAT CALL WASSUDOKUSOLVED

        //IF WASSUDOKUSOLVED RETURNS TRUE THEN PRINT BOARD AND SAY IT WAS SOLVED

        //ELSE JUST PRINT BOARD COULD NOT BE SOLVED





        //sudoku.PrintBoard(size_of_board,board) does not work for some reason
		
		//CREATE AN OBJECT AND THEN CALL THE FUNCTIONS
		//Sudoku sudokuGame = new Sudoku(); 
		//sudoku.MakeBoard();
		//

		//--------------------------------------------------------------
		//ABOVE CODE WORKS TO PRINT A SUDOKU LIKE BOARD
		//--------------------------------------------------------------


		//Now for the algorthm...

		//Start by using this psuedocode from the slides
		//for each column
		//	if safe
		//		place queen in row, column
		//			if nqueens(row+1)
		//				return true    
		//				# undo this if it’s false
		//return false    
		//# checked all columns and failed

		/*
			private boolean nqueens (int row) 
				{if (row == BOARD_SIZE)    
				// Base case: filled all rows = success! 
					return true;
				
				for (int col = 0; col < BOARD_SIZE; col++) 
				{
					if (safe(row, col)) 
					{
						board[row][col] = 1; 
						if (nqueens(row + 1)) 
						{ 
							// Recursively call function for next
							return true;
							}
							board[row][col] = 0;    
							// Backtrack from later row failure
							}
						}
						returnfalse;

		--------------------------------------------------------------

		public boolean nqueens () 
		{
			board = new int [BOARD_SIZE][BOARD_SIZE];  
			// Re-init board to 0
			return nqueens(0);
		}

		*/
	}
}