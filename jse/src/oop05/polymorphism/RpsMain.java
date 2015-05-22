package oop05.polymorphism;

import java.util.Scanner;

public class RpsMain {
	public static void main(String[] args) {
		RpsService rpsService = new RpsServiceImpl();
		
		System.out.println("가위,바위,보, 게임을 시작합니다.");
		System.out.println("1.가위,2.바위,3.보  를입력하세요."); // 스캐너가 있어야 겟네?
		Scanner scan = new Scanner(System.in);
		int playerValue = scan.nextInt();
		System.out.println("당신은" + rpsService.showRpsVal(playerValue) + "를 냈습니다.");
		int comVal = rpsService.displayComVal();
		System.out.println("컴퓨터는" + rpsService.showRpsVal(comVal) + "를 냈습니다.");

		String winner = rpsService.showWinner(playerValue, comVal);
		System.out.println(winner);
	}
}
