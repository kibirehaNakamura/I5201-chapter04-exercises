public class Sum1 {
	public static void main(String[] args) {
		// 関数宣言と初期化をまとめた
		int i = 1;
		int sum = 0;
		
		while(i < 11) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}