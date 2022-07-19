import java.util.Scanner;

public class kira38{
	public static void main(String args[]) {
		System.out.println("中間試験と期末試験の点数を入力");
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if (x >= 60 && y >= 60) {
			System.out.println("合格");
		}
		else if (x + y >= 130) {
			System.out.println("合格");
		}
		else if ((x >= 90 || y >= 90) && x + y >= 100){
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
	}
	
}