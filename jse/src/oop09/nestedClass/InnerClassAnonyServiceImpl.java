package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymonus !!";
	public void print(){
		new InnerClassAnonyService() {
			
			@Override
			public void printData() {
				System.out.println("�͸� ����Ŭ���� ���");
			} // definition ���Ǹ�
		}.printData(); //Execute ������� �ϴ� ��� �����ݷ� 
	}

}
