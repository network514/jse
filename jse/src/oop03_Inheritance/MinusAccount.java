package oop03_Inheritance;

public class MinusAccount extends BankAccount{
	private int minusLimit;
	
	public void setAccount(String accountNum, String accountPass, String ownerName, int pay, int minusLimit){
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.ownerName = ownerName;
		this.balance = pay;
		this.minusLimit = minusLimit;
		System.out.println(this.accountNum+"가 개설되었습니다. ");
	}
	public void defrayment(int pay){
		//잔액 + 마이너스한도액까지 출금이 가능해졌음.
		if (this.balance + this.minusLimit >= pay) {
			this.balance = this.balance - pay;
			System.out.println(pay + "만원을 출금했습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}
