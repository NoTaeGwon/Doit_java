package chap01;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڸ��� �Է�: ");
		
		int num;
		do {
			System.out.print("���� ���� �Է�: ");
			num = sc.nextInt();
		} while (num <= 0);
		
		int no = 0;
		while (num > 0) {
			num /= 10;
			no ++;
		}
		
		System.out.println("�� ���� " + no + "�ڸ� �Դϴ�.");
		
		
		
		
		

	}

}
