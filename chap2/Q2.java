package chap02;
import java.util.Scanner;

public class Q2 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]와(과) " + "a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1);
			
			for (int x : a) {
				System.out.print(x + " ");
			}
			System.out.println("");
		}
		System.out.println("요소를 역순으로 정렬했습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 입력: ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
	
	}

}
