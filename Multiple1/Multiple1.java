public class Multiple1 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		while(i < 10) {
			j = 1;
			while(j < 10) {
				System.out.print((i * j) + " ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}