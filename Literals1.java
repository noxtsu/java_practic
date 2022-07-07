public class Literals1{
	public static void main(String[] args) {
		//int型変数に10進数の値を代入
		int i10 =51;
		
		//int型変数に2進数の値を代入
		//値の銭湯に'0b'をつけると2進数
		int i2 = 0b00110011;
		
		//int型変数に8進数の値を代入
		//値の銭湯に'0'をつけると8進数
		int i8 = 063;
		
		//int型変数に16進数の値を代入
		//値の先頭に'0x'を付けると16進数
		int i16 = 0x33;
		
		//結果出力
		System.out.println(i10);
		System.out.println(i2);
		System.out.println(i8);
		System.out.println(i16);
	}
}