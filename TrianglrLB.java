package chap01;
import java.util.Scanner;
public class TrianglrLB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("�̵ �ﰢ�� ���");
		
		do {
			System.out.print("�� ��> ");
			n = sc.nextInt();
		} while (n <= 0);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
