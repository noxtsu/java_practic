import java.util.Scanner;

public class kita31{
	public static void main(String args[]) {
		System.out.println("二つの値を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (x > y) {
			System.out.println(x + "は" + y +"より大きい。");
			
		}
		
	}
}