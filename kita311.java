import java.util.Scanner;

public class kita311{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("何月の祝日が見たい？半角数字で入力してね");
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 1:
			System.out.println("１月：元日、成人の日");
			break;
			
		case 2:
			System.out.println("２月：建国記念の日");
			break;
			

		case 3:
			System.out.println("３月：春分の日");
			break;
			
			
		case 4:
			System.out.println("４月：昭和の日");
			break;
			
			
		case 5:
			System.out.println("５月：憲法記念日、みどりの日、こどもの日");
			break;
			
			
		case 6:
			System.out.println("６月：祝日はありません");
			break;
			
			
		case 7:
			System.out.println("７月：海の日");
			break;
			
			
		case 8:
			System.out.println("８月：祝日はありません");
			break;
			
		case 9:
			System.out.println("９月：敬老の日、秋分の日");
			break;
			
		case 10:
			System.out.println("１０月：体育の日");
			break;
			
		case 11:
			System.out.println("１１月：文化の日、勤労感謝の日");
			break;
			
		case 12:
			System.out.println("１２月：天皇誕生日");
			break;
			
		}
	}
	
}