package cmm03.flow;

public class No02_IfElseDemo2 {

	public static void main(String[] args) {
		int kor = 90, eng = 85, sum = 0;
		double avg = 0.0;
		String msg = "�޼���";
		sum = kor + eng;
		avg = sum/2;
		
		//���ǿ� ���� if ó��
		/*
		 * ����� 100���̸� "���ʽ� ����"
		 * ����� 70�� �̻��̸� "���� �հ�"
		 * ����� 70�� �̸��̸� "������� ������."
		 * 
		 * */
		avg = avg/10.0;
				
		if(avg==10.0){
			msg="���ʽ� ����";
		}else if(avg >= 7.0){
			msg="�����հ�";
		}else{
			msg="������� ������.";
		}
		
		System.out.println("���� : " + kor); //ctrl + ȭ��ǥ
		System.out.println("���� : " + eng);
		System.out.println("���� : " + sum);
		System.out.println(msg);
	}

}
