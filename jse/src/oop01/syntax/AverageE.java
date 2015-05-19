package oop01.syntax;

public class AverageE {
//메인
	public static void main(String[] args) {
		AverageEVO tor = new AverageEVO("토르", 100, 100);
		System.out.println("==="+tor.getName()+"의 성적표===");
		System.out.println("국어 : "+tor.getKor()+"점");
		System.out.println("영어 : "+tor.getEng()+"점");
		System.out.println("총점 : "+tor.sum()+"점");
		System.out.println("평균 : "+tor.aver()+"점");
	}
}
