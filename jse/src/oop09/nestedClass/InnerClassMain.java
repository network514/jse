package oop09.nestedClass;


/*
 ����Ŭ������ ù��° ����
 - �ν��Ͻ� ���� Ŭ���� 
 - ����޼ҵ带 Ŭ���� ���ο� ������
 */
/*
 �����丵�� �ϸ� �޸� �������� ����� ���ÿ�
 ����ȭ�� ����. 
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		//m.getInnerClassInstance();
		//m.getInnerClassLocal();
		//m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
	}
	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();
		inn.printData();
	}
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.InnerTest(1000);
	}
	//Alt + Shift + m �޼ҵ� ���� ����Ű
	//�����丵 => Ŭ������ �޼ҵ�ȭ ��Ŵ
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		inn.printData();
	}
}
