package oop09.nestedClass;

public class InnerClassAnonyServiceImpl {
	String data = "Hello Anonymonus !!";
	public void print(){
		new InnerClassAnonyService() {
			
			@Override
			public void printData() {
				System.out.println("익명 내부클래스 출력");
			} // definition 정의만
		}.printData(); //Execute 실행까지 하는 경우 세미콜론 
	}

}
