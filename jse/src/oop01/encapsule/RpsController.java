package oop01.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("1.���� , 2.���� , 3.���ڱ� �� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int playerVal = scan.nextInt();
		System.out.println("�÷��̾�� ������ �½��ϴ�.");
		int comVal = service.displayComVal();
		System.out.println("��ǻ�ʹ� ������ �½��ϴ�. ");
		String winner = service.showWinner();
		System.out.println(winner + "" + "�� �̰���ϴ�.");
	}
}
