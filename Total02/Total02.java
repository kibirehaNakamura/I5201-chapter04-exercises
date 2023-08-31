public class Total02 {
	public static void main(String[] args) {
		int i;
		int sum;
		
		sum = 0;
		i = 1;
		while(i <= 10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
	}
}