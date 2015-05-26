package oop07_tryCatch;
/*
 ���ܴ� ���α׷� ���߽� �ٻ��ϴ� ������ �ٸ� ����
 ���α׷� ���߽� �߻��ϴ� ������ ���� ��ó�� �ʼ� 
 ���������� ������ �� ��߿� �ٷ��ϴ� ������ ��κ��� ����
 ���ܴ� �ڵ�� �߻��� ������ �ٸ��� �����Ͻ� ������ �߻����� ����. 
 */
/*
 try{
 	���ܰ� �߻��� ������ �ִ� �ڵ带 �����ڰ� �����Ͽ� ����.
 	IO, DBMS, Network ���� �ڵ尡 �ַ� ��ġ
 }catch(Exception ex){
 	ex.printStackTrace()
 	������ ����Ǵ� �ڵ� ��
 	}
 */

public class TryCatchDemo { // �ڵ��ϼ� ����.
	public static void main(String[] args) {
		int a=5, b=0;
		int mok=0, nmg = 0;
		//try{}catch(Exception ex){} �̸� Ʋ ��°� ����.
		try{
			mok = a/b;
			nmg = a%b;
		}catch(Exception ex){
			ex.printStackTrace(); //java.lang ��Ű�� ���� ����. 
			System.out.println("���� �߻�");
		}
		System.out.println(a + "/" + b + "=" + mok);
		System.out.println(a + "%" + b + "=" + nmg);
	}
}
