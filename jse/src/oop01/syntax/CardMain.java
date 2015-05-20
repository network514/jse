package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {	
	System.out.println("카드 높이 : ");
	System.out.println("카드 너비 : ");
  
	// 참조변수 선언하시고 == 인스턴스 생성 하셔서 (2), 아래 결과 처럼
	// 출력 되도록 해주세요 
	
	CardVO user = new CardVO("하트", 3);
	user.CardPrint();
	//System.out.println("플레이어는"+ "하트" +"3");  //heart, spade 
	CardVO com = new CardVO("스페이스", 5);
	com.CardPrint();
	//System.out.println("컴퓨터가"+" 스페이스"+" 5이다.");
	}

}