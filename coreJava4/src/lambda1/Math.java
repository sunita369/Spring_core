package lambda1;

interface Arithmetic {
	int operation(int a, int b);
}

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Addition using Lambda expression
				Arithmetic addition = (int a, int b) -> (a + b);
				// Arithmetic addition = (int a, int b) -> {return a + b;};

				System.out.println("Addition = " + addition.operation(5, 6));

				// Subtraction using Lambda expression
				Arithmetic subtraction = (int a, int b) -> (a - b);
				// Arithmetic addition = (int a, int b) -> {return a - b;};

				System.out.println("Subtraction = " + subtraction.operation(5, 3));

				// Multiplication using Lambda expression
				Arithmetic multiplication = (int a, int b) -> (a * b);
				// Arithmetic addition = (int a, int b) -> {return a * b;};

				System.out.println("Multiplication = " + multiplication.operation(4, 6));

				// Division using Lambda expression
				Arithmetic division = (int a, int b) -> (a / b);
				// Arithmetic addition = (int a, int b) -> {return a * b;};

				System.out.println("Division = " + division.operation(12, 6));

	}

}
