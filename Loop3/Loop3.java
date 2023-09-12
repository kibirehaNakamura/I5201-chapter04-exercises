public class Loop3 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0, j = 10; i <= 10; i++, j--) {
			System.out.println("i * j = " + (i * j));
			sum += i * j;
		}
		System.out.println("i * jの累計は" + sum);
	}
}