package oop01.encapsule;
//getter, setter
public class PayVO {
	private String name;
	private int salary;
	static final double TAX = 0.1;
	private int income;
	private double resulttax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getTax() {
		return this.TAX;
	}
	/*public void setTax(double tax) {
		this.TAX = tax;
	}*/
	public int getIncome() {
		return this.income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public double getResulttax() {
		return resulttax;
	}
	public void setResulttax(double resulttax) {
		this.resulttax = getSalary()*TAX;
	}
	
}
