package oop01.syntax;
/*
 * Date :
 * Author :
 * Desc : static ����
 */

public class CardVO {
	private String kind; // ī���� ����
    private int number; // ���� 
    static int width = 100;
    static int height = 250;
    
    public CardVO(String kind, int number){
    	this.kind=kind;
    	this.number=number;
    }
    public void CardPrint(){
    	
    	System.out.println("�÷��̾�� "+ getKind() +""+ +getNumber());
    }
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}