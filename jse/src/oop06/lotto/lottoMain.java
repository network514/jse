package oop06.lotto;

import java.util.Scanner;

public class lottoMain {
	public static void main(String[] args) {
		System.out.println("�������ζǽ��ۢ�����");
		LottoService lotto = new LottoServiceImpl();
		System.out.println("��ġ�� �����մϱ�?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		lotto.extractLottos(money);
		System.out.println("�ζǹ�ȣ ���");
		lotto.printLotto();
		
		scanner.close();
	}
}
