package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {	
	System.out.println("ī�� ���� : ");
	System.out.println("ī�� �ʺ� : ");
  
	// �������� �����Ͻð� == �ν��Ͻ� ���� �ϼż� (2), �Ʒ� ��� ó��
	// ��� �ǵ��� ���ּ��� 
	
	CardVO user = new CardVO("��Ʈ", 3);
	user.CardPrint();
	//System.out.println("�÷��̾��"+ "��Ʈ" +"3");  //heart, spade 
	CardVO com = new CardVO("�����̽�", 5);
	com.CardPrint();
	//System.out.println("��ǻ�Ͱ�"+" �����̽�"+" 5�̴�.");
	}

}