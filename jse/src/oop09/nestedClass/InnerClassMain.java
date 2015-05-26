package oop09.nestedClass;


/*
 내부클래스의 첫번째 형태
 - 인스턴스 내부 클래스 
 - 멤버메소드를 클래스 내부에 선언함
 */
/*
 리팩토링을 하면 메모리 점유율을 낮춤과 동시에
 은닉화에 유용. 
 */
public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		//m.getInnerClassInstance();
		//m.getInnerClassLocal();
		//m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
	}
	public void getInnerClassAnonyServiceImpl() {
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();
		inn.printData();
	}
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.InnerTest(1000);
	}
	//Alt + Shift + m 메소드 독립 단축키
	//리팩토링 => 클래스를 메소드화 시킴
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();
		inn.printData();
	}
}
