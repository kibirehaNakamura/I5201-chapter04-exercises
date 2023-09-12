public class Trace2 {
	public static void main(String[] args) {
		//関数宣言と初期化をまとめた
		int i;
		int num = 1;
		
		for(i = 0; i < 10; i++) {
			num += num;
		}
		System.out.println("iの値は" + i);	// iの値は10
		System.out.println("numの値は" + num);	// numの値は1024
	}
}