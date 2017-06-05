import java.util.Scanner;


public class ACSL3_abc15_C17JM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//figure out how to get big board into small board, assign spots (4x4) 3d array
		//set edges put numbers in board
		//if there are xs, move them over
		//solve the puzzle


		//create 4 x 4 grid:
		

		//take in input:
		System.out.println("What is your input?");
		while (scan.hasNext()) {
			String input = scan.nextLine();
			String[][] fourbyfour = new String[4][4];
			int row1;
			int row2;
			int row3;
			int row4;
			int col1;
			int col2;
			int col3;
			int col4;
			String[] commaarray = input.split(",[ ]*");
			int x1pos = Integer.parseInt(commaarray[0]);
			int x2pos = Integer.parseInt(commaarray[1]);
			int x3pos = Integer.parseInt(commaarray[2]);
			int x4pos = Integer.parseInt(commaarray[3]);
			int numberabc = Integer.parseInt(commaarray[4]);


			boolean gotnull = true;
			boolean gotanswer = true;



			//figure out which row the x is in
			if (x1pos >= 7 && x1pos <= 12) {
				row1 = 0;
			}
			else if (x1pos >= 13 && x1pos <= 18) {
				row1 = 1;
			}
			else if (x1pos >= 19 && x1pos <= 24) {
				row1 = 2;
			}
			else {
				row1 = 3;
			}

			if (x2pos >= 7 && x2pos <= 12) {
				row2 = 0;
			}
			else if (x2pos >= 13 && x2pos <= 18) {
				row2 = 1;
			}
			else if (x2pos >= 19 && x2pos <= 24) {
				row2 = 2;
			}
			else {
				row2 = 3;
			}

			if (x3pos >= 7 && x3pos <= 12) {
				row3 = 0;
			}
			else if (x3pos >= 13 && x3pos <= 18) {
				row3 = 1;
			}
			else if (x3pos >= 19 && x3pos <= 24) {
				row3 = 2;
			}
			else {
				row3 = 3;
			}

			if (x4pos >= 7 && x4pos <= 12) {
				row4 = 0;
			}
			else if (x4pos >= 13 && x4pos <= 18) {
				row4 = 1;
			}
			else if (x4pos >= 19 && x4pos <= 24) {
				row4 = 2;
			}
			else {
				row4 = 3;
			}


			//find cols
			if (x1pos == 2 || x1pos == 8 || x1pos == 14 || x1pos == 20 || x1pos == 26 || x1pos == 32) {
				col1 = 0;
			}
			else if (x1pos == 3 || x1pos == 9 || x1pos == 15 || x1pos == 21 || x1pos == 27 || x1pos == 33) {
				col1 = 1;
			}
			else if (x1pos == 4 || x1pos == 10 || x1pos == 16 || x1pos == 22 || x1pos == 28 || x1pos == 34) {
				col1 = 2;
			}
			else if (x1pos == 5 || x1pos == 11 || x1pos == 17 || x1pos == 23 || x1pos == 29 || x1pos == 35) {
				col1 = 3;
			}
			else {
				col1 = 100;
			}


			if (x2pos == 2 || x2pos == 8 || x2pos == 14 || x2pos == 20 || x2pos == 26 || x2pos == 32) {
				col2 = 0;
			}
			else if (x2pos == 3 || x2pos == 9 || x2pos == 15 || x2pos == 21 || x2pos == 27 || x2pos == 33) {
				col2 = 1;
			}
			else if (x2pos == 4 || x2pos == 10 || x2pos == 16 || x2pos == 22 || x2pos == 28 || x2pos == 34) {
				col2 = 2;
			}
			else if (x2pos == 5 || x2pos == 11 || x2pos == 17 || x2pos == 23 || x2pos == 29 || x2pos == 35) {
				col2 = 3;
			}
			else {
				col2 = 100;
			}


			if (x3pos == 2 || x3pos == 8 || x3pos == 14 || x3pos == 20 || x3pos == 26 || x3pos == 32) {
				col3 = 0;
			}
			else if (x3pos == 3 || x3pos == 9 || x3pos == 15 || x3pos == 21 || x3pos == 27 || x3pos == 33) {
				col3 = 1;
			}
			else if (x3pos == 4 || x3pos == 10 || x3pos == 16 || x3pos == 22 || x3pos == 28 || x3pos == 34) {
				col3 = 2;
			}
			else if (x3pos == 5 || x3pos == 11 || x3pos == 17 || x3pos == 23 || x3pos == 29 || x3pos == 35){
				col3 = 3;
			}
			else {
				col3 = 100;
			}

			if (x4pos == 2 || x4pos == 8 || x4pos == 14 || x4pos == 20 || x4pos == 26 || x4pos == 32) {
				col4 = 0;
			}
			else if (x4pos == 3 || x4pos == 9 || x4pos == 15 || x4pos == 21 || x4pos == 27 || x4pos == 33) {
				col4 = 1;
			}
			else if (x4pos == 4 || x4pos == 10 || x4pos == 16 || x4pos == 22 || x4pos == 28 || x4pos == 34) {
				col4 = 2;
			}
			else if (x4pos == 5 || x4pos == 11 || x4pos == 17 || x4pos == 23 || x4pos == 29 || x4pos == 35) {
				col4 = 3;
			}
			else {
				col4 = 100;
			}



			//set xs:
			fourbyfour[row1][col1] = "x";
			fourbyfour[row2][col2] = "x";
			fourbyfour[row3][col3] = "x";
			fourbyfour[row4][col4] = "x";


			//if zero, one, or two letters:
			if(numberabc == 0 || numberabc == 1 || numberabc == 2) {
				System.out.println("No solution.");
				gotnull = false;
				gotanswer = false;
			}


			//put in first letter
			if (numberabc >= 3) {
				int let1pos = Integer.parseInt(commaarray[6]);
				String let1let = commaarray[5];
				int let2pos = Integer.parseInt(commaarray[8]);
				String let2let = commaarray[7];
				int let3pos = Integer.parseInt(commaarray[10]);
				String let3let = commaarray[9];
				if(let1pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let1let;
					}
					else {
						fourbyfour[1][0] = let1let;
					}
				}
				else if (let1pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let1let;
					}
					else {
						fourbyfour[1][1] = let1let;
					}
				}
				else if (let1pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let1let;
					}
					else {
						fourbyfour[1][2] = let1let;
					}
				}
				else if (let1pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let1let;
					}
					else {
						fourbyfour[1][3] = let1let;
					}
				}
				else if (let1pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let1let;
					}
					else {
						fourbyfour[0][2] = let1let;
					}
				} 
				else if (let1pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let1let;
					}
					else {
						fourbyfour[1][2] = let1let;
					}
				}
				else if (let1pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let1let;
					}
					else {
						fourbyfour[2][2] = let1let;
					}
				}
				else if (let1pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let1let;
					}
					else {
						fourbyfour[3][2] = let1let;
					}
				}
				else if (let1pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let1let;
					}
					else {
						fourbyfour[2][3] = let1let;
					}
				}
				else if (let1pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let1let;
					}
					else {
						fourbyfour[2][2] = let1let;
					}
				}
				else if (let1pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let1let;
					}
					else {
						fourbyfour[2][1] = let1let;
					}
				}
				else if (let1pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let1let;
					}
					else {
						fourbyfour[2][0] = let1let;
					}
				}
				else if (let1pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let1let;
					}
					else {
						fourbyfour[3][1] = let1let;
					}
				}
				else if (let1pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let1let;
					}
					else {
						fourbyfour[2][1] = let1let;
					}
				}
				else if (let1pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let1let;
					}
					else {
						fourbyfour[1][1] = let1let;
					}
				}
				else if (let1pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let1let;
					}
					else {
						fourbyfour[0][1] = let1let;
					}
				}

				//put in second letter
				if(let2pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let2let;
					}
					else {
						fourbyfour[1][0] = let2let;
					}
				}
				else if (let2pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let2let;
					}
					else {
						fourbyfour[1][1] = let2let;
					}
				}
				else if (let2pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let2let;
					}
					else {
						fourbyfour[1][2] = let2let;
					}
				}
				else if (let2pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let2let;
					}
					else {
						fourbyfour[1][3] = let2let;
					}
				}
				else if (let2pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let2let;
					}
					else {
						fourbyfour[0][2] = let2let;
					}
				} 
				else if (let2pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let2let;
					}

					else {

						fourbyfour[1][2] = let2let;
					}
				}
				else if (let2pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let2let;
					}
					else {
						fourbyfour[2][2] = let2let;
					}
				}
				else if (let2pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let2let;
					}
					else {
						fourbyfour[3][2] = let2let;
					}
				}
				else if (let2pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let2let;
					}
					else {
						fourbyfour[2][3] = let2let;
					}
				}
				else if (let2pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let2let;
					}
					else {
						fourbyfour[2][2] = let2let;
					}
				}
				else if (let2pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let2let;
					}
					else {
						fourbyfour[2][1] = let2let;
					}
				}
				else if (let2pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let2let;
					}
					else {
						fourbyfour[2][0] = let2let;
					}
				}
				else if (let2pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let2let;
					}
					else {
						fourbyfour[3][1] = let2let;
					}
				}
				else if (let2pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let2let;
					}
					else {
						fourbyfour[2][1] = let2let;
					}
				}
				else if (let2pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let2let;
					}
					else {
						fourbyfour[1][1] = let2let;
					}
				}
				else if (let2pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let2let;
					}
					else {
						fourbyfour[0][1] = let2let;
					}
				}

				//put in third letter
				if(let3pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let3let;
					}
					else {
						fourbyfour[1][0] = let3let;
					}
				}
				else if (let3pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let3let;
					}
					else {
						fourbyfour[1][1] = let3let;
					}
				}
				else if (let3pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let3let;
					}
					else {
						fourbyfour[1][2] = let3let;
					}
				}
				else if (let3pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let3let;
					}
					else {
						fourbyfour[1][3] = let3let;
					}
				}
				else if (let3pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let3let;
					}
					else {
						fourbyfour[0][2] = let3let;
					}
				} 
				else if (let3pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let3let;
					}
					else {
						fourbyfour[1][2] = let3let;
					}
				}
				else if (let3pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let3let;
					}
					else {
						fourbyfour[2][2] = let3let;
					}
				}
				else if (let3pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let3let;
					}
					else {
						fourbyfour[3][2] = let3let;
					}
				}
				else if (let3pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let3let;
					}
					else {
						fourbyfour[2][3] = let3let;
					}
				}
				else if (let3pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let3let;
					}
					else {
						fourbyfour[2][2] = let3let;
					}
				}
				else if (let3pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let3let;
					}
					else {
						fourbyfour[2][1] = let3let;
					}
				}
				else if (let3pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let3let;
					}
					else {
						fourbyfour[2][0] = let3let;
					}
				}
				else if (let3pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let3let;
					}
					else {
						fourbyfour[3][1] = let3let;
					}
				}
				else if (let3pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let3let;
					}
					else {
						fourbyfour[2][1] = let3let;
					}
				}
				else if (let3pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let3let;
					}
					else {
						fourbyfour[1][1] = let3let;
					}
				}
				else if (let3pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let3let;
					}
					else {
						fourbyfour[0][1] = let3let;
					}
				}
			}

			//put in fourth letter
			if(numberabc >=4) {
				int let4pos = Integer.parseInt(commaarray[12]);
				String let4let = commaarray[11];
				if(let4pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let4let;
					}
					else {
						fourbyfour[1][0] = let4let;
					}
				}
				else if (let4pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let4let;
					}
					else {
						fourbyfour[1][1] = let4let;
					}
				}
				else if (let4pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let4let;
					}
					else {
						fourbyfour[1][2] = let4let;
					}
				}
				else if (let4pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let4let;
					}
					else {
						fourbyfour[1][3] = let4let;
					}
				}
				else if (let4pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let4let;
					}
					else {
						fourbyfour[0][2] = let4let;
					}
				} 
				else if (let4pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let4let;
					}
					else {
						fourbyfour[1][2] = let4let;
					}
				}
				else if (let4pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let4let;
					}
					else {
						fourbyfour[2][2] = let4let;
					}
				}
				else if (let4pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let4let;
					}
					else {
						fourbyfour[3][2] = let4let;
					}
				}
				else if (let4pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let4let;
					}
					else {
						fourbyfour[2][3] = let4let;
					}
				}
				else if (let4pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let4let;
					}
					else {
						fourbyfour[2][2] = let4let;
					}
				}
				else if (let4pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let4let;
					}
					else {
						fourbyfour[2][1] = let4let;
					}
				}
				else if (let4pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let4let;
					}
					else {
						fourbyfour[2][0] = let4let;
					}
				}
				else if (let4pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let4let;
					}
					else {
						fourbyfour[3][1] = let4let;
					}
				}
				else if (let4pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let4let;
					}
					else {
						fourbyfour[2][1] = let4let;
					}
				}
				else if (let4pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let4let;
					}
					else {
						fourbyfour[1][1] = let4let;
					}
				}
				else if (let4pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let4let;
					}
					else {
						fourbyfour[0][1] = let4let;
					}
				}
			}

			//fifth letter
			if(numberabc >= 5) {
				int let5pos = Integer.parseInt(commaarray[14]);
				String let5let = commaarray[13];
				if(let5pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let5let;
					}
					else {
						fourbyfour[1][0] = let5let;
					}
				}
				else if (let5pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let5let;
					}
					else {
						fourbyfour[1][1] = let5let;
					}
				}
				else if (let5pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let5let;
					}
					else {
						fourbyfour[1][2] = let5let;
					}
				}
				else if (let5pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let5let;
					}
					else {
						fourbyfour[1][3] = let5let;
					}
				}
				else if (let5pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let5let;
					}
					else {
						fourbyfour[0][2] = let5let;
					}
				} 
				else if (let5pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let5let;
					}
					else {
						fourbyfour[1][2] = let5let;
					}
				}
				else if (let5pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let5let;
					}
					else {
						fourbyfour[2][2] = let5let;
					}
				}
				else if (let5pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let5let;
					}
					else {
						fourbyfour[3][2] = let5let;
					}
				}
				else if (let5pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let5let;
					}
					else {
						fourbyfour[2][3] = let5let;
					}
				}
				else if (let5pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let5let;
					}
					else {
						fourbyfour[2][2] = let5let;
					}
				}
				else if (let5pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let5let;
					}
					else {
						fourbyfour[2][1] = let5let;
					}
				}
				else if (let5pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let5let;
					}
					else {
						fourbyfour[2][0] = let5let;
					}
				}
				else if (let5pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let5let;
					}
					else {
						fourbyfour[3][1] = let5let;
					}
				}
				else if (let5pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let5let;
					}
					else {
						fourbyfour[2][1] = let5let;
					}
				}
				else if (let5pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let5let;
					}
					else {
						fourbyfour[1][1] = let5let;
					}
				}
				else if (let5pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let5let;
					}
					else {
						fourbyfour[0][1] = let5let;
					}
				}
			}

			//sixth letter
			if(numberabc >= 6) {
				int let6pos = Integer.parseInt(commaarray[16]);
				String let6let = commaarray[15];
				if(let6pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let6let;
					}
					else {
						fourbyfour[1][0] = let6let;
					}
				}
				else if (let6pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let6let;
					}
					else {
						fourbyfour[1][1] = let6let;
					}
				}
				else if (let6pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let6let;
					}
					else {
						fourbyfour[1][2] = let6let;
					}
				}
				else if (let6pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let6let;
					}
					else {
						fourbyfour[1][3] = let6let;
					}
				}
				else if (let6pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let6let;
					}
					else {
						fourbyfour[0][2] = let6let;
					}
				} 
				else if (let6pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let6let;
					}
					else {
						fourbyfour[1][2] = let6let;
					}
				}
				else if (let6pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let6let;
					}
					else {
						fourbyfour[2][2] = let6let;
					}
				}
				else if (let6pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let6let;
					}
					else {
						fourbyfour[3][2] = let6let;
					}
				}
				else if (let6pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let6let;
					}
					else {
						fourbyfour[2][3] = let6let;
					}
				}
				else if (let6pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let6let;
					}
					else {
						fourbyfour[2][2] = let6let;
					}
				}
				else if (let6pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let6let;
					}
					else {
						fourbyfour[2][1] = let6let;
					}
				}
				else if (let6pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let6let;
					}
					else {
						fourbyfour[2][0] = let6let;
					}
				}
				else if (let6pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let6let;
					}
					else {
						fourbyfour[3][1] = let6let;
					}
				}
				else if (let6pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let6let;
					}
					else {
						fourbyfour[2][1] = let6let;
					}
				}
				else if (let6pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let6let;
					}
					else {
						fourbyfour[1][1] = let6let;
					}
				}
				else if (let6pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let6let;
					}
					else {
						fourbyfour[0][1] = let6let;
					}
				}
			}

			//seventh letter
			if(numberabc >= 7) {
				int let7pos = Integer.parseInt(commaarray[18]);
				String let7let = commaarray[17];
				if(let7pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let7let;
					}
					else {
						fourbyfour[1][0] = let7let;
					}
				}
				else if (let7pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let7let;
					}
					else {
						fourbyfour[1][1] = let7let;
					}
				}
				else if (let7pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let7let;
					}
					else {
						fourbyfour[1][2] = let7let;
					}
				}
				else if (let7pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let7let;
					}
					else {
						fourbyfour[1][3] = let7let;
					}
				}
				else if (let7pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let7let;
					}
					else {
						fourbyfour[0][2] = let7let;
					}
				} 
				else if (let7pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let7let;
					}
					else {
						fourbyfour[1][2] = let7let;
					}
				}
				else if (let7pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let7let;
					}
					else {
						fourbyfour[2][2] = let7let;
					}
				}
				else if (let7pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let7let;
					}
					else {
						fourbyfour[3][2] = let7let;
					}
				}
				else if (let7pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let7let;
					}
					else {
						fourbyfour[2][3] = let7let;
					}
				}
				else if (let7pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let7let;
					}
					else {
						fourbyfour[2][2] = let7let;
					}
				}
				else if (let7pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let7let;
					}
					else {
						fourbyfour[2][1] = let7let;
					}
				}
				else if (let7pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let7let;
					}
					else {
						fourbyfour[2][0] = let7let;
					}
				}
				else if (let7pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let7let;
					}
					else {
						fourbyfour[3][1] = let7let;
					}
				}
				else if (let7pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let7let;
					}
					else {
						fourbyfour[2][1] = let7let;
					}
				}
				else if (let7pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let7let;
					}
					else {
						fourbyfour[1][1] = let7let;
					}
				}
				else if (let7pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let7let;
					}
					else {
						fourbyfour[0][1] = let7let;
					}
				}
			}

			//eighth letter:
			if(numberabc >= 8) {
				int let5pos = Integer.parseInt(commaarray[20]);
				String let5let = commaarray[19];
				if(let5pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let5let;
					}
					else {
						fourbyfour[1][0] = let5let;
					}
				}
				else if (let5pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let5let;
					}
					else {
						fourbyfour[1][1] = let5let;
					}
				}
				else if (let5pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let5let;
					}
					else {
						fourbyfour[1][2] = let5let;
					}
				}
				else if (let5pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let5let;
					}
					else {
						fourbyfour[1][3] = let5let;
					}
				}
				else if (let5pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let5let;
					}
					else {
						fourbyfour[0][2] = let5let;
					}
				} 
				else if (let5pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let5let;
					}
					else {
						fourbyfour[1][2] = let5let;
					}
				}
				else if (let5pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let5let;
					}
					else {
						fourbyfour[2][2] = let5let;
					}
				}
				else if (let5pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let5let;
					}
					else {
						fourbyfour[3][2] = let5let;
					}
				}
				else if (let5pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let5let;
					}
					else {
						fourbyfour[2][3] = let5let;
					}
				}
				else if (let5pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let5let;
					}
					else {
						fourbyfour[2][2] = let5let;
					}
				}
				else if (let5pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let5let;
					}
					else {
						fourbyfour[2][1] = let5let;
					}
				}
				else if (let5pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let5let;
					}
					else {
						fourbyfour[2][0] = let5let;
					}
				}
				else if (let5pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let5let;
					}
					else {
						fourbyfour[3][1] = let5let;
					}
				}
				else if (let5pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let5let;
					}
					else {
						fourbyfour[2][1] = let5let;
					}
				}
				else if (let5pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let5let;
					}
					else {
						fourbyfour[1][1] = let5let;
					}
				}
				else if (let5pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let5let;
					}
					else {
						fourbyfour[0][1] = let5let;
					}
				}
			}


			//ninth number
			if(numberabc >= 9) {
				int let9pos = Integer.parseInt(commaarray[22]);
				String let9let = commaarray[21];
				if(let9pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let9let;
					}
					else {
						fourbyfour[1][0] = let9let;
					}
				}
				else if (let9pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let9let;
					}
					else {
						fourbyfour[1][1] = let9let;
					}
				}
				else if (let9pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let9let;
					}
					else {
						fourbyfour[1][2] = let9let;
					}
				}
				else if (let9pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let9let;
					}
					else {
						fourbyfour[1][3] = let9let;
					}
				}
				else if (let9pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let9let;
					}
					else {
						fourbyfour[0][2] = let9let;
					}
				} 
				else if (let9pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let9let;
					}
					else {
						fourbyfour[1][2] = let9let;
					}
				}
				else if (let9pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let9let;
					}
					else {
						fourbyfour[2][2] = let9let;
					}
				}
				else if (let9pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let9let;
					}
					else {
						fourbyfour[3][2] = let9let;
					}
				}
				else if (let9pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let9let;
					}
					else {
						fourbyfour[2][3] = let9let;
					}
				}
				else if (let9pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let9let;
					}
					else {
						fourbyfour[2][2] = let9let;
					}
				}
				else if (let9pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let9let;
					}
					else {
						fourbyfour[2][1] = let9let;
					}
				}
				else if (let9pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let9let;
					}
					else {
						fourbyfour[2][0] = let9let;
					}
				}
				else if (let9pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let9let;
					}
					else {
						fourbyfour[3][1] = let9let;
					}
				}
				else if (let9pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let9let;
					}
					else {
						fourbyfour[2][1] = let9let;
					}
				}
				else if (let9pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let9let;
					}
					else {
						fourbyfour[1][1] = let9let;
					}
				}
				else if (let9pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let9let;
					}
					else {
						fourbyfour[0][1] = let9let;
					}
				}
			}

			//tenth number:
			if(numberabc >= 10) {
				int let10pos = Integer.parseInt(commaarray[24]);
				String let10let = commaarray[23];
				if(let10pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let10let;
					}
					else {
						fourbyfour[1][0] = let10let;
					}
				}
				else if (let10pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let10let;
					}
					else {
						fourbyfour[1][1] = let10let;
					}
				}
				else if (let10pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let10let;
					}
					else {
						fourbyfour[1][2] = let10let;
					}
				}
				else if (let10pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let10let;
					}
					else {
						fourbyfour[1][3] = let10let;
					}
				}
				else if (let10pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let10let;
					}
					else {
						fourbyfour[0][2] = let10let;
					}
				} 
				else if (let10pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let10let;
					}
					else {
						fourbyfour[1][2] = let10let;
					}
				}
				else if (let10pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let10let;
					}
					else {
						fourbyfour[2][2] = let10let;
					}
				}
				else if (let10pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let10let;
					}
					else {
						fourbyfour[3][2] = let10let;
					}
				}
				else if (let10pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let10let;
					}
					else {
						fourbyfour[2][3] = let10let;
					}
				}
				else if (let10pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let10let;
					}
					else {
						fourbyfour[2][2] = let10let;
					}
				}
				else if (let10pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let10let;
					}
					else {
						fourbyfour[2][1] = let10let;
					}
				}
				else if (let10pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let10let;
					}
					else {
						fourbyfour[2][0] = let10let;
					}
				}
				else if (let10pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let10let;
					}
					else {
						fourbyfour[3][1] = let10let;
					}
				}
				else if (let10pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let10let;
					}
					else {
						fourbyfour[2][1] = let10let;
					}
				}
				else if (let10pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let10let;
					}
					else {
						fourbyfour[1][1] = let10let;
					}
				}
				else if (let10pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let10let;
					}
					else {
						fourbyfour[0][1] = let10let;
					}
				}
			}

			//eleventh number:
			if(numberabc >= 11) {
				int let11pos = Integer.parseInt(commaarray[26]);
				String let11let = commaarray[25];
				if(let11pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let11let;
					}
					else {
						fourbyfour[1][0] = let11let;
					}
				}
				else if (let11pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let11let;
					}
					else {
						fourbyfour[1][1] = let11let;
					}
				}
				else if (let11pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let11let;
					}
					else {
						fourbyfour[1][2] = let11let;
					}
				}
				else if (let11pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let11let;
					}
					else {
						fourbyfour[1][3] = let11let;
					}
				}
				else if (let11pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let11let;
					}
					else {
						fourbyfour[0][2] = let11let;
					}
				} 
				else if (let11pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let11let;
					}
					else {
						fourbyfour[1][2] = let11let;
					}
				}
				else if (let11pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let11let;
					}
					else {
						fourbyfour[2][2] = let11let;
					}
				}
				else if (let11pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let11let;
					}
					else {
						fourbyfour[3][2] = let11let;
					}
				}
				else if (let11pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let11let;
					}
					else {
						fourbyfour[2][3] = let11let;
					}
				}
				else if (let11pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let11let;
					}
					else {
						fourbyfour[2][2] = let11let;
					}
				}
				else if (let11pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let11let;
					}
					else {
						fourbyfour[2][1] = let11let;
					}
				}
				else if (let11pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let11let;
					}
					else {
						fourbyfour[2][0] = let11let;
					}
				}
				else if (let11pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let11let;
					}
					else {
						fourbyfour[3][1] = let11let;
					}
				}
				else if (let11pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let11let;
					}
					else {
						fourbyfour[2][1] = let11let;
					}
				}
				else if (let11pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let11let;
					}
					else {
						fourbyfour[1][1] = let11let;
					}
				}
				else if (let11pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let11let;
					}
					else {
						fourbyfour[0][1] = let11let;
					}
				}
			}

			//twelfth number:
			if(numberabc >= 12) {
				int let12pos = Integer.parseInt(commaarray[28]);
				String let12let = commaarray[27];
				if(let12pos == 2) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let12let;
					}
					else {
						fourbyfour[1][0] = let12let;
					}
				}
				else if (let12pos == 3) {
					if(x1pos != 9 && x2pos != 9 && x3pos != 9 && x4pos != 9) {
						fourbyfour[0][1] = let12let;
					}
					else {
						fourbyfour[1][1] = let12let;
					}
				}
				else if (let12pos == 4) {
					if(x1pos != 10 && x2pos != 10 && x3pos != 10 && x4pos != 10) {
						fourbyfour[0][2] = let12let;
					}
					else {
						fourbyfour[1][2] = let12let;
					}
				}
				else if (let12pos == 5) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let12let;
					}
					else {
						fourbyfour[1][3] = let12let;
					}
				}
				else if (let12pos == 12) {
					if(x1pos != 11 && x2pos != 11 && x3pos != 11 && x4pos != 11) {
						fourbyfour[0][3] = let12let;
					}
					else {
						fourbyfour[0][2] = let12let;
					}
				} 
				else if (let12pos == 18) {
					if(x1pos != 17 && x2pos != 17 && x3pos != 17 && x4pos != 17) {
						fourbyfour[1][3] = let12let;
					}
					else {
						fourbyfour[1][2] = let12let;
					}
				}
				else if (let12pos == 24) {
					if(x1pos != 23 && x2pos != 23 && x3pos != 23 && x4pos != 23) {
						fourbyfour[2][3] = let12let;
					}
					else {
						fourbyfour[2][2] = let12let;
					}
				}
				else if (let12pos == 30) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let12let;
					}
					else {
						fourbyfour[3][2] = let12let;
					}
				}
				else if (let12pos == 35) {
					if(x1pos != 29 && x2pos != 29 && x3pos != 29 && x4pos != 29) {
						fourbyfour[3][3] = let12let;
					}
					else {
						fourbyfour[2][3] = let12let;
					}
				}
				else if (let12pos == 34) {
					if(x1pos != 28 && x2pos != 28 && x3pos != 28 && x4pos != 28) {
						fourbyfour[3][2] = let12let;
					}
					else {
						fourbyfour[2][2] = let12let;
					}
				}
				else if (let12pos == 33) {
					if(x1pos != 27 && x2pos != 27 && x3pos != 27 && x4pos != 27) {
						fourbyfour[3][1] = let12let;
					}
					else {
						fourbyfour[2][1] = let12let;
					}
				}
				else if (let12pos == 32) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let12let;
					}
					else {
						fourbyfour[2][0] = let12let;
					}
				}
				else if (let12pos == 25) {
					if(x1pos != 26 && x2pos != 26 && x3pos != 26 && x4pos != 26) {
						fourbyfour[3][0] = let12let;
					}
					else {
						fourbyfour[3][1] = let12let;
					}
				}
				else if (let12pos == 19) {
					if(x1pos != 20 && x2pos != 20 && x3pos != 20 && x4pos != 20) {
						fourbyfour[2][0] = let12let;
					}
					else {
						fourbyfour[2][1] = let12let;
					}
				}
				else if (let12pos == 13) {
					if(x1pos != 14 && x2pos != 14 && x3pos != 14 && x4pos != 14) {
						fourbyfour[1][0] = let12let;
					}
					else {
						fourbyfour[1][1] = let12let;
					}
				}
				else if (let12pos == 7) {
					if(x1pos != 8 && x2pos != 8 && x3pos != 8 && x4pos != 8) {
						fourbyfour[0][0] = let12let;
					}
					else {
						fourbyfour[0][1] = let12let;
					}
				}
			}

			if (numberabc > 13) {
				System.out.println("No solution.");
				gotnull = false;
				gotanswer = false;
			}




			//put in the rest of letters:
			while(gotnull == true) {
				if (fourbyfour[0][0] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[0][i] != null){
							if (fourbyfour[0][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[0][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[0][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][0] != null){
							if(fourbyfour[i][0].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][0].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][0].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[0][0] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[0][0] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[0][0] = "A";
					}
				}
				if (fourbyfour[0][1] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[0][i] != null) {
							if (fourbyfour[0][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[0][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[0][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][1] != null) {
							if(fourbyfour[i][1].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][1].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][1].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[0][1] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[0][1] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[0][1] = "A";
					}
				}

				if (fourbyfour[0][2] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[0][i] != null) {
							if (fourbyfour[0][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[0][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[0][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][2] != null) {
							if(fourbyfour[i][2].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][2].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][2].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[0][2] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[0][2] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[0][2] = "A";
					}

				}
				if (fourbyfour[0][3] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[0][i] != null) {
							if (fourbyfour[0][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[0][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[0][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][3] != null){
							if(fourbyfour[i][3].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][3].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][3].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[0][3] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[0][3] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[0][3] = "A";
					}
				}
				if (fourbyfour[1][0] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[1][i] != null){
							if (fourbyfour[1][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[1][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[1][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][0] != null){
							if(fourbyfour[i][0].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][0].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][0].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[1][0] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[1][0] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[1][0] = "A";
					}
				}
				if (fourbyfour[1][1] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[1][i] != null){
							if (fourbyfour[1][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[1][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[1][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][1] != null){
							if(fourbyfour[i][1].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][1].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][1].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[1][1] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[1][1] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[1][1] = "A";
					}
				}
				if (fourbyfour[1][2] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[1][i] != null){
							if (fourbyfour[1][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[1][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[1][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][2] != null){
							if(fourbyfour[i][2].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][2].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][2].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[1][2] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[1][2] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[1][2] = "A";
					}
				}
				if (fourbyfour[1][3] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[1][i] != null){
							if (fourbyfour[1][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[1][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[1][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][3] != null){
							if(fourbyfour[i][3].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][3].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][3].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[1][3] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[1][3] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[1][3] = "A";
					}
				}
				if (fourbyfour[2][0] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[2][i] != null){
							if (fourbyfour[2][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[2][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[2][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][0] != null){
							if(fourbyfour[i][0].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][0].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][0].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[2][0] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[2][0] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[2][0] = "A";
					}
				}
				if (fourbyfour[2][1] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[2][i] != null){
							if (fourbyfour[2][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[2][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[2][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][1] != null){
							if(fourbyfour[i][1].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][1].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][1].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[2][1] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[2][1] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[2][1] = "A";
					}
				}
				if (fourbyfour[2][2] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[2][i] != null){
							if (fourbyfour[2][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[2][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[2][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][2] != null){
							if(fourbyfour[i][2].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][2].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][2].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[2][2] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[2][2] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[2][2] = "A";
					}

				}
				if (fourbyfour[2][3] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[2][i] != null){
							if (fourbyfour[2][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[2][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[2][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][3] != null){
							if(fourbyfour[i][3].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][3].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][3].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[2][3] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[2][3] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[2][3] = "A";
					}
				}
				if (fourbyfour[3][0] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[3][i] != null){
							if (fourbyfour[3][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[3][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[3][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][0] != null){
							if(fourbyfour[i][0].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][0].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][0].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[3][0] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[3][0] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[3][0] = "A";
					}

				}
				if (fourbyfour[3][1] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[3][i] != null){
							if (fourbyfour[3][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[3][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[3][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][1] != null){
							if(fourbyfour[i][1].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][1].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][1].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[3][1] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[3][1] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[3][1] = "A";
					}
				}
				if (fourbyfour[3][2] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[3][i] != null){
							if (fourbyfour[3][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[3][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[3][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][2] != null){
							if(fourbyfour[i][2].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][2].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][2].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[3][2] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[3][2] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[3][2] = "A";
					}
				}
				if (fourbyfour[3][3] == null) {
					boolean a = false;
					boolean b = false;
					boolean c = false;
					for (int i = 0; i < 4; i++) {
						if (fourbyfour[3][i] != null){
							if (fourbyfour[3][i].equals("A")) {
								a = true;
							}
							if (fourbyfour[3][i].equals("B")) {
								b = true;
							}
							if (fourbyfour[3][i].equals("C")) {
								c = true;
							}
						}
						if (fourbyfour[i][3] != null){
							if(fourbyfour[i][3].equals("A")) {
								a = true;
							}
							if (fourbyfour[i][3].equals("B")) {
								b = true;
							}
							if (fourbyfour[i][3].equals("C")) {
								c = true;
							}
						}
					}
					if (a == true && b == true) {
						fourbyfour[3][3] = "C";
					}
					if (a == true && c == true) {
						fourbyfour[3][3] = "B";
					}
					if (b == true && c == true) {
						fourbyfour[3][3] = "A";
					}
				}

				int nullcounter = 0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (fourbyfour[i][j] == null) {
							nullcounter ++;
						}
					}
				}
				if (nullcounter == 0) {
					gotnull = false;
				}

			}


			//print out:
			//system.out.print("\n");
			while (gotanswer == true){
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (fourbyfour[i][j] != "x") {
							System.out.print(fourbyfour[i][j]);
						}
					}
				}
				System.out.print("\n");
				gotanswer = false;
			}

		}

	}
}




