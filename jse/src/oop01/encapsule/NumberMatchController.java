package oop01.encapsule;

import java.util.Scanner;
public class NumberMatchController {//메인
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchService();
		System.out.println("총 1회만 입력가능합니다.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		service.repeat(input);
		scanner.close();
	}
}
