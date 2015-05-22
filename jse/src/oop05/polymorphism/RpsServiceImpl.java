package oop05.polymorphism;

public class RpsServiceImpl implements RpsService {
	int comValue;
	@Override
	public int displayComVal() {
		this.comValue = (int) (Math.random() * 3) + 1;
		return comValue;
	}

	@Override
	public String showWinner(int playerVal, int comVal) {
		int result = playerVal - comVal;
		String msg = "";
		switch (result) {
		case -1:
		case 2:
			msg = "컴퓨터 승";
			break;
		case 1:
		case -2:
			msg = "사용자 승";
			break;
		case 0:
			msg = "비김";
			break;
		}
		return msg;
	}

	@Override
	public String showRpsVal(int playerValue) {

		String result = "";
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
		default:
			result = "다시 적어보세요 ";
			break;
		}
		return result;
	}
}
