package oop06.lotto;

import java.util.Scanner;

public class lottoMain {
	public static void main(String[] args) {
		System.out.println("◀◀◀로또시작▶▶▶");
		LottoService lotto = new LottoServiceImpl();
		System.out.println("얼마치를 구입합니까?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		lotto.extractLottos(money);
		System.out.println("로또번호 출력");
		lotto.printLotto();
		
		scanner.close();
	}
}
