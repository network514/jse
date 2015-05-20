package oop01.encapsule;

import java.util.Scanner;

public class RpsController {
	public static void main(String[] args) {
		RpsService service = new RpsService();
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("1.가위 , 2.바위 , 3.보자기 를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int playerVal = scan.nextInt();
		System.out.println("플레이어는 가위를 냈습니다.");
		int comVal = service.displayComVal();
		System.out.println("컴퓨터는 바위를 냈습니다. ");
		String winner = service.showWinner();
		System.out.println(winner + "" + "가 이겼습니다.");
	}
}
