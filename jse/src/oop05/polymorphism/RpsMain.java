package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {
		RpsService rpsService = new RpsServiceImpl();
		
		System.out.println("����,����,��, ������ �����մϴ�.");
		System.out.println("1.����,2.����,3.��  ���Է��ϼ���."); // ��ĳ�ʰ� �־�� �ٳ�?
		Scanner scan = new Scanner(System.in);
		int playerValue = scan.nextInt();
		System.out.println("�����" + rpsService.showRpsVal(playerValue) + "�� �½��ϴ�.");
		int comVal = rpsService.displayComVal();
		System.out.println("��ǻ�ʹ�" + rpsService.showRpsVal(comVal) + "�� �½��ϴ�.");

		String winner = rpsService.showWinner(playerValue, comVal);
		System.out.println(winner);
	}
}
