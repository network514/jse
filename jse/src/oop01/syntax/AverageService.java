package oop01.syntax;
//���, ���
public class AverageService {
	AverageVO vo = new AverageVO();
	
	public int sum(){
		return vo.getKor()+vo.getKor();
	} 
	public double avg(){
		return sum()/2d;
	}
}
