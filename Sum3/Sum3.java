public class Sum3 {
	public static void main(String[] args) {
		// 関数宣言と初期化をまとめた
		int i = 0;
		int sum = 0;
		
		while(i < 10) {
			sum = sum + i + 1;
			i++;
		}
		System.out.println(sum);
	}
}