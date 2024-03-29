package oop05.polymorphism;

public interface NumberMatchService {
	/*
	 * 컴퓨터가 랜덤으로 생성하는 숫자
	 * 0과 1과 발생시킴.
	 */
	public int makeComVal();
	/*
	 * 두개의 파라미터를 비교해서 일치하면 true
	 * 다르면 false를 리턴
	 */
	public boolean match(int playVal, int comVal);
	/*
	 * makeComVal()의 리턴값이 true면 player승리
	 * 다르면 컴퓨터 승리라고 메세지 출력
	 */
	public String display();
}
