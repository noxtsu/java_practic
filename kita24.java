import java.util.Scanner;

public class kita24{
	public static void main(String args[]) {
		System.out.println("値を二つ入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}
}