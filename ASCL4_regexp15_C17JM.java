import java.util.Scanner;
import java.util.regex.*;


public class ASCL4_regexp15_C17JM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("INPUT");
		System.out.println("What is your input?");
		String input1 = scan.nextLine();
		String[] array = input1.split(",[ ]*");
		String input2 = scan.nextLine();
		String input3 = scan.nextLine();
		String input4 = scan.nextLine();
		String input5 = scan.nextLine();
		String input6 = scan.nextLine();
		System.out.println();
		System.out.println("OUTPUT");

		Pattern p2 = Pattern.compile(input2);
		int counter2 = 0;
		for (int i = 0; i < 10; i++) {
			Matcher m2 = p2.matcher(array[i]);
			boolean b2 = m2.matches();
			if (b2 == true) {
				counter2 ++;
				if (counter2 == 1) {
					System.out.print(array[i]);
				}
				else {
					System.out.print(", " + array[i]);
				}
			}
		}
		
		System.out.println();
		Pattern p3 = Pattern.compile(input3);
		int counter3 = 0;
		for (int i = 0; i < 10; i++) {
			Matcher m3 = p3.matcher(array[i]);
			boolean b3 = m3.matches();
			if (b3 == true) {
				counter3 ++;
				if (counter3 == 1) {
					System.out.print(array[i]);
				}
				else {
					System.out.print(", " + array[i]);
				}
			}
		}
		
		System.out.println();
		Pattern p4 = Pattern.compile(input4);
		int counter4 = 0;
		for (int i = 0; i < 10; i++) {
			Matcher m4 = p4.matcher(array[i]);
			boolean b4 = m4.matches();
			if (b4 == true) {
				counter4 ++;
				if (counter4 == 1) {
					System.out.print(array[i]);
				}
				else {
					System.out.print(", " + array[i]);
				}
			}
		}
		
		System.out.println();
		Pattern p5 = Pattern.compile(input5);
		int counter5 = 0;
		for (int i = 0; i < 10; i++) {
			Matcher m5 = p5.matcher(array[i]);
			boolean b5 = m5.matches();
			if (b5 == true) {
				counter5 ++;
				if (counter5 == 1) {
					System.out.print(array[i]);
				}
				else {
					System.out.print(", " + array[i]);
				}
			}
		}
		
		System.out.println();
		Pattern p6 = Pattern.compile(input6);
		int counter6 = 0;
		for (int i = 0; i < 10; i++) {
			Matcher m6 = p6.matcher(array[i]);
			boolean b6 = m6.matches();
			if (b6 == true) {
				counter6 ++;
				if (counter6 == 1) {
					System.out.print(array[i]);
				}
				else {
					System.out.print(", " + array[i]);
				}
			}
		}
	}
}
