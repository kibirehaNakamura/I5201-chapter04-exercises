public class NestLoop {
	public static void main(String[] args) {
		for(int i = 10; i > 0; i--) {
			System.out.print("i = " + i + "\t");
			for(int j = i; j > 0; j--) {
				System.out.print("o");
			}
			System.out.println();
		}
	}
}