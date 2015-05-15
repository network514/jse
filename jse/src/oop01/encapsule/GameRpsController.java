package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
	System.out.println("가위, 바위, 보 게임을 시작합니다.");
	System.out.println("가위:1, 바위:2, 보:3을 입력하세요.");
	Scanner scanner = new Scanner(System.in);
	int playerValue = scanner.nextInt();
	GameRpsService service = new GameRpsService();
	System.out.println("당신은"+service.showRpsValue(playerValue)+"를 냈습니다.");
	int comValue = service.displayComValue();
	System.out.println("컴퓨터가 "+ service.showRpsValue(comValue ) + "를 냈습니다.");
	String winner=service.showWinner();
	System.out.println(winner + "가 이겼습니다.");
	
	scanner.close();
	}
}
