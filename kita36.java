import java.util.Scanner;

public class kita36{
	public static void main(String args[]) {
		System.out.println("値を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if (x >= 0 && x % 2 == 0) {
			System.out.println("正の偶数");
		}
		else if (x < 0 && x % 2 == 0) {
			System.out.println("負の偶数");
		}
		else if (x > 0 && x % 2 == 1) {
			System.out.println("正の奇数");
		}
		else {
			System.out.println("負の奇数");
		}		
	}
}