package oop01.syntax;
/*
 Data :
 Author : 
 Desc : 
 */
/*
 Car
 △
 |  상속
 HCar <ㅡ new ( instantiante)
 */
class Car2{
	String name = "자동차";
	public String gear(){
		return "수동기어";
	}
}
class Hcar2 extends Car2{
	String brand = "현대차";
	public String autoGear(){
		return "오토기어";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 hcar2 = new Hcar2();
		System.out.println(hcar2.gear());
		System.out.println(hcar2.autoGear());
		
		Car2 car2 = enw Car2();
		System.out.println(car2.gear());
		// System.out.println(car2.autogear());
		// 상속하여 받을 수도 있는 로직은 자식만 가능하다.
	}
}
