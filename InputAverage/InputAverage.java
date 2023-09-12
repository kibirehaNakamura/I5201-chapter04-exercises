import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputAverage {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("点数を連続で入力してください");
		System.out.println("終了は[Ctrl]+[Z]を入力して[Enter]");
		
		String buf;
		int i = 0;
		int sum = 0;
		
		while((buf = br.readLine()) != null) {
			sum += Integer.parseInt(buf);
			i++;
		}
		
		System.out.println("合計:" + sum);
		System.out.println("件数:" + i);
		System.out.println("平均:" + (sum / i));
	}
}