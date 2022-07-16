import java.util.Scanner;

public class kita26{
	public static void main(String args[]) {
		System.out.println("年齢を入力してください");
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		System.out.println("生まれてから今までおおよそ" + (a * 365) + "日です");
		
	}
}