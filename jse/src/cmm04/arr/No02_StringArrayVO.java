package cmm04.arr;

class No02_StringArrayVO {
	void StringArrayVO(){
		String[] juso = new String[3];
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";
		for(int i=0;i<juso.length;i++){ //제한을 특정 숫자로 두지 않는게 좋다.
			System.out.println(juso[i]);
		}
	}
	//지역변수 배열 선언. 유동적으로 선언.(값을 넘겨 받게), 배열길이를 변수로 받은다음 그 변수를 final로 지정.
	//************** 메소드 안
	//배열의 길이를 넘겨받는 생성자. 변수(길이)를 직접 접근하지 못하게 제한(은닉화), 생성자에서 접근 가능하게 하는 메소드.  
	//생성자에 매개변수로 배열의 길이를 받음.
	//for문 기능 수행하게 하는 메소드 반환값 void
	//메인에 있는 스캐너 값을 넘겨 받아서 배열 안에 넣는 메소드 선언.(위의 메소드에 접근하여 값을 넣음.)
}