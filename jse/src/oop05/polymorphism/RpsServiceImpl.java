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
			msg = "��ǻ�� ��";
			break;
		case 1:
		case -2:
			msg = "����� ��";
			break;
		case 0:
			msg = "���";
			break;
		}
		return msg;
	}

	@Override
	public String showRpsVal(int playerValue) {

		String result = "";
		switch (playerValue) {
		case 1:
			result = "����";
			break;
		case 2:
			result = "����";
			break;
		case 3:
			result = "��";
			break;
		default:
			result = "�ٽ� ������� ";
			break;
		}
		return result;
	}
}
