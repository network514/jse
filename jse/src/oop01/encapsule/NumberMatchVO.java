package oop01.encapsule;

public class NumberMatchVO { //getter, setter, �����⺯
	private int player, com, count, result;
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		if(player<1 || player > 5){
			System.out.println(" 1���� 5������ ������ �Է��ؾ� �մϴ�.");
		}else{
			this.player = player;
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int) ((Math.random()*5)+1);
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public void setCom(int com) {
		this.com = com;
	}
}
