public class PrintSample1 {
	public static void main(String[] args) {
		//改行して"Hello!"を出力
		System.out.println("Hello!");
		
		//改行無しで"1"～"5"を出力
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.print("5");
		
		//改行を出力（引数無し）
		System.out.println();
		
		//整数値を表示
		int i = 100;
		System.out.println(i);
		
		//実数値を表示
		double d = 200.0;
		System.out.println(d);
		
		//文字列クラスの値を表示
		String s = "ABCDEF";
		System.out.println(s);
		
		//文字列クラスと整数を合わせて表示
		String a = "2足す3は、";
		int b = 5;
		System.out.println(a+b);
		
	}
}