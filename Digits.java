package chap01;
import java.util.Scanner;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��Ͻÿ�.");
		
		do {
			System.out.print("�Է�: ");
			no = sc.nextInt();
		} while (no < 10 || no > 99);
		
		System.out.println("���� no�� ���� " + no + "��(��) �Ǿ����ϴ�.");

	}

}
