package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	
	public AverageEVO(String name, int kor, int eng) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	public AverageEVO(){}//����Ʈ������ ���� �ۼ�
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int sum(){
		return this.kor+this.eng;
	}
	public double aver(){
		return sum()/2d;
	}
}
