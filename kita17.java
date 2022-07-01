public class kita17{
	public static void main(String[] args) {
		int x, y, t;
		
		x = 7;
		y = 19;
		t = 4;
		
		t = x;
		x = y;
		y = t;
		
		System.out.println("x=" + x + ",y=" + y);
	}
}