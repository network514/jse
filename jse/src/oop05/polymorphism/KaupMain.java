package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		
		KaupInterface kaupService = new KaupServiceImpl();
		kaupService.getKaupIndex(height, weight);
		System.out.println(kaupService.getResultMag());
		scanner.close();
	}
}
