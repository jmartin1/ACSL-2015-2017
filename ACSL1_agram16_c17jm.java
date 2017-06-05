import java.util.ArrayList;
import java.util.Scanner;

public class ACSL1_agram16_c17jm {
	public static void main(String[] args) {

		//get input
		Scanner scan = new Scanner(System.in);

		while(true) {

			String input = scan.nextLine();
			String inputarray[] = input.split(", ");


			//get opponent card:
			String opponentcard = inputarray[0];
			char opponentrank = opponentcard.charAt(0);
			char opponentsuit = opponentcard.charAt(1);
			String dealercard1 = inputarray[1];
			char dealer1rank = dealercard1.charAt(0);
			char dealer1suit = dealercard1.charAt(1);
			String dealercard2 = inputarray[2];
			char dealer2rank = dealercard2.charAt(0);
			char dealer2suit = dealercard2.charAt(1);
			String dealercard3 = inputarray[3];
			char dealer3rank = dealercard3.charAt(0);
			char dealer3suit = dealercard3.charAt(1);
			String dealercard4 = inputarray[4];
			char dealer4rank = dealercard4.charAt(0);
			char dealer4suit = dealercard4.charAt(1);
			String dealercard5 = inputarray[5];
			char dealer5rank = dealercard4.charAt(0);
			char dealer5suit = dealercard4.charAt(1);


			int opponentint = 0;
			int dealer1int = 0;
			int dealer2int = 0;
			int dealer3int = 0;
			int dealer4int = 0;
			int dealer5int = 0;

			//Character.getNumericValue
			if(Character.getNumericValue(opponentrank)<10){
				opponentint = Character.getNumericValue(opponentrank);
			}
			if(Character.getNumericValue(dealer1rank)<10){
				dealer1int = Character.getNumericValue(dealer1rank);
			}
			if(Character.getNumericValue(dealer2rank)<10){
				dealer2int = Character.getNumericValue(dealer2rank);
			}
			if(Character.getNumericValue(dealer3rank)<10){
				dealer3int = Character.getNumericValue(dealer3rank);
			}
			if(Character.getNumericValue(dealer4rank)<10){
				dealer4int = Character.getNumericValue(dealer4rank);
			}
			if(Character.getNumericValue(dealer5rank)<10){
				dealer5int = Character.getNumericValue(dealer5rank);
			}

			//set ranks J,Q,K to numbers
			if (opponentrank == 'A') {
				opponentint = 1;
			}
			if (opponentrank == 'T') {
				opponentint = 10;
			}
			if (opponentrank == 'J') {
				opponentint = 11;
			}
			if (opponentrank == 'Q') {
				opponentint = 12;
			}
			if (opponentrank == 'K') {
				opponentint = 13;
			}
			if (dealer1rank == 'A') {
				dealer1int = 1;
			}
			if (dealer1rank == 'T') {
				dealer1int = 10;
			}
			if (dealer1rank == 'J') {
				dealer1int = 11;
			}
			if (dealer1rank == 'Q') {
				dealer1int = 12;
			}
			if (dealer1rank == 'K') {
				dealer1int = 13;
			}
			if (dealer2rank == 'A') {
				dealer2int = 1;
			}
			if (dealer2rank == 'T') {
				dealer2int = 10;
			}
			if (dealer2rank == 'J') {
				dealer2int = 11;
			}
			if (dealer2rank == 'Q') {
				dealer2int = 12;
			}
			if (dealer2rank == 'K') {
				dealer2int = 13;
			}
			if (dealer3rank == 'A') {
				dealer3int = 1;
			}
			if (dealer3rank == 'T') {
				dealer3int = 10;
			}
			if (dealer3rank == 'J') {
				dealer3int = 11;
			}
			if (dealer3rank == 'Q') {
				dealer3int = 12;
			}
			if (dealer3rank == 'K') {
				dealer3int = 13;
			}
			if (dealer4rank == 'A') {
				dealer4int = 1;
			}
			if (dealer4rank == 'T') {
				dealer4int = 10;
			}
			if (dealer4rank == 'J') {
				dealer4int = 11;
			}
			if (dealer4rank == 'Q') {
				dealer4int = 12;
			}
			if (dealer4rank == 'K') {
				dealer4int = 13;
			}
			if (dealer5rank == 'A') {
				dealer5int = 1;
			}
			if (dealer5rank == 'T') {
				dealer5int = 10;
			}
			if (dealer5rank == 'J') {
				dealer5int = 11;
			}
			if (dealer5rank == 'Q') {
				dealer5int = 12;
			}
			if (dealer5rank == 'K') {
				dealer5int = 13;
			}

			//how many cards have the same suit?
			int samesuitcount = 0;
			if (opponentsuit == dealer1suit) {
				samesuitcount++;
			}
			if (opponentsuit == dealer2suit) {
				samesuitcount++;
			}
			if (opponentsuit == dealer3suit) {
				samesuitcount++;
			}
			if (opponentsuit == dealer4suit) {
				samesuitcount++;
			}
			if (opponentsuit == dealer5suit) {
				samesuitcount++;
			}

			//first condition: play card of the same suit
			if (opponentsuit == dealer1suit || opponentsuit == dealer2suit || opponentsuit == dealer3suit || opponentsuit == dealer4suit || opponentsuit == dealer5suit) {
				if (samesuitcount == 0) {
					if (opponentsuit == dealer1suit) {
						System.out.println(dealercard1);
					}
					if (opponentsuit == dealer2suit) {
						System.out.println(dealercard2);
					}
					if (opponentsuit == dealer3suit) {
						System.out.println(dealercard3);
					}
					if (opponentsuit == dealer4suit) {
						System.out.println(dealercard4);
					} 
					if (opponentsuit == dealer5suit) {
						System.out.println(dealercard5);
					}
				}
				if (samesuitcount > 0) {
					//second condition: lowest card in the suit that is higher rank than the opponent card
					ArrayList<Integer> secondconditionarray = new ArrayList<Integer>();
					if ((opponentsuit == dealer1suit) && (opponentint < dealer1int)) {
						secondconditionarray.add(dealer1int);
					}
					if ((opponentsuit == dealer2suit) && (opponentint < dealer2int)) {
						secondconditionarray.add(dealer2int);
					}
					if ((opponentsuit == dealer3suit) && (opponentint < dealer3int)) {
						secondconditionarray.add(dealer3int);
					}
					if ((opponentsuit == dealer4suit) && (opponentint < dealer4int)) {
						secondconditionarray.add(dealer4int);
					}
					if ((opponentsuit == dealer5suit) && (opponentint < dealer5int)) {
						secondconditionarray.add(dealer5int);
					}
					int minimumsecondcondition = 14;
					if (secondconditionarray.size()>0) {
						for (int i = 0; i < secondconditionarray.size(); i++) {
							if (secondconditionarray.get(i) < minimumsecondcondition) {
								minimumsecondcondition = secondconditionarray.get(i);
							}
						}
						if (minimumsecondcondition < 10) {
							System.out.println(minimumsecondcondition + "" + opponentsuit); 
						}
						if (minimumsecondcondition == 1) {
							System.out.println("A" + "" + opponentsuit);
						}
						if (minimumsecondcondition == 10) {
							System.out.println("T" + "" + opponentsuit);
						}
						if (minimumsecondcondition == 11) {
							System.out.println("J" + "" + opponentsuit);
						}
						if (minimumsecondcondition == 12) {
							System.out.println("Q" + "" + opponentsuit);
						}
						if (minimumsecondcondition == 13) {
							System.out.println("K" + "" + opponentsuit);
						}
					}
					//third condition: if there is no card in that suit that is of higher rank than opponent card, play lowest card in suit
					if (secondconditionarray.size() == 0) {
						ArrayList<Integer> thirdconditionarray = new ArrayList<Integer>();
						if (opponentsuit == dealer1suit) {
							thirdconditionarray.add(dealer1int);
						}
						if (opponentsuit == dealer2suit) {
							thirdconditionarray.add(dealer2int);
						}
						if (opponentsuit == dealer3suit) {
							thirdconditionarray.add(dealer3int);
						}
						if (opponentsuit == dealer4suit) {
							thirdconditionarray.add(dealer4int);
						}
						if (opponentsuit == dealer5suit) {
							thirdconditionarray.add(dealer5int);
						}
						int minimumthirdcondition = 14;
						for (int i = 0; i < thirdconditionarray.size(); i++) {
							if (thirdconditionarray.get(i) < minimumthirdcondition) {
								minimumthirdcondition = thirdconditionarray.get(i);
							}
						}
						if (1 < minimumthirdcondition && minimumthirdcondition < 10) {
							System.out.println(minimumthirdcondition + "" + opponentsuit); 
						}
						if (minimumthirdcondition == 1) {
							System.out.println("A" + "" + opponentsuit);
						}
						if (minimumthirdcondition == 10) {
							System.out.println("T" + "" + opponentsuit);
						}
						if (minimumthirdcondition == 11) {
							System.out.println("J" + "" + opponentsuit);
						}
						if (minimumthirdcondition == 12) {
							System.out.println("Q" + "" + opponentsuit);
						}
						if (minimumthirdcondition == 13) {
							System.out.println("K" + "" + opponentsuit);
						}
					}
				}
			}
			else {
				//fourth condition: if there is no card in that suit, play lowest ranking card regardless of suit:
				ArrayList<Integer> fourthconditionarray = new ArrayList<Integer>();
				fourthconditionarray.add(dealer1int);
				fourthconditionarray.add(dealer2int);
				fourthconditionarray.add(dealer3int);
				fourthconditionarray.add(dealer4int);
				fourthconditionarray.add(dealer5int);
				int tie = -1;
				int minimumfourthcondition = 14;
				for (int i = 0; i < fourthconditionarray.size(); i++) {
					if (fourthconditionarray.get(i) < minimumfourthcondition) {
						minimumfourthcondition = fourthconditionarray.get(i);
					}
				}
				for (int i = 0; i < fourthconditionarray.size(); i++) {
					if (fourthconditionarray.get(i) == minimumfourthcondition) {
						tie++;
					}
				}
				if (tie == 0) {
					if (minimumfourthcondition == dealer1int) {
						System.out.println(dealercard1);
					}
					if (minimumfourthcondition == dealer2int) {
						System.out.println(dealercard2);
					}
					if (minimumfourthcondition == dealer3int) {
						System.out.println(dealercard3);
					}
					if (minimumfourthcondition == dealer4int) {
						System.out.println(dealercard4);
					}
					if (minimumfourthcondition == dealer5int) {
						System.out.println(dealercard5);
					}
				}
				//fifth condition: if there is tie, play cards in order: clubs, diamonds, hearts, and spades
				String dealer1string = "" + dealer1suit;
				String dealer2string = "" + dealer2suit;
				String dealer3string = "" + dealer3suit;
				String dealer4string = "" + dealer4suit;
				String dealer5string = "" + dealer5suit;
				int cnumber = 0;
				int dnumber = 0;
				int hnumber = 0;
				int snumber = 0;
				if (tie > 0) {
					ArrayList<String> fifthconditionarray = new ArrayList<String>();
					if (minimumfourthcondition == dealer1int) {
						fifthconditionarray.add(dealer1string);
					}
					if (minimumfourthcondition == dealer2int) {
						fifthconditionarray.add(dealer2string);
					}
					if (minimumfourthcondition == dealer3int) {
						fifthconditionarray.add(dealer3string);
					}
					if (minimumfourthcondition == dealer4int) {
						fifthconditionarray.add(dealer4string);
					}
					if (minimumfourthcondition == dealer5int) {
						fifthconditionarray.add(dealer5string);
					}
					for (int i = 0; i < fifthconditionarray.size(); i++) {
						if (fifthconditionarray.get(i).equals("C")) cnumber++;
						if (fifthconditionarray.get(i).equals("D")) dnumber++;
						if (fifthconditionarray.get(i).equals("H")) hnumber++;
						if (fifthconditionarray.get(i).equals("S")) snumber++;
					}
					if (cnumber>0) {
						if (1 < minimumfourthcondition && minimumfourthcondition < 10) {
							System.out.println(minimumfourthcondition + "C");
						}
						if (minimumfourthcondition == 1) {
							System.out.println("A" + "C");
						}
						if (minimumfourthcondition == 10) {
							System.out.println("T" + "C");
						}
						if (minimumfourthcondition == 11) {
							System.out.println("J" + "C");
						}
						if (minimumfourthcondition == 12) {
							System.out.println("Q" + "C");
						}
						if (minimumfourthcondition == 13) {
							System.out.println("K" + "C");
						}
					}
					else if (dnumber>0) {
						if (1 < minimumfourthcondition && minimumfourthcondition < 10) {
							System.out.println(minimumfourthcondition + "D");
						}
						if (minimumfourthcondition == 1) {
							System.out.println("A" + "D");
						}
						if (minimumfourthcondition == 10) {
							System.out.println("T" + "D");
						}
						if (minimumfourthcondition == 11) {
							System.out.println("J" + "D");
						}
						if (minimumfourthcondition == 12) {
							System.out.println("Q" + "D");
						}
						if (minimumfourthcondition == 13) {
							System.out.println("K" + "D");
						}
					}
					else if (hnumber>0) {
						if (1 < minimumfourthcondition && minimumfourthcondition < 10) {
							System.out.println(minimumfourthcondition + "H");
						}
						if (minimumfourthcondition == 1) {
							System.out.println("A" + "H");
						}
						if (minimumfourthcondition == 10) {
							System.out.println("T" + "H");
						}
						if (minimumfourthcondition == 11) {
							System.out.println("J" + "H");
						}
						if (minimumfourthcondition == 12) {
							System.out.println("Q" + "H");
						}
						if (minimumfourthcondition == 13) {
							System.out.println("K" + "H");
						}
					}
					else {
						if (1 < minimumfourthcondition && minimumfourthcondition < 10) {
							System.out.println(minimumfourthcondition + "S");
						}
						if (minimumfourthcondition == 1) {
							System.out.println("A" + "S");
						}
						if (minimumfourthcondition == 10) {
							System.out.println("T" + "S");
						}
						if (minimumfourthcondition == 11) {
							System.out.println("J" + "S");
						}
						if (minimumfourthcondition == 12) {
							System.out.println("Q" + "S");
						}
						if (minimumfourthcondition == 13) {
							System.out.println("K" + "S");
						}
					}
				}
			}
		}
	}
}

