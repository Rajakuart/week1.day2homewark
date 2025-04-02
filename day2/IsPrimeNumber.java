package HomeWorkWeek1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int number = 5, count = 0;
		System.out.println("Your given number is " + number);
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
			//String result = (count==2)? "Its prime number":"not a prime number";
			//System.out.println(result);
			if (count == 2) {
				System.out.println("Number " + number + " is a prime number");
			break;
			} else {
				System.out.println("Number" + number + "is not a prime number");
break;
			}
		}
	}
}
