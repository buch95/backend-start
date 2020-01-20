package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hWNum;
		System.out.println("Please input 1 2 or 3 to select homework task");
		hWNum = sc.nextInt();
		if(hWNum == 1) {
			System.out.println("Please input your 5 digit number:");
			int numr;
			numr = sc.nextInt();
			String number = String.valueOf(numr);
			for (int i = 0; i< number.length(); i++) {
				int outputNum = Character.digit(number.charAt(i), 10);
				// radix is number alphabet radix 2 is binary, radix 10 is 0 1 2 3 ... 9  
				// Character.digit(what data to convert, radix)
				System.out.println(outputNum);
			}
		}else if(hWNum == 2) {
			System.out.println("Please input side a length");
			int a;
			a = sc.nextInt();
			System.out.println("Please input side b length");
			int b;
			b = sc.nextInt();
			System.out.println("Please input side c length");
			int c;
			c = sc.nextInt();
			
			double p = (a+b+c)/2;
			double s  = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Square area of your triangle " + s);
			
		}else {
			System.out.println("Please input radius");
			int r;
			r = sc.nextInt();
			
			double c;
			c = 2*Math.PI*r;
			
			System.out.println("Circumference is " + String.format("%.2f", c) );
		};	
	}

}	