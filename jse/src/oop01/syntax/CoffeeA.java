package oop01.syntax;
/*�����ڴ� '�ν��Ͻ��� ������ �� ȣ��Ǵ� �ν��Ͻ� �ʱ�ȭ �޼���'�̴�.
 *�ν��Ͻ��� ������ �ʴ� �ּҰ��� ���� ����(���۷���) �����̴�.*/ 
class Coffee{
	public Coffee(){
		System.out.println("���� �ִ´�.");
	}
	public Coffee(int money){
		System.out.println(money+"��");
	}
	public Coffee(int money, boolean exist){
		System.out.println("���Ű��ɿ��� :" + (exist==true?"Ŀ������ ����":"Ŀ�Ǿ���"));
	}
}
public class CoffeeA {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(500);
		Coffee c3 = new Coffee(500,true);
	}
}
