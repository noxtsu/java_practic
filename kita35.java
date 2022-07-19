import java.util.Scanner;

public class kita35{
	public static void main(String args[]) {
		System.out.println("値を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("値は偶数です。");
		}
		
		else {
			System.out.println("値は奇数です。");
		}
			
	}
}