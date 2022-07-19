import java.util.Scanner;

public class kita37{
	public static void main(String args[]) {
		System.out.println("点数を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if (x >= 60) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
			
		
	}
}