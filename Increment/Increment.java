public class Increment {
	public static void main(String[] args) {
		int i;
		int j;
		
		i = 1;
		j = i++;
		System.out.println("後置の場合");
		System.out.println("iは" + i);
		System.out.println("jは" + j);
		
		i = 1;
		j = ++i;
		System.out.println("前置の場合");
		System.out.println("iは" + i);
		System.out.println("jは" + j);
	}
}