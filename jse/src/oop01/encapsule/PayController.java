package oop01.encapsule;
//입출력
import java.util.Scanner;

public class PayController {

	public static void main(String[] args) {
		String name;
		int salary;
		Scanner scanner = new Scanner(System.in);
		PayService service = new PayService();
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("급여를 입력하세요.");
		salary = scanner.nextInt();
		service.scanname(name);
		service.scansalary(salary);
		
		System.out.println("===== 급여내역 =====");
		System.out.println("성명 :" + name);
		System.out.println("본봉 :" + salary);
		System.out.println("세금 :" + service.resultax());
		System.out.println("실수령액 :" + service.resultincome());
		scanner.close();	
	}

}
