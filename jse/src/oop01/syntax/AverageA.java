package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	public static void main(String[] args) {
		//tot, avg 지역변수를 선언하시고 아래와 같이 출력되도록 해주세요.
		AverageA hulk= new AverageA();
		hulk.name="헐크";
		hulk.kor=100;
		hulk.eng=100;
		double tot=hulk.kor+hulk.eng;
		int avg=(int) (tot/2); //double avg=tot/2d;
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.kor+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		AverageA iron= new AverageA();
		iron.name="아이언";
		iron.kor=100;
		iron.eng=100;
		tot=iron.kor+iron.eng;
		avg=(int) (tot/2);
		System.out.println("==="+iron.name+"의 성적표===");
		System.out.println("국어 : "+iron.kor+"점");
		System.out.println("영어 : "+iron.kor+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		AverageA tor= new AverageA();
		tor.name="아이언";
		tor.kor=100;
		tor.eng=100;
		tot=tor.kor+tor.eng;
		avg=(int) (tot/2);
		System.out.println("==="+tor.name+"의 성적표===");
		System.out.println("국어 : "+tor.kor+"점");
		System.out.println("영어 : "+tor.kor+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
	}

}
