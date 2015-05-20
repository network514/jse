package oop01.syntax;
/*생성자는 '인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드'이다.
 *인스턴스는 변하지 않는 주소값을 가진 참조(레퍼런스) 변수이다.*/ 
class Coffee{
	public Coffee(){
		System.out.println("돈을 넣는다.");
	}
	public Coffee(int money){
		System.out.println(money+"원");
	}
	public Coffee(int money, boolean exist){
		System.out.println("구매가능여부 :" + (exist==true?"커피종류 선택":"커피없음"));
	}
}
public class CoffeeA {
	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		Coffee c2 = new Coffee(500);
		Coffee c3 = new Coffee(500,true);
	}
}
