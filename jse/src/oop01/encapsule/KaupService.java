package oop01.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		KaupVO Kaup = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		Kaup.setHeight(height);
		Kaup.setWeight(weight);
		Kaup.setIdx(height, weight);
		Kaup.setMsg("");
		System.out.println(Kaup.toString());
		System.out.println("�Ϸ�");
		scanner.close();
	}
}
