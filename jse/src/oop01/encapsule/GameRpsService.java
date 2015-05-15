package oop01.encapsule;

/*
 Date : 2015.05.15
 Author : 권자영
 Description : 가위, 바위, 보 게임놀이
 가위 = 1, 바위 = 2, 보 = 3
 * */

public class GameRpsService {
	/*
	 숫자값에 따른 가위, 바위, 보 결정 로직
	 * */
	public String showRpsValue(int playerValue) {
		String result = null;
		switch (playerValue) {
		case 1: 
			result = "가위";
			break;
		case 2:
			result = "바위";
			break;
		case 3:
			result = "보";
			break;
		}
		return result;
	}
	/*
	 컴퓨터가 랜덤으로 발생시키는 수 1~3까지 
	 */
	public int displayComValue() {
		return (int) ((Math.random()*3)+1);
	}
	public String showWinner() {
	/*
	 승자를 보여주는 로직
	 */
		GameRpsVO vo = new GameRpsVO();
		
		return null;
	}
}
