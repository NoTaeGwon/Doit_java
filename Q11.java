package chap01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("자리수 입력: ");
		
		int num;
		do {
			System.out.print("양의 정수 입력: ");
			num = sc.nextInt();
		} while (num <= 0);
		
		int no = 0;
		while (num > 0) {
			num /= 10;
			no ++;
		}
		
		System.out.println("그 수는 " + no + "자리 입니다.");
		
		
		
		
		

	}

}
