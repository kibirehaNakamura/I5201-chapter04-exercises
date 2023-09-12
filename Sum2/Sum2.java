public class Sum2 {
	public static void main(String[] args) {
		// 関数宣言と初期化をまとめた
		int i = 10;
		int sum = 0;
		
		while(i > 0) {
			sum = sum + i;
			i--;
		}
		System.out.println(sum);
	}
}