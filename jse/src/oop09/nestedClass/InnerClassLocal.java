package oop09.nestedClass;
/*
 ����Ŭ������ �ι�° ����
 - Local ���� Ŭ���������� �ܺ� Ŭ������ ����� �����ϴµ� �־ 
 	������ ������. �켱 �ܺ� Ŭ������ ��������� ������ �� ����. 
 - ������ �޼��� ������ ���������� ������ �� ����. 
 */
public class InnerClassLocal {
	int a = 100;
	public void InnerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{
			public void getData(){
				System.out.println("������� a :" + a);
				System.out.println("��� c :" + c);
				//System.out.println("�������� b:" + b);
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}

}
