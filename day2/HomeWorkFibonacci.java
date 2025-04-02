package HomeWorkWeek1.day2;

public class HomeWorkFibonacci {

	public static void main(String[] args) {

		System.out.println("Displaying Fibinacci Number");
		int n = 8, a = 0, b = 1;
		{
			System.out.println(a);
			System.out.println(b);
		}
		for (int i = 2; i < n; i++) {
			int add = a + b;
			System.out.print("." + add);
			a = b;
			b = add;

		}

	}

}
