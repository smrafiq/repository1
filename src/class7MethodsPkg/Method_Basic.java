package class7MethodsPkg;

public class Method_Basic {

	public static void main(String[] args) {
		
		printCity(3);
		AnyCity(4, "Dhaka");
		CountryCity(1, "USA", "Miami");
		
	}//manin
	
	// print New York 3 times creating a reusable method
	public static void printCity(int n) {
		for(int i=1;i<=n;i++)
		System.out.println("New York");
	}
	
	
	// another way:
	public static void AnyCity(int n, String c) {
		for(int i =1; i<=n; i++)
			System.out.println(c);
	}
	
	// print country and city
	public static void CountryCity(int n, String country, String city) {
		for(int i=1; i<=n;i++) {
		System.out.println("country: " + country);
		for(int j =1;j<=n; j++) {
			System.out.println("city: " + city);
		}
	}
	}
}//class
