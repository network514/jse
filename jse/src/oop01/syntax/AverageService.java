package oop01.syntax;
//계산, 기능
public class AverageService {
	AverageVO vo = new AverageVO();
	
	public int sum(){
		return vo.getKor()+vo.getKor();
	} 
	public double avg(){
		return sum()/2d;
	}
}
