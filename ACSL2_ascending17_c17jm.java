/**
 * Author: Julia Martin
 * Course: Adv. Computer Science 4'A'
 * Assignment: ACSL Program #2, Senior Division (Ascending Strings)
 * 
 * DATA:
 * Input: 54789274
 * Output: 5 47 478
 * 
 * Input: 34099800098
 * Output: 3 8 40 90 99
 * 
 * Input: 3040000098
 * Output: 3 8 40 90
 * 
 * Input: 00000400000
 * Output: 0 4
 * 
 * Input: 0000404000
 * Output: 0 4 40
 * 
 * Input: 0
 * Output: 0
 * 
 * Input: 22254322278
 * Output: 2 8 22 72 543
 * 
 * Input: 11111111111111111
 * Output: 1 11 111 1111 11111
 * 
 * Input: 72983745
 * Output: 7 54 298
 * 
 * Input: 987656565656564321
 * Output: 9 21 87 346 656 5656
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ACSL2_ascending17_c17jm {
	public static void main(String[] args) {

		while(true) {
			System.out.println("What is your input?");
			//get input
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();

			ArrayList<Integer> answer = new ArrayList<Integer>();

			int leftpos = 0;
			int rightpos = input.length();
			//initial
			answer.add(Integer.parseInt(input.substring(leftpos,leftpos+1)));
			//System.out.println(Integer.parseInt(input.substring(leftpos,leftpos+1)));
			input = input.substring(leftpos+1, rightpos);
			rightpos = input.length();
			while(true){
				int j = 0;

				//right
				if (input.length() == 0) {
					break;
				}
				else if (Integer.parseInt(input.substring(rightpos-1, rightpos)) > answer.get(answer.size()-1)) {
					answer.add(Integer.parseInt(input.substring(rightpos-1, rightpos)));
					//System.out.println(Integer.parseInt(input.substring(rightpos-1, rightpos)));
					input = input.substring(leftpos, rightpos-1);
					rightpos = input.length();
				}
				else {
					for(int p = 0; p < 1000; p++) {
						if (input.length() <= p) {
							j++;
							break;
						}
						//System.out.println("hello");
						//System.out.println(answer.get(answer.size()));
						//System.out.println(reverse(Integer.parseInt(input.substring(rightpos-p-1, rightpos))));
						if (Integer.parseInt(reversestr(input.substring(rightpos-p-1, rightpos))) > answer.get(answer.size()-1)) {
							answer.add(Integer.parseInt(reversestr(input.substring(rightpos-p-1, rightpos))));
							//System.out.println(reverse(Integer.parseInt(input.substring(rightpos-p-1, rightpos))));
							input = input.substring(leftpos, rightpos-p-1);
							rightpos = input.length();
							//System.out.println();
							break;
						}
					}

				}

				if (j == 1) {
					break;
				}

				//left
				if (input.length() == 0) {
					break;
				}
				else if (Integer.parseInt(input.substring(leftpos, leftpos+1)) > answer.get(answer.size()-1)) {
					answer.add(Integer.parseInt(input.substring(leftpos, leftpos+1)));
					//System.out.println(Integer.parseInt(input.substring(leftpos, leftpos+1)));
					input = input.substring(leftpos+1, rightpos+1);
					rightpos = input.length();
				}
				else {
					for(int t = 0; t < 1000; t++) {
						if (input.length() <= t) {
							j++;
							break;
						}
						if (Integer.parseInt(input.substring(leftpos, leftpos+1+t)) > answer.get(answer.size()-1)) {
							answer.add(Integer.parseInt(input.substring(leftpos, leftpos+1+t)));
							//System.out.println(Integer.parseInt(input.substring(leftpos, leftpos+1+t)));
							input = input.substring(leftpos+1+t, rightpos);
							rightpos = input.length();
							break;
						}
					}

				}

				if (j == 1) {
					break;
				}

			}



			for (int i = 0; i < answer.size(); i++) {
				System.out.print(answer.get(i) + " ");
			}
			System.out.println();
		}

	}

	public static String reversestr(String reversestrinput) {
		char[] in = reversestrinput.toCharArray();
		int begin=0;
		int end=in.length-1;
		char temp;
		while(end>begin){
			temp = in[begin];
			in[begin]=in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	public static int reverse(int number) {
		int backup = number;
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		number = backup;
		int sum = 0;
		for (int i = count; i > 0; i--) {
			int sum10 = 1;
			int last = number % 10;
			for (int j = 1; j < i; j++) {
				sum10 = sum10 * 10;
			}
			sum = sum + (last * sum10);
			number = number / 10;
		}
		return sum;
	}
}



