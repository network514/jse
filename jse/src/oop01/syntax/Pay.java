package oop01.syntax;

public class Pay {
	String name;
	int salary;
	final double TAX=0.1;
	
	public static void main(String[] args) {
		Pay pay = new Pay();
		//Pay hulk = new Pay();
		//Pay iron = new Pay();
		//Pay tor = new Pay();
		pay.name="헐크";
		pay.salary=3000000;
		int income=(int) (pay.salary-pay.salary*pay.TAX);
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+income+" 입니다.");
		pay.name="아이언맨";
		pay.salary=5000000;
		income=(int) (pay.salary-pay.salary*pay.TAX);
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+income+" 입니다.");
		pay.name="토르";
		pay.salary=1000000;
		income=(int) (pay.salary-pay.salary*pay.TAX);
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+income+" 입니다.");
	}
}
