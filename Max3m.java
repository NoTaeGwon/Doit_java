package chap01;

public class Max3m {
	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		
		return max;
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		return max;
	}
	
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max3(3, 2, 1): " + max3(3, 2, 1));
		System.out.println("max4(10, 20, 50): " + max4(10, 20, 50, 30));
		System.out.println("min3(5, 4, 3): " + min3(5, 4, 3));
		
	

	}

}
