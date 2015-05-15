package oop01.encapsule;

public class NumberMatchService {//나머지
	NumberMatchVO vo = new NumberMatchVO();
	public int game(int com, int player){
		int result;
		if(vo.getPlayer()==vo.getCom()){
			System.out.println("컴퓨터가 생성한 값은 "+vo.getCom());
			System.out.println( vo.getPlayer() + "정답 !!");
			result = 1;
		}else{
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 "+vo.getCom()+" 입니다");
			result = 0;
		}
		vo.setResult(result);
		return result;
	}
	public void repeat(int inputParam){
		int result;
		//음... for문 어떻게 넣지... 
			System.out.println("1부터 3까지 정수만 입력하세요");
			try {
				int input = inputParam;
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("문자는 안됩니다.");
			}
			if (vo.getPlayer() == 0) {
				System.out.println("다시 입력해 주십시오.");
			} else {
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
				vo.setResult(result);
			}
			if (vo.getResult() == 1) {
				System.out.println("맞췄습니다." + "게임을 종료합니다.");
			} else if (vo.getResult() == 2) {
				System.out.println("\n게임에서 패배했습니다."
						+ "\n게임을 종료합니다.");
		}
	}
}
