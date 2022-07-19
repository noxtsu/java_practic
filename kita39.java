import java.util.Scanner;

public class kita39{
	public static void main(String args[]) {
		System.out.println("知りたい曜日と時間帯を選択してください");
		System.out.println(">0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜\n"
				+ ">0=午前、1=午後、2=夜間");
		
		Scanner scanner = new Scanner(System.in);
		int week = scanner.nextInt();
		int time = scanner.nextInt();
		
		if ((week == 0) || (week == 2 && time == 0) 
			|| (week == 3 && time == 2) || (week == 5 && time == 0)
			|| (week == 6 && time == 1) || (week == 6 || time == 2)) {
			System.out.println("休診");
		}
		else if ((week > 6) || (time > 2)) {
			System.out.println("正しい値を入力してください");
		}
		
		else {
			System.out.println("開いています");
		}
			
	}
}