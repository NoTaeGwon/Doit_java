package chap01;
import java.util.Scanner;

public class Q16 {
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i) + 1; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		do {
			System.out.print("출력할 삼각형 단 수> ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		} while (n <= 0);
		
		spira(n);
		
		

	}

}
