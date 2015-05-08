package Gugudan;
//패키지와 클래스 사이에는 엔터를 준다.
public class Gugudan { // 메소드 사이에는 enter를 주지 않는다.
	public static void main(String[] args) {
		System.out.println("룰루랄라");
		int k, l;
		for (int i = 1; i < 19; i++) {
			for (int j = 2; j < 6; j++) {
				if (i > 9) {
					k = j+4;
					l = i-9;
					System.out.print(k + "X" + l + "=" + (k * l) + "\t");
					continue;
				}
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}