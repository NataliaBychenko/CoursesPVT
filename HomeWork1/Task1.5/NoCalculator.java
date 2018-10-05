import java.util.Scanner;

public class NoCalculator {
	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.println("Enter b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}

		System.out.println("Summ: " + a + " + " + b + " = " + (a + b));
		System.out.println("Difference: " + a + " - " + b + " = " + (a - b));
		System.out.println("Product: " + a + " * " + b + " = " + a * b);
		System.out.println("Quotient: " + a + " / " + b + " = " + a / b);

	}
}
