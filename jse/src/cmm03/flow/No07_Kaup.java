package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {
	double height;
	double weight;
	int idx;
	
	No07_Kaup() {
		this(0,0);
	}

	No07_Kaup(double i, double j) { //�ǵ����̸� ��������� �̸��� �����.
		this.height = i;
		this.weight = j;
		this.idx = (int) ((weight)/(height*height)*10000);
	}
	String getMsg(){
		String msg = "";
		if (idx>30) {msg = "��";}
		else if(idx>24){msg = "��ü��";}
		else if(idx>20){msg = "����";}
		else if(idx>15){msg = "��ü��";}
		else if(idx>13){msg = "����";}
		else if(idx>10){msg = "�������";}
		else {msg = "�Ҹ���";}
		return msg;
	}

	@Override
	public String toString() {
		return "ī�������� [Ű=" + height + "cm, ������=" + weight + "kg , ī��������="
				+ getMsg() + "]";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		
		No07_Kaup Kaup = new No07_Kaup(height, weight);
		System.out.println(Kaup.toString());
		System.out.println("�Ϸ�");
	}
	
	//alt+shift+s ���콺 ���ư
	
}
