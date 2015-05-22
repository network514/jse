package oop05.polymorphism;

import java.util.Scanner;

public class NuberMatchMain {
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchServiceImpl();

		System.out.println("0 또는 1의 숫자만 입력하세요.");
		System.out.println("총 1회만 입력가능합니다.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input==0 || input==1){
			System.out.println(service.display());
		}
		else{
			System.out.println("잘못 입력하셨습니다.");
		}
		scanner.close();
	}
}
