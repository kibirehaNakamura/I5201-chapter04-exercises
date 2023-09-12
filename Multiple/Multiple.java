import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("何の段の九九表を表示しますか？");
		int num = Integer.parseInt(br.readLine());
		
		// カウンタの宣言をfor内に変更
		for(int i = 0; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}