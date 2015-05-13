package cmm04.arr;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {

	public static void main(String[] args) {
		//No03_ForLoopArrayVO array = new No03_ForLoopArrayVO();
		//array.ForLoopArray();
		No04_ForLoopArrayVO array2 = new No04_ForLoopArrayVO();
		System.out.println("값을 다섯개 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		array2.testFor(a,b,c,d,e);
	}
}
