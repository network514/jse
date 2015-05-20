package oop01.syntax;

class MilkCoffee{
	public MilkCoffee(){
		System.out.println("돈을 넣는다.");		
	}
	public MilkCoffee(int money){
		this();
		System.out.println(money+"원");
	}
	public MilkCoffee(int money, boolean exist){
		this(money);
		System.out.println("구매가능여부 :" + (exist==true?"커피종류 선택":"커피없음"));
	}
}
public class CoffeeB {
	public static void main(String[] args) {
		MilkCoffee co = new MilkCoffee(500,true);
	}
}
