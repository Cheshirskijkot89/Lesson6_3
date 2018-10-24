package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int width;
		int heigth;
		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите ширину:");
		width = sc.nextInt();
		System.out.println("¬ведите высоту:");
		heigth = sc.nextInt();

		sc.close();

		Paint(width, heigth);
	}

	static void Paint(int vwidth, int vheigth) {

		for (int i = 1; i <= vheigth; i++) {

			for (int j = 1; j <= vwidth; j++) {

				if (i == 1 || i == vheigth) {
					System.out.print("*");
				} else {

					if (j == 1 || j == vwidth) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			
			System.out.println("");
		}

	}
}
