package cmm02.op;

public class No04_ConditionDemo {

	public static void main(String[] args) {
		int val01 = 1;
		int val02 = 2;
		
		if((val01 == 1)&&(val02 == 2)){
			System.out.println("1번값과 2번값 모두 맞습니다.");
		}
		if((val01 == 1)||(val02 == 2)){
			System.out.println("1번값과 2번값 모두 아닙니다.");
		}
	}
}
