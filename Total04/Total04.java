public class Total04 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 10; sum += i, i++) ;
		System.out.println(sum);
	}
}