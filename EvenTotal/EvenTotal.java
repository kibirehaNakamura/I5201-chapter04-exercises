public class EvenTotal {
	public static void main(String[] args) {
		int sum = 0;
		// if習得前の章なのでifは使わない
		for(int i = 2; i <= 100; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}