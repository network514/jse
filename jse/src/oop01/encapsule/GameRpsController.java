package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
	System.out.println("����, ����, �� ������ �����մϴ�.");
	System.out.println("����:1, ����:2, ��:3�� �Է��ϼ���.");
	Scanner scanner = new Scanner(System.in);
	int playerValue = scanner.nextInt();
	GameRpsService service = new GameRpsService();
	System.out.println("�����"+service.showRpsValue(playerValue)+"�� �½��ϴ�.");
	int comValue = service.displayComValue();
	System.out.println("��ǻ�Ͱ� "+ service.showRpsValue(comValue ) + "�� �½��ϴ�.");
	String winner=service.showWinner();
	System.out.println(winner + "�� �̰���ϴ�.");
	
	scanner.close();
	}
}
