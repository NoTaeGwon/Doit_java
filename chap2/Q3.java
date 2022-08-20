package chap02;
import java.util.Scanner;

public class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return (sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("배열의 요소를 더한 값: " + sumOf(a));

	}

}
