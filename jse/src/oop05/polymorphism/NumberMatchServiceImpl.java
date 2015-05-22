package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	private boolean result;

	@Override
	public int makeComVal() {
		return (int) (Math.random()*2);
	}

	@Override
	public boolean match(int playVal, int comVal) {
		if(playVal==comVal){/*
			System.out.println("컴퓨터가 생성한 값은 "+ comVal);
			System.out.println( playVal + "정답 !!");*/
			result = true;
		}else{/*
			System.out.println("틀렸습니다.");
			System.out.println("컴퓨터가 선택한 값은 "+comVal+" 입니다");*/
			result = false;
		}
		return result;
	}

	@Override
	public String display() {
		if(result == true){
			return "승리했습니다.";
		}else{
			return "패배했습니다.";
		}
	}

}
