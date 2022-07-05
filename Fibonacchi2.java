public class Fibonacchi2{
	//再起を使ったフィボナッチ数の計算
	static int fibonacchi(int n)
	{
		// n=0 で1を戻す
		if(0 == n)
			return 0;
		
		// n=1で1を戻す
		if(1 == n)
			return 1;
		
		//nが2以上でFn-1とFn-2を足す
		return fibonacchi(n-1)+fibonacchi(n-2);
	}
	
	//メイン
	public static void main(String[] args) {
		int n, fn;
		
		//F5の計算
		n = 5;
		fn = fibonacchi(n);
		System.out.println("F" + n + "=" + fn);
		
	}
	
}