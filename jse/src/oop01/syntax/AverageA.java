package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	public static void main(String[] args) {
		//tot, avg ���������� �����Ͻð� �Ʒ��� ���� ��µǵ��� ���ּ���.
		AverageA hulk= new AverageA();
		hulk.name="��ũ";
		hulk.kor=100;
		hulk.eng=100;
		double tot=hulk.kor+hulk.eng;
		int avg=(int) (tot/2); //double avg=tot/2d;
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		AverageA iron= new AverageA();
		iron.name="���̾�";
		iron.kor=100;
		iron.eng=100;
		tot=iron.kor+iron.eng;
		avg=(int) (tot/2);
		System.out.println("==="+iron.name+"�� ����ǥ===");
		System.out.println("���� : "+iron.kor+"��");
		System.out.println("���� : "+iron.kor+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
		AverageA tor= new AverageA();
		tor.name="���̾�";
		tor.kor=100;
		tor.eng=100;
		tot=tor.kor+tor.eng;
		avg=(int) (tot/2);
		System.out.println("==="+tor.name+"�� ����ǥ===");
		System.out.println("���� : "+tor.kor+"��");
		System.out.println("���� : "+tor.kor+"��");
		System.out.println("���� : "+tot+"��");
		System.out.println("��� : "+avg+"��");
	}

}
