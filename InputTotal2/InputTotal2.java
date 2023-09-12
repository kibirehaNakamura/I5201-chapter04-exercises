import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputTotal2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("整数を連続して入力してください");
		System.out.println("終了は[Ctrl]+[Z]を入力して[Enter]");
		
		int sum = 0;
		String buf;
		
		while((buf= br.readLine()) != null) {
			sum += Integer.parseInt(buf);
		}
		
		System.out.println("合計は" + sum);
	}
}