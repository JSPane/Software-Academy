
public class Task3 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, fib = 2;
		
		System.out.println("The Fibonacci sequence:");
		System.out.println(n1);
		System.out.println(n2);
		
		while (fib < 1000000) {
			n3 = n1 + n2;
			
			System.out.println(n3);
			
			n1 = n2;
			n2 = n3;
			
			fib++;
			
		}
		
		System.out.println("This task broke my lil heart.");

	}

}
