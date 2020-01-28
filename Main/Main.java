package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int hWNum;
		System.out.println("Please input your number select homework task");
		hWNum = sc.nextInt();
		if (hWNum == 1) {
			System.out.println("Input pattern repeat time");
			int stripe = sc.nextInt();
			System.out.println("Input num of rows");
			int height = sc.nextInt();
			for (int j = 1; j <= height; j++) {
				for (int i = 1; i <= stripe; i++) {
					if (i % 2 == 0) {
						System.out.print("***");
					} else {
						System.out.print("+++");
					}
				}
				System.out.println();
			}

		} else if (hWNum == 2) {
			System.out.println("Input your number");
			int facInp = sc.nextInt();
			int facOut = 1;
			if (4 < facInp && facInp < 16) {
				for (int i = 1; i <= facInp; i++) {
					facOut = facOut * i;
				}
				System.out.println(facOut);
			}
		} else if (hWNum == 3) {
			for (int i = 0; i < 10; i++) {
				int sum = i * 5;
				System.out.println(i + " x 5 = " + sum);
			}
		} else {
			System.out.println("Input width");
			int width = sc.nextInt();
			System.out.println("Input height");
			int height = sc.nextInt();
			String str = "*";
			for (int i = 1; i <= height; i++) {
				for (int j = 1; j < width; j++) {
					if (i == 1 || i == height) {
						System.out.print(str);
					} else {
						if (j == 1 || j == width-1) {
							System.out.print(str);
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}

		}
		;
	}

}