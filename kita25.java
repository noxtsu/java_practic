import java.util.Scanner;

public class kita25{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("値を二つ入力してください");
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.print("二つの値の平均値は");
		System.out.print((x + y) / 2);
	}
}