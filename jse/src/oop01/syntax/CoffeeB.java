package oop01.syntax;

class MilkCoffee{
	public MilkCoffee(){
		System.out.println("���� �ִ´�.");		
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money+"��");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("���Ű��ɿ��� :" + (exist==true?"Ŀ������ ����":"Ŀ�Ǿ���"));
	}
}
public class CoffeeB {
	public static void main(String[] args) {
		MilkCoffee co = new MilkCoffee(500,true);
	}
}
