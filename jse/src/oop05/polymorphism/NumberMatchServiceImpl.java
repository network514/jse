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
			System.out.println("��ǻ�Ͱ� ������ ���� "+ comVal);
			System.out.println( playVal + "���� !!");*/
			result = true;
		}else{/*
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� "+comVal+" �Դϴ�");*/
			result = false;
		}
		return result;
	}

	@Override
	public String display() {
		if(result == true){
			return "�¸��߽��ϴ�.";
		}else{
			return "�й��߽��ϴ�.";
		}
	}

}
