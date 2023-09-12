import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumFrom1ToN {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("nの値を入力>");
		String buf = br.readLine();
		int n = Integer.parseInt(buf);
		int sum = 0;
		
		// 入力される値が担保されてないと条件の指定がむつかしいなあとおもいました。
		// 今回は常に自然数が入力されるものとする
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		/* (n * (n + 1) / 2 < 2147483647
		 * n = 65535までは正しく求められる
		 */
	}
}