package oop01.syntax;

public class AverageE {
//����
	public static void main(String[] args) {
		AverageEVO tor = new AverageEVO("�丣", 100, 100);
		System.out.println("==="+tor.getName()+"�� ����ǥ===");
		System.out.println("���� : "+tor.getKor()+"��");
		System.out.println("���� : "+tor.getEng()+"��");
		System.out.println("���� : "+tor.sum()+"��");
		System.out.println("��� : "+tor.aver()+"��");
	}
}
