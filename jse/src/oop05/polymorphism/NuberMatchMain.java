package oop05.polymorphism;

import java.util.Scanner;

public class NuberMatchMain {
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchServiceImpl();

		System.out.println("0 �Ǵ� 1�� ���ڸ� �Է��ϼ���.");
		System.out.println("�� 1ȸ�� �Է°����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input==0 || input==1){
			System.out.println(service.display());
		}
		else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		scanner.close();
	}
}
