import java.util.Scanner;
/**
 * 
 * @author Julia Martin
 * Sample Data:
 * Input: 0, 7, 6, 5
 * Answer: 111 110 101 and rwx rw- r-x
 * Input: 1, 3, 2, 3
 * Answer: 011 010 011 and -ws -w- -wx
 * Input: 2, 5, 7, 4
 * Answer: 101 111 100 and r-x rws r--
 * Input: 4, 2, 5, 7
 * Answer: 010 101 111 and -w- r-x rwt
 * Input: 4, 6, 2, 1
 * Answer: 110 010 001 and rw- -w- --t
 *
 */
public class ACSL1_chmod15_C17JM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What special permission number (0, 1, 2, or 4), what first digit in the octal number, what second digit in the octal number, and what third digit in the octal number would you like? Please write it in the form a, b, c, d.");
		String input = scan.nextLine();
		String[] array = input.split(",[ ]*");
		int specialpermission = Integer.parseInt(array[0]);
		int octalone = Integer.parseInt(array[1]);
		int octaltwo = Integer.parseInt(array[2]);
		int octalthree = Integer.parseInt(array[3]);
	
		String binaryone = Integer.toBinaryString(octalone);
		if (binaryone.length() == 1) {
			binaryone = "00" + Integer.toBinaryString(octalone);
		}
		if (binaryone.length() == 2) {
			binaryone = "0" + Integer.toBinaryString(octalone);
		}

		String binarytwo = Integer.toBinaryString(octaltwo);
		if (binarytwo.length() == 1) {
			binarytwo = "00" + Integer.toBinaryString(octaltwo);
		}
		if (binarytwo.length() == 2) {
			binarytwo = "0" + Integer.toBinaryString(octaltwo);
		}

		String binarythree = Integer.toBinaryString(octalthree);
		if (binarythree.length() == 1) {
			binarythree = "00" + Integer.toBinaryString(octalthree);
		}
		if (binarythree.length() == 2) {
			binarythree = "0" + Integer.toBinaryString(octalthree);
		}

		System.out.print(binaryone + " " + binarytwo + " " + binarythree + " and ");


		if(specialpermission == 0) {
			if(binaryone.equals("000")) {
				String lettersone =  "---";
				System.out.print(lettersone + " ");

			}
			if(binaryone.equals("001")) {
				String lettersone =  "--x";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("010")) {
				String lettersone =  "-w-";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("011")) {
				String lettersone =  "-wx";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("100")) {
				String lettersone =  "r--";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("101")) {
				String lettersone =  "r-x";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("110")) {
				String lettersone =  "rw-";
				System.out.print(lettersone + " ");
			}
			if (binaryone.equals("111")) {
				String lettersone =  "rwx";
				System.out.print(lettersone + " ");
			}
			if(binarytwo.equals("000")) {
				String letterstwo =  "---";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("001")) {
				String letterstwo =  "--x";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("010")) {
				String letterstwo =  "-w-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("011")) {
				String letterstwo =  "-wx";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("100")) {
				String letterstwo =  "r--";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("101")) {
				String letterstwo =  "r-x";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("110")) {
				String letterstwo =  "rw-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("111")) {
				String letterstwo =  "rwx";
				System.out.print(letterstwo + " ");
			}
			if(binarythree.equals("000")) {
				String lettersthree =  "---";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("001")) {
				String lettersthree =  "--x";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("010")) {
				String lettersthree =  "-w-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("011")) {
				String lettersthree =  "-wx";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("100")) {
				String lettersthree =  "r--";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("101")) {
				String lettersthree =  "r-x";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("110")) {
				String lettersthree =  "rw-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("111")) {
				String lettersthree =  "rwx";
				System.out.print(lettersthree);
			}
		}
		if(specialpermission == 1) {
			if(binaryone.equals("000")) {
				String lettersone = "---";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("001")) {
				String lettersone = "--s";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("010")) {
				String lettersone = "-w-";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("011")) {
				String lettersone = "-ws";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("100")) {
				String lettersone = "r--";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("101")) {
				String lettersone = "r-s";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("110")) {
				String lettersone = "rw-";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("111")) {
				String lettersone = "rws";
				System.out.print(lettersone + " ");
			}
			if(binarytwo.equals("000")) {
				String letterstwo =  "---";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("001")) {
				String letterstwo =  "--x";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("010")) {
				String letterstwo =  "-w-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("011")) {
				String letterstwo =  "-wx";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("100")) {
				String letterstwo =  "r--";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("101")) {
				String letterstwo =  "r-x";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("110")) {
				String letterstwo =  "rw-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("111")) {
				String letterstwo =  "rwx";
				System.out.print(letterstwo + " ");
			}
			if(binarythree.equals("000")) {
				String lettersthree =  "---";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("001")) {
				String lettersthree =  "--x";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("010")) {
				String lettersthree =  "-w-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("011")) {
				String lettersthree =  "-wx";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("100")) {
				String lettersthree =  "r--";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("101")) {
				String lettersthree =  "r-x";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("110")) {
				String lettersthree =  "rw-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("111")) {
				String lettersthree =  "rwx";
				System.out.print(lettersthree);
			}
		}
		if (specialpermission == 2) {
			if(binaryone.equals("000")) {
				String lettersone =  "---";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("001")) {
				String lettersone = "--x";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("010")) {
				String lettersone = "-w-";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("011")) {
				String lettersone = "-wx";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("100")) {
				String lettersone = "r--";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("101")) {
				String lettersone = "r-x";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("110")) {
				String lettersone = "rw-";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("111")) {
				String lettersone = "rwx";
				System.out.print(lettersone + " ");
			}
			if(binarytwo.equals("000")) {
				String letterstwo =  "---";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("001")) {
				String letterstwo = "--s";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("010")) {
				String letterstwo = "-w-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("011")) {
				String letterstwo = "-ws";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("100")) {
				String letterstwo = "r--";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("101")) {
				String letterstwo = "r-s";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("110")) {
				String letterstwo = "rw-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("111")) {
				String letterstwo = "rws";
				System.out.print(letterstwo + " ");
			}
			if(binarythree.equals("000")) {
				String lettersthree =  "---";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("001")) {
				String lettersthree = "--x";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("010")) {
				String lettersthree = "-w-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("011")) {
				String lettersthree = "-wx";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("100")) {
				String lettersthree = "r--";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("101")) {
				String lettersthree = "r-x";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("110")) {
				String lettersthree = "rw-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("111")) {
				String lettersthree = "rwx";
				System.out.print(lettersthree);
			}
		}
		if(specialpermission == 4) {
			if(binaryone.equals("000")) {
				String lettersone =  "---";
				System.out.print(lettersone + " ");

			}
			if(binaryone.equals("001")) {
				String lettersone =  "--x";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("010")) {
				String lettersone =  "-w-";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("011")) {
				String lettersone =  "-wx";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("100")) {
				String lettersone =  "r--";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("101")) {
				String lettersone =  "r-x";
				System.out.print(lettersone + " ");
			}
			if(binaryone.equals("110")) {
				String lettersone =  "rw-";
				System.out.print(lettersone + " ");
			}
			if (binaryone.equals("111")) {
				String lettersone =  "rwx";
				System.out.print(lettersone + " ");
			}
			if(binarytwo.equals("000")) {
				String letterstwo =  "---";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("001")) {
				String letterstwo =  "--x";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("010")) {
				String letterstwo =  "-w-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("011")) {
				String letterstwo =  "-wx";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("100")) {
				String letterstwo =  "r--";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("101")) {
				String letterstwo =  "r-x";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("110")) {
				String letterstwo =  "rw-";
				System.out.print(letterstwo + " ");
			}
			if(binarytwo.equals("111")) {
				String letterstwo =  "rwx";
				System.out.print(letterstwo + " ");
			}
			if(binarythree.equals("000")) {
				String lettersthree =  "---";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("001")) {
				String lettersthree =  "--t";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("010")) {
				String lettersthree =  "-w-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("011")) {
				String lettersthree =  "-wt";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("100")) {
				String lettersthree =  "r--";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("101")) {
				String lettersthree =  "r-t";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("110")) {
				String lettersthree =  "rw-";
				System.out.print(lettersthree);
			}
			if(binarythree.equals("111")) {
				String lettersthree =  "rwt";
				System.out.print(lettersthree);
			}
		}
	}
}
