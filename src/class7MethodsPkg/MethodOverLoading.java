package class7MethodsPkg;
	// to fix the indenting of the line
	// control, shift, f
public class MethodOverLoading {

	public static void main(String[] args) {
		// add two numbers
		addNumbers(40, 89, 0);//method calling statement
		addNumbers(7, 10, 30);
		addNumbers(5.9, 2.1f, 4); // using float
		addNumbers(10.5, 5.2, 8); // using double

	}// main

	// add multiple numbers
	public static void addNumbers(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("total: " + result);
	}

	public static void addNumbers(double a, float b, int c) {
		double result = a + b + c;
		System.out.println(result + " fraction value float");
	}

	public static void addNumbers(double a, double b, int c) {
		double result = a + b + c;
		System.out.println(result + " fraction value double");
	}

	// method over loaded is when the methods name are same, but the
	// 1.sequence of parameter is different
	// 2.types (variables) of parameter is different
	// 3. number of parameter is different

}// class
