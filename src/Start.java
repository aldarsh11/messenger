import java.util.Scanner;

public class Start {
	private static boolean isEven(int num) {
		return ( num % 2 == 0 ) ? true : false;
	}
	
	private static int findMin() {
		
	}
	
	public static void main(String[] args) {
		String Res;
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите размер массива: ");
		int size = in.nextInt();
		int[] array = new int[size];
		for (int i=0; i<=size-1; i++) {
			array[i] = in.nextInt();
		}
	}
}
