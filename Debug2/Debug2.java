public class Debug2 {
	public static void main(String[] args) {
		// インデントと関数宣言部分を修正
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {	// i < 100だと100が足されないので修正
			sum += i;
			i = i + 1;
		}
		
		System.out.println(sum);
	}
}