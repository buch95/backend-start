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
			while (numr > 0) {
				System.out.println( numr % 10);
				numr = numr / 10;
			}
		}else if(hWNum == 2) {
			System.out.println("Please input side a lenght");
			int a;
			a = sc.nextInt();
			System.out.println("Please input side b lenght");
			int b;
			b = sc.nextInt();
			System.out.println("Please input side c lenght");
			int c;
			c = sc.nextInt();
			
			double p = (a+b+c)/2;
			double s  = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("Square area of your triangle " + s);
			
		}else {
			System.out.println("Please input radius");
			int r;
			r = sc.nextInt();
			
			double s;
			s = 2*Math.PI*r;
			
			
			
			System.out.println("Your answer is " + String.format("%.2f", s) );
		};	
	}

}	