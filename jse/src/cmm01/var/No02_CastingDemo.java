package cmm01.var;

public class No02_CastingDemo {
	public static void main(String[] args) {
		/* Upcasting
		 = ��ȯ(Conversion)
		 = promotion
		 = ������(implict) �ڵ���ȯ : �ڹٰ� �����ϴ� �ڵ���ȯ���� �������� ����
		 	������ Ÿ���� ǥ�������� �����ʿ��� ���������� ��ȯ �ɶ��� �����ϴ�. */
		
		byte varByte = 1;
		int varInt = 123;
		double varDou = 123.456d;
				
		int upByte = (int)varByte;
		double upInt = varInt;
		
		
		/* Down-Casting 
		 = ĳ����(Casting) 
		 = ���� ����ȯ : �����׷����� ��������� �����ϴ� Ÿ�Ժ�ȯ.
		 ��Һ�ȯ�� �Ǵ� ���� �ݵ�� ��������� ĳ�����Ͽ��� ��. 
		���� : �������� �ս��� �߻��� ���� �ִ�. */
		float varFlo = 123.456f;
		int downFlo = (int) varFlo;
		System.out.println("�ٿ�ĳ���� ����� : " + downFlo);
	}
}
