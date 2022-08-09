package chap01;

public class exam9 {
	static int sumof(int a, int b) {
		int min = b;
		int max = a;
		if (b > max) {
			max = b;
			min = a;
		} else {
			min = b;
			max = a;
		}
		int sum = 0;
		
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sumof(5, 10): " + sumof(5, 10));
		

	}

}
