package oop01.encapsule;
//�����
import java.util.Scanner;

public class PayController {

	public static void main(String[] args) {
		String name;
		int salary;
		Scanner scanner = new Scanner(System.in);
		PayService service = new PayService();
		
		System.out.println("�̸��� �Է��ϼ���.");
		name = scanner.next();
		System.out.println("�޿��� �Է��ϼ���.");
		salary = scanner.nextInt();
		service.scanname(name);
		service.scansalary(salary);
		
		System.out.println("===== �޿����� =====");
		System.out.println("���� :" + name);
		System.out.println("���� :" + salary);
		System.out.println("���� :" + service.resultax());
		System.out.println("�Ǽ��ɾ� :" + service.resultincome());
		scanner.close();	
	}

}
