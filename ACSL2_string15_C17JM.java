import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author Julia Martin
 * Sample Data:
 * Input: 1234.56, 6, 3
 * Answer: ##.###
 * Input: 83.4, 5, 1
 * Answer: #83.4
 * Input: 46.91, 5, 2
 * Answer: 46.91
 * Input: 8735.567, 6, 1
 * Answer: 8735.6
 * Input: 57.24, 3, 1
 * Answer: #.#
 *
 */

public class ACSL2_string15_C17JM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to input? Please input it as float_expression, length, decimal.");
		String input = scan.nextLine();
		String[] array = input.split(",[ ]*");
		String float_expression = array[0];
		int length = Integer.parseInt(array[1]);
		int decimal = Integer.parseInt(array[2]);


		//convert from string to string array to get the decimal
		String[] decimalarray = float_expression.split("\\.");
		
		//final string:
		String finaldecimal = "";

		//DECIMAL CASE 1: if decimal variable is greater than number of numbers past decimal
		if (decimal > decimalarray[1].length()) {
			ArrayList<String> hashtag = new ArrayList<String>();
			String hash =  "#";
			for (int i = 0; i < decimalarray[0].length(); i++) {
				hashtag.add(hash);
			}
			hashtag.add(".");
			for (int i = 0; i < decimal; i++) {
				hashtag.add(hash);
			}
			for (int i = 0; i < hashtag.size(); i++) {
				finaldecimal = finaldecimal.concat(hashtag.get(i));
			}
			//System.out.print(finaldecimal);
			
		}
		
		
		//DECIMAL CASE 2: if decimal variable is less than number of numbers past decimal
		if (decimal < decimalarray[1].length()) {
			//convert decimal part of number into its own string, then split into two strings and turn those strings into ints
			String decimalkeeppart = decimalarray[1];
			String decimalkeep = String.valueOf(decimalkeeppart).substring(0, decimal);
			//System.out.println(decimalkeep);
			int decimalkeeptoint = Integer.parseInt(decimalkeep);
			String decimaldiscardpart = decimalarray[1];
			String decimaldiscard = String.valueOf(decimaldiscardpart).substring(decimal, decimal+1);
			int decimaldiscardtoint = Integer.parseInt(decimaldiscard);
			//round
			if (decimaldiscardtoint >= 5) {
				decimalkeeptoint +=1;
			}
			String decimalkeeptostring = Integer.toString(decimalkeeptoint);
			//System.out.println(decimalkeeptostring);
			//put back into array list
			ArrayList<String> arraylistcorrectdecimal = new ArrayList<String>();
			arraylistcorrectdecimal.add(decimalarray[0]);
			arraylistcorrectdecimal.add(".");
			arraylistcorrectdecimal.add(decimalkeeptostring);
			for (int i = 0; i < arraylistcorrectdecimal.size(); i ++) {
				finaldecimal = finaldecimal.concat(arraylistcorrectdecimal.get(i));
			}
			//System.out.print(finaldecimal);
			
		}
		
		//DECIMAL CASE 3: if decimal variable is equal to the number of numbers past decimal
		if (decimal == decimalarray[1].length()) {
			finaldecimal = finaldecimal.concat(float_expression);
			//System.out.print(finaldecimal);
		}
		
		//LENGTH CASE 1: if length is greater than actual length
		if (length > finaldecimal.length()) {
			int leftoverspots = length - finaldecimal.length();
			ArrayList<String> hashtag = new ArrayList<String>();
			String hash =  "#";
			String finalstring = "";
			for (int i = 0; i < leftoverspots; i++) {
				hashtag.add(hash);
			}
			hashtag.add(finaldecimal);
			
			for (int i = 0; i < hashtag.size(); i++) {
				finalstring = finalstring.concat(hashtag.get(i));
			}
			System.out.println(finalstring);
		}
		
		//LENGTH CASE 2: if length is less than actual length
		if (length < finaldecimal.length()) {
			String[] finaldecimalparts = finaldecimal.split("\\.");
			int subtraction = length - (finaldecimalparts[1].length() + 1);
			
			
			String finalstring = "";
			ArrayList<String> hashtag = new ArrayList<String>();
			String hash =  "#";
			for (int i = 0; i < subtraction; i++) {
				hashtag.add(hash);
			}
			hashtag.add(".");
			for (int i = 0; i < finaldecimalparts[1].length(); i++) {
				hashtag.add(hash);
			}
			
			for (int i = 0; i < hashtag.size(); i++) {
				finalstring = finalstring.concat(hashtag.get(i));
			}
			System.out.println(finalstring);
		}
		
		//LENGTH CASE 3: if length is equal to actual length
		if (length == finaldecimal.length()) {
			String finalstring = finaldecimal;
			System.out.println(finalstring);
		}
	}
}

