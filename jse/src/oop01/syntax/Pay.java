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
		pay.name="��ũ";
		pay.salary=3000000;
		int income=(int) (pay.salary-pay.salary*pay.TAX);
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+income+" �Դϴ�.");
		pay.name="���̾��";
		pay.salary=5000000;
		income=(int) (pay.salary-pay.salary*pay.TAX);
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+income+" �Դϴ�.");
		pay.name="�丣";
		pay.salary=1000000;
		income=(int) (pay.salary-pay.salary*pay.TAX);
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+income+" �Դϴ�.");
	}
}
