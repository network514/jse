package oop01.game;

import java.util.Scanner;
public class NumberMatchController {//����
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchService();
		System.out.println("�� 1ȸ�� �Է°����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		service.repeat(input);
		scanner.close();
	}
}
