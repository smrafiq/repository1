package gruopStudy;

public class MethodOverLoding {

	public static void main(String[] args) {
		// group study

		// print 1,3,5,7,9,11.....21
		// find odd number
		for (int i = 1; i <= 9; i += 2) { // i+2 = will increment by 2
			System.out.println("odd numbers:" + i);
		}

		System.out.println(" ");

		// find even number
		for (int i = 2; i < 10; i += 2) {
			System.out.println("even number: " + i);
		}

		// print 89 is a prime number
		boolean isPrime = true;
		int n = 89;
		for(int i = 2; i<=n/2; i++) {
			if(n%2 == 0) {
				isPrime = false;
			}
			else if(n%2 == 1) 
				isPrime = true;
			}//for loop end
		
			if(isPrime == true) {
				System.out.println("prime number");
			}
			else if(isPrime==false) {
				System.out.println("not a prime number");
			}
		

	}// main

}// class
