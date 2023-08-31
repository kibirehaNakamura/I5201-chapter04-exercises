public class Trace1 {
	public static void main(String[] args) {
		int i;
		int num;
		
		num = 1;
		i = 0;
		while(i < 4) {
			num += num;
			i++;
		}
		System.out.println("iの値は" + i);		//i = 4
		System.out.println("numの値は" + num);	//num = 16
	}
}