package chap02;

import java.util.Scanner;

public class Q4 {
	static void copy(int[] a, int [] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a배열 요솟수: ");
		int numa = stdIn.nextInt();
		int[] a = new int[numa];
		for (int i = 0; i < numa; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b배열 요솟수: ");
		int numb = stdIn.nextInt();
		int[] b = new int [numb];
		for (int i = 0; i < numb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}
		
		copy(a, b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 카피 확인");
		for(int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] = " + a[i]);

	}

}
