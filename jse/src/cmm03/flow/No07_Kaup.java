package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	
	No07_Kaup() {
		this(0,0);
	}

	No07_Kaup(double i, double j) { //되도록이면 멤버변수와 이름을 맞춘다.
		this.height = i;
		this.weight = j;
		this.idx = (int) ((weight)/(height*height)*10000);
	}
	String getMsg(){
		String msg = "";
		if (idx>30) {msg = "비만";}
		else if(idx>24){msg = "과체중";}
		else if(idx>20){msg = "정상";}
		else if(idx>15){msg = "저체중";}
		else if(idx>13){msg = "마름";}
		else if(idx>10){msg = "영양실조";}
		else {msg = "소모증";}
		return msg;
	}

	@Override
	public String toString() {
		return "카우프지수 [키=" + height + "cm, 몸무게=" + weight + "kg , 카우프지수="
				+ getMsg() + "]";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		No07_Kaup Kaup = new No07_Kaup(height, weight);
		System.out.println(Kaup.toString());
		System.out.println("완료");
	}
	
	//alt+shift+s 마우스 우버튼
	
}
