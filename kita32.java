import java.util.Scanner;

public class kita32{
	public static void main(String args[]) {
		System.out.println("二つの値を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (x == y) {
			System.out.println(x + "と" + y + "は同じ");
		}
			
		else if (x < y) {
			System.out.println("おおきな値は" + y);
			
		}
		
		else
			System.out.println("おおきな値は" + x);
			
	}
}