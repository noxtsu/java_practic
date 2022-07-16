import java.util.Scanner;

public class FizzBuzz{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("値を入力してください");
	
		int i = scanner.nextInt();
		
		if (i % 15 == 0) {
			System.out.println("結果は…FizzBuzz");
		}
		else if (i % 3 == 0) {
			System.out.println("結果は…Fizz");
			
		}
		else if (i % 5 == 0) {
			System.out.println("結果は…Buzz");
		}
		
		else
			System.out.println("結果は…" + i);
		
	}
}