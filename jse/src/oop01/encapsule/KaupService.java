package oop01.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		KaupVO Kaup = new KaupVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		Kaup.setHeight(height);
		Kaup.setWeight(weight);
		Kaup.setIdx(height, weight);
		Kaup.setMsg("");
		System.out.println(Kaup.toString());
		System.out.println("완료");
		scanner.close();
	}
}
