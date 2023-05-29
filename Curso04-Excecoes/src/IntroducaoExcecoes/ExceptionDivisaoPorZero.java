package IntroducaoExcecoes;

public class ExceptionDivisaoPorZero {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		
		System.out.println((a + b) / 0);
		
		// Exception in thread "main" java.lang.ArithmeticException: / by zero

	}

}
