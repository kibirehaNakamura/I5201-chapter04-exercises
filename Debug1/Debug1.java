public class Debug1 {
	public static void main(String[] args) {
		int i;		//文末がセミコロンではなかった
		int sum;
		
		i = 1;
		sum = 0;	//sumの初期化をしていなかった
		while(i <= 10) {
			sum += i;
			i++;
		}			//while文を閉じるのを忘れていた
		System.out.println(sum);
	}
}